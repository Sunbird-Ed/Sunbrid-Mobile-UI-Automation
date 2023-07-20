package com.qualitrix.pageActions;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.DikshaMainPageObjects;
import com.qualitrix.pageObjects.LoginPageObjects;
import com.qualitrix.pageObjects.ProfilePageObjects;

import java.rmi.MarshalledObject;
import java.util.Properties;

/**
 * This Class has all the methods related to Profile Page.
 *
 * @author : Gurukiran H N
 * @since : 19/March/2020
 */
public class LoginPageActions {

   
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    ProfilePageObjects profilePageObjects = new ProfilePageObjects();

    public LoginPageActions() {
    //    this.driver = ContextManager.getDriver();

       PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), loginPageObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), profilePageObjects);

    	//PageFactory.initElements(driver,DikshaMainPageObjects.class);

    }
    
    public void loginToTheUser(String username, String password) throws Exception {
    	//QXClient.get().gestures().wait(5);

        
       // 	QXClient.get().gestures().wait(3);
    	
    
    	Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);

            
            
            Thread.sleep(2000);
          // QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
            Thread.sleep(2000);

            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
            loginPageObjects.usernameObj.sendKeys(username);
            QXClient.get().report().info("Enter the username");
            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
            loginPageObjects.pwdEditbx.sendKeys(password);
            QXClient.get().report().info("Enter the password");
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
            QXClient.get().report().info("Tap on login button");
            Thread.sleep(8000);
            Thread.sleep(8000);
   
           
            //QXClient.get().gestures().wait(15);
    	
    }

    public void loginToTheUser1(String username, String password) throws Exception {
        //QXClient.get().gestures().wait(5);


        // 	QXClient.get().gestures().wait(3);


        Thread.sleep(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);



        Thread.sleep(2000);
        // QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
        Thread.sleep(2000);

        QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
        loginPageObjects.usernameObj.sendKeys(username);
        QXClient.get().report().info("Enter the username");

        QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
        loginPageObjects.pwdEditbx.sendKeys(password);
        QXClient.get().report().info("Enter the password");
        Thread.sleep(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Tap on login button");



        //QXClient.get().gestures().wait(15);

    }




    public void tapOnLoginBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Tap on login button");
    }

    public void tapOnEyeBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.eyeBtn);
        QXClient.get().report().info("Tap on eye button");
    }

    public void tapOnLoginWithGoogle() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.loginWithGoogleBtn);
        QXClient.get().gestures().wait(8);
        QXClient.get().report().info("Tap on login with google");
    }

    public void tapOnGmailAccount() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.gmailAccount);
        QXClient.get().gestures().wait(8);
        QXClient.get().report().info("Tap on login with google");
    }

    public void selectTermsChkBxClickContinueBtn() {
        if (QXClient.get().gestures().isElementPresent(loginPageObjects.termsOfUse)) {
            QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.gmailTermsChkbx);
            QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.termsContinueBtn);
            QXClient.get().report().info("Select checkbox and tap on terms and condition continue button");
        }
    }

    public void tapOnTermsAndConChkBx() {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.termsCondChkBx);
        QXClient.get().report().info("Tap on terms and condition check box");
    }

    public void tapOnSignUpBtn() throws Exception {
    	QXClient.get().gestures().wait(3);
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.signUpBtn);
        QXClient.get().gestures().wait(12);
        QXClient.get().report().info("Tap on signup button");
    }

 
    public void tapOnSubmitPopUpBtn() {
        if(QXClient.get().gestures().isElementPresent(loginPageObjects.submitBtn)) {
            loginPageObjects.submitBtn.click();
            QXClient.get().report().info("Tap on submit button");
        }
    }

    public void enterFullName(String fullname) {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.fullName);
        loginPageObjects.fullName.sendKeys(fullname);
        QXClient.get().report().info("Enter the full name");
    }

    public void enterMobileNum(String num) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.mblNum);
        loginPageObjects.mblNum.sendKeys(num);
        QXClient.get().report().info("Enter the mobile number");
    }

    public void enterPwdFieldInRegPage(String pwd) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
        loginPageObjects.pwdEditbx.sendKeys(pwd);
        QXClient.get().report().info("Enter the password");
    }

	/*
	 * public void verifyPasswordErrorMsg(String msg) {
	 * QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdErrorMsg
	 * ); Assert.assertTrue(QXClient.get().gestures().getText(loginPageObjects.
	 * pwdErrorMsg).equalsIgnoreCase(msg));
	 * QXClient.get().report().info("Verifying the password error message"); }
	 * 
	 * public void verifyReEnteredPasswordErrorMsg(String msg) {
	 * QXClient.get().gestures().waitForElementToAppear(loginPageObjects.
	 * pwdDoNotMatchMsg);
	 * Assert.assertTrue(QXClient.get().gestures().getText(loginPageObjects.
	 * pwdDoNotMatchMsg).equalsIgnoreCase(msg)); QXClient.get().report().
	 * info("Verifying the re-entered password error message"); }
	 */
    public void enterUserName(String username) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
        loginPageObjects.usernameObj.sendKeys(username);
        QXClient.get().report().info("Enter the username");
    }

    public void enterPassword(String pwd) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
        loginPageObjects.pwdEditbx.sendKeys(pwd);
        QXClient.get().report().info("Enter the password");
    }

    public void reEnterPwd(String pwd) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.reEnterPwd);
        loginPageObjects.reEnterPwd.sendKeys(pwd);
        QXClient.get().report().info("Re-Enter the password");
    }

	/*
	 * public void verifyErrorMsg(String msg) {
	 * QXClient.get().gestures().waitForElementToAppear(loginPageObjects.
	 * errorSummary);
	 * Assert.assertTrue(QXClient.get().gestures().getText(loginPageObjects.
	 * errorSummary).equalsIgnoreCase(msg),"Error message is displayed");
	 * QXClient.get().report().info("Verifying the error message"); }
	 */
    
    
    
    public void loginToTheUserForLeader(String username, String password) throws Exception {
    	DikshaMainPageActions cl=new DikshaMainPageActions();
    	Thread.sleep(2000);

       // QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);

            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
            loginPageObjects.usernameObj.sendKeys(username);
            QXClient.get().report().info("Enter the username");
            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
            loginPageObjects.pwdEditbx.sendKeys(password);
            QXClient.get().report().info("Enter the password");
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
            QXClient.get().report().info("Tap on login button");
            Thread.sleep(8000);
          //  cl.clkCloseIcon();

            //QXClient.get().gestures().wait(15);
    	
    }
    public void tapOnLoginBtnInTrainingTab() {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtnInTraningTab);
        QXClient.get().report().info("Tap on login button in Training Tab");
    }
    
    public void tapOnLoginBtnInCourseTab(String username, String password) throws Exception {
    	//QXClient.get().gestures().wait(5);

        
       // 	QXClient.get().gestures().wait(3);
    	
    
    	Thread.sleep(2000);

            
            
            Thread.sleep(2000);
           // QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
            Thread.sleep(2000);

            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
            loginPageObjects.usernameObj.sendKeys(username);
            QXClient.get().report().info("Enter the username");
            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
            loginPageObjects.pwdEditbx.sendKeys(password);
            QXClient.get().report().info("Enter the password");
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
            QXClient.get().report().info("Tap on login button");
            Thread.sleep(8000);
            Thread.sleep(8000);
   
           
            //QXClient.get().gestures().wait(15);
    	
    }
    
    public void verifyRegisteredEmailMessageWhileRegistering() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(7000);

     
    //    Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");
        QXClient.get().gestures().BlindWait(2000);

      

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditTextField);
        QXClient.get().report().info("Clicked on Name edit field");
        profilePageObjects.nameEditTextField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().clkBackButton();
        
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

                
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clickContinueRegister);
        QXClient.get().gestures().BlindWait(5000);
        
        try
        {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clickContinueRegister);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
        
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkSubmit);
        QXClient.get().gestures().BlindWait(4000);
        
      

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailAddress);
        QXClient.get().report().info("Clicked on Email Address ");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.emailEditTextField);
        QXClient.get().report().info("Clicked on email edit text field");
        QXClient.get().gestures().BlindWait(5000);
        profilePageObjects.emailEditTextField.sendKeys("dikshatest15@gmail.com");
        QXClient.get().report().info("Entered already registered email address");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(6000);

    //    QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.passwordEditTextField1);
        QXClient.get().report().info("Clicked on password edit text filed");
       // profilePageObjects.passwordEditTextField1.sendKeys("Test@123");
     //   QXClient.get().gestures().BlindWait(6000);
     //   QXClient.get().gestures().clkBackButton();

     //   QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailAndMobileAsterisk),"assertEmailAndMobileAsterisk is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordAsterisk),"assertPasswordAsterisk is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertConfirmPasswordAsterisk),"assertConfirmPasswordAsterisk is not displayed");

        
        
       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.alreadyRegisteredEmailMessage),"Already registered email address is not displayed");
        QXClient.get().report().info("Already registered email address message is displayed");
        QXClient.get().gestures().BlindWait(3000);



    }
    
    
    public void verifyDifferentLoginOptions() throws Exception {

        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);


        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginPageText),"Login page is not displayed");
        QXClient.get().report().info("Login page text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginWithDikshaOption),"Login with Diksha option is not displayed");
        QXClient.get().report().info("Login with DIKSHA is displayed in login page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginWithStateSystemOption),"Login with state system is not displayed");
        QXClient.get().report().info("Login with state system is displayed in login page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertSignInwithGoogleOption),"Signin with google is not displayed");
        QXClient.get().report().info("Sign with Google option is displayed in login page");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyRegisterHerePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertNameField),"Name field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMobileNumber),"Mobile number field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailAddress),"Email address field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertOtpMessage),"Otp message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordField),"Password field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordLimitationsMsg),"Password limitation message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertConfirmPasswordField),"Confirm Password field is not displayed");

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMandatoryField),"Mandatory fields message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertTCcheckBox),"Terms and conditions checkbox is not displayed");

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.assertNameField);
        QXClient.get().report().info("Clicked on Name field ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditTextField);
        QXClient.get().report().info("Clicked on Name edit field");
        profilePageObjects.nameEditTextField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailAddress);
        QXClient.get().report().info("Clicked on Email Address ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.emailEditTextField);
        QXClient.get().report().info("Clicked on email edit text field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.emailEditTextField.sendKeys("sunbird");
        QXClient.get().report().info("Entered already registered email address");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.passwordEditTextField1);
        QXClient.get().report().info("Clicked on password edit text filed");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.validateErrorMsgForInvalidEntry),"Error message for invalid entry is not displayed");
        QXClient.get().report().info("Error message is displayed for Invalid entry");
        QXClient.get().gestures().BlindWait(3000);





    }

    public void verifySubPersonaInGuestUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkAdd);
        QXClient.get().report().info("Clicked on Add in profile page");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.assertSubPersona),"Sub persona is present for guest role");
        QXClient.get().report().info("Sub persona is not displayed for Guest User");
        QXClient.get().gestures().BlindWait(2000);
    }


    public void verifyIncorrectOTPMessage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Regsiter page is displayed");


        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditTextField);
        QXClient.get().report().info("Clicked on Name edit field");
        profilePageObjects.nameEditTextField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().clkBackButton();
        

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(4000);
        
        try
        {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
      
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkSubmit);
        QXClient.get().gestures().BlindWait(3000); 
        

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailAddress);
        QXClient.get().report().info("Clicked on Email Address ");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.emailEditTextField);
        QXClient.get().report().info("Clicked on email edit text field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.emailEditTextField.sendKeys("stag12@yopmail.com");
        QXClient.get().report().info("Entered already registered email address");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(5000);

      
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.passwordEditTextField1);
        QXClient.get().report().info("Clicked on password edit text filed");
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.passwordEditTextFieldOne.sendKeys("Test@123");
        QXClient.get().gestures().BlindWait(3000);
         QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.passwordEditTextField2);
        QXClient.get().report().info("Clicked on password edit text filed");
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.confirmPasswordEditTextField.sendKeys("Test@123");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(7000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOntncAccepted);
        QXClient.get().gestures().BlindWait(3000);
        
        try
        {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOntncAccepted);
        QXClient.get().gestures().BlindWait(3000);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
        QXClient.get().gestures().BlindWait(3000);

      
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertOneTimePasswordText),"One time password label is not displayed");
        QXClient.get().report().info("One time password label is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEditOTPField);
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnEditOTPField.sendKeys("1234");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clickTermsAndCheckBox);
        QXClient.get().gestures().BlindWait(2000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnSubmitBtnn);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertToastMessageOfIncorrectOTP),"Toast message is not displayed for Incorrect OTP");
        QXClient.get().report().info("Toast message is displayed for Incorrect OTP");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void validateErrorMessageForEmailAndName() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnForgetPassword);
        QXClient.get().report().info("Clicked on Forget password link");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailEditField);
        QXClient.get().report().info("Clicked on Email edit field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnEmailEditField.sendKeys("Stag@yopmail.com");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNameEditField);
        QXClient.get().report().info("Clicked on Name field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnNameEditField.sendKeys("Anoshu");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
    //    QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailEditField);
        QXClient.get().report().info("Clicked on Email edit field");
        QXClient.get().gestures().BlindWait(2000);


        profilePageObjects.clkOnNextBtn.click();
        
      //  QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNextBtn);
      //  QXClient.get().gestures().BlindWait(4000);

        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNextBtn);

        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
        QXClient.get().report().info("Clicked on Next button");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(9000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailNotRegisteredMessage),"Email not registered message is not displayed");
        QXClient.get().report().info("Email is not registered with sunbird message is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertNameNotRegisteredMessage),"Name is not registered message is not displayed");
        QXClient.get().report().info("Name is not registered with sunbird message is displayed");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyRecoverAccountPageDetails() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(2000);

       // QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnForgetPassword);
        QXClient.get().report().info("Clicked on Forget password link");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRecoverAccountText),"Recover account text is not displayed");
        QXClient.get().report().info("Recover Account text is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailaddressMobileNumberLabel),"Email address and Mobile number label is not displayed");
        QXClient.get().report().info("Email address/Mobile Number Label is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertNameLabel),"Name label is not displayed ");
        QXClient.get().report().info("Name Label is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyLandingOnLoginPagePostIncorrectNameTwoTimes() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailEditField);
        QXClient.get().report().info("Clicked on Email edit field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnEmailEditField.sendKeys("stag48@yopmail.com");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNameEditField);
        QXClient.get().report().info("Clicked on Name field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnNameEditField.sendKeys("Anoshu");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNextBtn);
        QXClient.get().report().info("Clicked on Next button for the first time");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNameEditField);
        QXClient.get().report().info("Clicked on Name field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnNameEditField.sendKeys("Hello");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNextBtn);
        QXClient.get().report().info("Clicked on Next button for second time with invalid name");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginTextInLoginPage),"Login page is not displayed");
        QXClient.get().report().info("After giving two times with invalid name redirected to Login Page");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertErrorMessageInLoginPage),"Error message is not displayed");
        QXClient.get().report().info("Error message is displayed in Login page");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyRecoverEmailAddressToSendOTP() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnForgetPassword);
        QXClient.get().report().info("Clicked on Forget password link");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRecoverAccountText),"Recover account text is not displayed");
        QXClient.get().report().info("Recover Account text is displayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailEditField);
        QXClient.get().report().info("Clicked on Email edit field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnEmailEditField.sendKeys("stag49@yopmail.com");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNameEditField);
        QXClient.get().report().info("Clicked on Name field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.clkOnNameEditField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(4000);

      //  QXClient.get().gestures().clkBackButton();
       
        profilePageObjects.clkOnNextBtn.click();
        
      //  QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnNextBtn);
        QXClient.get().report().info("Clicked on Next button for the first time");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRecoverAccountText),"Recover Account text is not displayed");
        QXClient.get().report().info("Recover Account text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMessageRelatedToOTP),"Message related to OTP is not displayed");
        QXClient.get().report().info("Message related OTP is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailAddressToSendOTP),"Email address is not displayed");
        QXClient.get().report().info("Email Address to send OTP is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyUserNotAbleLoginForAlreadyMergedAccount() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

     //   Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertInvalidMsgForAlreadyMergedAccount),"Invalid message is not displayed for Already Merged Account");
        QXClient.get().report().info("User is not able to Login with Already Merged Username and Password");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(loginPageObjects.usernameObj),"Username Edit field is not present");
        QXClient.get().report().info("Username Edit field is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(loginPageObjects.pwdEditbx),"Password Edit field is not displayed");
        QXClient.get().report().info("Password Edit field is displayed");
    //    Assert.assertTrue(QXClient.get().gestures().isElementPresent(loginPageObjects.loginBtn),"Login Button is not displayed");
        QXClient.get().report().info("Login Button is displayed due to Login is not successful");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyNoLocationPopupInSignInPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.selectState),"Select state in Location popup is displayed in Sign In Page");
        QXClient.get().report().info("Select state in Location popup is not displayed in Sign In Page");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.selectDist),"Select district in Location popup is displayed in Sign In Page");
        QXClient.get().report().info("Select district in Location popup is not displayed in Sign In Page");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyNoLocationPopupInSignUpPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.selectState),"Select state in Location popup is displayed in Sign up Page");
        QXClient.get().report().info("Select state in Location popup is not displayed in Sign up Page");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.selectDist),"Select district in Location popup is displayed in Sign up Page");
        QXClient.get().report().info("Select district in Location popup is not displayed in Sign up Page");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyNoLocationPopupInForgotPasswordPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

      //  QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnForgetPassword);
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.selectState),"Select state in Location popup is displayed in ForgotPassword Page");
        QXClient.get().report().info("Select state in Location popup is not displayed in ForgotPassword Page");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.selectDist),"Select district in Location popup is displayed in ForgotPassword Page");
        QXClient.get().report().info("Select district in Location popup is not displayed in ForgotPassword Page");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyLoginPageTextAndForgotReplacedByForgetPassword() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEnterYourEmailPlaceholder),"Enter your email / mobile number is not displayed in Email address and Mobile number Textbox");
        QXClient.get().report().info("Enter your email / mobile number is displayed in Email address and Mobile number Textbox");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordPlaceholder),"Enter your password is not displayed in Password Textbox");
        QXClient.get().report().info("Enter your password is displayed in Password Textbox");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertForgotText),"Forgot Text is displayed below Password Textbox");
        QXClient.get().report().info("Forgot Text is not displayed below Password Textbox");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkOnForgetPassword),"Forgot text is not replaced by Forget Password text");
        QXClient.get().report().info("Forgot Text is replaced by Forget Password Text");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoignBtnInUppercase),"Login Button text is not displayed in Uppercase");
        QXClient.get().report().info("Login Button text is displayed with capital letters");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyLoginWithGoogleIsReplacedBySignWithGoogle() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertDontHaveAnAccountBelowLoginBtn2),"Don't have an account is not displayed below Login Button");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertDontHaveAnAccountBelowLoginBtn),"Don't have an account is not displayed below Login Button");
        QXClient.get().report().info("Don't have an account is displayed below Login Button");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here is not displayed below Login Button");
        QXClient.get().report().info("Register here is displaye below Login Button");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginWithGoogleBtn),"Login with google button is not displayed");
        QXClient.get().report().info("Loign With Google button is replaced by Sign with Google button");

      

    //    Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLeftsideGoogleLogo),"Google logo is not placed on left side of the button");
        QXClient.get().report().info("Google is present on the left side of the Sign with google button");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void validateNoBoardMediumClassSubjectValues() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.assertBoardInProfile),"Board value is displayed");
        QXClient.get().report().info("Board value is not displayed in Register Here page");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.assertMediumInProfile),"Medium value is displayed");
        QXClient.get().report().info("Medium value is not displayed in Register Here page");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.assertClassInProfile),"Class value is displayed");
        QXClient.get().report().info("Class value is not displayed in Register Here page");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyRedirectedToLoginPagePostSelectingUsertypeAdmin() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginPageText),"Login to DIKSHA text  is not displayed");
        QXClient.get().report().info("Login to DIKSHA text is displayed in Login page");

       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkLoginWithDikshaBtn),"Login with Diksha button is not displayed");
        QXClient.get().report().info("Login with Diksha button is displayed in Login page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginWithStateSystemOption),"Login with state system button is not displayed");
        QXClient.get().report().info("Login with state system button is displayed in Login page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.signInwithGoogle),"Sign with Google button is not displayed");
        QXClient.get().report().info("Sign in with google button is displayed in Login page");

    }

    public void verifyMandatoryTermsAndConditionsInRegisterHere() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertNameField),"Name field is not displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.firstEditField);
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.firstEditField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkSubmit);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMobileNumber),"Mobile number field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailAddress),"Email address field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertOtpMessage),"Otp message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordField),"Password field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordLimitationsMsg),"Password limitation message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertConfirmPasswordField),"Confirm Password field is not displayed");

       // QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMandatoryField),"Mandatory fields message is not displayed");
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertTCcheckBox),"Terms and conditions checkbox is not displayed");

        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyFullstopSymbolIsDisplayedBelowPasswordField() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.nameEditField1),"Name field is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditField1);
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.nameEditField1.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

        
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(3000);

        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        }
        catch(Exception ee)
        {
        	System.out.println(ee);
        }
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkSubmit);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMobileOrEmailAddressFieldsOfRegistereHerePage),"Email or mobile edit fields are not displayed");
        QXClient.get().report().info("Enter mobile number or email address of your parent or guardian text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMobileNumber),"Mobile number edit label is not dipslayed");
        QXClient.get().report().info("Mobile number label is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailAddress),"Email address label is not displayed");
        QXClient.get().report().info("Email address label is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordField),"Password label is not displayed");
        QXClient.get().report().info("Password label is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertFullStopIsPresentBelowPasswordField),"Full stop is not displayed below the password field");
        QXClient.get().report().info("Fullstop is displayed below the password field");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyPostClickingContinueBtnItShouldWorkAsExpected() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.nameEditField1),"Name field is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditField1);
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.nameEditField1.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

        
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(4000);

        
        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
            QXClient.get().gestures().BlindWait(5000);

        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertToDiscoverRelevantContentText),"To discover relevant content update the following details text is not displayed");
        QXClient.get().report().info("To discover relevant content update the following details text is displayed");

//        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertTeacherRoleAlreadySelected),"Teacher role selected is not displayed");
//        QXClient.get().report().info("Teacher role selected is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertStateValueAutoPopulated),"State value is not auto populated");
        QXClient.get().report().info("State value is Auto populated");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertDistrictValueAutoPopulated),"District value is not auto populated");
        QXClient.get().report().info("District value is Auto populated");
        QXClient.get().report().info("Post clicking continue button it work as expected without any discrepancy");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyEnterMobileNumberOrEmailAddressTextForMajorUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");

        
     
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.nameEditField1),"Name field is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditField1);
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.nameEditField1.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        
        
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.selectYearManually.sendKeys("1998");
        QXClient.get().gestures().BlindWait(3000);
        
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);

           QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectMajorUser);
           QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().clkBackButton();

       
     //   QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectMajorUser);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(4000);

        try
        {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(4000);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertToDiscoverRelevantContentText),"To discover relevant content update the following details text is not displayed");
        QXClient.get().report().info("To discover relevant content update the following details text is displayed");

     //   Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertStateValueAutoPopulated),"State value is not auto populated");
        QXClient.get().report().info("State value is Auto populated");

      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertDistrictValueAutoPopulated),"District value is not auto populated");
        QXClient.get().report().info("District value is Auto populated");
        QXClient.get().report().info("Post clicking continue button it work as expected without any discrepancy");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkSubmit);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMobileNumber),"Mobile Number option is not displayed");
        QXClient.get().report().info("Mobile number option is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertWelcomeToSunbirdText),"Welcome to SUNBIRD text is not displayed");
        QXClient.get().report().info("Welcome to SUNBIRD text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEnterMobileNumberOrEmailAddressText),"Enter mobile number or email address text is not displayed for Major user");
        QXClient.get().report().info("Enter mobile number or email address text is displayed for Major user");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.assertEmailAddress);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEnterMobileNumberOrEmailAddressText),"Enter mobile number or email address text is not displayed for Major user");
        QXClient.get().report().info("Enter mobile number or email address text is displayed for Major user");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyEnterMobileNumberorEmailAddressTextForMinorUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Regsiter page is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.nameEditField1),"Name field is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditField1);
        QXClient.get().gestures().BlindWait(3000);
        profilePageObjects.nameEditField1.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(3000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(4000);
        
        try
        {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkContinueBtn);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertToDiscoverRelevantContentText),"To discover relevant content update the following details text is not displayed");
        QXClient.get().report().info("To discover relevant content update the following details text is displayed");

   //   Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertTeacherRoleAlreadySelected),"Teacher role selected is not displayed");
       QXClient.get().report().info("Teacher role selected is displayed");

      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertStateValueAutoPopulated),"State value is not auto populated");
        QXClient.get().report().info("State value is Auto populated");

      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertDistrictValueAutoPopulated),"District value is not auto populated");
        QXClient.get().report().info("District value is Auto populated");
        QXClient.get().report().info("Post clicking continue button it work as expected without any discrepancy");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkSubmit);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMobileNumber),"Mobile Number option is not displayed");
        QXClient.get().report().info("Mobile number option is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertWelcomeToSunbirdText),"Welcome to SUNBIRD text is not displayed");
        QXClient.get().report().info("Welcome to SUNBIRD text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailOrMobileNoOfParentOrGuardian),"Enter mobile number or email address of Parent or guardian text is not displayed for minor user");
        QXClient.get().report().info("Enter mobile number or email address of Parent or guardian text is displayed for minor user");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.assertEmailAddress);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailOrMobileNoOfParentOrGuardian),"Enter mobile number or email address of Parent or guardian text is not displayed for minor user");
        QXClient.get().report().info("Enter mobile number or email address of Parent or guardian text is displayed for minor user");
        QXClient.get().gestures().BlindWait(3000);



    }

    public void verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(String schoolID) throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginWithStateSystemOption),"Login with state system option is not displayed");
        QXClient.get().report().info("Login with state system option is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.assertLoginWithStateSystemOption);
        QXClient.get().report().info("Clicked on Login with state system option");
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnSelectStateOption);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectFirstOption);
        QXClient.get().report().info("Select first option in the list");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertDikshaSSOLoginText),"Diksha SSO Login text is not displayed");
        QXClient.get().report().info("Diksha SSO Login text is displayed ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().isElementPresent(profilePageObjects.userNameEditField);
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.userNameEditField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().isElementPresent(profilePageObjects.userNameExternalID);
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.userNameExternalID.sendKeys(schoolID);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().isElementPresent(profilePageObjects.schoolExternalID);
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.schoolExternalID.sendKeys(schoolID);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().BlindWait(6000);
    }

    public void verifyUserNavigatedToNativePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().report().info("User is navigated to native page post clicking login button in profile page");
        QXClient.get().gestures().BlindWait(3000);
    }


}


