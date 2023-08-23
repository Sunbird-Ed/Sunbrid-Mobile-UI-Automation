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

public class OfflineScenarios {

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
	    public void verifyUserAbleToMoveContentsToSDCardFromPhoneAndViceVersa() throws Exception {

	        QXClient.get().driver();

	        getDikshaMainPageActions().performUserOnBoarding();

	        getHomePageActions().tapOnDownloadTab();

	        getDownloadPageActions().verifyUserAbleToMoveContentsFromPhoneToSDCard();

	        getDownloadPageActions().verifyUserAbleToMoveContentsFromSDcardToPhone();

	    }
	
	  @Test()
	    public void verifyLastViewedButtonIsClickableInDownloadPage() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        DikshaMainPageActions d = new DikshaMainPageActions();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
	        String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(BookName);

	        getTrainingPageActions().tapOnSearchedBook();

	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(coursefetch);

	        getTrainingPageActions().tapOnSearchedCourse1();

	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnDownloadTab();

	        getDownloadPageActions().verifyContentsArrangedProperlyBasedOnLastViewedAndContentSize();
	    }

	
	 @Test()
	    public void verifyContentSizeAndDeleteContentFromDownloadSection() throws Exception {
	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();
	        //getHomePageActions().tapOnProfileTab();

	        getHomePageActions().tapOnDownloadTab();

	        getHomePageActions().verifyDownloadSection();

	        getHomePageActions().tapOnTrainingTab();
	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar("resource");

	        getHomePageActions().filterContentOnContentSize();

	    }

	@Test()
	public void verifyDownloadSection() throws Exception {
	   QXClient.get().driver();
	   getDikshaMainPageActions().performUserOnBoarding();
	   getHomePageActions().tapOnProfileTab();

	   getHomePageActions().tapOnDownloadTab();

	   getHomePageActions().verifyDownloadSection();


	}

	@Test()
	public void validateDownloadContentfromCoursesorLibraryMsgInDownloadSection() throws Exception {
		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().validateDownloadSectionForGuestUser();

	}

	
	 @Test()
	    public void validateDownloadTabDetails() throws Exception {

	        QXClient.get().driver();
	        getDikshaMainPageActions().performUserOnBoarding();

	        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	                properties.getProperty("excelpath"));

	        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

	        String book=QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
	        String course=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


	        getHomePageActions().tapOnTrainingTab();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(book);
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(book);
	        getTrainingPageActions().tapOnSearchedBook();
	        QXClient.get().gestures().clkBackButton();
	        QXClient.get().gestures().clkBackButton();

	        getHomePageActions().tapOnSearchIcon();
	        getHomePageActions().enterTextInSearchBar(course);
	        //QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(course);
	        getTrainingPageActions().tapOnSearchedCourse1();

	        DikshaMainPageActions d=new DikshaMainPageActions();
	        QXClient.get().gestures().closeApp();
	        d.LaunchAppHomeScreen();

	        getHomePageActions().tapOnDownloadTab();

	        getDownloadPageActions().verifyDownloadPage();

	        getDownloadPageActions().deleteDownloadedContent();

	    }

	
	
}
