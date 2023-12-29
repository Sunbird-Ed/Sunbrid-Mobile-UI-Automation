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
		    public void verifyViewMoreButtonIsDisplayedAndClickableInSearchContentPage() throws Exception {

		        QXClient.get().driver();

		        getDikshaMainPageActions().performUserOnBoarding();

		        getHomePageActions().tapOnSearchIcon();

		        getHomePageActions().enterTextInSearchBar("Course");

		        getTrainingPageActions().verifyResultPageShouldNotLimitedTo100Contents();

		        getTrainingPageActions().verifyViewMoreButtonIsDisplayedAndClickableInSearchContentPage();

		    }
		
		 
		 /* Script Name:- verifyResultsPageShouldNotLimitedToOnlyHundredContentsText()
		   Description:- Verify that in mobile when user search for any content in the result page user should not be limited to only 100 contents. (Ex:- If there are 150 contents result should not be limited to 100)
		 */
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
	  /* Script Name:- verifyUserAbleToSearchContentOrBook()
	   Description:- Verify that user is able to search the contents and recently searched keywords are getting displayed when the user clicks on search icon in library page.
	 */
	@Test()
	public void verifyUserAbleToSearchContentOrBook() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(BookName);

		getHomePageActions().tapOnClearSearch();
		getHomePageActions().verifyDisplayedText(BookName);

	}
	
	
	
	/* Script Name:- verifyHomePageTitlesForHeadTeacherRole()
	   Description:- Verify that home page contains the tiles for program, project, observations & surveys for Head Teacher & Official role
	 */
	@Test()
	public void verifyHomePageTitlesForHeadTeacherRole() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));
		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",7, 3);

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().verifyHomePageForHeadTeacherAndOfficials();

	}
	
	/* Script Name:- validateNavigationFiltersInSearchPage()
	   Description:- Verify that the Navigation filters should be primary category or subject by default and should be configurable in all the sections in Search page
	 */
	@Test()
	public void validateNavigationFiltersInSearchPage() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);
		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().verifyNavigationFiltersUnderDigitalTextbookCategory();
		getHomePageActions().verifyNavigationFilterUnderCoursesCategory();
		getHomePageActions().verifyNavigationFilterUnderInteractiveContent();

	}
	


/* Script Name:- validateGroupingBasedOnSubjectUnderAnyCategoryInSearchPage()
	   Description:- Verify that the Grouping should be happen either by subject or something from organizational framework and should be configurable in any of the categories of the Search page
					 Also verify that the ordering in the grouping should be configurable.
	 */
	@Test()
	public void validateGroupingBasedOnSubjectUnderAnyCategoryInSearchPage() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","Credentials",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "Credentials",2,3);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);
		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().verifyGroupingBasedOnSubjectInDigitalTextBookCategory();

	}
	
	/* Script Name:- verifyMyLearningSectionInHomePage()
    Description:- 1. Verify that in mobile user is displayed with "My Learning" section in home page
                  2. Verify that in mobile user is displayed with all the enrolled courses/ trackable collections in "My Learning" section of home page
  */
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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 2, 3);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyMyLearningInHomePage();
	}


}
