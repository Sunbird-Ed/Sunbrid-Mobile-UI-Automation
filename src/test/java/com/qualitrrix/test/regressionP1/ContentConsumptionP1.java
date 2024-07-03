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
	/*
 * Method Name: VerifyZoomOptionInPDFContent
 * Description: Verify that user is able to Zoom in and Zoom out the pdf content by clicking on (-/+) icon
 */
	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	description = "Verify verifyZoomInZoomOut ")
	public void VerifyZoomOptionInPDFContent() throws Exception {
	QXClient.get().driver();
	getDikshaMainPageActions().performUserOnBoarding();
	getHomePageActions().tapOnSearchIcon();
	getHomePageActions().enterTextInSearchBar("donotuse_pdf");
	//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
	getTrainingPageActions().tapOnSearchedPDF();
	getLibraryPageActions().tapOnPlayIcon3();
	getLibraryPageActions().verifyZoomInZoomOut();
	}
	/*
	 * Method Name: verifyContentCardDetails
	 * Description: Verify that in mobile the content card is displayed with the below details to make user to know what the content is about
a. Title of the content
b. By <Publishing organization>
c. Org framework attributes (<Board><Medium><Class><Subject>) as tiles
d. Primary category of a content (It will be dipslayed in ribbon like Textbook, TV Classes etc.)
e. Content image
	 */
	 @Test()
	    public void verifyContentCardDetails() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(BookName);
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
	        getTrainingPageActions().tapOnSearchedBook();

	        getLibraryPageActions().verfiyContentCardDetailsOfContent();

	    }

	/*
	 * Method Name: VerifyZoomOptionInPDFContent
	 * Description: Verify user is able to see percentage of completion for mobile
	 * Verify user should be able to jump to pages for mobile
	 * Verify when user enters wrong page no. user should be able to see a message (page not found) for mobile
	 */
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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);


		getLoginPageActions().loginToTheUser(Username, Password);

		//getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("donotuse_epub");

		getTrainingPageActions().tapOnEpubContent();

		getTrainingPageActions().verifyUserAbleToJumpToPagesAndPageNotFoundText();

	}
	/*
	 * Method Name:verifyPageInsteadOfLocationInPDFContent
	 * Description: Verify that "Location" label is changes to "Page" on that player while displaying the % on pdf player on app
	 */
	@Test()
	public void verifyPageInsteadOfLocationInPDFContent() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("donotuse_pdf");

		getTrainingPageActions().tapOnSearchedPDF();
		getLibraryPageActions().tapOnPlayIcon3();
		getLibraryPageActions().verifyPageReplacesLocationInContent();

	}
	/*
	 * Method Name:VerifyOptionInPDFContentInHamburgerMenu
	 * Description: Verify that user is able to click on Hamburger menu in the pdf content and see the below options
1. Share
2. Download
3. Print
4. Exit
	 */
    
    
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	    		description = "Verify UserAble to verifyIconInPDFHamburgerMenu ")
	    		public void VerifyOptionInPDFContentInHamburgerMenu() throws Exception {
	    		QXClient.get().driver();
	    		getDikshaMainPageActions().performUserOnBoarding();	 
	    		getHomePageActions().tapOnSearchIcon();
	    		getHomePageActions().enterTextInSearchBar("donotuse_pdf");
	    		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
	    		getTrainingPageActions().tapOnSearchedPDF();
	    		getLibraryPageActions().tapOnPlayIcon3();
	    		getLibraryPageActions().verifyIconInPDFHamburgerMenu();
	    		}

	/*
         * Method Name: VerifyNextAndPreviousPageInPDFContent
         * Description: Verify user is able to navigate to previous page or next page by clicking on < and > icons
         */
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Verify verifyNextAndPreviousBtnInPDF ")
	    public void VerifyNextAndPreviousPageInPDFContent() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("donotuse_pdf");
	//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
	        getTrainingPageActions().tapOnSearchedPDF();
	        getLibraryPageActions().tapOnPlayIcon3();
	        getLibraryPageActions().verifyNextAndPreviousBtnInPDF();
	    }
	/*
	 * Method Name: verifyContentDetails
	 * Description: Verify that in content details,
1. In title section, title + publisher is shown
2. In content metadata section, organization framework details is shown
3. If there is a target framework, "This content is relevant for:" is displayed with
a) Audience type
b) Board, Medium, Class and Subject
	 */
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

			String BookName = QXClient.get().excelUtils().getCellValue("Excel1", "Contents", 14, 2);
			getHomePageActions().tapOnTrainingTab();

			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar(BookName);
			// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
			getTrainingPageActions().tapOnSearchedBook();
			getTrainingPageActions().verifyContentDetailsInContentsPage();

		}
	/*
* Method Name: verifyContentTypeFilterAndAdditionalCategoriesInFiltersSection
* Description: Verify that user is displayed with the respective primary content type options (linked) will be shown in primary content type filter after selecting the additional categories type filter
* 1. Verify that user is displayed with all the matched contents when user applies the Primary content type filter
2. Verify that user is displayed with the respective additional category options (linked) will be shown in additional content type filter after selecting the Primary content type
* Verify that when a user sees any additional content type filer, they see additional categories dependent on the primary content type filter, when user applies it then user is displayed with all the content which matches the content additional content type alone OR a combination of content filter and additional content filter is displayed
*/
	   @Test()
		public void verifyContentTypeFilterAndAdditionalCategoriesInFiltersSection() throws Exception {

			QXClient.get().driver();

			getDikshaMainPageActions().performUserOnBoarding();

			getHomePageActions().tapOnSearchIcon();

			getHomePageActions().enterTextInSearchBar("donotuse_CoursewithallContentTypesand1ExpiryBatch");

			getLibraryPageActions().verifyAllFilterInContentType();

			getLibraryPageActions().observeTheAdditionalCategories();

			getLibraryPageActions().verifyContentForContentTypeAndAdditionalCategoriesFilter();

		}
	/*
* Method Name: verifyUserAbleToPlayTheContent
* Description: Verify that user is able to play the content online (irrespective of whether streaming URL is present or not)
*/
	   @Test()
	    public void verifyUserAbleToPlayTheContent() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" + properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);
	        String bookfetch = QXClient.get().excelUtils().getCellValue("Excel1", "Contents", 14, 2);
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
	/*
	 * Method Name: verifyConsumeAllContentsInMobileDevices
	 * Description:Verify that User is able to consume all type of contents from mobile devices(pdf, mp4, epub, etc)
	 */
	   @Test()
	    public void verifyConsumeAllContentsInMobileDevices() throws Exception {
	    QXClient.get().driver();
	    getDikshaMainPageActions().performUserOnBoarding();

	    getHomePageActions().tapOnSearchIcon();
	    getHomePageActions().enterTextInSearchBar("donotuse_mp4");

	    getLibraryPageActions().verifyPlayMp4Content();

	    QXClient.get().gestures().closeApp();

	    DikshaMainPageActions d = new DikshaMainPageActions();
	    d.LaunchAppHomeScreen();

	    getHomePageActions().tapOnSearchIcon();
	    getHomePageActions().enterTextInSearchBar("donotuse_epub");

	    getLibraryPageActions().verifyPlayEpubContent();

	    QXClient.get().gestures().closeApp();

	    DikshaMainPageActions d1 = new DikshaMainPageActions();
	    d1.LaunchAppHomeScreen();

	    getHomePageActions().tapOnSearchIcon();
	    getHomePageActions().enterTextInSearchBar("donotuse_courseassessment");

	    getLibraryPageActions().verifyAssessmentConsumption();


	    }
	/*
	 * Method Name: verifyUserAbleToDownloadContentWithContentSizeLessThan200MB
	 * Description: Verify that if a content is less than 200MB then user should be allowed to download the contents
	 */
	   @Test()
	    public void verifyUserAbleToDownloadContentWithContentSizeLessThan200MB() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);


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
	/*
	 * Method Name: verifyUserNotAbleToDownloadTheContentWithContentsizeMoreThan200MB
	 * Description: Verify that if a content is more than 200MB then user should not be allowed to download the contents
	 */
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

	/*
	 * Method Name: verifyUrduTextInUrduContentWhileConsumingTheContent
	 * Description: Verify that urdu font displayed correctly during consumption of content in mobile app
	 */
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

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 5, 3);
	        String urduContent = QXClient.get().excelUtils().getCellValue("Excel1","Contents",11,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(urduContent);
	        getTrainingPageActions().verifyUrduSubjectInUrduContent();
	        getTrainingPageActions().tapOnSearchUrduContent();


	        getTrainingPageActions().validateUrduTextWhileConsumingUrduContent();

	    }
	/*
	 * Method Name: verifyContentForMultipleFilterOptions
	 * Description: Verify that search results should be filtered based on the filter parameters
	 * Verify that post content search user see the filter with below options
1. board (single select)
2. medium
3. class
4. subject
5. media type
6. content type
7. meant for
8. published by
* Verify that in mobile when user apllies filters, user should be able to select the filters for all fields
	 */
	   @Test()
	    public void verifyContentForMultipleFilterOptions() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("Resource");
	        getLibraryPageActions().verifyFilterOptions();

	    }
	/*
 * Method Name: VerifyLocationIsReplacedWithPageForEpubContent
 * Description: Verify that "Location" label is chanages to "Page" on that player while displaying the % on epub player on app
 */
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

			String AutomatioEpubcontent = QXClient.get().excelUtils().getCellValue("Excel1", "Contents", 4, 2);

			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar(AutomatioEpubcontent);
			getHomePageActions().VerifyLocationIsReplacedWithPageForEpubContent();


		}
	/*
	 * Method Name: VerifyUserConsumeContentInFullScreen
	 * Description: Verify user should be able to consume the content in full screen mode on mobile app
	 */
	   @Test()
	 	public void VerifyUserConsumeContentInFullScreen() throws Exception {

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

	 		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 8, 2);
	 		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Credentials", 8, 3);
	 		String AutomationcontentVdforfullscreen = QXClient.get().excelUtils().getCellValue("Excel1", "Contents", 2, 2);
	 		getLoginPageActions().loginToTheUser(Username, Password);
	 		getHomePageActions().tapOnTrainingTab();
	 		getHomePageActions().tapOnSearchIcon();
	 		getHomePageActions().enterTextInSearchBar(AutomationcontentVdforfullscreen);
	 		getHomePageActions().VerifyUserConsumeContentInFullScreen();


	 	}
	   
	  
}

