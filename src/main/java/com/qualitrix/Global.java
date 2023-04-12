package com.qualitrix;

import com.google.gson.Gson;
import com.qualitrix.common.manager.AppiumManager;
import com.qualitrix.common.manager.GlobalSession;
import com.qualitrix.config.Config;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.WebElement;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Global {

    private static Config config;
    private static String reportPath;

    private static List<AppiumManager> appiumManagerList = new ArrayList<AppiumManager>();

    public static void setConfig(String configJSON){
        config = new Config(configJSON);
    }

    public static Config getConfig(){
        return  config;
    }

    public synchronized  static void addAppiumManagerToList(AppiumManager appiumManager){
        appiumManagerList.add(appiumManager);
    }

    public synchronized  static List<AppiumManager> getAppiumManagerList(){
        return appiumManagerList;
    }


    public static void setReportPath(String reportPath) {
        Global.reportPath = reportPath;
    }

    public static String getReportPath() {
        return reportPath;
    }

    public static synchronized AppiumManager getAvailableDevice(){
        for (AppiumManager appiumManager1 : Global.getAppiumManagerList()) {
            if (appiumManager1.isAvailable()) {
                appiumManager1.setAvailable(false);
                return appiumManager1;
            }
        }
        return null;
    }
}
