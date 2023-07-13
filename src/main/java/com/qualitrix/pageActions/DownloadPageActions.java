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

	public void verifyNoDownloadsInDownloadSection() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

      	Assert.assertTrue(!QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDownloadedBookInDownlaodSection),"Large size content book downloaded successfully in download section");
      	QXClient.get().report().info("Large size content book is not downloaded in download section");
      	QXClient.get().report().info("User not able to download large size content book");

      	QXClient.get().gestures().BlindWait(3000);
	}

	public void verifyContentsArrangedProperlyBasedOnLastViewedAndContentSize() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertSorting),"Contents not sorted based on content size");
      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.assertSorting);
      	QXClient.get().gestures().BlindWait(3000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertLastViewed),"Last viewed section is not displayed");
      	QXClient.get().report().info("Last viewed section is displayed");
      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.assertLastViewed);
      	QXClient.get().gestures().BlindWait(3000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertLastViewedDownArrow),"Last viewed down arrow is not displayed");
      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertLastViewedContent),"Last viewed content is not displayed");
      	QXClient.get().report().info("Last viewed content is displayed");
      	QXClient.get().gestures().BlindWait(3000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.assertLastViewedDownArrow);
      	QXClient.get().gestures().BlindWait(2000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.assertContentSize);
      	QXClient.get().gestures().BlindWait(2000);

		Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertSorting),"Contents not sorted based on content size");
		QXClient.get().gestures().BlindWait(2000);

		Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertContentSizeContent),"Content size content is not displayed");
		QXClient.get().gestures().BlindWait(3000);


	}

	public void verifyUserAbleToDownloadTranscriptInAboutSectionOfContent() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

      	//Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertPlayBtn),"Play video button is not displayed");
      	QXClient.get().report().info("Play video button is displayed post clicking the transcript content");

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertAboutSection),"About section is not displayed");
      	QXClient.get().report().info("About section is displayed");

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDownloadTranscriptText),"Download transcript text is not displayed");
      	QXClient.get().report().info("Download transcript text is displayed");
      	QXClient.get().gestures().BlindWait(3000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.clkTranscriptDownloadImage);
      	QXClient.get().report().info("Clicked on download transcript image under about section");
      	QXClient.get().gestures().BlindWait(3000);

     // 	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDOWNLOAD_TRANSCRIPTText),"Download transcript text is not displayed");
      	QXClient.get().report().info("Download transcript text is displayed");
      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.clkSltLanguage);
      	QXClient.get().gestures().BlindWait(2000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.sltEnglishLanguage);
      	QXClient.get().report().info("Select English language in transcript");
      	QXClient.get().gestures().BlindWait(2000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.clkTranscriptDownloadBtn);
      	QXClient.get().report().info("Transcript download button clicked");
      	QXClient.get().report().info("User able to download transcript in about section");
      	QXClient.get().gestures().BlindWait(3000);

	}


	public void verifyDisabledDownloadBtnAndValidateMessagePostClickingDownloadBtn() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

    //  	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertLargeContentTitle),"Large content title is not displayed");
    //  	QXClient.get().report().info("Large Content title is displayed to user");

      //	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertPlayBtn),"Play video button is not displayed");
      //	QXClient.get().report().info("Play video button is displayed to the user");
      //	QXClient.get().gestures().BlindWait(2000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertDisableDownloadBtn),"Disabled donwload button is not displayed");
      	QXClient.get().report().info("Disbaled download button is displayed to the user in large content");
      	QXClient.get().gestures().BlindWait(2000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.assertDisableDownloadBtn);
      	QXClient.get().report().info("Clicked on download button");

     // 	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertContentCanNotBeDownloadedMsg),"Can not download the content message is  not displayed");
      	QXClient.get().report().info("This content cannot be downloaded message is displayed");
      	QXClient.get().gestures().BlindWait(2000);


	}

	public void verifyUserAbleToMoveContentsFromPhoneToSDCard() throws Exception {
      	QXClient.get().gestures().BlindWait(3000);

      	QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.settingBtn);
      	QXClient.get().report().info("Clicked on Settings button in download tab");
      	QXClient.get().gestures().BlindWait(2000);

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertStorageSettingsTextInDownloadsPage),"Storage settings section is not displayed");
      	QXClient.get().report().info("Storage settings section is displayed to the user");

      	Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertStorageText),"Storage text is not displayed");
      	QXClient.get().report().info("Storage text is displayed ");
      	QXClient.get().gestures().BlindWait(2000);

      	//QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.sdCardStorageRadioBtn);
      	QXClient.get().report().info("Clicked on SD Card radio button");
      	QXClient.get().gestures().BlindWait(2000);

      	//Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertMoveToSDCardText),"Move content to sd card text is not displayed");
      	QXClient.get().report().info("Move content to sd card text is displayed");
      	//QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.moveBtn);
      	QXClient.get().report().info("Clicked on Move button");
      	QXClient.get().gestures().BlindWait(3000);
      	//Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertContentSuccessfullyMovedToSDCardMsg),"Successfull message is not displayed");
      	QXClient.get().report().info("Content moved successfully to sd card message is displayed");
      	//QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.okBtn);
      	QXClient.get().gestures().BlindWait(3000);


	}

	public void verifyUserAbleToMoveContentsFromSDcardToPhone() throws Exception {
		QXClient.get().gestures().BlindWait(3000);

		//QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.phoneStorageRadioBtn);
		QXClient.get().report().info("Clicked on Phone storage radio button");
		QXClient.get().gestures().BlindWait(2000);

		//Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertMoveToPhoneText),"Move content to phone text is not displayed");
		QXClient.get().report().info("Move content to Phone text is displayed");
		//QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.moveBtn);
		QXClient.get().report().info("Clicked on Move button");
		QXClient.get().gestures().BlindWait(3000);
		//Assert.assertTrue(QXClient.get().gestures().isElementPresent(downloadPageObjects.assertContentMovedSuccessfullyToPhoneMsg),"Successfull message is not displayed");
		QXClient.get().report().info("Content moved successfully to Phone message is displayed");
		//QXClient.get().gestures().waitAndClickElementisVisible(downloadPageObjects.okBtn);
		QXClient.get().gestures().BlindWait(3000);
	}


}
