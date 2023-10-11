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

public class LoginP1SyncScenarioFirst {

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
		    public void validateCourseInMyCourseSectionAndInProfilePostMergeofCustodianUser() throws Exception {

		        QXClient.get().driver();
		        getDikshaMainPageActions().performUserOnBoarding();
		        getHomePageActions().tapOnProfileTab();


		        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		                properties.getProperty("excelpath"));

		        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		        String SatetUsername =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
		        String StatePassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
		        String custodianUser =QXClient.get().excelUtils().getCellValue("Excel1","Login",8,5);
		        String custodianPWD =QXClient.get().excelUtils().getCellValue("Excel1", "Login",9,5);


		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();

		        getLoginPageActions().loginToTheUser(SatetUsername,StatePassword);

		        QXClient.get().gestures().closeappandrelaunchapp();
		        QXClient.get().gestures().BlindWait(4000);
		        getHomePageActions().tapOnDownloadTab();


		        getHomePageActions().validateCustodianUserMergedSuccessfully(custodianUser,custodianPWD);


		    }



			 @Test (dependsOnMethods = { "validateCourseInMyCourseSectionAndInProfilePostMergeofCustodianUser" })
		    public void validateCourseScenarioAfterSync() throws Exception {

		        QXClient.get().driver();
		        getDikshaMainPageActions().performUserOnBoarding();
		        getHomePageActions().tapOnProfileTab();


		        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		                properties.getProperty("excelpath"));

		        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		        String SatetUsername =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
		        String StatePassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
		  
		        QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();

		        getLoginPageActions().loginToTheUser(SatetUsername,StatePassword);

		        QXClient.get().gestures().closeappandrelaunchapp();
		        QXClient.get().gestures().BlindWait(4000);
		        getHomePageActions().tapOnDownloadTab();
		       
		        
		       getHomePageActions().tapOnProfileTab();

		        getProfileEditPageActions().validateCoursesInProfileTab();
		        QXClient.get().gestures().closeappandrelaunchapp();
		        QXClient.get().gestures().BlindWait(4000);
		        getHomePageActions().tapOnTrainingTab();

		        getProfileEditPageActions().validateCoursesInMyCourseTab();


		    }
   
}
