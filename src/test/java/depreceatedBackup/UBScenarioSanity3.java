package depreceatedBackup;

import java.util.Properties;

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
//	}  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,description = "Verify updateUserOnBoardingValues")
//  public void updateUserOnBoardingValues() throws Exception {
//
//  	  QXClient.get().driver();
//  	  getDikshaMainPageActions().performUserOnBoarding();
//  	  getHomePageActions().tapOnProfileTab();
//
//
//  	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//  			  properties.getProperty("excelpath"));
//
//  			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//  			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//
//  			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
//  			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
//
//  			  QXClient.get().gestures().swipeUp();
//  		        QXClient.get().gestures().swipeUp();
//
//  		  getLoginPageActions().loginToTheUser(Username,Password);
//  		 DikshaMainPageActions d=new DikshaMainPageActions();
//  		 QXClient.get().gestures().closeApp();
// 	    d.LaunchAppHomeScreen();
// 		  getHomePageActions().tapOnDownloadTab();
//
//
// 		  getHomePageActions().tapOnProfileTab();
//			  QXClient.get().gestures().swipeUp();
//			  QXClient.get().gestures().swipeUp();
//
//
//
//  		getCoursePageActions().updateProfileDetails();
//
//
// }  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,description = "Verify updateUserOnBoardingValues")
//  public void updateUserOnBoardingValues() throws Exception {
//
//  	  QXClient.get().driver();
//  	  getDikshaMainPageActions().performUserOnBoarding();
//  	  getHomePageActions().tapOnProfileTab();
//
//
//  	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//  			  properties.getProperty("excelpath"));
//
//  			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//  			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//
//  			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
//  			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
//
//  			  QXClient.get().gestures().swipeUp();
//  		        QXClient.get().gestures().swipeUp();
//
//  		  getLoginPageActions().loginToTheUser(Username,Password);
//  		 DikshaMainPageActions d=new DikshaMainPageActions();
//  		 QXClient.get().gestures().closeApp();
// 	    d.LaunchAppHomeScreen();
// 		  getHomePageActions().tapOnDownloadTab();
//
//
// 		  getHomePageActions().tapOnProfileTab();
//			  QXClient.get().gestures().swipeUp();
//			  QXClient.get().gestures().swipeUp();
//
//
//
//  		getCoursePageActions().updateProfileDetails();
//
//
// }

//////////////////////////////////////////////////////////////////////////////
/*

	@Test()
	public void verifyEnrolledCourseInHomePageAndProfilePageUnderMyLearningSection() throws Exception {

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

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small AutomationCourseContent");
		getTrainingPageActions().tapOnSearchedCourse1();

		getTrainingPageActions().enrollToTheSmallCourse();
		QXClient.get().gestures().closeApp();
		DikshaMainPageActions d = new DikshaMainPageActions();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyCourseInProfileSectionUnderMyLearningSection();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().verifyEnrolledCourseInMyLearningSectionOfHomePage();

	}

	@Test()
	public void verifyPostClickingOngoingCourseInProfilePageLandsOnCourseTOCPage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		QXClient.get().gestures().swipeUp();

		getCoursePageActions().tapOnOngoingCourse();


	}

	@Test()
	public void verifyUpcomingBatchDetailsMessageInCourse() throws Exception {

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

		//getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("UpcomingCourse");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("UpcomingCourse");
		getTrainingPageActions().tapOnSearchedCourse5();
		getTrainingPageActions().verifyUpcomingBatchMessageWhileJoinCourse();


	}

	@Test()
	public void verifyConsentPopUpIsDisplayedForCourseAndTraceableCollection () throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
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

		getHomePageActions().enterTextInSearchBar("CourseContent");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
		getTrainingPageActions().tapOnSearchedCourse6();
		getTrainingPageActions().verifyConsentPopUpForCourse();

		getTrainingPageActions().leaveCourse();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().enterTextInSearchBar("Umesh trackable collection");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Umesh trackable collection");
		getTrainingPageActions().tapOnSearchedCourse7();
		getTrainingPageActions().verifyConsentPopupForCollection();

	}

	@Test()
	public void verifyMyLearningSectionDetailsForCourses() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().verifyMyLearningSectionDetails();



	}

	@Test()
	public void verifyCourseInClassicAndSearchInNewExperience() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().verifySearchTabInsteadOfCoursesTabInNewExperience();

	}


	@Test()
	public void validateUpcomingBatchMsgInCourse() throws Exception {

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

		//getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("UpcomingCourse");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("UpcomingCourse");
		getTrainingPageActions().tapOnSearchedCourse5();
		getTrainingPageActions().verifyUpcomingBatchMessageWhileJoinCourse();


	}

	@Test()
	public void NoLeaveCourseForCompletedCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().tapOnCompletedCourse();

		getTrainingPageActions().verifyNoLeaveCourseForCompletedCourse();


	}

	@Test()
	public void validateNoCertificateMsgINCourseTOC() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);

		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getTrainingPageActions().tapOnSearchedCourse1();
		getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

	}

	@Test()
	public void verifyNoJoinCourseButtonForExpiredCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyExpiredCourseInCourseTOC();


	}

	@Test()
	public void verifyUserNotAbleToEnrollTheCourseWithEnrollementEndDatePassed() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("AutomationExpiredCourse");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("limited course");
		getTrainingPageActions().tapOnSearchedExpiredCourse();

		getTrainingPageActions().verifyCourseWithEnrollmentEndDateIsOver();

	}

	@Test()
	public void verifyCoursesBasedOnSubjectAndOthersGroup() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		DikshaMainPageActions d=new DikshaMainPageActions();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getTrainingPageActions().verifyCoursesBasedOnSubject();


	}


	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
	public void verifyCertificateDetailsPreAndPostConsumeCourse() throws Exception {

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
		String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 54, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);

		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getTrainingPageActions().tapOnSearchedCourse1();
		getTrainingPageActions().verifyCertificateDetailsBeforeJoinCourse();

		getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

		getTrainingPageActions().consumeSmallCourse();

		getTrainingPageActions().verifyCourseCompletedMsg();

	}

	@Test()
	public void verifyCourseTOCPageMessagesForExpiredAndEnrollmentEndDateCourses() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().verifyEnrollmentEndDateUnderJoinTraining();
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();

		getHomePageActions().verifyEnrollmentClosedInCourseTOC();

		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();

		getHomePageActions().verifyExpiredCourseInCourseTOC();


	}

	@Test()
	public void verifyCourseProgressIsDisabledInCourseCard () throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
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
		getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");

		getTrainingPageActions().verifyCourseProgressIsDisabledInCourseCard();

	}


	@Test()
	public void verifyUserAbleToConsumeOngoingBatchInExpiredCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		//getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("AutomationExpiredCourse");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationExpiredCourse");
		getTrainingPageActions().tapOnSearchedExpiredCourse();
		getHomePageActions().verifyOngoingBatchInAlreadyExpiredCourse();

		getTrainingPageActions().leaveCourse();

	}


	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "verifyUserAbleDownloadAndPlayCourseContent ")
	public void verifyExpiredCourses() throws Exception {
		QXClient.get().driver();

		System.out.println("verify verifyUserAbleToEnrodllConsumeCourseContent");

	}

	@Test()
	public void verifyUserAbleToConsumeOngoingCourseFromProfile() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);

		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		QXClient.get().gestures().swipeUp();

		getCoursePageActions().tapOnOngoingCourse();

	}


	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "CreateGroup Menu")
	public void verifyCreditLicenseInfoSecInTOCpage() throws Exception {
		QXClient.get().driver();
		System.out.println("verify CreateGroup");

	}

	@Test(enabled = true, groups = { "SanityTest",
			"FunctionalTest" }, alwaysRun = true, description = "CourseTOCPageVerify")
	public void CourseTOCPageVerify() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Course");

		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().BlindWait(1000);

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().BlindWait(1000);
		QXClient.get().gestures().closeApp();

		DikshaMainPageActions d = new DikshaMainPageActions();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().verifyRecentlySearchedKeyword();

	}


	@Test()
	public void verifyCreatorIsNotAbleToEnrollCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
		String coursefetch=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


		//getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnTrainingTab();

		getTrainingPageActions().verifyLoginBeforeCourseFetch();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getTrainingPageActions().tapOnSearchedCourse1();
		getTrainingPageActions().verifyLoginPopUpWhileJoinCourse();

		getLoginPageActions().loginToTheUser(Username,Password);

		getTrainingPageActions().verifyCreatorNotAbleToEnrollMessage();

	}

	@Test()
	public void verifySyncProgressNowPostCompletingTheCourse() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		DikshaMainPageActions d=new DikshaMainPageActions();


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

		//getHomePageActions().tapOnDownloadTab();

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
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small AutomationCourseContent");
		getTrainingPageActions().tapOnSearchedCourse1();
		getTrainingPageActions().verifyCourseCompletedMsgWithoutCertificate();

		QXClient.get().gestures().clkBackButton();

		getTrainingPageActions().verifySyncNowCourseProgressInCompletedCourse();

	}

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "StartLearningButtonOnjoinCourse")
	public void StartLearningButtonOnjoinCourse() throws Exception {
		QXClient.get().driver();
		System.out.println("verify StartLearningButtonOnjoinCourse");
	}

	@Test()
	public void validateTimerNotDisplayedInCourseWithNoEndDate() throws Exception {

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

		//getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("CourseWithNoEndDate");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseWithNoEndDate");
		getTrainingPageActions().tapOnSearchedCourse4();
		getTrainingPageActions().verifyTimerIsNotDisplayedInCourseTOC();

		getTrainingPageActions().leaveCourse();

		getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

	}


	@Test()
	public void validateTimerDisplayedInCourseExpireInTwoDays() throws Exception {

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
		DikshaMainPageActions d=new DikshaMainPageActions();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("CourseExpireInTwoDays");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseExpireInTwoDays");
		getTrainingPageActions().tapOnSearchedCourse3();
		getTrainingPageActions().verifyTimerIsDisplayedInCourseTOC();

		getTrainingPageActions().leaveCourse();

		getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

	}

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			true, description = "courseNameInProfileTab")
	public void courseNameInProfileTab() throws Exception {
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
		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();


		getHomePageActions().tapOnProfileTab();
		getCoursePageActions().verifyCoursesSectionInProfile();


	}


	@Test()
	public void verifyCourseIsNotHavingCertificateMsg() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		//getHomePageActions().tapOnDownloadTab();

		//getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);

		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getTrainingPageActions().tapOnSearchedCourse1();
		getTrainingPageActions().verifyCertificateDetailsBeforeJoinCourse();

		getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

	}


	@Test()
	public void verifyCourseLastUpdatedMessageInCourseTOC() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		String  CourseName=QXClient.get().excelUtils().getCellValue("Excel1", "TestData",51,2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(CourseName);
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(CourseName);
		getTrainingPageActions().tapOnUpdatedCourseContent();
		getTrainingPageActions().verifyCourseUpdatedMessageWithDate();

	}

	@Test()
	public void verifyNoEarnCertificateFieldInCourseTOCPage() throws Exception {

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

		//getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("CourseContent");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");
		getTrainingPageActions().tapOnSearchedCourse6();
		getTrainingPageActions().verifyNoEarnCertificateInCourseTOC();

	}

	@Test()
	public void verifyNoCertificateRuleForCourseWithoutCertificate () throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().enterTextInSearchBar("AutomationCourseForDF");

		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationCourseForDF");
		getTrainingPageActions().tapOnSearchedCourseForDF();
		getCoursePageActions().verifyNoCertificateRule();
	}


	@Test()
	public void verifyEarnCertificateAndRulesToEarnCertificateInCourseTOC() throws Exception {

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

		//getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Cert Course 4.5");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Cert Course 4.5");
		getTrainingPageActions().tapOnSearchedCourse8();
		getTrainingPageActions().verifyEarnCertificateInCourseTOC();

	}

	@Test()
	public void verifyCoursesForSelectedCategoryAndSelectedSubject () throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getHomePageActions().tapOnProfileTab();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getTrainingPageActions().verifyCoursesInCoursesTab();

		getHomePageActions().tapOnSearchIcon();

		getTrainingPageActions().verifyCoursesBasedOnCategoryAndSubject();

	}

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
			description = "JoinTrainLoginPageHasGmailLogin")
	public void JoinTrainLoginPageHasGmailLogin() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnTrainingTab();
		getLoginPageActions().tapOnLoginBtnInTrainingTab();
		getHomePageActions().verifySignInGoogleOption();

	}

	@Test()
	public void validateSameCourseProgressAfterReEnrollingToCourse () throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
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

		getHomePageActions().tapOnTrainingTab();

		getTrainingPageActions().verifyCourseFromMyCourseSection();

		getTrainingPageActions().leaveCourse();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("AutomationContentCourse");
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationContentCourse");

		getTrainingPageActions().enrollToSameCourseAndVerifyCourseProgressRemainsSame();

	}


	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
	public void verifyUserAbleToEnrollConsumeCourseContent() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);


		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

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


		DikshaMainPageActions d2=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d2.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();



		getHomePageActions().tapOnProfileTab();
		//  getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnTrainingTab();





		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);

		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		getTrainingPageActions().consumCourseContent();



	}

	@Test()
	public void verifyCertificateDownloadingToastMessage() throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));
		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username, Password);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getHomePageActions().verifyCertificateToastMessage();


	}

	@Test(enabled = true, groups = { "SanityTest",
			"FunctionalTest" }, alwaysRun = true, description = "Course Share.")
	public void verifyCourseSharing() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);


		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

		getTrainingPageActions().tapOnSearchedCourse1();
		getTrainingPageActions().tapOnJoinTraining2();





		getLibraryPageActions().tapOnShareBtn();
		getLibraryPageActions().verifySharePopUI();
		getLibraryPageActions().tapOnShareBtnFrmSharePop();
		getLibraryPageActions().tapOnShareToWhatsApp();
		getLibraryPageActions().verifyWhatsAppHomePage();


	}


	@Test()
	public void verifyCompletedCourseAndNoCertificateMsg() throws Exception {
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

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
		//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small AutomationCourseContent");
		getTrainingPageActions().tapOnSearchedSmallCourse();
		getTrainingPageActions().verifyCourseCompletedMsgWithoutCertificate();



	}

	@Test()
	public void validateCourseTextInsteadOfTrainingText () throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		DikshaMainPageActions d = new DikshaMainPageActions();
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

		getHomePageActions().tapOnTrainingTab();

		getTrainingPageActions().verifyCoursesInsteadOfTraining();

	}

*/

























}