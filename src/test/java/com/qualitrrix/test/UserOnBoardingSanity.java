

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

public class UserOnBoardingSanity {

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

	   @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "verifyLoginOptionIsPresentForStudent")
	    public void studentLoginOption() throws Exception {
	    	  QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoardingWithStudent();
			  
			  getHomePageActions().tapOnProfileTab();
			  getHomePageActions().verifyLoginOptionIsPresentForStudent();

	    }
		@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Login with Gmail verification")
	    public void userLoginWithGmail() throws Exception {
			  
			    QXClient.get().driver();
			    getDikshaMainPageActions().performUserOnBoarding();
			  
		        getHomePageActions().tapOnProfileTab();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();

	            getHomePageActions().signInWithGoogle();
	            getHomePageActions().enterGmailDetailsAndVerfiyUsrnameInProfileSec();

	    }

		 @Author(name="Raju")
		  		  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
				  description = "Verify district, state and BMC values after adding the managed user")
		  public void VerifyAddUser() throws Exception {
	  	
			  QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoarding();
			  getHomePageActions().tapOnProfileTab();
			  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
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
		      getCoursePageActions().tapOnAddUserBtn();
		      QXClient.get().gestures().BlindWait(4000);

		      QXClient.get().gestures().closeApp();
		      d.LaunchAppHomeScreen();
		  
		      getHomePageActions().tapOnMenuBar();
		      getCoursePageActions().tapOnMoreOption();
		      QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
			  getCoursePageActions().tapOnChangeUserWithoutProfile();
			  getCoursePageActions().tapOnTermsAndCondition();
			  getCoursePageActions().tapOnContinueForSwicthUser();

		      d.LaunchAppHomeScreen();

			  getHomePageActions().tapOnDownloadTab();
			  getHomePageActions().tapOnProfileTab();
		      getHomePageActions().tapOnProfileTab2();

		      getCoursePageActions().verifyDistricAndState();
		  
		      getCoursePageActions().verifyBMCValuesAfterAddingUser();
			//getCoursePageActions().updateStateAndDistrictValues();

			//getCoursePageActions().updateProfileDetails();
		  }

		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
				  true, description = "Switch User In Menu")
				  public void SwicthUser() throws Exception {

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
			  QXClient.get().gestures().BlindWait(4000);
			  getHomePageActions().tapOnDownloadTab();

			 getHomePageActions().tapOnMenuBar();
			 getCoursePageActions().tapOnMoreOption();
			 getCoursePageActions().clickFirstUser();
			 getCoursePageActions().tapOnChangeUser();
			 getCoursePageActions().CheckTermsCheckBoxORClickProfile();
			 getCoursePageActions().verifyDistricAndState();
				  
	}

		  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
				  true, description = "verfiySubmitFormsInIamTeacher")
				  public void VerifySubmitForm() throws Exception {
					  QXClient.get().driver();
					  getDikshaMainPageActions().performUserOnBoarding();
					  getHomePageActions().tapOnProfileTab();
			          QXClient.get().gestures().swipeUp();
			          QXClient.get().gestures().swipeUp();
					  
					  
					  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
					  properties.getProperty("excelpath"));
					  
					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
					  
					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",8,2);
					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",8,3);
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
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			  true, description = "Verify Course learning section in Profile")
			  public void MyLearningSecInProfile() throws Exception { 
				  QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoarding();
			  getHomePageActions().tapOnProfileTab();

			  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

			  QXClient.get().gestures().swipeUp();
	          QXClient.get().gestures().swipeUp();
			  getLoginPageActions().loginToTheUser(Username,Password);
			  DikshaMainPageActions d=new DikshaMainPageActions();
			  QXClient.get().gestures().closeApp();  
			  d.LaunchAppHomeScreen();
			  getHomePageActions().tapOnDownloadTab();
			  getHomePageActions().tapOnProfileTab();
			  getCoursePageActions().verifyCoursesSectionInProfile();
	}
	
	// WithOut login Scenario
	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDataSync")
	public void verifyDataSync() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getLibraryPageActions().verifyDataSyncs();
	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "ShareDikshaApp")
	public void ShareSunbirdApp() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getLibraryPageActions().shareDikshaApp();
		getLibraryPageActions().tapOnShareBtnFrmSharePop();
		getLibraryPageActions().tapOnShareToWhatsApp();
		getLibraryPageActions().verifyWhatsAppHomePage();
	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDeviceID")
	public void verifyDeviceID() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getLibraryPageActions().verifyDeviceIDAndShareDeviceID();
		getLibraryPageActions().tapOnShareToWhatsApp();
		getLibraryPageActions().verifyWhatsAppHomePage();
	}

	 @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Verify user is able to change the app language")
	    public void userIsAbleToChangeTheAppLang() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		    	 
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
		  String KannadaText =QXClient.get().excelUtils().getCellValue("Excel1","TestData",4,2);
		  getHomePageActions().tapOnMenuBar();

		  getHomePageActions().tapOnLanguage();
		  getHomePageActions().tapOnKannadaLanguage();
		  getHomePageActions().tapOnContinueBtnKannada();
	        
		  DikshaMainPageActions d2=new DikshaMainPageActions();
	  	  QXClient.get().gestures().closeApp();
			d2.LaunchAppHomeScreen();
			getHomePageActions().tapOnDownloadTab();
	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().verifyKanndaTextChanged(KannadaText);
	    }
	 @Author(name="Raju")
	  
	  @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
			  description = "Verify user is able to create a group")
          public void CreateGroup() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	      getLoginPageActions().loginToTheUser(Username,Password);
	      DikshaMainPageActions d=new DikshaMainPageActions();
		  QXClient.get().gestures().closeApp();
		  d.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();
	      getHomePageActions().tapOnMenuBar();

		  getHomePageActions().createGrupAndActivity();
	  
}
		@Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
				description = "Verify user is able to share Diksha ID")
		  public void ShareDikshaID() throws Exception {
		    
		  	  QXClient.get().driver();
		  	  getDikshaMainPageActions().performUserOnBoarding();
		  	  getHomePageActions().tapOnProfileTab();

		  	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  			  properties.getProperty("excelpath"));
				String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

						String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		  			    String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

		  			    QXClient.get().gestures().swipeUp();
		  		        QXClient.get().gestures().swipeUp();

		  		  getLoginPageActions().loginToTheUser(Username,Password);
		  		  
		  		     DikshaMainPageActions d=new DikshaMainPageActions();
					 QXClient.get().gestures().closeApp();
				     d.LaunchAppHomeScreen();
				     QXClient.get().gestures().BlindWait(4000);
					 getHomePageActions().tapOnDownloadTab();
		  		     getHomePageActions().tapOnProfileTab();

					   getHomePageActions().shareDikshaIDProfileSec();
		  	           getLibraryPageActions().tapOnShareToWhatsApp();
		  		       getLibraryPageActions().verifyWhatsAppHomePage();
		  	  
		 }	

	 @Author(name="Raju")
	  
	  @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
			  description = "Verify add user limit message ")
	      public void AddUserLimitMsg() throws Exception {
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",9,2);
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",10,2);
		  
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	      getLoginPageActions().loginToTheUser(Username,Password);
	      DikshaMainPageActions d=new DikshaMainPageActions();

          QXClient.get().gestures().closeApp();
	      d.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();
	      getHomePageActions().tapOnMenuBar();

	      getCoursePageActions().verifyAddAnotherUserIsDisplayed();
	      getCoursePageActions().tapOnAddAnotherUser();
	      String FakeName=QXClient.get().gestures().generateRandomName();
	      String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	      System.out.println(storeFakeNameEntered);
	      getCoursePageActions().tapOnAddUserBtn();
	      getCoursePageActions().verifyMsgAddingUser();
	  
	}

    @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify enabling and disabling the discussion and then deleting the Group")
    public void verifyEnalbeDisccusion() throws Exception {
    	  
    		  QXClient.get().driver();
    		  DikshaMainPageActions d=new DikshaMainPageActions();
    		  getDikshaMainPageActions().performUserOnBoarding();
    		  getHomePageActions().tapOnProfileTab();

    		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
    		  properties.getProperty("excelpath"));
    		  
    		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
    		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
    		  
    		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
    		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
    		  QXClient.get().gestures().swipeUp();
    		  QXClient.get().gestures().swipeUp();

    	      getLoginPageActions().loginToTheUser(Username,Password);
	          QXClient.get().gestures().closeApp();
              d.LaunchAppHomeScreen();

    	      getHomePageActions().tapOnDownloadTab();
			  getHomePageActions().tapOnMenuBar();
			  getHomePageActions().createGrupAndActivity();
			  getHomePageActions().EnableDiscussion();
			 // getHomePageActions().startQuestionFill();
			  getHomePageActions().DisableDiscussion();
			  getHomePageActions().deleteGroup();
    }

	@Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify forum icon in course and Post, reply and saved post in discussion forum")
	public void JoinDiscusisonForum() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("do_2134101124514693121615");

		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationCourseForDF");

		getTrainingPageActions().tapOnSearchedCourseForDF();

		getHomePageActions().validateForumIconInCourse();

		getHomePageActions().validatePostReplyAndSavePost();

	}

    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
    	    description = "Delete the CreatedGroups")
    	public void DeletedCreatedGroups() throws Exception {
    	  QXClient.get().driver();
		  DikshaMainPageActions d=new DikshaMainPageActions();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();

		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	      getLoginPageActions().loginToTheUser(Username,Password);
	
          QXClient.get().gestures().closeApp();
          d.LaunchAppHomeScreen();
	      getHomePageActions().tapOnDownloadTab();
	      getHomePageActions().tapOnMenuBar();

	      getHomePageActions().createGrupAndActivity();
	
		  getHomePageActions().deleteGroup();
		  System.out.println("verify DeletedCreatedGroups   ");

    	}
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
    	    description = "LoginAsLeader Menu")
    	public void LoginAsLeader() throws Exception {
    	 
    	 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoardingWithLeader();
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",7,2);
				  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7,3);
				  
		  getLoginPageActions().loginToTheUserForLeader(Username,Password);
		  QXClient.get().gestures().closeApp();
		  DikshaMainPageActions d=new DikshaMainPageActions();
		  d.LaunchAppHomeScreen();
		  
		  getHomePageActions().verifySectionsInHomePage();
    	}

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
    	    description = "AddActivity Menu")
    	public void AddActivity() throws Exception {
    	 QXClient.get().driver();
    		 System.out.println("verify AddActivity");

    	}

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "switchingToManageLearnFromDifferentRole ")
	public void switchingToManageLearnFromDifferentRole() throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",7,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7,3);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
		//getHomePageActions().tapOnHomeTab();
		QXClient.get().gestures().closeappandrelaunchHomescreen();
		getHomePageActions().verifySectionsInHomePage();

		getHomePageActions().tapOnProfileTab();
		getProfileEditPageActions().changeStudentRole();
		getHomePageActions().tapOnProfileTab();
		getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
		//getHomePageActions().tapOnHomeTab();
		QXClient.get().gestures().closeappandrelaunchHomescreen();
		getHomePageActions().verifySectionsInHomePage();

		getHomePageActions().tapOnProfileTab();
		getProfileEditPageActions().changeParentRole();
		getHomePageActions().tapOnProfileTab();
		getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
		//getHomePageActions().tapOnHomeTab();
		QXClient.get().gestures().closeappandrelaunchHomescreen();
		getHomePageActions().verifySectionsInHomePage();

		getHomePageActions().tapOnProfileTab();
		getProfileEditPageActions().changeTeacherRole();

	}

    @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify close icon in Discussion forum")
    public void verifyCloseIconInDiscussionForum() throws Exception {
    	  
    		  QXClient.get().driver();
    		  DikshaMainPageActions d=new DikshaMainPageActions();
    		  getDikshaMainPageActions().performUserOnBoarding();
    		  getHomePageActions().tapOnProfileTab();
    		  
    		  
    		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
    		  properties.getProperty("excelpath"));
    		  
    		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
    		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
    		  
    		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
    		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
    		  QXClient.get().gestures().swipeUp();
    		  QXClient.get().gestures().swipeUp();

    	      getLoginPageActions().loginToTheUser(Username,Password);
	          QXClient.get().gestures().closeApp();
              d.LaunchAppHomeScreen();
    	      getHomePageActions().tapOnDownloadTab();

    	      getHomePageActions().tapOnMenuBar();

    	      getHomePageActions().createGrupAndActivity();
    	      getHomePageActions().EnableDiscussion();
    	      getHomePageActions().startQuestionFill();
    	      getHomePageActions().verifyCloseBtnDF();
    	      getHomePageActions().deleteGroup();

    } 
			 

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
    		  true, description = "verifyHomePageForNewDikshaExpreiecne ")
    		  public void verifyHomePageForNewSunbirdExpreiecne() throws Exception {
    			  QXClient.get().driver();
    		  getDikshaMainPageActions().performUserOnBoarding();
    		  getHomePageActions().tapOnProfileTab();
    			 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
    					  properties.getProperty("excelpath"));
    					  
    					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
    					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
    					  
    					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
    					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
    			
    					  QXClient.get().gestures().swipeUp();
    					  QXClient.get().gestures().swipeUp();
    			
    				  getLoginPageActions().loginToTheUser(Username,Password);
					  DikshaMainPageActions d = new DikshaMainPageActions();
		              QXClient.get().gestures().closeApp();
		              d.LaunchAppHomeScreen();
    				
    		          getHomePageActions().veriyHomePageForDikshaNewExpreience();

    		  }
   
  	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
  	  		  true, description = "EditCreatedProject ")
  	  		  public void EditCreatedProject() throws Exception {
  	  			  QXClient.get().driver();
  	  		  getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
  	  		//  getHomePageActions().tapOnProfileTab();
  	  			 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
  	  					  properties.getProperty("excelpath"));
  	  					  
  	  					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
  	  					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
  	  					  
  	  					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",7,2);
  	  					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7,3);
  	  			
//  	  					  QXClient.get().gestures().swipeUp();
//  	  					  QXClient.get().gestures().swipeUp();
  	  			
  	  				  getLoginPageActions().loginToTheUserForLeader(Username,Password);
		              QXClient.get().gestures().closeApp();
		               DikshaMainPageActions d=new DikshaMainPageActions();
		               d.LaunchAppHomeScreen();
  	  		           getHomePageActions().createNewProjects();
  	  		            getHomePageActions().editCreatedProjects();
  	  		  }
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			  true, description = "verifyLabelOnBoardingAndProfilePage")
			  public void verifyLabelOnBoardingAndProfilePage() throws Exception {
				  QXClient.get().driver();
				  getDikshaMainPageActions().performUserOnBoarding();
				  getHomePageActions().tapOnProfileTab();
				  getProfileEditPageActions().labelOnProfilePage();
				
			  }
	@Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify error message while merging the already merged custodian account")
	public void VerifyErrorMsgWhileMerging() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 5, 2);
		String ReviewerUsername =QXClient.get().excelUtils().getCellValue("Excel1","TestData",6,2);
		String ReviewerPassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",7,2);

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);

		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().validateErrorwhieMerging(ReviewerUsername,ReviewerPassword);

	}

		@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
				description = "verifyaddtasksection")
		public void verifyaddtasksection() throws Exception {
			QXClient.get().driver();
			 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
			Properties properties = QXClient.get().propUtils()
					.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" + properties.getProperty("excelpath"));
			String fetchExcelPathFromConfig = properties.getProperty("excelpath");
			QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5, 2);
			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5, 3);
			  getLoginPageActions().loginToTheUserForLeader(Username,Password);
			DikshaMainPageActions d = new DikshaMainPageActions();
			QXClient.get().gestures().closeApp();
			d.LaunchAppHomeScreen();
			getHomePageActions().creationoftask();
		}



		@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true,
				description = "verifyprogramnamespage")
		public void VerifyTargettProgram() throws Exception {
			QXClient.get().driver();
			 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
			Properties properties = QXClient.get().propUtils()
					.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" + properties.getProperty("excelpath"));
			String fetchExcelPathFromConfig = properties.getProperty("excelpath");
			QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5, 2);
			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5, 3);
			String programnameoftheuser = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
			
			getLoginPageActions().loginToTheUserForLeader(Username, Password);
			DikshaMainPageActions d = new DikshaMainPageActions();
			QXClient.get().gestures().closeApp();
			d.LaunchAppHomeScreen();
			 getHomePageActions().programList(programnameoftheuser);
		}
	  

		 @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
				 description = "Verify adding and removing member from group")
		 public void addMemberAndRemoveMember() throws Exception {
		 	  
		 		  QXClient.get().driver();
		 		  getDikshaMainPageActions().performUserOnBoarding();
		 		  getHomePageActions().tapOnProfileTab();

		 		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		 		  properties.getProperty("excelpath"));
		 		  
		 		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		 		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		 		  
		 		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		 		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
		 		  String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",8,2);

		 		  QXClient.get().gestures().swipeUp();
		 		  QXClient.get().gestures().swipeUp();

		 	      getLoginPageActions().loginToTheUser(Username,Password);
		 	      DikshaMainPageActions d=new DikshaMainPageActions();
		 	      QXClient.get().gestures().closeApp();
		 	      d.LaunchAppHomeScreen();
		 		  getHomePageActions().tapOnDownloadTab();

		 	      getHomePageActions().tapOnMenuBar();

		 	      getHomePageActions().createGrupAndActivity();
		 	      getHomePageActions().addMemberAndRemovemember(MemberIDValue);
		 	      getHomePageActions().deleteGroup();
		 }

		 @Test(enabled = true, groups = { "SanityTest",
	     "FunctionalTest" }, alwaysRun = true, description = "verifyScanQRAndSelectBoardWhileUserOnBoarding")
	public void verifyScanQRandSelectBoardAndNewTagAndUserLogin() throws Exception {

	  QXClient.get().driver();

	  getDikshaMainPageActions().verifyScanQRAndSelectBoardWhileUserOnBoarding();

	  getHomePageActions().tapOnDownloadTab();
	  QXClient.get().gestures().closeApp();

	  DikshaMainPageActions d = new DikshaMainPageActions();
	  d.LaunchAppHomeScreen();
	  getHomePageActions().tapOnDownloadTab();

	 // getHomePageActions().verifyNewTagForMyGroupsAndImportContent();

	  getHomePageActions().verifyUserLoginInHamburgerMenu();

	  getHomePageActions().tapOnProfileTab();

	  getHomePageActions().verifyUserLoginInProfile();

	   }
		 
		 
		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
				 description = "Verify updateProfileDetails")
		 public void updateTheProfileDetails() throws Exception {

		    QXClient.get().driver();
			 DikshaMainPageActions d=new DikshaMainPageActions();
		    getDikshaMainPageActions().performUserOnBoarding();
		    getHomePageActions().tapOnProfileTab();


		    Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		          properties.getProperty("excelpath"));

		    String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		    QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		    String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		    String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

		    QXClient.get().gestures().swipeUp();
		    QXClient.get().gestures().swipeUp();

		    getLoginPageActions().loginToTheUser(Username,Password);
			 QXClient.get().gestures().closeApp();
			 d.LaunchAppHomeScreen();

		    getHomePageActions().tapOnProfileTab();
		    QXClient.get().gestures().swipeUp();
		    QXClient.get().gestures().swipeUp();

		    getCoursePageActions().updateProfileDetails();

		    getHomePageActions().tapOnTrainingTab();
		    getHomePageActions().tapOnMenuBar();

		    getCoursePageActions().tapOnNewDikshaExperience();
		    getHomePageActions().tapOnProfileTab();
		    //QXClient.get().gestures().swipeUp();

		    getCoursePageActions().verifyUpdatedProfileDetailsInNewDikshaExperience();

		 }

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			true, description = "verifySearchPageForDikshaNewExpreiecne ")
	public void verifySearchPageForSunbirdNewExpreiecne()
			throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);
		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifySearchPageForDikshaNewExpreiecne();
		QXClient.get().gestures().swipeDown();

		getHomePageActions().verifyFiltersForPublishersAndApplyFilter();

		getHomePageActions().verifyContentPostFilterForSelectedPublisher();


	}
		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
		            description = "Verify Class And SeeMoreBooksContent in LibrarySection")
		    public void verifySeeMoreBooksContent() throws Exception {
		        QXClient.get().driver();
		        getDikshaMainPageActions().performUserOnBoarding();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
		        
		        getLibraryPageActions().verifyClassAndSeeMoreBooks();

		    }

		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			      description = "switchToDarkMode ")
			public void switchToDarkMode() throws Exception {
			   QXClient.get().driver();
			   getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();

			   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			         properties.getProperty("excelpath"));

			   String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

			   String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",7,2);
			   String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7,3);

			   getLoginPageActions().loginToTheUserForLeader(Username,Password);
			   QXClient.get().gestures().closeappandrelaunchHomescreen();

			 // getHomePageActions().verifyNewDikshaExperienceForHeadAndOfficials();

			   getHomePageActions().tapOnMenuBar();
			   QXClient.get().gestures().swipeUp();
			   getHomePageActions().verifyLogoutFromHeadAndOfficials();

			   getDikshaMainPageActions().performUserOnBoardingAfterSwitchingFromHTToTeacher();
			   QXClient.get().gestures().closeappandrelaunchHomescreen();

			   getHomePageActions().verifyDarkMode();
			}

		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
		         true, description = "createNewProject ")
		   public void createNewProject() throws Exception {
		      QXClient.get().driver();
		      getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
		      //  getHomePageActions().tapOnProfileTab();
		      Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		            properties.getProperty("excelpath"));

		      String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		      QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		      String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",7,2);
		      String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7,3);

//		                   QXClient.get().gestures().swipeUp();
//		                   QXClient.get().gestures().swipeUp();

		      getLoginPageActions().loginToTheUserForLeader(Username,Password);
			 DikshaMainPageActions d = new DikshaMainPageActions();
			 QXClient.get().gestures().closeApp();
			 d.LaunchAppHomeScreen();

		      getHomePageActions().createNewProjects();
		   }

		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
				 description = "Verify updateProfileDetails")
		 public void ValidateLocationfieldsinProfilePAge() throws Exception {
		 	QXClient.get().driver();

		 	getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();

		 	Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		 			properties.getProperty("excelpath"));

		 	String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		 	QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		 	String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",7,2);
		 	String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7,3);

		 	getLoginPageActions().loginToTheUserForLeader(Username,Password);

		 	QXClient.get().gestures().closeappandrelaunchapp();

		 	getHomePageActions().tapOnProfileTab();
		 	//QXClient.get().gestures().swipeUp();

		 	getCoursePageActions().ValidateLocationfieldsinProfilePAge();
		 	QXClient.get().gestures().closeappandrelaunchapp();

		 	getHomePageActions().tapOnProfileTab();
		 	getCoursePageActions().ValidateUpdatedLocationfieldsinProfilePage();

		 }

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify Profile Name Change Popup Should Get For Course")
	public void verifyProfileNameChangePopupShouldGetForCourse() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);
		String CourseName = QXClient.get().excelUtils().getCellValue("Excel1", "Course", 4, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(CourseName);
		getHomePageActions().clkOnCourseFirstResult();
		getHomePageActions().VerifyProfileNameChangePopupForCourse();
	}
	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify Profile Name Change Popup Should Get For Trackable Book")
	public void verifyProfileNameChangePopupShouldGetForTrackableBook() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);
		String Trackblebook = QXClient.get().excelUtils().getCellValue("Excel1", "Course", 8, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(Trackblebook);
		getHomePageActions().clkOnCourseFirstResult();
		getHomePageActions().VerifyProfileNameChangePopupFortrackablebook();
	}
		 
		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
				 description = "Verify User Is Able To Importcontent and Present In DownloadSection")
			public void verifyUserIsAbleToImportcontentandPresentInDownloadSection() throws Exception {

				QXClient.get().driver();
				DikshaMainPageActions d = new DikshaMainPageActions();
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
				d.LaunchAppHomeScreen();
				getHomePageActions().tapOnMenuBar();
				getHomePageActions().verifyUserIsAbleToImportcontentandPresentInDownloadSection();
			}
		 
		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
				 description = "Verify Profile Name Change Popup Should Get For Trackable collection")
			public void verifyProfileNameChangePopupShouldGetForTrackableCollection() throws Exception {

				QXClient.get().driver();
				DikshaMainPageActions d = new DikshaMainPageActions();
				getDikshaMainPageActions().performUserOnBoarding();
				getHomePageActions().tapOnProfileTab();


				Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
				System.out.println("@name:" +
						properties.getProperty("excelpath"));

				String fetchExcelPathFromConfig = properties.getProperty("excelpath");
				QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

				String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
				String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);
				String Trackblecollection = QXClient.get().excelUtils().getCellValue("Excel1", "Course", 9, 2);
				QXClient.get().gestures().swipeUp();
				QXClient.get().gestures().swipeUp();
				getLoginPageActions().loginToTheUser(Username, Password);

			    QXClient.get().gestures().closeApp();
			    d.LaunchAppHomeScreen();
				getHomePageActions().tapOnTrainingTab();
				getHomePageActions().tapOnSearchIcon();
				getHomePageActions().enterTextInSearchBar(Trackblecollection);
				getTrainingPageActions().tapOnSearchedtrackablecollectionwithprofilepopup();
				getHomePageActions().VerifyProfileNameChangePopupFortrackablecollection();
			}
		 
		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
				 description = "Verify BMC values after switch to new sunbird experience")
		 public void verifyCourseFiltersBMCvalues() throws Exception {
		     QXClient.get().driver();
		     getDikshaMainPageActions().performUserOnBoarding();
		     Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		     System.out.println("@name:" +
		           properties.getProperty("excelpath"));
		     String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		     QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		     String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		     String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);
		     getHomePageActions().tapOnProfileTab();
		     QXClient.get().gestures().swipeUp();
		     QXClient.get().gestures().swipeUp();
		     getLoginPageActions().loginToTheUser(Username, Password);
			 DikshaMainPageActions d = new DikshaMainPageActions();
			 QXClient.get().gestures().closeApp();
			 d.LaunchAppHomeScreen();
		     getHomePageActions().verifyCourseFilters();
		 }
}

    
    
    

