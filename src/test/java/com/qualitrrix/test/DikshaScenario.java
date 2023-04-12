


package com.qualitrrix.test;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.annotation.values.Skip;
import com.qualitrix.client.QXClient;
import com.qualitrix.common.manager.AppiumManager;
import com.qualitrix.common.utils.AssertUtils;
import com.qualitrix.pageActions.DikshaMainPageActions;
import com.qualitrix.testng.listener.RetryCount;


import org.apache.commons.configuration.ConfigurationException;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class DikshaScenario {
	//DikshaMainPageActions dikshaMainPageActions=new DikshaMainPageActions();
	
	  public DikshaMainPageActions getDikshaMainPageActions() {
	        return new DikshaMainPageActions();
	    }
	  
    @BeforeClass
    public void BeforeClass(){
        System.out.println("@BeforeClass");
     //  QXClient.get().driver();

    }

   @BeforeMethod
   public void beforeMethod(){
       System.out.println("@BeforeMethod");
   // QXClient.get().driver();

   }



	
	  @Author(name="Raju")
	  
	  @Test() public void selectUserOnBoarding() throws Exception {
	  System.out.println("selectUserOnBoarding Tc's"); 
	  
     
	  
	  QXClient.get().driver();
	 
		  
	  QXClient.get().report().info("User is trying to select language"); //
	  QXClient.get().driver().getPageSource(); // QXClient.get().driver();
	  getDikshaMainPageActions().performUserOnBoarding(); //
	  getDikshaMainPageActions().shareTextBookViaWhatsApp();


	  
	  
	  
	  File file = QXClient.get().screenshotUtils().captureFile();
	  System.out.println("ImageFile: " + file.getPath());
	  
	  }
	  
		/*
		 * @Author(name="Raju")
		 * 
		 * @Test() public void shareBookViaWhatsApp() throws Exception {
		 * System.out.println("shareBookViaWhatsApp Tc's"); QXClient.get().driver();
		 * 
		 * QXClient.get().report().info("User is trying to Share Book Via WhatsApp"); //
		 * QXClient.get().driver().getPageSource(); // QXClient.get().driver();
		 * getDikshaMainPageActions().performUserOnBoarding();
		 * getDikshaMainPageActions().shareTextBookViaWhatsApp();
		 * 
		 * File file = QXClient.get().screenshotUtils().captureFile();
		 * System.out.println("ImageFile: " + file.getPath());
		 * 
		 * 
		 * }
		 * 
		 * @Author(name="Raju")
		 * 
		 * @Test() public void courseSearchInTrainingTab() throws Exception {
		 * System.out.println("courseSearchInTrainingTab Tc's");
		 * QXClient.get().driver();
		 * 
		 * QXClient.get().report().info("User is trying to Share Book Via WhatsApp"); //
		 * QXClient.get().driver().getPageSource(); // QXClient.get().driver();
		 * getDikshaMainPageActions().performUserOnBoarding();
		 * getDikshaMainPageActions().courseSearch();
		 * 
		 * File file = QXClient.get().screenshotUtils().captureFile();
		 * System.out.println("ImageFile: " + file.getPath());
		 * 
		 * 
		 * }
		 * 
		 * 
		 * @Author(name="Raju")
		 * 
		 * @Test() public void playTextBook() throws Exception {
		 * System.out.println("shareBookViaWhatsApp Tc's"); QXClient.get().driver();
		 * 
		 * QXClient.get().report().info("User is trying to Share Book Via WhatsApp"); //
		 * QXClient.get().driver().getPageSource(); // QXClient.get().driver();
		 * getDikshaMainPageActions().performUserOnBoarding();
		 * getDikshaMainPageActions().playTextBook();
		 * 
		 * File file = QXClient.get().screenshotUtils().captureFile();
		 * System.out.println("ImageFile: " + file.getPath());
		 * 
		 * 
		 * }
		 * 
		 * @Author(name="Raju")
		 * 
		 * @Test() public void DownloadTheContent() throws Exception {
		 * System.out.println("shareBookViaWhatsApp Tc's"); QXClient.get().driver();
		 * 
		 * QXClient.get().report().info("User is trying to Share Book Via WhatsApp");
		 * QXClient.get().driver().getPageSource(); // QXClient.get().driver();
		 * getDikshaMainPageActions().performUserOnBoarding();
		 * getDikshaMainPageActions().downloadTextbook();
		 * 
		 * File file = QXClient.get().screenshotUtils().captureFile();
		 * System.out.println("ImageFile: " + file.getPath());
		 * 
		 * 
		 * }
		 */
   /* @Author(name="Prafulla")
    @Test()
    public void SelectUserType() throws Exception {
        System.out.println("Outer Test3");
        QXClient.get().report().info("User is trying to select UserType");
      // QXClient.get().driver().getPageSource();
       QXClient.get().driver();
       getDikshaMainPageActions().sltLanguageAndTeacher();
       getDikshaMainPageActions().sltTeacher();
    // dikshaMainPageActions.sltLanguageAndTeacher();
    }
*/
    @AfterMethod
    public void afterMethod(){
        System.out.println("@AfterMethod");
    }
}
