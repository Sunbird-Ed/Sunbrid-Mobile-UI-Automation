package com.qualitrrix.test.regression;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class TPDUAT {

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
    public void CreateGroup() throws Exception {

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

    }

   
    public void verifyAdminAbleToViewAllMetricsOfDashboard() throws Exception {

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

        getHomePageActions().openActivityDashBoard();

        getHomePageActions().verifyDownloadAsCSVInActivityDashboard();

        getHomePageActions().verifyAdminAbleToViewGroupMemberInActivityScreen();

        getHomePageActions().verifyMembersProgressInPercentage();

        getHomePageActions().verifyAllMetricsOfDashboardForAdmin();

    }

    @Test()
    public void validateMemberNameAndProgressInDownloadedCSVFileAsExcelFormat() throws Exception {

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
        QXClient.get().gestures().clkBackButton();

    }

    @Test()
    public void verifyCourseDashBoardAndActivityDashboardInGroups() throws Exception {

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

        getHomePageActions().verifyCourseDashBoardInGroups();

        getHomePageActions().verifyActivityDashboardScreen();

    }

    @Test()
    public void verifyActivityDashboardAndCourseDashboardByUser() throws Exception {

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


   
    @Author(name="Raju")
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
    public void verifyUserAbleToEnrollConsumeCourseContent() throws Exception {

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

    @Test()
    public void validateSameCourseProgressAfterReEnrollingToCourse () throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 49, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 50, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnTrainingTab();

        getTrainingPageActions().verifyCourseFromMyCourseSection();

        getTrainingPageActions().leaveCourse();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutomationContentCourse");
        QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationContentCourse");

        getTrainingPageActions().enrollToSameCourseAndVerifyCourseProgressRemainsSame();

    }

    @Test()
    public void validateExploreContentsForVarietyAudienceInSearchPage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnLibraryTab();

        getHomePageActions().verifyContentsForVarietyAudienceInSearchPage();
    }

    @Test()
    public void validateExploreContentsFromOtherBoardsInSearchPage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnLibraryTab();

        getHomePageActions().verifyContentsFromOtherBoardsInSearchPage();
    }

    @Test()
    public void validateNavigationFiltersInSearchPage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyNavigationFiltersUnderDigitalTextbookCategory();

        getHomePageActions().verifyNavigationFilterUnderCoursesCategory();

        getHomePageActions().verifyNavigationFilterUnderInteractiveContent();

    }

    @Test()
    public void validateGroupingBasedOnSubjectUnderAnyCategoryInSearchPage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyGroupingBasedOnSubjectInDigitalTextBookCategory();

    }

    @Test()
    public void verifyDefaultFiltersAdvancedFiltersNavigationFilterAndGroupingBySubjectInBanners() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

        //getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHomePageBannersAndUserPreferences();

        getHomePageActions().verifyDefaultFiltersWithSubjectRoleAndAdvancedFiltersPostClickingAnyBanner();

        getHomePageActions().verifyNavigationFilterPostClickingBanner();

        getHomePageActions().verifyGroupingBasedOnSubject();

    }

    @Test()
    public void verifyExplorePageLabelAndFiltersInExploreSubjectPage () throws Exception {
        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
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

        getHomePageActions().verifyExploreCategoryLabel();

        getHomePageActions().verifyExploreSubjectAndFiltersInExplorePage();
    }

    @Test()
    public void validatePopularCategoriesSectionInSearchPage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnLibraryTab();

        getHomePageActions().verifyPopularCategoriesInSearchPage();
    }

    @Test()
    public void verifyContentTypeFilterAndAdditionalCategoriesInFiltersSection() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("Course");

        getLibraryPageActions().verifyAllFilterInContentType();

        getLibraryPageActions().observeTheAdditionalCategories();

        getLibraryPageActions().verifyContentForContentTypeAndAdditionalCategoriesFilter();

    }

    @Test()
    public void verifyCollectionTitlePublishingOrgAndOrgFrameworkValuesInCollectionTOC() throws Exception {
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

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("CollectionForAutomation");

        getTrainingPageActions().tapOnSearchedCollection();

        getTrainingPageActions().verifyCollectionTitlePublishedByAndOrgFrameworkInCollectionTOC();

    }

    @Test()
    public void verifyContentDetailsAndContentRelevantForInCourseTOC() throws Exception {
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
        String CourseName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",48,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(CourseName);

        getTrainingPageActions().tapOnSearchedCourse2();

        getTrainingPageActions().verifyCourseDetails();

    }

    @Test()
    public void verifyContentDetailsAndCreditsLicenseTabInTextbookTOC() throws Exception {
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
        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        getTrainingPageActions().verifyContentDetailsTabCreditLicenseInfoAndContentRelevantFor();

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
    public void verifyMyLearningSectionInHomePage () throws Exception {
        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
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

        getHomePageActions().verifyMyLearningInHomePage();
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
    public void verifyContentDetails() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnDownloadTab();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
        getTrainingPageActions().tapOnSearchedBook();
        getTrainingPageActions().verifyContentDetailsInContentsPage();

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
    public void verifyCreatorIsNotAbleToEnrollCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
        String coursefetch=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getTrainingPageActions().verifyLoginBeforeCourseFetch();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);

        getTrainingPageActions().tapOnSearchedCourse1();
        getTrainingPageActions().verifyLoginPopUpWhileJoinCourse();

        getLoginPageActions().loginToTheUser(Username,Password);

        getTrainingPageActions().verifyCreatorNotAbleToEnrollMessage();

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
    public void verifyExpiredCourseInMylearingSectionOfHomePageAndProfilePage() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 77, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 78, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().verifyExpiredCourseInMyLearningSectionOfHomePageAndVerifyExpiredMsg();

        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        getHomePageActions().verifyExpiredCourseInProfiePageAndVerifyExpiredMsg();

    }

    @Test()
    public void verifyUserAbleToConsumeOngoingCourseFromProfile() throws Exception {

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

    }

    @Test()
    public void verifyUserShouldRedirectToOngoingCoursePostSearchAndClickCourse() throws Exception {

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

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutomationCourseForDF");

        getTrainingPageActions().tapOnSearchedCourseForDF();

        getTrainingPageActions().verifySearchedCourseNavigatedToOngoingCourse();

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
    public void verifyCourseTOCPageMessagesForExpiredAndEnrollmentEndDateCourses() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().verifyEnrollmentEndDateUnderJoinTraining();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().verifyEnrollmentClosedInCourseTOC();

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().verifyExpiredCourseInCourseTOC();


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
    public void verifyUserNotAbleToEnrollTheCourseWithEnrollementEndDatePassed() throws Exception {

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
        // getHomePageActions().enterTextInSearchBar("AutomationExpiredCourse");//staging
        getHomePageActions().enterTextInSearchBar("ExpiredCourse");//preprod
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited course");
        getTrainingPageActions().tapOnSearchedExpiredCourse();

        getTrainingPageActions().verifyCourseWithEnrollmentEndDateIsOver();

    }

    @Test()
    public void verifyNoJoinCourseButtonForExpiredCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().verifyExpiredCourseInCourseTOC();


    }

    @Test()
    public void validateCourseNameMembersNameAndCourseProgressInDownloadedCSVFile() throws Exception {

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

        QXClient.get().gestures().clkBackButton();

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
    public void validateUpcomingBatchMsgInCourse() throws Exception {

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
        getHomePageActions().enterTextInSearchBar("UpcomingCourse");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("UpcomingCourse");
        getTrainingPageActions().tapOnSearchedCourse5();
        getTrainingPageActions().verifyUpcomingBatchMessageWhileJoinCourse();


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
    public void verifyConsentPopUpIsDisplayedForCourseAndTraceableCollection () throws Exception {
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

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("CourseContent");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
        getTrainingPageActions().tapOnSearchedCourse6();
        getTrainingPageActions().verifyConsentPopUpForCourse();

        getTrainingPageActions().leaveCourse();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("Umesh trackable collection");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Umesh trackable collection");
        getTrainingPageActions().tapOnSearchedCourse7();
        getTrainingPageActions().verifyConsentPopupForCollection();

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







}
