package com.qualitrix.pageActions;

import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import jdk.nashorn.internal.runtime.QuotedStringTokenizer;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.BoardMediumClassSelectionPageObjects;
import com.qualitrix.pageObjects.DikshaMainPageObjects;
import com.qualitrix.pageObjects.DownloadPageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DikshaMainPageActions  {

   
   // AppiumDriver driver;

    
    DikshaMainPageObjects dikshaMainObjects=new DikshaMainPageObjects();
    BoardMediumClassSelectionPageObjects boardMediumClassSelectionPageObjects=new BoardMediumClassSelectionPageObjects();


    public DikshaMainPageActions() {

       PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), dikshaMainObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), boardMediumClassSelectionPageObjects);
    }
    public void LaunchAppHomeScreen()
    {
    	/*QXClient.get().gestures().startActivity("staging.diksha.app","org.sunbird.app.MainActivity");
   			      	System.out.println(("Launch HomeScreen"));*/
   			      	
    	
    	 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
    	      	   String fetchAppPackage=properties.getProperty("appPackage");
    	   String fetchAppActivity=properties.getProperty("appActivity");
    	   
    	
    	QXClient.get().gestures().startActivity(fetchAppPackage,fetchAppActivity);
	      	System.out.println(("Launch HomeScreen"));

   			     
    }
	 
    
    public void sltUserStateDropdown() throws Exception
    {
        Thread.sleep(4000);
         QXClient.get().gestures().BlindWait(8000);
    	  QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectBoard);
          QXClient.get().report().info("Selected Board Value");
    
          Thread.sleep(2000);
    	  //QXClient.get().gestures().scrollAndClick("State (Karnataka)");
        	 
          
           QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectStateBoard);
            QXClient.get().report().info("Clicked on Select  DropDown");
         
            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
//           QXClient.get().gestures().BlindWait(5000);
//
//        QXClient.get().gestures().BlindWait(5000);

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectMedium);
            QXClient.get().report().info("Clicked on Medium DropDownn");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectEnglishMedium);
            QXClient.get().report().info("Select English Value");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
            QXClient.get().report().info("Clicked on Submit Button");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectClass);
            QXClient.get().report().info("Clicked on Select DropDown");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectClassOne);
            QXClient.get().report().info("Selected Class Value");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
            QXClient.get().report().info("Clicked on Submit Button");
            QXClient.get().gestures().BlindWait(5000);

       //   QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitWithArrowBtn);

            Thread.sleep(6000);

            
    }
    public void performUserOnBoarding() throws Exception {
            //try {
                QXClient.get().report().info("slt language");
                QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);
 
                ProfileEditPageActions pageaction=new ProfileEditPageActions();

                QXClient.get().gestures().BlindWait(1000);

            //    QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
                QXClient.get().report().info("Clicked on Continue Button");
                
                pageaction.verifyLabelOnBoarding();
                QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickTeacher);
                QXClient.get().report().info("Clicked on Teacher Button");

                              
                sltUserStateDropdown();
                checkLocationPopup();
                clkCloseIcon();
//                QXClient.get().gestures().closeApp();  
//                LaunchAppHomeScreen();
    }

    public void performUserOnBoardingAndClickSwitchToNewExperience() throws Exception {
        //try {
        QXClient.get().report().info("slt language");
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

        ProfileEditPageActions pageaction=new ProfileEditPageActions();

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
        QXClient.get().report().info("Clicked on Continue Button");

        pageaction.verifyLabelOnBoarding();
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickTeacher);
        QXClient.get().report().info("Clicked on Teacher Button");


        sltUserStateDropdown();
        checkLocationPopup();
        //clkCloseIcon();
//                QXClient.get().gestures().closeApp();
//                LaunchAppHomeScreen();
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clkOnSwitchToNewExperience);
        QXClient.get().gestures().BlindWait(3000);
    }
    public void clkCloseIcon() throws Exception {
        //try {
    QXClient.get().report().info("slt clkCloseIcon");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clkClosePoup);

}
    public void sltLangAndTeacherRole() throws Exception {
    	 QXClient.get().report().info("slt language");

         QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

         QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
         QXClient.get().report().info("Clicked on Continue Button");
         QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickTeacher);
         QXClient.get().report().info("Clicked on Teacher Button");

                       
}
    
    
    public void performUserOnBoardingWithStudent() throws Exception {
        //try {
    QXClient.get().report().info("slt language");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
            QXClient.get().report().info("Clicked on Continue Button");
            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickStudent);
            QXClient.get().report().info("Clicked on clickStudent Button");

                          
            sltUserStateDropdown();
            checkLocationPopup();
            clkCloseIcon();

//            QXClient.get().gestures().closeApp();  
//            LaunchAppHomeScreen();
}
    public void checkLocationPopup() throws Exception
    {
    	Thread.sleep(3000);
    	try
    	{
    	if(QXClient.get().gestures().isElementPresent((boardMediumClassSelectionPageObjects.selectState)));
    	{  
    	QXClient.get().gestures().waitAndClickElementisVisible(boardMediumClassSelectionPageObjects.selectState);

        QXClient.get().report().info("Tap on Select selectState");
       
       
        QXClient.get().gestures().waitAndClickElementisVisible(boardMediumClassSelectionPageObjects.selectStateName);
       QXClient.get().report().info("Tap on selectStateName");
       
       QXClient.get().gestures().waitAndClickElementisVisible(boardMediumClassSelectionPageObjects.submitBtn);
       QXClient.get().report().info("Tap on Submit button");
       Thread.sleep(2000);

       QXClient.get().gestures().waitAndClickElementisVisible(boardMediumClassSelectionPageObjects.selectDist);

       QXClient.get().report().info("Tap on Select selectDist");
      
       
       
       QXClient.get().gestures().waitAndClickElementisVisible(boardMediumClassSelectionPageObjects.selectBagalkotDst);
       QXClient.get().report().info("Tap on Bagalkot District");
       
       QXClient.get().gestures().waitAndClickElementisVisible(boardMediumClassSelectionPageObjects.submitBtn);
       QXClient.get().report().info("Tap on Submit button");
       Thread.sleep(4000);

       QXClient.get().gestures().waitAndClickElementisVisible(boardMediumClassSelectionPageObjects.submitBtn2);
            QXClient.get().report().info("Tap on Submit button");
            QXClient.get().report().info("Handled location popup succesfully");
            Thread.sleep(4000);
    	}            
    	}
    	catch(Exception e)
    	{
    		System.out.println("Location popup not displayed");
    	}
    }
     
    
    public void shareTextBookViaWhatsApp() throws Exception {
        try {
            Thread.sleep(4000);
        	  QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.searchIcon);
              QXClient.get().report().info("Tap on search icon");
              Thread.sleep(1000);
             
              
              String excelPath = "E:\\QualitrixMobile\\testdata\\TestData.xlsx";
              QXClient.get().excelUtils().open(excelPath, "Excel1");
             String cellValue = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",26, 2);
             System.out.println("ExcelTest@cellValue: " + cellValue);           
     //    QXClient.get().excelUtils().setCellValue("Excel1", "TestData", "RajuTestedExcel", 3, 2);

          // QXClient.get().excelUtils().open("excelPath", "Excel1");
           QXClient.get().excelUtils().close("Excel1");
           QXClient.get().excelUtils().closeAll();
             
           
           dikshaMainObjects.searchBar.sendKeys(cellValue);
           Thread.sleep(1000);

        //   QXClient.get().gestures().clickOnElement(dikshaMainObjects.searchBar);
           QXClient.get().report().info("Enter Book Value");
        
           QXClient.get().gestures().clickOnElement(dikshaMainObjects.actionSearchIcon);
           Thread.sleep(1000);
           QXClient.get().report().info("Click on SearchIcon");
           Thread.sleep(1000);
             
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.BookSearch);
              QXClient.get().report().info("Tap on Searched Book");
              Thread.sleep(5000);
                       
              
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.shareBtn);
              QXClient.get().report().info("Tap on shareBtn icon");
              Thread.sleep(2000);
              
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.shareBtn1);
              QXClient.get().report().info("Tap on shareBtn1 icon from sharePopUp");
              Thread.sleep(1000);
        
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.shareToWhatsApp);
              QXClient.get().report().info("Tap on shareToWhatsApp icon ");
              Thread.sleep(1000);
              
              
              
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    public void playTextBook() throws Exception {
        try {
            Thread.sleep(1000);
        	  QXClient.get().gestures().clickOnElement(dikshaMainObjects.searchIcon);
              QXClient.get().report().info("Tap on search icon");
              Thread.sleep(1000);
             
              
              String excelPath = "E:\\QualitrixMobile\\testdata\\TestData.xlsx";
              QXClient.get().excelUtils().open(excelPath, "Excel1");
             String cellValue = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",26, 2);
             System.out.println("ExcelTest@cellValue: " + cellValue);           
     //    QXClient.get().excelUtils().setCellValue("Excel1", "TestData", "RajuTestedExcel", 3, 2);

          // QXClient.get().excelUtils().open("excelPath", "Excel1");
           QXClient.get().excelUtils().close("Excel1");
           QXClient.get().excelUtils().closeAll();
             
           
           dikshaMainObjects.searchBar.sendKeys(cellValue);
           Thread.sleep(1000);

        //   QXClient.get().gestures().clickOnElement(dikshaMainObjects.searchBar);
           QXClient.get().report().info("Enter Book Value");
        
           QXClient.get().gestures().clickOnElement(dikshaMainObjects.actionSearchIcon);
           Thread.sleep(1000);
           QXClient.get().report().info("Click on SearchIcon");
           Thread.sleep(1000);
             
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.BookSearch);
              QXClient.get().report().info("Tap on Searched Book");
              Thread.sleep(5000);
                       
              
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.playIcon);
              QXClient.get().report().info("Tap on Playbutton icon");
              Thread.sleep(4000);
              
           
//              QXClient.get().gestures().clkBackButton();
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.okBtn);
              QXClient.get().report().info("Tap on okBtn");
              Thread.sleep(2000);
              
              
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    public void downloadTextbook() throws Exception {
        try {
            Thread.sleep(1000);
        	  QXClient.get().gestures().clickOnElement(dikshaMainObjects.searchIcon);
              QXClient.get().report().info("Tap on search icon");
              Thread.sleep(1000);
             
              
              String excelPath = "E:\\QualitrixMobile\\testdata\\TestData.xlsx";
              QXClient.get().excelUtils().open(excelPath, "Excel1");
             String cellValue = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",26, 2);
             System.out.println("ExcelTest@cellValue: " + cellValue);           
     //    QXClient.get().excelUtils().setCellValue("Excel1", "TestData", "RajuTestedExcel", 3, 2);

          // QXClient.get().excelUtils().open("excelPath", "Excel1");
           QXClient.get().excelUtils().close("Excel1");
           QXClient.get().excelUtils().closeAll();
             
           
           dikshaMainObjects.searchBar.sendKeys(cellValue);
           Thread.sleep(1000);

        //   QXClient.get().gestures().clickOnElement(dikshaMainObjects.searchBar);
           QXClient.get().report().info("Enter Book Value");
        
           QXClient.get().gestures().clickOnElement(dikshaMainObjects.actionSearchIcon);
           Thread.sleep(1000);
           QXClient.get().report().info("Click on SearchIcon");
           Thread.sleep(1000);
             
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.BookSearch);
              QXClient.get().report().info("Tap on Searched Book");
              Thread.sleep(5000);
                       
              
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.downloadBtn);
              QXClient.get().report().info("Tap on Playbutton icon");
              Thread.sleep(1000);
                         
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.downloadPopUpBtn);
              QXClient.get().report().info("Tap on okBtn");
              Thread.sleep(4000);
//              QXClient.get().gestures().clkBackButton();
//              QXClient.get().gestures().clkBackButton();
//              QXClient.get().gestures().clkBackButton();
                            QXClient.get().gestures().clickOnElement(dikshaMainObjects.downloadTab);
              QXClient.get().report().info("Tap on okBtn");
              Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
}

    public void courseSearch() throws Exception {
            Thread.sleep(1000);
            
            QXClient.get().gestures().clickOnElement(dikshaMainObjects.trainingTab);
            QXClient.get().report().info("Tap on trainingTab");
            Thread.sleep(1000);
           
        	  QXClient.get().gestures().clickOnElement(dikshaMainObjects.searchIcon);
              QXClient.get().report().info("Tap on search icon");
              Thread.sleep(1000);
             
              
              String excelPath = "E:\\QualitrixMobile\\testdata\\TestData.xlsx";
              QXClient.get().excelUtils().open(excelPath, "Excel1");
             String cellValue = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25, 2);
             System.out.println("ExcelTest@cellValue: " + cellValue);           
     //    QXClient.get().excelUtils().setCellValue("Excel1", "TestData", "RajuTestedExcel", 3, 2);

          // QXClient.get().excelUtils().open("excelPath", "Excel1");
           QXClient.get().excelUtils().close("Excel1");
           QXClient.get().excelUtils().closeAll();
             
           
           dikshaMainObjects.searchBar.sendKeys(cellValue);
           Thread.sleep(1000);

        //   QXClient.get().gestures().clickOnElement(dikshaMainObjects.searchBar);
           QXClient.get().report().info("Enter Book Value");
        
           QXClient.get().gestures().clickOnElement(dikshaMainObjects.actionSearchIcon);
           Thread.sleep(1000);
           QXClient.get().report().info("Click on SearchIcon");
           Thread.sleep(1000);
             
              QXClient.get().gestures().clickOnElement(dikshaMainObjects.CourseSearch);
              QXClient.get().report().info("Tap on Searched Book");
              Thread.sleep(5000);
                          
        }
    public void performUserOnBoardingWithLeader() throws Exception {
        //try {
    QXClient.get().report().info("slt language");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
            QXClient.get().report().info("Clicked on Continue Button");
            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickLeader);
            QXClient.get().report().info("Clicked on clickLeader Button");

                          
//            sltUserStateDropdown();
//            checkLocationPopup();
            
//            QXClient.get().gestures().closeApp();  
//            LaunchAppHomeScreen();
}
    public void sltUserMultipleBMSDropdown() throws Exception
    {
        Thread.sleep(4000);

    	  QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectBoard);
          QXClient.get().report().info("Selected Board Value");
    
          Thread.sleep(2000);
    	  QXClient.get().gestures().scrollAndClick("State (Karnataka)");
        	 
          
       //   QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectStateBoard);
            QXClient.get().report().info("Clicked on Select  DropDown");
         
            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
           

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectMedium);
            QXClient.get().report().info("Clicked on Medium DropDownn");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectEnglishMedium);
            QXClient.get().report().info("Select English Value");
            
            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectHindiMediumBMS);
            QXClient.get().report().info("Select selectHindiMediumBMS Value");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
            QXClient.get().report().info("Clicked on Submit Button");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectClass);
            QXClient.get().report().info("Clicked on Select DropDown");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectClassOne);
            QXClient.get().report().info("Selected Class Value");
            
            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectClassTwo);
            QXClient.get().report().info("Selected Class Value");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
            QXClient.get().report().info("Clicked on Submit Button");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitWithArrowBtn);

            Thread.sleep(6000);
            checkLocationPopup();
            clkCloseIcon();
            
    }

  
    
    public void performUserOnBoardingForExistingUser() throws Exception {
        //try {
        QXClient.get().report().info("slt language");
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

        ProfileEditPageActions pageaction = new ProfileEditPageActions();

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
        QXClient.get().report().info("Clicked on Continue Button");

        // pageaction.verifyLabelOnBoarding();
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickTeacher);
        QXClient.get().report().info("Clicked on Teacher Button");


        sltUserStateDropdown();
        checkLocationPopup();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(dikshaMainObjects.switchNewExperienceBtn));
        QXClient.get().report().info("New Experience pop up is visible for existing user");

        if (QXClient.get().gestures().isElementPresent(dikshaMainObjects.clkClosePoup)) {
            clkCloseIcon();
        }
//                QXClient.get().gestures().closeApp();
//                LaunchAppHomeScreen();
    }
    
    
    public void verifyScanQRAndSelectBoardWhileUserOnBoarding() throws Exception {
        //try {
        QXClient.get().report().info("slt language");
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

        ProfileEditPageActions pageaction=new ProfileEditPageActions();

       QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
        QXClient.get().report().info("Clicked on Continue Button");

        // pageaction.verifyLabelOnBoarding();
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickTeacher);
        QXClient.get().report().info("Clicked on Teacher Button");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(dikshaMainObjects.assertScanQRCode));
        QXClient.get().report().info("Scan QR code is displayed while user Onboarding");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(dikshaMainObjects.assertSelectBoard));
        QXClient.get().report().info("Select Board is displayed while user Onboarding");
        QXClient.get().gestures().BlindWait(3000);

        sltUserStateDropdown();
        checkLocationPopup();
        clkCloseIcon();

        
        
//        if (QXClient.get().gestures().isElementPresent(dikshaMainObjects.clkClosePoup)) {
//            clkCloseIcon();
//        }
//                QXClient.get().gestures().closeApp();
//                LaunchAppHomeScreen();
    }
    
    public void performUserOnBoardingWithHeadTeacherAndOfficials() throws Exception {
        //try {
    QXClient.get().report().info("slt language");

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
            QXClient.get().report().info("Clicked on Continue Button");
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clkHeadTeacherAndOfficials);
            QXClient.get().report().info("Clicked on clkHeadTeacherAndOfficials Button");


}

    public void performUserOnBoardingAndClickSwitchNewExperiecnceBtn() throws Exception {
        QXClient.get().report().info("slt language");
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

        ProfileEditPageActions pageaction=new ProfileEditPageActions();

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
        QXClient.get().report().info("Clicked on Continue Button");

        // pageaction.verifyLabelOnBoarding();
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickTeacher);
        QXClient.get().report().info("Clicked on Teacher Button");


        sltUserStateDropdown();
        checkLocationPopup();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(dikshaMainObjects.switchNewExperienceBtn),"Switch to new Experience Button is not displayed");
        QXClient.get().report().info("Switch to new Experience Button is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.switchNewExperienceBtn);
        QXClient.get().gestures().BlindWait(3000);
    }

    public void performUserOnBoardingWithCBSEBoard() throws Exception {
        //try {
        QXClient.get().report().info("slt language");
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.sltLang);

        ProfileEditPageActions pageaction=new ProfileEditPageActions();

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickContinue);
        QXClient.get().report().info("Clicked on Continue Button");

        pageaction.verifyLabelOnBoarding();
        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.clickTeacher);
        QXClient.get().report().info("Clicked on Teacher Button");


        sltUserStateDropdownCBSE();
        checkLocationPopup();
        clkCloseIcon();
//                QXClient.get().gestures().closeApp();
//                LaunchAppHomeScreen();
    }

    public void sltUserStateDropdownCBSE() throws Exception
    {
        Thread.sleep(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectBoard);
        QXClient.get().report().info("Selected Board Value");

        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectStateBoard1);
        QXClient.get().report().info("Clicked on Select  DropDown");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);


        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectMedium);
        QXClient.get().report().info("Clicked on Medium DropDownn");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectEnglishMedium);
        QXClient.get().report().info("Select English Value");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
        QXClient.get().report().info("Clicked on Submit Button");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectClass);
        QXClient.get().report().info("Clicked on Select DropDown");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.selectClassSix);
        QXClient.get().report().info("Selected Class Value");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitBtn);
        QXClient.get().report().info("Clicked on Submit Button");

        QXClient.get().gestures().waitAndClickElementisVisible(dikshaMainObjects.submitWithArrowBtn);

        Thread.sleep(6000);


    }


}
