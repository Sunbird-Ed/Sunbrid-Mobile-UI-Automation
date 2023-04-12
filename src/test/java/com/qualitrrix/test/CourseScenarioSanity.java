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

			String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
			String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


			getLoginPageActions().loginToTheUser(Username,Password);

			DikshaMainPageActions d=new DikshaMainPageActions();
			QXClient.get().gestures().closeApp();
			d.LaunchAppHomeScreen();
			getHomePageActions().tapOnDownloadTab();

			getHomePageActions().tapOnProfileTab();



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
	          description = "Guest user is able UnEnroll from Course.")
	  public void ConsumeCourseUsingTextBook() throws Exception {

		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
	  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String CourseUsingTextBook=QXClient.get().excelUtils().getCellValue("Excel1","TestData",29,2); 
		  

	  	 getHomePageActions().tapOnTrainingTab();
	       
	       getHomePageActions().tapOnSearchIcon();
	       getHomePageActions().enterTextInSearchBar(CourseUsingTextBook);
	       getTrainingPageActions().tapOnSearchedCourse();
	  
	 	 
	  }
		
	
	  
	  @Author(name="Raju")
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
	public void CourseProgressUpdate() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	
		  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);	  

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
	  
	  
	  getCoursePageActions().tapOnChangeUser(); 
	  
	  getCoursePageActions().tapOnTermsAndCondition();
	  
	  getCoursePageActions().tapOnContinueForSwicthUser();
	  
	  
	  DikshaMainPageActions d2=new DikshaMainPageActions();
	  QXClient.get().gestures().closeApp();  
	    d2.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();
	  
	  
	  
	  getHomePageActions().tapOnProfileTab();
	//  getHomePageActions().tapOnProfileTab();

	  getHomePageActions().tapOnTrainingTab();



	  
		  
		       getHomePageActions().tapOnSearchIcon();
		       getHomePageActions().enterTextInSearchBar(coursefetch);

		       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		 	getTrainingPageActions().consumCourseContent();
		 	
		  

	}

	  
	  @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "validatecourselogin")
		public void displayLoginPoupEnroll() throws Exception {
			QXClient.get().driver();
			 getDikshaMainPageActions().performUserOnBoarding();
		  	 getHomePageActions().tapOnTrainingTab();
			 getCoursePageActions().validatecourselogin();
			 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			   		  properties.getProperty("excelpath"));
			   		 
			   		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			   		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
				String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
				
		   		 getLoginPageActions().tapOnLoginBtnInCourseTab(Username,Password);
				
			 }

			 @Test()
			 public void verifyUserAbleToEnableDisableDebugMode() throws Exception {

	     QXClient.get().driver();
	     getDikshaMainPageActions().performUserOnBoarding();
	     getHomePageActions().tapOnProfileTab();

	     getHomePageActions().verifyEnableDisableDebugMode();


	    }

	  @Test()
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

		  String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		  String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		  getLoginPageActions().loginToTheUser(Username, Password);

		 // getHomePageActions().tapOnDownloadTab();

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
		  getHomePageActions().enterTextInSearchBar("limited course");
		  //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited course");
		  getTrainingPageActions().tapOnQuestionSetCourse();

		  getTrainingPageActions().tapOnJoinTraining2();

		  getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

}

	@Test()
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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

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

   getLibraryPageActions().verifyShareBeforeEnrollCourse();

   getTrainingPageActions().tapOnJoinTraining2();

   getLibraryPageActions().verifyShareAfterEnrollCourse();


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


	@Test()
	public void verifyBMCSandEnrollmentEndDateInCourseDetails() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnDownloadTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String CourseName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",48,2);
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(CourseName);

		getTrainingPageActions().tapOnSearchedCourse2();

		getTrainingPageActions().verifyCourseDetails();

	}

	@Test()
	public void verifyTimerIsDisplayedPostJoinCourseWhichExpiresInTwoDays() throws Exception {

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
		DikshaMainPageActions d=new DikshaMainPageActions();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("CourseExpireInTwoDays");

		getTrainingPageActions().tapOnSearchedCourse3();
		getTrainingPageActions().verifyTimerIsDisplayedInCourseTOC();

		getTrainingPageActions().leaveCourse();

		getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

	}

	@Test()
	public void verifyEnrollmentEndDateCourseEndDateInCourseDetailsPage() throws Exception {

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
	public void verifyAlreadyJoinedCourseAndBatchExpiredWithNoBatchesAvailableMessage() throws Exception {

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
	public void verifyEnrollmentEndDateOverMsgInCourse() throws Exception {

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

}
