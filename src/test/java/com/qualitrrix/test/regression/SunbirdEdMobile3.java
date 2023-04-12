package com.qualitrrix.test.regression;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class SunbirdEdMobile3 {
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
    public void validateMemberAddedNotificationMessageInMember() throws Exception {

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
        String MemberIDValue = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 47, 2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().createGrupAndActivity();
        getHomePageActions().addMemberToGroup(MemberIDValue);

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userLogout();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        String Username1 = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
        String Password1 = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username1, Password1);

        getHomePageActions().validateMemberAddedNotificationMsg();

        getHomePageActions().clearNotifications();

    }

    @Test()
    public void verifyCustomisedFiltersInCoursesSectionUnderBrowseByCategorySection() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
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

        getHomePageActions().verifyCustomisedFiltersAndSubjectsInSubjectFilterUnderCourseSectionInBrowseByCategory();


    }

    @Test()
    public void verifyCustomisedClassFilterInBanners() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyBannersAsPerBMCvalues();

        getHomePageActions().verifyCustomisedFiltersInAnyBannerOfHomePage();

    }


    @Test()
    public void verifyCustomizedFiltersDisplayedForAnyCategoryInSearchTab() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().changeToJoyfulTheme();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnSearchTab();

        getHomePageActions().verifySearchPageCategories();

        getHomePageActions().verifyCustomizedFiltersForVideosCategory();


    }


    @Test()
    public void verifyHomePageTilesForHeadTeacherRoleInOtherLanguage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String KannadaText =QXClient.get().excelUtils().getCellValue("Excel1","TestData",6,2);
        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().verifySectionsInHomePage();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().tapOnLanguage();
        getHomePageActions().tapOnKannadaLanguage();

        getHomePageActions().tapOnContinueBtnKannada();

        getHomePageActions().verifyHomePageTilesPostLanguageChange();

        DikshaMainPageActions d2=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d2.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyKanndaTextChanged(KannadaText);
    }


    @Test()
    public void verifyContentsPostApplyingFiltersInTvClassesSection() throws Exception {
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

        getLibraryPageActions().verifyContentsForPostApplyingFilterInTVclassesSection();


    }


    @Test()
    public void verifyBackBtnIsWorkingFineInCollectionWithH5PContent () throws Exception {
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

        DikshaMainPageActions d=new DikshaMainPageActions();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutoH5PCollectionContent");

        getTrainingPageActions().tapOnSearchedH5pCollection();

        getTrainingPageActions().verifyH5PCollectionContentPage();

        getTrainingPageActions().verifyPostSingleClickBackbtnUserShouldComeBackFromH5pContent();

    }


    @Test()
    public void verifyHamburgerMenuOptionWorksInAllPages() throws Exception {
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

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

        QXClient.get().gestures().clkBackButton();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

        QXClient.get().gestures().clkBackButton();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

    }


    @Test()
    public void verifyContentPostApplyingSubjectAndRoleFilterForVideosCategory() throws Exception {
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

        getHomePageActions().verifyContentForSubjectAndRoleFiltersInAnyCategoryOfSearchTab();

    }


    @Test()
    public void verifyPreferencesUpdatedInHomePage() throws Exception {
        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnMenuBar();

        getProfileEditPageActions().verifyChangePreferencesInHomePage();

    }


    @Test()
    public void verifyBackButtonIsWorkingInAllThePages() throws Exception {
        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().verifyBackButtonWorkingInLibraryPage();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();

        getTrainingPageActions().verifyBackButtonWorkingInTrainingPage();

        getHomePageActions().tapOnDownloadTab();

        getDownloadPageActions().verifyBackButtonWorkingInDownloadsPage();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyBackButtonWorkingInProfilePage();


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
    public void verifyLoginOptionsWhileLogin() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyDifferentLoginOptions();


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
    public void validateForgotTextIsReplacedByForgetPasswordText() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyLoginPageTextAndForgotReplacedByForgetPassword();

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
    public void verifyAdminUserAskedToForMandatoryTermsAndConditionInRegisterHerePage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingWithLeader();

        getLoginPageActions().verifyRedirectedToLoginPagePostSelectingUsertypeAdmin();

        getLoginPageActions().verifyMandatoryTermsAndConditionsInRegisterHere();


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
    public void verifyBoardValuesAreInAlphabeticalOrder() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyBoardInAlphabeticalOrder();

    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify searchContentAndDownload ")
    public void searchContentAndDownload() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);


        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
        //getTrainingPageActions().verifyFileDownloadThroughNotification();
        getTrainingPageActions().waitTillTheDownloadButtonDisappears();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();


        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyTheDownloadedBook();
    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "TxtBookShowsAsPerBMC ")
    public void TxtBookShowsAsPerBMC() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().sltLangAndTeacherRole();
        getDikshaMainPageActions().sltUserMultipleBMSDropdown();
        getHomePageActions().tapOnSearchIcon();

    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "SearchContetInAllTabs ")
    public void SearchContetInAllTabs() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();


        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutomationCourseContent");
        //  QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationCourseContent");
        getTrainingPageActions().tapOnSearchedCourse1();

    }


    @Author(name="Raju")
    @Test()
    public void verifyPublisherFilter() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("resource");
        getLibraryPageActions().FilterForContentPublisherMediaType();

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


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyUserAbleToStreamBookContentsOnline ")
    public void verifyUserAbleToStreamBookContentsOnline() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnPlayIcon();
        getLibraryPageActions().tapOnPlayIcon1();

        QXClient.get().gestures().clkBackButton();
        getLibraryPageActions().tapOnOKbtn();
        getLibraryPageActions().clkOnVideoTogglebtn();
        getLibraryPageActions().closeRatingPopup();
        getLibraryPageActions().tapOnStarIcon();
        getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);
    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "ratingForBookContent ")
    public void ratingForBookContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnPlayIcon();
        getLibraryPageActions().tapOnPlayIcon1();

        QXClient.get().gestures().clkBackButton();
        getLibraryPageActions().tapOnOKbtn();
        getLibraryPageActions().clkOnVideoTogglebtn();
        getLibraryPageActions().closeRatingPopup();
        getLibraryPageActions().tapOnStarIcon();
        getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);
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
    public void validateAdditionalIconsUnderFeaturedSectionOfHomePage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();


        getHomePageActions().verifyBannersAsPerBMCvalues();

        getHomePageActions().verifyFeaturedSectionInHomePageAndVisualCueInHomePage();

        getHomePageActions().verifyUserAbleToClickAdditionalIconsBelowFeaturedSectionOfHomePage();

    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "MultipleValuesInBMSOnBoarding ")
    public void MultipleValuesInBMSOnBoarding() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().sltLangAndTeacherRole();
        getDikshaMainPageActions().sltUserMultipleBMSDropdown();
        getHomePageActions().tapOnSearchIcon();

    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "userAbleToViewBookTOCandUnitsInsideBook ")
    public void userAbleToViewBookTOCandUnitsInsideBook() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnPlayIcon();
        getLibraryPageActions().tapOnPlayIcon1();

        QXClient.get().gestures().clkBackButton();
        getLibraryPageActions().tapOnOKbtn();
        getLibraryPageActions().clkOnVideoTogglebtn();
        getLibraryPageActions().closeRatingPopup();
        getLibraryPageActions().tapOnStarIcon();
        getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);
    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify UserAble to Download Book ")
    public void verifyBookDownload() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);


        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //  QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
        //getTrainingPageActions().verifyFileDownloadThroughNotification();
        getTrainingPageActions().waitTillTheDownloadButtonDisappears();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();


        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyTheDownloadedBook();
    }


    @Test()
    public void verifyContentSizeAndDeleteContentFromDownloadSection() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        //getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().verifyDownloadSection();

        getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("resource");

        getHomePageActions().filterContentOnContentSize();

    }


    @Test()
    public void verifyShareIconAndConsumeCourseAfterJoinCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" + properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 25, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
        getTrainingPageActions().tapOnSearchedCourse1();

        getLibraryPageActions().tapOnShareBtn();
        getLibraryPageActions().tapOnShareBtnFrmSharePop();
        getLibraryPageActions().tapOnShareToWhatsApp();
        getLibraryPageActions().verifyWhatsAppHomePage();

        getTrainingPageActions().verifyConsumeCourseAfterJoinCourse();
    }


    @Test()
    public void verifyDebugModeInSettings() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().verifyEnableDisableDebugMode();

    }


    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "SngleBatchVerification")
    public void SngleBatchVerification() throws Exception {

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
        // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

        getTrainingPageActions().tapOnSearchedCourse1();
        getTrainingPageActions().tapOnJoinTraining2();





        getLibraryPageActions().tapOnShareBtn();


    }


    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "AnonymousUserFilterApplyInTrainingTab")
    public void AnonymousUserFilterApplyInTrainingTab() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        // getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Course");

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().BlindWait(1000);

        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().verifyRecentlySearchedKeyword();

    }


    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "anonymousUserAbleToSearchCourse")
    public void anonymousUserAbleToSearchCourse() throws Exception {

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
        // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

        getTrainingPageActions().tapOnSearchedCourse1();

    }


    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "RecentlySearchedKeyWorkdVerify")
    public void RecentlySearchedKeyWorkdVerify() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Course");

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().BlindWait(1000);

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().verifyRecentlySearchedKeyword();

    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyUserAbleToSearchContentOrBook ")
    public void verifyUserAbleToSearchContentOrBook() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);


        getTrainingPageActions().tapOnSearchedBook();

        getLibraryPageActions().tapOnPlayIcon();
        getLibraryPageActions().tapOnPlayIcon1();

        QXClient.get().gestures().clkBackButton();
        getLibraryPageActions().tapOnOKbtn();
        getLibraryPageActions().verifyRatingPopup();
        getLibraryPageActions().tapOnStarIcon();
        getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);
    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyUserAbleToFillFrameworkAndLocationDetails")
    public void verifyUserAbleToFillFrameworkAndLocationDetails() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //   QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();
    }


    @Test()
    public void verifyNoRecentlyViewedSectionInLibrarypage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
        getTrainingPageActions().tapOnSearchedBook();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().verifyRecentlyViewedSectionForLoggedUserAndGuestUser();

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
        getTrainingPageActions().tapOnSearchedBook();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().verifyRecentlyViewedSectionForLoggedUserAndGuestUser();


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
    public void validateEmailAndNameIsNotRegisteredWithSunbirdMsg() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().validateErrorMessageForEmailAndName();

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
    public void validateRecoverAccountPageDetails() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyRecoverAccountPageDetails();

        getLoginPageActions().verifyLandingOnLoginPagePostIncorrectNameTwoTimes();


    }


    @Test()
    public void verifyNoProfileDetailsLabelAndNoDeviceLocationForGuestUserInProfile() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyGuestUserProfilePageLabels();

    }


    @Test()
    public void verifyTextInRoleConfirmationAndLabelInEditLocationPage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().validateChooseContentPreferenceLabelInLocation();


    }

    @Test()
    public void verifyNewTagsInHamburgerMenuAndLoginOptions() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().verifyScanQRAndSelectBoardWhileUserOnBoarding();

        getHomePageActions().tapOnDownloadTab();
        QXClient.get().gestures().closeApp();

        DikshaMainPageActions d = new DikshaMainPageActions();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().verifyNewTagForMyGroupsAndImportContent();

        getHomePageActions().verifyUserLoginInHamburgerMenu();

        getHomePageActions().tapOnProfileTab();

        getHomePageActions().verifyUserLoginInProfile();


    }


    @Test()
    public void verifyStateAndDistrictDisplayedForStudentInProfilePage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithStudent();

        getHomePageActions().tapOnProfileTab();
        getHomePageActions().verifyLoginOptionIsPresentForStudent();

        getProfileEditPageActions().verifyOnlyStateAndDistrictValuesPresentInProfilePage();

    }


    @Author(name="Raju")
    @Test()
    public void verfiyLetUsKnowBtn() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getLibraryPageActions().verifyLetUsKnow();

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
    public void verifyUserAbleToChangePermissions() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUserCanChangePermissions();

        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().clkBackButton();


    }

    @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDataSync")
    public void verifyUserAbleToShareTelemetryFiles() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getLibraryPageActions().verifyDataSyncs();

    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Book sharing")
    public void verifyUserAbleToShareTheBook() throws Exception {
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

        // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);


        //    getLibraryPageActions().verifyContentUI();
        // QXClient.get().gestures().swipeDown();
        //QXClient.get().gestures().swipeDown();
        getLibraryPageActions().tapOnShareBtn();
        getLibraryPageActions().tapOnShareBtnFrmSharePop();
        getLibraryPageActions().tapOnShareToWhatsApp();
        // Validating the scenario that whether it is navigating to whatsapp page or not
        getLibraryPageActions().verifyWhatsAppHomePage();
    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyDerivedSourceInfoWhnBookCopied")
    public void verifyDerivedSourceInfoWhnBookCopied() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //    QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLibraryPageActions().tapOnCreditAndLicense();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLibraryPageActions().verifyTermsAndCondLink();
    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyCreditLicenseInfoSecInBookTOCpage")
    public void verifyCreditLicenseInfoSecInBookTOCpage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        //   QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLibraryPageActions().tapOnCreditAndLicense();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLibraryPageActions().verifyTermsAndCondLink();
    }

    @Test()
    public void verifyBoardMediumClassValuesDisplayedProperlyInContentPlayCards() throws Exception {

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
        getTrainingPageActions().verifyBoardMediumClassDisplayedInContentPlayCardProperly();
        getTrainingPageActions().tapOnSearchedBook();
        getTrainingPageActions().verifyBoardMediumClassDisplayedInContentPlayCardProperly();

    }


    @Author(name="Raju")
    @Test()
    public void verifyContentFilterType() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("resource");
        getLibraryPageActions().FilterForContentPublisherMediaType();

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
    public void verifyUserAbleToAnswerUnAttemptedQuestionsPostClickingReviewBtn() throws Exception {

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



}
