package com.qualitrrix.test.regression;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class TPDScenario1 {

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
    public void verifyTitleImageAndByPublishingOrgDetailsUnderMyLearningSectionInHomePage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);

        getHomePageActions().verifyMinimumInformationUnderMyLearningSection();


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
    public void verifyUpdatedCardsofActivityInGroups() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",55,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",56,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);

        getHomePageActions().tapOnMenuBar();
        getHomePageActions().verifyUpdatedCardsForActivities();


    }

    @Test()
    public void validateRecommendationSectionAndFilterSectionWhileAddingActivityToGroup() throws Exception {

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

        //getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyAdditionalCategoriesInAddActivity();

        getHomePageActions().verifyContentsInDifferentCategories();

        getHomePageActions().validateRecommendationsSectionSearchSectionsAndFilterSection();

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

    @Test()
    public void verifyGeneralDiscussionsTopics() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",55,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",56,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().verifyGeneralDiscussionTopics();

        getHomePageActions().verifyDiscussionList();

    }

    @Test()
    public void verifyStartDiscussionScreen() throws Exception {

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

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();
        getHomePageActions().createGrupAndActivity();
        getHomePageActions().verifyDiscussionForum();
    }

    @Test()
    public void verifyMin8CharactersInDiscussionTopicEditFields() throws Exception {

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
        getHomePageActions().EnableDiscussion();

        getHomePageActions().verifyMinimumCharactersInDiscussionTopicQuestionAndPleaseEloberateYourQuestionSection();

    }

    @Test()
    public void validateMinimum10CharactersInTopicReplyForMemberInGroups() throws Exception {

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 67, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 68, 2);

        getLoginPageActions().loginToTheUser(Username, Password);

        //getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnMenuBar();
        getCoursePageActions().tapOnMoreOption();
        getCoursePageActions().clickFirstUser();
        getCoursePageActions().tapOnChangeUser1();
        getCoursePageActions().CheckTermsCheckBoxORClickProfile();

        //getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().verifyAdminLinkedGroupInMember();
        getHomePageActions().verifyEnableDiscussionIconInGroupEnabled();

        getHomePageActions().verifyStartDiscussion();

        getHomePageActions().verifyMinimum10CharactersInTopicReplyEditTextBox();

    }


    @Test()
    public void validateFiftyDiscussionTopicsUnderAnyCategoryOfMyDiscussions() throws Exception {

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 67, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 68, 2);

        getLoginPageActions().loginToTheUser(Username, Password);

        //getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnMenuBar();
        getCoursePageActions().tapOnMoreOption();
        getCoursePageActions().clickFirstUser();
        getCoursePageActions().tapOnChangeUser();
        getCoursePageActions().CheckTermsCheckBoxORClickProfile();

        //getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().verifyAdminLinkedGroupInMember();

        getHomePageActions().verify50TopicsInAnyOneGeneralDiscussionCategory();


    }

    @Test()
    public void validateMemberRemovedNotificationMessageInMember() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",69,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",70,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUpdatedCardsForActivities();

        getHomePageActions().removeMemberFromTheGroup();

        getHomePageActions().deleteGroup();

        getHomePageActions().clkBackbuttontoExitFromGroups();

        getHomePageActions().verifyNoNotificationReceivedByGroupCreatorPostMemberRemovedFromGroup();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userLogout();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        String Username1 =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String Password1 =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username1,Password1);

        getHomePageActions().validateMemberRemovedNotificationMsg();

        getHomePageActions().validateAllNotificationsClickableAndDeleteOneByOneNotifications();

        getHomePageActions().clearNotifications();

    }

    @Test()
    public void validateGroupDeletedNotificationMessageInMember() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",69,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",70,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUpdatedCardsForActivities();

        getHomePageActions().deleteGroup();

        getHomePageActions().clkBackbuttontoExitFromGroups();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userLogout();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        String Username1 =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String Password1 =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username1,Password1);

        getHomePageActions().validateGroupDeletedNotificationMessage();

        getHomePageActions().clearNotifications();

    }

    @Test()
    public void validateActivityPageInActivityDashboard() throws Exception {

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

        getHomePageActions().verifyUserNameFreezedInActivityPage();

    }


}
