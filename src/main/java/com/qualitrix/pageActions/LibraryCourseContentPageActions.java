package com.qualitrix.pageActions;

import com.qualitrix.common.utils.WaitForUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.DikshaMainPageObjects;
import com.qualitrix.pageObjects.HomePageObjects;
import com.qualitrix.pageObjects.LibraryCourseContentPageObjects;
import com.qualitrix.pageObjects.TrainingPageObjects;

/**
 * This Class has all the methods related to Library course content Page.
 *
 * @author : Gurukiran H N
 * @since : 24/March/2020
 */
public class LibraryCourseContentPageActions {

 
    LibraryCourseContentPageObjects libraryCourseContentPageObjects = new LibraryCourseContentPageObjects();
    HomePageObjects homePageObjects = new HomePageObjects();
TrainingPageObjects trainPageObje=new TrainingPageObjects();

public LibraryCourseContentPageActions() {
//    this.driver = ContextManager.getDriver();

   PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
    PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), libraryCourseContentPageObjects);
    PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), homePageObjects);
    PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), trainPageObje);

	//PageFactory.initElements(driver,DikshaMainPageObjects.class);

}


  
    public void tapOnDownloadBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.downloadBtn);
        QXClient.get().report().info("Tap on download button");
    }

    public void tapOnDeleteBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.deleteBtn);
        QXClient.get().report().info("Tap on delete button");
    }

    public void tapOnShareBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.shareBtn);
        QXClient.get().report().info("Tap on share button");
    }

    public void tapOnContent() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.courseContent);
        QXClient.get().gestures().wait(7);
        QXClient.get().report().info("Tap on content");
    }
    
    public void tapOnContentToPlayOffile() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.offlineplayCont);
        QXClient.get().gestures().wait(7);
        QXClient.get().report().info("Tap on content");
    }
    public void tapOnContentForDownload() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.downloadBook);
        QXClient.get().gestures().wait(7);
        QXClient.get().report().info("Tap on content");
    }
    public void tapOnSearchedCopiedBook() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.copiedBook);
        QXClient.get().gestures().wait(7);
        QXClient.get().report().info("Tap on content");
    }

    public void tapOnBookContent() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.bookContent);
        QXClient.get().gestures().wait(7);
        QXClient.get().report().info("Tap on content");
    }

    public void tapOnSelectChapter() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.selectChapterObj);
        QXClient.get().report().info("Tap on select chapter");
    }

    public void verifyBookIndex() {
        /*if (deviceHelper.isElementPresent(libraryCourseContentPageObjects.content2)) {
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.content1), "A happy child content is displayed");
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.content2), "After a bath content is displayed");
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.content3), "One little kitchen content is displayed");
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.audioObj), "Audio content is displaying");
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.imageObj), "Image content is displaying");
            int size = libraryCourseContentPageObjects.booksIndex.size();
            Assert.assertTrue(size > 0, "Book index is more than zero");
            QXClient.get().report().info("Book index is more than zero");
            deviceHelper.swipeUp();
            deviceHelper.swipeUp();
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.content4), "Flying man content is displayed");
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.content5), "Clouds content is displayed");
        } else {
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.unit1), "Unit one index is displayed");
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.unit2), "Unit two index is displayed");
        }*/
    	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.unit1), "Unit one index is displayed");
       //    Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.unit2), "Unit two index is displayed");
    	
        QXClient.get().report().info("Verifying the book index");
    }

    public void tapOnCreditAndLicense() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.licenseBtn);
        QXClient.get().report().info("Tap on credit and license");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnReadMore() throws Exception {
    	QXClient.get().gestures().wait(4);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.readMore);
        QXClient.get().report().info("Tap on read more");
    }

    public void tapOnContentOfBook() {
        if (!QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.playIcon)) {
            libraryCourseContentPageObjects.unit1.click();
        }
        if (QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.unit1)) {
            libraryCourseContentPageObjects.qnWithImage.click();
        }
        
        else if (QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.audioContent)) {
            QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.audioContent);
        }
        QXClient.get().report().info("Tap on content of book");
    }

    public void tapOnSecondContent() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.okBtn);
        QXClient.get().report().info("Tap on OK button");
    }

    public void tapOnOKbtn() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.okBtn);
        QXClient.get().report().info("Tap on OK button");
    }

    public void tapOnStarIcon() throws Exception {
        QXClient.get().gestures().BlindWait(10000);
        QXClient.get().gestures().BlindWait(10000);
        if (!QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.startBtn)) {
            libraryCourseContentPageObjects.rateObj.click();
        }
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.startBtn);
        QXClient.get().report().info("Tap on star icon");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void giveFeedbackAndSubmit(String toast) throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.feedbackChkbx);
        libraryCourseContentPageObjects.submitBtn.click();
      //  libraryCourseContentPageObjects.feedbackPopUp.getText().equalsIgnoreCase(toast);
       // QXClient.get().gestures().wait(4);
        QXClient.get().report().info("Entering feedback and submit");
    }

    public void tapOnPlayIcon() throws Exception {
    	QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.playIcon);
        QXClient.get().report().info("Content starts to play");
        Thread.sleep(1000);
    }

    public void tapOnPlayIcon1() throws Exception {
        if(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.playIcon1)) {
            QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.playIcon1);
            QXClient.get().report().info("Content starts to play");
            Thread.sleep(8000);
        }
        }


    public void verifyContentUI() {
      //  Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.downloadBtn), "Download button is displayed");
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.deleteBtn), "Delete button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.shareBtn), "Share icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.selectChapterObj), "Select chapter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.allBtn), "All button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.videoBtn), "Video button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.documentsBtn), "Documents button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.interactionBtn), "Interaction button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.content1), "Content is displayed");
        if (!QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.playIcon)) {
            libraryCourseContentPageObjects.unit1.click();
        }
        if (QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.unit1)) {
            libraryCourseContentPageObjects.qnWithImage.click();
        } /*else {
            Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.audioContent), "Audio content is displayed");
            libraryCourseContentPageObjects.audioContent.click();
        }*/
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.playIcon), "Play icon is displayed");
        //Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.trashDelete));
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.shareIconInsideContent), "Share icon is displayed");
     //   Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.rateObj), "Rate button is displayed");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.licenseBtn), "License button is displayed");
        QXClient.get().report().info("Verifying course content UI");
    }

    public void verifySharePopUI() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.shareLink), "Share link is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.sendFile), "Send file is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.saveFile), "Save file is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.shareBtn1), "Share button is displayed");
        QXClient.get().report().info("Verifying share pop up UI");
    }

    public void verifyShareAlertPopUI() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.shareAlertPopUp), "Share pop up is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.thirdPartyApp), "Third party app pop up is displayed");
        QXClient.get().report().info("Verifying share alert pop up UI");
    }

    public void verifyTermsAndCondLink() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.termsAndCondLink), "Terms and link is displayed");
        QXClient.get().report().info("Verifying Terms And Condition link");
    }

    public void tapOnShareBtnFrmSharePop() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.shareBtn1);
        QXClient.get().report().info("Tap on share button in share pop up");
    }

    public void tapOnSendBtnFromSharePopup() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sendBtn);
        QXClient.get().report().info("Tap on send button in share pop up");
    }

    public void tapOnSendFileFromSharePopup() {
       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sendFile);
       QXClient.get().report().info("Tap on send file button in share pop up");
    }

    public void tapOnShareToWhatsApp() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.shareToWhatsApp);
        QXClient.get().report().info("Tap on share to whats app");
    }

    public void tapOnShareToSlackApp() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        if(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkAllowBtn)){
            QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkAllowBtn);
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkAllowBtn);
            QXClient.get().gestures().BlindWait(2000);
        }else{
            QXClient.get().report().info("Allow button is not displayed");
        }
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.shareToSlackApp);
        QXClient.get().report().info("Tap on share to slack app");

    }

    public void verifyWhatsAppHomePage() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.whatsAppHomePage), "Whats app home page is displayed");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("Verifying whats app home page");
    }

    public void verifySlackAppPage() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.slackSharePage),"Slack share page is not displayed");
        QXClient.get().report().info("Slack share page is displayed to the user");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertMalformedEcarFile),"Malformed ecar file is not displayed");
        QXClient.get().report().info("Malformed ecar file is displayed to the user");
        QXClient.get().gestures().clkBackButton();
    }

    public void verifyCreditAndLicenseUI() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.createdObj), "Created by info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.publishObj), "Published by info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.licenseTermsObj), "License terms info is displayed");
       // Assert.assertTrue(deviceHelper.isElementPresent(libraryCourseContentPageObjects.copyRightObj), "Copyright info is displayed");
        QXClient.get().report().info("Verifying credit and license UI");
    }

    public void tapOnSeeMore() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.viewMoreOpt);
        QXClient.get().report().info("Tap on see more");
    }
    public void clickToc() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.qnWithImage);
        QXClient.get().report().info("clicked on toc");
    }
    public void verifyLibraryContents() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.notificationBtn), "Notification icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.searchIcon), "Search icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.mediumScroll), "Medium scroll is displayed");
        QXClient.get().gestures().scrollToMobileElement(libraryCourseContentPageObjects.viewMoreOpt, "2");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.viewMoreOpt), "View more option is displayed");
        tapOnSeeMore();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.sortBy), "Sort by option is displayed");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("Verifying library contents");
    }
    
    public void verifyClassAndSeeMoreBooks() throws Exception {
    	
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSeeMoreBooksAndContent);
         QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkClass1);
        QXClient.get().report().info("clicked on Class");
        QXClient.get().gestures().BlindWait(3000);
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyBookAfterChangingClass), "Verify Textbook after changing Class is Displayed");
        QXClient.get().report().info("Content is displayed after changing class");

        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkTextbook);
        QXClient.get().report().info("clicked on clkTextbook in classsection");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyBookAfterChangingClass), "Verify Textbook after changing Class is Displayed");
        QXClient.get().report().info("Content is displayed after changing to textbook");

        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkClass2);
        QXClient.get().report().info("clicked on clkClass2");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyBookAfterChangingClass), "Verify Textbook after changing Class is Displayed");
        QXClient.get().report().info("Content is displayed after changing to textbook");

      
        
    }
        
    public void verifyDataSyncs() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.menuBar);
        QXClient.get().report().info("clicked on Menu Icon");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.Clksettings);
        QXClient.get().report().info("clicked on Settings in Menu");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.ClkDataSync), "DataSync Option is Displayed");
       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.ClkDataSync);
       QXClient.get().report().info("clicked on DataSync in Setting Option");
              Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.ClkSyncNow), "SyncNow Option is Displayed");
       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.ClkSyncNow);
       QXClient.get().report().info("clicked on ClkSyncNow in DataSync Option");
                     
    }
    public void verifyDeviceIDAndShareDeviceID() {
   	 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.menuBar);
        QXClient.get().report().info("clicked on Menu Icon");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.Clksettings);
        QXClient.get().report().info("clicked on Settings in Menu");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkAboutUs), "AboutUs Option is Displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkAboutUs);
        QXClient.get().report().info("clicked on About Us");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.deviceIDLabel), "deviceIDLabel  is Displayed");
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyDeviceID), "Device ID Data  is Displayed");
        QXClient.get().report().info("Device ID Data is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.ClkshareDeviceID);
        QXClient.get().report().info("clicked on ClkshareDeviceID");

        
   }
    public void shareDikshaApp() {
    	 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.menuBar);
         QXClient.get().report().info("clicked on Menu Icon");
         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.Clksettings);
         QXClient.get().report().info("clicked on Settings in Menu");
         Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.ShareDikshaApp), "ShareDikshaApp Option is Displayed");
         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.ShareDikshaApp);
         QXClient.get().report().info("clicked on ShareDikshaApp in Setting Option");
    }
       
   
    public void librayFilterSearch() {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("Click on clkLibrayFilter");
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibBoard);
        QXClient.get().report().info("Tap on clkLibBoard button");
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("Tap on Board sltFilter1 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("Tap on Board sltFilter2 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("Tap on Board sltFilter3 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("Tap on Board clkConfirmBton button");
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibClass);
        QXClient.get().report().info("Tap on clkLibClass button");
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("Tap on Class sltFilter1 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("Tap on Class sltFilter2 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("Tap on Class sltFilter3 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("Tap on Class clkConfirmBton button");
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibSubject);
        QXClient.get().report().info("Tap on clkLibSubject button");
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("Tap on Subject sltFilter1 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("Tap on Subject sltFilter2 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("Tap on Subject sltFilter3 button");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("Tap on Subject clkConfirmBton button");
        
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilter);
        QXClient.get().report().info("Tap on clkApplyFilter button");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyFilteredResult),"verifyFilteredResult  is not available");
       
    }

    public void librarySearchFilter() throws Exception {
  
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");
        QXClient.get().gestures().BlindWait(3000);


        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibBoard);
        QXClient.get().report().info("clicked on clkLibBoard ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().BlindWait(2000);
        if(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.sltFilter3)) {
            QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
            QXClient.get().report().info("clicked on sltFilter3 ");
        }
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);

        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibClass);
        QXClient.get().report().info("clicked on clkLibClass ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibSubject);
        QXClient.get().report().info("clicked on clkLibSubject ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(5000);

//        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilter);
//        QXClient.get().report().info("clicked on clkApplyFilter ");
//     QXClient.get().gestures().BlindWait(3000);
//        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyFilteredResult), "verifyFilteredResult Option  is Not Displayed");
     
   }
      
    public void FilterForContentPublisherMediaType() throws Exception {
    	  
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkContentTyp);
        QXClient.get().report().info("clicked on clkContentTyp ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilter);
        QXClient.get().report().info("clicked on clkApplyFilter ");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyFilteredResult), "verifyFilteredResult Option  is Not Displayed");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkResetBtn);
        QXClient.get().report().info("clicked on clkResetBtn ");
        
        
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkContentTyp);
        QXClient.get().report().info("clicked on clkContentTyp ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkPublisherType);
        QXClient.get().report().info("clicked on clkPublisherType ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilter);
        QXClient.get().report().info("clicked on clkApplyFilter ");
     QXClient.get().gestures().BlindWait(3000); 
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyFilteredResult), "verifyFilteredResult Option  is Not Displayed");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkResetBtn);
        QXClient.get().report().info("clicked on clkResetBtn ");
        
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkMediaType);
        QXClient.get().report().info("clicked on clkPublisherType ");
        QXClient.get().gestures().BlindWait(2000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilter);
        QXClient.get().report().info("clicked on clkApplyFilter ");
     QXClient.get().gestures().BlindWait(3000); 
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyFilteredResult), "verifyFilteredResult Option  is Not Displayed");
        QXClient.get().gestures().BlindWait(3000);
        
        
        
     
   }

    public void verifyLetUsKnow() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLetUsKnow);
        QXClient.get().report().info("Click on clkLetUsKnow");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSltBoardLUK);
        QXClient.get().report().info("Tap on clkSltBoardLUK button");
        QXClient.get().gestures().BlindWait(1000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.SltBoardValueLUK);
        QXClient.get().report().info("Tap on SltBoardValueLUK");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitLUK);
        QXClient.get().report().info("Tap on clkSubmitLUK");
        QXClient.get().gestures().BlindWait(2000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSltMediumLUK);
        QXClient.get().report().info("Tap on clkSltMediumLUK button");
        QXClient.get().gestures().BlindWait(1000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.SltMediumValueLUK);
        QXClient.get().report().info("Tap on SltMediumValueLUK");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitLUK);
        QXClient.get().report().info("Tap on clkSubmitLUK");
        QXClient.get().gestures().BlindWait(2000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkGradeLUK);
        QXClient.get().report().info("Tap on clkGradeLUK button");
        QXClient.get().gestures().BlindWait(1000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.SltGradeValueLUK);
        QXClient.get().report().info("Tap on SltGradeValueLUK");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitLUK);
        QXClient.get().report().info("Tap on clkSubmitLUK");
        QXClient.get().gestures().BlindWait(2000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubjectLUK);
        QXClient.get().report().info("Tap on clkSubjectLUK button");
        QXClient.get().gestures().BlindWait(1000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.SltSubjectValueLUK);
        QXClient.get().report().info("Tap on SltSubjectValueLUK");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitLUK);
        QXClient.get().report().info("Tap on clkSubmitLUK");
        QXClient.get().gestures().BlindWait(2000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkContentTypeLUK);
        QXClient.get().report().info("Tap on clkContentTypeLUK button");
        QXClient.get().gestures().BlindWait(1000);
                QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.SltContentValueLUK);
        QXClient.get().report().info("Tap on SltContentValueLUK");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitLUK);
        QXClient.get().report().info("Tap on clkSubmitLUK");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.submitBtn);
        QXClient.get().report().info("Tap on submitBtn");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyMatchedContent), "verifyMatchedContent Option  is Not Displayed");
        QXClient.get().report().info("Matched Contet Is displayed");

        QXClient.get().gestures().BlindWait(2000);
        

        
    }
    
    
    public void printPDF() throws Exception {
    	
        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkHamMenuPDFContent);
        QXClient.get().report().info("Click on clkHamMenuPDFContent");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkPDFIcon);
        QXClient.get().report().info("Tap on clkPDFIcon button");
        QXClient.get().gestures().BlindWait(7000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSelectPrinter);
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertPDFPrintPageScreen), "assertPDFPrintPageScreen Option  is Not Displayed");
        QXClient.get().report().info("assertPDFPrintPageScreen Is displayed");
        QXClient.get().gestures().BlindWait(2000);
      
}
    
   
    public void verifyIconInPDFHamburgerMenu() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkHamMenuPDFContent);
        QXClient.get().report().info("Click on clkHamMenuPDFContent");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkPDFIcon), "clkPDFIcon Option  is Not Displayed");
        QXClient.get().report().info("clkPDFIcon Is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkShareIcon), "clkShareIcon Option  is Not Displayed");
        QXClient.get().report().info("clkShareIcon Is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkDownloadIcon), "clkDownloadIcon Option  is Not Displayed");
        QXClient.get().report().info("clkDownloadIcon Is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkExitIcon), "clkExitIcon Option  is Not Displayed");
        QXClient.get().report().info("clkExitIcon Is displayed");
      
}
    
    public void verifyZoomInZoomOut() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkZoomInIcon);
        QXClient.get().report().info("Tap on clkZoomInIcon button");
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkZoomInIcon);
        QXClient.get().report().info("Tap on clkZoomInIcon button");
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkZoomInIcon);
        QXClient.get().report().info("Tap on clkZoomInIcon button");
        QXClient.get().gestures().BlindWait(4000);
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkZoomOutIcon);
        QXClient.get().report().info("Tap on clkZoomOutIcon button");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkZoomOutIcon);
        QXClient.get().report().info("Tap on clkZoomOutIcon button");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkZoomOutIcon);
        QXClient.get().report().info("Tap on clkZoomOutIcon button");
        QXClient.get().gestures().BlindWait(3000);
       
      
}
    
    
    
    public void verifyNextAndPreviousBtnInPDF() throws Exception {
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertNxtPageClk), "assertNxtPageClk Option  is Not Displayed");
        QXClient.get().report().info("assertNxtPageClk Is displayed");
        QXClient.get().gestures().BlindWait(2000);
      
        
        
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkPreivousPage);
        QXClient.get().report().info("Tap on clkPreivousPage button");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertPreviousPagClk), "assertPreviousPagClk Option  is Not Displayed");
        QXClient.get().report().info("assertPreviousPagClk Is displayed");
        QXClient.get().gestures().BlindWait(2000);
      
}
 public void tapOnPlayIcon3() throws Exception {
     QXClient.get().gestures().BlindWait(8000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.playIcon3);
        QXClient.get().report().info("Content starts to playIcon3");
        Thread.sleep(5000);
    }
 public void updateFeedbackAndSubmit(String toast) throws Exception {
	    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.feedbackchkbx1);
	    libraryCourseContentPageObjects.submitBtn.click();
	    //  libraryCourseContentPageObjects.feedbackPopUp.getText().equalsIgnoreCase(toast);
	    // QXClient.get().gestures().wait(4);
	    QXClient.get().report().info("Entering feedback and submit");
	}
 
 public void verifyNotifications() throws Exception{
	 QXClient.get().gestures().BlindWait(3000);

	 Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.bellIcon),"Bell is not displayed after login");
	 QXClient.get().report().info("Bell icon is visible");
	 QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.bellIcon);
	 QXClient.get().report().info("Clicked on Notification Bell Icon");
	 QXClient.get().gestures().BlindWait(3000);

	// Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.notificationDetails),"Notificaitons page is not displayed");
	 Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.noNotificationsText),"New Notifications are visible");

	 QXClient.get().gestures().BlindWait(5000);
	 QXClient.get().gestures().clkBackButton();
	}
 
 
 public void verifyPlayMp4Content() throws Exception{
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.firstMp4Content);
	    QXClient.get().report().info("Clicked on first mp4 searched content");
	    QXClient.get().gestures().BlindWait(3000);
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.playIconOfVideo),"Play icon is not visible");
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.playIconOfVideo);
	    QXClient.get().report().info("Clicked on Play button");
	    QXClient.get().gestures().BlindWait(6000);
	    QXClient.get().gestures().clkBackButton();
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOkBtn);
	    QXClient.get().gestures().clkBackButton();
	   }
 
 public void verifyPlayEpubContent() throws Exception{
     QXClient.get().gestures().BlindWait(3000);
     QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.firstEpubContent);
     QXClient.get().report().info("Clicked on first mp4 searched content");
     QXClient.get().gestures().BlindWait(3000);
     Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.playIconOfVideo),"Play icon is not visible");
     QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.playIconOfVideo);
     QXClient.get().report().info("Clicked on Play button");
     QXClient.get().gestures().BlindWait(6000);
     QXClient.get().gestures().clkBackButton();
     QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOkBtn);
 }
 public void verifyAssessmentConsumption() throws Exception{
     QXClient.get().gestures().BlindWait(3000);
     QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.firstAssessmentContent);
     QXClient.get().report().info("Clicked on first mp4 searched content");
     QXClient.get().gestures().BlindWait(3000);
     Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.playIconOfVideo),"Play icon is not visible");
     QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.playIconOfVideo);
     QXClient.get().report().info("Clicked on Play button");
     QXClient.get().gestures().BlindWait(6000);
     QXClient.get().gestures().clkBackButton();
     QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOkBtn);
 }
 
 public void verifyOptionsUnderFilterSection() throws Exception{
	   QXClient.get().gestures().BlindWait(3000);

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkLibrayFilter),"Library filter is not available");
	   QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
	   QXClient.get().report().info("Clicked on Filter Section Post search conternt");

	   QXClient.get().gestures().BlindWait(2000);

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkResetBtn),"Reset button is not available");
	   QXClient.get().report().info("Reset Button is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkLibBoard),"Board is not available");
	   QXClient.get().report().info("Board filter is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkLibClass),"Class is not available");
	   QXClient.get().report().info("Class filter is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkLibSubject),"Subject is not avaialble");
	   QXClient.get().report().info("Subject filter is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkMedium),"Medium is not available");
	   QXClient.get().report().info("Medium filter is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkContentTyp),"Content Type is not available");
	   QXClient.get().report().info("Content Type filter is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkPublisherType),"Publisher is not available");
	   QXClient.get().report().info("Publisher filter is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkMediaType),"Media Type is not available");
	   QXClient.get().report().info("Media Type filter is displayed");

	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkMeantFor),"Meant For is not available");
	   QXClient.get().report().info("MeantFor filter is displayed");

	}
 
 public void verifyShareBeforeEnrollCourse() throws Exception{
	    QXClient.get().gestures().BlindWait(3000);

	      tapOnShareBtn();
	      verifySharePopUIBeforeEnroll();
	      tapOnShareBtnFrmSharePop();
	      tapOnShareToWhatsApp();
	      verifyWhatsAppHomePage();
	  }

	public void verifyShareAfterEnrollCourse() throws Exception{
	    QXClient.get().gestures().BlindWait(3000);

	    tapOnShareBtn();
	    verifySharePopUI();
	    tapOnShareBtnFrmSharePop();
	    tapOnShareToWhatsApp();
	    verifyWhatsAppHomePage();
	}
	public void verifySharePopUIBeforeEnroll() {
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.shareLink), "Share link is displayed");
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.shareBtn1), "Share button is displayed");
	    QXClient.get().report().info("Verifying share pop up UI");

	}

	public void verifyFilterOptions() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibBoard);
        QXClient.get().report().info("clicked on clkLibBoard ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkResetBtn);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibBoard);
        QXClient.get().report().info("clicked on clkLibBoard ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibClass);
        QXClient.get().report().info("clicked on clkLibClass ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibSubject);
        QXClient.get().report().info("clicked on clkLibSubject ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkMedium);
        QXClient.get().report().info("clicked on clkMedium ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkContentTyp);
        QXClient.get().report().info("clicked on clkContentType ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter3);
        QXClient.get().report().info("clicked on sltFilter3 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkPublisherType);
        QXClient.get().report().info("clicked on clkPublisherType ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
       // QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkMediaType);
        QXClient.get().report().info("clicked on clkMediaType ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
       // QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter2);
        QXClient.get().report().info("clicked on sltFilter2 ");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkMeantFor);
        QXClient.get().report().info("clicked on clkMeantFor ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
        QXClient.get().report().info("clicked on sltFilter1 ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
        QXClient.get().report().info("clicked on clkConfirmBton ");
        QXClient.get().gestures().BlindWait(2000);
        /*QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");*/
        QXClient.get().gestures().BlindWait(3000);


        //QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilter);
        QXClient.get().report().info("clicked on clkApplyFilter ");
        QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyFilteredResult), "verifyFilteredResult Option  is Not Displayed");
       QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyFiltersForInteractiveContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkInteractiveContent);
        QXClient.get().report().info("Clicked on Interactive Content in Search page");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertExploreInteractiveContentPageText),"Explore interactive content text is not displayed");
        QXClient.get().report().info("Explore Interactive Content is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertSubjectFilter),"Subject filter is not displayed");
        QXClient.get().report().info("Subject filter is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertRoleFilter),"Role filter is not displayed ");
        QXClient.get().report().info("Role filter is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.advancedFilter),"Advanced filter is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.advancedFilter);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertResetFilterBtn),"Reset filter button is not displayed");
        QXClient.get().report().info("Reset filter is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkMediumFilter);
        QXClient.get().report().info("Clicked on Medium filter");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnCheckbox);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkClassFilter);
        QXClient.get().report().info("Clicked on Class filter");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnCheckbox);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkPublisherFilter);
        QXClient.get().report().info("Clicked on Publisher filter");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnCheckbox);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilterBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertInteractiveContentAfterFiltering),"Content is not displayed after Applied filters");
        QXClient.get().report().info("Content is displayed after Applied filters");
        QXClient.get().gestures().BlindWait(3000);


    }


    public void verfiyContentCardDetailsOfContent() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertContentTitle),"Content title is not displayed");
    QXClient.get().report().info("Content title is displayed in Content page");
        QXClient.get().gestures().BlindWait(2000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertContentCreator),"Content creator is not displayed");
    QXClient.get().report().info("Content creator is displayed in content page");
        QXClient.get().gestures().BlindWait(2000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertOrgFrameworkAttributes),"Org framework attributes is not displayed");
    QXClient.get().report().info("Org Framework Attributes is displayed in Content page");
        QXClient.get().gestures().BlindWait(2000);

    //Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertContentImage),"Contnet image is not displayed");
    QXClient.get().report().info("Content Image is displayed in Contnet page");
    QXClient.get().gestures().BlindWait(2000);
}


    public void verifyAllFilterInContentType() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkLibrayFilter);
        QXClient.get().report().info("clicked on clkLibrayFilter ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkContentTyp);
        QXClient.get().report().info("clicked on clkContentTyp ");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.ContentPlaylistFilter),"Content playlist is not dipslayed");
        QXClient.get().report().info("Content Playlist filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.CourseFilter),"Course Filter is not displayed");
        QXClient.get().report().info("Course filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.CourseAssessmentFilter),"Course Assessment filter is not displayed");
        QXClient.get().report().info("Course Assessment filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.DigitalTextbookFilter),"Digital textbook filter is not displayed");
        QXClient.get().report().info("Digital Textbook filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.EtextBookFilter),"Etextbook filter is not displayed");
        QXClient.get().report().info("Etextbook filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.ExplanationContentFilter),"Explanation content filter is not displayed");
        QXClient.get().report().info("Explanation content filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.LearningResourceFilter),"Learning resource filter is not displayed");
        QXClient.get().report().info("Learning Resource filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.PracticeQuestionSetFilter),"Practice Question Set filter is not displayed");
        QXClient.get().report().info("Practice Question Set filter is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.TeacherResourceFilter),"Teacher Resource filter is not displayed");
        QXClient.get().report().info("Teacher Resouce filter is displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();


    }
    public void observeTheAdditionalCategories() throws Exception{
       QXClient.get().gestures().BlindWait(2000);
       QXClient.get().gestures().swipeUp();

       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkAdditionalCategories);
       QXClient.get().report().info("Clicked on Additional categories filter");
       QXClient.get().gestures().BlindWait(2000);

       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.cctFilter),"Cct filter is not displayed");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.classRoomTeachingVideoFilter),"Class room teaching video filter is not displayed");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.curiosityQuestionSetFilter),"Curiosity questionset filter is not displayed");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.experientialResourceFilter),"Experiential resource filter is not displayed");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.learningOutcomeDefinitionFilter),"Learning outcome definition filter is not displayed");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.lessonPlanFilter),"Lesson plan filter is not displayed");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.markingSchemeRubicFilter),"Marking scheme filter is not displayed");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.TextBookFilter),"Textbook filter is not displayed");
       QXClient.get().gestures().BlindWait(3000);
       QXClient.get().gestures().clkBackButton();

    }

    public void verifyContentForContentTypeAndAdditionalCategoriesFilter() throws Exception{
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkContentTyp);
    QXClient.get().report().info("clicked on clkContentTyp ");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.ContentPlaylistFilter);
    QXClient.get().report().info("Clicked on Content Playlist filter");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
    QXClient.get().report().info("clicked on clkConfirmBton ");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkAdditionalCategories);
    QXClient.get().report().info("Clicked on Additional categories filter");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.lessonPlanFilter);
    QXClient.get().report().info("Clicked on Lesson plan filter");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkConfirmBton);
    QXClient.get().report().info("clicked on clkConfirmBton ");
    QXClient.get().gestures().BlindWait(3000);

   // QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilter);
    QXClient.get().report().info("clicked on clkApplyFilter ");
    QXClient.get().gestures().BlindWait(3000);

   // Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertContentPlaylistPrimaryFilter),"Primary filter is not displayed");
    QXClient.get().report().info("Primary Filter is displayed as per the selection");
    QXClient.get().gestures().BlindWait(2000);
   // Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.verifyFilteredResult), "verifyFilteredResult Option  is Not Displayed");
    QXClient.get().gestures().BlindWait(3000);

    }


    public void verifyAdoptedTextBookAsPerBoardInProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertFirstAdoptedTextBook),"First adopted text book is displayed");
        QXClient.get().report().info("First adopted textbook is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertAdoptedTextBookBasedOnBoardInProfile),"Adopted textbook is not displayed as per board in profile");
        QXClient.get().report().info("Adopted Textbook is displayed first as per the Board in profile");

        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertSecondTextBook),"Second textbook is not displayed");
        QXClient.get().report().info("Second textbook is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertNonAdoptedTextBook),"Non adopted textbook is not displayed");
        QXClient.get().report().info("Non adopted textbook is displayed after the adopted textbook");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.assertAdoptedTextBookBasedOnBoardInProfile);
        QXClient.get().report().info("Clicked on Adopted textbook");
        QXClient.get().gestures().BlindWait(8000);

        tapOnPlayIcon1();
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);
        tapOnOKbtn();

        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.closeRatingPopup);
        QXClient.get().gestures().BlindWait(5000);

    }

    public void verifyDownloadThePDFContentWhileConsumingPDFContent() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkHamMenuPDFContent);
        QXClient.get().report().info("Click on clkHamMenuPDFContent");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkDownloadIcon), "clkDownloadIcon Option  is Not Displayed");
        QXClient.get().report().info("clkDownloadIcon Is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkDownloadIcon);
        QXClient.get().report().info("Clicked on Download option in hamburger menu");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnDownloadBtn);
        QXClient.get().gestures().BlindWait(3000);

    }

    public void consumeThePDFContentCompletely() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnReplayBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);

     }

     public void verifyRatingPopup() throws Exception {
         QXClient.get().gestures().BlindWait(2000);
         if(!QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.startBtn)){
             QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkonBookContent);
             QXClient.get().gestures().BlindWait(3000);
         }else{
             QXClient.get().report().info("Rating popup is displayed");
         }
     }

     public void verifyContentsForPostApplyingFilterInTVclassesSection() throws Exception {
       QXClient.get().gestures().BlindWait(3000);

       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnTvClasses);
       QXClient.get().report().info("Clicked on TV Classes section in search page");
       QXClient.get().gestures().BlindWait(2000);

       Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertExploreTvClassesText),"Explore TV Classes text is not displayed");
       QXClient.get().report().info("Explore Tv Classes text is displayed ");

       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.advancedFilter);
       QXClient.get().report().info("Clicked on Advanced filter");
       QXClient.get().gestures().BlindWait(3000);

       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnSelectMedium);
       QXClient.get().report().info("Clicked on Select Medium in filters");
       QXClient.get().gestures().BlindWait(2000);

       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
       QXClient.get().report().info("First checkbox selected");
       QXClient.get().gestures().BlindWait(3000);

       QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitBtn);
       QXClient.get().report().info("Clicked on Submit button");
       QXClient.get().gestures().BlindWait(5000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnSelectClass);
         QXClient.get().report().info("Clicked on Select Class in filters");
         QXClient.get().gestures().BlindWait(2000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
         QXClient.get().report().info("First checkbox selected");
         QXClient.get().gestures().BlindWait(3000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitBtn);
         QXClient.get().report().info("Clicked on Submit button");
         QXClient.get().gestures().BlindWait(5000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnSelectPublisher);
         QXClient.get().report().info("Clicked on Select Publisher in filters");
         QXClient.get().gestures().BlindWait(4000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
         QXClient.get().report().info("First checkbox selected");
         QXClient.get().gestures().BlindWait(2000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitBtn);
         QXClient.get().report().info("Clicked on Submit button");
         QXClient.get().gestures().BlindWait(5000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkOnSelectMediaType);
         QXClient.get().report().info("Clicked on Select Media Type in filters");
         QXClient.get().gestures().BlindWait(3000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.sltFilter1);
         QXClient.get().report().info("First checkbox selected");
         QXClient.get().gestures().BlindWait(3000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.filterMediaType2);
         QXClient.get().report().info("Second checkbox selected");
         QXClient.get().gestures().BlindWait(3000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkSubmitBtn);
         QXClient.get().report().info("Clicked on Submit button");
         QXClient.get().gestures().BlindWait(5000);

         QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkApplyFilterBtn);
         QXClient.get().report().info("Clicked on Apply filter button");
         QXClient.get().gestures().BlindWait(5000);

         Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertContentForTVClasses),"Content is not available for Tv Classes section post applying filters");
         QXClient.get().report().info("Content is available for Tv Classes post applying filters");
         QXClient.get().gestures().BlindWait(3000);

     }

    public void tapOnPlayIcon4() throws Exception {
        QXClient.get().gestures().BlindWait(8000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.playIcon);
        QXClient.get().report().info("Content starts to Play Icon");
        Thread.sleep(5000);
    }

    public void validateNextButtonIsWorkingFine() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(1000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.clkNextPage);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkOnReplayBtn),"Replay text is not displayed at the end of the page");
        QXClient.get().report().info("Replay text is displayed at after consuming collection with pdf content");
        QXClient.get().report().info("Next button is working fine in collection with pdf content");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.clkExitIcon),"Exit text is not displayed at the end of page");
        QXClient.get().report().info("Exit text is displayed at the end of page ");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void clkOnVideoTogglebtn() throws Exception{

      QXClient.get().gestures().BlindWait(1000);
        if (QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.videoToggleBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.videoToggleBtn);
            QXClient.get().report().info("Clicked on Fullscreen mode");
            QXClient.get().gestures().BlindWait(1000);
        }
    }

    public void closeRatingPopup() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.closeRatingPopup);
        QXClient.get().report().info("Clicked on Close rating popup");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyPageReplacesLocationInContent() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertLocationText),"Location text is displayed");
    QXClient.get().report().info("Location text is not displayed");

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.assertPageText),"Page text is not displayed");
    QXClient.get().report().info("Page text is displayed instead of Location text");
    QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyNoDownloadBtnForLargeSizeBook() throws Exception {
       QXClient.get().gestures().BlindWait(3000);

       Assert.assertTrue(!QXClient.get().gestures().isElementPresent(libraryCourseContentPageObjects.downloadBtn),"Download button is displayed for large size content");
       QXClient.get().report().info("Download button is not displayed in book toc for large size content");
       QXClient.get().gestures().BlindWait(3000);
    }






}