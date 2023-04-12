package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

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



    @AndroidFindBy(xpath = "//android.view.View[@text='Select All']")
    public MobileElement assertSelectAll;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sort By Content size']")
    public MobileElement assertSorting;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Content size']")
    public MobileElement assertContentSize;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Last viewed']")
    public MobileElement assertLastViewed;



    @AndroidFindBy(xpath = "//android.view.View[@text='Delete Content?']")
    public MobileElement assertDeleteContentPopup;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationBookContent')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Select All']//following::android.view.View[3]"),
    })
    public MobileElement assertContentInDownloadSection;


    @AndroidFindBy(xpath = "//android.view.View[@text='No downloads yet']")
    public MobileElement noDownloadsYetMessage;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='HOW TO DOWNLOAD HINDI TEXT BOOKS KSEEB']"),
    })
    public MobileElement assertDownloadedAdoptedTextbook;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='limited course']"),

    })
    public MobileElement assertDownloadedQuestionSetCourse;


    @AndroidFindBy(xpath = "//android.view.View[@text='PDF_13.pdf']")
    public MobileElement assertDownloadedPDFContent;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
    })
    public MobileElement clkBackBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='settings']")
    public MobileElement clkSettingsBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Storage Settings']")
    public MobileElement assertStorageSettingsTextInDownloadsPage;
    
}



