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

public class UBScenarioSanity2 {

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
	  
	  @Test() public void addUserInProfileScrn() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
	  getLoginPageActions().loginToTheUser(Username,Password);
	
	  getHomePageActions().tapOnMenuBar();
	 	  	  getCoursePageActions().tapOnAddAnotherUser();
	  
	  String FakeName=QXClient.get().gestures().generateRandomName();
	  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	  System.out.println(storeFakeNameEntered);
	  getCoursePageActions().tapOnAddUserBtn();
	  getHomePageActions().tapOnMenuBar();
	  
	  getCoursePageActions().tapOnMoreOption();
	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
	  
	  getCoursePageActions().tapOnChangeUser(); 
	  
	  getCoursePageActions().tapOnTermsAndCondition();
	  
	  getCoursePageActions().tapOnContinueForSwicthUser();
	  
	  getHomePageActions().tapOnProfileTab();
	  
	  getCoursePageActions().verifyDistricAndState();
	  
	  }
	  
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	  true, description = "verifyAnotherUserButton In Menu")
	  public void verifyAddUserInHamburgerMenu() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		  
	  getLoginPageActions().loginToTheUser(Username,Password);
	  getHomePageActions().tapOnMenuBar();
	  getCoursePageActions().verifyAddAnotherUserIsDisplayed();
	  getCoursePageActions().tapOnAddAnotherUser();
	  
	  }
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	  true, description = "verifyAnotherUserButton In Menu") 
	  public void verifyAnotherUserButton() throws Exception {
		  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		  
	  
	  getLoginPageActions().loginToTheUser(Username,Password);
	  getHomePageActions().tapOnMenuBar();
	  getCoursePageActions().verifyAddAnotherUserIsDisplayed();
	  getCoursePageActions().tapOnAddAnotherUser();
	  
	  }
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	  true, description = "Switch User In Menu")
	  public void SwitchUser() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		  
	  getLoginPageActions().loginToTheUser(Username,Password);
	  getHomePageActions().tapOnMenuBar();
	  getCoursePageActions().tapOnMoreOption();
	  getCoursePageActions().clickFirstUser();
	  getCoursePageActions().tapOnChangeUser();
	  getCoursePageActions().CheckTermsCheckBoxORClickProfile();
	  getCoursePageActions().verifyDistricAndState();
	  
	  }
	 
	
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	  true, description = "verfiySubmitFormsInIamTeacher")
	  public void verfiySubmitFormsInIamTeacher() throws Exception {
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		  
	  getLoginPageActions().loginToTheUser(Username,Password);

	  
	  getCoursePageActions().VerifySubmitDetailsForm();
	  }
	 
	
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	  true, description = "Switch User In Menu")
	  public void CoursesSectioInProfileSection() throws Exception { 
		  QXClient.get().driver();
	  getDikshaMainPageActions().performUserOnBoarding();
	  getHomePageActions().tapOnProfileTab();
	  
	  
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	  properties.getProperty("excelpath"));
	  
	  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	  
	  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
	  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	  
	  getLoginPageActions().loginToTheUser(Username,Password);
	  getHomePageActions().tapOnProfileTab();
	  getCoursePageActions().verifyCoursesSectionInProfile();
	  
	  
	  }
	 
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			  true, description = "Verify user is able to add the recover id sucessfully ")
			  public void updateTheProfileDetails() throws Exception {
				  QXClient.get().driver();
				  getDikshaMainPageActions().performUserOnBoarding();
				  getHomePageActions().tapOnProfileTab();
				  
				  
				  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
				  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
				  String recoveryID =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",18,2);

			  
			  getLoginPageActions().loginToTheUser(Username,Password);
			  getHomePageActions().tapOnProfileTab(); //
			  getProfileEditPageActions().editRecoveryId(recoveryID);
			  }
	  
	  
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Course should display under trainings attended section in profile section, if user has consumed the course completely.")
	    public void ongoingCourseDisplayingInTrainingAttendedSecInProfileScrn() throws Exception {
		  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
	  
		  
	        getHomePageActions().tapOnProfileTab();
	   	 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
				  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
 
	  	 
  getLoginPageActions().loginToTheUser(Username,Password);
	       
  Thread.sleep(2000);
  getHomePageActions().tapOnDownloadTab();
  Thread.sleep(4000);
  getHomePageActions().tapOnProfileTab();
      
  
  //QXClient.get().gestures().swipeUp();
  
  getCoursePageActions().tapOnOngoingCourse();
  Thread.sleep(2000);

  
 // QXClient.get().gestures().scrollAndClick("Ongoing");
  
	        
	     
	    }

		@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Course should display under trainings attended section in profile section, if user has consumed the course completely.")
	    public void completedCourseDisplayingInTrainingAttendedSecInProfileScrn() throws Exception {
			  
			  QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoarding();
		  
			  
		        getHomePageActions().tapOnProfileTab();
		   	 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
					  properties.getProperty("excelpath"));
					  
					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
					  
					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);

		  	 
	  getLoginPageActions().loginToTheUser(Username,Password);
		       
	  Thread.sleep(2000);
	  getHomePageActions().tapOnDownloadTab();
	  Thread.sleep(4000);
	  getHomePageActions().tapOnProfileTab();

	    
	//  QXClient.get().gestures().scrollAndClick("Completed");
    //  QXClient.get().gestures().swipeUp();
        getCoursePageActions().tapOnCompletedCourse();
	      Thread.sleep(2000);

	    }

	  
	  
	  
	  
	  
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	          description = "Guest user is able UnEnroll from Course.")
	  public void verifyLeaveTraining() throws Exception {

		  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  	 getHomePageActions().tapOnTrainingTab();
		  
		  	 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
					  properties.getProperty("excelpath"));
					  
					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
					  
					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
					  String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);

		  	 
		       getHomePageActions().tapOnSearchIcon();
		       getHomePageActions().enterTextInSearchBar(LeaveCourse);
		       getTrainingPageActions().tapOnSearchedCourse();
		         getTrainingPageActions().tapOnJoinTraining();
		   
	  getLoginPageActions().loginToTheUser(Username,Password);
         getTrainingPageActions().leaveCourse();
	  }
	 	 

	  
	  
	  
	  
	  
	  
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	          description = "Guest user is able UnEnroll from Course.")
	  public void courseUsingTextBook() throws Exception {

		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
	  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String CourseUsingTextBook=QXClient.get().excelUtils().getCellValue("Excel1","TestData",29,2); 
		  

	  	 getHomePageActions().tapOnTrainingTab();
	       
	       getHomePageActions().tapOnSearchIcon();
	       getHomePageActions().enterTextInSearchBar(CourseUsingTextBook);
	       getTrainingPageActions().tapOnSearchedCourse();
	  
	 	 
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	// WithOut login Scenrio
	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDataSync")
	public void verifyDataSync() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getLibraryPageActions().verifyDataSyncs();

	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "ShareDikshaApp")
	public void ShareDikshaApp() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getLibraryPageActions().shareDikshaApp();
		getLibraryPageActions().tapOnShareBtnFrmSharePop();
		getLibraryPageActions().tapOnShareToWhatsApp();
		getLibraryPageActions().verifyWhatsAppHomePage();
	}

	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDeviceID")
	public void verifyDeviceID() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getLibraryPageActions().verifyDeviceIDAndShareDeviceID();
		getLibraryPageActions().tapOnShareToWhatsApp();
		getLibraryPageActions().verifyWhatsAppHomePage();
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
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
			  
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar(BookName);
        getTrainingPageActions().tapOnSearchedBook();
    }
  
  
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify Class And SeeMoreBooksContent in LibrarySection")
    public void verifySeeMoreBooksContent() throws Exception {
    	 QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  
    	        getLibraryPageActions().verifyClassAndSeeMoreBooks();

    }
       
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify LibrarySection")
    public void verifyLibrarySection() throws Exception {
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
    }
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifyLoginOptionIsPresentForStudent")
    public void verifyLoginOptionIsPresentForStudent() throws Exception {
    	 QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoardingWithStudent();
		  getHomePageActions().tapOnProfileTab();
		  getHomePageActions().verifyLoginOptionIsPresentForStudent();

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
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
			  String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2); 
	 
      	getHomePageActions().tapOnSearchIcon();
  	      getHomePageActions().enterTextInSearchBar(BookName);
  	      getTrainingPageActions().tapOnSearchedBook();
  	      
        getLibraryPageActions().tapOnPlayIcon();
	       QXClient.get().gestures().clkBackButton();
        getLibraryPageActions().tapOnOKbtn();
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
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
	 
      	getHomePageActions().tapOnSearchIcon();
  	      getHomePageActions().enterTextInSearchBar(BookName);
  	      getTrainingPageActions().tapOnSearchedBook();
  	      
  	    QXClient.get().gestures().swipeUp();
  	  QXClient.get().gestures().swipeUp();
        getLibraryPageActions().tapOnCreditAndLicense();
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
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
	 
      	getHomePageActions().tapOnSearchIcon();
  	      getHomePageActions().enterTextInSearchBar(BookName);
  	      getTrainingPageActions().tapOnSearchedBook();	  	  
  	      
 

          getLibraryPageActions().verifyContentUI();
          QXClient.get().gestures().swipeDown();
          QXClient.get().gestures().swipeDown();
          getLibraryPageActions().tapOnShareBtn();
          getLibraryPageActions().tapOnShareBtnFrmSharePop();
          getLibraryPageActions().tapOnShareToWhatsApp();
          // Validating the scenario that whether it is navigating to whatsapp page or not
          getLibraryPageActions().verifyWhatsAppHomePage();
      }

    @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify user is able to change the app language")
    public void verifyUserIsAbleToChangeTheAppLang() throws Exception {
	 QXClient.get().driver();
	 getDikshaMainPageActions().performUserOnBoarding();
	    	 
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String KannadaText =QXClient.get().excelUtils().getCellValue("Excel1","TestData",6,2); 
        getHomePageActions().tapOnMenuBar();
        getHomePageActions().tapOnLanguage();
        getHomePageActions().tapOnKannadaLanguage();

        getHomePageActions().tapOnContinueBtnKannada();
        getHomePageActions().verifyKanndaTextChanged(KannadaText);
    }
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "switchToDarkMode ")
	    public void switchToDarkMode() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		
      	getHomePageActions().verifyDarkMode();

	
	  }

    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "switchingToManageLearnFromDifferentRole ")
    public void switchingToManageLearnFromDifferentRole() throws Exception {
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
		  
		
			 
			 getHomePageActions().tapOnProfileTab();

	 getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
	 getHomePageActions().verifySectionsInHomePage();
	 
	 getHomePageActions().tapOnProfileTab();
	 getProfileEditPageActions().changeStudentRole();
	 getHomePageActions().tapOnProfileTab();
	 getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
	 getHomePageActions().verifySectionsInHomePage();

	 getHomePageActions().tapOnProfileTab();
	 getProfileEditPageActions().changeParentRole();
	 getHomePageActions().tapOnProfileTab();
	 getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
	 getHomePageActions().verifySectionsInHomePage();
	 
	 getHomePageActions().tapOnProfileTab();
	 getProfileEditPageActions().changeTeacherRole();
	 
	
    }

    @Test()
    public void verifyCloseIconInDiscussionForum() throws Exception {
    	  
    		  QXClient.get().driver();
    		  DikshaMainPageActions d=new DikshaMainPageActions();
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
    	
	  QXClient.get().gestures().closeApp();  
          d.LaunchAppHomeScreen();
    	  getHomePageActions().tapOnDownloadTab();

    	  getHomePageActions().tapOnMenuBar();
    	  getHomePageActions().createGrupAndActivity();
    	  getHomePageActions().EnableDiscussion();
    	  getHomePageActions().startQuestionFill();
    	  getHomePageActions().verifyCloseBtnDF();
    	  getHomePageActions().deleteGroup();

    }  

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
    		  true, description = "verifyHomePageForNewDikshaExpreiecne ")
    		  public void verifyHomePageForNewDikshaExpreiecne()
    		  throws Exception { 
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
    				
    		  getHomePageActions().veriyHomePageForDikshaNewExpreience();
    		  
    		  
    		  }
    		 
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
    		  true, description = "verifySearchPageForDikshaNewExpreiecne ")
    		  public void verifySearchPageForDikshaNewExpreiecne()
    		  throws Exception { 
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
    				
    		  getHomePageActions().verifySearchPageForDikshaNewExpreiecne();
    		  
    		  
    		  }
    
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "verifySyncNow ")
	    public void verifySyncNowCourseProgress() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		
      	getHomePageActions().verifyDarkMode();

	
	  }
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "createNewProject ")
	    public void createNewProject() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		
      	getHomePageActions().verifyDarkMode();

	
	  }
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "EditCreatedProject ")
	    public void EditCreatedProject() throws Exception {
		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		
      	getHomePageActions().verifyDarkMode();

	
	  }
    
    
}
