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

public class CourseConsumptionCertificateConsume {

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
	public void verifymergeaccountforsso() throws Exception {

		QXClient.get().driver();
            //getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));
		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		String externalID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 92, 2);
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().verifySSOUserAbleToLoginUsingStateSystemUsingUsernameExternalID(externalID);
		QXClient.get().gestures().closeappandrelaunchapp();

		
		String custodianUser = QXClient.get().excelUtils().getCellValue("Excel1", "Login", 14, 5);
		String custodianPWD = QXClient.get().excelUtils().getCellValue("Excel1", "Login", 15, 5);

		QXClient.get().gestures().closeappandrelaunchapp();

		getHomePageActions().validateCustodianUserMergedSuccessfully(custodianUser, custodianPWD);

	}
	
	
	@Test()
	public void newcollectioncertificatedownload() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));
		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 51, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 52, 2);
		String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "CourseConsumption", 69, 2);
		//String course_id = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 145, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeappandrelaunchapp();
		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(course_id);
		// QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
		getTrainingPageActions().newcollectionconsumeongoing();
	}
}
