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

public class NonInteractableScripts {

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

}

