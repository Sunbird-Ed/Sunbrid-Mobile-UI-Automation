package com.qualitrrix.test;

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

public class BookScenarioSanity {
  
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


	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "User is able to Fill Slt Language And UsernBoarding Values")
    public void userAbleToSltLangAndUserOnBoardingDetails() throws Exception {
	  
	  QXClient.get().driver();
	  getDikshaMainPageActions().performUserOnBoarding();
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
			  DikshaMainPageActions d = new DikshaMainPageActions();
			  QXClient.get().gestures().closeApp();
			  d.LaunchAppHomeScreen();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
	      // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

        getTrainingPageActions().tapOnSearchedBook();
    }
  
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,description = "Verify LibrarySection")
	   
	    public void verifyLibrarySection() throws Exception {
	    	 QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoarding();
			  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
					  properties.getProperty("excelpath"));
					  
					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
					  
					  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
		 DikshaMainPageActions d = new DikshaMainPageActions();
		 QXClient.get().gestures().closeApp();
		 d.LaunchAppHomeScreen();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(BookName);
		      // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

	        getTrainingPageActions().tapOnSearchedBook();
	    }



	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify Class And SeeMoreBooksContent in LibrarySection")
	public void verifySeeMoreBooksContent() throws Exception {
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

		getLibraryPageActions().verifyClassAndSeeMoreBooks();

	}
	  
	  
	    @Author(name="Raju")

		@Test()
		public void libraySearchFilter() throws Exception {

			QXClient.get().driver();
			getDikshaMainPageActions().performUserOnBoarding();
			DikshaMainPageActions d = new DikshaMainPageActions();
			QXClient.get().gestures().closeApp();
			d.LaunchAppHomeScreen();
			getHomePageActions().tapOnSearchIcon();
			getHomePageActions().enterTextInSearchBar("do_213948043924267008127");
			getLibraryPageActions().librarySearchFilter();

		}


	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify UserAble to Download Book ")
	public void verifyBookDownload() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);

		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(BookName);
		// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

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
 
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Guestlogged in users are able to stream contents online ")
    public void giveRatingAfterBookConsumption() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
		String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);
		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(BookName);
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

		 getTrainingPageActions().tapOnSearchedBook();

		getLibraryPageActions().tapOnPlayIcon();
		getLibraryPageActions().tapOnPlayIcon2();

		QXClient.get().gestures().clkBackButton();
		getLibraryPageActions().tapOnOKbtn();
		getLibraryPageActions().verifyRatingPopup();
		getLibraryPageActions().tapOnStarIcon();
		getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);
    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Credits and License info section in book TOC page")
    public void creditLicenseInfoSecInBookTOCpage() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	 
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
		  DikshaMainPageActions d = new DikshaMainPageActions();
		  QXClient.get().gestures().closeApp();
		  d.LaunchAppHomeScreen();
      	  getHomePageActions().tapOnSearchIcon();
  	      getHomePageActions().enterTextInSearchBar(BookName);
	       //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

  	      getTrainingPageActions().tapOnSearchedBook();
  	      
  	      QXClient.get().gestures().swipeUp();
  	      QXClient.get().gestures().swipeUp();
          getLibraryPageActions().tapOnCreditAndLicense();
          QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();
          getLibraryPageActions().verifyTermsAndCondLink();
    }
 
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
              description = "Book sharing")
      public void ShareTheBook() throws Exception {
   	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	 
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
		DikshaMainPageActions d = new DikshaMainPageActions();
		  QXClient.get().gestures().closeApp();
		  d.LaunchAppHomeScreen();
      	  getHomePageActions().tapOnSearchIcon();
  	      getHomePageActions().enterTextInSearchBar(BookName);
  	      getTrainingPageActions().tapOnSearchedBook();

          getLibraryPageActions().tapOnShareBtn();
          getLibraryPageActions().tapOnShareBtnFrmSharePop();
          getLibraryPageActions().tapOnShareToWhatsApp();
          // Validating the scenario that whether it is navigating to whatsapp page or not
          getLibraryPageActions().verifyWhatsAppHomePage();
      }




	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify UserAble to Download Book ")
    public void resourceSearchAndVerify() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	 
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  
		//	  String ResourceName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",31,2); 
		DikshaMainPageActions d=new DikshaMainPageActions();
		  QXClient.get().gestures().closeApp();
		  d.LaunchAppHomeScreen();

      	  getHomePageActions().tapOnSearchIcon();
  	      getHomePageActions().enterTextInSearchBar("Resource");
  	      getTrainingPageActions().tapOnSearchedResource();


        getLibraryPageActions().tapOnDownloadBtn();
        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
        //getTrainingPageActions().verifyFileDownloadThroughNotification();
       getTrainingPageActions().waitTillTheDownloadButtonDisappears();
       QXClient.get().gestures().clkBackButton();
       QXClient.get().gestures().clkBackButton();
       getHomePageActions().tapOnDownloadTab();
       //  getDownloadPageActions().verifyTheDownloadedBook();
    }

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify UserAble to stream Book contents online ")
	public void verifyUserAbleToStreamBookContentsOnline() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
		String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);
		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(BookName);
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

		getTrainingPageActions().tapOnSearchedBook();
		getLibraryPageActions().tapOnPlayIcon();
		getLibraryPageActions().tapOnPlayIcon1();
		QXClient.get().gestures().clkBackButton();
		getLibraryPageActions().tapOnOKbtn();
		getLibraryPageActions().verifyRatingPopup();
		getLibraryPageActions().tapOnStarIcon();
		getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);



	}
	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify Class And SeeMoreBooksContent in LibrarySection")
	public void verifyDifferentClassSection() throws Exception {
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
		getLibraryPageActions().verifyClassAndSeeMoreBooks();

	}
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify Class And SeeMoreBooksContent in LibrarySection")
    public void BookWithMultipleTag() throws Exception {
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

	  getLibraryPageActions().verifyClassAndSeeMoreBooks();

    }
}
