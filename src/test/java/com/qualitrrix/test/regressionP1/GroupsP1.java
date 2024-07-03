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

public class GroupsP1 {

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
	
	
	@Test()
    public void validateMemberAddedNotificationMessageInMember() throws Exception {

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
        String MemberIDValue = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 47, 2);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeappandrelaunchapp();

        getHomePageActions().tapOnDownloadTab();

        getHomePageActions().tapOnMenuBar();
        getHomePageActions().createGrupAndActivity();
        getHomePageActions().addMemberToGroup(MemberIDValue);
		QXClient.get().gestures().closeappandrelaunchapp();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userLogout();

        QXClient.get().gestures().closeApp();
        d.LaunchAppHomeScreen();

        getHomePageActions().tapOnProfileTab();

        String Username1 = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
        String Password1 = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username1, Password1);

        getHomePageActions().validateMemberAddedNotificationMsg();

        getHomePageActions().clearNotifications();

    }
	
	@Test()
    public void validateGroupDeletedNotificationMessageInMember() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",134,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",135,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
		QXClient.get().gestures().closeappandrelaunchapp();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUpdatedCardsForActivities();

        getHomePageActions().deleteGroup();

        getHomePageActions().clkBackbuttontoExitFromGroups();
    
        
		QXClient.get().gestures().closeappandrelaunchapp();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userLogout();

		QXClient.get().gestures().closeappandrelaunchapp();


        getHomePageActions().tapOnProfileTab();

        String Username1 =QXClient.get().excelUtils().getCellValue("Excel1","TestData",67,2);
        String Password1 =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",68,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username1,Password1);

        getHomePageActions().validateGroupDeletedNotificationMessage();

        getHomePageActions().clearNotifications();

    }

	@Test()
	public void verifyAdminAbleToViewAllMetricsOfDashboard() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().openActivityDashBoard();

		getHomePageActions().verifyDownloadAsCSVInActivityDashboard();

		getHomePageActions().verifyAdminAbleToViewGroupMemberInActivityScreen();

		getHomePageActions().verifyMembersProgressInPercentage();

		getHomePageActions().verifyAllMetricsOfDashboardForAdmin();

	}
	
	@Test()
	public void VerifyEnableDiscussionGroup() throws Exception {
		  
			  QXClient.get().driver();
			  DikshaMainPageActions d=new DikshaMainPageActions();
			  getDikshaMainPageActions().performUserOnBoarding();
			  getHomePageActions().tapOnProfileTab();
			  
			  
			  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",128,2); 
			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",129,2);	  
			  QXClient.get().gestures().swipeUp();
			  QXClient.get().gestures().swipeUp();

		  getLoginPageActions().loginToTheUser(Username,Password);
		
			QXClient.get().gestures().closeappandrelaunchapp();

		  getHomePageActions().tapOnDownloadTab();

		  getHomePageActions().tapOnMenuBar();
		  getHomePageActions().createGrupAndActivity();
		  getHomePageActions().EnableDiscussion();
		  getHomePageActions().startQuestionFill();
		  getHomePageActions().DisableDiscussion();
		  getHomePageActions().deleteGroup();

		  
		  
		  
	}
	  @Test()
	    public void verifyMin8CharactersInDiscussionTopicEditFields() throws Exception {

	        QXClient.get().driver();
	        DikshaMainPageActions d=new DikshaMainPageActions();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",128,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",129,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);

			QXClient.get().gestures().closeappandrelaunchapp();

	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnMenuBar();
	        getHomePageActions().createGrupAndActivity();
	        getHomePageActions().EnableDiscussion();

	        getHomePageActions().verifyMinimumCharactersInDiscussionTopicQuestionAndPleaseEloberateYourQuestionSection();

	    }
		 
	  @Test()
	    public void verifyStartDiscussionScreen() throws Exception {

	        QXClient.get().driver();
	        DikshaMainPageActions d = new DikshaMainPageActions();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
	        System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig = properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",128, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",129, 2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username, Password);

			QXClient.get().gestures().closeappandrelaunchapp();

	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnMenuBar();
	        getHomePageActions().createGrupAndActivity();
	        getHomePageActions().verifyDiscussionForum();
	    }
	
	@Test()
	public void CreateGroup() throws Exception {
		  
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
			QXClient.get().gestures().closeappandrelaunchapp();

			  getHomePageActions().tapOnDownloadTab();

		  getHomePageActions().tapOnMenuBar();
		  getHomePageActions().createGrupAndActivity();
		  
	}
	 @Test()
	    public void verifyDiscussionForumWorkflowsWorksFine() throws Exception {

	        QXClient.get().driver();
	        DikshaMainPageActions d=new DikshaMainPageActions();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",128,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",129,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("AutomationCourseForDF");

	        getTrainingPageActions().tapOnSearchedCourseForDF();

	        getHomePageActions().validateForumIconInCourse();

	        getHomePageActions().validatePostReplyAndSavePost();

	    }

	  @Test()
	    public void verifyGeneralDiscussionsTopics() throws Exception {

	        QXClient.get().driver();
	        DikshaMainPageActions d=new DikshaMainPageActions();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",128,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",129,2);
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);
			QXClient.get().gestures().closeappandrelaunchapp();
	        getHomePageActions().tapOnMenuBar();
	        getHomePageActions().verifyGeneralDiscussionTopics();

	        getHomePageActions().verifyDiscussionList();

	    }
	
	@Test()
	public void DeleteGroup() throws Exception {
		  
			  QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoarding();
			  getHomePageActions().tapOnProfileTab();
			  
			  
			  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",128,2); 
			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",129,2);	  
			  String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",38,2);	  

			  QXClient.get().gestures().swipeUp();
			  QXClient.get().gestures().swipeUp();

		  getLoginPageActions().loginToTheUser(Username,Password);
			QXClient.get().gestures().closeappandrelaunchapp();

			  getHomePageActions().tapOnDownloadTab();

		  getHomePageActions().tapOnMenuBar();
		  getHomePageActions().createGrupAndActivity();
		  getHomePageActions().deleteGroup();
	}
	 @Test()
	    public void onlyParentCourseProgressIsDisplayedWhenDownloadedAsCSVofANestedCourse() throws Exception {

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

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 105, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 106, 2);

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().verifyOnlyParentCourseProgressIsDownloadedInDownloadedCSV();

	    }
	@Test()
	public void validateMemberNameAndProgressInDownloadedCSVFileAsExcelFormat() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyActivityDashBoard();

		getHomePageActions().verifyMemberNameAndProgressInExcelPostClickingDownloadasCSV();
		QXClient.get().gestures().clkBackButton();

	}

	@Test()
	public void validateLastUpdatedMessageInActivityDashboard() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyActivityDashBoard();

		getHomePageActions().verifyLastUpdatedMsgInActivityDashboard();

	}
	@Test()
    public void validateMemberRemovedNotificationMessageInMember() throws Exception {

        QXClient.get().driver();
        DikshaMainPageActions d=new DikshaMainPageActions();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();


        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
                properties.getProperty("excelpath"));

        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",69,2);
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",70,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username,Password);
		QXClient.get().gestures().closeappandrelaunchapp();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().verifyUpdatedCardsForActivities();

        getHomePageActions().removeMemberFromTheGroup();

        getHomePageActions().deleteGroup();

        getHomePageActions().clkBackbuttontoExitFromGroups();

        getHomePageActions().verifyNoNotificationReceivedByGroupCreatorPostMemberRemovedFromGroup();
		QXClient.get().gestures().closeappandrelaunchapp();

        getHomePageActions().tapOnMenuBar();

        getHomePageActions().userLogout();
		QXClient.get().gestures().closeappandrelaunchapp();


        getHomePageActions().tapOnProfileTab();

        String Username1 =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
        String Password1 =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        getLoginPageActions().loginToTheUser(Username1,Password1);

        getHomePageActions().validateMemberRemovedNotificationMsg();

        getHomePageActions().validateAllNotificationsClickableAndDeleteOneByOneNotifications();

        getHomePageActions().clearNotifications();

    }

	
	 @Test()
	    public void verifyUserAbleToConsumeCertificateCourseFromGroupActivity() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        getHomePageActions().tapOnProfileTab();


	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
	        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	        String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",47,2);

	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

	        getLoginPageActions().loginToTheUser(Username,Password);
			QXClient.get().gestures().closeappandrelaunchapp();

	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().tapOnMenuBar();

	        getHomePageActions().createGrupAndActivity();

	        getHomePageActions().verifyActivityAndMemberAddedToTheGroup(MemberIDValue);

	        getHomePageActions().enterTextInSearchBar("AutoSmallCourseWithCertificate");

	        getHomePageActions().verifyAdminAbleToAddCertificateCourseToGroup();
			QXClient.get().gestures().closeappandrelaunchapp();

	        getHomePageActions().verifyUserAbleToConsumeCertificateCourseFromGroupActivity();

	    }

	 @Test()
	    public void verifyActivityDashboardAndCourseDashboardByUser() throws Exception {

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

	        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
	        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

	        getLoginPageActions().loginToTheUser(Username, Password);

	        getHomePageActions().verifyActivityDashBoard();

	    }
	
	
	@Test()
    public void verifyCourseDashBoardAndActivityDashboardInGroups() throws Exception {

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

        String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
        String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

        getLoginPageActions().loginToTheUser(Username, Password);

        getHomePageActions().verifyCourseDashBoardInGroups();

        getHomePageActions().verifyActivityDashboardScreen();

    }
	@Test()
	public void VerifyProgressIsNotDisplayForNotTrackableContent() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		QXClient.get().gestures().BlindWait(5000);
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().BlindWait(2000);
		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnAddAnotherUser();

		String FakeName=QXClient.get().gestures().generateRandomName();
		String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
		System.out.println(storeFakeNameEntered);
		getCoursePageActions().tapOnAddUserBtn();

		QXClient.get().gestures().closeappandrelaunchapp();
		getHomePageActions().tapOnMenuBar();

		getCoursePageActions().tapOnMoreOption();
		QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


		getCoursePageActions().tapOnChangeUserWithoutProfile();

		getCoursePageActions().tapOnTermsAndCondition();

		getCoursePageActions().tapOnContinueForSwicthUser();

		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().VerifyUserIsAbleToCreateGroup();
		getHomePageActions().VerifyProgressIsnotDisplayed();
		}
	@Test()
	public void verifyNonAdminUnableToViewTheProgressOfOtherMembers() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 5, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 3, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyMemberswithAdminRightsGroupedTogetherInAlphabatecialOrderFollowedByMembersWhoAreNotAdmin();

		QXClient.get().gestures().closeappandrelaunchapp();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().userLogout();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnProfileTab();

		String Username1 = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 8, 2);
		String Password1 = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 3, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username1, Password1);

		getHomePageActions().verifyRemovingMemberFromAdminPost();

		QXClient.get().gestures().closeappandrelaunchapp();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().userLogout();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnProfileTab();


		String Username2 = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 9, 2);
		String Password2 = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 3, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username2, Password2);

		getHomePageActions().verifyNonAdminUnableToViewTheProgressOfOtherMembers();


	}
	
	@Test()
	public void verifyAllActivitiesOfGroupDashboard() throws Exception {

		QXClient.get().driver();
                DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 3, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

                getHomePageActions().sortingMembersInGroupByCourseProgress();

                getHomePageActions().verifyMembersProgressInPercentage();

		getHomePageActions().verifyUserAbleToMakeAnyMembersAdminInSelectedGroup();

		getHomePageActions().removeMemberNotBeDisplayedInGroupDetails();

                //QXClient.get().gestures().closeappandrelaunchapp();

               // getHomePageActions().tapOnMenuBar();
               // QXClient.get().gestures().swipeUp();

               // getHomePageActions().userLogout();

              //  QXClient.get().gestures().closeApp();
              //  d.LaunchAppHomeScreen();

             //   getHomePageActions().tapOnProfileTab();

             //   String Username1 = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 4, 2);
             //   String Password1 = QXClient.get().excelUtils().getCellValue("Excel1", "Groups", 3, 2);
             //   QXClient.get().gestures().swipeUp();
             //   QXClient.get().gestures().swipeUp();

             //   getLoginPageActions().loginToTheUser(Username1, Password1);

             //   getHomePageActions().leaveGroup();


	}


}
