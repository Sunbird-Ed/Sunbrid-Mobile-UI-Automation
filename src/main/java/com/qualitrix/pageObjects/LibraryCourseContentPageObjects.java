package com.qualitrix.pageObjects;

import cucumber.api.java.cs.A;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * This Class has all the Objects related to Library coourse content Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 24/March/2020
 */
public class LibraryCourseContentPageObjects {


    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='download content Download']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='cloud download Download']"),

})
public MobileElement downloadBtn;
  

    @AndroidFindBy(xpath = "//android.widget.Button[@text='notifications outline']")
    public MobileElement notificationBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEE MORE BOOKS AND CONTENT']")
    public MobileElement viewMoreOpt;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SORT BY']")
    public MobileElement sortBy;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='mediumScroll']")
    public MobileElement mediumScroll;

   
    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.Button[@text='share Share']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='share content Share']"),

})
public MobileElement shareBtn;

    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='trash Delete']")
    public MobileElement deleteBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='A Happy Child ']")
    public MobileElement audioContent;

    @AndroidFindAll({

            @AndroidBy(xpath = "//android.widget.Button[@text='PLAY']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='play-circle']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='PLAY']"),
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'PLAY')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='share content Share']//following::android.widget.Button"),

    })
    public MobileElement playIcon;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Play video']")
    public MobileElement playIcon1;

    
    @AndroidFindAll({
    	 @AndroidBy(xpath="//android.widget.Image[@text='arrow up']//following::android.widget.Image")
      //  @AndroidBy(xpath = "//android.widget.Button[@text='PLAY']")
})
public MobileElement qnWithImage;

  
   /* @AndroidFindBy(xpath = "//*[contains(@text,'Unit 1')]//following::android.view.View[6]")
    // @AndroidFindBy(xpath = "//android.view.View[@text='Question with image']")
    public MobileElement qnWithImage;
*/
    @AndroidFindBy(xpath = "//android.view.View[@text='Read More']")
    public MobileElement readMore;

    @AndroidFindBy(xpath = "//android.view.View[@text='Thank you for rating the content!']")
    public MobileElement feedbackPopUp;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='trash Delete']")
    public MobileElement trashDelete;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='share Share']")
    public MobileElement shareIconInsideContent;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='5out of five stars']")
    public MobileElement rateObj;

    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.Button[contains(@text,'rate content Rate')]"),
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'star')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='star']"),
    })
    public MobileElement startBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement submitBtn;

    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement editText;

    @AndroidFindAll({
    	
    @AndroidBy(xpath = "//android.widget.CheckBox[@resource-id='ion-cb-0']"),
    @AndroidBy(xpath = "//android.view.View[@text='Content is inaccurate']"),
})
public MobileElement feedbackChkbx;
    


    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public MobileElement okBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='All']")
    public MobileElement allBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[contains(@text,'Three Little Pigs')]"),
            @AndroidBy(xpath = "//*[contains(@text,'Unit 1')]")
    })
    public MobileElement content1;

    @AndroidFindBy(xpath = "//*[contains(@text,'Unit 1')]")
    public MobileElement unit1;

    @AndroidFindBy(xpath = "//*[contains(@text,'UT 10sep')]")
    public MobileElement secondContent;

    @AndroidFindBy(xpath = "//*[contains(@text,'Unit 2')]")
    public MobileElement unit2;

    @AndroidFindBy(xpath = "//*[contains(@text,'The Bubble')]")
    public MobileElement content2;

    @AndroidFindBy(xpath = "//*[contains(@text,'One Little Kitten')]")
    public MobileElement content3;

    @AndroidFindBy(xpath = "//*[contains(@text,'The Tailor')]")
    public MobileElement content4;

    @AndroidFindBy(xpath = "//*[contains(@text,'Clouds')]")
    public MobileElement content5;

    @AndroidFindBy(xpath = "//android.view.View[@text='Video']")
    public MobileElement videoBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Documents']")
    public MobileElement documentsBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Interactive']")
    public MobileElement interactionBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Credits & License info, Collapsed']"),
            @AndroidBy(xpath = "//android.view.View[@text='Credits & License info, Collapsedarrow down']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Credits & License Info']"),
            @AndroidBy(xpath = "//android.view.View[@text='Credits & License Info']"),
            @AndroidBy(xpath = "//android.view.View[@text='Credits & License Infoarrow down']"),
    })
    public MobileElement licenseBtn;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='License terms:']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='CC BY 4.0']"),
            @AndroidBy(xpath = "//android.view.View[@text='CC BY 4.0']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by-sa/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by/4.0/legalcode']")
    })
    public MobileElement termsAndCondLink;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Copyright:']"),
            @AndroidBy(xpath = "//android.view.View[@text='Odisha, 2019']")
    })
    public MobileElement copyRightObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Created on DIKSHA by:']"),
           // @AndroidBy(xpath = "//android.view.View[@text='Qualitrix Content Creator Cr']")
            @AndroidBy(xpath = "//android.view.View[@text='content creator']")

    })
    public MobileElement createdObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Published on DIKSHA by:']"),
            @AndroidBy(xpath = "//android.view.View[@text='diksha_ntptest_org']")
    })
    public MobileElement publishObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='License terms:']"),
            @AndroidBy(xpath = "//android.view.View[@text='CC BY-NC-SA 4.0']"),
            @AndroidBy(xpath = "//android.view.View[@text='CC BY 4.0']")

            
    })
    public MobileElement licenseTermsObj;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='Share link']"),
            @AndroidBy(xpath = "//android.view.View[@text='Share link']")
    })
    public MobileElement shareLink;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='Send file']"),
            @AndroidBy(xpath = "//android.view.View[@text='Send file']")
    })
    public MobileElement sendFile;


   @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.RadioButton[@text='Save file on device']"),
           @AndroidBy(xpath = "//android.view.View[@text='Save file on device']")
   })
    public MobileElement saveFile;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
            @AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
            @AndroidBy(xpath = "//android.view.View[@text='Assam English 1 book']")

    })
    public MobileElement courseContent;

    @AndroidFindAll({
       // @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
        //@AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationBookContent']")

})
public MobileElement offlineplayCont;

    
    @AndroidFindBy(xpath = "//android.view.View[@text='Book contains copied contents']")
    public MobileElement downloadBook;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Sachin book 2']"),
            @AndroidBy(xpath = "//android.view.View[@index='3']")
    })
    public MobileElement copiedBook;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Question with image']")
    })
    public MobileElement bookContent;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Share']")
    public MobileElement shareBtn1;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEND']")
    public MobileElement sendBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Share with']")
    public MobileElement shareAlertPopUp;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'WhatsApp')]"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='WhatsApp']"),
                })
    public MobileElement shareToWhatsApp;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Slack']")
    public MobileElement shareToSlackApp;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
    public MobileElement clkAllowBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.whatsapp:id/contactpicker_row_name']")
    public MobileElement whatsAppHomePage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Share in Slack']")
    public MobileElement slackSharePage;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'AutomationBookContent-v1.ecar')]")
    public MobileElement assertMalformedEcarFile;


    @AndroidFindAll({
            @AndroidBy(className = "android.widget.GridView"),
            @AndroidBy(className = "android.widget.ListView")
    })
    public MobileElement thirdPartyApp;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Select chapter']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='arrow dropright circle']")
    })
    public MobileElement selectChapterObj;

    @AndroidFindBy(xpath = "//android.view.View[@text='Audio']")
    public MobileElement audioObj;

    @AndroidFindBy(xpath = "//android.view.View[@text='Images']")
    public MobileElement imageObj;

    @AndroidFindBy(className = "android.view.View")
    public List<MobileElement> booksIndex;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='SEE MORE BOOKS AND CONTENT']"),
})
public MobileElement clkSeeMoreBooksAndContent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@resource-id='gradeLevel1']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Class ')][2]"),
    })
    public MobileElement clkClass1;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@resource-id='gradeLevel2']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Class ')][3]"),
    })
    public MobileElement clkClass2;


    @AndroidFindAll({
    	
        @AndroidBy(xpath = "//android.widget.Button[@text='Settings']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Settings']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Settings')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Settings']"),
    })

    public MobileElement Clksettings;

    @AndroidFindAll({
       
        @AndroidBy(xpath = "//android.widget.TextView[@text='Data Sync']"),
         @AndroidBy(xpath = "//android.view.View[@text='Data Sync']"),
         @AndroidBy(xpath = "//android.view.View[@text='Data Sync Backup Data, Transfer Telemetry']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Data Sync Backup Data, Transfer Telemetry']"),

 })
 public MobileElement ClkDataSync;

    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SYNC NOW']")
    public MobileElement ClkSyncNow;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Share the SUNBIRD app']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Share the SUNBIRD app']"),
            @AndroidBy(xpath = "//android.view.View[@text='Share the SUNBIRD app']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Share the DIKSHA app']"),
            @AndroidBy(xpath = "//android.view.View[@text='Share the DIKSHA app']"),
    })
    public MobileElement ShareDikshaApp;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Users and Groups']")
    public MobileElement clkUsersAndGroups;
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CREATE NEW USER']")
    public MobileElement clkCreateNewUser;
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public MobileElement clkSaveCreateUser;
  
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='GROUPS']")
    public MobileElement clkGroups;
  
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CREATE NEW GROUP']")
    public MobileElement clkCreateNewGroup;
    
    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
     public MobileElement enterGroupName;
  
    @AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")
    public MobileElement ClkNextButtonGroup;
 
    @AndroidFindBy(xpath ="//android.view.View[@text='SELECT ALL']")
    public MobileElement clkSltAllUsers;
    
    @AndroidFindBy(xpath ="//android.widget.Button[@text='CREATE GROUP']")
    public MobileElement clkCreateGroup;
  

    @AndroidFindAll({
    	
        @AndroidBy(xpath ="//android.widget.TextView[@text='About Us']"),
            @AndroidBy(xpath ="//android.view.View[@text='About Us']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='About Us']"),
    })
    public MobileElement clkAboutUs;
    
  

    @AndroidFindAll({
        // @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
         //@AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='Device ID']"),
         @AndroidBy(xpath = "//android.view.View[@text='Device ID']"),
         @AndroidBy(xpath = "//android.view.View[@text='About Us']//following::android.view.View[8]")

 })
 public MobileElement deviceIDLabel;
    
    @AndroidFindBy(xpath ="//android.view.View[@text='Device ID']//following::android.view.View[1]")
    public MobileElement verifyDeviceID;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='share information']"),
            @AndroidBy(xpath ="//android.widget.Button[@text='share']"),
    })
    public MobileElement ClkshareDeviceID;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='search'][@class='android.widget.Button']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='search']//following::android.view.View[1]"),
            @AndroidBy(xpath ="//android.widget.Button[@text='search']//following::android.widget.Image[1]")
    })
    public MobileElement verifyBookAfterChangingClass;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='TEXTBOOK']"),
            @AndroidBy(xpath ="//android.widget.TextView[@text='Textbooks']"),
    })
    public MobileElement clkTextbook;
      
  
    
    @AndroidFindBy(xpath ="//android.widget.Button[@text='search']//following::android.view.View[3]")
    public MobileElement verifyBookAfterClickingSeeMoreBooks;
  
   

 
    @AndroidFindAll({
       
         @AndroidBy(xpath = "//android.widget.Button[@text='search filter']"),
         @AndroidBy(xpath = "//android.widget.Button[@index='3']"),


 })
 public MobileElement clkLibrayFilter;

  
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Board/Syllabus']"),
        // @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
         //@AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
         @AndroidBy(xpath = "//android.view.View[@text='Board']"),
         @AndroidBy(xpath = "//android.view.View[@text='Board/Syllabus']")

 })
 public MobileElement clkLibBoard;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.CheckBox)[1]"),
            @AndroidBy(xpath ="//android.view.View[@text='Select From The Following']//following::android.widget.CheckBox[1]"),
    })
    public MobileElement sltFilter1;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.CheckBox)[3]"),
            @AndroidBy(xpath ="//android.view.View[@text='Select From The Following']//following::android.widget.CheckBox[3]"),
    })
    public MobileElement sltFilter2;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.CheckBox)[5]"),
            @AndroidBy(xpath ="//android.view.View[@text='Select From The Following']//following::android.widget.CheckBox[5]"),
    })
    public MobileElement sltFilter3;
  
    @AndroidFindBy(xpath ="//android.widget.Button[@text='CONFIRM']")
    public MobileElement clkConfirmBton;
  
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Class']"),
            @AndroidBy(xpath ="//android.view.View[@text='Class']"),
    })
    public MobileElement clkLibClass;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Subject']"),
            @AndroidBy(xpath ="//android.view.View[@text='Subject']"),
    })
    public MobileElement clkLibSubject;

    @AndroidFindAll({
            @AndroidBy(xpath ="//android.widget.Button[contains(@text,'APPLY')]"),
            @AndroidBy(xpath ="//android.widget.Button[contains(@text,'APPLY FILTER')]"),
            @AndroidBy(xpath ="//android.widget.Button[@text='APPLY FILTER']")
    })
    public MobileElement clkApplyFilter;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'results for')]//following-sibling::android.view.View[1]"),
            @AndroidBy(xpath ="//android.widget.Image[@index='0'][1]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'results for')]//following::android.view.View[1]"),
    })
    public MobileElement verifyFilteredResult;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Content Type']"),
         @AndroidBy(xpath = "//android.view.View[@text='Content Type']"),

 })
 public MobileElement clkContentTyp;

    
    
    @AndroidFindAll({
        
        @AndroidBy(xpath = "//android.widget.Button[@text='RESET filter by']")


})
public MobileElement clkResetBtn;
    
    
 @AndroidFindAll({
         @AndroidBy(xpath = "//android.widget.TextView[@text='Publisher']"),
        @AndroidBy(xpath = "//android.view.View[@text='Publisher']"),
})
public MobileElement clkPublisherType;
 
 
 @AndroidFindAll({
         @AndroidBy(xpath = "//android.widget.TextView[@text='Media Type']"),
     @AndroidBy(xpath = "//android.view.View[@text='Media Type']"),
})
public MobileElement clkMediaType;
 
 
 @AndroidFindAll({
     
     @AndroidBy(xpath = "//android.widget.Button[@text='LET US KNOW HERE']")
  
})
public MobileElement clkLetUsKnow;
 

 @AndroidFindAll({
     @AndroidBy(xpath = "//android.widget.ListView[@text='Select Board']"),
     @AndroidBy(xpath = "//android.view.View[@text='Select Board']"),
  })
public MobileElement clkSltBoardLUK;
 
 @AndroidFindAll({
     @AndroidBy(xpath = "//android.widget.TextView[@text='State (Andhra Pradesh)']"),
     @AndroidBy(xpath = "//android.view.View[@text='State (Andhra Pradesh)']"),
  })
public MobileElement SltBoardValueLUK;
 

@AndroidFindAll({
     
     @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']")
  })
public MobileElement clkSubmitLUK;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.ListView[@text='Select Medium']"),
    @AndroidBy(xpath = "//android.view.View[@text='Select Medium']"),
 })
public MobileElement clkSltMediumLUK;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='English']"),
    @AndroidBy(xpath = "//android.view.View[@text='English']"),
 })
public MobileElement SltMediumValueLUK;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.ListView[@text='Select Grade']"),
    @AndroidBy(xpath = "//android.view.View[@text='Select Grade']"),
 })
public MobileElement clkGradeLUK;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='Class 1']"),
    @AndroidBy(xpath = "//android.view.View[@text='Class 1']"),
 })
public MobileElement SltGradeValueLUK;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.ListView[@text='Select Subject']"),
    @AndroidBy(xpath = "//android.view.View[@text='Select Subject']"),
 })
public MobileElement clkSubjectLUK;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='English']"),
        @AndroidBy(xpath = "//android.view.View[@text='English']"),
 })
public MobileElement SltSubjectValueLUK;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.ListView[@text='Select Content Type']"),
    @AndroidBy(xpath = "//android.view.View[@text='Select Content Type']"),
 })
public MobileElement clkContentTypeLUK;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='Digital Textbook']"),
    @AndroidBy(xpath = "//android.view.View[@text='Digital Textbook']"),
 })
public MobileElement SltContentValueLUK;


@AndroidFindAll({
    @AndroidBy(xpath = "(//android.widget.Button)[2]"),
    @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='back']//following::android.widget.Button[1]"),
 })
public MobileElement verifyMatchedContent;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@resource-id='overlay-button']")
 })
public MobileElement clkHamMenuPDFContent;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.view.View[@text='Print']")
 })
public MobileElement clkPDFIcon;


@AndroidFindBy(xpath = "//android.widget.TextView[@text='Select a printer']")
public MobileElement clkSelectPrinter;


@AndroidFindAll({
@AndroidBy(xpath = "//android.widget.TextView[@text='Save as PDF']")
})
public MobileElement assertPDFPrintPageScreen;


@AndroidFindAll({    
    @AndroidBy(xpath = "//android.view.View[@text='Share']")
 })
public MobileElement clkShareIcon;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Download']"),
    @AndroidBy(xpath = "//android.view.View[@text='Download']"),
 })
public MobileElement clkDownloadIcon;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.view.View[@text='Exit']")
 })
public MobileElement clkExitIcon;


@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='zoom in']")
 })
public MobileElement clkZoomInIcon;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='zoom out']")
 })
public MobileElement clkZoomOutIcon;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='navigation-arrows-previousIcon']")
 })
public MobileElement clkPreivousPage;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='navigation-arrows-nextIcon']")
 })
public MobileElement clkNextPage;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.EditText[@text='2']"),
    @AndroidBy(xpath = "//android.widget.EditText[@text='2.0']"),
    
 })
public MobileElement assertNxtPageClk;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.EditText[@text='1']"),
    @AndroidBy(xpath = "//android.widget.EditText[@text='1.0']"),
 })
public MobileElement assertPreviousPagClk;



@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Image[@index='0']")
 })
public MobileElement clkFirstPDFContent;

@AndroidFindAll({

    @AndroidBy(xpath = "//android.widget.Button[@text='Play video']"),
    @AndroidBy(xpath = "//android.widget.Button[@text='share content Share']//following::android.widget.Button"),

})
public MobileElement playIcon3;


@AndroidFindBy(xpath = "//android.view.View[@text='Content is not relevant']")
public MobileElement feedbackchkbx1;

@AndroidFindBy(xpath = "//android.widget.Button[@text='notifications']")
public MobileElement bellIcon;

@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Notification')]")
public MobileElement notificationDetails;

@AndroidFindBy(xpath = "//android.view.View[@text='No new notification']")
public MobileElement noNotificationsText;

@AndroidFindAll({
        @AndroidBy(xpath = "(//android.view.View[contains(@text,'mp4')])[2]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'mp4')]//following::android.view.View"),
})
public MobileElement firstMp4Content;

@AndroidFindBy(xpath = "(//android.view.View[contains(@text,'epub')])[2]")
public MobileElement firstEpubContent;

@AndroidFindBy(xpath = "(//android.view.View[contains(@text,'Assess')])[2]")
public MobileElement firstAssessmentContent;

@AndroidFindAll({
@AndroidBy(xpath = "//android.widget.TextView[@text='Medium']"),
    @AndroidBy(xpath = "//android.view.View[@text='Medium']"),

})
public MobileElement clkMedium;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Meant For']"),
    @AndroidBy(xpath = "//android.view.View[@text='Meant For']"),

})
public MobileElement clkMeantFor;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Interactive Content']")
    public MobileElement clkInteractiveContent;


     @AndroidFindBy(xpath = "//android.view.View[@text='Explore Interactive Content']")
    public MobileElement assertExploreInteractiveContentPageText;


     @AndroidFindBy(xpath = "//android.view.View[@text='Subject, Subject']")
    public MobileElement assertSubjectFilter;


     @AndroidFindBy(xpath = "//android.view.View[@text='Role, Role']")
    public MobileElement assertRoleFilter;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']")
    public MobileElement advancedFilter;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='reset filter RESET']")
    public MobileElement assertResetFilterBtn;


     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.ListView[contains(@text,'Select Medium')]"),
             @AndroidBy(xpath = "//android.view.View[@text='Medium']//following::android.widget.Image[1]"),
     })
    public MobileElement clkMediumFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox")
    public MobileElement clkOnCheckbox;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
    public  MobileElement clkSubmitBtn;


     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.ListView[contains(@text,'Select Class')]"),
             @AndroidBy(xpath = "//android.view.View[@text='Class']//following::android.widget.Image[1]"),
     })
    public MobileElement clkClassFilter;


     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.ListView[contains(@text,'Select Publisher')]"),
             @AndroidBy(xpath = "//android.view.View[@text='Publisher']//following::android.widget.Image[1]"),
     })
    public MobileElement clkPublisherFilter;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Apply']")
    public MobileElement clkApplyFilterBtn;


     @AndroidFindAll({
             @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE')]"),
             @AndroidBy(xpath = "//android.view.View[contains(@text,'Assamese')]"),
     })
    public MobileElement assertInteractiveContentAfterFiltering;


     @AndroidFindBy(xpath = "//android.view.View[@text='AutomationBookContent']")
    public MobileElement assertContentTitle;


     @AndroidFindBy(xpath = "//android.view.View[@text='Bycontent creator']")
    public MobileElement assertContentCreator;


     @AndroidFindBy(xpath = "//android.view.View[@text='CBSEEnglishClass 12Accountancy']")
    public MobileElement assertOrgFrameworkAttributes;


     @AndroidFindBy(xpath = "//android.view.View[@text='AutomationBookContent']//following::android.view.View[3]")
    public MobileElement assertContentImage;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='content playlist']")
    public MobileElement ContentPlaylistFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='course']")
    public MobileElement CourseFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='course assessment']")
    public MobileElement CourseAssessmentFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='digital textbook']")
    public MobileElement DigitalTextbookFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='etextbook']")
    public MobileElement EtextBookFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='explanation content']")
    public MobileElement ExplanationContentFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='learning resource']")
    public MobileElement LearningResourceFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='practice question set']")
    public MobileElement PracticeQuestionSetFilter;


     @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='teacher resource']")
    public MobileElement TeacherResourceFilter;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Content Playlist']")
    public MobileElement assertContentPlaylistPrimaryFilter;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Additional Categories']")
    public MobileElement clkAdditionalCategories;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='cct']")
    public MobileElement cctFilter;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='classroom teaching video']")
    public MobileElement classRoomTeachingVideoFilter;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='curiosity question set']")
    public MobileElement curiosityQuestionSetFilter;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='experiential resource']")
    public MobileElement experientialResourceFilter;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='learning outcome definition']")
    public MobileElement learningOutcomeDefinitionFilter;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='lesson plan']")
    public MobileElement lessonPlanFilter;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='marking scheme rubric']")
    public MobileElement markingSchemeRubicFilter;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='textbook']")
    public MobileElement TextBookFilter;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State (Karnataka)')]")
    public MobileElement assertAdoptedTextBookBasedOnBoardInProfile;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Showing 100 results for')]//following::android.view.View[1]//following::android.view.View[contains(@text,'State (Karnataka)')]")
    public MobileElement assertFirstAdoptedTextBook;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 100 results for')]//following::android.view.View[3]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 100 results for')]//following::android.view.View[10]"),
    })
    public MobileElement assertSecondTextBook;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State (Maharashtra)')]")
    public MobileElement assertNonAdoptedTextBook;


    @AndroidFindBy(xpath = "//android.widget.Image[@text='close']")
    public MobileElement closeRatingPopup;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='DOWNLOAD']")
    public MobileElement clkOnDownloadBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Replay']")
    public MobileElement clkOnReplayBtn;


    @AndroidFindBy(xpath = "//android.widget.ToggleButton[contains(@text,'PLAY')]")
    public MobileElement clkonBookContent;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Tv Classes']")
    public MobileElement clkOnTvClasses;

    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Tv Classes']")
    public MobileElement assertExploreTvClassesText;


    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Select Medium')]")
    public MobileElement clkOnSelectMedium;

    @AndroidFindBy(xpath = "//android.widget.CheckBox")
    public List<WebElement> checkBox;


    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Select Class')]")
    public MobileElement clkOnSelectClass;

    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Select Publisher')]")
    public MobileElement clkOnSelectPublisher;

    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Select Media Type')]")
    public MobileElement clkOnSelectMediaType;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'CLASSROOMTEACHINGVIDEO')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'MP4')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Explanation Content']//following::android.view.View[3]"),
    })
    public MobileElement assertContentForTVClasses;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
    })
    public MobileElement clkBackBtn;


    @AndroidFindBy(xpath = "(//android.widget.CheckBox)[2]")
    public MobileElement filterMediaType2;


    @AndroidFindBy(xpath = "//android.widget.ToggleButton")
    public MobileElement videoToggleBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Page')]")
    public MobileElement assertPageText;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Location')]")
    public MobileElement assertLocationText;
}


