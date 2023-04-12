package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the objects related to Board, Medium and Class selection page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 16 march 2019
 */
public class BoardMediumClassSelectionPageObjects {

    @AndroidFindAll({
    	// @AndroidBy(xpath = "//android.widget.RadioButton[@resource-id='alert-input-5-12']"),
    	


    	
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='CBSE\u200E']"),
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='State (Assam) \u200E']"),
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='State (Assam)\u200E']")
          //  @AndroidBy(xpath = "//android.widget.RadioButton[@text='State (Karnataka)']")

    })
    public MobileElement selectStateBoard;

    @AndroidFindBy(xpath = "//android.view.View[@text='Select Board']")
    public MobileElement selectBoard;

    @AndroidFindBy(xpath = "//android.view.View[@text='Select Medium']")
    public MobileElement selectMedium;

    @AndroidFindBy(xpath = "//android.view.View[@text='Select Class']")
    public MobileElement selectClass;

    @AndroidFindBy(xpath = "//android.view.View[@text='Select district']")
    public MobileElement selectDistrict;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index='0']")
    public MobileElement selectEnglishMedium;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Chittoor']"),
            @AndroidBy(xpath = "//android.view.View[@text='Chittoor']"),
    })
    public MobileElement selectBagalkotDst;

    @AndroidFindBy(xpath = "//*[@resource-id='alert-input-23-1']")
    public MobileElement selectHindiMedium;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@index='0']")
    public MobileElement selectClassOne;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement cancelBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT' and @index='1']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT ' and @index='1']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT arrow round forward']")

          
    })
    public MobileElement submitBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT arrow round forward']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT arrow round forward ']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE arrow round forward']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE arrow round forward ']")
    })
    public MobileElement submitWithArrowBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select State']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select State']"),
    })
    public MobileElement selectState;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.ListView[@text='Select District']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select District']"),
    })
    public MobileElement selectDist;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Andhra Pradesh']"),
            @AndroidBy(xpath = "//android.view.View[@text='Andhra Pradesh']"),
    })
    public MobileElement selectStateName;
    
    
    @AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='+']"),

	})
	public MobileElement addUser;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.EditText[@index='0']"),

	})
	public MobileElement name;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='Add User']"),

	})
	public MobileElement addUserBtn;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='U']") })
	public MobileElement switchUser;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='U']"),

	})
	public MobileElement selectedUserPage;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[contains(@text,'More ')]"),

	})
	public MobileElement moreOption;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='Change User']"),

	})
	public MobileElement changeUser;

	
	 @AndroidFindAll({
        
         @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),

       
 })
 public MobileElement submitBtn2;

    
}