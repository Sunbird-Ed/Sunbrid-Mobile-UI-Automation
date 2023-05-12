package com.qualitrrix.test.regression;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class SunbirdEd7 {
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
    public void verifyUserAbleToPlayEpubContentPostLogin() throws Exception {

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
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(CourseName);
        getTrainingPageActions().tapOnEpubContent();
        getTrainingPageActions().verifyUserAbleToPlayEpubContent();

    }


  
    @Test()
    public void verifyUserAbleToIdentifySearchedCourseInTheSearchList() throws Exception {

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

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username,Password);

        //getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutomationContentDetailsCourse");

        getTrainingPageActions().verifySearchCourseIsDisplayedForUser();

    }


    @Test()
    public void verifyPostClickingOngoingCourseInProfilePageLandsOnCourseTOCPage() throws Exception {

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
    public void validateNextButtonIsWorkingFineForCollectionWithPDFContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("AutoPDFCollection");
        getTrainingPageActions().tapOnSearchedPDFCollection();
        getLibraryPageActions().tapOnPlayIcon4();
        getLibraryPageActions().validateNextButtonIsWorkingFine();


    }

    @Test()
    public void verifyCourseCardDisplayedWithLargeTitlesInMyLearningOfHomePage() throws Exception {

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
    public void verifyUserAbleToDownloadAndPlayTheDownloadedEpubContent() throws Exception {

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

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        getLoginPageActions().loginToTheUser(Username,Password);

        //getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Epub content");

        getTrainingPageActions().tapOnEpubContent();

        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
        getTrainingPageActions().waitTillTheDownloadButtonDisappears();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnDownloadTab();

        //getTrainingPageActions().consumeEpubContentInDownloadSection();


    }

    @Test()
    public void verifyUrduTextInUrduContentWhileConsumingTheContent() throws Exception {

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
        String urduContent = QXClient.get().excelUtils().getCellValue("Excel1","TestData",75,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(urduContent);
        getTrainingPageActions().verifyUrduSubjectInUrduContent();
        getTrainingPageActions().tapOnSearchUrduContent();


        getTrainingPageActions().validateUrduTextWhileConsumingUrduContent();

    }





   


    @Test()
    public void ViewActivitsInGroup() throws Exception {
        QXClient.get().driver();
        System.out.println("verify MUAPopupVerify");

    }

    @Test()
    public void ExcellentTextVerify() throws Exception {
        QXClient.get().driver();
        System.out.println("verify ExcellentTextVerify");
    }


   
    @Test()
    public void DeleteGroup() throws Exception {

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
        getHomePageActions().deleteGroup();
    }

    @Test()
    public void validateZoomInZoomOutOptionsAndDownloadOptionWhileConsumingPDFContent() throws Exception {
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

        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
        getTrainingPageActions().waitTillTheDownloadButtonDisappears();

        getLibraryPageActions().tapOnPlayIcon3();

        getLibraryPageActions().verifyZoomInZoomOut();

        getLibraryPageActions().consumeThePDFContentCompletely();

        getLibraryPageActions().verifyDownloadThePDFContentWhileConsumingPDFContent();

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getDownloadPageActions().validateDownloadedPDFContent();

    }


    @Test()
    public void verifyActiveGroupsFirstAndSuspendedGroupsLastInMyGroups() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();


        getHomePageActions().verifyActiveGroupsAndSuspendedGroups();

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
    public void verifyCourseInClassicAndSearchInNewExperience() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().verifySearchTabInsteadOfCoursesTabInNewExperience();


    }

   

    
    @Test()
    public void verifyFilterOptionsPostSearchContent() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" + properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        //getHomePageActions().verifyHomePageSubjects();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("resource");

        getLibraryPageActions().verifyOptionsUnderFilterSection();

    }


   
    @Test()
    public void verifyUserAbleToPlayTheContent() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" + properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        String bookfetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 26, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(bookfetch);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(bookfetch);
        getTrainingPageActions().tapOnSearchedBook();
        getHomePageActions().observeUserAbleToPlayContent();

        QXClient.get().gestures().clkBackButton();

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

  
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verfiyUserAbleToViewNotifications")
    public void verifyUserAbleToViewNotifications() throws Exception {

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

        getLibraryPageActions().verifyNotifications();

    }


    @Test()
    public void validateDikshaGroupGuidelinesWhileCreatingGroup() throws Exception {

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

        getHomePageActions().validateDikshaGroupGuidelines();

        getHomePageActions().validateNoDikshaGroupGuidelinesCheckboxToOpenTheCreateGroup();

    }


    
    @Test()
    public void verifyMemberAbletoViewPrimaryAndAdditionalCategoryContentInAnAlreadyCreatedGroup() throws Exception {

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

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyAdditionalCategoriesInAddActivity();

    }


  
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify Class And SeeMoreBooksContent in LibrarySection")
    public void UserAbleToSeeMoreBooks() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getLibraryPageActions().verifyClassAndSeeMoreBooks();

    }


    @Test()
    public void verifyUserAbleToSearchContentForAlternativeBoard() throws Exception{
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);

        getTrainingPageActions().verifyContentForAlternativeBoard();

        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
        getTrainingPageActions().tapOnSearchedBook();
        getTrainingPageActions().verifyAlternativeBoardForTheSearchedContent();

    }


    @Author(name="Raju")
    @Test()
    public void MediaTypeFilterCheckBox() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("resource");
        getLibraryPageActions().FilterForContentPublisherMediaType();

    }


   

   


    @Test()
    public void verifyActivateAndDeactivateGroupDetails() throws Exception {

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
        //getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyDeactivateGroup();

        getHomePageActions().ReActivateGroup();

    }

    @Test()
    public void verifyCategoriesInAddActivityOfAlreadyCreatedGroup() throws Exception {

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

    }


  
    @Test()
    public void verifyContentForMultipleFilterOptions() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Resource");
        getLibraryPageActions().verifyFilterOptions();

    }


    @Test()
    public void verifyConsumeAllContentsInMobileDevices() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("mp4");

        getLibraryPageActions().verifyPlayMp4Content();

        QXClient.get().gestures().closeApp();

        DikshaMainPageActions d = new DikshaMainPageActions();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Epub");

        getLibraryPageActions().verifyPlayEpubContent();

        QXClient.get().gestures().closeApp();

        DikshaMainPageActions d1 = new DikshaMainPageActions();
        d1.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("assessment");

        getLibraryPageActions().verifyAssessmentConsumption();


    }


   
    @Test(enabled = true, groups = { "SanityTest",
            "FunctionalTest" }, alwaysRun = true, description = "TrainingSecForGstUsrs")
    public void TrainingSecForGstUsrs() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Course");

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);

        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().verifyRecentlySearchedKeyword();

    }

   
    @Test()
    public void AppCloseOnClkYesButon() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().closeAppOnClkYesBtn();
    }

    @Test()
    public void verifyContentForRegionalLanguages() throws Exception {
        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        //getHomePageActions().tapOnTrainingTab();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Resource");

        getTrainingPageActions().verifyContentOfRegionallanguage();

    }

    @Test()
    public void verifyPlayContentAndDownloadContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

        getTrainingPageActions().playContentAndDownloadContent();

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().tapOnDownloadTab();

        getTrainingPageActions().verifyDownloadedContent();



    }


    @Test()
    public void verifyPdfContentConsumedCompletlyAndRateTheContent() throws Exception{
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

        getTrainingPageActions().verifyFunctionalityOfNexPrevWhileConsumingPdfContent();

        getTrainingPageActions().verifyHambergerMenuOptionsWhileContentConsuming();

        getTrainingPageActions().verifyContentAfterConsumingCompletely();

        getLibraryPageActions().tapOnStarIcon();

        getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);

        getTrainingPageActions().updateRating();

        getLibraryPageActions().updateFeedbackAndSubmit(ToasterMsg);

    }


    @Test()
    public void verifyClassAndMediumInLibraryPage() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().verifyClassAndMediumInProfile();
        DikshaMainPageActions d1=new DikshaMainPageActions();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        //getHomePageActions().tapOnLibraryTab();
        getHomePageActions().changeClassAndMediumInLibraryPageAndVerify();

        QXClient.get().gestures().closeApp();
        d1.LaunchAppHomeScreen();

        getHomePageActions().verifyClassAndMediumInLibraryPageAfterRelaunch();

    }


    @Test()
    public void verifyDownloadSection() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().verifyDownloadSection();


    }


   


  

    @Test()
    public void validateDownloadTabDetails() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String book=QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
        String course=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(book);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(book);
        getTrainingPageActions().tapOnSearchedBook();
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().clkBackButton();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(course);
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(course);
        getTrainingPageActions().tapOnSearchedCourse1();

        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnDownloadTab();

        getDownloadPageActions().verifyDownloadPage();

        getDownloadPageActions().deleteDownloadedContent();

    }




  


}
