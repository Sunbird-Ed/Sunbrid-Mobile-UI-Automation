package com.qualitrrix.test.regressionP1;

import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.CoursePageActions;
import com.qualitrix.pageActions.DikshaMainPageActions;
import com.qualitrix.pageActions.DownloadPageActions;
import com.qualitrix.pageActions.HomePageActions;
import com.qualitrix.pageActions.LibraryCourseContentPageActions;
import com.qualitrix.pageActions.LoginPageActions;
import com.qualitrix.pageActions.ProfileEditPageActions;
import com.qualitrix.pageActions.TrainingPageActions;

public class LoginP1 {

	public DikshaMainPageActions getDikshaMainPageActions() {
		return new DikshaMainPageActions();
	}

	public LoginPageActions getLoginPageActions() {
		return new LoginPageActions();
	}

	public CoursePageActions getCoursePageActions() {
		return new CoursePageActions();
	}

	public LibraryCourseContentPageActions getLibraryPageActions() {
		return new LibraryCourseContentPageActions();
	}

	public HomePageActions getHomePageActions() {
		return new HomePageActions();
	}
	 public TrainingPageActions getTrainingPageActions() {
	        return new TrainingPageActions();
	    }
	 public DownloadPageActions getDownloadPageActions() {
	        return new DownloadPageActions();
	    }
	 public ProfileEditPageActions getProfileEditPageActions() {
	        return new ProfileEditPageActions();
	    }
	 // DikshaMainPageActions d=new DikshaMainPageActions();

	 
	@BeforeClass
	public void BeforeClass() {
		System.out.println("@BeforeClass");
		// QXClient.get().driver();

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
		// QXClient.get().driver();

	}
	
	
	  @Test()
	    public void verifyUserNotAbleToLoginUsingAlreadyMergedAccountCredentials() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 61, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 62, 2);

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getLoginPageActions().verifyUserNotAbleLoginForAlreadyMergedAccount();

	    }

    @Test()
    public void validateRecoverEmailAddressToSendOTP() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyRecoverEmailAddressToSendOTP();

    }


	
    @Test()
    public void verifyUserShouldNotNavigatedToRegistrationPageWhenSignInWithGoogleOldAccount() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().signInWithGoogle();

        getHomePageActions().verifyGmailUserShouldNotNavigatedToRegistrationPage();

    }


	 @Test()
	    public void verifyBMGSPickValuesInProfileToastMessagePostLogin() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",103,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",104,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser1(Username, Password);

	        getHomePageActions().verifyToastMessageBMGSValuesPickedByDefault();

	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().verifyBMGSValuesPickedAutomaticallyInProfilePage();

	    }

	
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Login with Gamil verification")
	    public void verifyUserAbleToLoginWithGmail() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getHomePageActions().signInWithGoogle();
	        getHomePageActions().enterGmailDetailsAndVerfiyUsrnameInProfileSec();

	    }
    @Test()
    public void verifyAlreadyRegisteredEmailMessage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyRegisteredEmailMessageWhileRegistering();


    }
    @Test()
    public void verifyUsageHistoryInLoggedInGmailAccount() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().signInWithGoogle();

        getHomePageActions().verifyNavigatedToGmailLoginPagePostClickingSignWithGoogle();

        getHomePageActions().enterGmailDetailsAndVerfiyUsrnameInProfileSec();

    }

    @Test()
    public void verifyAdminUserAskedToForMandatoryTermsAndConditionInRegisterHerePage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingWithLeader();

        getLoginPageActions().verifyRedirectedToLoginPagePostSelectingUsertypeAdmin();

        getLoginPageActions().verifyMandatoryTermsAndConditionsInRegisterHere();


    }


	
	 @Test()
	    public void verifyUserAbleToNavigateBackFromOTPPageSuccessfully() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getHomePageActions().signInWithGoogle();

	        getHomePageActions().verifyPrefilledStateAndDistrictPostUpdatingNameAndDOBInRegistrationPage();

	        getHomePageActions().verifyUserAbleToNavigateBackPostClickingDeviceBackBtn();

	    }
	 @Test()
	    public void verifyMandatoryStateAndDistrictPrefilledAndVerifyBackBtnDisplayed() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getHomePageActions().signInWithGoogle();

	        getHomePageActions().verifyPrefilledStateAndDistrictPostUpdatingNameAndDOBInRegistrationPage();

	    }

    @Test()
    public void verifyEnterMobileNumberOrEmailAddressMandatoryForMajorUserInRegisterHere() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyEnterMobileNumberOrEmailAddressTextForMajorUser();

    }

	
	 @Test()
	    public void verifyEnterMobileNumberOrEmailAddressMandatoryForMinorUserInRegisterHere() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyEnterMobileNumberorEmailAddressTextForMinorUser();

	    }
	
	   @Test()
	    public void verifyStateAndDistrictValuesAreAutopopulatedInRegisterHerePage() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyPostClickingContinueBtnItShouldWorkAsExpected();

	    }
	
	 @Test()
	    public void verifyPostClickingContinueBtnInRegisterHerePageShouldWorkAsExpected() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyPostClickingContinueBtnItShouldWorkAsExpected();

	    }
	 @Test()
	    public void SubmitDetailsNotDisplayIfCustodianUserMovedToStateTenant() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String SchoolexternalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",145, 2);
	        String UserexternalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",146, 2);

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().LoginUsingStateSystemUsingUsernameExternalID(UserexternalID,SchoolexternalID);
	        QXClient.get().gestures().closeappandrelaunchapp();
	                getHomePageActions().tapOnProfileTab();
					  getCoursePageActions().VerifySubmitDetailsFormInProfile();


	    }

	  @Test()
	    public void ValidateEmailOTPSentMessageForgetPassword() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyRecoverEmailAddressToSendOTP();
	        getLoginPageActions().validateOtpMsgForForgotPasswordAsWellForReSendOTP();
	    }

   
}
