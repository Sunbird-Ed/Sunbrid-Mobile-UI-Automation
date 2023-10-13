package com.qualitrrix.test.regressionP1;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class DigitalTextBookConsumptionP1 {
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
    
    
    @Author(name="Raju")
    @Test()
    public void MediaTypeFilterCheckBox() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("resource");
        getLibraryPageActions().FilterForContentPublisherMediaType();

    }
    @Test()
    public void verifyUserNotAbleToDownloadLargeSizeBook() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("largesizetextbook");
        getTrainingPageActions().tapOnSearchedLargeSizeBook();
        getLibraryPageActions().verifyNoDownloadBtnForLargeSizeBook();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyNoDownloadsInDownloadSection();
    }
    @Test()
    public void verifyMalformedEcarFileWhileSharingViaSlackApp() throws Exception {
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

        getLibraryPageActions().tapOnShareBtn();
        getLibraryPageActions().tapOnSendFileFromSharePopup();
        getLibraryPageActions().tapOnSendBtnFromSharePopup();
        getLibraryPageActions().tapOnShareToSlackApp();
        getLibraryPageActions().verifySlackAppPage();
        QXClient.get().gestures().clkBackButton();

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
	public void verifyContentDetailsAndContentRelevantForInCourseTOC() throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		String CourseName = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 48, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(CourseName);

		getTrainingPageActions().tapOnSearchedCourse2();

		getTrainingPageActions().verifyCourseDetails();

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
     //  getTrainingPageActions().waitTillTheDownloadButtonDisappears();
       QXClient.get().gestures().clkBackButton();
       QXClient.get().gestures().clkBackButton();

      
       getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyTheDownloadedBook();
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
	public void verifyCollectionTitlePublishingOrgAndOrgFrameworkValuesInCollectionTOC() throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
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
		getHomePageActions().enterTextInSearchBar("CollectionForAutomation");

		getTrainingPageActions().tapOnSearchedCollection();

		getTrainingPageActions().verifyCollectionTitlePublishedByAndOrgFrameworkInCollectionTOC();

	}

   




  
 

  

   

  


}
