package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * This Class has all the Objects related to Download Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 24/March/2020
 */
public class DownloadPageObjects {

    @AndroidFindBy(xpath = "//android.view.View[@index='5']")
    public MobileElement courseContentObj;

    @AndroidFindAll({
//            @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
//            @AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
//            @AndroidBy(xpath = "//android.view.View[@text='Book contains copied contents']"),
    	 @AndroidBy(xpath = "//android.widget.TextView[@text='AutomationBookContent']"),
            @AndroidBy(xpath = "//android.view.View[@text='AutomationBookContent']"),

    })
    public MobileElement bookObj;

    @AndroidFindAll({
//      @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
//      @AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
//      @AndroidBy(xpath = "//android.view.View[@text='Book contains copied contents']"),
      @AndroidBy(xpath = "//android.view.View[@text='DownloadAutomationContent']")

})
public MobileElement coureobj;
    
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Delete')]")
    public MobileElement deleteBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='settings']")
    public MobileElement settingBtn;
    
    @AndroidFindAll({
      @AndroidBy(xpath = "//android.view.View[@text='10SecPDF']")

})
public MobileElement resourceName;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Select All']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select All']"),
    })
    public MobileElement assertSelectAll;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sort By Content size']")
    public MobileElement assertSorting;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Content size']")
    public MobileElement assertContentSize;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Last viewed']")
    public MobileElement assertLastViewed;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Delete Content?']"),
            @AndroidBy(xpath = "//android.view.View[@text='Delete Content?']"),
    })
    public MobileElement assertDeleteContentPopup;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'AutomationBookContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationBookContent')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Select All']//following::android.view.View[3]"),
    })
    public MobileElement assertContentInDownloadSection;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='No downloads yet']"),
            @AndroidBy(xpath = "//android.view.View[@text='No downloads yet']"),
    })
    public MobileElement noDownloadsYetMessage;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='HOW TO DOWNLOAD HINDI TEXT BOOKS KSEEB']"),
    })
    public MobileElement assertDownloadedAdoptedTextbook;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='limited course']"),

    })
    public MobileElement assertDownloadedQuestionSetCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='PDF_13.pdf']"),
            @AndroidBy(xpath = "//android.view.View[@text='PDF_13.pdf']"),
    })
    public MobileElement assertDownloadedPDFContent;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
    })
    public MobileElement clkBackBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='settings']")
    public MobileElement clkSettingsBtn;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Storage Settings']"),
        @AndroidBy(xpath = "//android.view.View[@text='Storage Settings']"),
})
public MobileElement assertStorageSettingsTextInDownloadsPage;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Large')]"),
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'LargeSizeAutoBook')]"),
    @AndroidBy(xpath = "//android.widget.TextView[@text='LargeSizeAutoBook']"),
    @AndroidBy(xpath = "//android.view.View[contains(@text,'LargeSizeAutoBook')]"),
})
public MobileElement assertDownloadedBookInDownlaodSection;






    @AndroidFindBy(xpath = "//android.view.View[@text='AutomationCourseContent']")
    public MobileElement assertLastViewedContent;


    @AndroidFindBy(xpath = "//android.view.View[@text='AutomationBookContent']")
    public MobileElement assertContentSizeContent;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sort By Last viewed']")
    public MobileElement assertLastViewedDownArrow;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Play video']")
    public MobileElement assertPlayBtn;


  

    @AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='About']"),
    @AndroidBy(xpath = "//android.view.View[@text='About']"),
})
public MobileElement assertAboutSection;




    

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='DOWNLOAD_TRANSCRIPT']")
    public MobileElement assertDownloadTranscriptText;


    @AndroidFindBy(xpath = "//android.widget.Image[@text='download']")
    public MobileElement clkTranscriptDownloadImage;


    @AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='About']"),
    @AndroidBy(xpath = "//android.view.View[@text='DOWNLOAD_TRANSCRIPT']"),
})
public MobileElement assertDOWNLOAD_TRANSCRIPTText;


    @AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Select language']"),
    @AndroidBy(xpath = "//android.widget.Spinner[@text='Select language']"),
})
public MobileElement clkSltLanguage;
    


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='English']")
    public  MobileElement sltEnglishLanguage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Download']")
    public MobileElement clkTranscriptDownloadBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Jan13 Large mp4')]")
    public MobileElement assertLargeContentTitle;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='download content Download']")
    public MobileElement assertDisableDownloadBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'This content cannot be downloaded')]")
    public MobileElement assertContentCanNotBeDownloadedMsg;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select where to save the data']")
    public MobileElement assertSelectWhereToSaveTheDataText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Storage']")
    public MobileElement assertStorageText;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'phone-storage')]")
    public MobileElement phoneStorageRadioBtn;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'sc-card-storage')]")
    public MobileElement sdCardStorageRadioBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains@text,'Move Content to SD Card')]")
    public MobileElement assertMoveToSDCardText;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Move']")
    public MobileElement moveBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Content successfully moved to SD')]")
    public MobileElement assertContentSuccessfullyMovedToSDCardMsg;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public MobileElement okBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains@text,'Move Content to Phone')]")
    public MobileElement assertMoveToPhoneText;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Content successfully moved to ')]")
    public MobileElement assertContentMovedSuccessfullyToPhoneMsg;

    
}



