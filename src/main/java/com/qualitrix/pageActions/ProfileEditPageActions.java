package com.qualitrix.pageActions;


import cucumber.api.java.cs.A;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.CoursePageObjects;
import com.qualitrix.pageObjects.ProfileEditPageObjects;
import com.qualitrix.pageObjects.ProfilePageObjects;

import java.io.IOException;
import java.util.Properties;

/**
 * This Class has all the methods related to Profile Page.
 *
 * @author : Gurukiran H N
 * @since : 20/March/2020
 */
public class ProfileEditPageActions  {

   
    ProfileEditPageObjects profileEditPageObjectsPageObjects = new ProfileEditPageObjects();
    LoginPageActions loginPageActions = new LoginPageActions();
    CoursePageObjects coursePageObjects=new CoursePageObjects();
    ProfilePageObjects profilepageobj=new ProfilePageObjects();

    
    public ProfileEditPageActions() {
        //    this.driver = ContextManager.getDriver();

           PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
            PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), profileEditPageObjectsPageObjects);
            PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), coursePageObjects);
            PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), profilepageobj);


        }
        
        
    
   
    public void tapOnEditBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.editBtn);
        QXClient.get().report().info("Tap on edit button");
    }

    public void tapOnEditSecondBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.editSecondBtn);
        QXClient.get().report().info("Tap on edit second button");
    }

    public void editName(String name) {
    	QXClient.get().gestures().waitForElementToAppear(profileEditPageObjectsPageObjects.editName);
        profileEditPageObjectsPageObjects.editName.sendKeys(name);
    }

    public void verifyEditedNameStateDistrict(String name) throws IOException, Exception {
    	QXClient.get().gestures().wait(15);
        Assert.assertTrue(QXClient.get().gestures().generateTextXpathIsElementPresent(name), "The name successfully got edited");
        
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
  			  properties.getProperty("excelpath"));
  			  
  			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
  			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
  			  
  			  String stateName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",10,2); 
  			  String distName =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",9,2);

        Assert.assertTrue(QXClient.get().gestures().generateTextXpathIsElementPresent(stateName), "The state successfully got edited");
        Assert.assertTrue(QXClient.get().gestures().generateTextXpathIsElementPresent(distName), "The district successfully got edited");
        QXClient.get().report().info("Verifying edited name, state and district");
    }

    public void verifyEditedBoardMediumClassSubject() throws IOException {
    	Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
    			  properties.getProperty("excelpath"));
    			  
    			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
    			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
    			  
    			  String stateBoard =QXClient.get().excelUtils().getCellValue("Excel1","TestData",11,2); 
    			  String Medium =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",12,2);
    			  String classes =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",13,2);
    			  String EngSub =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",15,2);

        Assert.assertTrue(QXClient.get().gestures().generateTextXpathIsElementPresent(stateBoard), "The board successfully got edited");
        Assert.assertTrue(QXClient.get().gestures().generateTextXpathIsElementPresent(Medium), "The medium successfully got edited");
        Assert.assertTrue(QXClient.get().gestures().generateTextXpathIsElementPresent(classes), "The class successfully got edited");
        Assert.assertTrue(QXClient.get().gestures().generateTextXpathIsElementPresent(EngSub), "The subject successfully got edited");
        QXClient.get().report().info("Verifying edited board, medium, class and subject");
    }

    public void tapOnStateDropDownAndSelectState() {
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.stateDropDown);
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.selectState);
        QXClient.get().report().info("Tap on state dropdown and select state");
    }

    public void tapOnDistrictDropDownAndSelectDst() {
        //QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.distDropDown);
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.selectDist);
        QXClient.get().report().info("Tap on district dropdown and select district");
    }

	/*
	 * public void tapOnBoardAndSelectBoard() throws Exception {
	 * QXClient.get().gestures().waitAndClickElementisVisible(
	 * profileEditPageObjectsPageObjects.selectBoard);
	 * boardMediumClassSelectionPageActions.selectStateBoard();
	 * boardMediumClassSelectionPageActions.tapOnSubmitBtn();
	 * QXClient.get().report().info("Tap on board dropdown and select board"); }
	 * 
	 * public void tapOnMediumAndSelectMedium() throws Exception {
	 * QXClient.get().gestures().waitAndClickElementisVisible(
	 * profileEditPageObjectsPageObjects.selectMedium);
	 * boardMediumClassSelectionPageActions.selectEnglishMedium();
	 * boardMediumClassSelectionPageActions.tapOnSubmitBtn();
	 * QXClient.get().report().info("Tap on medium dropdown and select medium"); }
	 * 
	 * public void tapOnClassAndSelectClass() throws Exception {
	 * QXClient.get().gestures().waitAndClickElementisVisible(
	 * profileEditPageObjectsPageObjects.selectClass);
	 * boardMediumClassSelectionPageActions.selectClassOne();
	 * boardMediumClassSelectionPageActions.tapOnSubmitBtn();
	 * QXClient.get().report().info("Tap on class dropdown and select class"); }
	 * 
	 * public void tapOnSubjectsAndSelectSubject() throws Exception {
	 * QXClient.get().gestures().waitAndClickElementisVisible(
	 * profileEditPageObjectsPageObjects.selectSubjects);
	 * QXClient.get().gestures().waitAndClickElementisVisible(
	 * profileEditPageObjectsPageObjects.selectSubject);
	 * boardMediumClassSelectionPageActions.tapOnSubmitBtn();
	 * QXClient.get().report().info("Tap on subject dropdown and select subject"); }
	 */
    public void tapOnSaveBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.saveBtn);
        QXClient.get().report().info("Tap on save button");
    }

    public void editEmailAddress(String name) {
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.editEmailBtn);
        profileEditPageObjectsPageObjects.editName.sendKeys(name);
        QXClient.get().report().info("Edit email address");
    }

    public void loginIfRecoveryIdIsNotPresent() throws Exception {
        if(!QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.recoveryId)) {
        	Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
      			  properties.getProperty("excelpath"));
      			  
      			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
      			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
      			  
      			 String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
   			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
        	
            loginPageActions.loginToTheUser(Username,Password);
        }
    }

    public void editRecoveryId(String num) throws IOException, Exception {
    	
    	QXClient.get().gestures().BlindWait(3000);
     //	QXClient.get().gestures().scrollToMobileElement(profileEditPageObjectsPageObjects.editRecoveryId,"2");
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

    	
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.editRecoveryId);
       // profileEditPageObjectsPageObjects.emailInsideRecovery.click();
                profileEditPageObjectsPageObjects.editName.click();
            	QXClient.get().gestures().BlindWait(2000);
        profileEditPageObjectsPageObjects.editName.sendKeys(num);
    	QXClient.get().gestures().BlindWait(2000);
        profileEditPageObjectsPageObjects.submitBtn.click();
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties");
        System.out.println("@name:" +properties.getProperty("excelpath"));
    			  
    			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
    			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
    			    
    			 String editedRecoveryID =QXClient.get().excelUtils().getCellValue("Excel1","TestData",24,2); 
        
    			 Thread.sleep(4000);
    		     //	QXClient.get().gestures().scrollToMobileElement(profileEditPageObjectsPageObjects.editRecoveryId,"2");

      //  Assert.assertTrue(QXClient.get().gestures().getText(profileEditPageObjectsPageObjects.editedRecoveryId).equalsIgnoreCase(editedRecoveryID),"Recovery id updated successfully");
    			    Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.editedRecoveryId),"Recovery id not updated successfully");
   
    			 QXClient.get().report().info("Recovery account updated successfully");
    }
    public void chaneStateAndDistrict() throws Exception {
    	
        

    	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);
        
    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
        QXClient.get().report().info("Tap on clkStateLoc Option");
        QXClient.get().gestures().BlindWait(2000);
        
    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
      QXClient.get().report().info("select Andra");

      QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkDistrictLoc);
      QXClient.get().report().info("Tap on clkDistrictLoc Option");
      QXClient.get().gestures().BlindWait(2000);
      
  	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.sltDistrictLoc);
    QXClient.get().report().info("select sltDistrictLoc");

      
  	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.submitLoc);
    QXClient.get().report().info("Tap on submitLoc Button");
    QXClient.get().gestures().BlindWait(3000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyDistrictAfterUpdate),"verifyDistrictAfterUpdate is not available");
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(coursePageObjects.verifyStateAfterUpdate),"verifyStateAfterUpdate is not available");

 }
    
    public void changeRoleAndValidateHeadTeachersAndOfficials() throws Exception {
              
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(3000);
        
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
       QXClient.get().report().info("Tap on clkRoleDropdown Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltHeadTeachersAndOfficials);
       QXClient.get().report().info("Tap on sltHeadTeachersAndOfficials Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
       QXClient.get().report().info("Tap on clkSubmit Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkStateDropdown);
       QXClient.get().report().info("Tap on clkStateDropdown Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltStateLoc);
       QXClient.get().report().info("Tap on sltStateLoc Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
       QXClient.get().report().info("Tap on clkSubmit Option");
        QXClient.get().gestures().BlindWait(5000);
       
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubRoleDropdown);
       QXClient.get().report().info("Tap on clkSubRoleDropdown Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltSubRoleDropdown);
       QXClient.get().report().info("Tap on sltSubRoleDropdown Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
       QXClient.get().report().info("Tap on clkSubmit Option");
        QXClient.get().gestures().BlindWait(5000);
        
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkDistrictLoc1);
       QXClient.get().report().info("Tap on clkDistrictLoc Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltDistrictLoc);
       QXClient.get().report().info("Tap on sltDistrictLoc Option");
        QXClient.get().gestures().BlindWait(2000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
       QXClient.get().report().info("Tap on clkSubmit Option");
        QXClient.get().gestures().BlindWait(3000);
       
       QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmitEditProfile);
       QXClient.get().report().info("Tap on clkSubmitEditProfile Option");
        
       QXClient.get().gestures().BlindWait(3000);

    }
    
 public void changeStudentRole() throws Exception {
    	        
   	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);
        
    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
        QXClient.get().report().info("Tap on clkStateLoc Option");
        QXClient.get().gestures().BlindWait(2000);
        
    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltStudent);
      QXClient.get().report().info("select Andra");
      
      QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
      QXClient.get().report().info("Tap on clkSubmit Option");
      
      QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmitEditProfile);
      QXClient.get().report().info("Tap on clkSubmitEditProfile Option");
       
      QXClient.get().gestures().BlindWait(3000);
      

   
 }
 
 public void changeParentRole() throws Exception {
     
	   	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
	        QXClient.get().report().info("Tap on clkEditForLocation Option");
	        QXClient.get().gestures().BlindWait(2000);
	        
	    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
	        QXClient.get().report().info("Tap on clkStateLoc Option");
	        QXClient.get().gestures().BlindWait(2000);
	        
	    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltParent);
	      QXClient.get().report().info("select sltParent");
	      
	      QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
	      QXClient.get().report().info("Tap on clkSubmit Option");
	      
	      QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmitEditProfile);
	      QXClient.get().report().info("Tap on clkSubmitEditProfile Option");
	       
	      QXClient.get().gestures().BlindWait(3000);
	      
	  
	 }
 public void changeTeacherRole() throws Exception {
     
	   	QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
	        QXClient.get().report().info("Tap on clkEditForLocation Option");
	        QXClient.get().gestures().BlindWait(2000);
	        
	    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
	        QXClient.get().report().info("Tap on clkStateLoc Option");
	        QXClient.get().gestures().BlindWait(2000);
	        
	    	QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltTeacher);
	      QXClient.get().report().info("select sltTeacher");
	      
	      QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
	      QXClient.get().report().info("Tap on clkSubmit Option");
	      
	      QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmitEditProfile);
	      QXClient.get().report().info("Tap on clkSubmitEditProfile Option");
	       
	      QXClient.get().gestures().BlindWait(3000);
	      
	    }
 
 public void verifyLabelOnBoarding() throws Exception {
     
     Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertDiscoverContentLabel), "assertDiscoverContentLabel is not displayed");
	        QXClient.get().report().info("Tap on assertDiscoverContentLabel");
	        QXClient.get().gestures().BlindWait(2000);
 }
 
 public void labelOnProfilePage() throws Exception {
     
     Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertContentPreferenceLabelProfile), "assertContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("Tap on assertContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
	              
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertRoleContentPreferenceLabelProfile), "assertRoleContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("verified assertRoleContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertBoardContentPreferenceLabelProfile), "assertBoardContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("verified assertBoardContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertMediumContentPreferenceLabelProfile), "assertMediumContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("verified assertMediumContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertClassContentPreferenceLabelProfile), "assertClassContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("verified assertClassContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertSubjectContentPreferenceLabelProfile), "assertSubjectContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("verified assertSubjectContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertDistrictContentPreferenceLabelProfile), "assertDistrictContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("verified assertDistrictContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertStateContentPreferenceLabelProfile), "assertStateContentPreferenceLabelProfile is not displayed");
	        QXClient.get().report().info("verified assertStateContentPreferenceLabelProfile");
	        QXClient.get().gestures().BlindWait(2000);
	        
		      QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkEditLocation);
		      QXClient.get().report().info("Tap on clkEditLocation");
		        QXClient.get().gestures().BlindWait(4000);

	        
	        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertChooseContentPreferenceLabelLocationEdit), "assertChooseContentPreferenceLabelLocationEdit is not displayed");
	        QXClient.get().report().info("verified assertChooseContentPreferenceLabelLocationEdit");
	        QXClient.get().gestures().BlindWait(2000);
	        
 }
 
 public void submitFormUpdate(String enterID) throws Exception {

	 QXClient.get().gestures().BlindWait(5000);
 QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkonprofilepageupdatebutton);
 QXClient.get().report().info("Tap on clkonprofilepageupdatebutton");
   QXClient.get().gestures().BlindWait(5000);
   QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.enteridasrequestedbyyourStateBoardOrg);
   QXClient.get().report().info("Tap on enter id as requested by your State Board or Org");
   QXClient.get().gestures().BlindWait(2000);
   profilepageobj.enteridasrequestedbyyourStateBoardOrg.sendKeys(enterID);
   QXClient.get().gestures().BlindWait(5000);
   QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkonprofilepageupdatebutton);
   QXClient.get().gestures().BlindWait(5000);
	 QXClient.get().gestures().swipeUp();
   String enteridvalue= QXClient.get().gestures().getText(profilepageobj.resulttextofyourid);
   Assert.assertEquals(enteridvalue, enterID);
 }

    public void errorMessageWhileEditRecoveryID(String num) throws  Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();


        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.editRecoveryId);
        profileEditPageObjectsPageObjects.editName.click();
        QXClient.get().gestures().BlindWait(2000);
        profileEditPageObjectsPageObjects.editName.sendKeys(num);
        QXClient.get().gestures().BlindWait(2000);
        profileEditPageObjectsPageObjects.submitBtn.click();
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertErrorMessageForSameRecoveryIDOfUser),"Error message is not displayed");
        QXClient.get().report().info("This email address is already linked to your profile message is displayed");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyEditAll5LocationFields() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
        QXClient.get().report().info("Tap on clkRoleDropdown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltTeacher);
        QXClient.get().report().info("Select Teacher Role");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltStateDropdown);
        QXClient.get().report().info("Tap on State dropdown");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltStateLoc);
        QXClient.get().report().info("Tap on Andhra Pradesh state in Location");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltDistrictDropdown);
        QXClient.get().report().info("Tap on District dropdown");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltDistrictLoc);
        QXClient.get().report().info("Tap on Chittoor district in Location");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltBlockDropdown);
        QXClient.get().report().info("Tap on Block dropdown");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltFirstTextInDropdown);
        QXClient.get().report().info("select first block in dropdown");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltClusterDropdown);
        QXClient.get().report().info("Tap on Cluster dropdown");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltFirstTextInDropdown);
        QXClient.get().report().info("select first Cluster in dropdown");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(3000);

        if (QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.sltSchoolDropdown)) {
            QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltSchoolDropdown);
            QXClient.get().report().info("Tap on School dropdown");

            QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltFirstTextInDropdown);
            QXClient.get().report().info("select first School in dropdown");

            QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
            QXClient.get().report().info("Click on Submit button");
            QXClient.get().gestures().BlindWait(3000);
        }
        else{
            QXClient.get().report().info("Cluster is not present");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmitEditProfile);
        QXClient.get().report().info("clicked on submit edit profile");
        QXClient.get().gestures().BlindWait(5000);

    }

    public void verifyProfileAfterEditing() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertRoleInProfile),"Role is not displayed in Profile after editing");
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertBlockInProfile),"Block is not displayed in Profile after editing");
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertSchoolInProfile),"School is not displayed in Profile after editing");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertDistrictInProfile),"District is not displayed in Profile after editing");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertStateInProfile),"State is not displayed in Profile after editing");

    }

    public void recheckLocationDetailsEditableInProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
        QXClient.get().report().info("Tap on clkRoleDropdown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltTeacher);
        QXClient.get().report().info("Select Teacher Role");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(2000);

       /* QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltStateDropdown);
        QXClient.get().report().info("Tap on State dropdown");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltStateLoc);
        QXClient.get().report().info("Tap on Andhra Pradesh state in Location");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltDistrictDropdown);
        QXClient.get().report().info("Tap on District dropdown");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltDistrictLoc);
        QXClient.get().report().info("Tap on Chittoor district in Location");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Click on Submit button");
        QXClient.get().gestures().BlindWait(2000);
*/
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmitEditProfile);
        QXClient.get().report().info("clicked on submit edit profile");
        QXClient.get().gestures().BlindWait(5000);

    }

    public void recheckProfileAfterEditing() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertRoleInProfile),"Role is not displayed in Profile after editing");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertBlockInProfile),"Block is displayed in Profile after editing");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertSchoolInProfile),"School is displayed in Profile after editing");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertDistrictInProfile),"District is not displayed in Profile after editing");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertStateInProfile),"State is not displayed in Profile after editing");

    }

    public void verifyMandatorySubpersona() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkRoleDropdown);
        QXClient.get().report().info("Tap on clkRoleDropdown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltHeadTeachersAndOfficials);
        QXClient.get().report().info("Select Head Teacher role");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.clkSubpersonaInProfile),"Mandatory Subpersona is not displayed for Head Teacher Role");
        QXClient.get().report().info("Mandatory Subpersona is displayed for Head Teacher and Officials Role");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);


        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.clkSubpersonaInProfile),"Mandatory subpersona is displayed for Teacher role");
        QXClient.get().report().info("Mandatory Subpersona is not displayed for Teacher/Student Role");
        QXClient.get().gestures().BlindWait(2000);



    }

    public void changeSubRoleAndLandsOnHomePage() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubRoleDropdown);
        QXClient.get().report().info("Tap on clkSubRoleDropdown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltSubRoleDropdown1);
        QXClient.get().report().info("Tap on sltSubRoleDropdown Option");

        /*QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubRoleDropdown);
        QXClient.get().report().info("Tap on clkSubRoleDropdown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltSubRoleDropdown1);
        QXClient.get().report().info("Tap on sltSubRoleDropdown Option");*/

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Tap on clkSubmit Option");
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmitEditProfile);
        QXClient.get().report().info("Tap on clkSubmitEditProfile Option");

        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertWelcomeTextOnHomePage),"Welcome text is not displayed");
        QXClient.get().report().info("After changing the subrole landed on Home page and welcome text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertLearnManageActHeaderInHomePage),"Learn manage act header is not displayed");
        QXClient.get().report().info("After changing the subrole landed on Home page and welcome text is displayed");
    }

    public void validateChooseContentPreferenceLabelInLocation() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnLocationEditImage);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertChooseContentPreferenceLabelLocationEdit),"Choose content preferences label is not displayed in Location");
        QXClient.get().report().info("Choose content preferences label is displayed in Edit Location details");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyGuestUserProfilePageLabels() throws Exception {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertContentPreferenceLabelProfile), "assertContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("Tap on assertContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertRoleContentPreferenceLabelProfile), "assertRoleContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("verified assertRoleContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertBoardContentPreferenceLabelProfile), "assertBoardContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("verified assertBoardContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertMediumContentPreferenceLabelProfile), "assertMediumContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("verified assertMediumContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertClassContentPreferenceLabelProfile), "assertClassContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("verified assertClassContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertSubjectContentPreferenceLabelProfile), "assertSubjectContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("verified assertSubjectContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertDistrictContentPreferenceLabelProfile), "assertDistrictContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("verified assertDistrictContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertStateContentPreferenceLabelProfile), "assertStateContentPreferenceLabelProfile is not displayed");
        QXClient.get().report().info("verified assertStateContentPreferenceLabelProfile");
        QXClient.get().gestures().BlindWait(2000);


        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.assertProfileDetailsLabel),"Profile details label is displayed for Guest User");
        QXClient.get().report().info("Profile details Label is displayed for Guest User");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.assertDeviceLocationLabel),"Device location label is displayed for Guest user");
        QXClient.get().report().info("Device location Label is displayed for Guest User");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyBoardInAlphabeticalOrder() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkEditBoard);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnBoard);
        QXClient.get().gestures().BlindWait(2000);

        String board1 = profilepageobj.RadioBtns.get(0).getText();
        QXClient.get().report().info("Board1 value is :"+ board1);

        String board2 = profilepageobj.RadioBtns.get(1).getText();
        QXClient.get().report().info("Board2 value is :"+ board2);

        String board3 = profilepageobj.RadioBtns.get(2).getText();
        QXClient.get().report().info("Board3 value is :"+ board3);

        String board4 = profilepageobj.RadioBtns.get(4).getText();
        QXClient.get().report().info("Board4 value is :"+ board4);

        char ch1[] = board1.toCharArray();
        int ascii1 = ch1[0];
        QXClient.get().report().info("ASCII value of Board1 : "+ ascii1);

        char ch2[] = board2.toCharArray();
        int ascii2 = ch2[0];
        QXClient.get().report().info("ASCII value of Board2 : "+ ascii2);

        char ch3[] = board3.toCharArray();
        int ascii3 = ch3[0];
        QXClient.get().report().info("ASCII value of Board3 : "+ ascii3);

        int ascii4 = ch3[7];
        QXClient.get().report().info("ASCII value of Board3 : "+ ascii4);

        char ch4[] = board4.toCharArray();
        int ascii5 = ch4[7];
        QXClient.get().report().info("ASCII value of Board4 : "+ ascii5);


        if(ascii1<ascii2){
            QXClient.get().report().info("Board values are showing in Alphabetical Order");

        }else{
            QXClient.get().report().info("Board values are not in Alphabetical order");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.clkEditBoard));

        }

        if(ascii2<ascii3){
            QXClient.get().report().info("Board values are showing in Alphabetical Order");

        }else{
            QXClient.get().report().info("Board values are not in Alphabetical order");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.clkEditBoard));
        }


        if(ascii4<ascii5){
            QXClient.get().report().info("Board values are showing in Alphabetical Order");

        }else{
            QXClient.get().report().info("Board values are not in Alphabetical order");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.clkEditBoard));
        }

    }

    public void verifyMCSValuesAfterOnboarding() throws  Exception {
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertTeacherRoleInProfile),"Teacher role is not displayed");
        QXClient.get().report().info("Teacher role is displayed in Profile");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertBoardInProfile),"Board is not displayed ");
        QXClient.get().report().info("Board is displayed in Profile");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertMediumInProfile),"Medium is not displayed");
        QXClient.get().report().info("Medium is displayed in Profile");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertClassInProfile),"Class is not displayed");
        QXClient.get().report().info("Class is displayed in Profile");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void editMCSvaluesOfProfileAndVerify() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkEditBoard);
        QXClient.get().report().info("Clicked on Edit Board");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnBoard);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selCBSEBoard);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnMedium);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selEnglish);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnClass);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selClass1);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubject);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selEnglish);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSaveBtn);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertCbseBoardInProfile),"Cbse board is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertMediumInProfile),"Medium is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertClass1InProfile),"Class 1 is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertMediumInProfile),"English subject is not displayed");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void changeTheMCSValues() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkEditBoard);
        QXClient.get().report().info("Clicked on Edit Board");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnBoard);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().scrollAndClick("State (Karnataka)");
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnMedium);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selEnglish);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnClass);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selClass4);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSaveBtn);
        QXClient.get().gestures().BlindWait(4000);

    }

    public void verifyUpdateConsentWithDifferentOrganization() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnUpdate);
        QXClient.get().report().info("Clicked on Update Button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnOrganizationField);
        QXClient.get().report().info("clicked on Org edit field");
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkStatePunjabOrg);
        QXClient.get().report().info("Clicked on State punjab org in consent ");
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnUpdate);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertConsentWithPunjabOrg),"Consent is not updated with new Organization");
        QXClient.get().report().info("Consent is updated with New Organization");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.assertConsentWithAndraOrg),"Consent is still in Old Organization");
        QXClient.get().report().info("Consent is updated with New Organization");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void updateWithOldConsentOrgAndVerify() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnUpdate);
        QXClient.get().report().info("Clicked on Update Button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnOrganizationField);
        QXClient.get().report().info("clicked on Org edit field");
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnAndraOrg);
        QXClient.get().report().info("Clicked on Andra Pradesh org in consent ");
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnUpdate);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.assertConsentWithPunjabOrg),"Consent is stild in  new Organization");
        QXClient.get().report().info("Consent is updated with Old Organization");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertConsentWithAndraOrg),"Consent is updated to  Old Organization");
        QXClient.get().report().info("Consent is updated with Old Organization");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyNoYOBpopupForAnyUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.assertYOBPopup),"Year of birth popup is displayed");
        QXClient.get().report().info("Year of birth popup is not displayed for Any user");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyBoardInProfileSectionAfterOnboarding() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertStateKarnatakBoard),"State karnatak board is not displayed");
        QXClient.get().report().info("State Karnataka board is displayed");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyDikshaIDAndUserInProfilePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertUserNameInProfile),"User name is not displayed");
        QXClient.get().report().info("Username is displayed in Profile");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertDikshaIDInProfile),"Diksha Id is not displayed in Profile");
        QXClient.get().report().info("Diksha ID is displayed in Profile");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkRefreshBtn);
        QXClient.get().report().info("Clicked on Refresh button in profile");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertUserNameInProfile),"Same User name is not displayed after refresh");
        QXClient.get().report().info("Same Username is displayed in Profile After refresh");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertDikshaIDInProfile),"Same Diksha Id is not displayed in Profile after refresh");
        QXClient.get().report().info("Same Diksha ID is displayed in Profile after refresh");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void validateTwoCharactersOfUsernameAndDikshaIDAreSameInProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        String username = profilepageobj.assertUserNameInProfile.getText();
       System.out.println(username);
        String dikshaID = profilepageobj.assertDikshaIDInProfile.getText();
        System.out.println(dikshaID);

        char ch1[]= username.toCharArray();
        char ch2[]=dikshaID.toCharArray();

        char userNameCh1 = ch1[0];
        char dikshaIDCh1 = ch2[0];
         char dikshaIDCh1ToUpperCase = Character.toUpperCase(dikshaIDCh1);

        System.out.println(userNameCh1);
        QXClient.get().report().info("First character of Username"+userNameCh1);
        System.out.println(dikshaIDCh1ToUpperCase);
        QXClient.get().report().info("First character of DikshaID"+dikshaIDCh1ToUpperCase);

        Assert.assertEquals(userNameCh1,dikshaIDCh1ToUpperCase);
        QXClient.get().report().info("First characters of Username and Diksha id in profile are same");

        char userNameCh2 = ch1[1];
        char dikshaIDCh2 = ch2[1];

        System.out.println(userNameCh2);
        QXClient.get().report().info("Second character of Username"+userNameCh2);
        System.out.println(dikshaIDCh2);
        QXClient.get().report().info("Second character of DikshaID"+dikshaIDCh2);

        Assert.assertEquals(userNameCh2,dikshaIDCh2);
        QXClient.get().report().info("Second characters of Username and Diksha id in profile are same");

    }

    public void verifyCertificateAndDownloadBtnInProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertLearnerPassbooksectionInProfile),"Learner passbook section is not displayed in Profile section");
        QXClient.get().report().info("Learner passbook section is displayed in Profile section");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertCertificateUnderLearnerPassbooksection),"Certificate under learner passbook is not displayed");
        QXClient.get().report().info("Certificate under Learner passbook section is displayed in Profile section");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.assertCertificateUnderLearnerPassbooksection);
        QXClient.get().report().info("Clicked on Certificate under Learner passbook section");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkAllowbtn);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkAllowbtn);
        QXClient.get().report().info("Clicked on Allow access");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertDownloadBtnPostClickingCertificate),"Download button is not displayed in certificate section");
        QXClient.get().report().info("Download button is displayed in Certificate section");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyNoLocationIsAssociatedToSubOrgForUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(coursePageObjects.clkEditForLocation);
        QXClient.get().report().info("Tap on clkEditForLocation Option");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkStateDropdown);
        QXClient.get().report().info("Tap on clkStateDropdown Option");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.sltStateLocForSubOrg);
        QXClient.get().report().info("Tap on sltStateLoc Option");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkSubmit);
        QXClient.get().report().info("Tap on clkSubmit Option");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkDistrictLoc);
        QXClient.get().report().info("Tap on clkDistrictLoc Option");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertSelectDistrictText),"Select District text is not displayed");
        QXClient.get().report().info("Select District text is displayed Post clicking District EditField");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertNoLocationForSubOrg),"Location is displayed for Suborg");
        QXClient.get().report().info("No Location is displayed for Sub Org for user");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyCourseInProfileSectionUnderMyLearningSection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.assertCourseInMyLearningSection),"Course is not displayed under My learning section");
        QXClient.get().report().info("Course is displayed in My learning section of Profile page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.onGoingCourse),"Course with ongoing is not displayed");
        QXClient.get().report().info("Course with ongoing is displayed in profile page");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyChangePreferencesInHomePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("clicked on clkNewDikshExperiece");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertBoardInProfile),"Board is not displayed ");
        QXClient.get().report().info("Board is displayed in home page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertMediumInProfile),"Medium is not displayed");
        QXClient.get().report().info("Medium is displayed in home page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertClassInProfile),"Class is not displayed");
        QXClient.get().report().info("Class is displayed in home page");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnChangePreferenceBtn);
        QXClient.get().report().info("Clicked on Change Preference button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.assertBoardInProfile);
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selCBSEBoard);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnMedium);
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selEnglish);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnClass);
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.selClass1);
        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.clkOnSaveBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertCBSEBoardInHomePage),"Change preference is not updated");
        QXClient.get().report().info("Change preference is updated successfully");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertEnglishMediumInHomePage),"Change preference is not updated");
        QXClient.get().report().info("Change preference is updated successfully");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertClass1InProfile),"Change preference is not updated");
        QXClient.get().report().info("Change preference is updated successfully");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyBackButtonWorkingInProfilePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.loginBtn),"Login button is not displayed in profile page");
        QXClient.get().report().info("Login button is displayed in profile page");

        QXClient.get().gestures().waitAndClickElementisVisible(profilepageobj.loginBtn);
        QXClient.get().report().info("Clicked on Login button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.clkLoginWithDikshaBtn),"login with diksha button is not displayed in profile page");
        QXClient.get().report().info("Login with diksha option is displayed in Profile page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.clkBackBtn),"Back button is not displayed");
        QXClient.get().report().info("Back button is displayed in profile page");

        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjectsPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profileEditPageObjectsPageObjects.clkBackBtn),"Back button is available");
        QXClient.get().report().info("Back button is not available");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.clkLoginWithDikshaBtn),"login with diksha button is displayed in profile page");
        QXClient.get().report().info("Login with diksha option is not displayed in Profile page");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyOnlyStateAndDistrictValuesPresentInProfilePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertStateContentPreferenceLabelProfile),"State is not displayed in profile page");
        QXClient.get().report().info("State value is displayed in Profile page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilepageobj.assertDistrictContentPreferenceLabelProfile),"District is not displayed in profile page");
        QXClient.get().report().info("District value is displayed in Profile page");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.assertClusterInProfilePage),"Cluster is displayed in profile page");
        QXClient.get().report().info("Cluster in profile page is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilepageobj.assertBlockInProfilePage),"Block is displayed in profile page");
        QXClient.get().report().info("Block in profile page is not displayed");
        QXClient.get().gestures().BlindWait(3000);
    }
}
