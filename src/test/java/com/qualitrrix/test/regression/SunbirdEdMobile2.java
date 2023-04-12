package com.qualitrrix.test.regression;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class SunbirdEdMobile2 {

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
    public void VerifyEditTitleDescriptionTags() throws Exception {
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
        //getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().createGrupAndActivity();
        getHomePageActions().EnableDiscussion();
        getHomePageActions().startQuestionFill();
        d.LaunchAppHomeScreen();
        getHomePageActions().verifyUserAbletoModifyTitleDesc();
        d.LaunchAppHomeScreen();
        getHomePageActions().deleteCommentsAndRepliesInDiscussion();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().verifyuUserAbleToOpenDiscussionForum();
        getHomePageActions().deleteDiscussion();
    }

    @Test()
    public void verifyGroupAdminAbleToViewActivityDashBoardOption() throws Exception {

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
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().viewOptionActivityDashBoardOnActivityLevel();

    }

    @Test()
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
    public void validateLastUpdatedMessageInActivityDashboard() throws Exception {

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

        getHomePageActions().verifyLastUpdatedMsgInActivityDashboard();

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
        DikshaMainPageActions d = new DikshaMainPageActions();
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
d.LaunchAppHomeScreen();
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
    public void validateLoadingAnimationForGeneralCategoryMyDiscussionsAndTapOptionForMemberOfGroup() throws Exception {

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

        getHomePageActions().verifyLoadingAnimationForTagsOption();

        getHomePageActions().verifyLoadingAnimationForGeneralCategory();

        getHomePageActions().verifyLoadingAnimationForMyDiscussions();

    }



    @Test()
    public void verifyLoadingAnimationInDiscussionForumForLoggedInWithMember() throws Exception {

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

        getHomePageActions().verifyLoadingAnimationForTagCardsInTagOption();

        getHomePageActions().verifyLoadingAnimationInMyDiscussionSectionForMember();

    }




    @Test()
    public void validateNoTagsAvailableMessage() throws Exception {

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
        getHomePageActions().verifyTagsSection();


    }




    @Test()
    public void validateLoadingAnimationPostClickingBackAndCloseInDFForMemberOfGroup() throws Exception {

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

        getHomePageActions().verifyLoadingAnimationPostClickingBackBtn();

        getHomePageActions().verifyLoadingAnimationPostClickingCloseBtn();


    }




    @Test()
    public void validateLoadingAnimationForDifferentCategoriesOfMyDiscussionToMemberOfGroup() throws Exception {

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

        getHomePageActions().verifyLoadingAnimationForTagsOption();

        getHomePageActions().verifyLoadingAnimationForGeneralCategory();

        getHomePageActions().verifyLoadingAnimationForMyDiscussions();

        getHomePageActions().verifyLoadingAnimationForRecentBestSavedUpvoteAndDownvotePosts();


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
    public void validateActivityAssignedAndUnassignedToGroupNotificationMsgInMember() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",71,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",72,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().addActivityInGroupAndRemoveActivityInGroup();

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

        getHomePageActions().validateAssignedActivityNotificationsInMemberofGroup();

        getHomePageActions().validateUnassignedActivityNotificationsInMemberofGroup();

        getHomePageActions().verifyNoNewNotificationsAfterClearingNotifications();

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
    public void verifyUserAbleToSearchContentAndDiffMediaTypes() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);

        getHomePageActions().verifyFiltersForMediaType();

//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
        getTrainingPageActions().tapOnSearchedBook();
        getHomePageActions().verifyContentWithAllMediaType();

        getHomePageActions().verfiyContentUnderVideoMediaType();


    }



    @Test()
    public void verifyCourseHeaders() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" + properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().verifyMyCourseAndSubjectwiseCourses();



    }




    @Test()
    public void DeleteActivityOfGroup() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",38,2);

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




    @Test()
    public void addMemberAndRemoveMember() throws Exception {

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
        getHomePageActions().addMemberAndRemovemember(MemberIDValue);
        getHomePageActions().deleteGroup();
    }




    @Test()
    public void AddActivitsInGroup() throws Exception {

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




    @Test()
    public void verifyCompletedCourseAndNoCertificateMsg() throws Exception {
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
        getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small AutomationCourseContent");
        getTrainingPageActions().tapOnSearchedSmallCourse();
        getTrainingPageActions().verifyCourseCompletedMsgWithoutCertificate();



    }



    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "Course Share.")
    public void verifyCourseSharing() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);


        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username,Password);

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

        getTrainingPageActions().tapOnSearchedCourse1();
        getTrainingPageActions().tapOnJoinTraining2();





        getLibraryPageActions().tapOnShareBtn();
        getLibraryPageActions().verifySharePopUI();
        getLibraryPageActions().tapOnShareBtnFrmSharePop();
        getLibraryPageActions().tapOnShareToWhatsApp();
        getLibraryPageActions().verifyWhatsAppHomePage();


    }



    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
            true, description = "courseNameInProfileTab")
    public void courseNameInProfileTab() throws Exception {
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
    public void verifyCertificateDownloadingToastMessage() throws Exception {
        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
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
        getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getHomePageActions().verifyCertificateToastMessage();


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
    public void verifyGreenTickMarkPostCompletingCourseUnitsInACourse() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        DikshaMainPageActions d = new DikshaMainPageActions();


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

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutoMultipleContentCourse");

        getTrainingPageActions().tapOnMultipleContentCourse();

        getTrainingPageActions().verifyGreenTickMarkPostCompletingFewContentsOfCourse();



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


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "JoinTrainLoginPageHasGmailLogin")
    public void JoinTrainLoginPageHasGmailLogin() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnTrainingTab();
        getLoginPageActions().tapOnLoginBtnInTrainingTab();
        getHomePageActions().verifySignInGoogleOption();

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




    @Test()
    public void validateDownloadContentfromCoursesorLibraryMsgInDownloadSection() throws Exception {
        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().validateDownloadSectionForGuestUser();

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
    public void verifyMyGroupsPage() throws Exception {
        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));
        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 52, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 53, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyGroupsPage();
    }



    @Test()
    public void validateAcademicAndNonAcademicSubjectsAsPerOrgFramework() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

        getHomePageActions().verifyContentUnderBrowseByCategoryForOrgFramework();

        getHomePageActions().verifyAcademicAndNonAcademicSubjects();

    }


    @Test()
    public void verifyFixedFilterInSearchPage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Course");

        getHomePageActions().verifyNoFilterLabelAndFixedFilters();


    }


    @Test()
    public void verifySamePageNumberInEpubContentWhileReconsumingTheSameContent() throws Exception {

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

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username,Password);
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Epub");

        getTrainingPageActions().tapOnEpubContent();
        getTrainingPageActions().verifyUserAbleToPlayEpubContent();
        getTrainingPageActions().verifyUserAbleToConsumeEpubContent();

        getTrainingPageActions().verifySamePageNumberInEpubContentWhileReconsumingEpubContent();

    }


    @Test()
    public void verifySamePageNumberInPDFContentWhileReconsumingTheSameContent() throws Exception {

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

        //getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

        getTrainingPageActions().tapOnSearchedPDF();
        getLibraryPageActions().tapOnPlayIcon3();

        getLibraryPageActions().verifyZoomInZoomOut();

        getTrainingPageActions().verifyUserAbleToConsumeEpubContent();

        getTrainingPageActions().verifySamePageNumberInPDFContentWhileReconsumingPDFContent();

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
    public void verifyCoursesForSelectedCategoryAndSelectedSubject () throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
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
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getTrainingPageActions().verifyCoursesInCoursesTab();

        getHomePageActions().tapOnSearchIcon();

        getTrainingPageActions().verifyCoursesBasedOnCategoryAndSubject();

    }



    @Test()
    public void validateThreeSectionsOfSearchPage() throws Exception {
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

        getHomePageActions().verifySearchPageSections();

    }




    @Test()
    public void validateSectionsInHomePage () throws Exception {
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

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().validateHomepageSectionsForNewDikshaexperience();
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
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

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

        getTrainingPageActions().tapOnSearchedCourse7();
        getTrainingPageActions().verifyConsentPopupForCollection();

    }


    @Test()
    public void verifySyncProgressNowPostCompletingTheCourse() throws Exception {
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
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small AutomationCourseContent");
        getTrainingPageActions().tapOnSearchedSmallCourse();
        getTrainingPageActions().verifyCourseCompletedMsgWithoutCertificate();

        QXClient.get().gestures().clkBackButton();

        getTrainingPageActions().verifySyncNowCourseProgressInCompletedCourse();

    }


    @Test()
    public void verifyEarnCertificateAndRulesToEarnCertificateInCourseTOC() throws Exception {

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
        getHomePageActions().enterTextInSearchBar("Cert Course 4.5");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Cert Course 4.5");
        getTrainingPageActions().tapOnSearchedCourse8();
        getTrainingPageActions().verifyEarnCertificateInCourseTOC();

    }


    @Test()
    public void verifyNoCertificateRuleForCourseWithoutCertificate () throws Exception {
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

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("AutomationCourseForDF");

        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationCourseForDF");
        getTrainingPageActions().tapOnSearchedCourseForDF();
        getCoursePageActions().verifyNoCertificateRule();
    }


    @Test()
    public void veriyUserAbleToDownloadQuestionSetOnline() throws Exception {

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

        getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("limited course");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited course");
        getTrainingPageActions().tapOnSearchedLimitedCourse();
        getTrainingPageActions().verifyUserAbleToJoinQuestionSetCourse();

        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();

        getTrainingPageActions().waitTillTheDownloadButtonDisappears();

        getTrainingPageActions().leaveCourse();

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();


        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyTheDownloadedQuestionSetCourse();

    }


    @Test()
    public void verifyNoEarnCertificateFieldInCourseTOCPage() throws Exception {

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
        getHomePageActions().enterTextInSearchBar("CourseContent");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
        getTrainingPageActions().tapOnSearchedCourse6();
        getTrainingPageActions().verifyNoEarnCertificateInCourseTOC();

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
    public void verifyDownloadBtnInCertificateSectionOfProfilePage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();
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

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyCertificateAndDownloadBtnInProfile();

    }



    @Test()
    public void verifyCourseIsNotHavingCertificateMsg() throws Exception {
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

        //getHomePageActions().tapOnDownloadTab();

        //getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);

        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
        getTrainingPageActions().tapOnSearchedCourse1();
        getTrainingPageActions().verifyCertificateDetailsBeforeJoinCourse();

        getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

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
    public void verifyContentForAllMediaType() throws Exception {
        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        //getHomePageActions().tapOnProfileTab();

        // getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Resource");

        getTrainingPageActions().verifyContentForAllMediaTypeFilter();

    }



    @Test()
    public void verifyCaptchaDisplayedwhenAddedUserToGroup() throws Exception {

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
        getHomePageActions().addMemberAndRemovemember(MemberIDValue);
        getHomePageActions().deleteGroup();
    }



}
