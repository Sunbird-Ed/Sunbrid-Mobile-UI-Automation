package com.qualitrrix.test.regression;

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

public class QUMLP2 {
	
	

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
	    public void verifySummaryPageDetailsOfQuestionSetWithFeedBackEnabled() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",115,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet2();

	        getTrainingPageActions().verifyShowSummaryWhenFeedbackEnabled();

	    }
	 @Test()
	    public void userAbleToConsumeQuestionSetBothInPracticeAndTestMode() throws Exception {

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
	        String questionSet1 = QXClient.get().excelUtils().getCellValue("Excel1","TestData",114,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet();

	        getTrainingPageActions().verifyRightMarkAndViewSolutionOptionInFeedbackPopup();

	        QXClient.get().gestures().closeApp();

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(questionSet1);

	        getTrainingPageActions().tapOnQuestionSet1();

	        getTrainingPageActions().verifyFirstPageOfContentPostClickingReviewBtn();

	    }
	 @Test()
	    public void verifyInstructionPageDetailsInQuestionSet() throws Exception {

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
	    public void verifyUserAbleToConsumeQuestionSetInsideContentPlaylist() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String QSContentPlaylist =QXClient.get().excelUtils().getCellValue("Excel1","TestData",87,2);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);
	        QXClient.get().gestures().closeappandrelaunchapp();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(QSContentPlaylist);

	        getTrainingPageActions().tapOnQSInContentPlaylist();

	        getTrainingPageActions().verifyUserAbleToConsumeContentPlaylistWithQS();

	    }
	 
	   @Test()
	    public void verifyUserAbleToConsumeQuestionSetInsideDigitalTextBook() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String QSDigitalTextBook =QXClient.get().excelUtils().getCellValue("Excel1","TestData",88,2);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(QSDigitalTextBook);

	        getTrainingPageActions().tapOnQSInDigitalTextBook();

	        getTrainingPageActions().verifyUserAbleToConsumeDigitalTextBookWithQS();

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
	    public void verifyNoExitButtonIsDisplayedSubmitConfirmationPage() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",115,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet2();

	        getTrainingPageActions().verifyTimerDisplayedForEntireSectionAndSubmitConfirmationPage();

	        getTrainingPageActions().verifyExitButtonInSubmitConfirmationPage();

	    }
	 @Test()
	    public void verifyUserAbleToConsumeQUMLContent() throws Exception {

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
	        QXClient.get().gestures().closeappandrelaunchapp();
	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("Course with ak question set");

	        getTrainingPageActions().tapOnQUMLContent();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyUserAbleToConsumeQUMlContent();

	    }
	 @Test()
	    public void verifyShowSolutionForCorrectAnsAndTryAgainForIncorrectAnsInFeedbackPopup() throws Exception {

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
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet();

	        getTrainingPageActions().verifyIncorrectAnswerFeedbackDetails();

	    }

	  
	@Test()
    public void verifyZoomOptionInQuestionSetWithImages() throws Exception {

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
        getTrainingPageActions().verifyZoomInAndZoomOutOptionInQuestionsetWithImages();

    }

	
	 @Test()
	    public void validateShareOptionInMenuBarAndExitButtonOnEndPageOfQuestionSet() throws Exception {

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

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",71, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",72, 2);
	        String limitedCourse = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 121,2);
	        getLoginPageActions().loginToTheUser(Username, Password);

	        //getHomePageActions().tapOnDownloadTab();

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
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(limitedCourse);
	        getTrainingPageActions().tapOnQuestionSetCourse();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyShareBtnInMenuAndExitButtonOnQuestionSetEndpage();

	    }
	 
	 @Test()
	    public void verifyTitleOfQuestionSetAndButtonsInSubmitPageOfQuestionSet() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",114,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet1();

	        getTrainingPageActions().verifyTitleAndButtonsInSubmitPageOfQuestionSet();

	    }

	@Test()
    public void verifyUserAbleToAnswerSingleChoiceAnswersInAllLayoutInQuestionSet() throws Exception {

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
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(questionSet);

        getTrainingPageActions().tapOnQuestionSet();

        getTrainingPageActions().verifyIncorrectAnswerFeedbackDetails();

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
	    public void verifyShareAndExitOptionInHamburgerMenuBar() throws Exception {

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

	        //getHomePageActions().tapOnTrainingTab();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("Limited course 25");
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Limited course 25");
	        getTrainingPageActions().tapOnSearchedCourse9();
	        getTrainingPageActions().verifyUserAbleToJoinQuestionSetCourse();

	        getTrainingPageActions().verifyShareAndExitOptionsOfQuestionSet();


	    }
	  @Test()
	    public void verifyCorrectIncorrectFeedbackPopupIsNotDisplayedWhenItIsDisabledByCreatorInQuestionSet() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",116,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet3();

	        getTrainingPageActions().verifyConfigurationsDisplayedInEachSection();

	    }

		 
	  
	 @Test()
	    public void noAnsIconForQuestionsetCreatedWithUncheckedSolution() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",117,2);

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
	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSetCourse5();

	        getTrainingPageActions().tapOnJoinTraining2();

	        getTrainingPageActions().verifyAnsIconIsNotDisplayedInSolutionUncheckedQuestionSet();

	    }
	 @Test()
	    public void verifyNumberOfAttemptsIncreasesWhileConsumingQuestionSetPostClickingReplayButton() throws Exception {

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

	        getTrainingPageActions().verifyNumberOfAttemptsIncreasesPostClickingReplay();

	    }

	 @Test()
	    public void verifyTimerForEntireSectionAndProgressBarSectionsInSubmitConfirmationPage() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",115,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet2();

	        getTrainingPageActions().verifyTimerDisplayedForEntireSectionAndSubmitConfirmationPage();

	    }

	 
	 @Test()
	    public void verifyConfigurationsAreDisplayedInEachSectionOfQuestionSet() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",116,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet3();

	        getTrainingPageActions().verifyConfigurationsDisplayedInEachSection();

	    }
	 @Test()
	    public void verifyNumberOfAttemptsSubmitRequiredAndTimerInRootNodeOnly() throws Exception {

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

	        getTrainingPageActions().verifyNumberOfAttemptsAndTimerInQuestionSet();

	    }

	 @Test()
	    public void verifyAnswerIsNotSavedWhenUserChangedAnswerAndUnansweredQuestionsInQuestionSet() throws Exception {

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
	        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",114,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(questionSet);

	        getTrainingPageActions().tapOnQuestionSet1();

	        getTrainingPageActions().verifyFirstPageOfContentPostClickingReviewBtn();

	    }


		  
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  

	  
   
	
	
	
	
 
    



	
	


	
	

	

    

	
	
    
	
	
	
	
	

	
	

	   
	
    

  

	
	


   

  
	 



	
	
	 
   
	
	
	 
	
	 
   

	
	
	


	
	
	
	

}
