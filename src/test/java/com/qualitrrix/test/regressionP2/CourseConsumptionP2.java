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

public class CourseConsumptionP2 {
	
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
	
	 @Test(enabled = true, groups = { "SanityTest",
     "FunctionalTest" }, alwaysRun = true, description = "TrainingSecForGstUsrs")
public void TrainingSecForGstUsrs() throws Exception {

 QXClient.get().driver();
 getDikshaMainPageActions().performUserOnBoarding();
 DikshaMainPageActions d = new DikshaMainPageActions();

 getHomePageActions().tapOnTrainingTab();

 getHomePageActions().tapOnSearchIcon();
 getHomePageActions().enterTextInSearchBar("Course");

 QXClient.get().gestures().clkBackButton();
 QXClient.get().gestures().BlindWait(1000);

 getHomePageActions().tapOnProfileTab();
 QXClient.get().gestures().BlindWait(1000);
 QXClient.get().gestures().closeApp();
 d.LaunchAppHomeScreen();

 getHomePageActions().tapOnTrainingTab();

 getHomePageActions().tapOnSearchIcon();
 getHomePageActions().verifyRecentlySearchedKeyword();

}

	    @Test()
	    public void verifyUserAbleToIdentifySearchedCourseInTheSearchList() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnDownloadTab();
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

	        //getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("AutomationContentDetailsCourse");

	        getTrainingPageActions().verifySearchCourseIsDisplayedForUser();

	    }

	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			  true, description = "Switch User In Menu")
			  public void SwitchUser() throws Exception {

		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		 getHomePageActions().tapOnProfileTab();
		 QXClient.get().gestures().swipeUp();
		 QXClient.get().gestures().swipeUp();


		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				 properties.getProperty("excelpath"));

		 String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		 QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		 String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		 String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);

		 getLoginPageActions().loginToTheUser(Username,Password);


		  DikshaMainPageActions d=new DikshaMainPageActions();
		  QXClient.get().gestures().closeApp();  
		    d.LaunchAppHomeScreen();
		    QXClient.get().gestures().BlindWait(4000);
			  getHomePageActions().tapOnDownloadTab();
		  
		  
		 getHomePageActions().tapOnMenuBar();

		 getCoursePageActions().tapOnMoreOption();
		 getCoursePageActions().clickFirstUser();
		 getCoursePageActions().tapOnChangeUser();
		 getCoursePageActions().CheckTermsCheckBoxORClickProfile();
		 getCoursePageActions().verifyDistricAndState();
			  
			  }
	 @Test()
	    public void verifyMainUserProfileShouldNotAffectPostSwitchUserUpdatesTheRoleInProfile() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));
	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",89,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",90,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username,Password);

	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        QXClient.get().gestures().BlindWait(4000);
	        getHomePageActions().verifySectionsInHomePage();

	        //getHomePageActions().tapOnDownloadTab();
	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnAddAnotherUser();

	        String FakeName=QXClient.get().gestures().generateRandomName();
	        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	        System.out.println(storeFakeNameEntered);
	        getCoursePageActions().tapOnAddUserBtn();
	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnMoreOption();
	        QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);

	        getCoursePageActions().tapOnChangeUserWithoutProfile();

	        getCoursePageActions().tapOnTermsAndCondition();

	        getCoursePageActions().tapOnContinueForSwicthUser();

	        d.LaunchAppHomeScreen();
	        getHomePageActions().verifySectionsInHomePage();

	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnProfileTab();
	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().updateSwitchedUserRole();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().changeToOldUserFromSwitchedUser();

	        getHomePageActions().verifySectionsInHomePage();


	    }


	 
	    @Test()
	    public void validateNoYOBPopupForAnyUser() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);

	        getLoginPageActions().loginToTheUser(Username,Password);
	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();


	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnMoreOption();
	        getCoursePageActions().clickFirstUser();
	        getCoursePageActions().tapOnChangeUserWithoutProfile();
	        getCoursePageActions().CheckTermsCheckBoxORClickProfile();

	        getProfileEditPageActions().verifyNoYOBpopupForAnyUser();


	    }
	    @Test()
	    public void AddUserLimitMsg() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);
//		  DikshaMainPageActions d=new DikshaMainPageActions();
	//
//		  QXClient.get().gestures().closeApp();
//		    d.LaunchAppHomeScreen();
	        // getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().verifyAddAnotherUserIsDisplayed();
	        getCoursePageActions().tapOnAddAnotherUser();


	        String FakeName=QXClient.get().gestures().generateRandomName();
	        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	        System.out.println(storeFakeNameEntered);
	        getCoursePageActions().tapOnAddUserBtn();
	        getCoursePageActions().verifyMsgAddingUser();

	    }

	   
	    @Test()
	    public void verifyMUAUsersInMoreButtonInHamburgerMenu() throws Exception {

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

	        getHomePageActions().verifyMoreButtonInHamburgerMenuAndUsersList();

	    }
	  @Test()
	    public void verifyLIUAAbleToAccessAllMUAAccountsInUsersList() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",95,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",96,2);

	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnMoreOption();
	        getCoursePageActions().clickFirstUser();
	        getCoursePageActions().tapOnChangeUser();
	        getCoursePageActions().CheckTermsCheckBoxORClickProfile();
	        getCoursePageActions().verifyDistricAndState();
	        getProfileEditPageActions().verifyLIUAShouldBeAbleToAccessAllMUAAccounts();

	    }

	 @Test()
	    public void validateAddUserButtonIsDisplayedInCamelCasing() throws Exception {

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

	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        QXClient.get().gestures().BlindWait(4000);
	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnAddAnotherUser();

	        String FakeName=QXClient.get().gestures().generateRandomName();
	        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	        System.out.println(storeFakeNameEntered);

	        getHomePageActions().verifyCamelCasingDisplayedForAddUserBtn();


	    }


	 
	  @Test(enabled = true, groups = { "SanityTest",
      "FunctionalTest" }, alwaysRun = true, description = "SngleBatchVerification")
public void SngleBatchVerification() throws Exception {

  QXClient.get().driver();
  getDikshaMainPageActions().performUserOnBoarding();
  getHomePageActions().tapOnProfileTab();
  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
          properties.getProperty("excelpath"));

  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
  String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);


  QXClient.get().gestures().swipeUp();
  QXClient.get().gestures().swipeUp();
  getLoginPageActions().loginToTheUser(Username,Password);

  DikshaMainPageActions d=new DikshaMainPageActions();
  QXClient.get().gestures().closeApp();
  d.LaunchAppHomeScreen();
  getHomePageActions().tapOnDownloadTab();

  getHomePageActions().tapOnTrainingTab();

  getHomePageActions().tapOnSearchIcon();
  getHomePageActions().enterTextInSearchBar(coursefetch);
  // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

  getTrainingPageActions().tapOnSearchedCourse1();
  getTrainingPageActions().tapOnJoinTraining2();





  getLibraryPageActions().tapOnShareBtn();


}
	  
	  
	  @Author(name="Raju")

	    @Test() public void AddUsers() throws Exception {

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

	        DikshaMainPageActions d=new DikshaMainPageActions();

	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();


	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnAddAnotherUser();

	        String FakeName=QXClient.get().gestures().generateRandomName();
	        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	        System.out.println(storeFakeNameEntered);
	        getCoursePageActions().tapOnAddUserBtn();
	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnMoreOption();
	        QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


	        getCoursePageActions().tapOnChangeUserWithoutProfile();

	        getCoursePageActions().tapOnTermsAndCondition();

	        getCoursePageActions().tapOnContinueForSwicthUser();


	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnProfileTab();
	        getHomePageActions().tapOnProfileTab();


	        getCoursePageActions().verifyDistricAndState();

	        getCoursePageActions().verifyBMCValuesAfterAddingUser();
	        //getCoursePageActions().updateStateAndDistrictValues();

	        //getCoursePageActions().updateProfileDetails();


	    }

	  @Test()
	    public void verifyUserValidatedProfileDetailsInPopupPostClickingJoinCourseBtn () throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
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
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar("CourseContent");

	        getTrainingPageActions().tapOnSearchedCourse6();
	        getTrainingPageActions().verifyConsentPopUpForCourse();

	        getTrainingPageActions().leaveCourse();

	    }

	  
	@Test()
    public void verifyMaximumAttemptsCrossedMessageInLimitedAttemptQuestionSet() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
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
        String limitedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 121,2);
        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnAddAnotherUser();

        String FakeName=QXClient.get().gestures().generateRandomName();
        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
        System.out.println(storeFakeNameEntered);
        getCoursePageActions().tapOnAddUserBtn();
        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnMoreOption();
        QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


        getCoursePageActions().tapOnChangeUserWithoutProfile();

        getCoursePageActions().tapOnTermsAndCondition();

        getCoursePageActions().tapOnContinueForSwicthUser();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(limitedCourse);

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

    }

	@Test()
    public void verifyExpiredCourseInMylearingSectionOfHomePageAndProfilePage() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 77, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 78, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().verifyExpiredCourseInMyLearningSectionOfHomePageAndVerifyExpiredMsg();

        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        getHomePageActions().verifyExpiredCourseInProfiePageAndVerifyExpiredMsg();

    }

	
	 @Test()
	    public void verifyNoJoinCourseButtonForExpiredCourse() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().verifyExpiredCourseInCourseTOC();


	    }
	@Test()
    public void verifyUserAbleToConsumeAlreadyJoinedCourseAndBatchExpired() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 122, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",123,2);
        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);

        getTrainingPageActions().tapOnAlreadyJoinedCourse();

        getTrainingPageActions().verifyUserAbleToConsumeCourseForAlreadyJoinedBatch();

    }


	@Test()
    public void verifyEnrollmentEndDatePassedMsgInCourse() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
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
        String course = QXClient.get().excelUtils().getCellValue("Excel1","TestData",99,2);
        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(course);

        getTrainingPageActions().tapOnEnrollmentEndedCourse();

        getTrainingPageActions().verifyEnrollmentEndedMsgAndNoBatchesAvailableMsg();


    }
	

	@Test()
    public void verifyNoBatchesAvailableMessageInAlreadyJoinedCourseAndBatchExpired() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
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
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutomationExpiredCourse");

        getTrainingPageActions().tapOnSearchedExpiredCourse();

        getTrainingPageActions().verifyCourseWithEnrollmentEndDateIsOver();

    }


	 @Test()
	    public void verifyUserAbleToSeeFutureBatchPopupPostClickingJoinCourseBtn() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
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
	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",126,2);
	        getLoginPageActions().loginToTheUser(Username, Password);
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnExpiredAndFutureBatchCourse();

	        getTrainingPageActions().verifyFututeBatchPopupPostClickingJoinCourseBtn();

	    }

	 @Test()
	    public void verifyUpcomingBatchDetailsMessageInCourse() throws Exception {

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

	        //getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("UpcomingCourse");
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("UpcomingCourse");
	        getTrainingPageActions().tapOnSearchedCourse5();
	        getTrainingPageActions().verifyUpcomingBatchMessageWhileJoinCourse();


	    }
	
	@Test()
    public void verifyOngoingBatchesInACourseWithMultipleOngoingbatches() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String MultipleBatchCourse = QXClient.get().excelUtils().getCellValue("Excel1","TestData",74,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar(MultipleBatchCourse);

        getTrainingPageActions().tapOnMultipleBatchCourse();

        getTrainingPageActions().verifyListOfBatchesInCourseWhichIsHavingMultipleBatches();

    }


	
	@Test()
	public void verifyConsentPopUpIsDisplayedForCourseAndTraceableCollection() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().enterTextInSearchBar("CourseContent");

		getTrainingPageActions().tapOnSearchedCourse6();
		getTrainingPageActions().verifyConsentPopUpForCourse();

		getTrainingPageActions().leaveCourse();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().enterTextInSearchBar("Umesh trackable collection");

		getTrainingPageActions().tapOnSearchedCourse7();
		getTrainingPageActions().verifyConsentPopupForCollection();

	}
	
	@Test()
    public void verifyProfileSharingInfoDetailsAndConsentFlagInCourseTOC() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        DikshaMainPageActions d=new DikshaMainPageActions();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",134, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",135, 2);
        //String course = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 97, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnAddAnotherUser();

        String FakeName=QXClient.get().gestures().generateRandomName();
        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
        System.out.println(storeFakeNameEntered);
        getCoursePageActions().tapOnAddUserBtn();
        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnMoreOption();
        QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


        getCoursePageActions().tapOnChangeUserWithoutProfile();

        getCoursePageActions().tapOnTermsAndCondition();

        getCoursePageActions().tapOnContinueForSwicthUser();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutoSmallCourseWithCertificate");

        getTrainingPageActions().tapOnSearchedSmallCertificateCourse();

        getTrainingPageActions().tapOnJoinTraining3();

        getTrainingPageActions().leaveCourse();

        getTrainingPageActions().verifyProfileSharingInfoIsDisplayedInCourseTOC();

        getTrainingPageActions().verifyProfileSharingInfoPostConsumingCourseFully();


    }
	
	  @Author(name="Raju")

	    @Test() public void SwitchUserLIUAAndMUA() throws Exception {

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

	        DikshaMainPageActions d=new DikshaMainPageActions();

	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();


	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnAddAnotherUser();

	        String FakeName=QXClient.get().gestures().generateRandomName();
	        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	        System.out.println(storeFakeNameEntered);
	        getCoursePageActions().tapOnAddUserBtn();
	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnMoreOption();
	        QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


	        getCoursePageActions().tapOnChangeUserWithoutProfile();

	        getCoursePageActions().tapOnTermsAndCondition();

	        getCoursePageActions().tapOnContinueForSwicthUser();


	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnProfileTab();
	        getHomePageActions().tapOnProfileTab();


	        getCoursePageActions().verifyDistricAndState();

	        getCoursePageActions().verifyBMCValuesAfterAddingUser();
	        //	getCoursePageActions().updateStateAndDistrictValues();

	        //	getCoursePageActions().updateProfileDetails();


	    }
	@Test()
	public void verifyCompletedCourseAndNoCertificateMsg() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		DikshaMainPageActions d = new DikshaMainPageActions();

		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
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

		getCoursePageActions().tapOnChangeUserWithoutProfile();

		getCoursePageActions().tapOnTermsAndCondition();

		getCoursePageActions().tapOnContinueForSwicthUser();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
		// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small
		// AutomationCourseContent");
		getTrainingPageActions().tapOnSearchedSmallCourse();
		getTrainingPageActions().verifyCourseCompletedMsgWithoutCertificate();

	}

  
    @Test()
    public void verifyConsumedTrackableCourseUnderNonTrackableCollectionIsDisplayedInLibraryPage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",120,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);
        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnAddAnotherUser();

        String FakeName=QXClient.get().gestures().generateRandomName();
        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
        System.out.println(storeFakeNameEntered);
        getCoursePageActions().tapOnAddUserBtn();
        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnMoreOption();
        QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


        getCoursePageActions().tapOnChangeUserWithoutProfile();

        getCoursePageActions().tapOnTermsAndCondition();

        getCoursePageActions().tapOnContinueForSwicthUser();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar(coursefetch);

        getTrainingPageActions().tapOnNonTrackableCollection();

        getTrainingPageActions().consumeNonTrackableCollection();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnProfileTab();
        getProfileEditPageActions().verifyTrackableCourseUnderMyLearningSection();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyTrackableCourseUnderMyLearningInHomePage();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyTrackableCourseUnderContinueLearningSectionInLibraryPage();

    }
    @Test()
    public void verifyConsumedTrackableCollectionUnderNonTrackableCollectionIsDisplayedUnderContinueLearningSection() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",120,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);
        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnAddAnotherUser();

        String FakeName=QXClient.get().gestures().generateRandomName();
        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
        System.out.println(storeFakeNameEntered);
        getCoursePageActions().tapOnAddUserBtn();
        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnMoreOption();
        QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


        getCoursePageActions().tapOnChangeUserWithoutProfile();

        getCoursePageActions().tapOnTermsAndCondition();

        getCoursePageActions().tapOnContinueForSwicthUser();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar(coursefetch);

        getTrainingPageActions().tapOnNonTrackableCollection();

        getTrainingPageActions().consumeNonTrackableCollection();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnProfileTab();
        getProfileEditPageActions().verifyTrackableCourseUnderMyLearningSection();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyTrackableCourseUnderMyLearningInHomePage();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyTrackableCourseUnderContinueLearningSectionInLibraryPage();

    }
	  @Test()
	    public void noProfileNameChangePopupWhileConsumingCourseWhenLoggedInWithSSOUser() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String externalID =QXClient.get().excelUtils().getCellValue("Excel1","TestData",92,2);
	        String course =QXClient.get().excelUtils().getCellValue("Excel1","TestData",124,2);
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);
	        d.LaunchAppHomeScreen();
	        QXClient.get().gestures().BlindWait(5000);
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(course);
	        getTrainingPageActions().tapOnSearchedCourse10();

	        getTrainingPageActions().verifyNoProfileNameChangePopupInCourseForSSO();

	        getTrainingPageActions().leaveCourse();

	    }
		@Test()
		public void verifyEarnCertificateAndRulesToEarnCertificateInCourseTOC() throws Exception {

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
			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();

			getLoginPageActions().loginToTheUser(Username, Password);

			// getHomePageActions().tapOnTrainingTab();
			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar("Cert Course 4.5");
			// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Cert
			// Course 4.5");
			getTrainingPageActions().tapOnSearchedCourse8();
			getTrainingPageActions().verifyEarnCertificateInCourseTOC();

		}


		@Test()
		public void verifyCertificateDownloadingToastMessage() throws Exception {
			QXClient.get().driver();
			DikshaMainPageActions d = new DikshaMainPageActions();
			getDikshaMainPageActions().performUserOnBoarding();
			getHomePageActions().tapOnProfileTab();
			Properties properties = QXClient.get().propUtils()
					.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" + properties.getProperty("excelpath"));
			String fetchExcelPathFromConfig = properties.getProperty("excelpath");
			QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();
			getLoginPageActions().loginToTheUser(Username, Password);
			QXClient.get().gestures().closeApp();
			d.LaunchAppHomeScreen();
		//	getHomePageActions().tapOnDownloadTab();
			getHomePageActions().tapOnProfileTab();
			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();

			getHomePageActions().verifyCertificateToastMessage();

		}

		@Test()
		public void verifyNoEarnCertificateFieldInCourseTOCPage() throws Exception {

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
			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();

			getLoginPageActions().loginToTheUser(Username, Password);

			// getHomePageActions().tapOnTrainingTab();
			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar("CourseContent");
			// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
			getTrainingPageActions().tapOnSearchedCourse6();
			getTrainingPageActions().verifyNoEarnCertificateInCourseTOC();

		}

		
	  
	  @Test()
	    public void verifyCertificateCriteriaLabelInCertificateAttachedCourseTOC() throws Exception {

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

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("Cert Course 4.5");

	        getTrainingPageActions().tapOnSearchedCourse8();
	        getTrainingPageActions().verifyEarnCertificateInCourseTOC();
	        getTrainingPageActions().verifyCertificateCriteriaLabelInCourseTOCPostJoining();
	        getTrainingPageActions().leaveCourse();

	    }


	  @Test()
	    public void verifyUserAbleToSeeProfileNameChangePopupPostClickingStartLearningBtnInTrackableCollection() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",119,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnCertificateTrackableCollection();

	        getTrainingPageActions().verifyProfileNameChangePopupInCourseTOC();

	        getTrainingPageActions().verifyUserNavigatedToProfilePagePostClickingTheLink();

	        getTrainingPageActions().leaveCourse();

	    }

	  @Test()
	    public void verifyUserAbleToSeeProfileNameChangePopupPostClickingStartLearningBtnInTrackableBook() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",118,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnCertificateTrackableBook();

	        getTrainingPageActions().verifyProfileNameChangePopupInCourseTOC();

	        getTrainingPageActions().verifyUserNavigatedToProfilePagePostClickingTheLink();

	        getTrainingPageActions().leaveCourse();

	    }


		@Test()
	    public void verifyProfileNamePopupWhileConsumingCertificateCourse() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",81,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnCertificateCourse();

	        getTrainingPageActions().verifyProfileNameChangePopupInCourseTOC();

	        getTrainingPageActions().verifyUserNavigatedToProfilePagePostClickingTheLink();

	        getTrainingPageActions().leaveCourse();

	    }

 


    @Test()
    public void verifyProfileNameChangePopupIsNotDisplayedForTrackableColletionWithoutCertificate () throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
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

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("Umesh trackable collection");

        getTrainingPageActions().tapOnSearchedCourse7();

        getTrainingPageActions().verifyNoProfileNameChangePopupInTrackableCollection();

        getTrainingPageActions().leaveCourse();

    }
    @Test()
    public void verifyLabelsForTrackableCollections() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" + properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

        getHomePageActions().verifyLabelsForTrackableCollections();

    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Guest user is able UnEnroll from Course.")
    public void verifyLeaveTraining() throws Exception {


        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);

        getLoginPageActions().loginToTheUser(Username,Password);

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
        getTrainingPageActions().tapOnSearchedCourse1();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().leaveCourse();
    }

	 @Test()
	    public void verifyUserAbleToClickMoreBtnAndScrollTillEndInCourseAndMyLearningSections() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 95, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 96, 2);

	        getLoginPageActions().loginToTheUser(Username, Password);
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnTrainingTab();

	        getTrainingPageActions().verifyUserAbleToScrollTillEndInViewMoreOptionInCourseSection();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnProfileTab();
	        getProfileEditPageActions().verifyUserAbleToScrollTillEndInViewMoreOptionInMyLearningSection();

	    }
	@Test()
	public void verifyLoadingScreenIsDisplayedToUserPostClickingNextButton() throws Exception {

	    QXClient.get().driver();
	    getDikshaMainPageActions().performUserOnBoarding();
	    DikshaMainPageActions d = new DikshaMainPageActions();
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
	    String limitedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 121,2);
	    getLoginPageActions().loginToTheUser(Username, Password);

	    getHomePageActions().tapOnMenuBar();

	    getCoursePageActions().tapOnAddAnotherUser();

	    String FakeName = QXClient.get().gestures().generateRandomName();
	    String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
	    System.out.println(storeFakeNameEntered);
	    getCoursePageActions().tapOnAddUserBtn();
	    getHomePageActions().tapOnMenuBar();

	    getCoursePageActions().tapOnMoreOption();
	    QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


	    getCoursePageActions().tapOnChangeUserWithoutProfile();

	    getCoursePageActions().tapOnTermsAndCondition();

	    getCoursePageActions().tapOnContinueForSwicthUser();
	    d.LaunchAppHomeScreen();

	    getHomePageActions().tapOnTrainingTab();

	    getHomePageActions().tapOnSearchIcon();
	    getHomePageActions().enterTextInSearchBar(limitedCourse);

	    getTrainingPageActions().tapOnQuestionSetCourse();

	    getTrainingPageActions().tapOnJoinTraining2();

	    getTrainingPageActions().verifyNextContentAtTheEndOfTheQuestionSet();

	}

	@Test()
    public void verifyCourseProgressIsDisabledInCourseCard () throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
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
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");

        getTrainingPageActions().verifyCourseProgressIsDisabledInCourseCard();

    }

	@Test()
	public void verifyUserAbleToJoinCoursePostClickingJoinCourseBtnForAlreadyCreatedUpcomingBatchCourse() throws Exception {

	    QXClient.get().driver();
	    DikshaMainPageActions d=new DikshaMainPageActions();
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
	    QXClient.get().gestures().closeApp();
	    d.LaunchAppHomeScreen();

	    getHomePageActions().tapOnTrainingTab();

	    getHomePageActions().tapOnSearchIcon();
	    getHomePageActions().enterTextInSearchBar("CourseWithUpcomingBatch");

	    getTrainingPageActions().tapOnUpcomingBatchCourse();

	    getTrainingPageActions().verifyUserAbleToJoinCoursePostClickingJoinCourseBtnInUpcomingBatchCourse();

	    getTrainingPageActions().leaveCourse();

	}

	@Test()
    public void verifyConsentPopupDisplayedOncePostRelauchAppAndConsumeSameCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String CourseName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",48,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(CourseName);

        getTrainingPageActions().tapOnSearchedCourse2();

        getTrainingPageActions().verifyConsentPopUpForCourse1();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(CourseName);

        getTrainingPageActions().tapOnSearchedCourse2();

        getTrainingPageActions().verifyNoConsentPopupPostRelaunchApp();

        getTrainingPageActions().leaveCourse();


    }



    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "AnonymousUserFilterApplyInTrainingTab")
    public void AnonymousUserFilterApplyInTrainingTab() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        // getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Course");

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().BlindWait(1000);

        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().verifyRecentlySearchedKeyword();

    }
	 @Test(enabled = true, groups = { "SanityTest",
     "FunctionalTest" }, alwaysRun = true, description = "anonymousUserAbleToSearchCourse")
public void anonymousUserAbleToSearchCourse() throws Exception {

 QXClient.get().driver();
 getDikshaMainPageActions().performUserOnBoarding();
 getHomePageActions().tapOnProfileTab();
 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
         properties.getProperty("excelpath"));

 String fetchExcelPathFromConfig=properties.getProperty("excelpath");
 QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

 String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
 String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
 String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
 String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);


 QXClient.get().gestures().swipeUp();
 QXClient.get().gestures().swipeUp();
 getLoginPageActions().loginToTheUser(Username,Password);

 DikshaMainPageActions d=new DikshaMainPageActions();
 QXClient.get().gestures().closeApp();
 d.LaunchAppHomeScreen();
 getHomePageActions().tapOnDownloadTab();

 getHomePageActions().tapOnTrainingTab();

 getHomePageActions().tapOnSearchIcon();
 getHomePageActions().enterTextInSearchBar(coursefetch);
 // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

 getTrainingPageActions().tapOnSearchedCourse1();

}

    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "RecentlySearchedKeyWorkdVerify")
    public void RecentlySearchedKeyWorkdVerify() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Course");

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().BlindWait(1000);

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().verifyRecentlySearchedKeyword();

    }
	 

	 @Test()
	    public void verifyUserAbleToEnrollCourseFromCourseTOCWthNewUser() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnTrainingTab();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("AutomationContentCourse");
	        getTrainingPageActions().tapOnSearchedAutomationContentCourse();

	        getTrainingPageActions().verifyLoginPopUpWhileJoinCourse();
	        getTrainingPageActions().verifyClickLoginBtnInPopup();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

	        getLoginPageActions().tapOnLoginBtnInCourseTab(Username,Password);

	        getTrainingPageActions().verifyUserAbleToJoinCourseSuccessfully();

	        getTrainingPageActions().leaveCourse();

	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

	
    @Test()
    public void validateCourseTextInsteadOfTrainingText () throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 49, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 50, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnTrainingTab();

        getTrainingPageActions().verifyCoursesInsteadOfTraining();

    }

	
	
    @Test()
    public void verifyCourseAssessmentBestScoreWithEnrollmentEndDatePassed() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Login", 5, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Login", 6, 2);
        //String CourseName = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 2, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("26th April with assessment");
        getTrainingPageActions().tapOnSearched26thAprilWithAssessment();
        getTrainingPageActions().verifyConsumeCourseAssesment();
    }

  
    @Test()
    public void verifyBestScoreNotBeDisplayedForNotAttemptedAssessment() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Login", 7, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Login", 8, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();
        getTrainingPageActions().tapOnCourseWithAssessmentsUnderMyCourse();
        getTrainingPageActions().verifyCourseAssesmentBestScoreNotBeDisplayedForNotAttemptedAssessment();
    }

    @Test
	public void ValidateDownloadDeleteSAndShareButtons() throws Exception {
		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 60, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 61, 2);

		String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 62, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);
		DikshaMainPageActions d = new DikshaMainPageActions();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(course_id);

		getHomePageActions().validateDownloadbtn();
		getHomePageActions().validateDeletebtn();

		getHomePageActions().validateCourseCompletionMessage();

	}
    
    @Test()
	public void VerifyPostClickingonAddUserShouldNavigatetoChooseUsersPage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);


		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().ValidateChooseUsersPage();

	}
    
    @Test()
    public void coursesharemessage() throws Exception {

            QXClient.get().driver();

            getDikshaMainPageActions().performUserOnBoarding();
            getHomePageActions().tapOnProfileTab();

            Properties properties = QXClient.get().propUtils()
                            .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" + properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 11, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 12, 2);

            String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 14, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            getHomePageActions().tapOnMenuBar();

            getCoursePageActions().tapOnAddAnotherUser();

            String FakeName = QXClient.get().gestures().generateRandomName();
            String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
            System.out.println(storeFakeNameEntered);
            getCoursePageActions().tapOnAddUserBtn();

            QXClient.get().gestures().closeappandrelaunchapp();
            getHomePageActions().tapOnMenuBar();

            getCoursePageActions().tapOnMoreOption();
            QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


            getCoursePageActions().tapOnChangeUserWithoutProfile();

            getCoursePageActions().tapOnTermsAndCondition();

            getCoursePageActions().tapOnContinueForSwicthUser();

            QXClient.get().gestures().closeappandrelaunchapp();

            getHomePageActions().tapOnTrainingTab();
            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(course_id);
            // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
            getTrainingPageActions().tapCoursharepopup();

    }
    
    @Test()
    public void coursekebabmenu() throws Exception {

            QXClient.get().driver();

            getDikshaMainPageActions().performUserOnBoarding();
            getHomePageActions().tapOnProfileTab();

            Properties properties = QXClient.get().propUtils()
                            .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" + properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 11, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 12, 2);

            String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 14, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            getHomePageActions().tapOnMenuBar();

            getCoursePageActions().tapOnAddAnotherUser();

            String FakeName = QXClient.get().gestures().generateRandomName();
            String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
            System.out.println(storeFakeNameEntered);
            getCoursePageActions().tapOnAddUserBtn();

            QXClient.get().gestures().closeappandrelaunchapp();
            getHomePageActions().tapOnMenuBar();

            getCoursePageActions().tapOnMoreOption();
            QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


            getCoursePageActions().tapOnChangeUserWithoutProfile();

            getCoursePageActions().tapOnTermsAndCondition();

            getCoursePageActions().tapOnContinueForSwicthUser();

            QXClient.get().gestures().closeappandrelaunchapp();

            getHomePageActions().tapOnTrainingTab();
            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(course_id);
            // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
            getTrainingPageActions().tapCoursekebabmenu();


    }
    @Test()
	public void verifyCourseProgressGetUpdatedForMP4() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3, 2);
		String Automationcoursemp4video = QXClient.get().excelUtils().getCellValue("Excel1","CourseConsumption",65,2);
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeappandrelaunchapp();

		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnAddAnotherUser();

		String FakeName=QXClient.get().gestures().generateRandomName();
		String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
		System.out.println(storeFakeNameEntered);
		getCoursePageActions().tapOnAddUserBtn();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		QXClient.get().gestures().BlindWait(5000);
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().BlindWait(2000);
		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnMoreOption();
		QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


		getCoursePageActions().tapOnChangeUserWithoutProfile();

		getCoursePageActions().tapOnTermsAndCondition();

		getCoursePageActions().tapOnContinueForSwicthUser();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(Automationcoursemp4video);
		getTrainingPageActions().tapOnCourseMp4();

		getTrainingPageActions().verifyCourseProgressGetUpdatedForMP4();


	}
    
    @Test()
	public void VerifySunbirdIDIsDisplayedWithTwoCharacter() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		getLoginPageActions().loginToTheUser(Username, Password);
	        getHomePageActions().tapOnMenuBar();
	        getCoursePageActions().tapOnAddAnotherUser();
	        getCoursePageActions().tapOnAddUserBtn2();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        QXClient.get().gestures().BlindWait(2000);
	        getHomePageActions().tapOnMenuBar();
	        getCoursePageActions().tapOnMoreOption();
	        getCoursePageActions().tapOnAddedUser2();
	        getHomePageActions().VerifySunbirdIDIsDisplayedWithTwoCharacter();
}
    
    @Test()
	public void verifyUnableToJoinCourseForFutureBatch() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		String AutomationCourseFuturedate = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 64, 2);

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(AutomationCourseFuturedate);
		getTrainingPageActions().tapOnSearchedcoursewithfuturedate();
		getHomePageActions().verifyUnableToJoinCourseForFutureBatch();


	}
    
    @Test()
    public void verifyTrackableCollectionOrganisedBasedOnLastDateOfAccessingInContinueLearningSection() throws Exception {

    	QXClient.get().driver();
    	DikshaMainPageActions d = new DikshaMainPageActions();
    	getDikshaMainPageActions().performUserOnBoarding();
    	getHomePageActions().tapOnProfileTab();


    	Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
    	System.out.println("@name:" +
    			properties.getProperty("excelpath"));

    	String fetchExcelPathFromConfig = properties.getProperty("excelpath");
    	QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

    	String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 58, 2);
    	String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 52, 2);
    	QXClient.get().gestures().swipeUp();
    	QXClient.get().gestures().swipeUp();

    	getLoginPageActions().loginToTheUser(Username, Password);

    	d.LaunchAppHomeScreen();

    	getHomePageActions().verifyTrackableCollectionOrganisedBasedOnLastDateOfAcessingInContinueLearningSection();

    }
    
    @Test()
	public void verifyCourseProgressShouldNotUpdateForEpubContentForPartiallyConsuming() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		DikshaMainPageActions d=new DikshaMainPageActions();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 44, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 45, 2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",46,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnAddAnotherUser();

		String FakeName=QXClient.get().gestures().generateRandomName();
		String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
		System.out.println(storeFakeNameEntered);
		getCoursePageActions().tapOnAddUserBtn();
		QXClient.get().gestures().closeappandrelaunchapp();

		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnMoreOption();
		QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


		getCoursePageActions().tapOnChangeUserWithoutProfile();

		getCoursePageActions().tapOnTermsAndCondition();

		getCoursePageActions().tapOnContinueForSwicthUser();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);
		QXClient.get().gestures().swipeUp();

		getTrainingPageActions().tapOnAutomationEpubCourse();

		getTrainingPageActions().verifyCourseProgressShouldNotUpdateForEpubContentForPartiallyConsuming();
	}

    @Test()
	    public void verifyUserAbleToSearchAndConsumeTheTVLessonAfterAppliedTVClassFilters() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 57, 2);
	        String Password ="Test@123";

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().verifyTVLessonContentAfterAppliedTVClassFilters();

            getHomePageActions().verifyUserConsumeTvClassesContent();


	    }
    
    @Test()
    public void verifytrackablecollectiononorder() throws Exception {
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
        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 75, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 76, 2);
        String course1_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 69, 2);
        String course2_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 71, 2);
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);
        //getHomePageActions().tapOnHomeTab();
        QXClient.get().gestures().closeappandrelaunchapp();
        getHomePageActions().tapOnMenuBar();
        getCoursePageActions().tapOnNewDikshaExperience();
        getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(course1_id);
        getTrainingPageActions().newcollectionconsumeongoing();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(course2_id);
        getTrainingPageActions().tapOncontinuelearningcollectionnew();
        getTrainingPageActions().tapOncontinuelearningorder();
    }

}
