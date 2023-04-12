package com.qualitrix.testng.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Qualitrix on DD/MM/YYY.
 * @author
 */
public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    int retryLimit = 0;
    @Override
    public boolean retry(ITestResult result) {
        if (counter < retryLimit) {
            counter++;
            result.setThrowable(new RuntimeException("Skipped By retry"));//setStatus(ITestResult.CREATED);
            System.out.println("Retry #" + counter + " for test: " + result.getMethod().getMethodName() + ", on thread: " + Thread.currentThread().getName());
            return true;
        }
        return false;
    }
}
