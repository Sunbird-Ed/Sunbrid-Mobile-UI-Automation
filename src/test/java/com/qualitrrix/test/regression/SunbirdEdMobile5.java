package com.qualitrrix.test.regression;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class SunbirdEdMobile5 {
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

    @Test()
    public void verifyThisContentCannotBeDownloadedMsgForLargeContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String largeVideoContent =QXClient.get().excelUtils().getCellValue("Excel1","TestData",91,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(largeVideoContent);

        getTrainingPageActions().tapOnLargeVideoContent();

        getDownloadPageActions().verifyDisabledDownloadBtnAndValidateMessagePostClickingDownloadBtn();

    }


    @Test()
    public void verifyUserAbleToLoginToTheSystemUsingUsernameExternalIDAndSchoolExternalID() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String externalID =QXClient.get().excelUtils().getCellValue("Excel1","TestData",92,2);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUserLoggedInSuccessfullyUsingStateSystem();

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
        getHomePageActions().enterTextInSearchBar("Practice Course");

        getTrainingPageActions().tapOnPracticeCourse();

        getTrainingPageActions().verifyNoAttemptsInCourseWithQuestionsetInPracticeMode();


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
        getHomePageActions().enterTextInSearchBar("limited course");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited course");
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
    public void verifyMalformedEcarFileWhileSharingViaSlackApp() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnShareBtn();
        getLibraryPageActions().tapOnSendFileFromSharePopup();
        getLibraryPageActions().tapOnSendBtnFromSharePopup();
        getLibraryPageActions().tapOnShareToSlackApp();
        getLibraryPageActions().verifySlackAppPage();
        QXClient.get().gestures().clkBackButton();

    }



    @Test()
    public void verifyNATextIsNotDisplayedInDownloadedCSVFileOfActivityDashboard() throws Exception {

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

        getHomePageActions().verifyMemberNameAndProgressInExcelPostClickingDownloadasCSV();

        getHomePageActions().verifyCourseNameMembersNameAndProgressInCSVFile();

        getHomePageActions().verifyNATextIsNotDisplayedInDownloadedCSVFile();

        QXClient.get().gestures().clkBackButton();

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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyUserAbleToConsumeCourseWithQSSmoothly();

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
    public void verifyNoYOBPopupForSSOUser() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 92, 2);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUserLoggedInSuccessfullyUsingStateSystem();

        getProfileEditPageActions().verifyNoYOBpopupForAnyUser();
    }


    @Test()
    public void verifyGlobalConsentPopupDetailsWhileConsumingACourseForNonCustodianUser () throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 93, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 94, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("CourseContent");

        getTrainingPageActions().tapOnSearchedCourse6();
        getTrainingPageActions().verifyConsentPopUpForCourse();

        getTrainingPageActions().leaveCourse();
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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyNextContentAtTheEndOfTheQuestionSet();

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

    @Test()
    public void verifyUserIDReplacedWithDikshaIDBelowUserNameInProfilePage() throws Exception {

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

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyUserIDReplacedWithDikshaIDBelowUserNameInProfilePage();
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
    public void verifyChooseContentPreferencesPageIsDisplayedProperly() throws Exception {
        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyChooseContentPreferencesLabelIsNotOverlapping();

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
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

    @Test()
    public void verifyUpdatedUIIsDisplayedToUserInDiscussionForum() throws Exception {

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

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().createGrupAndActivity();

        getHomePageActions().verifyLabelsUpdatedTextAndCTAButtonsInDF();

        getHomePageActions().verifyWatermarksInDF();

    }

    @Test()
    public void verifyUserAbleToConsumeCertificateCourseFromGroupActivity() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",47,2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().createGrupAndActivity();

        getHomePageActions().verifyActivityAndMemberAddedToTheGroup(MemberIDValue);

        getHomePageActions().enterTextInSearchBar("AutoSmallCourseWithCertificate");

        getHomePageActions().verifyAdminAbleToAddCertificateCourseToGroup();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().verifyUserAbleToConsumeCertificateCourseFromGroupActivity();

    }

    @Test()
    public void verifyUserAbleToMoveContentsToSDCardFromPhoneAndViceVersa() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnDownloadTab();

        getDownloadPageActions().verifyUserAbleToMoveContentsFromPhoneToSDCard();

        getDownloadPageActions().verifyUserAbleToMoveContentsFromSDcardToPhone();

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
    public void verifyLocationPopupIsNotDisplayedToLoggedSSOUser() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 92, 2);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);

        d.LaunchAppHomeScreen();

        getProfileEditPageActions().veriyNoLocationPopupWhenLoggedInWithSSOUser();
    }



    @Test()
    public void verifyLIUAAbleToAccessAllMUAAccountsInUsersList() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",95,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",96,2);

        getLoginPageActions().loginToTheUser(Username,Password);

        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnMoreOption();
        getCoursePageActions().clickFirstUser();
        getCoursePageActions().tapOnChangeUser();
        getCoursePageActions().CheckTermsCheckBoxORClickProfile();
        getCoursePageActions().verifyDistricAndState();
        getProfileEditPageActions().verifyLIUAShouldBeAbleToAccessAllMUAAccounts();

    }

    @Test()
    public void verifyUsageHistoryInLoggedInGmailAccount() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().signInWithGoogle();

        getHomePageActions().verifyNavigatedToGmailLoginPagePostClickingSignWithGoogle();

        getHomePageActions().enterGmailDetailsAndVerfiyUsrnameInProfileSec();

    }


    @Test()
    public void verifyNoBatchesAvailableMessageInAlreadyJoinedCourseAndBatchExpired() throws Exception {

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
    public void verifyResultsPageShouldNotLimitedToOnlyHundredContentsText() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("Course");

        getTrainingPageActions().verifyResultPageShouldNotLimitedTo100Contents();

    }


    @Test()
    public void verifyViewMoreButtonIsDisplayedAndClickableInSearchContentPage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("Course");

        getTrainingPageActions().verifyResultPageShouldNotLimitedTo100Contents();

        getTrainingPageActions().verifyViewMoreButtonIsDisplayedAndClickableInSearchContentPage();

    }


    @Test()
    public void verifyEnrollmentEndDatePassedMsgInCourse() throws Exception {

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
    public void verifyUserShouldNotNavigatedToRegistrationPageWhenSignInWithGoogleOldAccount() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().signInWithGoogle();

        getHomePageActions().verifyGmailUserShouldNotNavigatedToRegistrationPage();

    }



    @Test()
    public void verifyUserShouldNavigatedToRegistrationPageWhenSignInWithGoogleNewAccount() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().signInWithGoogle();

        getHomePageActions().verifyUserNavigatedToRegistrationPageForGmailUser();

    }


    @Test()
    public void verifyMandatoryStateAndDistrictPrefilledAndVerifyBackBtnDisplayed() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().signInWithGoogle();

        getHomePageActions().verifyPrefilledStateAndDistrictPostUpdatingNameAndDOBInRegistrationPage();

    }


    @Test()
    public void verifyUserAbleToNavigateBackFromOTPPageSuccessfully() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().signInWithGoogle();

        getHomePageActions().verifyPrefilledStateAndDistrictPostUpdatingNameAndDOBInRegistrationPage();

        getHomePageActions().verifyUserAbleToNavigateBackPostClickingDeviceBackBtn();

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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyNextContentAtTheEndOfTheQuestionSet();

    }

    @Test()
    public void verifyTitlesAndNamesDisplayedProperlyInAllPages() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 69, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 70, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().verifyMyLearnigSectionOfHomePage();


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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyNumberOfAttemptsIncreasesPostClickingReplay();

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
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

    @Test()
    public void verifyUserNotAbleToDownloadTheContentWithContentsizeMoreThan200MB() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("LargeSizeAutoBook");

        getTrainingPageActions().tapOnSearchedLargeSizeBook();

        getLibraryPageActions().verifyNoDownloadBtnForLargeSizeBook();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyNoDownloadsInDownloadSection();
    }

    @Test()
    public void verifyUserAbleToDownloadContentWithContentSizeLessThan200MB() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);


        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();

        getTrainingPageActions().waitTillTheDownloadButtonDisappears();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();


        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyTheDownloadedBook();
    }

    @Test()
    public void noTermsAndConditionsCheckboxIsDisplayedInSelfInfoSection() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


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

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyNoTermsAndConditionsCheckboxInUpdateSelfInfoSection();

    }

    @Test()
    public void verifyLatestPrivacyPolicyAndTCCheckBoxInSubmitDetailsPage() throws Exception {
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

        QXClient.get().gestures().BlindWait(4000);
        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnProfileTab();

        getCoursePageActions().VerifySubmitDetailsForm();

        getCoursePageActions().verifyNewPricacyPolicyInSubmitDetailsForm();
    }

    @Test()
    public void validateKannadaRatingPopUpAndKannadaTextIsDisplayedInRatingSectionPostConsumeCourse() throws Exception {
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
        QXClient.get().gestures().closeApp();
        DikshaMainPageActions d = new DikshaMainPageActions();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().tapOnLanguage();
        getHomePageActions().tapOnKannadaLanguage();

        getHomePageActions().tapOnContinueBtnKannada();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
        getTrainingPageActions().tapOnSearchedSmallCourse();

        getTrainingPageActions().verifyRatingsTextIsDisplayedInKannadaLanguage();

    }

    @Test()
    public void userNavigatedToMultipleBatchesListPostClickingJoinCourseBtn() throws Exception {

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
        String MultipleBatchCourse = QXClient.get().excelUtils().getCellValue("Excel1","TestData",74,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar(MultipleBatchCourse);

        getTrainingPageActions().tapOnMultipleBatchCourse();

        getTrainingPageActions().verifyListOfBatchesInCourseWhichIsHavingMultipleBatches();

    }



    @Test()
    public void userNavigatedToNativePagePostClickingLoginBtnInProfileAndInHamburgerMenu() throws Exception {

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

        getLoginPageActions().verifyUserNavigatedToNativePage();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userLogout();

        getHomePageActions().tapOnMenuBar();

        getLoginPageActions().loginToTheUser(Username, Password);

        getLoginPageActions().verifyUserNavigatedToNativePage();

    }


    @Test()
    public void verifySubroleScreenForHeadTeacherRoleIsDisplayedForNewCredentials() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithLeader();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",101,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",102,2);

        getLoginPageActions().loginToTheUserForLeader(Username,Password);

        getHomePageActions().verifySectionsInHomePage();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifySubroleScreenForNewCred();

    }


    @Test()
    public void verifyBMGSPickValuesInProfileToastMessagePostLogin() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",103,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",104,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser1(Username, Password);

        getHomePageActions().verifyToastMessageBMGSValuesPickedByDefault();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyBMGSValuesPickedAutomaticallyInProfilePage();

    }

    @Test()
    public void userAbleToImportOnlySingleContentAtATimeFromDeviceStorage () throws Exception {
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
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUserAbleToImportOnlySpecificContentFromDevice();
    }


    @Test()
    public void onlyParentCourseProgressIsDisplayedWhenDownloadedAsCSVofANestedCourse() throws Exception {

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 105, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 106, 2);

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().verifyOnlyParentCourseProgressIsDownloadedInDownloadedCSV();

    }

    @Test()
    public void userAbleToReloginUsingExternalIDAndSchoolIDAccountMergedViaSSO() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 92, 2);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);

        d.LaunchAppHomeScreen();

        getProfileEditPageActions().veriyNoLocationPopupWhenLoggedInWithSSOUser();
    }


    @Test()
    public void userAbleToSeeMergeOptionAndAbleToMergeCustodianUserSuccessfully() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String SatetUsername =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String StatePassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
        String custodianUser =QXClient.get().excelUtils().getCellValue("Excel1","TestData",107,2);
        String custodianPWD =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",108,2);


        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(SatetUsername,StatePassword);

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        QXClient.get().gestures().BlindWait(4000);
        getHomePageActions().tapOnDownloadTab();


        getHomePageActions().validateCustodianUserMergedSuccessfully(custodianUser,custodianPWD);

    }

    @Test()
    public void verifyContentPreferenceLabelAndOtherSectionInProfileAreDisplayedSameWay() throws Exception {

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

        getProfileEditPageActions().verifyTwoSectionsOfProfilePage();


    }

    @Test()
    public void verifyPrefilledBMGValuesAndUserAbleToUpdateBMGValuesForNewCredentials() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",103,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",104,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser1(Username, Password);

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyBMGSValuesPickedAutomaticallyInProfilePage();

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

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",109,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",110,2);
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
    public void groupAdminShouldBeAbleToDeleteDeactivatedGroupSuccessfully() throws Exception {

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

        getHomePageActions().createGrupAndActivity();
        getHomePageActions().deactivateCreatedGroup();
        getHomePageActions().deleteGroup();

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

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
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
    public void verifyMobileNumberEmailAddressAndAsterikSymbolInRegisterHerePage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyRegisteredEmailMessageWhileRegistering();


    }


    @Test()
    public void userAbleConsumeAddedContentInAnActivatedGroup() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        DikshaMainPageActions d=new DikshaMainPageActions();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);

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

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().createGroupWithSelectedActivity();

        getHomePageActions().consumeCourseAddedInGroup();


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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyNumberOfAttemptsAndTimerInQuestionSet();

    }

    @Test()
    public void verifyConsentPopupDisplayedOncePostRelauchAppAndConsumeSameCourse() throws Exception {

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
        String CourseName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",48,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(CourseName);

        getTrainingPageActions().tapOnSearchedCourse2();

        getTrainingPageActions().verifyConsentPopUpForCourse1();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(CourseName);

        getTrainingPageActions().tapOnSearchedCourse2();

        getTrainingPageActions().verifyNoConsentPopupPostRelaunchApp();

        getTrainingPageActions().leaveCourse();


    }


    @Test()
    public void userNotAbleToConsumeContentsFromTheDeactivatedGroup() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",111,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",112,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().selectFirstUser();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userNotAbleToConsumeContentOfDeactivatedGroup();


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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyNumberOfAttemptsAndTimerInQuestionSet();

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

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
        getHomePageActions().enterTextInSearchBar("Course with ak question set");

        getTrainingPageActions().tapOnQUMLContent();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyUserAbleToConsumeQUMlContent();

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

        getTrainingPageActions().verifyTitleAndButtonsInSubmitPageOfQuestionSet();

    }


    @Test()
    public void userNavigatedToFirstPagePostClickingReviewBtnInSummaryPage() throws Exception {

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
    public void verifyInCorrectOTPMsgFailedToValidateOTPMsgAndRemainingAttemptsMsgWhileUpdatingContactDetails() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 111, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 112, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyIncorrectOTPMessageWhileUpdatingContactInformation();

        getProfileEditPageActions().verifyFailedToValidateOTPMessageWhileUpdatingContactInformation();


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

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
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

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",117,2);

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
        getHomePageActions().enterTextInSearchBar(questionSet);

        getTrainingPageActions().tapOnQuestionSetCourse5();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyAnsIconIsNotDisplayedInSolutionUncheckedQuestionSet();

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
        getHomePageActions().enterTextInSearchBar("limited course");

        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyLastAttemptMessageWhileConsumeCourse();

    }


    @Test()
    public void verifyUserValidatedProfileDetailsInPopupPostClickingJoinCourseBtn () throws Exception {
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

        getHomePageActions().enterTextInSearchBar("CourseContent");

        getTrainingPageActions().tapOnSearchedCourse6();
        getTrainingPageActions().verifyConsentPopUpForCourse();

        getTrainingPageActions().leaveCourse();

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

}
