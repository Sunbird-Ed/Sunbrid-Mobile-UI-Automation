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
	/*Script: verifyStateDistrictBlockClusterAndSchoolDisplayedProperlyForHTAndOfficialsRole
	Description:
			1. Verify that updated field values should reflect on profile page
			2. Verify that Blocks will be tagged to district, cluster to block and school to cluster.
	*/
	  @Test()
	    public void verifyStateDistrictBlockClusterAndSchoolDisplayedProperlyForHTAndOfficialsRole() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
	        Properties properties = QXClient.get().propUtils()
	                .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" + properties.getProperty("excelpath"));
	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7, 3);

	        getLoginPageActions().loginToTheUserForLeader(Username,Password);

	        getHomePageActions().tapOnProfileTab();
	        getProfileEditPageActions().verifyBlockTaggedToDistrictClusterTaggedToBlockAndSchoolTaggedToCluster();

	    }
/* Script: verifyValidatePopupDetailsForEmailFieldInSubmitDetailsPage
Description: 1.Verify post entering the valid mobile number and clicking on validate button, Validate Phone number popup is displayed as below:
Validate Mobile Nnumber(Label)

You will recieve an SMS with the OTP for mobile number verification (text)
 Enter OTP
 Enter OTP (text field)
Resend OTP link
Submit(button)
Cancel(button)
 */
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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);
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
/* Script:verifyValidatePopupDetailsForMobileNumberFieldInSubmitDetailsPage
 Description: Verify post entering the valid mobile number and clicking on validate button, Validate Phone number popup is displayed as below:

Validate Mobile Nnumber(Label)
You will recieve an SMS with the OTP for mobile number verification (text)
 Enter OTP
 Enter OTP (text field)
Resend OTP link
Submit(button)
Cancel(button)

 */
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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);


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
/* Script: verifySubmitDetailsButtonInProfilePageForNewlyCreatedCustodianUser
Description: Verify that new custodian user will get the "Submit details" button in profile page for the user declaration and consent for organization/ tenant/ channel level
 */
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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);
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
		/* Script: verifyMyLearnigSectionInProfile
		Description:
		1. Verify, the profile is having one new section for course consumption details called My learning

        2. Verify, the My learning section have the counts of the total courses avialable under it
		 */
	  @Test()
	    public void verifyMyLearnigSectionInProfile() throws Exception {
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
		/* Script: verifyChangeRoleAndSubRole
		Description: Verify that Personas (Roles) and sub personas (Sub roles) will be tagged to state only and may vary from state to state
		 */

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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

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
		/* Script: verifyUserIsAbleToSignInToTheApp
		Description: Verify that Personas (Roles) and sub personas (Sub roles) will be tagged to state only and may vary from state to state
		 */
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

		   String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
	   String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	  getLoginPageActions().loginToTheUser(Username,Password);

	  }
	  /* Script: verifyMyLearningSectionDetailsForCourses
	  Description: "Verify that the below header is displayed in My learning section
1.Course
2. Batch
3. Status
4. Course Completion date"
	   */

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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);



	        getLoginPageActions().loginToTheUser(Username,Password);

	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnProfileTab();

	        getCoursePageActions().verifyMyLearningSectionDetails();
	  }
	  /*
	  Script: validateCoursesUnderMoreBtnInMyLearningSectionOfProfile
	  Description:
	  1. Verify, the  My learnings section have the course status as "Ongoing" & "Completed"
	  2. Verify, user is able to see the More button to expand the list of the courses available in courses section under profile
	   */

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

	       String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);


	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnProfileTab();

	        getCoursePageActions().verifyOngoingAndCompletedCoursesUnderMyLearning();

	        getCoursePageActions().verifyMoreBtnAndCoursesUnderMoreBtnInProfile();

	    }
/* Script: validateUpdatedDeclarationInSubmitDetails
Description:
1. Verify that user is able to change the declaration and consent for already submitted declaration and consent with different organization/ tenant/ channel
2. Verify that when user updates the declaration, the old declaration should be removed and new declaration should be added
3. Verify that when user updates the declaration, the Consent given for old org/tenant/channel should be REVOKED.
4. Verify that when user updates the declaration then the Consent should be updated for new org/tenant/channel.
 */
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

		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

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
/*
Script: userAbleToSubmitDetailsWithoutAddingPhoneNumberAndVerifyUpdateBtnPostSubmit
Description:
1. Verify that user can able to add email id in user declration form
2. "Verify that user got two new fields in user decalration form.
- Phone number
- Email id"
3. Verify that when user opens the declaration form by clicking on Submit details button and once the declaration is submitted user should be displayed with the toast message in the profile page
4. Verify that user is displayed with ""Update"" button in profile page after once the declaration is submitted
5. Verify, upon successful submission of the form user is able to get the message in the UI as ""Thank you for submitting your details
6. Verify, user is able to get the message as "Updated successfully" post clicking on update button in data submission form.
 */
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

          String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
          String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);


          QXClient.get().gestures().swipeUp();
          QXClient.get().gestures().swipeUp();
          getLoginPageActions().loginToTheUser(Username,Password);
          QXClient.get().gestures().BlindWait(4000);
          DikshaMainPageActions d=new DikshaMainPageActions();
          QXClient.get().gestures().closeApp();
          d.LaunchAppHomeScreen();
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
          getHomePageActions().tapOnDownloadTab();
          getHomePageActions().tapOnProfileTab();
          getCoursePageActions().VerifySubmitDetailsForm();
          getCoursePageActions().userAbleToSubmitDetailsWithoutAddingPhoneNumber();
      }
	  /* Script: verifyConsentFormInSubmitDetails
	  Description:
	  1. Verify that in mobile user is able to click on "Submit details" button in Profile page of the Logged in users (only if user is major ie; age>18)
	  2. Verify that user is displayed with consent form when clicked on Submit details button in Profile page  of the logged in users (only if user is major ie; age>18)
	  3. Verify that the Below fields are displayed in the Consent Form
Mandatory Field:
1.State/Org (Drop down , Single select on Master org list of Diksha)

Optional Field:
a. ID as requested by State/board/org
b.Mobile Phone for State/Org(Phone number validation via OTP)
c.Email ID for State/Org(Email ID validation via OTP)
4.Verify that user is displayed with the Check box to accept the Consent Form
	   */
	  @Test()
		public void verifyConsentFormInSubmitDetails() throws Exception {
			QXClient.get().driver();
			getDikshaMainPageActions().performUserOnBoarding();
			getHomePageActions().tapOnProfileTab();


			Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
					properties.getProperty("excelpath"));

			String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

			String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
			String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);
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
/* Script: verifyMandatorySubPersonaForHeadTeacherRole
Description: Verify that if existing user with user type student/teacher changes their persona to Head Teacher & Official in the profile page by clicking on Edit button, then user is displayed with the mandatory subpersona field
 */
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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnProfileTab();

	        getProfileEditPageActions().verifyMandatorySubpersona();

	    }
/* Script:verifyAll5LocationFieldsAreEditable
Description: Verify that for logged in users persona, sub persona and all 5 location (BMG etc) filed should be editable in profile page

 */

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

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",7,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7,3);

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

/* Script:verifySectionsUnderContentPreferenceLabelInProfile
Descrption: "Verify that in the profile page,

User is displayed with the label ""Content preference"" section with the following fields along with Edit button
a. Role, Subrole, District, State, [Block, Cluster, School] (if applicable)
b. Board, Medium, Class, Subject"
 */

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

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",5,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",5,3);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnProfileTab();

        getHomePageActions().validateSectionsUnderContentPreferenceInProfilePage();
    }
/* Script:  verifyStateAndDistrictDisplayedForStudentInProfilePage
Description: Verify that Only state/district will be asked after onboarding for teacher/student role in the location popup. Further in profile only state and district values are shown
 */

	 @Test()
	    public void verifyStateAndDistrictDisplayedForStudentInProfilePage() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoardingWithStudent();

	        getHomePageActions().tapOnProfileTab();
	        getHomePageActions().verifyLoginOptionIsPresentForStudent();

	        getProfileEditPageActions().verifyOnlyStateAndDistrictValuesPresentInProfilePage();

	    }
/* Script: verifyPrefilledMobileIDInUserDeclarationForm
Description: "Verify that if user has created account with phone number, then in user declaration form, this number should be prefilled

 */
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
             String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
             String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);


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
/* Script: verifycertificatedownloadinprofile
Description:
1.Verify that user is displayed with Certificate download option in Profile
2. Verify that user is able to see the Certificate in svg format.
3. Verify that the Certificate Downloaded should not be in Pdf/Png format"
 */
	 @Test()
	    public void verifycertificatedownloadinprofile() throws Exception {
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
	       //getHomePageActions().tapOnDownloadTab();


	       getHomePageActions().tapOnProfileTab();
	       QXClient.get().gestures().BlindWait(5000);


	       getCoursePageActions().verifylearnerpassbook2();
	       getCoursePageActions().verifydownloadcertificate();


	    }
		/* Script: ValidateSubmitDetailsPageinProfilePage
		Description:
		1. Verify, all users are able to see the Submit details button in profile page.
		 */
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

             String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
             String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);

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
	

