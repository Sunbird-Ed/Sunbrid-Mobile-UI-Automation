package com.qualitrix.testng.listener;

import com.aventstack.extentreports.ExtentReports;
import com.qualitrix.Global;
import com.qualitrix.common.manager.AppiumManager;
import com.qualitrix.common.utils.AppiumManagerUtils;
import com.qualitrix.config.model.Device;
import com.qualitrix.report.factory.ExtentManager;
import com.qualitrix.report.factory.ExtentTestManager;
import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Qualitrix on DD/MM/YYY.
 * @author
 */
public class AlterSuiteListener implements IAlterSuiteListener {

    @Override
    public void alter(List<XmlSuite> suites) {
        System.out.println("AlterSuite");
        System.out.println("prop.capabilities: " + System.getProperty("prop.capabilities"));

        String capabilitiesJSONPath = System.getProperty("prop.capabilities");
        AppiumManagerUtils utils = new AppiumManagerUtils();
        Global.setConfig(utils.getConfigJSON(capabilitiesJSONPath).toString());

        this.generateTestNGXML(suites, Global.getConfig().getDevices());

        this.createHtmlReportFile();

        List<Device> devices = Global.getConfig().getDevices();
        for(Device device: Global.getConfig().getDevices()){
            this.setAppiumManager(device.getName(), device.getVersion(), device.getPlatform());
        }

        ExtentTestManager.InitReport();

    }

    private void setAppiumManager(String deviceName, String version, String platform) {
        System.out.println(this.getClass().getSimpleName() + ": Set Appium Manager");
        String automationType = getAutomationType(platform);
        AppiumManager appiumManager = new AppiumManager(deviceName, version, platform, automationType);
        this.setDeviceReportPath(appiumManager);
        Global.addAppiumManagerToList(appiumManager);
    }

    private String getAutomationType(String platform){
        String automationType = "";
        if(platform.equalsIgnoreCase("android")){
            if(Global.getConfig().getCapabilities().getAndroid().getAppPackage() != null ){
                automationType = "native";
            }else if (Global.getConfig().getCapabilities().getAndroid().getBrowserName() !=null){
                automationType = "browser";
            }
        }
        else if(platform.equalsIgnoreCase("ios")){
            if(Global.getConfig().getCapabilities().getIos().getBundleId() != null ){
                automationType = "native";
            }else if (Global.getConfig().getCapabilities().getIos().getBrowserName() !=null){
                automationType = "browser";
            }
        }
        return automationType;
    }

    private void createHtmlReportFile(){
        Date date = new Date() ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
        String reportPath = System.getProperty("user.dir") + File.separator +"reports" + File.separator + "Report_" + dateFormat.format(date);
        File file = new File(reportPath);
        file.mkdir();
        Global.setReportPath(reportPath);
    }

    private void setDeviceReportPath(AppiumManager appiumManager){
        String folderPath = Global.getReportPath() + File.separator + appiumManager.getDeviceName();
        File file = new File(folderPath);
        file.mkdir();
        appiumManager.setReportPath(folderPath);

        folderPath = Global.getReportPath() + File.separator + appiumManager.getDeviceName() + File.separator + "screenshots";
        file = new File(folderPath);
        file.mkdir();

        folderPath = Global.getReportPath() + File.separator + appiumManager.getDeviceName() + File.separator + "logs";
        file = new File(folderPath);
        file.mkdir();
    }

    /*Clone testCases if needed*/
    private void generateTestNGXML(List<XmlSuite> suites, List<Device> deviceList){
        XmlSuite suite = suites.get(0);
        suite.setThreadCount(deviceList.size());
        suite.setPreserveOrder(true);
        List<XmlTest> dynamictests = suite.getTests().stream().filter(xmlTest -> xmlTest.getName().startsWith("Test")).collect(Collectors.toList());

        List<XmlTest> clonedTests = new ArrayList<>();
        for (XmlTest each : dynamictests) {
            for (int i = 1; i < deviceList.size(); i++) {
                XmlTest cloned = new XmlTest(suite);
                cloned.setName(deviceList.get(i).getName());
                cloned.getLocalParameters().put("device", deviceList.get(i).getName());
                cloned.getLocalParameters().put("version", deviceList.get(i).getVersion());
                cloned.getXmlClasses().addAll(each.getClasses());
                clonedTests.add(cloned);
            }
        }
        dynamictests.addAll(clonedTests);
    }
}
