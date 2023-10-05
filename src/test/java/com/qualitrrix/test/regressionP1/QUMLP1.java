package com.qualitrrix.test.regressionP1;

import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.CoursePageActions;
import com.qualitrix.pageActions.DikshaMainPageActions;
import com.qualitrix.pageActions.DownloadPageActions;
import com.qualitrix.pageActions.HomePageActions;
import com.qualitrix.pageActions.LibraryCourseContentPageActions;
import com.qualitrix.pageActions.LoginPageActions;
import com.qualitrix.pageActions.ProfileEditPageActions;
import com.qualitrix.pageActions.TrainingPageActions;

public class QUMLP1 {
	
	

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
	    public void verifyUserAbleToAttemptQuestionsOnlyOnceInTestModeWithAttemptsEqualsOne() throws Exception {

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

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",71, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",72, 2);
	        String singleAttemptCourse = QXClient.get().excelUtils().getCellValue("Excel1","TestData",100,2);
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
	        getHomePageActions().enterTextInSearchBar(singleAttemptCourse);

	        getTrainingPageActions().tapOnSingleAttemptQuestionSetCourse();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyUserNotAbleToAttemptQuestionsMoreThanOnce();


	    }

	 @Test()
	    public void verifyUserAbleToSeeNumberOfAttemptsLeftWhileConsumingQuestionsetCourseInTestMode() throws Exception {

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

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",71, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",72, 2);
	        String limitedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 121,2);
	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnMenuBar();

	        getCoursePageActions().tapOnAddAnotherUser();

	        String FakeName=QXClient.get().gestures().generateRandomName();
	        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	        System.out.println(storeFakeNameEntered);
	        getCoursePageActions().tapOnAddUserBtn();
	        QXClient.get().gestures().BlindWait(2000);
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

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(limitedCourse);

	        getTrainingPageActions().tapOnQuestionSetCourse();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyNumberOfAttemptsAndTimerInQuestionSet();

	    }
	 @Test()
	    public void verifyUserNotAbleToSeeNumberOfAttemptsLeftForPracticeModeWhileConsuming() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        DikshaMainPageActions d=new DikshaMainPageActions();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",71, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",72, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username, Password);

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
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("Practice Course");

	        getTrainingPageActions().tapOnPracticeCourse();

	        getTrainingPageActions().verifyNoAttemptsInCourseWithQuestionsetInPracticeMode();


	    }
	 @Test()
	    public void verifyTotalScoreGetsUpdatedInCourseTOCPostConsumingAllAttempts() throws Exception {

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
	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",121,2);
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
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnQuestionSetCourse();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

	    }
	 
	 @Test()
		public void verifyMaximumAttemptsCrossedMsgPostClickingNextOrPrevOnContentPlayer() throws Exception {

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
			String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 121, 2);
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
			getHomePageActions().enterTextInSearchBar(coursefetch);

			getTrainingPageActions().tapOnQuestionSetCourse();

			getTrainingPageActions().tapOnJoinTraining2();

			getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

		}

		
		
	  @Test()
			public void veriyUserAbleToDownloadQuestionSetOnline() throws Exception {

				QXClient.get().driver();
				DikshaMainPageActions d = new DikshaMainPageActions();
				getDikshaMainPageActions().performUserOnBoarding();
				getHomePageActions().tapOnProfileTab();

				Properties properties = QXClient.get().propUtils()
						.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
				System.out.println("@name:" + properties.getProperty("excelpath"));

				String fetchExcelPathFromConfig = properties.getProperty("excelpath");
				QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

				String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
				String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
				String limitedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 121, 2);
				QXClient.get().gestures().swipeUp();
				QXClient.get().gestures().swipeUp();

				getLoginPageActions().loginToTheUser(Username, Password);
				QXClient.get().gestures().closeApp();
				d.LaunchAppHomeScreen();

				getHomePageActions().tapOnTrainingTab();
				getHomePageActions().tapOnSearchIcon();
				getHomePageActions().enterTextInSearchBar(limitedCourse);
				// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited
				// course");
				getTrainingPageActions().tapOnSearchedLimitedCourse();
				getTrainingPageActions().verifyUserAbleToJoinQuestionSetCourse();

				getLibraryPageActions().tapOnDownloadBtn();
				getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();

				getTrainingPageActions().waitTillTheDownloadButtonDisappears();

				getTrainingPageActions().leaveCourse();

				QXClient.get().gestures().clkBackButton();
				QXClient.get().gestures().clkBackButton();

				getHomePageActions().tapOnDownloadTab();
				getDownloadPageActions().verifyTheDownloadedQuestionSetCourse();

			}
	 @Test()
	    public void validateContinueBtnInLastAttemptMsgAndMaxAttemptsExceededMsg() throws Exception {
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
	        String limitedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 121,2);
	        getLoginPageActions().loginToTheUser(Username, Password);

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

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(limitedCourse);
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited course");
	        getTrainingPageActions().tapOnQuestionSetCourse();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

	    }

	 @Test()
	    public void validateConfirmPopupWhenUserDeliberatelyExitsFromPlayerContentWhileConsuming() throws Exception {
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
	        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

	        getTrainingPageActions().tapOnSearchedPDF();

	        getTrainingPageActions().verifyPopupWhenDeliberatelyExitFromPlayerContent();

	    }

	 @Test()
	    public void verifyDoneBtnCloseButtonAndFeedbackPopupInQuestionSet() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",113,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet();

	        getTrainingPageActions().verifyRightMarkAndViewSolutionOptionInFeedbackPopup();

	        getTrainingPageActions().verifyDoneAndCloseButtonsInViewSolutionPage();

	    }

	 @Test()
	    public void verifyNextButtonIsHighlightedWhenUserIsOnInstructionsPageOfQuestionset() throws Exception {

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
	        String QuestionSetDo_Id = QXClient.get().excelUtils().getCellValue("Excel1","TestData",73,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(QuestionSetDo_Id);

	        getTrainingPageActions().tapOnSearchedQuestionsetWithImages();

	        getTrainingPageActions().verifyNextButtonIsHighlightedInInstructionsPage();

	    }

	
	 @Test()
	    public void verifyUserAbleToSeeRichTextInInstructionsPageWhileConsumingQuestionSet() throws Exception {

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
	        String QuestionSetWithoutQuestions = QXClient.get().excelUtils().getCellValue("Excel1","TestData",76,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(QuestionSetWithoutQuestions);

	        getTrainingPageActions().tapOnQuestionSetWithoutQuestions();


	        getTrainingPageActions().verifyUserAbleToSeeInstructionPage();

	    }
	
	@Test()
    public void verifyUserAbleToSeeInstructionsPageInQuestionsetWithoutQuestions() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",71, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",72, 2);
        String QuestionSetWithoutQuestions = QXClient.get().excelUtils().getCellValue("Excel1","TestData",76,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(QuestionSetWithoutQuestions);

        getTrainingPageActions().tapOnQuestionSetWithoutQuestions();


        getTrainingPageActions().verifyUserAbleToSeeInstructionPage();

    }

	
	@Test()
    public void verifyImagestextsaresameduringcreation() throws Exception {

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
            String QuestionSetDo_Id = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 73, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            d.LaunchAppHomeScreen();

            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(QuestionSetDo_Id);

            getTrainingPageActions().tapOnSearchedQuestionsetWithImages();
            getTrainingPageActions().textImagesdisplay();

    }
	
	@Test()
    public void verifymaxattemptexhausted() throws Exception {
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
            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 132, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 133, 2);
            String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 134, 2);
            getLoginPageActions().loginToTheUser(Username, Password);
            //getHomePageActions().tapOnMenuBar();

            //getCoursePageActions().tapOnAddAnotherUser();

            //String FakeName = QXClient.get().gestures().generateRandomName();
            //String storeFakeNameEntered = getCoursePageActions().enterName(FakeName);
            //System.out.println(storeFakeNameEntered);
            //getCoursePageActions().tapOnAddUserBtn();
            //getHomePageActions().tapOnMenuBar();

            //getCoursePageActions().tapOnMoreOption();
            //QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


            //getCoursePageActions().tapOnChangeUserWithoutProfile();

            //getCoursePageActions().tapOnTermsAndCondition();

            //getCoursePageActions().tapOnContinueForSwicthUser();
            //DikshaMainPageActions d = new DikshaMainPageActions();
            //QXClient.get().gestures().closeApp();
            //d.LaunchAppHomeScreen();
            getHomePageActions().tapOnTrainingTab();
            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(coursefetch);
            getTrainingPageActions().tapOnQuestionSetCourse();
            //getTrainingPageActions().tapOnJoinTraining2();
            //getTrainingPageActions().startlearning();
            //getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();
            getTrainingPageActions().verifymaxattemptexceededmessage();

    }
    @Test()
    public void verifyscoreinquestionsettrackablecollect() throws Exception {
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

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",132, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",133, 2);
            String limitedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 135,2);
            String tapOnQuestionSetCourse7 = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 135,2);

            getLoginPageActions().loginToTheUser(Username, Password);

            getHomePageActions().tapOnDownloadTab();

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

            QXClient.get().gestures().closeappandrelaunchapp();
            getHomePageActions().tapOnTrainingTab();

            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(tapOnQuestionSetCourse7);

            getTrainingPageActions().tapOnQuestionSetCourse7();
            getTrainingPageActions().tapOnJointrackable();
            getTrainingPageActions().startlearning();
            getTrainingPageActions().checkscore();
            getTrainingPageActions().verifyscoreinquestionsettrackablecollect();

    }
    @Test()
    public void verifyfeedbackpopupdisplay() throws Exception {
            QXClient.get().driver();
            getDikshaMainPageActions().performUserOnBoarding();
            DikshaMainPageActions d = new DikshaMainPageActions();
            getHomePageActions().tapOnProfileTab();


            Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" +
                            properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 132, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 133, 2);
            String QuestionSetDo_Id = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 136, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            d.LaunchAppHomeScreen();

            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(QuestionSetDo_Id);

          getTrainingPageActions().tapOnSearchedQuestionset();

}
    
    @Test()
    public void verifytitlereplycoloralign() throws Exception {
            QXClient.get().driver();
            getDikshaMainPageActions().performUserOnBoarding();
            DikshaMainPageActions d = new DikshaMainPageActions();
            getHomePageActions().tapOnProfileTab();


            Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
            System.out.println("@name:" +
                            properties.getProperty("excelpath"));

            String fetchExcelPathFromConfig = properties.getProperty("excelpath");
            QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

            String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 132, 2);
            String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 133, 2);
            String QuestionSetDo_Id = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 136, 2);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

            getLoginPageActions().loginToTheUser(Username, Password);
            d.LaunchAppHomeScreen();

            getHomePageActions().tapOnSearchIcon();
            getHomePageActions().enterTextInSearchBar(QuestionSetDo_Id);

            getTrainingPageActions().tapOnSearchedQuestionset();
            getTrainingPageActions().taponreply();
           
    }
    
    

}
