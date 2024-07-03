package com.qualitrrix.test;

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

public class CourseScenarioSanity {

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



	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Logged in user is able to UnEnroll from Course.")
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

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
		//String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "Course",3,2);

		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);
		// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getHomePageActions().clkOnCourseFirstResult();

		getTrainingPageActions().tapOnJoinTraining2();

		getTrainingPageActions().leaveCourse();
	}
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Course should display under trainings attended section in profile section, if user has consumed the course completely.")
	    public void VerifyOngoingCourse() throws Exception {

		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));

		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

		  getLoginPageActions().loginToTheUser(Username,Password);

		  DikshaMainPageActions d=new DikshaMainPageActions();
		  QXClient.get().gestures().closeApp();
		  d.LaunchAppHomeScreen();
		  //getHomePageActions().tapOnDownloadTab();
		  getHomePageActions().tapOnProfileTab();

		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

		  getCoursePageActions().tapOnOngoingCourse();
		  Thread.sleep(2000);

	  }

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Course should display under trainings attended section in profile section, if user has consumed the course completely.")
	public void VerifyCompletedCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		//getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getCoursePageActions().tapOnCompletedCourse();
		Thread.sleep(2000);

	}
		  
		  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
		            description = "Course should display under trainings attended section in profile section, if user has consumed the course completely.")
		    public void ParentToChildConsume() throws Exception {
			  
			  QXClient.get().driver();
			  Thread.sleep(2000);

		    }
 
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	          description = "Guest user is able to search Course using textbook.")
	  public void ConsumeCourseUsingTextBook() throws Exception {

		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
	  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String CourseUsingTextBook=QXClient.get().excelUtils().getCellValue("Excel1","Course",8,2);

	  	   getHomePageActions().tapOnTrainingTab();
	       getHomePageActions().tapOnSearchIcon();
	       getHomePageActions().enterTextInSearchBar(CourseUsingTextBook);
		   getHomePageActions().clkOnCourseFirstResult();

	  }
	  @Author(name="Raju")

	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			  description ="Course Progress update after consuming the contents")
			  public void CourseProgressUpdate() throws Exception {

		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();


		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));

		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",9,2);
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",9,3);
		  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "Course",4,2);

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
		  getHomePageActions().clkOnCourseFirstResult();

		  //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		  getTrainingPageActions().consumCourseContent();

	  }


	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "Guest user get the login pop up after clicking the join button of any searched course")
	public void displayLoginPoupEnroll() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnTrainingTab();
		getCoursePageActions().validatecourselogin();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);

		getLoginPageActions().tapOnLoginBtnInCourseTab(Username,Password);

	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "Guest user able to enable and disable the debug mode under settings")
	public void verifyUserAbleToEnableDisableDebugMode() throws Exception {

	     QXClient.get().driver();
	     getDikshaMainPageActions().performUserOnBoarding();
	     getHomePageActions().tapOnProfileTab();

	     getHomePageActions().verifyEnableDisableDebugMode();

	    }

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "User get the last attempt and Max attempt message after consuming the question set with limited attempts")
	public void verifyLastAttemptAndMaxAttemptsMessage() throws Exception {

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 9, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 9, 3);

		getLoginPageActions().loginToTheUser(Username, Password);

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

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
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("do_21394997424403251217");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited course");
		getHomePageActions().clkOnCourseFirstResult();

		getTrainingPageActions().tapOnJoinTraining2();

		getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "Verify details on Activity dashboard in groups")
	public void verifyActivityDashBoardInGroups() throws Exception {

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);

		getLoginPageActions().loginToTheUser(Username, Password);

		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().verifyActivityDashBoard();

	}

	@Test(enabled = true, groups = { "SanityTest",
			"FunctionalTest" }, alwaysRun = true, description = "Course Share.")
	public void CourseShare() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
		//String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "Course",4,2);


		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		//getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);
		// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getHomePageActions().clkOnCourseFirstResult();

		getLibraryPageActions().verifyShareBeforeEnrollCourse();

		getTrainingPageActions().tapOnJoinTraining2();

		getLibraryPageActions().verifyShareAfterEnrollCourse();

		getTrainingPageActions().leaveCourse();


	}


	  
/*
 * @Author(name="Raju")
 * 
 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
 * true) public void consumeCourseContent() throws Exception {
 * 
 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
 * getHomePageActions().tapOnProfileTab();
 * 
 * 
 * Properties properties =
 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
 * +"/configs/config.properties"); System.out.println("@name:" +
 * properties.getProperty("excelpath"));
 * 
 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
 * 
 * String Username
 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",34,2); String
 * Password =QXClient.get().excelUtils().getCellValue("Excel1",
 * "TestData",35,2);
 * 
 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
 * getLoginPageActions().loginToTheUser(Username,Password);
 * 
 * 
 * 
 * // getCoursePageActions().verifyDistricAndState();
 * 
 * // getTrainingPageActions().taponCourseButton();
 * 
 * getHomePageActions().tapOnTrainingTab();
 * 
 * 
 * getHomePageActions().tapOnSearchIcon();
 * getHomePageActions().enterTextInSearchBar("AutomationCourseContent");
 * getTrainingPageActions().tapOnSearchedCourse();
 * getTrainingPageActions().consumCourseContent();
 * 
 * 
 * 
 * }
 */


	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "Verify Enrollment end date and BMCS under course details")
	public void verifyBMCSandEnrollmentEndDateInCourseDetails() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnDownloadTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String CourseName =QXClient.get().excelUtils().getCellValue("Excel1","Course",6,2);
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(CourseName);

		getHomePageActions().clkOnCourseFirstResult();

		getTrainingPageActions().verifyCourseDetails();

	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "Verify timer is displayed after joining the course, which expires in 2 days")
	public void verifyTimerIsDisplayedPostJoinCourseWhichExpiresInTwoDays() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);
		DikshaMainPageActions d=new DikshaMainPageActions();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("do_21394995533381632011");

		getHomePageActions().clkOnCourseFirstResult();
		getTrainingPageActions().verifyTimerIsDisplayedInCourseTOC();

		getTrainingPageActions().leaveCourse();

		getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

	}
	
	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "Verify enrollment end date and course end date in Course details page")
	public void verifyEnrollmentEndDateCourseEndDateInCourseDetailsPage() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("do_21394997424403251217");

		getHomePageActions().clkOnCourseFirstResult();

		getTrainingPageActions().verifyCourseEndDateAndEnrollmentEndDateInACourse();

	}
	
	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "Verify no batches available message displays for expired batch and already joined course")
	public void verifyAlreadyJoinedCourseAndBatchExpiredWithNoBatchesAvailableMessage() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 8, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 8, 3);

		QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("do_21302012949445836811002");

		getHomePageActions().clkOnCourseFirstResult();

		getTrainingPageActions().verifyCourseWithEnrollmentEndDateIsOver();

	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
			description = "verify enrollment date has passed and no batches available message displays in course ")
	public void verifyEnrollmentEndDateOverMsgInCourse() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);
		String course = QXClient.get().excelUtils().getCellValue("Excel1","TestData",12,2);
		
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(course);

		getHomePageActions().clkOnCourseFirstResult();

		getTrainingPageActions().verifyEnrollmentEndedMsgAndNoBatchesAvailableMsg();

	}

}
