package com.qualitrix.pageActions;

import cucumber.api.java.gl.E;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.CoursePageObjects;
import com.qualitrix.pageObjects.DikshaMainPageObjects;


public class CoursePageActions  {

   
   // LibraryCourseContentPageActions libcour=new LibraryCourseContentPageActions();
    HomePageActions homePageActions = new HomePageActions();

    CoursePageObjects coursePageObjects=new CoursePageObjects();
    public CoursePageActions() {
    //    this.driver = ContextManager.getDriver();

       PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), coursePageObjects);
    	
    	//PageFactory.initElements(driver,DikshaMainPageObjects.class);

    }
    public void tapOnOngoingCourse()  throws Exception {
        QXClient.get().gestures().BlindWait(5000);
    	QXClient.get().gestures().swipeUp();
    	QXClient.get().gestures().swipeUp();
    	//QXClient.get().gestures().scrollToMobileElement(coursePageObjects.viewMore,"4");
    	//QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.viewMore);
    	Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.ongoingCourse));
//    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkOnOngoingCourse);
//    	QXClient.get().gestures().BlindWait(3000);
//    	QXClient.get().report().info("Tap on Ongoing course");
//    	Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertStartLearning));
//    	QXClient.get().gestures().BlindWait(3000);
//
//        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertCourseModules),"Course modules is not displayed in course toc page");
//        QXClient.get().report().info("Ongoing course is landed on Course TOC page");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnViewMore() {
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.viewMore);
    	QXClient.get().report().info("Tap on view more");
    }

    public void tapOnCompletedCourse() throws Exception {
        Thread.sleep(5000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        if(QXClient.get().gestures().isElementPresent(coursePageObjects.viewMore)) {
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.viewMore);
            QXClient.get().gestures().BlindWait(2000);
        }
        //QXClient.get().gestures().scrollToMobileElement(coursePageObjects.completedCourse,"3");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.completedCourse),"Completed course is not displayed");
        QXClient.get().report().info("Tap on completed course");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkOnCompletedCourse);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertCourseCompletedMessageInCompletedCourse),"Course completed message is not displayed");
        QXClient.get().report().info("Course completed message is displayed");
    }

    public void viewCompleteMessage() {
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.completedMessage);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.completedMessage),"You have successfully completed this course");
        QXClient.get().report().info("Verifying completed message");
    }
    
    public void tapOnAddUser() {
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.addUser);
    	QXClient.get().report().info("Tap on add User ");
    }
    public void tapOnAddAnotherUser() throws Exception {
       QXClient.get().gestures().BlindWait(3000);
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.addAnotherUser);
    	QXClient.get().report().info("Tap on addAnotherUser");
        QXClient.get().gestures().BlindWait(3000);

    }
    
    
    public String enterName(String user) throws Exception {
    	QXClient.get().gestures().waitForElementToAppear(coursePageObjects.name);
    	
    	coursePageObjects.name.sendKeys(user);
    	//QXClient.get().gestures().wait(3);
    	String getFakeNameEntered=coursePageObjects.name.getText();
    	QXClient.get().report().info("Enter the new user name");
        return getFakeNameEntered;
    }

    public void tapOnAddUserBtn() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.addUserBtn);
    	QXClient.get().report().info("Tap on add User Btn while adding user");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void tapOnSwitchUser() {
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.switchUser);
        QXClient.get().report().info("tap on new user ");
    }
    
    public void verifySelectedUserPage() {
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.selectedUserPage);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.selectedUserPage),"You page is not available");
        QXClient.get().report().info("verify selected User Page");
    }

    public void tapOnMoreOption() throws Exception {
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.moreOption);
        QXClient.get().report().info("Tap on more Option");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void tapOnChangeUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.changeUser);
        QXClient.get().report().info("Tap on change User");
        QXClient.get().gestures().BlindWait(3000);
        if(QXClient.get().gestures().isElementPresent(coursePageObjects.clkGoToProfile)){
            //QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkGoToProfile);
            QXClient.get().gestures().BlindWait(3000);
        }
        QXClient.get().gestures().BlindWait(3000);

    }

    public void tapOnChangeUserWithoutProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.changeUser);
        QXClient.get().report().info("Tap on change User");
        QXClient.get().gestures().BlindWait(3000);
        if(QXClient.get().gestures().isElementPresent(coursePageObjects.clkGoToProfile)){
            QXClient.get().gestures().BlindWait(3000);
           // QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkGoToProfile);
            QXClient.get().gestures().BlindWait(3000);
        }
        QXClient.get().gestures().BlindWait(3000);

    }

    public void tapOnChangeUser1() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.changeUser);
        QXClient.get().report().info("Tap on change User");
        QXClient.get().gestures().BlindWait(3000);
        if(QXClient.get().gestures().isElementPresent(coursePageObjects.clkGoToProfile)){
            QXClient.get().gestures().BlindWait(2000);
           //  QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkGoToProfile);
            QXClient.get().gestures().BlindWait(3000);
        }
        QXClient.get().gestures().BlindWait(3000);

    }

    public void tapOnTermsAndCondition() throws Exception {
    	QXClient.get().gestures().BlindWait(5000);
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.termsCheckBox);
        QXClient.get().report().info("Tap on termsCheckBox");
    }
    public void tapOnContinueForSwicthUser() throws Exception {
    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.continueChangeUser);
        QXClient.get().report().info("Tap on continueChangeUser");
    	QXClient.get().gestures().BlindWait(9000);
    	QXClient.get().gestures().BlindWait(5000);
    	QXClient.get().gestures().BlindWait(5000);

    }


    public void verifyDistricAndState() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyDistrict),"District is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyState),"State is not available");

        QXClient.get().report().info("Verfied DisstrictAndState in ProfileTab");
    }
    public void verifyAddAnotherUserIsDisplayed() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.addAnotherUser),"addAnotherUser is not available");
        QXClient.get().report().info("Add AnotherUser is displayed in Menu");

    }
    public void clickFirstUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.clickFirstUser),"clickFirstUser is not available");
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clickFirstUser);
        QXClient.get().report().info("Clicked on FirstUSer");

    }
    public void verifyCoursesSectionInProfile() throws Exception {
      	Thread.sleep(4000);
		  QXClient.get().gestures().swipeUp();
		

  	QXClient.get().gestures().scrollToMobileElement(coursePageObjects.coursesSection,"2");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.coursesSection),"coursesSection is not available");
        QXClient.get().report().info("Coursees Section is displayed in Profile Section");

    }
    public void CheckTermsCheckBoxORClickProfile() throws Exception {
    
    try
    {
        if (QXClient.get().gestures().isElementPresent(coursePageObjects.termsCheckBox)) {
        	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.termsCheckBox);
               QXClient.get().report().info("Clicked on TermsAndCondition CheckBox");

               QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.continueChangeUser);  
            QXClient.get().report().info("Clicked on Continue for SwitchUser");
            QXClient.get().gestures().BlindWait(9000);
            homePageActions.tapOnProfileTab();
        	}
        else
        	{
        	homePageActions.tapOnProfileTab2();
        }
    }
    catch(Exception e)
    {
    	System.out.println("Exception Handled");
    }
         }
    
    public void VerifySubmitDetailsForm() throws Exception {
    	
          QXClient.get().gestures().swipeUp();
          QXClient.get().gestures().BlindWait(4000);
          QXClient.get().gestures().BlindWait(4000);
          QXClient.get().gestures().swipeUp();
          //QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.clkSubmitDetails),"clkSubmitDetails is not available");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitDetails);
        QXClient.get().report().info("Clicked on Submit Details in Profile Tab");
        QXClient.get().gestures().BlindWait(4000);
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertMandatoryFieldInSubmitdetails),"Mandatory field is not displayed");
        QXClient.get().report().info("Mandatory field is displayed after clicking the submit details");
        
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkPersonaDropDown);
        QXClient.get().report().info("Clicked on clkPersonaDropDown in Submit Details");
        QXClient.get().gestures().BlindWait(3000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.SelectPersonaDropDown);
        QXClient.get().report().info("selected PersonaDropDown in Submit Details");
        QXClient.get().gestures().BlindWait(3000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.TeacherSubmit);
        QXClient.get().report().info("clicked Submit Details");
        
        QXClient.get().gestures().BlindWait(6000);
        
        
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyStateBoardOrgLabel),"verifyStateBoardOrgLabel is not available");
//        QXClient.get().report().info("StateBoardOrg Label is displayed in submit forms");


      
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyMobielNumberLabel),"verifyMobielNumberLabel is not available");
        QXClient.get().report().info("MobileNumber Label is displayed in submit forms");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyAddressLabel),"verifyAddressLabel is not available");
        QXClient.get().report().info("Address Label is displayed in submit forms");
        
       
        
        //   QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.termsCheckBoxTeacherForm),"termsCheckBoxTeacherForm is not available");
        QXClient.get().report().info("TermsAndCondition CheckBox Label is displayed in submit forms");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyAgreePrivacyPolicyText),"verifyAgreePrivacyPolicyText is not available");
        QXClient.get().report().info("AgreePrivacyPolicy Label is displayed in submit forms");
    }
    public void verifyMsgAddingUser() throws Exception {
    	QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyCancelButtn),"verifyCancelButtn is not available");
        QXClient.get().report().info("verifyCancelButtn is not available, so can't add more than 30 users");
    }

    public void updateProfileDetails() throws Exception {

        //	QXClient.get().gestures().scrollUpToMobileElement(coursePageObjects.clikEditProfile,"3");
         QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().scrollToMobileElement(coursePageObjects.clikEditProfile,"1");


        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clikEditProfile);
        QXClient.get().report().info("Tap on clikEditProfile Option");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkBoardDropDown);
        QXClient.get().report().info("Tap on clkBoardDropDown Option");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltBoard.get(2));
        QXClient.get().report().info("select Andra");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
        QXClient.get().report().info("Tap on Submit Button");
        QXClient.get().gestures().BlindWait(3000);


        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkMediumDropDown.get(1));
        QXClient.get().report().info("Tap on clkMediumDropDown Option");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltMediumVal);
        QXClient.get().report().info("select English");
        QXClient.get().gestures().BlindWait(2000);


        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
        QXClient.get().report().info("Tap on Submit Button");
        QXClient.get().gestures().BlindWait(3000);


        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkClassDropDown);
        QXClient.get().report().info("Tap on clkClassDropDown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltClassVal.get(0));
        QXClient.get().report().info("select Class 4");

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
        QXClient.get().report().info("Tap on Submit Button");
        QXClient.get().gestures().BlindWait(3000);


        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubjectDropDown);
        QXClient.get().report().info("Tap on clkSubjectDropDown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltsubjectVal);
        QXClient.get().report().info("Select Subject");

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
        QXClient.get().report().info("Tap on Submit Button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSaveProfile);
        QXClient.get().report().info("Tap on Save Button");
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().BlindWait(2000);



        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyBaord),"verifyBaord is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyMedium),"verifyMedium is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyClasses),"verifyClasses is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifySubjects),"verifySubjects is not available");

        QXClient.get().report().info("Verified Profile Update");
    }
    
    public void verifyBMCValuesAfterAddingUser() throws Exception {
    	 Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyBoardAfterAddUser),"verifyBaord is not available");
      //   Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyMediumAfterAddUser),"verifyMedium is not available");
        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyClassesAfterAddUser),"verifyClasses is not available");

         QXClient.get().report().info("Verified BMS Values After Adding User");
 	    QXClient.get().gestures().BlindWait(2000);

    }

    public void updateStateAndDistrictValues() throws Exception {



        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkStateLoc);
        QXClient.get().report().info("Tap on clkStateLoc Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltStateLoc);
        QXClient.get().report().info("select Andra");
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);


        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkDistrictLoc);
        QXClient.get().report().info("Tap on clkDistrictLoc Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltDistrictLoc);
        QXClient.get().report().info("select sltDistrictLoc");


        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
        QXClient.get().report().info("Tap on submitLoc Button");

        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.submitLoc);
        QXClient.get().report().info("Tap on submitLoc Button");
        QXClient.get().gestures().BlindWait(6000);

        homePageActions.tapOnProfileTab();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyDistrictAfterUpdate),"verifyDistrictAfterUpdate is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyStateAfterUpdate),"verifyStateAfterUpdate is not available");

    }
 
 public void validatecourselogin() throws Exception {
		
		
	//	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkoncoursesicon);
		 QXClient.get().gestures().BlindWait(3000);
		    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.clkonlogintojoincourse),"clkonlogintojoincourse is not available");

		 QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkonlogintojoincourse);
		 QXClient.get().gestures().BlindWait(3000);
 }
 
 public void tapOnNewDikshaExperience()throws Exception{
	    QXClient.get().gestures().BlindWait(3000);

	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkNewDikshExperiece);
	    QXClient.get().report().info("clicked on clkNewDikshExperiece");
	    QXClient.get().gestures().BlindWait(3000);




	}

	public void verifyUpdatedProfileDetailsInNewDikshaExperience() throws Exception{
	    QXClient.get().gestures().BlindWait(3000);

	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyBaord),"verifyBaord is not available");
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyMedium),"verifyMedium is not available");
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyClasses),"verifyClasses is not available");
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifySubjects),"verifySubjects is not available");

	    QXClient.get().report().info("Verified Profile Update");
	}

	public void verifyMyLearningSectionDetails() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertCourseInMyLearning),"Course is not displayed in My learning section");
        QXClient.get().report().info("Course is displayed in My learning section");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertBatchInMyLearning),"Batch is not displayed in My learning section");
        QXClient.get().report().info("Batch is displayed in My learning section");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertCourseStatusInMyLearning),"Course status is not displayed in My learning section");
        QXClient.get().report().info("Status is displayed in My learning section");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertCompletionDateInMyLearning),"Completion date is not displayed");
        QXClient.get().report().info("Course completion date is displayed in My learning section");
    }

    public void verifyNoCertificateRule() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

      if(QXClient.get().gestures().isElementPresent(coursePageObjects.clkCertificateCriteria)){
          QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkCertificateCriteria);
          QXClient.get().gestures().BlindWait(2000);
          QXClient.get().gestures().swipeUp();

          Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertCertificateRule),"Certificate rule is displayed");
          QXClient.get().report().info("Certificate rule is not displayed for Course Without certificate");
          QXClient.get().gestures().BlindWait(3000);
      }
    }

    public void verifyOngoingAndCompletedCoursesUnderMyLearning() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.ongoingCourse),"Ongoing course is not displayed");
        QXClient.get().report().info("Ongoing course is displayed with Blue color Ongoing text");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.completedCourse),"Completed course is not displayed");
        QXClient.get().report().info("Completed course is displayed with Green color Completed text");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyMoreBtnAndCoursesUnderMoreBtnInProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertMoreBtn),"More button is not displayed");
        QXClient.get().report().info("More button is displayed in Profile section");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.assertMoreBtn);
        QXClient.get().report().info("Clicked on More button");

        //QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.clkOnOngoingCourse),"ongoing course is not displayed");
        QXClient.get().report().info("Ongoing course is displayed Post clicking More button");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyNoCoursesInMylearnigSection()  throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        //QXClient.get().gestures().scrollToMobileElement(coursePageObjects.viewMore,"4");
        //QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.viewMore);
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.ongoingCourse));
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyErrorMessageInSubmitDetails() throws Exception {
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.clkSubmitDetails),"clkSubmitDetails is not available");
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitDetails);
        QXClient.get().report().info("Clicked on Submit Details in Profile Tab");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertMandatoryFieldInSubmitdetails),"Mandatory field is not displayed");
        QXClient.get().report().info("Mandatory field is displayed after clicking the submit details");

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkPersonaDropDown);
        QXClient.get().report().info("Clicked on clkPersonaDropDown in Submit Details");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.SelectPersonaDropDown);
        QXClient.get().report().info("selected PersonaDropDown in Submit Details");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.TeacherSubmit);
        QXClient.get().report().info("clicked Submit Details");

        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.selectMobileNoEditField);
        QXClient.get().report().info("Clicked on Mobile Number edit field");
        coursePageObjects.selectMobileNoEditField.sendKeys("959142");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertInvalidMobileNoErrorMsg),"Invalid Mobile number message is not displayed");
        QXClient.get().report().info("Invalid Mobile number message is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.selectEmailEditField);
        coursePageObjects.selectEmailEditField.clear();
        QXClient.get().gestures().BlindWait(3000);

        coursePageObjects.selectEmailEditField.sendKeys("stagyopmail");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertInvalidEmailErrorMsg),"Invalid Email address error message is not displayed");
        QXClient.get().report().info("Invalid Emaild Address error message is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }


    public void verifyMandatoryTCFieldAndUserNotAbleSubmitDetailsWithoutSelectingTCCheckbox() throws Exception {
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.clkSubmitDetails),"clkSubmitDetails is not available");
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitDetails);
        QXClient.get().report().info("Clicked on Submit Details in Profile Tab");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertMandatoryFieldInSubmitdetails),"Mandatory field is not displayed");
        QXClient.get().report().info("Mandatory field is displayed after clicking the submit details");

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkPersonaDropDown);
        QXClient.get().report().info("Clicked on clkPersonaDropDown in Submit Details");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.SelectPersonaDropDown);
        QXClient.get().report().info("selected PersonaDropDown in Submit Details");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.TeacherSubmit);
        QXClient.get().report().info("clicked Submit Details");

        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyMobielNumberLabel),"verifyMobielNumberLabel is not available");
        QXClient.get().report().info("MobileNumber Label is displayed in submit forms");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyAddressLabel),"verifyAddressLabel is not available");
        QXClient.get().report().info("Address Label is displayed in submit forms");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.termsCheckBoxTeacherForm),"termsCheckBoxTeacherForm is not available");
        QXClient.get().report().info("TermsAndCondition CheckBox Label is displayed in submit forms");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyAgreePrivacyPolicyText),"verifyAgreePrivacyPolicyText is not available");
        QXClient.get().report().info("AgreePrivacyPolicy Label is displayed in submit forms");

        
        try
        {
        	
      
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkOnSubmitBtn);
        QXClient.get().report().info("Clicked on Submit button without selecting TC Checkbox");
    }
    catch(Exception e)
    {
    System.out.println("handled");
    }
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertUpdateBtn),"Update button is displayed");
        QXClient.get().report().info("Update button is not displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyMobielNumberLabel),"verifyMobielNumberLabel is not available");
        QXClient.get().report().info("MobileNumber Label is displayed in submit forms");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyAddressLabel),"verifyAddressLabel is not available");
        QXClient.get().report().info("Address Label is displayed in submit forms");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void validateSubmitDetailsTextReplacesIamATeacherText() throws Exception {
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertIAmATeacherText),"I am a Teacher text is displayed in Profile");
        QXClient.get().report().info("I am a Teacher text is not replaced by Submit details in Green color");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.clkSubmitDetails),"I am a Teacher text is not replaced by Submit details text in green color");
        QXClient.get().report().info("I am a Teacher text is replaced by Submit details text in Green color");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void validateMyDetailsTextReplacesSelfDeclaredInfoText() throws Exception {
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();

//        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertSelfDeclaredInfoText),"Self Declared Info text is displayed in Profile page");
//        QXClient.get().report().info("Self Declared Info text is replaced by My Details Text");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertMyDetailsText),"Self Declared Info text is displayed in Profile page");
        QXClient.get().report().info("My Details text is replaces the Self Declared Info text in Profile Page");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyEmailIdPrefilledInUserDeclarationForm() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertPrefilledEmailAddressInDeclarationForm),"Prefilled email id is not displayed in user declaration form");
        QXClient.get().report().info("Email Id prefilled in the user declaration form");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertEmailVerifiedImage),"Email verified image is not displayed");
        QXClient.get().report().info("Email id verified image displayed in user declaration form");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyNewPricacyPolicyInSubmitDetailsForm() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.termsCheckBoxTeacherForm),"termsCheckBoxTeacherForm is not available");
        QXClient.get().report().info("TermsAndCondition CheckBox Label is displayed in submit forms");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyAgreePrivacyPolicyText),"verifyAgreePrivacyPolicyText is not available");
        QXClient.get().report().info("AgreePrivacyPolicy Label is displayed in submit forms");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertNewPrivacyPolicy),"New Privacy policy is not displayed");
        QXClient.get().report().info("New Privacy policy is displayed in submit details form");

        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.assertNewPrivacyPolicy);
        QXClient.get().report().info("Clicked on new privacy policy ");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertTermsOfUse),"Terms of use is not displayed");
        QXClient.get().report().info("Terms of use is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertPrivacyPolicy),"Privacy policy is not displayed");
        QXClient.get().report().info("Privacy policy is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertContentPolicy),"Contnet policy is not displayed");
        QXClient.get().report().info("Content policy is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.assertPrivacyPolicy);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.assertPrivacyPolicy);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertPrivacyPolicyOfDiksha),"New Privacy policy of diksha is not displayed");
        QXClient.get().report().info("New Privacy policy of Diksha is displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.disabledSubmitBtn),"Disabled submit button is not displayed");
        QXClient.get().report().info("Disbaled submit button is displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.termsCheckBoxTeacherForm);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.enabledSubmitBtn),"Enabled submit button is not displayed");
        QXClient.get().report().info("Enabled submit btn is dispalyed");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void userAbleToSubmitDetailsWithoutAddingPhoneNumber() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.termsCheckBox);
        QXClient.get().report().info("Clicked on Checkbox");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkOnSubmitBtn);
        QXClient.get().report().info("Clicked on submit button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertThankyouForSubmittingDetails),"Thank you for submitting your details message is not displayed");
        QXClient.get().report().info("Thank you for submitting your details message is displayed post clicking submit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().swipeUp();
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.clkSubmitDetails),"Submit details button is displayed to the user ");
        QXClient.get().report().info("Submit details button is not displayed to the user post submitting the details");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertUpdateBtn),"Update button is not displayed");
        QXClient.get().report().info("Update button is displayed to the user in profile page");
        QXClient.get().gestures().BlindWait(2000);
    }
    public void VerifySubmitDetailsFormInProfile() throws Exception {
    	
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();
        //QXClient.get().gestures().swipeUp();

      Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.clkSubmitDetails),"clkSubmitDetails is not available");
      QXClient.get().gestures().BlindWait(1000);
    }
    
    public void verifysubmitdetailsbuttonProfilepage() throws Exception {
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();
        //QXClient.get().gestures().swipeUp();

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertsubmitdetailsLabel),"Submit details button is not displayed to the user ");
        QXClient.get().report().info("submit details Label is not displayed for profile tab");
    }
        public void verifysubmitdetailsbuttonandconsentpopupshouldnotdisplayedonProfilepage() throws Exception {

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertconsentpoppup), "Consent popup  is not displayed for minor User ");
        QXClient.get().report().info("consent popup  is not displayed for minor User");
        QXClient.get().gestures().BlindWait(2000);
     }

        public void verifymobileIdPrefilledInUserDeclarationForm() throws Exception {
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertPrefilledMobileidAddressInDeclarationForm),"Prefilled mobile id is not displayed in user declaration form");
            QXClient.get().report().info("mobile Id prefilled in the user declaration form");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertmobileVerifiedImage),"mobile id verified image is not displayed");
            QXClient.get().report().info("mobile id verified image displayed in user declaration form");
            QXClient.get().gestures().BlindWait(3000);
        }
        
        
        public void ValidateUpdatedClassAndMediumValuesInTheLibraryTabByClickingBackButton() throws Exception {
            QXClient.get().gestures().scrollToMobileElement(coursePageObjects.clikEditProfile, "1");


            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clikEditProfile);
            QXClient.get().report().info("Tap on clikEditProfile Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkBoardDropDown);
            QXClient.get().report().info("Tap on clkBoardDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltBoard.get(3));
            QXClient.get().report().info("select Andra");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
            QXClient.get().report().info("Tap on Submit Button");
            QXClient.get().gestures().BlindWait(3000);


            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkMediumDropDown.get(1));
            QXClient.get().report().info("Tap on clkMediumDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltMediumVal);
            QXClient.get().report().info("select English");
            QXClient.get().gestures().BlindWait(2000);


            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
            QXClient.get().report().info("Tap on Submit Button");
            QXClient.get().gestures().BlindWait(3000);


            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkClassDropDown);
            QXClient.get().report().info("Tap on clkClassDropDown Option");

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltClassVal.get(1));
            QXClient.get().report().info("select Class 2");

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
            QXClient.get().report().info("Tap on Submit Button");
            QXClient.get().gestures().BlindWait(3000);
          //  QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.BackBtn);


        }

        public void verifyUserIsAbleToUpdateClassAndMediumValuesInTheProfile() throws Exception {
            //        QXClient.get().gestures().scrollUpToMobileElement(coursePageObjects.clikEditProfile,"3");
//            QXClient.get().gestures().BlindWait(3000);
    //
            QXClient.get().gestures().scrollToMobileElement(coursePageObjects.clikEditProfile, "1");


            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clikEditProfile);
            QXClient.get().report().info("Tap on clikEditProfile Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkBoardDropDown);
            QXClient.get().report().info("Tap on clkBoardDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltBoard.get(3));
            QXClient.get().report().info("select Andra");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
            QXClient.get().report().info("Tap on Submit Button");
            QXClient.get().gestures().BlindWait(3000);


            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkMediumDropDown.get(1));
            QXClient.get().report().info("Tap on clkMediumDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltMediumVal);
            QXClient.get().report().info("select English");
            QXClient.get().gestures().BlindWait(2000);


            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
            QXClient.get().report().info("Tap on Submit Button");
            QXClient.get().gestures().BlindWait(3000);


            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkClassDropDown);
            QXClient.get().report().info("Tap on clkClassDropDown Option");

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltClassVal.get(0));
            QXClient.get().report().info("select Class 1");

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
            QXClient.get().report().info("Tap on Submit Button");
            QXClient.get().gestures().BlindWait(3000);

//            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubjectDropDown);
//            QXClient.get().report().info("Tap on clkSubjectDropDown Option");
    //
//            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltsubjectVal);
//            QXClient.get().report().info("Select Subject");
    //
//            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
//            QXClient.get().report().info("Tap on Submit Button");

            QXClient.get().gestures().BlindWait(3000);
            // QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSaveProfile);
            coursePageObjects.clkSaveProfile.click();
            QXClient.get().report().info("Tap on Save Button");
            QXClient.get().gestures().BlindWait(4000);
            QXClient.get().gestures().swipeDown();

        }

        public void VerifyUpdatedClassandMediumValuesLibrarytab() throws Exception {
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkMedium);
            QXClient.get().report().info("Verify Medium");
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkClasses);
            QXClient.get().report().info("Verify Classes");

        }
        public void verifylearnerpassbook2() throws Exception {


            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().BlindWait(5000);

            // Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.myLearningtext)),"My learning content is not visisble");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertlearnerpassbook),"Learner Passbook is displayed in Profile page");
            QXClient.get().report().info("Learner passbook in Profile Page");
            QXClient.get().gestures().BlindWait(5000);
        }

        public void verifylearnerpassbookcourse() throws Exception {
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertcoursename),"Course name is displayed in Profile page");
            QXClient.get().report().info("Learner passbook in Profile Page");
            QXClient.get().gestures().BlindWait(5000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertcoursedate),"Course date is displayed in Profile page");
            QXClient.get().report().info("Learner passbook in Profile Page");
            QXClient.get().gestures().BlindWait(5000);
            // Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.completeCourse)), "Course still in ongoing");
        }
        public void verifydownloadcertificate() throws Exception {
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.vieweyecertificate);
            QXClient.get().gestures().BlindWait(5000);
            try
            {
                QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.allowbutton);
                QXClient.get().gestures().BlindWait(5000);
                QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.allowdevice);
                QXClient.get().gestures().BlindWait(5000);
                }

            catch(Exception e)
            {
                System.out.println("Exception Handled");
            }
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertcoursename),"Course name is displayed in Profile page");
            QXClient.get().report().info("Learner passbook in Profile Page");
            QXClient.get().gestures().BlindWait(5000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.downloadcoursecertificate);
            QXClient.get().gestures().BlindWait(5000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.certificatePDF);
            QXClient.get().gestures().BlindWait(9000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clickback);
            QXClient.get().gestures().BlindWait(5000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.downloadcoursecertificate);
            QXClient.get().gestures().BlindWait(5000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.certificatePNG);
            QXClient.get().gestures().BlindWait(9000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clickback);
            QXClient.get().gestures().BlindWait(5000);

            // Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.completeCourse)), "Course still in ongoing");
        }
        public void tapOnAddedUser() throws Exception {
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkOnAddedUser1);
            QXClient.get().report().info("Click On Added User");
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.changeUser);
            QXClient.get().report().info("Click On change user button");
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.termsCheckBox);
            QXClient.get().report().info("Click On checkbox for terms and condition");
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.continueChangeUser);
            QXClient.get().gestures().BlindWait(2000);

        }
        
        public void tapOnAddUserBtn2() throws Exception {
            QXClient.get().gestures().BlindWait(3000);
           coursePageObjects.EnterNameField.sendKeys("ab");
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.addUserBtn);
            QXClient.get().gestures().BlindWait(2000);
        }
        public void tapOnAddedUser2() throws Exception {
            QXClient.get().gestures().BlindWait(2000);
           // QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkOnAddedUser2);
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.changeUser);
            QXClient.get().report().info("Click On change user button");
            QXClient.get().gestures().BlindWait(7000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.termsCheckBox);
            QXClient.get().report().info("Click On checkbox for terms and condition");
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.continueChangeUser);
            QXClient.get().gestures().BlindWait(2000);

        }
        
        public void  ValidateLocationfieldsinProfilePAge() throws Exception {
            QXClient.get().gestures().scrollToMobileElement(coursePageObjects.clikEditProfile, "1");

            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clikLocationEditProfile);
            QXClient.get().report().info("Tap on clikEditProfile Option");
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkclearBtninLoc);
            QXClient.get().report().info("Clicked on Clear button");
            QXClient.get().gestures().BlindWait(5000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkStateDropDown);
            QXClient.get().report().info("Tap on clkStateDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltStateLoc);
            QXClient.get().report().info("select Andra");
            QXClient.get().gestures().BlindWait(5000);
            coursePageObjects.clkSubmitProfile.click();
//            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
//            QXClient.get().report().info("Tap on Submit Button");
//            QXClient.get().gestures().BlindWait(3000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.selectSubrole), "verify Subrole is not available");

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkDistrictDropDown);
            QXClient.get().report().info("Tap on clkDistrictDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltDistrict);
            QXClient.get().report().info("select Ananthapuram");
            QXClient.get().gestures().BlindWait(2000);
            coursePageObjects.clkSubmitProfile.click();

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkBlockDropDown);
            QXClient.get().report().info("Tap on clkBlockDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltBlock);
            QXClient.get().report().info("select Block");
            QXClient.get().gestures().BlindWait(2000);
            coursePageObjects.clkSubmitProfile.click();
//            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSubmitProfile);
//            QXClient.get().report().info("Tap on Submit Button");
//            QXClient.get().gestures().BlindWait(5000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkClusterDropDown);
            QXClient.get().report().info("Tap on clkBlockDropDown Option");
            QXClient.get().gestures().BlindWait(5000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltCluster);
            QXClient.get().report().info("select Cluster");
            QXClient.get().gestures().BlindWait(2000);
            coursePageObjects.clkSubmitProfile.click();
            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkSchoolDropDown);
            QXClient.get().report().info("Tap on clkBlockDropDown Option");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltSchool);
            QXClient.get().report().info("select School");
            QXClient.get().gestures().BlindWait(2000);
            coursePageObjects.clkSubmitProfile.click();
            QXClient.get().report().info("submitted");
            QXClient.get().gestures().BlindWait(5000);
            coursePageObjects.clkSubmitProfile.click();
        }

      public void ValidateUpdatedLocationfieldsinProfilePage() throws Exception {
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyRole),"verifyRole is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyState),"verifyStatet is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifySubrole),"verifySubrole is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyDistrict),"verifyDistrict is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyBlock),"verifyBlock is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyCluster),"verifyCluster is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifySchool),"verifySchool is not available");
            QXClient.get().report().info("Verified Profile Update");
        }
      public void clkonconsentpopup1() throws Exception {
    	    Thread.sleep(9000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkOnConsentCourse);
    	    QXClient.get().gestures().BlindWait(9000);
    	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.assertsharemessage),"I consent to share my details with the administrators");
    	    QXClient.get().report().info("I consent not to share my details with the administrators");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.donotsharebuton);
    	    QXClient.get().gestures().BlindWait(9000);
    	}


      public void taponcourseselectionbatchnew() throws Exception {
          QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.coursetitleselectionbatch2);
          QXClient.get().gestures().BlindWait(5000);
//          Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertbatchselection), "Batch selection popup is displayed");
//          QXClient.get().report().info("Batch selection popup  is  displayed in the searched course");
//          QXClient.get().gestures().BlindWait(5000);
          QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkJoinBtn);
          QXClient.get().gestures().BlindWait(5000);
          QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.donotsharebuton);
          QXClient.get().gestures().BlindWait(5000);
          Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertcourseexpire), "You have joined the batch of a course that is completed");
          QXClient.get().report().info("You have joined the batch of a course that is completed");
          QXClient.get().gestures().BlindWait(5000);
      }
      
      public void taponcourseandverifybatch() throws Exception {
          QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.coursetitleselectionbatch2);
          QXClient.get().report().info("Clicking on course");
          QXClient.get().gestures().BlindWait(5000);
//          Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertExpiredBatches),"Expired batches is displayed");
//          QXClient.get().report().info("Expired batches is not displayed");
//          Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertOpenBatches),"Open batches is displayed");
//          QXClient.get().report().info("Open bathces is not displayed");
//          QXClient.get().gestures().BlindWait(2000);
          Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertcourseprogressresume1), "You may continue the course, but your progress will not be updated\n");
          QXClient.get().report().info("You may not continue the course, but your progress will not be updated\n");
          QXClient.get().gestures().BlindWait(7000);
      }
      
      public void taponcourseandleavenew() throws Exception {
    	    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertcoursemsg), "You can rejoin an active or upcoming batch later\n");
    	    QXClient.get().report().info("You cannot rejoin an active or upcoming batch later\n");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.BackBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clearmsg);
    	    QXClient.get().gestures().BlindWait(5000);
    	}
      
      public void taponresumecourseselectionbatchnew() throws Exception {
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.coursetitleselection);
    	    QXClient.get().gestures().BlindWait(9000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.batchselectionresume);
    	    QXClient.get().gestures().BlindWait(9000);
    	    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertcourseprogressresume), "You have joined the batch of a course that is completed on 06/07/2023\n");
    	    QXClient.get().report().info("You have not joined the batch of a course that is completed on 06/07/2023\n");
    	    QXClient.get().gestures().BlindWait(7000);
    	    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertcourseprogressresume1), "You may continue the course, but your progress will not be updated\n");
    	    QXClient.get().report().info("You may not continue the course, but your progress will not be updated\n");
    	    QXClient.get().gestures().BlindWait(7000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.courseunit2);
    	    QXClient.get().report().info("Clicking on course unit");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.courseprogress);
    	    QXClient.get().report().info("Tracking course progress");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.courseunit2content);
    	    QXClient.get().report().info("Clicking on course unit content");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.playIcon);
    	    QXClient.get().report().info("Clicking on play");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.ClickOnNextBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.ClickOnNextBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.ClickOnNextBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.exitButton);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.closeRatingIcon);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.BackBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.courseprogress);
    	    QXClient.get().report().info("Tracking course progress");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.BackBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.courseunit2);
    	    QXClient.get().report().info("Clicking on course unit");
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.BackBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.BackBtn);
    	    QXClient.get().gestures().BlindWait(5000);
    	    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(coursePageObjects.assertcourseprogressresume1), "You may continue the course, but your progress will not be updated\n");
    	    QXClient.get().report().info("You may not continue the course, but your progress will not be updated\n");
    	    QXClient.get().gestures().BlindWait(5000);
    	}

      
    }

    
