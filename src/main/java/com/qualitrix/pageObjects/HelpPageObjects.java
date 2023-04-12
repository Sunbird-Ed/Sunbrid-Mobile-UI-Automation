 
package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * This Class has all the Objects related to Help Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 18/March/2020
 */
public class HelpPageObjects {

    @AndroidFindBy(xpath = "//android.view.View[@text='Help']")
    public MobileElement helpObj;

    @AndroidFindBy(xpath = "//android.view.View[@text='Frequently asked questions']")
    public MobileElement faqObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Report other issue']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='navigate to report issue. Report other issue']")
    })
    public MobileElement reportObj;

    @AndroidFindBy(className = "android.view.View")
    public List<MobileElement> listOfFaq;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='arrow back']")
    public MobileElement backBtn;

    @AndroidFindBy(xpath = "//*[@resource-id='tab-button-resources']")
    public MobileElement resourcesTab;

    @AndroidFindBy(xpath = "//*[@resource-id='buttonColors']")
    public MobileElement gotItBtn;
    

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='My groups']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'More ')]//following::android.view.View[3]")
})
public MobileElement clkMyGroups;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='my-group']//following::android.widget.Button"),
        @AndroidBy(xpath = "//android.view.View[@text='You are just a step away from creating a group']//following::android.widget.Button"),
        @AndroidBy(xpath = "//android.widget.Image[@text='my-group']//following::android.widget.Button")
    })
    
public MobileElement clkCreateGroup;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.EditText"),
})
public MobileElement enterGroupName;
  

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.EditText[2]"),
})
public MobileElement enterGroupDesc;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.Button"),
})
public MobileElement clkTermsAndCondition;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.Button[2]"),
})
public MobileElement clkGroupForCreation;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='My groups']//following::android.view.View"),
})
public MobileElement clkFirstCreateGroup;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='+ Add activity']"),
})
public MobileElement clkAddActivity;
  
    @AndroidFindBy(xpath = "//android.view.View[@text='Courses']")
    public MobileElement clkCourseInActivity;
    
   
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement clkNextButtonInActivity;
    

    @FindBy(className = "android.view.View")
    public List<WebElement> closeIcon;

    
  
  
}



