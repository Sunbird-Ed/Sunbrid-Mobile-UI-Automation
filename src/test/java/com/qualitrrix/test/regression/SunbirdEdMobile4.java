package com.qualitrrix.test.regression;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class SunbirdEdMobile4 {

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
    public void AddUserLimitMsg() throws Exception {
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
//	  DikshaMainPageActions d=new DikshaMainPageActions();
//
//	  QXClient.get().gestures().closeApp();
//	    d.LaunchAppHomeScreen();
        // getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().verifyAddAnotherUserIsDisplayed();
        getCoursePageActions().tapOnAddAnotherUser();


        String FakeName=QXClient.get().gestures().generateRandomName();
        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
        System.out.println(storeFakeNameEntered);
        getCoursePageActions().tapOnAddUserBtn();
        getCoursePageActions().verifyMsgAddingUser();

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
    public void verifyChangePreferenceBtnAndEditProfileDetailsInHomePage() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
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

        d.LaunchAppHomeScreen();

        getHomePageActions().verifyChangePreferenceAndBMCSvaluesInHomePageUnderYourPreference();

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




   

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "User is able to Fill Slt Language And UsernBoarding Values")
    public void verifyUserAbleToConsumeDownloadContentsInOffline() throws Exception {

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
    }



    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyUserAbleToSearchContentOrBook ")
    public void playTheContent() throws Exception {
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




    @Test()
    public void verifyNoMergeAccountOptionInSettingsForCustodianUser() throws Exception {

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

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyNoMergeAccountOptionInSettingsScreen();

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




    @Test()
    public void validateErrorMessageInRegisterHerePage() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().verifyRegisterHerePage();


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
    public void verifyUserAbleToViewFAQquestions() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHelpSection();

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
    public void verifyAdoptedTextBooksAndUserAbleToDownloadAndConsumeAdoptedTextBooks() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyBoardInProfileSectionAfterOnboarding();

        getHomePageActions().tapOnLibraryTab();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar("TextBook");

        getLibraryPageActions().verifyAdoptedTextBookAsPerBoardInProfile();

        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();

        getTrainingPageActions().waitTillTheDownloadButtonDisappears();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();
        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyTheDownloadedAdoptedTextBook();
    }


    @Test()
    public void validateHomePageBannersVisualCuesAndBrowseByCategorySectionAsPerBMCValue() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHomePageBannersAndUserPreferences();

        getHomePageActions().verifyFeaturedSectionInHomePageAndVisualCueInHomePage();

        getHomePageActions().verifyBrowseByCategoriesInHomePageAsPerBMCS();

    }


    @Test()
    public void validateTheFeaturedSectionInHomePage() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyBannersAsPerBMCvalues();

    }


    @Test()
    public void verifySwitchToNewExperiencePostOnboarding() throws Exception{
        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingForExistingUser();

        getHomePageActions().tapOnProfileTab();
    }


    @Test()
    public void verifyContentCardDetails() throws Exception {
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

        getLibraryPageActions().verfiyContentCardDetailsOfContent();

    }


    @Test()
    public void verifyBrowseDIKSHAMsgAndWelcomeMsgInNewExperience() throws Exception {

        QXClient.get().driver();

        getDikshaMainPageActions().performUserOnBoardingAndClickSwitchNewExperiecnceBtn();

        getHomePageActions().verifyHomePagePresentInsteadOfLibraryPage();

        getHomePageActions().verifyYourPreferencesMessage();

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
    public void validateSolutionForIncorrectProgressFAQ() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyHelpSection();

        getHomePageActions().verifyCoursesAndCertificatesSection();

    }

    @Test()
    public void verifyExploreInteractiveContentPage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnSearchIcon();

        getLibraryPageActions().verifyFiltersForInteractiveContent();

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
    public void verifyBannersInHomePageAsPerBMC() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyBannersAsPerBMCvalues();

    }


    @Test()
    public void verifyHomePageTitlesForHeadTeacherRole() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
        Properties properties = QXClient.get().propUtils()
                .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" + properties.getProperty("excelpath"));
        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",36, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37, 2);
        getLoginPageActions().loginToTheUserForLeader(Username,Password);

        getHomePageActions().verifyHomePageForHeadTeacherAndOfficials();

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
    public void validateUpdatedDeclarationInSubmitDetails () throws Exception {
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

        getProfileEditPageActions().verifyUpdateConsentWithDifferentOrganization();

        getProfileEditPageActions().updateWithOldConsentOrgAndVerify();

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
    public void VerifyEnableDiscussionGroup() throws Exception {

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
        getHomePageActions().startQuestionFill();
        getHomePageActions().DisableDiscussion();
        getHomePageActions().deleteGroup();




    }



    @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "ShareDikshaApp")
    public void ShareDikshaApp() throws Exception {

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


    
    @Test()
    public void verifyDiscussionForumWorkflowsWorksFine() throws Exception {

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

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutomationCourseForDF");

        getTrainingPageActions().tapOnSearchedCourseForDF();

        getHomePageActions().validateForumIconInCourse();

        getHomePageActions().validatePostReplyAndSavePost();

    }

    @Test()
    public void validateShareOptionInMenuBarAndExitButtonOnEndPageOfQuestionSet() throws Exception {

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

        DikshaMainPageActions d=new DikshaMainPageActions();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(limitedCourse);
        getTrainingPageActions().tapOnQuestionSetCourse();

        getTrainingPageActions().tapOnJoinTraining2();

        getTrainingPageActions().verifyShareBtnInMenuAndExitButtonOnQuestionSetEndpage();

    }

    @Test()
    public void verifyShareAndExitOptionInHamburgerMenuBar() throws Exception {

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
        getHomePageActions().enterTextInSearchBar("Limited course 25");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Limited course 25");
        getTrainingPageActions().tapOnSearchedCourse9();
        getTrainingPageActions().verifyUserAbleToJoinQuestionSetCourse();

        getTrainingPageActions().verifyShareAndExitOptionsOfQuestionSet();


    }


    @Test()
    public void verifyZoomOptionInQuestionSetWithImages() throws Exception {

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
        getTrainingPageActions().verifyZoomInAndZoomOutOptionInQuestionsetWithImages();

    }


    @Test()
    public void validateAddUserButtonIsDisplayedInCamelCasing() throws Exception {

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
        QXClient.get().gestures().BlindWait(4000);
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getCoursePageActions().tapOnAddAnotherUser();

        String FakeName=QXClient.get().gestures().generateRandomName();
        String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
        System.out.println(storeFakeNameEntered);

        getHomePageActions().verifyCamelCasingDisplayedForAddUserBtn();


    }





    @Test()
    public void validateEditButtonsInProfilePageAreDisplayedInCamelCasing() throws Exception {

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

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyFirstEditButtonInProfilePageIsInCamelCasing();

        getProfileEditPageActions().verifySecondEditButtonInProfilePageIsInCamelCasing();

    }

    @Test()
    public void validateCamelCasingInDiscussionAndPostsTextInDF() throws Exception {

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
        getHomePageActions().verifyCamelCasingForDiscussionAndPostsTextInDiscussionForum();

    }

    @Test()
    public void validateViewsTextInDiscussionTopicIsInCamelCase() throws Exception {

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
        getHomePageActions().startQuestionFill();
        getHomePageActions().verifyViewsInDiscussionTopicIsDisplayedWithCamelCase();

    }

    @Test()
    public void verifySuspendedGroupBannerInGroupDetailsPage() throws Exception {

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
        DikshaMainPageActions d = new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().createGrupAndActivity();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyDeactivateGroup();

        getHomePageActions().verifySuspendedGroupBannerAndActivateBtn();

    }


  




    @Test()
    public void verifyConsentFormIsDisplayedForOldUserInProfilePage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",84,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",85,2);
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
    public void verifyUserNotAbleToDownloadLargeSizeBook() throws Exception {
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
    public void validateBlockClusterSchoolValuesAreDisplayedInCamelCasing() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 82, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 83, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().verifyBlockDisplayedInCamelCasing();

        getProfileEditPageActions().verifyClusterIsDisplayedInCamelCasing();

        getProfileEditPageActions().verifySchoolIsDisplayedInCamelCasing();

    }


    @Test()
    public void verifyLastViewedButtonIsClickableInDownloadPage() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);

        getTrainingPageActions().tapOnSearchedBook();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);

        getTrainingPageActions().tapOnSearchedCourse1();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnDownloadTab();

        getDownloadPageActions().verifyContentsArrangedProperlyBasedOnLastViewedAndContentSize();
    }



    @Test()
    public void verifyUserAbleToDownloadVideoTranscriptInAboutSection() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String videoTranscript =QXClient.get().excelUtils().getCellValue("Excel1","TestData",86,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(videoTranscript);

        getTrainingPageActions().tapOnVideoTranscriptContent();

        getDownloadPageActions().verifyUserAbleToDownloadTranscriptInAboutSectionOfContent();


    }



    @Test()
    public void verifyUserAbleToConsumeQuestionSetInsideContentPlaylist() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        String QSContentPlaylist =QXClient.get().excelUtils().getCellValue("Excel1","TestData",87,2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(QSContentPlaylist);

        getTrainingPageActions().tapOnQSInContentPlaylist();

        getTrainingPageActions().verifyUserAbleToConsumeContentPlaylistWithQS();

    }



    @Test()
    public void verifyUserAbleToConsumeQuestionSetInsideDigitalTextBook() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        String QSDigitalTextBook =QXClient.get().excelUtils().getCellValue("Excel1","TestData",88,2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(QSDigitalTextBook);

        getTrainingPageActions().tapOnQSInDigitalTextBook();

        getTrainingPageActions().verifyUserAbleToConsumeDigitalTextBookWithQS();

    }


    @Test()
    public void verifyMainUserProfileShouldNotAffectPostSwitchUserUpdatesTheRoleInProfile() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));
        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",89,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",90,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username,Password);

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        QXClient.get().gestures().BlindWait(4000);
        getHomePageActions().verifySectionsInHomePage();

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

        d.LaunchAppHomeScreen();
        getHomePageActions().verifySectionsInHomePage();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnProfileTab();
        getHomePageActions().tapOnProfileTab();

        getProfileEditPageActions().updateSwitchedUserRole();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().changeToOldUserFromSwitchedUser();

        getHomePageActions().verifySectionsInHomePage();


    }


   



    @Test()
    public void validateConfirmPopupWhenUserDeliberatelyExitsFromPlayerContentWhileConsuming() throws Exception {
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
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

        getTrainingPageActions().tapOnSearchedPDF();

        getTrainingPageActions().verifyPopupWhenDeliberatelyExitFromPlayerContent();

    }




    @Test()
    public void verifyPrefilledEmailIDInUserDeclarationForm() throws Exception {
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

        getCoursePageActions().verifyEmailIdPrefilledInUserDeclarationForm();
    }

    @Test()
    public void verifyCorrectIncorrectFeedbackPopupIsNotDisplayedWhenItIsDisabledByCreatorInQuestionSet() throws Exception {

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





}
