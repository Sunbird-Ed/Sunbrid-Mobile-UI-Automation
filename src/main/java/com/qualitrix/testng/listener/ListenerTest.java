package com.qualitrix.testng.listener;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.qualitrix.Global;
import com.qualitrix.annotation.values.Author;
import com.qualitrix.annotation.values.Skip;
import com.qualitrix.client.QXClient;
import com.qualitrix.common.manager.AppiumManager;
import com.qualitrix.common.manager.GlobalSession;
import com.qualitrix.report.factory.ExtentManager;
import com.qualitrix.report.factory.ExtentTestManager;
import com.qualitrix.report.factory.QXReport;
import org.testng.*;

import java.io.IOException;

public class ListenerTest implements ITestListener , ISuiteListener, IInvokedMethodListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        String testName = iTestResult.getMethod().getMethodName() + " " + this;
        System.out.println("@onTestStart: " + iTestResult.getMethod().getMethodName() + this);
//        Author author = iTestResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Author.class);
        Skip skip = iTestResult.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Skip.class);
        ExtentTest testReport = ExtentTestManager
                .createTest(iTestResult.getMethod().getMethodName(), GlobalSession.get().getAppiumManager().getDeviceName());

        QXReport.setTestReport(testReport);

        System.out.println("@Skip: " + skip);
        if(skip == null) {
            try {
                GlobalSession.get().getAppiumManager().createDriver();
                QXReport.getTest().log(Status.PASS, "Application Launched Successfully");
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
                e.printStackTrace();
              //Cant't throw because don't know if client using driver in his testcase.
              //throw new RuntimeException("Driver not created: " + e.getMessage());
            }
            QXClient.setQX(new QXClient(AppiumManager.getAppiumDriver()));
        }else{
            System.out.println("skipping test");
            throw new SkipException("Skipped because annotation is set to the testcase");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("@onTestFailure");

        if(AppiumManager.getAppiumDriver() != null){
            QXReport.getTest().log( Status.FAIL ,result.getThrowable().getMessage());
            String base64 = QXClient.get().screenshotUtils().captureBase64();
            System.out.print("@Base64: " + base64);
            QXReport.getTest().addScreenCaptureFromBase64String(QXClient.get().screenshotUtils().captureBase64(), result.getMethod().getMethodName());
            try {
                QXReport.getTest().fail(result.getMethod().getMethodName(), MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            QXReport.getTest().log(Status.FAIL, "Driver not created");
            QXReport.getTest().log( Status.FAIL ,result.getMethod().getMethodName() + " Failed");
        }

        GlobalSession.get().getAppiumManager().quitDriver();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("@onTestSuccess");
        GlobalSession.get().getAppiumManager().quitDriver();
        QXReport.getTest().log( Status.PASS ,result.getMethod().getMethodName() + " Passed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("@onTestSkipped");
        QXReport.getTest().log( Status.SKIP ,result.getMethod().getMethodName() + " Skipped");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("@Start: ITestContext");
        GlobalSession.set(new GlobalSession());
        AppiumManager appiumManager = Global.getAvailableDevice();
        if(appiumManager !=null){
            GlobalSession.get().setAppiumManager(appiumManager);
            try {
                appiumManager.startAppiumServer();
            } catch (Exception e) {
                System.out.println("Exception onStart: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("@OnFinish: ITestContext");
        System.out.println("@Stop Appium Server");
        GlobalSession.get().getAppiumManager().stopAppiumServer();
        ExtentManager.getExtent().flush();
    }

//    @Override
//    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
//        if(method.isTestMethod()){
//            System.out.println("@InvocationTest");
//            if(AppiumManager.getAppiumDriver() != null){
//                AppiumManager.getAppiumDriver().quit();
//                QXReport.getTest().log( Status.PASS ,"Application Closed Successfully");
//            }
//        }
//    }
}
