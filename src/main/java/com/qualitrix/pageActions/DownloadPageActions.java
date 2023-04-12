package com.qualitrix.pageActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.DikshaMainPageObjects;
import com.qualitrix.pageObjects.DownloadPageObjects;

/**
 *This Class has all the methods related to Download Page.
 *
 * @author : Gurukiran H N
 * @since : 24/March/2020
 */
public class DownloadPageActions  {

   
    DownloadPageObjects downloadPageObjects = new DownloadPageObjects();

      public DownloadPageActions() {
    //    this.driver = ContextManager.getDriver();

       PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), downloadPageObjects);
    	
    	//PageFactory.initElements(driver,DikshaMainPageObjects.class);

    }

	
	  public void tapOnDownloadedCourseContentBtn() {
	  QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.courseContentObj);
	  QXClient.get().report().info("Tap on downloaded course content");
	  }
	  
	  public void tapOnDeleteBtn() {
	  QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.deleteBtn); 
	  QXClient.get().report().info("Tap on delete button");
	  }
	  
	  public void tapOnSettingsBtn() {
	  QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.settingBtn); QXClient.get().report().info("Tap on settings button");
	  }
	  
	  public void verifyTheDownloadedBook() {
		  	  Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.bookObj),"Book downloaded successfully");
	  QXClient.get().report().info("The book downloaded successfully");
	  }
	  
	  public void verifyTheDownloadedResource()
	  {
	  Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.resourceName),"resourceName downloaded successfully");
	  QXClient.get().report().info("The resourceName downloaded successfully");
	  }
	  public void verifyTheDownloadedCouseContent()
	  {
	  Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.coureobj),"CouseContent downloaded successfully");
	  QXClient.get().report().info("The CouseContent downloaded successfully");
	  }


	  public void verifyDownloadPage() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.settingBtn),"Settings Button is not displayed");
      	QXClient.get().report().info("Settings Button is displayed in Download Tab section");

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertContentInDownloadSection),"Contents is not displayed");
      	QXClient.get().report().info("Downloaded contents is displayed in download section");

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertSelectAll),"Select all is not displayed");
      	QXClient.get().report().info("Select ALl is displayed");

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.deleteBtn),"Delete button is not displayed");
      	QXClient.get().report().info("Delete Button is displayed");

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertSorting),"Sorting is not displayed");
      	QXClient.get().report().info("Sorting is displayed");
      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.assertSorting);
      	QXClient.get().gestures().BlindWait(2000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertContentSize),"Content size is not displayed");
      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertLastViewed),"Last viewed is not displayed");

      	QXClient.get().gestures().BlindWait(2000);
      	QXClient.get().gestures().clkBackButton();
      }

      public void deleteDownloadedContent() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.deleteBtn);
      	QXClient.get().report().info("Clicked on delete button");
      	QXClient.get().gestures().BlindWait(2000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDeleteContentPopup),"Delete content popup is not displayed");
      	QXClient.get().report().info("Delete content popup is displayed");

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.deleteBtn);
      	QXClient.get().gestures().BlindWait(3000);

		  QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.deleteBtn);
		  QXClient.get().report().info("Clicked on delete button");
		  QXClient.get().gestures().BlindWait(2000);

		  Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDeleteContentPopup),"Delete content popup is not displayed");
		  QXClient.get().report().info("Delete content popup is displayed");

		  QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.deleteBtn);
		  QXClient.get().gestures().BlindWait(3000);

		  Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.noDownloadsYetMessage),"No Downloads yet message is not displayed");
		  Assert.assertTrue(!QXClient.get().gestures().isElementPresent(downloadPageObjects.assertContentInDownloadSection),"Contents in download section is displayed");
		  QXClient.get().report().info("Contents deleted successfully");
		  QXClient.get().gestures().BlindWait(3000);


	  }

	public void verifyTheDownloadedAdoptedTextBook() {
		Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDownloadedAdoptedTextbook),"Book downloaded successfully");
		QXClient.get().report().info("The Adopted book downloaded successfully");
	}

	public void verifyTheDownloadedQuestionSetCourse() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);
		Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDownloadedQuestionSetCourse),"Questionset is not downloaded");
		QXClient.get().report().info("The Question set is downloaded successfully");
	}


	public void validateDownloadedPDFContent() throws Exception {
		QXClient.get().gestures().BlindWait(3000);

		Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDownloadedPDFContent),"Downloaded pdf content is not displayed");
		QXClient.get().report().info("PDF Content downloaded successfully");
	}

	public void verifyBackButtonWorkingInDownloadsPage() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.clkSettingsBtn),"Settings button is not displayed in downloads page");
      	QXClient.get().report().info("Settings button is displayed in Downloads page");

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.clkSettingsBtn);
      	QXClient.get().gestures().BlindWait(3000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertStorageSettingsTextInDownloadsPage),"storage settings text is not displayed in downloads page");
      	QXClient.get().report().info("storage settings text is displayed in Downloads page");

		Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.clkBackBtn),"Back button is not displayed");
		QXClient.get().report().info("Back button is displayed in downloads page");

		QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.clkBackBtn);
		QXClient.get().gestures().BlindWait(3000);

		Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.clkSettingsBtn),"Settings button is not displayed in downloads page");
		QXClient.get().report().info("Settings button is displayed in Downloads page");

		Assert.assertTrue(!QXClient.get().gestures().isElementPresent(downloadPageObjects.assertStorageSettingsTextInDownloadsPage),"storage settings text is displayed in downloads page");
		QXClient.get().report().info("storage settings text not is displayed in Downloads page");
		QXClient.get().gestures().BlindWait(3000);


	}


}
