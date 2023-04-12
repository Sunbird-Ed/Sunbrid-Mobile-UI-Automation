package com.qualitrix.client;

import com.aventstack.extentreports.ExtentTest;
import com.qualitrix.common.manager.GlobalSession;
import com.qualitrix.common.utils.*;
import com.qualitrix.common.utils.excel.ExcelUtils;
import com.qualitrix.common.utils.gsheet.GSheet;
import com.qualitrix.common.utils.gsheet.GSheetObject;
import com.qualitrix.report.factory.QXReport;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class QXClient {

    private AppiumDriver appiumDriver;
    private QXReport qxReport;
    private Gestures gestures;
    private WaitForUtils waitForUtils;
    private ExcelUtils excelUtils;
    private PropUtils clientUtils;
    private ScreenshotUtils screenshotUtils;
    private AssertUtils assertUtils;
    private LogUtils logUtils;
    private GSheetObject gSheetObject;

    public QXClient(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
    }

    public Gestures gestures(){
        if(this.gestures == null){
            this.gestures = new Gestures(this.appiumDriver);
        }

        return this.gestures;
    }

    public WaitForUtils waitUtils(){
        if(this.waitForUtils == null){
            this.waitForUtils = new WaitForUtils(this.appiumDriver);
        }

        return this.waitForUtils;
    }

    public AppiumDriver driver(){
        return this.appiumDriver;
    }

    public ExcelUtils excelUtils(){
        if(this.excelUtils == null){
            this.excelUtils = new ExcelUtils();
        }
        return this.excelUtils;
    }

    public PropUtils propUtils(){
        if(this.clientUtils == null){
            this.clientUtils = new PropUtils();
        }

        return this.clientUtils;
    }

    public ScreenshotUtils screenshotUtils(){
        if(this.screenshotUtils == null){
            this.screenshotUtils = new ScreenshotUtils(this.appiumDriver);
        }

        return screenshotUtils;
    }

    public AssertUtils getAssertUtils(){
        if(this.assertUtils == null){
            this.assertUtils = new AssertUtils();
        }

        return this.assertUtils;
    }

    public GSheet GSheet(String sheetId) throws GeneralSecurityException, IOException {
        if(this.gSheetObject == null){
            this.gSheetObject = new GSheetObject();
        }

        return this.gSheetObject.getGSheet(sheetId);
    }

    public ExtentTest report(){
        return QXReport.getTest();
    }

    public Logger logger(){
        return GlobalSession.get().getLogUtils().getLogger();
    }

    private static ThreadLocal<QXClient> qualitrix = new ThreadLocal<>();

    public static void setQX(QXClient qx) {
        qualitrix.set(qx);
    }

    public static QXClient get(){
        return qualitrix.get();
    }
}
