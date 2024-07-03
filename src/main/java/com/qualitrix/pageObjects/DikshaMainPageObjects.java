package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import org.openqa.selenium.WebElement;


public class DikshaMainPageObjects {

	@AndroidFindBy(xpath = "//android.widget.Button[@text='English']")
    public MobileElement sltLang;
    
    
	  @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	    public MobileElement clickContinue;
    
    
	  @AndroidFindBy(xpath = "//android.widget.Button[@text='Teacher']")
	    public WebElement clickTeacher;

	  @AndroidFindBy(xpath = "//android.widget.Button[@text='Selected Board']")
	  public MobileElement selectBoard;

    @AndroidFindBy(className = "android.widget.Button")
    public List<MobileElement> continuAsTeacher;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")

    public MobileElement submitBtn;
   

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='CBSE\u200E']")
    public MobileElement selectStateBoard;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='CBSE/NCERT\u200E']"),

    })
    public MobileElement selectStateBoard1;


    @AndroidFindBy(xpath = "//android.view.View[@text='Selected Class, Class']")
    public MobileElement selectClass;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    public MobileElement submitWithArrowBtn;
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Select district']")
    public MobileElement selectDistrict;

        
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.CheckBox[@index='0']")
     
})
public MobileElement selectEnglishMedium;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='0']")
    public MobileElement selectBagalkotDst;

    @AndroidFindBy(xpath = "//*[@resource-id='alert-input-23-1']")
    public MobileElement selectHindiMedium;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index='0']")
    public MobileElement selectClassOne;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Class 6']")
    public MobileElement selectClassSix;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement cancelBtn;

//    @AndroidFindBy(xpath = "//android.view.View[@text='multiple select']")
//    public MobileElement selectMedium;
//

    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.view.View[@text='Selected Medium, Medium']"),    	
    	@AndroidBy(xpath = "//android.view.View[@text='multiple select']"),
            @AndroidBy(xpath = "//android.widget.Spinner[@text='Selected Medium, Medium']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Medium, Medium']"),
            @AndroidBy(xpath = "//android.widget.Spinner[@text='Select Medium, Medium']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='multiple select']"),
    })
    public MobileElement selectMedium;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel']")
    public MobileElement clkClosePoup;
    
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Student']"),
        @AndroidBy(xpath = "//android.view.View[@text='Student']"),
})
  public WebElement clickStudent;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='ic_search']"),
        @AndroidBy(xpath = "//*[contains(@text,'search')]")
})
public MobileElement searchIcon;
 
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='ic_action_search']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='ic_action_search ']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='search']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='search ']")
})
public MobileElement actionSearchIcon;

@AndroidFindBy(className = "android.widget.EditText")
public MobileElement searchBar;
    
@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='AutomationBookContent']")
})
public MobileElement BookSearch;
    
    
@AndroidFindBy(xpath = "//android.widget.Button[@text='share Share']")
public MobileElement shareBtn;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Share']")
public MobileElement shareBtn1;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share with']")
public MobileElement shareAlertPopUp;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='WhatsApp']")
public MobileElement shareToWhatsApp;

@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.whatsapp:id/contactpicker_row_name']")
public MobileElement whatsAppHomePage;
    
    
@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='courses Trainings']"),
    @AndroidBy(xpath = "//android.view.View[@text='courses Trainings ']"),
    @AndroidBy(xpath = "//*[contains(@text,'courses Trainings')]")
})
public MobileElement trainingTab;


@AndroidFindAll({
   /* @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']"),
    @AndroidBy(xpath = "//android.view.View[@text='Copy of AutomationCourseContent']"),
    @AndroidBy(xpath = "//android.view.View[@text='DownloadAutomationContent']"),
    @AndroidBy(xpath = "//android.view.View[@text='AssesmentAutomationContent']")
 */
    @AndroidBy(xpath = "//*[contains(@text,'courses Trainings')]")

})
public MobileElement CourseSearch;

    
@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.Button[@text='play-circle']"),
    @AndroidBy(xpath = "//android.widget.Button[@text='PLAY']")
})
public MobileElement playIcon;
    
    
@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
public MobileElement okBtn;

@AndroidFindBy(xpath = "//android.widget.Button[@text='cloud download Download']")
public MobileElement downloadBtn;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.Button[@text='Download']"),
    @AndroidBy(xpath = "//android.widget.Button[@text='Download ']")
})
public MobileElement downloadPopUpBtn;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='downloads Downloads']"),
    @AndroidBy(xpath = "//android.view.View[@text='downloads Downloads ']"),
    @AndroidBy(xpath = "//*[contains(@text,'downloads Downloads')]")
})
public MobileElement downloadTab;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='HT & Officials']"),
    @AndroidBy(xpath = "//android.view.View[@text='Leader']"),
    @AndroidBy(xpath = "//android.view.View[@text='Student']//following::android.view.View"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Head Teacher & Officials']"),
})
public MobileElement clickLeader;


@AndroidFindBy(xpath = "//android.widget.CheckBox[@index='1']")
public MobileElement selectHindiMediumBMS;

@AndroidFindBy(xpath = "//android.widget.CheckBox[@index='1']")
public MobileElement selectClassTwo;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='HT & Officials']"),
    @AndroidBy(xpath = "//android.view.View[@text='Head Teacher & Officials']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Head Teacher & Officials']"),
})
public MobileElement clkHeadTeacherAndOfficials;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.Button[@text='SWITCH TO NEW EXPERIENCE']"),
})
public MobileElement switchNewExperienceBtn;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Scan QR code']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Scan QR code']"),
})
public MobileElement assertScanQRCode;


@AndroidFindAll({
	
	
    @AndroidBy(xpath = "//android.widget.Button[@text='Selected Board']"),

    @AndroidBy(xpath = "//android.widget.Button[@text='Select Board']"),
        @AndroidBy(xpath = "//android.view.View[@text='Board']"),
})
public MobileElement assertSelectBoard;


@AndroidFindBy(xpath = "//android.widget.Button[@text='SWITCH TO NEW EXPERIENCE']")
    public MobileElement clkOnSwitchToNewExperience;

@AndroidFindBy(xpath ="//android.widget.Button[@text='Allow']")
public MobileElement clickAllow;


}