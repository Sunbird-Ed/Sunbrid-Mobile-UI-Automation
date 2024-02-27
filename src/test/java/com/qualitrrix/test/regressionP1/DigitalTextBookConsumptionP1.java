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
    
    /*
    * Method Name:MediaTypeFilterCheckBox
    * Description: Verify that in filter page while searching any book content, below media type filters should display with checkboxes
1. All
2. Video
3. Interactive
4. Document
*
    *
    * */
    @Author(name="Raju")
    @Test()
    public void MediaTypeFilterCheckBox() throws Exception {

        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("resource");
        getLibraryPageActions().FilterForContentPublisherMediaType();

    }
	/*
    * Method Name:
    * Description:Verify that when a large file is added in the textbook and when user downloads the entire book then such files should not be downloaded
 */
	@Test()
    public void verifyUserNotAbleToDownloadLargeSizeBook() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        DikshaMainPageActions d = new DikshaMainPageActions();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("do_213950145893761024130");
        getTrainingPageActions().tapOnSearchedLargeSizeBook();
        getLibraryPageActions().verifyNoDownloadBtnForLargeSizeBook();
        d.LaunchAppHomeScreen();
        getHomePageActions().tapOnDownloadTab();
        getDownloadPageActions().verifyNoDownloadsInDownloadSection();
    }
	/*
	 * Method Name:verifyMalformedEcarFileWhileSharingViaSlackApp
	 * Description: In the mobile app, ECAR files are malformed, at collection level, when shared using the "Send File" option, under "Share" option.
	 */
	@Test()
    public void verifyMalformedEcarFileWhileSharingViaSlackApp() throws Exception {
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

        getLibraryPageActions().tapOnShareBtn();
        getLibraryPageActions().tapOnSendFileFromSharePopup();
        getLibraryPageActions().tapOnSendBtnFromSharePopup();
        getLibraryPageActions().tapOnShareToSlackApp();
        getLibraryPageActions().verifySlackAppPage();
        QXClient.get().gestures().clkBackButton();

    }
	/*
	 * Method Name:verifyUserAbleToDownloadTheContent
	 * Description: Verify that if any content inside the book is downloaded, then that content is shown with green check mark and non downloaded contents without green check mark
	 */
	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify UserAble to Download Book ")
    public void verifyUserAbleToDownloadTheContent() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	 
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
			  
	 
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
	/*
	 * Method Name:verifyContentDetailsAndContentRelevantForInCourseTOC
	 * Description:Verify that when user clicks on collection card and lands on collection toc page, User is shown with the following details
 In Content details section,
a) The merged list values values(targeted + org framework) should be included in a section called "This contentis relevant for".
b) If there is no target framework associated, this section will not be shown.
 */
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
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel3");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel2");
		String Username = QXClient.get().excelUtils().getCellValue("Excel3", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel3", "Credentials", 5, 3);
		String CourseName = QXClient.get().excelUtils().getCellValue("Excel2", "Course", 2, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(CourseName);

		getTrainingPageActions().tapOnSearchedCourse2();

		getTrainingPageActions().verifyCourseDetails();

	}

	/*
	 * Method Name:verifyDerivedSourceInfoWhnBookCopied
	 * Description: Verify if any book is copied and published then in license and attribution section the original content details also should be displayed
	 */

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyDerivedSourceInfoWhnBookCopied")
    public void verifyDerivedSourceInfoWhnBookCopied() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	 
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
	 
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
	/*
	 * Method Name:verifyDerivedSourceInfoWhnBookCopied
	 * Description: Verify that download, delete and share icons/ buttons are getting displayed in book toc page

&

Verify that user is able to download the book manually or by scanning qr code
	 */
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "userAbleToViewBookTOCandUnitsInsideBook ")
    public void userAbleToViewBookTOCandUnitsInsideBook() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	  
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
			  String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","Contents",21,2);
	 
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
	/*
	 * Method Name:verifyBookDownload
	 * Description: Verify when user attempts to download a content (or all contents) and already many contents are downloading in queue, it should be added in queue after the book’s spine - so that the spine is taken in first.
	 */


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

	/*
	 * Method Name:playTheContent
	 * Description: Verify that user is able to view the content card with "play" button to the right in textbook TOC page and post tapping on play button, content should play immediately
	 */
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyUserAbleToSearchContentOrBook ")
    public void playTheContent() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	  
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","Contents",14,2);
			  String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","Contents",21,2);
	 
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
	/*
	 * Method Name:verifyAdoptedTextBooksAndUserAbleToDownloadAndConsumeAdoptedTextBooks
	 * Description: Verify that if user searches for any textbook then the result should matches my profile settings shown first and all other instances of adopted textbooks if they match the search term
	 */
    
	@Test()
	public void verifyAdoptedTextBooksAndUserAbleToDownloadAndConsumeAdoptedTextBooks() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyBoardInProfileSectionAfterOnboarding();

		getHomePageActions().tapOnLibraryTab();

		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().enterTextInSearchBar("donotuse_TextbookwithAllContentTypesandAdopted");

		getLibraryPageActions().verifyAdoptedTextBookAsPerBoardInProfile();

		getLibraryPageActions().tapOnDownloadBtn();
		getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();

		getTrainingPageActions().waitTillTheDownloadButtonDisappears();
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();
		getHomePageActions().tapOnDownloadTab();
		getDownloadPageActions().verifyTheDownloadedAdoptedTextBook();
	}
	/*
	 * Method Name:verifyUserAbleToSearchContentAndDiffMediaTypes
	 * Description: Verify that in textbook toc when user clicks on any particular media type filter, then user is only shown that content which matches that filfter
	 */
	@Test()
  	public void verifyUserAbleToSearchContentAndDiffMediaTypes() throws Exception {
  		QXClient.get().driver();
  		getDikshaMainPageActions().performUserOnBoarding();

  		Properties properties = QXClient.get().propUtils()
  				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
  		System.out.println("@name:" + properties.getProperty("excelpath"));

  		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
  		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

  		String BookName = QXClient.get().excelUtils().getCellValue("Excel1", "Contents",14,2);

  		getHomePageActions().tapOnSearchIcon();
  		getHomePageActions().enterTextInSearchBar(BookName);

  		getHomePageActions().verifyFiltersForMediaType();

  //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
  		getTrainingPageActions().tapOnSearchedBook();
  		getHomePageActions().verifyContentWithAllMediaType();

  		getHomePageActions().verfiyContentUnderVideoMediaType();

  	}
	/*
	 * Method Name:verifyCollectionTitlePublishingOrgAndOrgFrameworkValuesInCollectionTOC
	 * Description: Verify that when user clicks on any digital textbook card and lands on collection toc page, User is shown with the following details

 In the title bar
a) collection title
b) by <publishing org> and
c) Org framework values (i.e. <Board><Medium><Class><Subject>)
	 */
    
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
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel3");

		String Username = QXClient.get().excelUtils().getCellValue("Excel3", "Credentials", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel3", "Credentials", 5, 3);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("CollectionForAutomation");

		getTrainingPageActions().tapOnSearchedCollection();

		getTrainingPageActions().verifyCollectionTitlePublishedByAndOrgFrameworkInCollectionTOC();

	}

   




  
 

  

   

  


}
