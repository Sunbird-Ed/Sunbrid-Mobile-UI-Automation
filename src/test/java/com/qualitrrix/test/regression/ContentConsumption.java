package com.qualitrrix.test.regression;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class ContentConsumption {
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
    		description = "Verify UserAble to PrintPDFContent ")
    		public void PrintIconInPDFContent() throws Exception {
    		QXClient.get().driver();
    		getDikshaMainPageActions().performUserOnBoarding();	 
    		getHomePageActions().tapOnSearchIcon();
    		getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
    		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
    		getTrainingPageActions().tapOnSearchedPDF();
    		getLibraryPageActions().tapOnPlayIcon3();
    		getLibraryPageActions().printPDF();
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
    public void verifyDownloadPopUpInHamburgerMenuOfContent() throws Exception {

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

        //getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
        getTrainingPageActions().tapOnSearchedPDF();
        getTrainingPageActions().verifyDownloadPopupOfContent();


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

        getTrainingPageActions().consumeEpubContentInDownloadSection();


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
	public void verifySamePageNumberInPDFContentWhileReconsumingTheSameContent() throws Exception {

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

		// getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

		getTrainingPageActions().tapOnSearchedPDF();
		getLibraryPageActions().tapOnPlayIcon3();

		getLibraryPageActions().verifyZoomInZoomOut();

		getTrainingPageActions().verifyUserAbleToConsumeEpubContent();

		getTrainingPageActions().verifySamePageNumberInPDFContentWhileReconsumingPDFContent();

	}

    
    @Test()
	public void verifySamePageNumberInEpubContentWhileReconsumingTheSameContent() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getHomePageActions().tapOnDownloadTab();
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
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Epub");

		getTrainingPageActions().tapOnEpubContent();
		getTrainingPageActions().verifyUserAbleToPlayEpubContent();
		getTrainingPageActions().verifyUserAbleToConsumeEpubContent();

		getTrainingPageActions().verifySamePageNumberInEpubContentWhileReconsumingEpubContent();

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
    public void verifyUserNotAbleToDownloadTheContentWithContentsizeMoreThan200MB() throws Exception {
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
    public void validateKannadaRatingPopUpAndKannadaTextIsDisplayedInRatingSectionPostConsumeCourse() throws Exception {
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
        DikshaMainPageActions d = new DikshaMainPageActions();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().tapOnLanguage();
        getHomePageActions().tapOnKannadaLanguage();

        getHomePageActions().tapOnContinueBtnKannada();

        getHomePageActions().tapOnTrainingTab();

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
        getTrainingPageActions().tapOnSearchedSmallCourse();

        getTrainingPageActions().verifyRatingsTextIsDisplayedInKannadaLanguage();

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
   	public void AppCloseOnClkYesButon() throws Exception {

   		QXClient.get().driver();
   		getDikshaMainPageActions().performUserOnBoarding();

   		getHomePageActions().closeAppOnClkYesBtn();
   	}
   	  

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify UserAble to Download Book ")
    public void verifyUserAbleToDownloadTheContent() throws Exception {
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


    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
    		description = "StartLearningButtonOnjoinCourse",dependsOnMethods = { "verifyUserAbleToEnrollConsumeCourseContent" })
    		public void ExcellentTextVerify() throws Exception {
    		QXClient.get().driver();
    			 System.out.println("verify ExcellentTextVerify");
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
	public void verifyContentForAllMediaType() throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		// getHomePageActions().tapOnProfileTab();

		// getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Resource");

		getTrainingPageActions().verifyContentForAllMediaTypeFilter();

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

    @Test()
    public void verifyContentForMultipleFilterOptions() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Resource");
        getLibraryPageActions().verifyFilterOptions();

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
	     //  QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

  	      getTrainingPageActions().tapOnSearchedBook();
  	      
        getLibraryPageActions().tapOnPlayIcon();
        getLibraryPageActions().tapOnPlayIcon1();

	       QXClient.get().gestures().clkBackButton();
        getLibraryPageActions().tapOnOKbtn();
        getLibraryPageActions().tapOnStarIcon();
        getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);
    }
    
    @Test()
    public void verifyThisContentCannotBeDownloadedMsgForLargeContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();

        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String largeVideoContent =QXClient.get().excelUtils().getCellValue("Excel1","TestData",91,2);

        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(largeVideoContent);

        getTrainingPageActions().tapOnLargeVideoContent();

        getDownloadPageActions().verifyDisabledDownloadBtnAndValidateMessagePostClickingDownloadBtn();

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

    
    @Test()
    public void userNavigatedToFirstPagePostClickingReviewBtnInSummaryPage() throws Exception {

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
        String questionSet = QXClient.get().excelUtils().getCellValue("Excel1","TestData",114,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);

        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnSearchIcon();

        getHomePageActions().enterTextInSearchBar(questionSet);

        getTrainingPageActions().tapOnQuestionSet1();

        getTrainingPageActions().verifyFirstPageOfContentPostClickingReviewBtn();

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
    public void SearchContent() throws Exception{
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



  
 

  

   

  


}
