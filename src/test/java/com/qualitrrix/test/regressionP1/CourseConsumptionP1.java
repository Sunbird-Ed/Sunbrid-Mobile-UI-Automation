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

public class CourseConsumptionP1 {
	
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
    public void verifyUserAbleToConsumeOngoingBatchInExpiredCourse() throws Exception {

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

        //getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutomationExpiredCourse");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationExpiredCourse");
        getTrainingPageActions().tapOnSearchedExpiredCourse();
        getHomePageActions().verifyOngoingBatchInAlreadyExpiredCourse();

        getTrainingPageActions().leaveCourse();

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
    public void verifyLastAttemptLeftMessageWhileConsumingAnAssessment() throws Exception {

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
    public void verifyConsumedCourseOfParentIsNotDisplayedForChildUser() throws Exception {

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

        //getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();

        getCoursePageActions().tapOnOngoingCourse();

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        //getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnMoreOption();
        getCoursePageActions().clickFirstUser();
        getCoursePageActions().tapOnChangeUserWithoutProfile();
        getCoursePageActions().CheckTermsCheckBoxORClickProfile();
        d.LaunchAppHomeScreen();
        getCoursePageActions().verifyDistricAndState();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();

        getCoursePageActions().verifyNoCoursesInMylearnigSection();

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
    public void verifyOngoingAndCompletedCourseInProfilesection() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();


        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


        getLoginPageActions().loginToTheUser(Username,Password);

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();


        getHomePageActions().tapOnProfileTab();


        QXClient.get().gestures().swipeUp();

        getCoursePageActions().tapOnOngoingCourse();
        Thread.sleep(5000);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnProfileTab();



        getCoursePageActions().tapOnCompletedCourse();
        Thread.sleep(2000);

    }

	
	 @Test()
	    public void verifyUserShouldRedirectToOngoingCoursePostSearchAndClickCourse() throws Exception {

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

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("AutomationCourseForDF");

	        getTrainingPageActions().tapOnSearchedCourseForDF();

	        getTrainingPageActions().verifySearchedCourseNavigatedToOngoingCourse();

	    }

	 

	    @Test()
	    public void verifyUserAbleToConsumeOngoingCourseFromProfile() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);

	        getLoginPageActions().loginToTheUser(Username,Password);

	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnProfileTab();

	        QXClient.get().gestures().swipeUp();

	        getCoursePageActions().tapOnOngoingCourse();

	        
	    }
		 @Test()
		    public void verifyPageNotFoundErrorMessageInCourseWithPDFContent() throws Exception {

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
		        getHomePageActions().enterTextInSearchBar("AutoPDFCourse");

		        getTrainingPageActions().tapOnPDFCourse();

		        getTrainingPageActions().tapOnJoinTraining2();

		        getTrainingPageActions().verifyUserAbleToPlayPDFCourse();

		        getTrainingPageActions().verifyUserAbleToGoToNextPageThroughIndex();

		        getTrainingPageActions().verifyPageNotFoundMsgWhenUserEntersWrongPageNumber();

		    }
		 
		 
		 
	    
	    @Test()
	    public void verifyUserNavigatedToOpenBatchesDirectlyWithoutSeeingExpiredBatchPopup() throws Exception {

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
	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",125,2);
	        getLoginPageActions().loginToTheUser(Username, Password);
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnExpiredAndOngoingBatchCourse();

	        getTrainingPageActions().verifyNoPopUpIsDisplayedForExpiredBatchAndDirectlyNavigatesToOngoingBatch();

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
		public void verifyUserAbleToSeeBatchSelectionPopupForExpiredAndOngoingBatchCourse() throws Exception {

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

			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 122, 2);
			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
			String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 123, 2);
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
	    public void verifyUserNotAbleToSeeBatchSelectionPopUpForBatchEqualsOngoing() throws Exception {

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

	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);

	        getLoginPageActions().loginToTheUser(Username,Password);

	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnSearchedCourse1();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyUserNotAbleToSeeBatchSelectionPopup();

	        getTrainingPageActions().leaveCourse();
	    }
	    @Test()
	    public void validateUpcomingBatchMsgInCourse() throws Exception {

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
	    public void verifyResumeButtonInAlreadyJoinedBatchOfACourseAndProgressBarIsNotDisplayed() throws Exception {

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
	    public void verifyOngoingAndExpiredBatchesListInPopupPostClicingOnJoinCourseBtn () throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
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
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar("4.0 Course with expired batch1");

	        getTrainingPageActions().tapOnMultipleBatchCourse1();

	        getTrainingPageActions().verifyMultipleBatchesPopup();

	    }

	@Test()
    public void verifyCourseTOCPageMessagesForExpiredAndEnrollmentEndDateCourses() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().verifyEnrollmentEndDateUnderJoinTraining();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().verifyEnrollmentClosedInCourseTOC();

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().verifyExpiredCourseInCourseTOC();


    }

	@Test()
	public void validateSameCourseProgressAfterReEnrollingToCourse() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 49, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 50, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getTrainingPageActions().verifyCourseFromMyCourseSection();

		getTrainingPageActions().leaveCourse();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("do_2134299665410703361794");
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationContentCourse");

		getTrainingPageActions().enrollToSameCourseAndVerifyCourseProgressRemainsSame();

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
    public void verifyCourseEndDateAndEnrollmentEndDateInCourseDetailsPage() throws Exception {

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
        getHomePageActions().enterTextInSearchBar("SampleAutomationCourse");

        getTrainingPageActions().tapOnSearchedSampleAutomationCourse();

        getTrainingPageActions().verifyCourseEndDateAndEnrollmentEndDateInACourse();

    }


	
	 @Test()
	    public void verifyCreatorIsNotAbleToEnrollCourse() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
	        String coursefetch=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnTrainingTab();

	        getTrainingPageActions().verifyLoginBeforeCourseFetch();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnSearchedCourse1();
	        getTrainingPageActions().verifyLoginPopUpWhileJoinCourse();

	        getLoginPageActions().loginToTheUser(Username,Password);

	        getTrainingPageActions().verifyCreatorNotAbleToEnrollMessage();

	    }



	
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Verify UserAble to Download Book ")
	    public void verifyUserAbleToDownloadTheContent() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);


	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(BookName);
	        //  QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

	        getTrainingPageActions().tapOnSearchedBook();

	        getLibraryPageActions().tapOnDownloadBtn();
	        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
	        //getTrainingPageActions().verifyFileDownloadThroughNotification();
	        getTrainingPageActions().waitTillTheDownloadButtonDisappears();
	        QXClient.get().gestures().clkBackButton();
	        QXClient.get().gestures().clkBackButton();


	        getHomePageActions().tapOnDownloadTab();
	        getDownloadPageActions().verifyTheDownloadedBook();
	    }


	  @Test()
	    public void verifyUserIsNotAllowedToTakeMoreThanMaximumAttemptsSetInACourse() throws Exception {

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
	  public void verifyGreenTickMarkPostCompletingCourseUnitsInACourse() throws Exception {
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
	  	getHomePageActions().enterTextInSearchBar("AutoMultipleContentCourse");

	  	getTrainingPageActions().tapOnMultipleContentCourse();

	  	getTrainingPageActions().verifyGreenTickMarkPostCompletingFewContentsOfCourse();

	  }

	  @Test()
	  public void verifyUserAbleConsumePDFCourseTillLastPageAndProgressUpdated() throws Exception {
	      QXClient.get().driver();
	      getDikshaMainPageActions().performUserOnBoarding();
	      getHomePageActions().tapOnProfileTab();
	      DikshaMainPageActions d=new DikshaMainPageActions();


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
	      getHomePageActions().enterTextInSearchBar("AutoPDFCourse");

	      getTrainingPageActions().tapOnPDFCourse();

	      getTrainingPageActions().tapOnJoinTraining2();

	      getTrainingPageActions().verifyUserAbleToPlayPDFCourseTillEnd();

	  }
	  @Test()
	    public void verifyEnrolledCourseInHomePageAndProfilePageUnderMyLearningSection() throws Exception {

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
	         d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small AutomationCourseContent");
	        getTrainingPageActions().tapOnSearchedSmallCourse();

	        getTrainingPageActions().enrollToTheSmallCourse();
	        QXClient.get().gestures().closeApp();

	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();
	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().verifyCourseInProfileSectionUnderMyLearningSection();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().verifyEnrolledCourseInMyLearningSectionOfHomePage();

	    }
	  @Test()
		public void verifyCourseLastUpdatedMessageInCourseTOC() throws Exception {

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
			String  CourseName=QXClient.get().excelUtils().getCellValue("Excel1", "TestData",51,2);

			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();
			getLoginPageActions().loginToTheUser(Username,Password);

			getHomePageActions().tapOnTrainingTab();

			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar(CourseName);
			//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(CourseName);
	        getTrainingPageActions().tapOnUpdatedCourseContent();
			getTrainingPageActions().verifyCourseUpdatedMessageWithDate();

		}
	  @Test()
		public void verifySyncProgressNowPostCompletingTheCourse() throws Exception {
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

			// getHomePageActions().tapOnDownloadTab();

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
			QXClient.get().gestures().closeApp();
			d.LaunchAppHomeScreen();

			getHomePageActions().tapOnTrainingTab();

			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
			// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small
			// AutomationCourseContent");
			getTrainingPageActions().tapOnSearchedSmallCourse();
			getTrainingPageActions().verifyCourseCompletedMsgWithoutCertificate();

			QXClient.get().gestures().clkBackButton();

			getTrainingPageActions().verifySyncNowCourseProgressInCompletedCourse();

		}

	  @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "Course Share.")
		public void verifyCourseSharing() throws Exception {

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
			String LeaveCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 30, 2);
			String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 25, 2);

			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();
			getLoginPageActions().loginToTheUser(Username, Password);

			DikshaMainPageActions d = new DikshaMainPageActions();
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
			getLibraryPageActions().verifySharePopUI();
			getLibraryPageActions().tapOnShareBtnFrmSharePop();
			getLibraryPageActions().tapOnShareToWhatsApp();
			getLibraryPageActions().verifyWhatsAppHomePage();

		}
	   @Test()
	    public void verifyUserAbleToConsumeOngoingCourseFromMyCourseSection() throws Exception {

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

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 77, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 78, 2);

	        getLoginPageActions().loginToTheUser(Username, Password);

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnTrainingTab();

	        getTrainingPageActions().verifyOngoingCourseUnderMyCourseInTrainingTab();

	        getTrainingPageActions().verifyUserAbleToConsumeOngoingCourseOfMyCourseSection();

	    }
	   
	   @Test()
	    public void verifyNoteMessageShouldBeDisplayedPostCompletingTheCourseWithCertificate() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        DikshaMainPageActions d=new DikshaMainPageActions();


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

	        getTrainingPageActions().verifyUserAbleToConsumeCourseWithCertificate();


	    }
	   @Test()
	    public void verifyCourseCompletionMessageForCourseWithCertificate() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        DikshaMainPageActions d=new DikshaMainPageActions();


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

	        getTrainingPageActions().verifyUserAbleToConsumeCourseWithCertificate();


	    }
	   @Test()
		public void verifyDownloadBtnInCertificateSectionOfProfilePage() throws Exception {

			QXClient.get().driver();

			getDikshaMainPageActions().performUserOnBoarding();
			getHomePageActions().tapOnProfileTab();

			Properties properties = QXClient.get().propUtils()
					.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" + properties.getProperty("excelpath"));

			String fetchExcelPathFromConfig = properties.getProperty("excelpath");
			QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 49, 2);
			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 50, 2);
			QXClient.get().gestures().swipeUp();
			QXClient.get().gestures().swipeUp();

			getLoginPageActions().loginToTheUser(Username, Password);

			getHomePageActions().tapOnProfileTab();

			getProfileEditPageActions().verifyCertificateAndDownloadBtnInProfile();

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
	    public void nameChangePopupIsDisplayedForCustodianUser() throws Exception {
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
	    public void verifyEditIconIsDisplayedNextToProfileNameInProfileNameChangePopup() throws Exception {
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
	    public void verifyUserAbleToSeeProfileNameChangePopupPostClickingStartLearningBtnInCourse() throws Exception {
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
		    public void NoLeaveCourseForCompletedCourse() throws Exception {

		        QXClient.get().driver();
		        getDikshaMainPageActions().performUserOnBoarding();


		        getHomePageActions().tapOnProfileTab();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		                properties.getProperty("excelpath"));

		        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
		        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


		        getLoginPageActions().loginToTheUser(Username,Password);

		        DikshaMainPageActions d=new DikshaMainPageActions();
		        QXClient.get().gestures().closeApp();
		        d.LaunchAppHomeScreen();
		        getHomePageActions().tapOnDownloadTab();

		        getHomePageActions().tapOnProfileTab();

		        getCoursePageActions().tapOnCompletedCourse();

		        getTrainingPageActions().verifyNoLeaveCourseForCompletedCourse();


		    }

	

	 @Test()
	    public void verifyShareIconAndConsumeCourseAfterJoinCourse() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" + properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
	        String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 25, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
	        getTrainingPageActions().tapOnSearchedCourse1();

	        getLibraryPageActions().tapOnShareBtn();
	        getLibraryPageActions().tapOnShareBtnFrmSharePop();
	        getLibraryPageActions().tapOnShareToWhatsApp();
	        getLibraryPageActions().verifyWhatsAppHomePage();

	        getTrainingPageActions().verifyConsumeCourseAfterJoinCourse();
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

		

	 @Test(enabled = true, groups = { "SanityTest",
    "FunctionalTest" }, alwaysRun = true, description = "CourseTOCPageVerify")
public void CourseTOCPageVerify() throws Exception {

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
d.LaunchAppHomeScreen();

getHomePageActions().tapOnTrainingTab();

getHomePageActions().tapOnSearchIcon();
getHomePageActions().verifyRecentlySearchedKeyword();

}

	

    @Test()
    public void verifyCoursesBasedOnSubjectAndOthersGroup() throws Exception {
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

        DikshaMainPageActions d=new DikshaMainPageActions();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getTrainingPageActions().verifyCoursesBasedOnSubject();


    }
	

	@Test()
	public void AddActivitsInGroup() throws Exception {

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
		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().createGrupAndActivity();

	}

	@Test()
	public void verifyCourseHeaders() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().verifyMyCourseAndSubjectwiseCourses();

	}


	@Test(enabled = true, groups = { "SanityTest",
	"FunctionalTest" }, alwaysRun = true, description = "")
public void JoinTrainLoginPageHasGmailLogin() throws Exception {

QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();
getHomePageActions().tapOnTrainingTab();
getLoginPageActions().tapOnLoginBtnInTrainingTab();
getHomePageActions().verifySignInGoogleOption();

}
	
	 @Test()
	    public void verifyUserAbleToEnrollCourseFromCourseTOCWthOldUser() throws Exception {
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
	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);

	        getLoginPageActions().tapOnLoginBtnInCourseTab(Username,Password);

	        getTrainingPageActions().verifyUserAbleToJoinCourseSuccessfully();

	        getTrainingPageActions().leaveCourse();

	    }
	
   
	
	 @Test()
	 public void verifyBestScoreInAssessmentInCourseTOC() throws Exception {

	         QXClient.get().driver();
	         getDikshaMainPageActions().performUserOnBoarding();
	         getHomePageActions().tapOnProfileTab();
	         QXClient.get().gestures().swipeUp();
	         QXClient.get().gestures().swipeUp();
	         Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	         System.out.println("@name:" +properties.getProperty("excelpath"));
	         String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	         QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	         
	         String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 57, 2);
	         String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 58, 2);
	         String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",132,2);
	
	
	         getLoginPageActions().loginToTheUser(Username, Password);

	         DikshaMainPageActions d = new DikshaMainPageActions();
	         QXClient.get().gestures().closeApp();
	         d.LaunchAppHomeScreen();

	         getHomePageActions().tapOnTrainingTab();
	         getHomePageActions().tapOnSearchIcon();
	         getHomePageActions().enterTextInSearchBar(coursefetch);

	         QXClient.get().gestures().swipeUp();

	         getHomePageActions().tapOnCourseModulesInTOC();
	         getHomePageActions().tapOnFirstContentInCourseTOC();
	
	 }
	
	
	 @Test()
     public void bestscoreandmaxattemptretainedincourse() throws Exception {

             QXClient.get().driver();

             getDikshaMainPageActions().performUserOnBoarding();
             getHomePageActions().tapOnProfileTab();

             Properties properties = QXClient.get().propUtils()
                             .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
             System.out.println("@name:" + properties.getProperty("excelpath"));

             String fetchExcelPathFromConfig = properties.getProperty("excelpath");
             QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

             String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 138, 2);
             String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 139, 2);
             String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 137, 2);
             QXClient.get().gestures().swipeUp();
             QXClient.get().gestures().swipeUp();

             getLoginPageActions().loginToTheUser(Username, Password);

             //getHomePageActions().tapOnTrainingTab();
             //getHomePageActions().tapOncourseTab();
             getHomePageActions().tapOnSearchIcon();
             getHomePageActions().enterTextInSearchBar(course_id);
             //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
             getTrainingPageActions().tapOnSearchedCourseexpired();

     }
	
	    @Test()
        public void  userenrolsandconsumthecourse() throws Exception {

                QXClient.get().driver();

                getDikshaMainPageActions().performUserOnBoarding();
                getHomePageActions().tapOnProfileTab();

                Properties properties = QXClient.get().propUtils()
                                .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
                System.out.println("@name:" + properties.getProperty("excelpath"));

                String fetchExcelPathFromConfig = properties.getProperty("excelpath");
                QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

                String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 142, 2);
                String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 143, 2);

                String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 141, 2);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().swipeUp();

                getLoginPageActions().loginToTheUser(Username, Password);

                getHomePageActions().tapOnTrainingTab();
                getHomePageActions().tapOnSearchIcon();
                getHomePageActions().enterTextInSearchBar(course_id);
                // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
                getTrainingPageActions().tapCourseongoing();

        }
        
        
        
        @Test()
        public void oldcertificateviewanddownloadincourse () throws Exception {

                QXClient.get().driver();

                getDikshaMainPageActions().performUserOnBoarding();
                getHomePageActions().tapOnProfileTab();

                Properties properties = QXClient.get().propUtils()
                                .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
                System.out.println("@name:" + properties.getProperty("excelpath"));

                String fetchExcelPathFromConfig = properties.getProperty("excelpath");
                QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

                String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 147, 2);
                String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 148, 2);

                //String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 145, 2);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().swipeUp();

                getLoginPageActions().loginToTheUser(Username, Password);
                getTrainingPageActions().taponoldcertificate();

        }
        
        @Test()
        public void VerifyCourseProgressShouldGetUpdatedWithSinglePagePdfContent() throws Exception {

                QXClient.get().driver();

                getDikshaMainPageActions().performUserOnBoarding();
                getHomePageActions().tapOnProfileTab();

                Properties properties = QXClient.get().propUtils()
                                .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
                System.out.println("@name:" + properties.getProperty("excelpath"));

                String fetchExcelPathFromConfig = properties.getProperty("excelpath");
                QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

                String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 143, 2);
                String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 144, 2);

                String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 7, 2);
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
                getTrainingPageActions().VerifyCourseProgressShouldGetUpdatedWithSinglePagePdfContent();
                QXClient.get().gestures().closeappandrelaunchapp();
                getHomePageActions().tapOnTrainingTab();
                getHomePageActions().tapOnSearchIcon();
                getHomePageActions().enterTextInSearchBar(course_id);
                getTrainingPageActions().VerifyCourseProgressShouldGetUpdatedWithSinglePagePdfContentwithProgress();

        }
        
      
        
        @Test()
        public void verifyCourseProgressUpdateForEpubContentAfterClickOnNextAndPreviousModule() throws Exception {

            QXClient.get().driver();
            getDikshaMainPageActions().performUserOnBoarding();

            getHomePageActions().tapOnProfileTab();


            Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" +
                    properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 5, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 6, 2);
            String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",9,2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            DikshaMainPageActions d = new DikshaMainPageActions();
            QXClient.get().gestures().closeApp();
            d.LaunchAppHomeScreen();

            getHomePageActions().tapOnTrainingTab();
            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(coursefetch);
            QXClient.get().gestures().swipeUp();

            getTrainingPageActions().tapOnAutomationEpubCourse();
     
            getTrainingPageActions().verifyCourseProgressUpdateForEpubContent();
        }
     
        
        @Test()
        public void coursebatchpopup() throws Exception {
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
            String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 18, 2);
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
            getTrainingPageActions().taponcoursebatch();
        }
        
        @Test()
        public void syncprogressincourse() throws Exception {
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
            getTrainingPageActions().tapCoursesync();
        }
        @Test()
        public void singlepagepdfcourse() throws Exception {
            QXClient.get().driver();
            getDikshaMainPageActions().performUserOnBoarding();
            getHomePageActions().tapOnProfileTab();
            Properties properties = QXClient.get().propUtils()
                  .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" + properties.getProperty("excelpath"));
            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 2, 5);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 3, 5);
            String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 14, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            getLoginPageActions().loginToTheUser(Username, Password);
            QXClient.get().gestures().closeappandrelaunchapp();

            
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
            getTrainingPageActions().taponsinglepagepdfcourse();
        }
        @Test()
        public void coursebatchselectionpopup() throws Exception {
            QXClient.get().driver();
            getDikshaMainPageActions().performUserOnBoarding();
            getHomePageActions().tapOnProfileTab();
            Properties properties = QXClient.get().propUtils()
                  .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" + properties.getProperty("excelpath"));
            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 20, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 21, 2);
            String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 19, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            getLoginPageActions().loginToTheUser(Username, Password);
            getHomePageActions().tapOnTrainingTab();
            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(course_id);
            // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
            getTrainingPageActions().taponcourseselectionbatch();
        }
        
        @Test()
        public void coursemultipleunits() throws Exception {
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
            String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 13, 2);
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
            getTrainingPageActions().tapCoursemultipleunits();
            getTrainingPageActions().tapCoursemultipleunitsconsume();
        }
        
        @Test()
    	public void VerifyCollectionTrackableEnabledShouldInheritCourseUI() throws Exception {
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
    		String collectionTrackableEnabled = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",9, 2);

    		QXClient.get().gestures().swipeUp();
    		QXClient.get().gestures().swipeUp();
    		getLoginPageActions().loginToTheUser(Username, Password);

    	
    		QXClient.get().gestures().closeApp();
    		d.LaunchAppHomeScreen();

    		getHomePageActions().tapOnTrainingTab();

    		getHomePageActions().tapOnSearchIcon();
    		getHomePageActions().enterTextInSearchBar(collectionTrackableEnabled);
    		getHomePageActions().clkOnCourseFirstResult();
    		getHomePageActions().verifyCourseUIInherited();

    	}
        
        
        @Test()
    	public void VerifyCollectionTrackableDisabledShouldInheritBookUI() throws Exception {
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
    		String collectionTrackableEnabled = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",10, 2);

    		QXClient.get().gestures().swipeUp();
    		QXClient.get().gestures().swipeUp();
    		getLoginPageActions().loginToTheUser(Username, Password);

    	
    		QXClient.get().gestures().closeApp();
    		d.LaunchAppHomeScreen();

    		getHomePageActions().tapOnTrainingTab();

    		getHomePageActions().tapOnSearchIcon();
    		getHomePageActions().enterTextInSearchBar(collectionTrackableEnabled);
    		getHomePageActions().clkOnCollectionFirstResult();
    		getHomePageActions().verifyBookUIInherited();

    	}
        
        @Test()
    	public void VerifySourceCourseInformationIsSameAsDataGivenByUserDuringCreationForCopiedCourse() throws Exception {
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
    		String copiedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",31, 2);

    		QXClient.get().gestures().swipeUp();
    		QXClient.get().gestures().swipeUp();
    		getLoginPageActions().loginToTheUser(Username, Password);

    	
    		QXClient.get().gestures().closeApp();
    		d.LaunchAppHomeScreen();

    		getHomePageActions().tapOnTrainingTab();

    		getHomePageActions().tapOnSearchIcon();
    		getHomePageActions().enterTextInSearchBar(copiedCourse);
    		getHomePageActions().clkOnCourseFirstResult();
    		getHomePageActions().validateSourceCourseInformation();

    	}
        
        @Test()
    	public void CopiedOfCopiedVerifySourceCourseInformationIsSameAsDataGivenByUserDuringCreation() throws Exception {
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
    		String copiedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",32, 2);

    		QXClient.get().gestures().swipeUp();
    		QXClient.get().gestures().swipeUp();
    		getLoginPageActions().loginToTheUser(Username, Password);

    	
    		QXClient.get().gestures().closeApp();
    		d.LaunchAppHomeScreen();

    		getHomePageActions().tapOnTrainingTab();

    		getHomePageActions().tapOnSearchIcon();
    		getHomePageActions().enterTextInSearchBar(copiedCourse);
    		getHomePageActions().clkOnCourseFirstResult();
    		getHomePageActions().validateSourceCourseInformationCopyOfCopiedCourse();

    	}
        
        @Test()
        public void verifySearchCourseLinkedWithQRCode() throws Exception {

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
            String Qrcode = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 156, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            QXClient.get().gestures().closeApp();
            d.LaunchAppHomeScreen();

            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(Qrcode);

            getTrainingPageActions().tapOnQrcode();

            getTrainingPageActions().verifySearchCourseLinkedWithQRCode();

        }
        
        @Test()
        public void verifyCourseProgressUpdateForPDFContentAfterClickOnNextAndPreviousModule() throws Exception {

            QXClient.get().driver();
            getDikshaMainPageActions().performUserOnBoarding();
            getHomePageActions().tapOnProfileTab();
            DikshaMainPageActions d=new DikshaMainPageActions();


            Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" +
                    properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 34, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 35, 2);
            String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",33,2);
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

            getTrainingPageActions().tapOnAutomationPdfCourse();

            getTrainingPageActions().verifyCourseProgressUpdateForPDFContent();
        }

        @Test
    	public void verifyTabsInNewExperience() throws Exception {
    	QXClient.get().driver();
    	getDikshaMainPageActions().performUserOnBoarding();
    	getHomePageActions().tapOnProfileTab();
    	Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
    	System.out.println("@name:" +
    			properties.getProperty("excelpath"));

    	String fetchExcelPathFromConfig = properties.getProperty("excelpath");
    	QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");


    	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 41, 2);
    	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 42, 2);

    	        QXClient.get().gestures().swipeUp();
    	        QXClient.get().gestures().swipeUp();

    	        getLoginPageActions().loginToTheUser(Username, Password);

    	DikshaMainPageActions d=new DikshaMainPageActions();
    	QXClient.get().gestures().closeApp();
    	d.LaunchAppHomeScreen();

    			getHomePageActions().tapOnHamburgerMenu();
    			getHomePageActions().changeToJoyfulTheme();
    			getHomePageActions().verifyTabsInJoyfulTheme();


    	}
        @Test()
    	public void VerifyCourseProgressShouldGetUpdatedWithEpubContainsCourse() throws Exception {

    		QXClient.get().driver();

    		getDikshaMainPageActions().performUserOnBoarding();
    		getHomePageActions().tapOnProfileTab();

    		Properties properties = QXClient.get().propUtils()
    				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
    		System.out.println("@name:" + properties.getProperty("excelpath"));

    		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
    		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

    		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 141, 2);
    		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 142, 2);

    		String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 9, 2);
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
    		getHomePageActions().VerifyCourseProgressShouldGetUpdatedSuccessfullyWithEpubContainsCourse();

    		getHomePageActions().ValidateCourseProgressForEpubContent();

    	}
        
 	   @Test()
 	    public void verifyCoursesAfterAppliedCourseFilters() throws Exception {

 	        QXClient.get().driver();
 	        getDikshaMainPageActions().performUserOnBoarding();

 	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
 	        System.out.println("@name:" +
 	                properties.getProperty("excelpath"));

 	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
 	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

 	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 29, 2);
 	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 30, 2);

 	        getHomePageActions().tapOnProfileTab();
 	        QXClient.get().gestures().swipeUp();
 	        QXClient.get().gestures().swipeUp();

 	        getLoginPageActions().loginToTheUser(Username, Password);

 	        getHomePageActions().verifyCoursesAfterAppliedCourseFilters();


 	    }
 	  @Test()
 		public void verifyUserConsumePDFContentInFullScreen() throws Exception {
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
 			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
 			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);
 			String Automationpdfcontent = QXClient.get().excelUtils().getCellValue("Excel1", "ContentConsumption", 1, 2);
 			getLoginPageActions().loginToTheUser(Username, Password);
 			getHomePageActions().tapOnTrainingTab();
 			getHomePageActions().tapOnSearchIcon();
 			getHomePageActions().enterTextInSearchBar(Automationpdfcontent);
 			getHomePageActions().verifyUserConsumePDFContentInFullScreen();
 		}
 	 @Test()
     public void verifyProgressandBestScoreUpdateforExpiredCourse() throws Exception {

             QXClient.get().driver();
             DikshaMainPageActions d = new DikshaMainPageActions();
             getDikshaMainPageActions().performUserOnBoarding();
             getHomePageActions().tapOnProfileTab();
             QXClient.get().gestures().swipeUp();
             QXClient.get().gestures().swipeUp();
             Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
             System.out.println("@name:" +
                             properties.getProperty("excelpath"));

             String fetchExcelPathFromConfig = properties.getProperty("excelpath");
             QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

             String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 35, 2);
             String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 36, 2);
             String excourse = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",34, 2);

             getLoginPageActions().loginToTheUser(Username, Password);
             QXClient.get().gestures().closeApp();
             d.LaunchAppHomeScreen();
             getHomePageActions().tapOnTrainingTab();
             getHomePageActions().tapOnSearchIcon();
             getHomePageActions().enterTextInSearchBar(excourse);
             getTrainingPageActions().verifyCourseUpdateforExpiredCourse();
     }
 	 
 	@Test()
    public void verifyProgressupdateforPDFinCourse() throws Exception {

            QXClient.get().driver();
            DikshaMainPageActions d = new DikshaMainPageActions();
            getDikshaMainPageActions().performUserOnBoarding();
            getHomePageActions().tapOnProfileTab();


            Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" +
                            properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",37, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 38, 2);
            String pdfcourse = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",39, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            getLoginPageActions().loginToTheUser(Username, Password);

            getHomePageActions().tapOnMenuBar();

            getCoursePageActions().tapOnAddAnotherUser();

            String FakeName = QXClient.get().gestures().generateRandomName();
            String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
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


            getCoursePageActions().tapOnChangeUser();

            getCoursePageActions().tapOnTermsAndCondition();

            getCoursePageActions().tapOnContinueForSwicthUser();

            getHomePageActions().tapOnTrainingTab();

            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(pdfcourse);
            getTrainingPageActions().verifyProgressupdateforPDF();

    }
 	@Test()
 	public void VerifyUserConsumeContentInFullScreen() throws Exception {

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

 		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
 		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);
 		String AutomationcontentVdforfullscreen = QXClient.get().excelUtils().getCellValue("Excel1", "ContentConsumption", 2, 2);
 		getLoginPageActions().loginToTheUser(Username, Password);
 		getHomePageActions().tapOnTrainingTab();
 		getHomePageActions().tapOnSearchIcon();
 		getHomePageActions().enterTextInSearchBar(AutomationcontentVdforfullscreen);
 		getHomePageActions().VerifyUserConsumeContentInFullScreen();


 	}
 	@Test()
	public void verifyCourseProgressUpdatedForYoutubeVideo() throws Exception {
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
		String Automationcourseprgressupdatedforyoutube = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 33, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnAddAnotherUser();

		String FakeName = QXClient.get().gestures().generateRandomName();
		String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
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


		getCoursePageActions().tapOnChangeUser();

		getCoursePageActions().tapOnTermsAndCondition();

		getCoursePageActions().tapOnContinueForSwicthUser();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(Automationcourseprgressupdatedforyoutube);
		getHomePageActions().verifyCourseProgressUpdatedForYoutubeVideo();

	}
 	@Test()
	public void verifyCourseProgressUpdatedConsumeVideoContent() throws Exception {
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
		String Automationcoursewithvideocontent = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 35, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnAddAnotherUser();

		String FakeName = QXClient.get().gestures().generateRandomName();
		String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
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


		getCoursePageActions().tapOnChangeUser();

		getCoursePageActions().tapOnTermsAndCondition();

		getCoursePageActions().tapOnContinueForSwicthUser();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(Automationcoursewithvideocontent);
		getHomePageActions().verifyCourseProgressUpdatedConsumeVideoContent();

	}
 	@Test()
    public void newcertificateviewanddownloadincourse() throws Exception {

            QXClient.get().driver();

            getDikshaMainPageActions().performUserOnBoarding();
            getHomePageActions().tapOnProfileTab();

            Properties properties = QXClient.get().propUtils()
                            .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" + properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 22, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 23, 2);

            //String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 14, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            getTrainingPageActions().taponnewcertificate();


    }
 	
 	@Test()
    public void verifyDisplayOfCertificateInMyLearningAndLearnerPassbookSectionForConsumingNewCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingAndClickSwitchToNewExperience();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 29, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 30, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",33,2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        QXClient.get().gestures().swipeUp();

        getTrainingPageActions().tapOnNewCourseWithCertificate();

        getTrainingPageActions().verifyCertificateInMyLearningAndLearnerPassbookSection();
    }

 	@Test()
    public void verifyCourseProgressUpdateForHTMLContentAfterClickOnNextAndPreviousModule() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        DikshaMainPageActions d=new DikshaMainPageActions();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 47, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 44, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",51,2);
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

        getTrainingPageActions().tapOnAutomationHTMLCourse();

        getTrainingPageActions().verifyCourseProgressUpdateForHTMLContent();
    }
 	@Test()
    public void verifyDisplayOfMeritCertificateInMyLearningAndLearnerPassbookSectionForConsumingNewCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingAndClickSwitchToNewExperience();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 43, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 44, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",46,2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        QXClient.get().gestures().swipeUp();

        getTrainingPageActions().tapOnNewCourseMeritCertificate();

        getTrainingPageActions().verifyMeritCertificateForNewCourseInMyLearningAndLearnerPassbookSection();
    }
 	@Test()
    public void verifyDisplayOfMeritCertificateInMyLearningAndLearnerPassbookSectionForConsumingOldCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingAndClickSwitchToNewExperience();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 43, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 44, 2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption",45,2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        QXClient.get().gestures().swipeUp();

        getTrainingPageActions().tapOnOldCourseMeritCertificate();

        getTrainingPageActions().verifyMeritCertificateInMyLearningAndLearnerPassbookSection();
    }
 	@Test()
 	public void resumecoursebatchselectionpopup() throws Exception {
 		QXClient.get().driver();
 		getDikshaMainPageActions().performUserOnBoarding();
 		getHomePageActions().tapOnProfileTab();
 		Properties properties = QXClient.get().propUtils()
 				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
 		System.out.println("@name:" + properties.getProperty("excelpath"));
 		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
 		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
 		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 46, 2);
 		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 47, 2);
 		String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 48, 2);
 		QXClient.get().gestures().swipeUp();
 		QXClient.get().gestures().swipeUp();
 		getLoginPageActions().loginToTheUser(Username, Password);
 		getHomePageActions().tapOnTrainingTab();
 		getHomePageActions().tapOnSearchIcon();
 		getHomePageActions().enterTextInSearchBar(course_id);
 		// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
 		getTrainingPageActions().taponresumecourseselectionbatch();
 	}
 
 	
 	
}
