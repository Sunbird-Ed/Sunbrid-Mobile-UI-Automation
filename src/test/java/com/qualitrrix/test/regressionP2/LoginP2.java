package com.qualitrrix.test.regressionP2;

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

public class LoginP2 {

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
    public void verifyLoginPageAndSettingsScreenWhileMergeAccounts() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyLoginPageWhileMergeAccount();
    }
	 @Test()
	    public void verifyAdminUserAskedToForMandatoryTermsAndConditionInRegisterHerePage() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoardingWithLeader();

	        getLoginPageActions().verifyRedirectedToLoginPagePostSelectingUsertypeAdmin();

	        getLoginPageActions().verifyMandatoryTermsAndConditionsInRegisterHere();


	    }
	 @Test()
	    public void verifyTextInRoleConfirmationAndLabelInEditLocationPage() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().validateChooseContentPreferenceLabelInLocation();


	    }
	 
	   @Test()
	    public void validateHomeAndSearchPagePostSwitchToNewExperienceBtn() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoardingAndClickSwitchToNewExperience();
	        getHomePageActions().tapOnProfileTab();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",63,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",64,2);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().verifyMyLearningBrowseByCategoryInHomePagePostSwitchToNewExperience();

	        //getHomePageActions().verifyPopularCategoriesInSearchPagePostSwitchToNewExperience();



	    }
	   @Test()
	    public void verifyUserAbleToLoginToTheSystemUsingUsernameExternalIDAndSchoolExternalID() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String externalID =QXClient.get().excelUtils().getCellValue("Excel1","TestData",92,2);

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().verifyUserLoggedInSuccessfullyUsingStateSystem();

	    }
	 @Test()
	    public void verifySubroleScreenForHeadTeacherRoleIsDisplayedForNewCredentials() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoardingWithLeader();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",101,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",102,2);

	        getLoginPageActions().loginToTheUserForLeader(Username,Password);

	        getHomePageActions().verifySectionsInHomePage();

	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().verifySubroleScreenForNewCred();

	    }

	
	@Test()
    public void validateRecoverAccountPageDetails() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyRecoverAccountPageDetails();

        getLoginPageActions().verifyLandingOnLoginPagePostIncorrectNameTwoTimes();


    }
	
	

    @Test()
    public void validateInvalidEmailAddressMessageInMergeAccountScreen () throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().validateInvalidEmailMessageWhileMerging();

    }

	@Test()
    public void userAbleToSeeMergeOptionAndAbleToMergeCustodianUserSuccessfully() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String SatetUsername =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String StatePassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
        String custodianUser =QXClient.get().excelUtils().getCellValue("Excel1","TestData",107,2);
        String custodianPWD =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",108,2);


        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(SatetUsername,StatePassword);

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        QXClient.get().gestures().BlindWait(4000);
        getHomePageActions().tapOnDownloadTab();


        getHomePageActions().validateCustodianUserMergedSuccessfully(custodianUser,custodianPWD);

    }
	   @Test()
	    public void validateMergeAccountOptionInSettingsScreenPostClickBackBtn() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().verifyMergeAccountInSettings();
	    }


	  @Test()
	    public void validateFailedToMergeAccountMessageWhileMergingStateUser() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 57, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 58, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().validateFailedToMergeAccountMessage();

	    }

    @Test()
    public void validateEmailAndNameIsNotRegisteredWithSunbirdMsg() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().validateErrorMessageForEmailAndName();

    }

	@Test()
    public void verifyNoYOBPopupForSSOUser() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 92, 2);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUserLoggedInSuccessfullyUsingStateSystem();

        getProfileEditPageActions().verifyNoYOBpopupForAnyUser();
    }

	@Test()
	public void verifyNoMergeAccountOptionInSettingsForCustodianUser() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyNoMergeAccountOptionInSettingsScreen();

	}



	@Test()
    public void verifyConsentFormInSubmitDetails() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username,Password);

        QXClient.get().gestures().BlindWait(4000);
        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnProfileTab();

        getCoursePageActions().VerifySubmitDetailsForm();
    }

	 @Test()
	    public void verifyNoSubPersonaForGuestUser() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifySubPersonaInGuestUser();

	    }
	 
	  @Test()
	    public void verifyLocationPopupIsNotDisplayedToLoggedSSOUser() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 92, 2);

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);

	        d.LaunchAppHomeScreen();

	        getProfileEditPageActions().veriyNoLocationPopupWhenLoggedInWithSSOUser();
	    }

	  @Test()
	    public void verifyGlobalConsentPopupDetailsWhileConsumingACourseForNonCustodianUser () throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
	        getHomePageActions().tapOnProfileTab();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 93, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 94, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar("CourseContent");

	        getTrainingPageActions().tapOnSearchedCourse6();
	        getTrainingPageActions().verifyConsentPopUpForCourse();

	        getTrainingPageActions().leaveCourse();
	    }

	    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "verifyUserAbleToFillFrameworkAndLocationDetails")
	    public void verifyUserIsAbleToSignInToTheApp() throws Exception {

	        QXClient.get().driver();
	        DikshaMainPageActions d=new DikshaMainPageActions();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);

	    }


	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	          description = "verifyUserAbleToFillFrameworkAndLocationDetails")
	  public void verifyUserAbleToFillFrameworkAndLocationDetails() throws Exception {
		  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
				  
	      getHomePageActions().tapOnSearchIcon();
	      getHomePageActions().enterTextInSearchBar(BookName);
		    //   QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

	      getTrainingPageActions().tapOnSearchedBook();
	  }
	
	   @Test()
	    public void verifyBoardValuesAreInAlphabeticalOrder() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().verifyBoardInAlphabeticalOrder();

	    }

		

	
	 @Test()
	    public void NoLocationPopUpWhenUserIsInSignInPageSignUpPageAndForgotPasswordPage() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyNoLocationPopupInSignInPage();

	        getLoginPageActions().verifyNoLocationPopupInSignUpPage();
	        QXClient.get().gestures().clkBackButton();
	        getLoginPageActions().verifyNoLocationPopupInForgotPasswordPage();


	    }
	 @Test()
	    public void validateBoardMediumClassSubjectValuesAreHiddenInRegisterHerePage() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().validateNoBoardMediumClassSubjectValues();


	    }


	 @Test()
	    public void verifyNotLandingOnSearchTabForLoggedInUser() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();


	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);


	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().verifyNotLandedOnSearchTabAfterLogin();

	    }
	 
	
	  @Test()
	    public void userNavigatedToNativePagePostClickingLoginBtnInProfileAndInHamburgerMenu() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getLoginPageActions().verifyUserNavigatedToNativePage();

	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().userLogout();

	      
	        
	        getHomePageActions().tapOnMenuBar();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getLoginPageActions().verifyUserNavigatedToNativePage();

	    }
	
	
	

	  @Test()
	    public void verifyFullStopInToastMessageBelowPasswordField() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyFullstopSymbolIsDisplayedBelowPasswordField();


	    }
	 @Test()
	    public void verifyMobileNumberEmailAddressAndAsterikSymbolInRegisterHerePage() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyRegisteredEmailMessageWhileRegistering();


	    }
	@Test()
    public void validateLoginWithGoogleIsReplacedBySignWithGoogle() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyLoginWithGoogleIsReplacedBySignWithGoogle();

    }
	  @Test()
	    public void validateForgotTextIsReplacedByForgetPasswordText() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyLoginPageTextAndForgotReplacedByForgetPassword();

	    }
	   
	 @Test()
	    public void verifyAllTextIsDisplayedInRegisterHereInDarkMode() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnProfileTab();

	        getHomePageActions().verifyAllTextDisplayedInRegisterHerePageInDarkMode();

	    }
		
	@Author(name = "Raju")
	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true)
	public void verifyUserAbleToEnrollConsumeCourseContent() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 25, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnAddAnotherUser();

		String FakeName = QXClient.get().gestures().generateRandomName();
		String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
		System.out.println(storeFakeNameEntered);
		getCoursePageActions().tapOnAddUserBtn();

		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnMoreOption();
		QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);

		getCoursePageActions().tapOnChangeUser();

		getCoursePageActions().tapOnTermsAndCondition();

		getCoursePageActions().tapOnContinueForSwicthUser();

		DikshaMainPageActions d2 = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d2.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();
		// getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);

		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getTrainingPageActions().consumCourseContent();

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
	    public void verifyUserShouldNavigatedToRegistrationPageWhenSignInWithGoogleNewAccount() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getHomePageActions().signInWithGoogle();

	        getHomePageActions().verifyUserNavigatedToRegistrationPageForGmailUser();

	    }

    @Test()
    public void verifyOTPSentToParentOrGuardianMessageForMinorUsersWhileRegistration() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyEnterMobileNumberorEmailAddressTextForMinorUser();

    }
	
    @Test()
    public void validateToastMessageForIncorrectOTP() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyIncorrectOTPMessage();

    }


 
	
	@Test()
	public void verifyLoginOptionsWhileLogin() throws Exception {
	   QXClient.get().driver();
	   getDikshaMainPageActions().performUserOnBoarding();
	   getHomePageActions().tapOnProfileTab();

	   QXClient.get().gestures().swipeUp();
	   QXClient.get().gestures().swipeUp();

	   getLoginPageActions().verifyDifferentLoginOptions();


	}
	 @Test()
	    public void userAbleToReloginUsingExternalIDAndSchoolIDAccountMergedViaSSO() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 92, 2);

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);

	        d.LaunchAppHomeScreen();

	        getProfileEditPageActions().veriyNoLocationPopupWhenLoggedInWithSSOUser();
	    }

	
	@Test()
	public void verifyNewTagsInHamburgerMenuAndLoginOptions() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().verifyScanQRAndSelectBoardWhileUserOnBoarding();

		getHomePageActions().tapOnDownloadTab();
		QXClient.get().gestures().closeApp();

		DikshaMainPageActions d = new DikshaMainPageActions();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		//getHomePageActions().verifyNewTagForMyGroupsAndImportContent();

		getHomePageActions().verifyUserLoginInHamburgerMenu();

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().verifyUserLoginInProfile();


	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

   
 
  

	

	
  
	
	


	
	
	


  


	
	

	
	



   
	 
	
	
	 
	
	

  
    
    
    
	
	

   
   

	

	




	
	

	
	

}
