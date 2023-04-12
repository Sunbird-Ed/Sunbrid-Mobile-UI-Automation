package com.qualitrix.report.factory;

import java.io.BufferedWriter;
import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class QXReport {

    private static ThreadLocal<ExtentTest> testReport = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return testReport.get();
    }

    public static void setTestReport(ExtentTest extent) {
        testReport.set(extent);
    }
}

