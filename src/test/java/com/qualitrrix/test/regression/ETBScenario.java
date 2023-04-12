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

public class ETBScenario {

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
	            description = "userAbleToViewBookTOCandUnitsInsideBook ")
	    public void userAbleToViewBookTOCandUnitsInsideBook() throws Exception {
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
	            description = "Verify UserAble to Download Book ")
	    public void verifyBookDownload() throws Exception {
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

	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
              description = "Book sharing")
      public void verifyUserAbleToShareTheBook() throws Exception {
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
  	      
	      // QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);


      //    getLibraryPageActions().verifyContentUI();
         // QXClient.get().gestures().swipeDown();
          //QXClient.get().gestures().swipeDown();
          getLibraryPageActions().tapOnShareBtn();
          getLibraryPageActions().tapOnShareBtnFrmSharePop();
          getLibraryPageActions().tapOnShareToWhatsApp();
          // Validating the scenario that whether it is navigating to whatsapp page or not
          getLibraryPageActions().verifyWhatsAppHomePage();
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
	 
	 
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "verifyDerivedSourceInfoWhnBookCopied")
	    public void verifyDerivedSourceInfoWhnBookCopied() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		    	 
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
		 
	      	getHomePageActions().tapOnSearchIcon();
	  	      getHomePageActions().enterTextInSearchBar(BookName);
		   //    QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

	  	     getTrainingPageActions().tapOnSearchedBook();
	  	      
	  	    QXClient.get().gestures().swipeUp();
	  	  QXClient.get().gestures().swipeUp();
	        getLibraryPageActions().tapOnCreditAndLicense();
	        QXClient.get().gestures().swipeUp();
		 QXClient.get().gestures().swipeUp();
	        getLibraryPageActions().verifyTermsAndCondLink();
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

	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "userAbleToViewBookTOCandUnitsInsideBook ")
	    public void BookTOCandUnitsInsideBook() throws Exception {
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
	            description = "verifyUserAbleToSearchContentOrBook ")
	    public void playTheContent() throws Exception {
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


	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDataSync")
	public void verifyUserAbleToShareTelemetryFiles() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getLibraryPageActions().verifyDataSyncs();

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
	    

	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "MultipleValuesInBMSOnBoarding ")
	    public void MultipleValuesInBMSOnBoarding() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().sltLangAndTeacherRole();
		 getDikshaMainPageActions().sltUserMultipleBMSDropdown();
	      	getHomePageActions().tapOnSearchIcon();
	  	     
	    }
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "TxtBookShowsAsPerBMC ")
	    public void TxtBookShowsAsPerBMC() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().sltLangAndTeacherRole();
		 getDikshaMainPageActions().sltUserMultipleBMSDropdown();
	      	getHomePageActions().tapOnSearchIcon();
	  	     
	    }
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "MediumDisplayedBasedonBoard ")
	    public void MediumDisplayedBasedonBoard() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().sltLangAndTeacherRole();
		 getDikshaMainPageActions().sltUserMultipleBMSDropdown();
	      	getHomePageActions().tapOnSearchIcon();
	  	     
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
	  @Author(name="Raju") 
	    @Test()
	  public void verifyContentFilterType() throws Exception {
	    
	  	  QXClient.get().driver();
	  		 getDikshaMainPageActions().performUserOnBoarding();
	  	      	getHomePageActions().tapOnSearchIcon();
	  	  	      getHomePageActions().enterTextInSearchBar("resource");
	  	          getLibraryPageActions().FilterForContentPublisherMediaType();

	  }
  
	  @Author(name="Raju") 
	    @Test()
	  public void verfiyLetUsKnowBtn() throws Exception {
	    
	  	  QXClient.get().driver();
	  		 getDikshaMainPageActions().performUserOnBoarding();
	  	          getLibraryPageActions().verifyLetUsKnow();

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
 
//  
//	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//            description = "userIsabletoVeriyBookTOC ")
//    public void userIsabletoVeriyBookTOC() throws Exception {
//	 QXClient.get().driver();
//	 getDikshaMainPageActions().performUserOnBoarding();
//	    	  
//	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//			  properties.getProperty("excelpath"));
//			  
//			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			  
//			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
//			  String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2); 
//	 
//      	getHomePageActions().tapOnSearchIcon();
//  	      getHomePageActions().enterTextInSearchBar(BookName);
//	       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
//
//  	     // getTrainingPageActions().tapOnSearchedBook();
//  	      
//        getLibraryPageActions().tapOnPlayIcon();
//	       QXClient.get().gestures().clkBackButton();
//        getLibraryPageActions().tapOnOKbtn();
//        getLibraryPageActions().tapOnStarIcon();
//        getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);
//    }
//    
// 

	@Test()
	public void verifyExploreInteractiveContentPage() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnSearchIcon();

		getLibraryPageActions().verifyFiltersForInteractiveContent();

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
	public void verifyNewTagsInHamburgerMenuAndLoginOptions() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().verifyScanQRAndSelectBoardWhileUserOnBoarding();

		getHomePageActions().tapOnDownloadTab();
		QXClient.get().gestures().closeApp();

		DikshaMainPageActions d = new DikshaMainPageActions();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().verifyNewTagForMyGroupsAndImportContent();

		getHomePageActions().verifyUserLoginInHamburgerMenu();

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().verifyUserLoginInProfile();


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
	public void validateUpdatedDeclarationInSubmitDetails () throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyUpdateConsentWithDifferentOrganization();

		getProfileEditPageActions().updateWithOldConsentOrgAndVerify();

	}


	@Test()
	public void verifyAdoptedTextBooksAndUserAbleToDownloadAndConsumeAdoptedTextBooks() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyBoardInProfileSectionAfterOnboarding();

		getHomePageActions().tapOnLibraryTab();

		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().enterTextInSearchBar("TextBook");

		getLibraryPageActions().verifyAdoptedTextBookAsPerBoardInProfile();

		getLibraryPageActions().tapOnDownloadBtn();
		getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();

		getTrainingPageActions().waitTillTheDownloadButtonDisappears();
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();
		getHomePageActions().tapOnDownloadTab();
		getDownloadPageActions().verifyTheDownloadedAdoptedTextBook();
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
	public void verifyContentsPostApplyingFiltersInTvClassesSection() throws Exception {
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

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();

		getLibraryPageActions().verifyContentsForPostApplyingFilterInTVclassesSection();


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
	public void verifyCustomisedClassFilterInBanners() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyBannersAsPerBMCvalues();

		getHomePageActions().verifyCustomisedFiltersInAnyBannerOfHomePage();

	}

	@Test()
	public void verifyHamburgerMenuOptionWorksInAllPages() throws Exception {
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

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

		QXClient.get().gestures().clkBackButton();
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

		QXClient.get().gestures().clkBackButton();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

		QXClient.get().gestures().clkBackButton();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyHamburgerMenuWorksInLibraryTrainingDownloadAndProfilePage();

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
	public void verifyPreferencesUpdatedInHomePage() throws Exception {
		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnMenuBar();

		getProfileEditPageActions().verifyChangePreferencesInHomePage();

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
	public void validateAdditionalIconsUnderFeaturedSectionOfHomePage() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoardingWithCBSEBoard();

		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyBannersAsPerBMCvalues();

		getHomePageActions().verifyFeaturedSectionInHomePageAndVisualCueInHomePage();

		getHomePageActions().verifyUserAbleToClickAdditionalIconsBelowFeaturedSectionOfHomePage();

	}


}
