package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the Objects related to Login Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 19/March/2020
 */
public class LoginPageObjects {

    @AndroidFindBy(xpath = "//*[@resource-id='username']")
    public MobileElement usernameObj;

    @AndroidFindBy(xpath = "//*[@resource-id='password']")
    public MobileElement pwdObj;

    @AndroidFindBy(xpath = "//*[@resource-id='login']")
    public MobileElement loginBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
    public MobileElement fullName;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
    public MobileElement gmailTermsChkbx;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Submit ']")
    })
    public MobileElement submitBtn;

    @AndroidFindBy(xpath = "//*[@text='+91-']")
    public MobileElement mblNum;

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@text='Enter password']"),
            @AndroidBy(xpath = "//*[@resource-id='password']")
    })
    public MobileElement pwdEditbx;

    @AndroidFindBy(xpath = "//*[@text='Re-enter the password']")
    public MobileElement reEnterPwd;

    @AndroidFindBy(xpath = "//*[@resource-id='stateButton']")
    public MobileElement stateLoginBtn;

    @AndroidFindBy(xpath = "//*[@resource-id='tncAccepted']")
    public MobileElement termsCondChkBx;

    @AndroidFindBy(xpath = "//*[@resource-id='signup']")
    public MobileElement signUpBtn;

    @AndroidFindBy(xpath = "//*[@resource-id='fgtPortalFlow']")
    public MobileElement forgotPwdBtn;

    @AndroidFindBy(xpath = "//*[@resource-id='error-summary']")
    public MobileElement errorSummary;

    @AndroidFindBy(xpath = "//*[@text='Password must contain a minimum of 8 characters including numerals, lower and upper case alphabets and special characters.']")
    public MobileElement pwdErrorMsg;

    @AndroidFindBy(xpath = "//*[@text='Passwords do not match']")
    public MobileElement pwdDoNotMatchMsg;

    @AndroidFindBy(xpath = "//*[@text='Login With Google']")
    public MobileElement loginWithGoogleBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'kgk8991@gmail.com')]")
    public MobileElement gmailAccount;

    @AndroidFindBy(xpath = "//*[contains(@text,'Terms of Use')]")
    public MobileElement termsOfUse;

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@index='1']]")
    public MobileElement termsContinueBtn;

    @AndroidFindBy(xpath = "//*[@text='\uE909']")
    public MobileElement eyeBtn;
}



