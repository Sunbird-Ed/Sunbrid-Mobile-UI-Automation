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

public class ProfileP1 {

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
	    public void verifyStateDistrictBlockClusterAndSchoolDisplayedProperlyForHTAndOfficialsRole() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
	        Properties properties = QXClient.get().propUtils()
	                .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" + properties.getProperty("excelpath"));
	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",97, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",98, 2);
	        getLoginPageActions().loginToTheUserForLeader(Username,Password);

	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().verifyBlockTaggedToDistrictClusterTaggedToBlockAndSchoolTaggedToCluster();

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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",130,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",131,2);
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

	        QXClient.get().gestures().closeappandrelaunchapp();

	        getHomePageActions().tapOnProfileTab();

	        getCoursePageActions().validateMyDetailsTextReplacesSelfDeclaredInfoText();
	    }
	  @Test()
	    public void verifyValidatePopupDetailsForEmailFieldInSubmitDetailsPage() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",130,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",131,2);
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

	        getProfileEditPageActions().verifyValidateEmailIDPopupFields();
	    }
	  @Test()
	    public void verifyValidatePopupDetailsForMobileNumberFieldInSubmitDetailsPage() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",130,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",131,2);
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

	        getProfileEditPageActions().verifyValidateMobileNumberPopupFields();
	    }
	  
	  @Test()
	    public void verifySubmitDetailsButtonInProfilePageForNewlyCreatedCustodianUser() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",130,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",131,2);
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
	
	  @Test()
	    public void verifyMyLearningSectionDetailsForCourses() throws Exception {

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

	        getCoursePageActions().verifyMyLearningSectionDetails();



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

	        getHomePageActions().tapOnProfileTab();

	        getCoursePageActions().verifyOngoingAndCompletedCoursesUnderMyLearning();

	        getCoursePageActions().verifyMoreBtnAndCoursesUnderMoreBtnInProfile();

	    }

	  @Test()
	    public void validateUpdatedDeclarationInSubmitDetails () throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 59, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 60, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username, Password);
	        QXClient.get().gestures().BlindWait(2000);

	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        QXClient.get().gestures().BlindWait(5000);
	       
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().BlindWait(4000);

	        getProfileEditPageActions().verifyUpdateConsentWithDifferentOrganization();

	        getProfileEditPageActions().updateWithOldConsentOrgAndVerify();

	    }

	  @Test()
	    public void userAbleToSubmitDetailsWithoutAddingPhoneNumberAndVerifyUpdateBtnPostSubmit() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",141,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",142,2);
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

	        getCoursePageActions().userAbleToSubmitDetailsWithoutAddingPhoneNumber();

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

			String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",128,2);
			String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",129,2);
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
	        QXClient.get().gestures().BlindWait(4000);
	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        QXClient.get().gestures().BlindWait(4000);

	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().BlindWait(4000);
	        getProfileEditPageActions().verifyProfileAfterEditing();

	        getProfileEditPageActions().recheckLocationDetailsEditableInProfile();
	        QXClient.get().gestures().BlindWait(4000);

	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        QXClient.get().gestures().BlindWait(4000);

	        
	        
	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().recheckProfileAfterEditing();
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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",139, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",140, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnProfileTab();

        getHomePageActions().validateSectionsUnderContentPreferenceInProfilePage();
    }
	
	
	 @Test()
	    public void verifyStateAndDistrictDisplayedForStudentInProfilePage() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoardingWithStudent();

	        getHomePageActions().tapOnProfileTab();
	        getHomePageActions().verifyLoginOptionIsPresentForStudent();

	        getProfileEditPageActions().verifyOnlyStateAndDistrictValuesPresentInProfilePage();

	    }
	 
	 @Test()
     public void verifyPrefilledMobileIDInUserDeclarationForm() throws Exception {
             QXClient.get().driver();
             getDikshaMainPageActions().performUserOnBoarding();
             getHomePageActions().tapOnProfileTab();
             QXClient.get().gestures().swipeUp();
             QXClient.get().gestures().swipeUp();
             Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                             properties.getProperty("excelpath"));
             String fetchExcelPathFromConfig=properties.getProperty("excelpath");
             QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

             String Username =QXClient.get().excelUtils().getCellValue("Excel1","Profile",40,2);
             String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Profile",41,2);
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

             getCoursePageActions().verifymobileIdPrefilledInUserDeclarationForm();
     }
	 
	 @Test()
	    public void verifycertificatedownloadinprofile() throws Exception {
	       QXClient.get().driver();
	       getDikshaMainPageActions().performUserOnBoarding();
	       getHomePageActions().tapOnProfileTab();


	       Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	             properties.getProperty("excelpath"));

	       String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	       QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	       String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
	       String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);

	       QXClient.get().gestures().swipeUp();
	       QXClient.get().gestures().swipeUp();
	       getLoginPageActions().loginToTheUser(Username,Password);
	       DikshaMainPageActions d=new DikshaMainPageActions();
	       QXClient.get().gestures().closeApp();
	       d.LaunchAppHomeScreen();
	       //getHomePageActions().tapOnDownloadTab();


	       getHomePageActions().tapOnProfileTab();
	       QXClient.get().gestures().BlindWait(5000);


	       getCoursePageActions().verifylearnerpassbook2();
	       getCoursePageActions().verifydownloadcertificate();


	    }

	 @Test()
     public void ValidateSubmitDetailsPageinProfilePage() throws Exception {
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

             String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Profile", 5, 2);
             String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Profile", 6, 2);
             QXClient.get().gestures().swipeUp();
             QXClient.get().gestures().swipeUp();
             getLoginPageActions().loginToTheUser(Username, Password);

             QXClient.get().gestures().BlindWait(4000);
             DikshaMainPageActions d = new DikshaMainPageActions();
             QXClient.get().gestures().closeApp();
             d.LaunchAppHomeScreen();
             getHomePageActions().tapOnDownloadTab();

             getHomePageActions().tapOnProfileTab();

             getCoursePageActions().VerifySubmitDetailsForm();
     }

}
	

