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

public class CourseConsumption2 {
	
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
	    public void validateNoCertificateMsgINCourseTOC() throws Exception {
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

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
	        getTrainingPageActions().tapOnSearchedCourse1();
	        getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

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


	   

	@Test(enabled = true, groups = { "SanityTest",
			"FunctionalTest" }, alwaysRun = true, description = "courseNameInProfileTab")
	public void courseNameInProfileTab() throws Exception {
		QXClient.get().driver();
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
		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();
		getCoursePageActions().verifyCoursesSectionInProfile();

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
	    public void verifyEnrolledCourseTrackableCollectionAndMyLearningSectionInHomePage() throws Exception {

	        QXClient.get().driver();
	        DikshaMainPageActions d = new DikshaMainPageActions();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 79, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 80, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().verifyEnrolledCourseAndTrackableCollectionUnderMyLearningSectionOfHomePage();

	        getHomePageActions().verifyUserAbleToConsumeEnrolledCourseFromMylearningSection();

	        d.LaunchAppHomeScreen();

	        getHomePageActions().verifyUserAbleToConsumeEnrolledTrackableCollectionFromMyLearningSection();


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
	    public void verifyUpNextContentAtTheEndPageOfTheQuestionSet() throws Exception {

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
	    public void verifyUserAbleToConsumeCourseWithQuestionSetSmoothly() throws Exception {

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

	        getTrainingPageActions().verifyUserAbleToConsumeCourseWithQSSmoothly();

	    }

    @Test()
    public void validateTimerNotDisplayedInCourseWithNoEndDate() throws Exception {

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
        getHomePageActions().enterTextInSearchBar("CourseWithNoEndDate");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseWithNoEndDate");
        getTrainingPageActions().tapOnSearchedCourse4();
        getTrainingPageActions().verifyTimerIsNotDisplayedInCourseTOC();

        getTrainingPageActions().leaveCourse();

        getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

    }
	
	  @Test()
	    public void validateTimerDisplayedInCourseExpireInTwoDays() throws Exception {

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
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseExpireInTwoDays");
	        getTrainingPageActions().tapOnSearchedCourse3();
	        getTrainingPageActions().verifyTimerIsDisplayedInCourseTOC();

	        getTrainingPageActions().leaveCourse();

	        getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

	    }
	
	@Test()
	public void verifyCourseIsNotHavingCertificateMsg() throws Exception {
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

		// getHomePageActions().tapOnDownloadTab();

		// getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);

		// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getTrainingPageActions().tapOnSearchedCourse1();
		getTrainingPageActions().verifyCertificateDetailsBeforeJoinCourse();

		getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

	}

	
	 @Test()
	    public void verifyUserNotAbleToSeeLastUpdatedMsgPostUnenrolledFromCourse() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnDownloadTab();
	        getHomePageActions().tapOnProfileTab();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",122,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String  CourseName=QXClient.get().excelUtils().getCellValue("Excel1", "TestData",127,2);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(CourseName);

	        getTrainingPageActions().tapOnUpdatedCourseContent();
	        getTrainingPageActions().verifyCourseUpdatedMessageWithDate();

	        getTrainingPageActions().leaveCourse();

	        getTrainingPageActions().verifyCourseModificationMessageIsNotDisplayed();

	        getTrainingPageActions().tapOnJoinTraining2();
	        getTrainingPageActions().verifyCourseUpdatedMessageWithDate();


	    }

	 @Test()
	    public void verifyLastUpdatedMessageIsNotDisplayedWhenUserNotJoinedTheCourse() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();
	        getHomePageActions().tapOnDownloadTab();
	        getHomePageActions().tapOnProfileTab();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String  CourseName=QXClient.get().excelUtils().getCellValue("Excel1", "TestData",48,2);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        getLoginPageActions().loginToTheUser(Username,Password);
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();

	        getHomePageActions().enterTextInSearchBar(CourseName);

	        getTrainingPageActions().tapOnSearchedCourse2();

	        getTrainingPageActions().verifyCourseModificationMessageIsNotDisplayed();

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

	
	 @Test()
	    public void verifySameCourseProgressPostLeaveAndRejoinTheCourse() throws Exception {
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

	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("AutoManjunathCourse");

	        getTrainingPageActions().tapOnSearchedSmallCourse1();

	        getTrainingPageActions().verifyCourse50percentCompleted();

	        getTrainingPageActions().leaveCourse();

	        getTrainingPageActions().verifySameCourseProgressAfterRejoiningConsumedCourse();

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
    public void verifyUserAbleDownloadAndPlayCourseContent() throws Exception {
        QXClient.get().driver();

        System.out.println("verify verifyUserAbleToEnrodllConsumeCourseContent");

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


@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
public void verifyCertificateDetailsPreAndPostConsumeCourse() throws Exception {

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
    String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 54, 2);

    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    getLoginPageActions().loginToTheUser(Username, Password);

    DikshaMainPageActions d=new DikshaMainPageActions();
    QXClient.get().gestures().closeApp();
    d.LaunchAppHomeScreen();
    getHomePageActions().tapOnDownloadTab();

    getHomePageActions().tapOnProfileTab();

    getHomePageActions().tapOnTrainingTab();

    getHomePageActions().tapOnSearchIcon();
    getHomePageActions().enterTextInSearchBar(coursefetch);

    //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
    getTrainingPageActions().tapOnSearchedSmallCourse();
    getTrainingPageActions().verifyCertificateDetailsBeforeJoinCourse();

    getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

    getTrainingPageActions().consumeSmallCourse();

    getTrainingPageActions().verifyCourseCompletedMsg();

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
    public void verifyExpiredCourses() throws Exception {
        QXClient.get().driver();

        System.out.println("verify verifyUserAbleToEnrodllConsumeCourseContent");

    }

  

	
	
	
	
	
	
	
	
	
	
}
