

package com.qualitrrix.test.regression;

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

public class UOScenario {

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

 
	
	

	
    @Author(name="Raju")
    
	    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,description = "Verify updateProfileDetails")
	  public void verifyCustodianUserIsAbleToUpdateTheProfile() throws Exception {
	    
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

	  		  
	 		  getHomePageActions().tapOnProfileTab();
	 		  QXClient.get().gestures().swipeUp();
			  QXClient.get().gestures().swipeUp();

			  getCoursePageActions().updateProfileDetails();
	  	
	  	  
	 }
	
    @Author(name="Raju")
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,description = "Verify updateUserOnBoardingValues")
  public void updateUserOnBoardingValues() throws Exception {
    
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

  		  
 		  getHomePageActions().tapOnProfileTab();
			  QXClient.get().gestures().swipeUp();
			  QXClient.get().gestures().swipeUp();

  		getCoursePageActions().updateProfileDetails();
  	
  	  
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



			  /*
		 * @Author(name="Raju")
		 * 
		 * @Test() public void VerifyAddUser() throws Exception {
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
		 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
		 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
		 * getLoginPageActions().loginToTheUser(Username,Password);
		 * 
		 * getHomePageActions().tapOnMenuBar();
		 * getCoursePageActions().tapOnAddAnotherUser();
		 * 
		 * String FakeName=QXClient.get().gestures().generateRandomName(); String
		 * storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
		 * System.out.println(storeFakeNameEntered);
		 * getCoursePageActions().tapOnAddUserBtn();
		 * getHomePageActions().tapOnMenuBar();
		 * 
		 * getCoursePageActions().tapOnMoreOption();
		 * QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
		 * 
		 * 
		 * getCoursePageActions().tapOnChangeUser();
		 * 
		 * getCoursePageActions().tapOnTermsAndCondition();
		 * 
		 * getCoursePageActions().tapOnContinueForSwicthUser();
		 * 
		 * getHomePageActions().tapOnProfileTab();
		 * getHomePageActions().tapOnProfileTab();
		 * 
		 * 
		 * getCoursePageActions().verifyDistricAndState();
		 * 
		 * getCoursePageActions().verifyBMCValuesAfterAddingUser();
		 * getCoursePageActions().updateStateAndDistrictValues();
		 * 
		 * getCoursePageActions().updateProfileDetails();
		 * 
		 * 
		 * }
		 */

	   
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
					  getHomePageActions().tapOnDownloadTab();

				  
				  getHomePageActions().tapOnMenuBar();
				  getCoursePageActions().tapOnMoreOption();
				  getCoursePageActions().clickFirstUser();
			 getCoursePageActions().tapOnChangeUserWithoutProfile();
			 getCoursePageActions().CheckTermsCheckBoxORClickProfile();
			 d.LaunchAppHomeScreen();
			 getHomePageActions().tapOnProfileTab();
			 getCoursePageActions().verifyDistricAndState();
				  
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
					public void verifyUserAbleToViewFAQquestions() throws Exception {
					  
						  QXClient.get().driver();
						  getDikshaMainPageActions().performUserOnBoarding();
						  getHomePageActions().tapOnProfileTab();
						 
					  getHomePageActions().tapOnMenuBar();
					  getHomePageActions().verifyHelpSection();
					  
					}

				// WithOut login Scenrio
				@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDataSync")
				public void VerifyNotficationBellIcon() throws Exception {
					QXClient.get().driver();
					getDikshaMainPageActions().performUserOnBoarding();

					getLibraryPageActions().verifyDataSyncs();

				}

      
				@Test()
				public void verifySwitchToNewExperiencePostOnboarding() throws Exception{
				   QXClient.get().driver();

				   getDikshaMainPageActions().performUserOnBoardingForExistingUser();

				   getHomePageActions().tapOnProfileTab();
				}
				@Test()
				public void verifyMergeAccountInSettingScreen() throws Exception {
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
				public void verifyAlreadyRegisteredEmailMessage() throws Exception {

				   QXClient.get().driver();
				   getDikshaMainPageActions().performUserOnBoarding();
				   getHomePageActions().tapOnProfileTab();

				   QXClient.get().gestures().swipeUp();
				   QXClient.get().gestures().swipeUp();

				   getLoginPageActions().verifyRegisteredEmailMessageWhileRegistering();

				   
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
				public void verifyUserAbleToChangePermissions() throws Exception {
				   QXClient.get().driver();
				   getDikshaMainPageActions().performUserOnBoarding();
				   getHomePageActions().tapOnProfileTab();

				   getHomePageActions().tapOnMenuBar();

				   getHomePageActions().verifyUserCanChangePermissions();

				   QXClient.get().gestures().clkBackButton();

				   QXClient.get().gestures().clkBackButton();

				   
				}
				
				@Test()
				public void verifyUserAbleToChangeAppLanguageInMenu() throws Exception {
				   QXClient.get().driver();
				   getDikshaMainPageActions().performUserOnBoarding();
				   getHomePageActions().tapOnProfileTab();

				   getHomePageActions().tapOnMenuBar();

				   getHomePageActions().verifyUserAbleToChangeAppLanguage();

				}

	@Test()
	public void validateErrorMessageInRegisterHerePage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().verifyRegisterHerePage();


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
	public void verfiyUserAbleToSelectMultipleSubjectsWhileReportAnIssue() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyReportIssueInHelpSection();


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
	public void verifyAll5LocationFieldsAreEditable() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyEditAll5LocationFields();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyProfileAfterEditing();

		getProfileEditPageActions().recheckLocationDetailsEditableInProfile();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().recheckProfileAfterEditing();
	}

	@Test()
	public void verifyMandatorySubPersonaForHeadTeacherRole() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyMandatorySubpersona();

	}

	@Test()
	public void verifyChangeRoleAndSubRole() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
		DikshaMainPageActions d=new DikshaMainPageActions();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().recheckLocationDetailsEditableInProfile();
	}


	@Test()
	public void updateBCSValuesInProfile() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyEditAll5LocationFields();
	}

	@Test(enabled = true,  alwaysRun = true,
			description = "Landed on Home page after changing Subrole in profile  ")
	public void verifyLandingOnHomePagePostChangeOfSubroleInProfile() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 43, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 44, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().changeSubRoleAndLandsOnHomePage();

		getHomePageActions().verifySectionsInHomePage();


	}

	@Test()
	public void validateSolutionForIncorrectProgressFAQ() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyHelpSection();

		getHomePageActions().verifyCoursesAndCertificatesSection();

	}

	@Test()
	public void verifyBrowseDIKSHAMsgAndWelcomeMsgInNewExperience() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoardingAndClickSwitchNewExperiecnceBtn();

		getHomePageActions().verifyHomePagePresentInsteadOfLibraryPage();

		getHomePageActions().verifyYourPreferencesMessage();

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
	public void verifyFAQSectionsInClassicAndJoyfulTheme() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyFAQsSectionInClassicThemeAndJoyFulTheme();

		QXClient.get().gestures().clkBackButton();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().changeToJoyfulTheme();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyFAQsSectionInClassicThemeAndJoyFulTheme();

	}

	@Test()
	public void verifyReportOtherIssueInClassicAndJoyfulTheme() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyReportIssueInHelpSection();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().changeToJoyfulTheme();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyReportIssueInHelpSection();

	}

	@Test()
	public void verifyVideoCategoryInHelpSectionForClassicAndJoyfulTheme() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyHelpPageForVideoRelatedCategoryInClassicAndJoyfulTheme();

		QXClient.get().gestures().clkBackButton();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().changeToJoyfulTheme();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyHelpPageForVideoRelatedCategoryInClassicAndJoyfulTheme();

	}


	@Test()
	public void verifyTextInRoleConfirmationAndLabelInEditLocationPage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().validateChooseContentPreferenceLabelInLocation();


	}

	@Test()
	public void verifyNoProfileDetailsLabelAndNoDeviceLocationForGuestUserInProfile() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyGuestUserProfilePageLabels();

	}


	@Test()
	public void verifySectionsUnderContentPreferenceLabelInProfile () throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().validateSectionsUnderContentPreferenceInProfilePage();
	}


	@Test()
	public void verifyMCSValueAfterOnboardingAndEditMCS() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyMCSValuesAfterOnboarding();

		getProfileEditPageActions().editMCSvaluesOfProfileAndVerify();

		getProfileEditPageActions().changeTheMCSValues();

		getProfileEditPageActions().verifyMCSValuesAfterOnboarding();

	}

	@Test()
	public void verifyBoardValuesAreInAlphabeticalOrder() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyBoardInAlphabeticalOrder();

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
	public void verifyDebugModeInSettings() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().verifyEnableDisableDebugMode();

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
	public void validateEmailAndNameIsNotRegisteredWithSunbirdMsg() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().validateErrorMessageForEmailAndName();

	}

	@Test()
	public void verifyMyLearnigSectionInProfile() throws Exception {
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
		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();


		getHomePageActions().tapOnProfileTab();
		getCoursePageActions().verifyCoursesSectionInProfile();


	}


	@Test()
	public void validateHomePageDetails() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",49,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",50,2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().veriyHomePageForDikshaNewExpreience();


	}


	@Test()
	public void validateCoursesUnderMoreBtnInMyLearningSectionOfProfile() throws Exception {

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

		//getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().verifyOngoingAndCompletedCoursesUnderMyLearning();

		getCoursePageActions().verifyMoreBtnAndCoursesUnderMoreBtnInProfile();

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
	public void verifyDikshaIDRemainsSameAfterRefresh() throws Exception {

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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyDikshaIDAndUserInProfilePage();

		getProfileEditPageActions().validateTwoCharactersOfUsernameAndDikshaIDAreSameInProfile();


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
	public void validateForgotTextIsReplacedByForgetPasswordText() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().verifyLoginPageTextAndForgotReplacedByForgetPassword();

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
	public void NoYOBPopupPostSwitchUser() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
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

		getHomePageActions().tapOnDownloadTab();


		getHomePageActions().tapOnMenuBar();
		getCoursePageActions().tapOnMoreOption();
		getCoursePageActions().clickFirstUser();
		getCoursePageActions().tapOnChangeUserWithoutProfile();
		getCoursePageActions().CheckTermsCheckBoxORClickProfile();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnProfileTab();
		getCoursePageActions().verifyDistricAndState();
		getProfileEditPageActions().verifyNoYOBpopupForAnyUser();

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
	public void validateDesignedForRoleSelectedTextUnderProgramsTile() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoardingAndClickSwitchToNewExperience();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",65,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",66,2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().verifyTextPostClickingProgramsTile();


	}

	@Test()
	public void validateErrorMessageForIncorrectMobileNoAndEmailAddressInSubmitDetailsPage() throws Exception {
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
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		//getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().verifyErrorMessageInSubmitDetails();
	}


	@Test()
	public void validateSubmitDetailsTextAndMyDetailsTextInProfile() throws Exception {
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
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		//getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().validateSubmitDetailsTextReplacesIamATeacherText();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyLogoutFromUser();

		DikshaMainPageActions d=new DikshaMainPageActions();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		String Username1 =QXClient.get().excelUtils().getCellValue("Excel1","TestData",59,2);
		String Password1 =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",60,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username1,Password1);

		//getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().validateMyDetailsTextReplacesSelfDeclaredInfoText();
	}


	@Test()
	public void validateUserIsNotAbleSubmitDetailsWithoutSelectingTCCheckBox() throws Exception {
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
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		//getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().verifyMandatoryTCFieldAndUserNotAbleSubmitDetailsWithoutSelectingTCCheckbox();
	}

	@Test()
	public void validateNoLocationIsAssociatedToSubOrgForUser() throws Exception {
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

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyNoLocationIsAssociatedToSubOrgForUser();


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
	public void verifyAdminUserAskedToForMandatoryTermsAndConditionInRegisterHerePage() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoardingWithLeader();

		getLoginPageActions().verifyRedirectedToLoginPagePostSelectingUsertypeAdmin();

		getLoginPageActions().verifyMandatoryTermsAndConditionsInRegisterHere();


	}

	@Test()
	public void verifyStateAndDistrictDisplayedForStudentInProfilePage() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoardingWithStudent();

		getHomePageActions().tapOnProfileTab();
		getHomePageActions().verifyLoginOptionIsPresentForStudent();

		getProfileEditPageActions().verifyOnlyStateAndDistrictValuesPresentInProfilePage();

	}

	
}

    
    
    

