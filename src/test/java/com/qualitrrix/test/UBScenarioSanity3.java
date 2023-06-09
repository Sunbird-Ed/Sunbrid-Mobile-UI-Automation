

package com.qualitrrix.test;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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

import io.appium.java_client.pagefactory.AppiumFieldDecorator;






public class UBScenarioSanity3 {

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
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "verfiySubmitFormsInIamTeacher") public void
	 * verfiySubmitFormsInIamTeacher() throws Exception { QXClient.get().driver();
	 * getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 *
	 * getCoursePageActions().VerifySubmitDetailsForm(); }
	 */


	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Switch User In Menu") public void
	 * CoursesSectioInProfileSection() throws Exception { QXClient.get().driver();
	 * getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 * getHomePageActions().tapOnProfileTab();
	 * getCoursePageActions().verifyCoursesSectionInProfile();
	 *
	 *
	 * }
	 */

	/*
	 *
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Verify Class And SeeMoreBooksContent in LibrarySection")
	 * public void verifySeeMoreBooksContent() throws Exception {
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 *
	 * getLibraryPageActions().verifyClassAndSeeMoreBooks();
	 *
	 * }
	 */

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "verifyLoginOptionIsPresentForStudent") public void
	 * verifyLoginOptionIsPresentForStudent() throws Exception {
	 * QXClient.get().driver();
	 * getDikshaMainPageActions().performUserOnBoardingWithStudent();
	 * getHomePageActions().tapOnProfileTab();
	 * getHomePageActions().verifyLoginOptionIsPresentForStudent();
	 *
	 * }
	 */
	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Verify UserAble to Download Book ") public void
	 * verifyBookDownload() throws Exception { QXClient.get().driver();
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
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
	 *
	 *
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar(BookName);
	 * getTrainingPageActions().tapOnSearchedBook();
	 *
	 * getLibraryPageActions().tapOnDownloadBtn();
	 * getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
	 * //getTrainingPageActions().verifyFileDownloadThroughNotification();
	 * getTrainingPageActions().waitTillTheDownloadButtonDisappears();
	 * QXClient.get().gestures().clkBackButton();
	 * QXClient.get().gestures().clkBackButton();
	 *
	 *
	 * getHomePageActions().tapOnDownloadTab();
	 * getDownloadPageActions().verifyTheDownloadedBook(); }
	 */

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description =
	 * "Guestlogged in users are able to stream contents online ") public void
	 * giveRatingAfterBookConsumption() throws Exception { QXClient.get().driver();
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
	 * getHomePageActions().enterTextInSearchBar(BookName);
	 * getTrainingPageActions().tapOnSearchedBook();
	 *
	 * getLibraryPageActions().tapOnPlayIcon();
	 * QXClient.get().gestures().clkBackButton();
	 * getLibraryPageActions().tapOnOKbtn();
	 * getLibraryPageActions().tapOnStarIcon();
	 * getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg); }
	 */

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Credits and License info section in book TOC page")
	 * public void creditLicenseInfoSecInBookTOCpage() throws Exception {
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
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
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
	 *
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar(BookName);
	 * getTrainingPageActions().tapOnSearchedBook();
	 *
	 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
	 * getLibraryPageActions().tapOnCreditAndLicense();
	 * QXClient.get().gestures().swipeUp();
	 * getLibraryPageActions().verifyTermsAndCondLink(); }
	 */

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Book sharing") public void ShareTheBook() throws
	 * Exception { QXClient.get().driver();
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
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
	 *
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar(BookName);
	 * getTrainingPageActions().tapOnSearchedBook();
	 *
	 *
	 *
	 * getLibraryPageActions().verifyContentUI();
	 * QXClient.get().gestures().swipeDown(); QXClient.get().gestures().swipeDown();
	 * getLibraryPageActions().tapOnShareBtn();
	 * getLibraryPageActions().tapOnShareBtnFrmSharePop();
	 * getLibraryPageActions().tapOnShareToWhatsApp(); // Validating the scenario
	 * that whether it is navigating to whatsapp page or not
	 * getLibraryPageActions().verifyWhatsAppHomePage(); }
	 */

	/*
	 * @Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"},
	 * alwaysRun = true, description =
	 * "Verify user is able to change the app language") public void
	 * verifyUserIsAbleToChangeTheAppLang() throws Exception {
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String KannadaText
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",6,2);
	 * getHomePageActions().tapOnMenuBar(); getHomePageActions().tapOnLanguage();
	 * getHomePageActions().tapOnKannadaLanguage();
	 *
	 * getHomePageActions().tapOnContinueBtnKannada();
	 * getHomePageActions().verifyKanndaTextChanged(KannadaText); }
	 */



	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Verify user is able to add the recover id sucessfully ")
	 * public void updateTheProfileDetails() throws Exception {
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 * String recoveryID =QXClient.get().excelUtils().getCellValue("Excel1",
	 * "TestData",18,2);
	 *
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 * getHomePageActions().tapOnProfileTab(); //
	 * getProfileEditPageActions().editRecoveryId(recoveryID); }
	 */

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Guest user is able UnEnroll from Course.") public void
	 * courseUsingTextBook() throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String CourseUsingTextBook=QXClient.get().excelUtils().getCellValue("Excel1",
	 * "TestData",29,2);
	 *
	 *
	 * getHomePageActions().tapOnTrainingTab();
	 *
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar(CourseUsingTextBook);
	 * getTrainingPageActions().tapOnSearchedCourse();
	 *
	 *
	 * }
	 */
	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Guest user is able UnEnroll from Course.") public void
	 * verifyLeaveTraining() throws Exception {
	 *
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnTrainingTab();
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 * String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1",
	 * "TestData",30,2);
	 *
	 *
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar(LeaveCourse);
	 * getTrainingPageActions().tapOnSearchedCourse();
	 * getTrainingPageActions().tapOnJoinTraining();
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 * getTrainingPageActions().leaveCourse();
	 *
	 *
	 * }
	 */


	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description =
	 * "Course should display under trainings attended section in profile section, if user has consumed the course completely."
	 * ) public void ongoingCourseDisplayingInTrainingAttendedSecInProfileScrn()
	 * throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 *
	 *
	 * getHomePageActions().tapOnProfileTab(); Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 *
	 *
	 * Thread.sleep(2000); QXClient.get().gestures().swipeUp();
	 *
	 * getCoursePageActions().tapOnOngoingCourse(); Thread.sleep(2000);
	 *
	 *
	 * // QXClient.get().gestures().scrollAndClick("Ongoing");
	 *
	 *
	 *
	 * }
	 *
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description =
	 * "Course should display under trainings attended section in profile section, if user has consumed the course completely."
	 * ) public void completedCourseDisplayingInTrainingAttendedSecInProfileScrn()
	 * throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 *
	 *
	 * getHomePageActions().tapOnProfileTab(); Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 *
	 *
	 * Thread.sleep(2000); // QXClient.get().gestures().scrollAndClick("Completed");
	 * QXClient.get().gestures().swipeUp();
	 * getCoursePageActions().tapOnCompletedCourse(); Thread.sleep(2000);
	 *
	 * }
	 *
	 */


	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description =
	 * "Course should display under trainings attended section in profile section, if user has consumed the course completely."
	 * ) public void completedCourseDisplayingInTrainingAttendedSecInProfileScrn()
	 * throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 *
	 *
	 * getHomePageActions().tapOnProfileTab(); Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 *
	 *
	 * Thread.sleep(2000); getHomePageActions().tapOnDownloadTab();
	 * Thread.sleep(4000);
	 *
	 * getHomePageActions().tapOnProfileTab(); //
	 * QXClient.get().gestures().scrollAndClick("Completed");
	 * //QXClient.get().gestures().swipeUp();
	 * getCoursePageActions().tapOnCompletedCourse(); Thread.sleep(2000);
	 *
	 * }
	 */

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "Login with Gamil verification") public void
	 * loginWithGmail() throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 *
	 * getHomePageActions().tapOnProfileTab(); QXClient.get().gestures().swipeUp();
	 * QXClient.get().gestures().swipeUp();
	 *
	 * getHomePageActions().signInWithGoogle();
	 * getHomePageActions().enterGmailDetailsAndVerfiyUsrnameInProfileSec();
	 *
	 * }
	 */

	/*
	 * @Author(name="Raju")
	 *
	 * @Test() public void createGroupAndActivity() throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 * getHomePageActions().tapOnMenuBar();
	 * getHomePageActions().createGrupAndActivity();
	 *
	 * }
	 */


	/*
	 * @Author(name="Raju")
	 *
	 * @Test() public void LibraryFilterSearch() throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnSearchIcon();
	 * getHomePageActions().enterTextInSearchBar("resource");
	 * getLibraryPageActions().librarySearchFilter();
	 *
	 * }
	 */

	/*
	 * @Author(name="Raju")
	 *
	 * @Test() public void shareDikshaIdProfileSec() throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * getHomePageActions().shareDikshaIDProfileSec();
	 * getLibraryPageActions().tapOnShareToWhatsApp();
	 * getLibraryPageActions().verifyWhatsAppHomePage();
	 *
	 *
	 *
	 * }
	 */


//  @Author(name="Raju")
//	  
//	  @Test() public void VerifyAddUserEdit() throws Exception {
//	  
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		  
//		  
//		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		  properties.getProperty("excelpath"));
//		  
//		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		  
//		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//		  QXClient.get().gestures().swipeUp();
//	        QXClient.get().gestures().swipeUp();
//	  getLoginPageActions().loginToTheUser(Username,Password);
//	
//	  getHomePageActions().tapOnMenuBar();
//	 	  	  getCoursePageActions().tapOnAddAnotherUser();
//	  
//	  String FakeName=QXClient.get().gestures().generateRandomName();
//	  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
//	  System.out.println(storeFakeNameEntered);
//	  getCoursePageActions().tapOnAddUserBtn();
//	  getHomePageActions().tapOnMenuBar();
//	  
//	  getCoursePageActions().tapOnMoreOption();
//	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
//	  
//	  
//	  getCoursePageActions().tapOnChangeUser(); 
//	  
//	  getCoursePageActions().tapOnTermsAndCondition();
//	  
//	  getCoursePageActions().tapOnContinueForSwicthUser();
//	  
//	  getHomePageActions().tapOnProfileTab();
//	  getHomePageActions().tapOnProfileTab();
//
//	  
//	  getCoursePageActions().verifyDistricAndState();
//	  
//	  getCoursePageActions().verifyBMCValuesAfterAddingUser();
//		getCoursePageActions().updateStateAndDistrictValues();
//
//		getCoursePageActions().updateProfileDetails();
//
//	  
//	  }
//	

//	   @Author(name="Raju")
//		  
//		  @Test() public void VerifyAddUserEdit3() throws Exception {
//	    	
//			  QXClient.get().driver();
//			  getDikshaMainPageActions().performUserOnBoarding();
//			  getHomePageActions().tapOnProfileTab();
//			  
//			  
//			  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//			  properties.getProperty("excelpath"));
//			  
//			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			  
//			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//			  QXClient.get().gestures().swipeUp();
//		        QXClient.get().gestures().swipeUp();
//		  getLoginPageActions().loginToTheUser(Username,Password);
//		
//		  getHomePageActions().tapOnMenuBar();
//		 	  	  getCoursePageActions().tapOnAddAnotherUser();
//		  
//		  String FakeName=QXClient.get().gestures().generateRandomName();
//		  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
//		  System.out.println(storeFakeNameEntered);
//		  getCoursePageActions().tapOnAddUserBtn();
//		  getHomePageActions().tapOnMenuBar();
//		  
//		  getCoursePageActions().tapOnMoreOption();
//		  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
//		  
//		  
//		  getCoursePageActions().tapOnChangeUser(); 
//		  
//		  getCoursePageActions().tapOnTermsAndCondition();
//		  
//		  getCoursePageActions().tapOnContinueForSwicthUser();
//		  
//		  getHomePageActions().tapOnProfileTab();
//		  getHomePageActions().tapOnProfileTab();
//
//		  
//		  getCoursePageActions().verifyDistricAndState();
//		  
//		  getCoursePageActions().verifyBMCValuesAfterAddingUser();
//			getCoursePageActions().updateStateAndDistrictValues();
//
//			getCoursePageActions().updateProfileDetails();
//
//		  
//		  }

//
//	 @Author(name="Raju")
//	  
//	  @Test() public void VerifyAddUserAndEdit() throws Exception {
//	  
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		  
//		  
//		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		  properties.getProperty("excelpath"));
//		  
//		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		  
//		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//		  QXClient.get().gestures().swipeUp();
//	        QXClient.get().gestures().swipeUp();
//	  getLoginPageActions().loginToTheUser(Username,Password);
//	
//	  getHomePageActions().tapOnMenuBar();
//	 	  	  getCoursePageActions().tapOnAddAnotherUser();
//	  
//	  String FakeName=QXClient.get().gestures().generateRandomName();
//	  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
//	  System.out.println(storeFakeNameEntered);
//	  getCoursePageActions().tapOnAddUserBtn();
//	  getHomePageActions().tapOnMenuBar();
//	  
//	  getCoursePageActions().tapOnMoreOption();
//	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
//	  
//	  getCoursePageActions().tapOnChangeUser(); 
//	  
//	  getCoursePageActions().tapOnTermsAndCondition();
//	  
//	  getCoursePageActions().tapOnContinueForSwicthUser();
//	  
//	  getHomePageActions().tapOnProfileTab();
//	  getHomePageActions().tapOnProfileTab();
//
//	  
//	  getCoursePageActions().verifyDistricAndState();
//	  
//	  getCoursePageActions().verifyBMCValuesAfterAddingUser();
//		getCoursePageActions().updateProfileDetails();
//
//	  
//	  }
//	
//   @Author(name="Raju")
//	  
//	  @Test() public void VerifyAddUserEdit36() throws Exception {
//   	
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		  
//		  
//		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		  properties.getProperty("excelpath"));
//		  
//		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		  
//		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//		  QXClient.get().gestures().swipeUp();
//	        QXClient.get().gestures().swipeUp();
//	  getLoginPageActions().loginToTheUser(Username,Password);
//	
//	  getHomePageActions().tapOnMenuBar();
//	 	  	  getCoursePageActions().tapOnAddAnotherUser();
//	  
//	  String FakeName=QXClient.get().gestures().generateRandomName();
//	  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
//	  System.out.println(storeFakeNameEntered);
//	  getCoursePageActions().tapOnAddUserBtn();
//	  getHomePageActions().tapOnMenuBar();
//	  
//	  getCoursePageActions().tapOnMoreOption();
//	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
//	  
//	  
//	  getCoursePageActions().tapOnChangeUser(); 
//	  
//	  getCoursePageActions().tapOnTermsAndCondition();
//	  
//	  getCoursePageActions().tapOnContinueForSwicthUser();
//	  
//	  getHomePageActions().tapOnProfileTab();
//	  getHomePageActions().tapOnProfileTab();
//
//	  
//	  getCoursePageActions().verifyDistricAndState();
//	  
//	  getCoursePageActions().verifyBMCValuesAfterAddingUser();
//		getCoursePageActions().updateStateAndDistrictValues();
//
//		getCoursePageActions().updateProfileDetails();
//
//	  
//	  }
//	


//	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	          description = "Guest user is able UnEnroll from Course.")
//	  public void verifyLeaveTraining() throws Exception {
//
//		  
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();		  
//		  	 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//					  properties.getProperty("excelpath"));
//					  
//					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//					  
//					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
//					  String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
//					  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);	  
//
//					  getLoginPageActions().loginToTheUser(Username,Password);
//					  	 getHomePageActions().tapOnTrainingTab();
//
//		       getHomePageActions().tapOnSearchIcon();
//		       getHomePageActions().enterTextInSearchBar(coursefetch);
//		       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
//
//		     //  getTrainingPageActions().tapOnSearchedCourse();
//		         getTrainingPageActions().tapOnJoinTraining2();
//		   
//         getTrainingPageActions().leaveCourse();
//	  }
//	  


//	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	            description = "Verify Class And SeeMoreBooksContent in LibrarySection")
//	    public void verifyClassAndSeeMoreBooks() throws Exception {
//	    	 QXClient.get().driver();
//			  getDikshaMainPageActions().performUserOnBoarding();
//			  
//	    	        getLibraryPageActions().verifyClassAndSeeMoreBooks();
//
//	    }
//	       
//	  
//	
//    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//            description = "Verify UserAble to Download Book ")
//    public void verifyBookDownload() throws Exception {
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
//			  
//	 
//      	getHomePageActions().tapOnSearchIcon();
//  	      getHomePageActions().enterTextInSearchBar(BookName);
//	       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
//
//  	   //   getTrainingPageActions().tapOnSearchedBook();
//
//        getLibraryPageActions().tapOnDownloadBtn();
//        getTrainingPageActions().tapOnDownloadBtnInDownloadPopUp();
//        //getTrainingPageActions().verifyFileDownloadThroughNotification();
//       getTrainingPageActions().waitTillTheDownloadButtonDisappears();
//       QXClient.get().gestures().clkBackButton();
//       QXClient.get().gestures().clkBackButton();
//
//      
//       getHomePageActions().tapOnDownloadTab();
//        getDownloadPageActions().verifyTheDownloadedBook();
//    }


//	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	            description = "verifyLoginOptionIsPresentForStudent")
//	    public void verifyLeaderRoleMenu() throws Exception {
//	    	 QXClient.get().driver();
//			  getDikshaMainPageActions().performUserOnBoardingWithLeader();
//			  
//			  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//					  properties.getProperty("excelpath"));
//					  
//					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//					  
//					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",34,2); 
//					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",35,2);	  
//					  
//			  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//
//			  getHomePageActions().verifySectionsInHomePage();
//
//	    }
//	


//    @Author(name="Raju")
//	  
//	  @Test()
//public void EnableAndDisableDiscussionInGroup() throws Exception {
//	  
//		  QXClient.get().driver();
//		  DikshaMainPageActions d=new DikshaMainPageActions();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		  
//		  
//		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		  properties.getProperty("excelpath"));
//		  
//		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		  
//		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//		  QXClient.get().gestures().swipeUp();
//		  QXClient.get().gestures().swipeUp();
//
//	  getLoginPageActions().loginToTheUser(Username,Password);
//	
//	  QXClient.get().gestures().closeApp();  
//      d.LaunchAppHomeScreen();
//	  getHomePageActions().tapOnDownloadTab();
//
//	  getHomePageActions().tapOnMenuBar();
//	  getHomePageActions().createGrupAndActivity();
//	  getHomePageActions().EnableDiscussion();
//	  getHomePageActions().startQuestionFill();
//	  getHomePageActions().DisableDiscussion();
//	  getHomePageActions().deleteGroup();
//
//	  
//	  
//	  
//}
//	 

	/*
	 * @Author(name="Raju")
	 *
	 * @Test() public void VerifyAddUser() throws Exception {
	 *
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath")); DikshaMainPageActions d=new
	 * DikshaMainPageActions(); String
	 * fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 *
	 * QXClient.get().gestures().closeApp(); d.LaunchAppHomeScreen();
	 * getHomePageActions().tapOnDownloadTab();
	 *
	 *
	 * getHomePageActions().tapOnMenuBar();
	 * getCoursePageActions().tapOnAddAnotherUser();
	 *
	 * String FakeName=QXClient.get().gestures().generateRandomName(); String
	 * storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	 * System.out.println(storeFakeNameEntered);
	 * getCoursePageActions().tapOnAddUserBtn();
	 * getHomePageActions().tapOnMenuBar();
	 *
	 * getCoursePageActions().tapOnMoreOption();
	 * QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
	 *
	 *
	 * getCoursePageActions().tapOnChangeUser();
	 *
	 * getCoursePageActions().tapOnTermsAndCondition();
	 *
	 * getCoursePageActions().tapOnContinueForSwicthUser();
	 *
	 *
	 * QXClient.get().gestures().closeApp(); d.LaunchAppHomeScreen();
	 * getHomePageActions().tapOnDownloadTab();
	 *
	 * getHomePageActions().tapOnProfileTab();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * getCoursePageActions().verifyDistricAndState();
	 *
	 * getCoursePageActions().verifyBMCValuesAfterAddingUser();
	 * //getCoursePageActions().updateStateAndDistrictValues();
	 *
	 * //getCoursePageActions().updateProfileDetails();
	 *
	 *
	 * }
	 */


//	@Author(name="Raju")
//	  
//	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
//	public void CourseProgressUpdate() throws Exception {
//	  
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		  
//		  
//		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		  properties.getProperty("excelpath"));
//		  
//		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		  
//		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	
//		  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);	  
//
//		  QXClient.get().gestures().swipeUp();
//	        QXClient.get().gestures().swipeUp();
//	  getLoginPageActions().loginToTheUser(Username,Password);
//	  
//	  
//	  DikshaMainPageActions d=new DikshaMainPageActions();
//	  QXClient.get().gestures().closeApp();  
//	    d.LaunchAppHomeScreen();
//		  getHomePageActions().tapOnDownloadTab();
//
//	  getHomePageActions().tapOnMenuBar();
//	 	  	  getCoursePageActions().tapOnAddAnotherUser();
//	  
//	  String FakeName=QXClient.get().gestures().generateRandomName();
//	  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
//	  System.out.println(storeFakeNameEntered);
//	  getCoursePageActions().tapOnAddUserBtn();
//	  
//	  
//	  getHomePageActions().tapOnMenuBar();
//	  
//	  getCoursePageActions().tapOnMoreOption();
//	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
//	  
//	  
//	  getCoursePageActions().tapOnChangeUser(); 
//	  
//	  getCoursePageActions().tapOnTermsAndCondition();
//	  
//	  getCoursePageActions().tapOnContinueForSwicthUser();
//	  
//	  
//	  DikshaMainPageActions d2=new DikshaMainPageActions();
//	  QXClient.get().gestures().closeApp();  
//	    d2.LaunchAppHomeScreen();
//		  getHomePageActions().tapOnDownloadTab();
//	  
//	  
//	  
//	  getHomePageActions().tapOnProfileTab();
//	//  getHomePageActions().tapOnProfileTab();
//
//	  getHomePageActions().tapOnTrainingTab();
//
//
//
//	  
//		  
//		       getHomePageActions().tapOnSearchIcon();
//		       getHomePageActions().enterTextInSearchBar(coursefetch);
//
//		       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
//		 	  getTrainingPageActions().consumCourseContent();
//		 	
//		  
//
//	}

//	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//            description = "User is able to Fill Slt Language And UsernBoarding Values")
//    public void userAbleToSltLangAndUserOnBoardingDetails() throws Exception {
//	  
//	  QXClient.get().driver();
//	  getDikshaMainPageActions().performUserOnBoarding();
//	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//			  properties.getProperty("excelpath"));
//			  
//			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			  
//			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
//			  
//        getHomePageActions().tapOnSearchIcon();
//        getHomePageActions().enterTextInSearchBar(BookName);
//	       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
//
//      //  getTrainingPageActions().tapOnSearchedBook();
//    }
//
//


//	  
//	  @Test()
//public void addMemberAndRemoveMember() throws Exception {
//	  
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		  
//		  
//		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		  properties.getProperty("excelpath"));
//		  
//		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		  
//		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//		  String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",38,2);	  
//
//		  QXClient.get().gestures().swipeUp();
//		  QXClient.get().gestures().swipeUp();
//
//	  getLoginPageActions().loginToTheUser(Username,Password);
//	  DikshaMainPageActions d=new DikshaMainPageActions();
//	  QXClient.get().gestures().closeApp();  
//	    d.LaunchAppHomeScreen();
//		  getHomePageActions().tapOnDownloadTab();
//
//	  getHomePageActions().tapOnMenuBar();
//	  getHomePageActions().createGrupAndActivity();
//	  getHomePageActions().addMemberAndRemovemember(MemberIDValue);
//	  getHomePageActions().deleteGroup();
//}


//	  @Author(name="Raju")
//	    
//	    @Test()
//	  public void verifyPublisherFilter() throws Exception {
//	    
//	  	  QXClient.get().driver();
//	  		 getDikshaMainPageActions().performUserOnBoarding();
//	  	      	getHomePageActions().tapOnSearchIcon();
//	  	  	      getHomePageActions().enterTextInSearchBar("resource");
//	  	          getLibraryPageActions().FilterForContentPublisherMediaType();
//
//	  }
//	  
//	
//	@Author(name="Raju")
//	  
//	  @Test()
//	public void HelpButtonVerify() throws Exception {
//	  
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		 
//	  getHomePageActions().tapOnMenuBar();
//	  getHomePageActions().verifyHelpSection();
//	  
//	}
//	  

//	  @Author(name="Raju") 
//	    @Test()
//	  public void verfiyLetUsKnowBtn() throws Exception {
//	    
//	  	  QXClient.get().driver();
//	  		 getDikshaMainPageActions().performUserOnBoarding();
//	  	
//	  	          getLibraryPageActions().verifyLetUsKnow();
//
//	  }

//	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	            description = "SearchContetInAllTabs ")
//	    public void SearchContetInAllTabs() throws Exception {
//		 QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoarding();
//		    	  
//		
//	      	getHomePageActions().tapOnSearchIcon();
//	  	      getHomePageActions().enterTextInSearchBar("AutomationCourseContent");
//		       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationCourseContent");
//
//	  	   
//	    }


//	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	            description = "switchingToManageLearnFromDifferentRole ")
//	    public void switchingToManageLearnFromDifferentRole() throws Exception {
//		 QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoarding();
//		 getHomePageActions().tapOnProfileTab();
//		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//				  properties.getProperty("excelpath"));
//				  
//				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//				  
//				  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//				  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//		
//				  QXClient.get().gestures().swipeUp();
//				  QXClient.get().gestures().swipeUp();
//		
//			  getLoginPageActions().loginToTheUser(Username,Password);
//			  
//			
//				 
//				 getHomePageActions().tapOnProfileTab();
//
//		 getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
//		 getHomePageActions().verifySectionsInHomePage();
//		 
//		 getHomePageActions().tapOnProfileTab();
//		 getProfileEditPageActions().changeStudentRole();
//		 getHomePageActions().tapOnProfileTab();
//		 getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
//		 getHomePageActions().verifySectionsInHomePage();
//
//		 getHomePageActions().tapOnProfileTab();
//		 getProfileEditPageActions().changeParentRole();
//		 getHomePageActions().tapOnProfileTab();
//		 getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();
//		 getHomePageActions().verifySectionsInHomePage();
//		 
//		 getHomePageActions().tapOnProfileTab();
//		 getProfileEditPageActions().changeTeacherRole();
//		 
//		 
//
//	    }
//	

	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "switchToDarkMode ") public void switchToDarkMode()
	 * throws Exception { QXClient.get().driver();
	 * getDikshaMainPageActions().performUserOnBoarding();
	 *
	 * getHomePageActions().verifyDarkMode();
	 *
	 *
	 * }
	 */
	/*
	 * @Test() public void verifyCloseIconInDiscussionForum() throws Exception {
	 *
	 * QXClient.get().driver(); DikshaMainPageActions d=new DikshaMainPageActions();
	 * getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab();
	 *
	 *
	 * Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 * QXClient.get().gestures().closeApp(); d.LaunchAppHomeScreen();
	 * getHomePageActions().tapOnDownloadTab();
	 *
	 * getHomePageActions().tapOnMenuBar();
	 * getHomePageActions().createGrupAndActivity();
	 * getHomePageActions().EnableDiscussion();
	 * getHomePageActions().startQuestionFill();
	 * getHomePageActions().verifyCloseBtnDF(); getHomePageActions().deleteGroup();
	 *
	 * }
	 */



	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "verifySearchPageForDikshaNewExpreiecne ") public void
	 * verifySearchPageForDikshaNewExpreiecne() throws Exception {
	 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
	 * getHomePageActions().tapOnProfileTab(); Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 * getHomePageActions().verifySearchPageForDikshaNewExpreiecne();
	 *
	 *
	 * }
	 *
	 */
	/*
	 * @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
	 * true, description = "createNewProject ") public void createNewProject()
	 * throws Exception { QXClient.get().driver();
	 * getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials()
	 * ; Properties properties =
	 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
	 * +"/configs/config.properties"); System.out.println("@name:" +
	 * properties.getProperty("excelpath"));
	 *
	 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	 *
	 * String Username
	 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
	 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
	 *
	 * getLoginPageActions().loginToTheUser(Username,Password);
	 *
	 * getHomePageActions().createNewProjects();
	 *
	 * getHomePageActions().editCreatedProjects(); }
	 */
//			 
//	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
//  		  true, description = "createNewProject ")
//  		  public void createNewProject()
//  		  throws Exception { 
//  			  QXClient.get().driver();
//  		  getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//  		//  getHomePageActions().tapOnProfileTab();
//  			 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//  					  properties.getProperty("excelpath"));
//  					  
//  					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//  					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//  					  
//  					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2); 
//  					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);	  
//  			
////  					  QXClient.get().gestures().swipeUp();
////  					  QXClient.get().gestures().swipeUp();
//  			
//  				  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//  				
//  		  getHomePageActions().createNewProjects();
//  		  }
//	
//	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
//	  		  true, description = "EditCreatedProject ")
//	  		  public void EditCreatedProject()
//	  		  throws Exception { 
//	  			  QXClient.get().driver();
//	  		  getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//	  		//  getHomePageActions().tapOnProfileTab();
//	  			 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//	  					  properties.getProperty("excelpath"));
//	  					  
//	  					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//	  					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//	  					  
//	  					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2); 
//	  					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);	  
//	  			
////	  					  QXClient.get().gestures().swipeUp();
////	  					  QXClient.get().gestures().swipeUp();
//	  			
//	  				  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//	  				
//	  		  getHomePageActions().createNewProjects();
//	  		getHomePageActions().editCreatedProjects();  		  
//	  		  }
//	  

//	
//	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	            description = "Verify UserAble to PrintPDFContent ")
//	    public void printPDF() throws Exception {
//		 QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoarding();	 
//	      	getHomePageActions().tapOnSearchIcon();
//	  	      getHomePageActions().enterTextInSearchBar("PDF");
//	  	     getTrainingPageActions().tapOnSearchedPDF();
//	         getLibraryPageActions().tapOnPlayIcon3();
//	         getLibraryPageActions().printPDF();
//	    }    
//


//	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	            description = "Verify verifyZoomInZoomOut ")
//	    public void verifyZoomInZoomOut() throws Exception {
//		 QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoarding();	 
//	      	getHomePageActions().tapOnSearchIcon();
//	  	      getHomePageActions().enterTextInSearchBar("PDF");
//	  	     getTrainingPageActions().tapOnSearchedPDF();
//	         getLibraryPageActions().tapOnPlayIcon3();
//	         getLibraryPageActions().verifyZoomInZoomOut();
//	    }    
//	  

//	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
//	            description = "Verify verifyNextAndPreviousBtnInPDF ")
//	    public void verifyNextAndPreviousBtnInPDF() throws Exception {
//		 QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoarding();	 
//	      	getHomePageActions().tapOnSearchIcon();
//	  	      getHomePageActions().enterTextInSearchBar("PDF");
//	  	     getTrainingPageActions().tapOnSearchedPDF();
//	         getLibraryPageActions().tapOnPlayIcon3();
//	         getLibraryPageActions().verifyNextAndPreviousBtnInPDF();
//	    }    
//	


//	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
//	  		  true, description = "ProjectSyncAndShare ")
//	  		  public void ProjectSyncAndShare()
//	  		  throws Exception { 
//	  			  QXClient.get().driver();
//	  		  getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//	  		//  getHomePageActions().tapOnProfileTab();
//	  			 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//	  					  properties.getProperty("excelpath"));
//	  					  
//	  					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//	  					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//	  					  
//	  					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2); 
//	  					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);	  
//	  			
// 			
//	  				  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//	  				
//	  		  getHomePageActions().createNewProjects();
//	  		getHomePageActions().editCreatedProjects();  
//	  		getHomePageActions().sycAndShare();
//	  		  }
//	  


//	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
//			  true, description = "verifyLabelOnBoardingAndProfilePage")
//			  public void verifyLabelOnBoardingAndProfilePage() throws Exception {
//				  QXClient.get().driver();
//				  getDikshaMainPageActions().performUserOnBoarding();
//				  getHomePageActions().tapOnProfileTab();
//				  getProfileEditPageActions().labelOnProfilePage();
//				
//			  }
//			 


//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyaddtasksection")
//	public void verifyaddtasksection() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//		Properties properties = QXClient.get().propUtils()
//				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
//		System.out.println("@name:" + properties.getProperty("excelpath"));
//		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
//		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
//		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
//		 getLoginPageActions().loginToTheUserForLeader(Username,Password);
//		 getHomePageActions().creationoftask();
//	}
//	
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifydownloadsection")
//	public void verifydownloadsection() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//		Properties properties = QXClient.get().propUtils()
//				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
//		System.out.println("@name:" + properties.getProperty("excelpath"));
//		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
//		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
//		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
//		 getLoginPageActions().loginToTheUserForLeader(Username,Password);
//		getHomePageActions().reportsectionsurvey();
//	}

//	  
//	  @Author(name="Raju")
//	  
//	  @Test() public void VerifyAddUser() throws Exception {
//  	
//		  QXClient.get().driver();
//		  getDikshaMainPageActions().performUserOnBoarding();
//		  getHomePageActions().tapOnProfileTab();
//		  
//		  
//		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		  properties.getProperty("excelpath"));
//		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		  
//		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
//		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
//		  QXClient.get().gestures().swipeUp();
//	        QXClient.get().gestures().swipeUp();
//	  getLoginPageActions().loginToTheUser(Username,Password);
//
//	  getHomePageActions().tapOnDownloadTab();
//
//	  
//	  getHomePageActions().tapOnMenuBar();
//	 	  	  getCoursePageActions().tapOnAddAnotherUser();
//	  
//	  String FakeName=QXClient.get().gestures().generateRandomName();
//	  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
//	  System.out.println(storeFakeNameEntered);
//	  getCoursePageActions().tapOnAddUserBtn();
//	  getHomePageActions().tapOnMenuBar();
//	  
//	  getCoursePageActions().tapOnMoreOption();
//	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
//	  
//	  
//	  getCoursePageActions().tapOnChangeUser(); 
//	  
//	  getCoursePageActions().tapOnTermsAndCondition();
//	  
//	  getCoursePageActions().tapOnContinueForSwicthUser();
//	  
//
//		  getHomePageActions().tapOnDownloadTab();
//
//	  getHomePageActions().tapOnProfileTab();
//	  getHomePageActions().tapOnProfileTab();
//
//	  
//	  getCoursePageActions().verifyDistricAndState();
//	  
//	  getCoursePageActions().verifyBMCValuesAfterAddingUser();
//		getCoursePageActions().updateStateAndDistrictValues();
//
//		getCoursePageActions().updateProfileDetails();
//
//	  
//	  }
//

//	 @Test()
//	    public void validateErrorMsgWhileMerging() throws Exception {
//	    	  
//	    		  QXClient.get().driver();
//	    		  DikshaMainPageActions d=new DikshaMainPageActions();
//	    		  getDikshaMainPageActions().performUserOnBoarding();
//	    		  getHomePageActions().tapOnProfileTab();
//	    		  
//	    		  
//	    		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//	    		  properties.getProperty("excelpath"));
//	    		  
//	    		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//	    		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//	    		  
//	    		  String SatetUsername =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2); 
//	    		  String StatePassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);	  
//	    		  String ReviewerUsername =QXClient.get().excelUtils().getCellValue("Excel1","TestData",40,2); 
//	    		  String ReviewerPassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",41,2);	  
//	    		  
//	    		  
//	    		  QXClient.get().gestures().swipeUp();
//	    		  QXClient.get().gestures().swipeUp();
//
//	    	  getLoginPageActions().loginToTheUser(SatetUsername,StatePassword);
//	    	
//		  QXClient.get().gestures().closeApp();  
//	          d.LaunchAppHomeScreen();
//	    	  getHomePageActions().tapOnDownloadTab();
//
//	    	  getHomePageActions().validateErrorwhieMerging(ReviewerUsername,ReviewerPassword);
//	    	
//	    }  
//


//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyaddtasksection")
//	public void verifyaddtasksection() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//		Properties properties = QXClient.get().propUtils()
//				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
//		System.out.println("@name:" + properties.getProperty("excelpath"));
//		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
//		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
//		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
//		  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//		getHomePageActions().creationoftask();
//	}
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifydownloadsection")
//	public void downloadSurveyReports() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//		Properties properties = QXClient.get().propUtils()
//				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
//		System.out.println("@name:" + properties.getProperty("excelpath"));
//		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
//		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
//		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
//		  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//		getHomePageActions().reportsectionsurvey();
//		
//	}
//	
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "validatecourselogin")
//	public void loginPopupForCourse() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoarding();
//		 getCoursePageActions().validatecourselogin();
//		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		   		  properties.getProperty("excelpath"));
//		   		 
//		   		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		   		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
//			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
//			
//	   		 getLoginPageActions().loginToTheUser(Username,Password);
//			
//		 }
//	
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "validateprogramsection")
//	public void validateStartObservation() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//		
//		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		   		  properties.getProperty("excelpath"));
//		   		 
//		   		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		   		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
//			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
//			  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//
//	   		 getHomePageActions().startObservation();
//			
//		 }
//	
//	
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyupdatedidonprofilepage")
//	public void updateSubmitFormInProfile() throws Exception {
//		QXClient.get().driver();
//		getDikshaMainPageActions().performUserOnBoarding();
//	     getHomePageActions().tapOnProfileTab();
//
//		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		   		  properties.getProperty("excelpath"));
//		   		 
//		   		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		   		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
//			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
//			String enterID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 42, 2);
//			 QXClient.get().gestures().swipeUp();
//			 QXClient.get().gestures().swipeUp();
//
//		    getLoginPageActions().loginToTheUser(Username,Password);
//		     getHomePageActions().tapOnProfileTab();
//			 QXClient.get().gestures().swipeUp();
//			 QXClient.get().gestures().swipeUp();
//		  
//		     getProfileEditPageActions().submitFormUpdate(enterID);
//	}
//
//	
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyprogramnamespage")
//	public void verifyProgramList() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//		Properties properties = QXClient.get().propUtils()
//				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
//		System.out.println("@name:" + properties.getProperty("excelpath"));
//		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
//		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
//		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
//		String programnameoftheuser = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
//		
//		getLoginPageActions().loginToTheUserForLeader(Username, Password);
//		 getHomePageActions().programList(programnameoftheuser);
//	}

//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "validatecourselogin")
//	public void displayLoginPoupEnroll() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoarding();
//	  	 getHomePageActions().tapOnTrainingTab();
//		 getCoursePageActions().validatecourselogin();
//		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		   		  properties.getProperty("excelpath"));
//		   		 
//		   		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		   		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
//			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
//			
//	   		 getLoginPageActions().tapOnLoginBtnInCourseTab(Username,Password);
//			
//		 }


//
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyaddtasksection")
//	public void verifyaddtasksection() throws Exception {
//		QXClient.get().driver();
//		 getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
//		Properties properties = QXClient.get().propUtils()
//				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
//		System.out.println("@name:" + properties.getProperty("excelpath"));
//		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
//		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",36, 2);
//		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37, 2);
//		  getLoginPageActions().loginToTheUserForLeader(Username,Password);
//		getHomePageActions().creationoftask();
//	}


//
//	@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyupdatedidonprofilepage")
//	public void updateSubmitFormInProfile() throws Exception {
//		QXClient.get().driver();
//		  DikshaMainPageActions d=new DikshaMainPageActions();
//
//		getDikshaMainPageActions().performUserOnBoarding();
//	     getHomePageActions().tapOnProfileTab();
//
//		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//		   		  properties.getProperty("excelpath"));
//		   		 
//		   		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//		   		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
//			String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
//		//	String enterID = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 42, 2);
//			 QXClient.get().gestures().swipeUp();
//			 QXClient.get().gestures().swipeUp();
//
//		    getLoginPageActions().loginToTheUser(Username,Password);
//		    QXClient.get().gestures().closeApp();  
//	          d.LaunchAppHomeScreen();
//	    	  getHomePageActions().tapOnDownloadTab();
//		     getHomePageActions().tapOnProfileTab();
//			 QXClient.get().gestures().swipeUp();
//			 QXClient.get().gestures().swipeUp();
//		  
//		     getProfileEditPageActions().submitFormUpdate("stagname");
//	}


/*

	@Test()
	public void VerifyEditTitleDescriptionTags() throws Exception {
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
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().createGrupAndActivity();
		getHomePageActions().EnableDiscussion();
		getHomePageActions().startQuestionFill();
		getHomePageActions().verifyUserAbletoModifyTitleDesc();
		getHomePageActions().deleteCommentsAndRepliesInDiscussion();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyuUserAbleToOpenDiscussionForum();
		getHomePageActions().deleteDiscussion();
	}

*/
/*	@Test()
	public void verifyGroupAdminAbleToViewActivityDashBoardOption() throws Exception {

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
		getHomePageActions().tapOnMenuBar();

		getHomePageActions().viewOptionActivityDashBoardOnActivityLevel();

	}
*/
	/*@Test()
	public void verifyAdminAbleToViewAllMetricsOfDashboard() throws Exception {

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

		getHomePageActions().openActivityDashBoard();

		getHomePageActions().verifyDownloadAsCSVInActivityDashboard();

		getHomePageActions().verifyAdminAbleToViewGroupMemberInActivityScreen();

		getHomePageActions().verifyMembersProgressInPercentage();

		getHomePageActions().verifyAllMetricsOfDashboardForAdmin();

	}
*/
/*	@Test()
	public void validateLastUpdatedMessageInActivityDashboard() throws Exception {

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

		getHomePageActions().verifyLastUpdatedMsgInActivityDashboard();

	}
*/
	/*@Test()
	public void validateMemberNameAndProgressInDownloadedCSVFileAsExcelFormat() throws Exception {

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

		getHomePageActions().verifyMemberNameAndProgressInExcelPostClickingDownloadasCSV();
		QXClient.get().gestures().clkBackButton();

	}*/

/*

	@Test()
	public void verifyUpdatedCardsofActivityInGroups() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",55,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",56,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyUpdatedCardsForActivities();


	}
*/

/*	@Test()
	public void validateRecommendationSectionAndFilterSectionWhileAddingActivityToGroup() throws Exception {

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

		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyAdditionalCategoriesInAddActivity();

		getHomePageActions().verifyContentsInDifferentCategories();

		getHomePageActions().validateRecommendationsSectionSearchSectionsAndFilterSection();

	}

*/
	/*@Test()
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

	}*/

/*	@Test()
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

	}*/
/*
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

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",55,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",56,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyGeneralDiscussionTopics();

		getHomePageActions().verifyDiscussionList();

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().createGrupAndActivity();
		getHomePageActions().verifyDiscussionForum();
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

		getHomePageActions().verifyMinimumCharactersInDiscussionTopicQuestionAndPleaseEloberateYourQuestionSection();

	}

	@Test()
	public void validateMinimum10CharactersInTopicReplyForMemberInGroups() throws Exception {

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 67, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 68, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnMenuBar();
		getCoursePageActions().tapOnMoreOption();
		getCoursePageActions().clickFirstUser();
		getCoursePageActions().tapOnChangeUser();
		getCoursePageActions().CheckTermsCheckBoxORClickProfile();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyAdminLinkedGroupInMember();
		getHomePageActions().verifyEnableDiscussionIconInGroupEnabled();

		getHomePageActions().verifyStartDiscussion();

		getHomePageActions().verifyMinimum10CharactersInTopicReplyEditTextBox();

	}

	@Test()
	public void validateFiftyDiscussionTopicsUnderAnyCategoryOfMyDiscussions() throws Exception {

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 67, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 68, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnMenuBar();
		getCoursePageActions().tapOnMoreOption();
		getCoursePageActions().clickFirstUser();
		getCoursePageActions().tapOnChangeUser();
		getCoursePageActions().CheckTermsCheckBoxORClickProfile();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyAdminLinkedGroupInMember();

		getHomePageActions().verify50TopicsInAnyOneGeneralDiscussionCategory();


	}

	@Test()
	public void validateLoadingAnimationForGeneralCategoryMyDiscussionsAndTapOptionForMemberOfGroup() throws Exception {

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 67, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 68, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnMenuBar();
		getCoursePageActions().tapOnMoreOption();
		getCoursePageActions().clickFirstUser();
		getCoursePageActions().tapOnChangeUser();
		getCoursePageActions().CheckTermsCheckBoxORClickProfile();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyAdminLinkedGroupInMember();

		getHomePageActions().verifyLoadingAnimationForTagsOption();

		getHomePageActions().verifyLoadingAnimationForGeneralCategory();

		getHomePageActions().verifyLoadingAnimationForMyDiscussions();

	}
*/
/*	@Test()
	public void validateNoTagsAvailableMessage() throws Exception {

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
		getHomePageActions().verifyTagsSection();


	}*/
/*
	@Test()
	public void validateLoadingAnimationPostClickingBackAndCloseInDFForMemberOfGroup() throws Exception {

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 67, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 68, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnMenuBar();
		getCoursePageActions().tapOnMoreOption();
		getCoursePageActions().clickFirstUser();
		getCoursePageActions().tapOnChangeUser();
		getCoursePageActions().CheckTermsCheckBoxORClickProfile();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyAdminLinkedGroupInMember();

		getHomePageActions().verifyLoadingAnimationPostClickingBackBtn();

		getHomePageActions().verifyLoadingAnimationPostClickingCloseBtn();


	}
*/
	/*@Test()
	public void validateLoadingAnimationForDifferentCategoriesOfMyDiscussionToMemberOfGroup() throws Exception {

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

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 67, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 68, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnMenuBar();
		getCoursePageActions().tapOnMoreOption();
		getCoursePageActions().clickFirstUser();
		getCoursePageActions().tapOnChangeUser();
		getCoursePageActions().CheckTermsCheckBoxORClickProfile();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyAdminLinkedGroupInMember();

		getHomePageActions().verifyLoadingAnimationForTagsOption();

		getHomePageActions().verifyLoadingAnimationForGeneralCategory();

		getHomePageActions().verifyLoadingAnimationForMyDiscussions();

		getHomePageActions().verifyLoadingAnimationForRecentBestSavedUpvoteAndDownvotePosts();


	}
*/
	/*@Test()
	public void validateActivityPageInActivityDashboard() throws Exception {

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

		getHomePageActions().verifyUserNameFreezedInActivityPage();

	}

*/
/*

	@Test()
	public void verifyActivityDashBoardInGroups() throws Exception {

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

*/

	/*@Test(enabled = true, groups = {"RegressionTest", "FunctionalTest"}, alwaysRun = true,
			description = "Verify user is able to change the app language")
	public void userIsAbleToChangeTheAppLang() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String KannadaText =QXClient.get().excelUtils().getCellValue("Excel1","TestData",6,2);
		getHomePageActions().tapOnMenuBar();
		//getHomePageActions().methodToHandleMenuBar();
		getHomePageActions().tapOnLanguage();
		getHomePageActions().tapOnKannadaLanguage();

		getHomePageActions().tapOnContinueBtnKannada();

		DikshaMainPageActions d2=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d2.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();


		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyKanndaTextChanged(KannadaText);
	}
*/
/*

	@Test()
	public void AddUserLimitMsg() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);
//	  DikshaMainPageActions d=new DikshaMainPageActions();
//
//	  QXClient.get().gestures().closeApp();
//	    d.LaunchAppHomeScreen();
		// getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();
		//getHomePageActions().methodToHandleMenuBar();
		getCoursePageActions().verifyAddAnotherUserIsDisplayed();
		getCoursePageActions().tapOnAddAnotherUser();


		String FakeName=QXClient.get().gestures().generateRandomName();
		String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
		System.out.println(storeFakeNameEntered);
		getCoursePageActions().tapOnAddUserBtn();
		getCoursePageActions().verifyMsgAddingUser();

	}
*/
	 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			  true, description = "Switch User In Menu")
			  public void SwicthUser() throws Exception {

		 QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
		 getHomePageActions().tapOnProfileTab();
		 QXClient.get().gestures().swipeUp();
		 QXClient.get().gestures().swipeUp();


		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				 properties.getProperty("excelpath"));

		 String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		 QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		 String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		 String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);

		 getLoginPageActions().loginToTheUser(Username,Password);

		 //getHomePageActions().tapOnDownloadTab();


		 getHomePageActions().tapOnMenuBar();

		 getCoursePageActions().tapOnMoreOption();
		 getCoursePageActions().clickFirstUser();
		 getCoursePageActions().tapOnChangeUser();
		 getCoursePageActions().CheckTermsCheckBoxORClickProfile();
		 getCoursePageActions().verifyDistricAndState();
			  
			  }

	 
}





































