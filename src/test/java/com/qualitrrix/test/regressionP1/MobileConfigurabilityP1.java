package com.qualitrrix.test.regressionP1;

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

public class MobileConfigurabilityP1 {

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
		public void verifyExplorePageLabelAndFiltersInExploreSubjectPage() throws Exception {
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

			getHomePageActions().tapOnMenuBar();

			getHomePageActions().verifyExploreCategoryLabel();

			getHomePageActions().verifyExploreSubjectAndFiltersInExplorePage();
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
		    public void verifyViewMoreButtonIsDisplayedAndClickableInSearchContentPage() throws Exception {

		        QXClient.get().driver();

		        getDikshaMainPageActions().performUserOnBoarding();

		        getHomePageActions().tapOnSearchIcon();

		        getHomePageActions().enterTextInSearchBar("Course");

		        getTrainingPageActions().verifyResultPageShouldNotLimitedTo100Contents();

		        getTrainingPageActions().verifyViewMoreButtonIsDisplayedAndClickableInSearchContentPage();

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
		public void validatePopularCategoriesSectionInSearchPage() throws Exception {

			QXClient.get().driver();
			getDikshaMainPageActions().performUserOnBoarding();

			getHomePageActions().tapOnLibraryTab();

			getHomePageActions().verifyPopularCategoriesInSearchPage();
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
	    public void validateTheFeaturedSectionInHomePage() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().verifyBannersAsPerBMCvalues();

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
	  @Test()
		public void verifyMyLearningSectionInHomePage() throws Exception {
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

			getHomePageActions().tapOnMenuBar();

			getHomePageActions().verifyMyLearningInHomePage();
		}
	  @Test()
		public void verifyDefaultFiltersAdvancedFiltersNavigationFilterAndGroupingBySubjectInBanners() throws Exception {

			QXClient.get().driver();

			getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

			// getHomePageActions().tapOnDownloadTab();

			getHomePageActions().tapOnMenuBar();

			getHomePageActions().verifyHomePageBannersAndUserPreferences();

			getHomePageActions().verifyDefaultFiltersWithSubjectRoleAndAdvancedFiltersPostClickingAnyBanner();

			getHomePageActions().verifyNavigationFilterPostClickingBanner();

			getHomePageActions().verifyGroupingBasedOnSubject();

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
	 
}
