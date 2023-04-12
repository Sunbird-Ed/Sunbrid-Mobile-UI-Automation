package depreceated;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RemovedSanityTestScripts {

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
    public void verifyCreatorIsNotAbleToEnrollCourse() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();


        getHomePageActions().tapOnProfileTab();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
        String coursefetch=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


        getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnTrainingTab();

        getTrainingPageActions().verifyLoginBeforeCourseFetch();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(coursefetch);
        QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

        getTrainingPageActions().verifyLoginPopUpWhileJoinCourse();

        getLoginPageActions().loginToTheUser(Username,Password);

        getTrainingPageActions().verifyCreatorNotAbleToEnrollMessage();

    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifySyncNow ")
    public void verifySyncNowCourseProgress() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().verifyDarkMode();


    }





    @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyupdatedidonprofilepage")
    public void updateSubmitFormInProfile() throws Exception {
        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();

        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        //	String enterID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 42, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();
        getHomePageActions().tapOnProfileTab();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getProfileEditPageActions().submitFormUpdate("stagname");
    }


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
            true, description = "ProjectSyncAndShare ")
    public void ProjectSyncAndShare() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
        //  getHomePageActions().tapOnProfileTab();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);


        getLoginPageActions().loginToTheUserForLeader(Username,Password);

        getHomePageActions().createNewProjects();
        getHomePageActions().editCreatedProjects();
        getHomePageActions().sycAndShare();
    }


    @Test()
    public void validateObservationInHomePage() throws Exception {
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

        getHomePageActions().verifyHomePageForObservation();


    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
            true, description = "Verify user is able to add the recover id sucessfully ")
    public void addRecoveryID() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        String recoveryID =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",18,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
        QXClient.get().gestures().BlindWait(6000);
        DikshaMainPageActions d=new DikshaMainPageActions();
        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnProfileTab();
        getProfileEditPageActions().editRecoveryId(recoveryID);
    }

    @Test()
    public void verifySupport() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().tapOnMenuBar();
        getHomePageActions().verifyHelpSection();

    }

    @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifydownloadsection")
    public void downloadSurveyReports() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
        Properties properties = QXClient.get().propUtils()
                .getProperties(System.getProperty("user.dir") + "/configs/config.properties");
        System.out.println("@name:" + properties.getProperty("excelpath"));
        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
        getLoginPageActions().loginToTheUserForLeader(Username,Password);
        getHomePageActions().reportsectionsurvey();

    }

    @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "validateprogramsection")
    public void validateStartObservation() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
        getLoginPageActions().loginToTheUserForLeader(Username,Password);

        getHomePageActions().startObservation();

    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyDarkMode ")
    public void verifyDarkMode() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().verifyDarkMode();


    }



}
