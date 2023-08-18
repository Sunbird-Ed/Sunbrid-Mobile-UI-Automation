package com.qualitrrix.test.regression;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class DigitalTextBookConsumptionP2 {
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
    public void userAbleToImportOnlySingleContentAtATimeFromDeviceStorage () throws Exception {
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
        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUserAbleToImportOnlySpecificContentFromDevice();
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
       // QXClient.get().gestures().swipeUp();
        getLibraryPageActions().verifyTermsAndCondLink();
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
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "TxtBookShowsAsPerBMC ")
    public void TxtBookShowsAsPerBMC() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().sltLangAndTeacherRole();
	 getDikshaMainPageActions().sltUserMultipleBMSDropdown();
      	getHomePageActions().tapOnSearchIcon();
  	     
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	/*
	 * @Test() public void verifyContentDetailsAndCreditsLicenseTabInTextbookTOC()
	 * throws Exception { QXClient.get().driver(); DikshaMainPageActions d = new
	 * DikshaMainPageActions(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 * 
	 * Properties properties = QXClient.get().propUtils()
	 * .getProperties(System.getProperty("user.dir") +
	 * "/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 * 
	 * String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 * 
	 * String Username = QXClient.get().excelUtils().getCellValue("Excel1",
	 * "TestData", 2, 2); String Password =
	 * QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2); String
	 * BookName = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 26,
	 * 2); QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
	 * 
	 * getLoginPageActions().loginToTheUser(Username, Password);
	 * 
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar(BookName);
	 * 
	 * getTrainingPageActions().tapOnSearchedBook();
	 * 
	 * getTrainingPageActions().
	 * verifyContentDetailsTabCreditLicenseInfoAndContentRelevantFor();
	 * 
	 * }
	 */

   

    



    

	
    
 
   

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "MediumDisplayedBasedonBoard ") public void
	 * MediumDisplayedBasedonBoard() throws Exception { QXClient.get().driver();
	 * getDikshaMainPageActions().sltLangAndTeacherRole();
	 * getDikshaMainPageActions().sltUserMultipleBMSDropdown();
	 * getHomePageActions().tapOnSearchIcon();
	 * 
	 * }
	 */
    
   
   
    
  
   

	
    
	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "userAbleToViewBookTOCandUnitsInsideBook ") public void
	 * BookTOCandUnitsInsideBook() throws Exception { QXClient.get().driver();
	 * getDikshaMainPageActions().performUserOnBoarding();
	 * 
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 * 
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 * 
	 * String BookName
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); String
	 * ToasterMsg
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);
	 * 
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar(BookName); //
	 * QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(
	 * BookName); getTrainingPageActions().tapOnSearchedBook();
	 * 
	 * getLibraryPageActions().tapOnPlayIcon();
	 * getLibraryPageActions().tapOnPlayIcon1();
	 * QXClient.get().gestures().clkBackButton();
	 * getLibraryPageActions().tapOnOKbtn();
	 * getLibraryPageActions().clkOnVideoTogglebtn();
	 * getLibraryPageActions().closeRatingPopup();
	 * getLibraryPageActions().tapOnStarIcon();
	 * getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg); }
	 * 
	 */
 

   
   

   




  
 

  

   

  


}
