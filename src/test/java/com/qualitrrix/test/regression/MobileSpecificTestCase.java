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

public class MobileSpecificTestCase {

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

	
	 @Test()
	    public void userAbleToChangeTheAppLanguageInHamburgerMenu() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String KannadaText =QXClient.get().excelUtils().getCellValue("Excel1","TestData",6,2);
	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().tapOnLanguage();
	        getHomePageActions().tapOnKannadaLanguage();

	        getHomePageActions().tapOnContinueBtnKannada();

	        DikshaMainPageActions d2=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d2.LaunchAppHomeScreen();
	        getHomePageActions().tapOnDownloadTab();


	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().verifyKanndaTextChanged(KannadaText);
	    }



	
    @Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDeviceID")
    public void verifyDeviceID() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getLibraryPageActions().verifyDeviceIDAndShareDeviceID();
        getLibraryPageActions().tapOnShareToWhatsApp();
        getLibraryPageActions().verifyWhatsAppHomePage();
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


	

    @Test()
    public void verifyCourseInClassicAndSearchInNewExperience() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        getHomePageActions().verifySearchTabInsteadOfCoursesTabInNewExperience();


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
    public void verifyDebugModeInSettings() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();

        getHomePageActions().verifyEnableDisableDebugMode();

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
	    public void validateSolutionForIncorrectProgressFAQ() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();

	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().verifyHelpSection();

	        getHomePageActions().verifyCoursesAndCertificatesSection();

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

}
