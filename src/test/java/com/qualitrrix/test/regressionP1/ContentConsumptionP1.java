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

public class ContentConsumptionP1 {

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
	description = "Verify verifyZoomInZoomOut ")
	public void VerifyZoomOptionInPDFContent() throws Exception {
	QXClient.get().driver();
	getDikshaMainPageActions().performUserOnBoarding();
	getHomePageActions().tapOnSearchIcon();
	getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
	//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
	getTrainingPageActions().tapOnSearchedPDF();
	getLibraryPageActions().tapOnPlayIcon3();
	getLibraryPageActions().verifyZoomInZoomOut();
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
	public void verifyPageNotFoundTextAndUserAbleToJumpToPageInEpubContent() throws Exception {

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


		getLoginPageActions().loginToTheUser(Username, Password);

		//getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Epub content");

		getTrainingPageActions().tapOnEpubContent();

		getTrainingPageActions().verifyUserAbleToJumpToPagesAndPageNotFoundText();

	}

	@Test()
	public void verifyPageInsteadOfLocationInPDFContent() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

		getTrainingPageActions().tapOnSearchedPDF();
		getLibraryPageActions().tapOnPlayIcon3();
		getLibraryPageActions().verifyPageReplacesLocationInContent();

	}

    
    
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	    		description = "Verify UserAble to verifyIconInPDFHamburgerMenu ")
	    		public void VerifyOptionInPDFContentInHamburgerMenu() throws Exception {
	    		QXClient.get().driver();
	    		getDikshaMainPageActions().performUserOnBoarding();	 
	    		getHomePageActions().tapOnSearchIcon();
	    		getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
	    		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
	    		getTrainingPageActions().tapOnSearchedPDF();
	    		getLibraryPageActions().tapOnPlayIcon3();
	    		getLibraryPageActions().verifyIconInPDFHamburgerMenu();
	    		}
	  

	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Verify verifyNextAndPreviousBtnInPDF ")
	    public void VerifyNextAndPreviousPageInPDFContent() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
	//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
	        getTrainingPageActions().tapOnSearchedPDF();
	        getLibraryPageActions().tapOnPlayIcon3();
	        getLibraryPageActions().verifyNextAndPreviousBtnInPDF();
	    }
	  @Test()
		public void verifyContentDetails() throws Exception {

			QXClient.get().driver();
			getDikshaMainPageActions().performUserOnBoarding();

			getHomePageActions().tapOnDownloadTab();
			Properties properties = QXClient.get().propUtils()
					.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" + properties.getProperty("excelpath"));

			String fetchExcelPathFromConfig = properties.getProperty("excelpath");
			QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

			String BookName = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 26, 2);
			getHomePageActions().tapOnTrainingTab();

			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar(BookName);
			// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
			getTrainingPageActions().tapOnSearchedBook();
			getTrainingPageActions().verifyContentDetailsInContentsPage();

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

	   @Test()
	    public void verifyUserAbleToDownloadContentWithContentSizeLessThan200MB() throws Exception {
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

	        getLibraryPageActions().tapOnDownloadBtn();
	        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();

	        getTrainingPageActions().waitTillTheDownloadButtonDisappears();
	        QXClient.get().gestures().clkBackButton();
	        QXClient.get().gestures().clkBackButton();


	        getHomePageActions().tapOnDownloadTab();
	        getDownloadPageActions().verifyTheDownloadedBook();
	    }
	    
	   @Test()
	    public void verifyUserNotAbleToDownloadTheContentWithContentsizeMoreThan200MB() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("do_21345187807639961611058");

	        getTrainingPageActions().tapOnSearchedLargeSizeBook();

	        getLibraryPageActions().verifyNoDownloadBtnForLargeSizeBook();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnDownloadTab();
	        getDownloadPageActions().verifyNoDownloadsInDownloadSection();
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
	    public void verifyContentForMultipleFilterOptions() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("Resource");
	        getLibraryPageActions().verifyFilterOptions();

	    }
	   @Test()
		public void VerifyLocationIsReplacedWithPageForEpubContent() throws Exception {

			QXClient.get().driver();
			DikshaMainPageActions d = new DikshaMainPageActions();
			getDikshaMainPageActions().performUserOnBoarding();


			Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
			System.out.println("@name:" +
					properties.getProperty("excelpath"));

			String fetchExcelPathFromConfig = properties.getProperty("excelpath");
			QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

			String AutomatioEpubcontent = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 157, 2);

			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar(AutomatioEpubcontent);
			getHomePageActions().VerifyLocationIsReplacedWithPageForEpubContent();


		}
	   
	   
	   
}

