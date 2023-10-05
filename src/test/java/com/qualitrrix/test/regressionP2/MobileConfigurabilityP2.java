package com.qualitrrix.test.regressionP2;

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

public class MobileConfigurabilityP2 {

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
	    public void validateAdditionalIconsUnderFeaturedSectionOfHomePage() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnMenuBar();


	        getHomePageActions().verifyBannersAsPerBMCvalues();

	        getHomePageActions().verifyFeaturedSectionInHomePageAndVisualCueInHomePage();

	        getHomePageActions().verifyUserAbleToClickAdditionalIconsBelowFeaturedSectionOfHomePage();

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
		public void validateThreeSectionsOfSearchPage() throws Exception {
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

			getHomePageActions().tapOnSearchIcon();

			getHomePageActions().verifySearchPageSections();

		}
	  @Test()
	    public void verifyExploreInteractiveContentPage() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnSearchIcon();

	        getLibraryPageActions().verifyFiltersForInteractiveContent();

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
		public void validateSectionsInHomePage() throws Exception {
			QXClient.get().driver();
			DikshaMainPageActions d = new DikshaMainPageActions();
			getDikshaMainPageActions().performUserOnBoarding();
			getHomePageActions().tapOnProfileTab();

			Properties properties = QXClient.get().propUtils()
					.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" + properties.getProperty("excelpath"));

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
		public void verifyFixedFilterInSearchPage() throws Exception {

			QXClient.get().driver();
			getDikshaMainPageActions().performUserOnBoarding();

			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar("Course");

			getHomePageActions().verifyNoFilterLabelAndFixedFilters();

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
		public void verifyCoursesForSelectedCategoryAndSelectedSubject() throws Exception {
			QXClient.get().driver();
			getDikshaMainPageActions().performUserOnBoarding();
			DikshaMainPageActions d = new DikshaMainPageActions();
			getHomePageActions().tapOnProfileTab();

			Properties properties = QXClient.get().propUtils()
					.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" + properties.getProperty("excelpath"));

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
		    public void verifyBannersInHomePageAsPerBMC() throws Exception {

		        QXClient.get().driver();
		        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();
		        getHomePageActions().tapOnDownloadTab();

		        getHomePageActions().tapOnMenuBar();

		        getHomePageActions().verifyBannersAsPerBMCvalues();

		    }
	 @Test()
	    public void verifyPreferencesUpdatedInHomePage() throws Exception {
	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnMenuBar();

	        getProfileEditPageActions().verifyChangePreferencesInHomePage();

	    }
	@Author(name="Raju")
	  @Test()
public void HelpButtonVerify() throws Exception {

	  QXClient.get().driver();
	  getDikshaMainPageActions().performUserOnBoarding();
	  getHomePageActions().tapOnProfileTab();
	 
getHomePageActions().tapOnMenuBar();
getHomePageActions().verifyHelpSection();

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
	@Test()
	public void validateAcademicAndNonAcademicSubjectsAsPerOrgFramework() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

		getHomePageActions().verifyContentUnderBrowseByCategoryForOrgFramework();

		getHomePageActions().verifyAcademicAndNonAcademicSubjects();

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

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "MultipleValuesInBMSOnBoarding ")
    public void MultipleValuesInBMSOnBoarding() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().sltLangAndTeacherRole();
        getDikshaMainPageActions().sltUserMultipleBMSDropdown();
        getHomePageActions().tapOnSearchIcon();

    }
    @Test()
 	public void verifyUserAbleToSearchContentAndDiffMediaTypes() throws Exception {
 		QXClient.get().driver();
 		getDikshaMainPageActions().performUserOnBoarding();

 		Properties properties = QXClient.get().propUtils()
 				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
 		System.out.println("@name:" + properties.getProperty("excelpath"));

 		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
 		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

 		String BookName = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 26, 2);

 		getHomePageActions().tapOnSearchIcon();
 		getHomePageActions().enterTextInSearchBar(BookName);

 		getHomePageActions().verifyFiltersForMediaType();

 //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
 		getTrainingPageActions().tapOnSearchedBook();
 		getHomePageActions().verifyContentWithAllMediaType();

 		getHomePageActions().verfiyContentUnderVideoMediaType();

 	}

    @Author(name="Raju")
    @Test()
    public void verfiyLetUsKnowBtn() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        
        getLibraryPageActions().verifyLetUsKnow();

    }
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Verify Class And SeeMoreBooksContent in LibrarySection")
	    public void UserAbleToSeeMoreBooks() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	        
	        getLibraryPageActions().verifyClassAndSeeMoreBooks();

	    }

	 @Test()
	    public void verifySwitchToNewExperiencePostOnboarding() throws Exception{
	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoardingForExistingUser();

	        getHomePageActions().tapOnProfileTab();
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
		public void verifyTextYourPreferencesWithIIconIsClickableInHomePage() throws Exception {
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

			getHomePageActions().verifyTextYourPreferencesWithIIconIsClickableUnderHomePage();
}
	 @Test()
	 public void verfiyNotificationIconSearchBarAndSunbirdText() throws Exception {
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
	     QXClient.get().gestures().BlindWait(5000);
	     getHomePageActions().tapOnMenuBar();
	     getHomePageActions().changeToJoyfulTheme();
	     getHomePageActions().verfiyNotificationIconSearchBarAndSunbirdText();

	 }
}
