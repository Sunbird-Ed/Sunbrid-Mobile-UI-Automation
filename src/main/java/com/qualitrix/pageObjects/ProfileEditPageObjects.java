package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the Objects related to Profile Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 19/March/2020
 */
public class ProfileEditPageObjects {

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='EDIT']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='EDIT ']")
    })
    public MobileElement editBtn;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='call']")
    public MobileElement editPhnNumBtn;



    @AndroidFindBy(xpath = "//android.widget.Image[@text='mail']")
    public MobileElement editEmailBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN ']")
    })
    public MobileElement loginBtn;

    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement editName;

    @AndroidFindBy(xpath = "//*[@text='State \u200E *']//following::android.view.View[1]")
    public MobileElement stateDropDown;

    @AndroidFindBy(xpath = "//*[@text='Board \u200E *']//following::android.view.View[1]")
    public MobileElement selectBoard;

    @AndroidFindBy(xpath = "//*[@text='Medium *']//following::android.view.View[1]")
    public MobileElement selectMedium;

    @AndroidFindBy(xpath = "//*[@text='Class *']//following::android.view.View[1]")
    public MobileElement selectClass;

    @AndroidFindBy(xpath = "//*[@text='Subjects']//following::android.view.View[1]")
    public MobileElement selectSubjects;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.CheckBox[@text='English']"),
            @AndroidBy(xpath = "//android.widget.CheckBox[@text='English ']")
    })
    public MobileElement selectSubject;

    @AndroidFindBy(xpath = "//*[@text='District \u200E *']//following::android.view.View[1]")
    public MobileElement distDropDown;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @index='18']//following::android.widget.Button[1]")
    public MobileElement editSecondBtn;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='1']")
    public MobileElement selectState;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public MobileElement saveBtn;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='0']")
    public MobileElement selectDist;

    @AndroidFindBy(xpath = "//android.view.View[@text='Email Address']")
    public MobileElement emailInsideRecovery;

    @AndroidFindBy(xpath = "//*[contains(@text,'@gmail.com')]")
    public MobileElement recoveryId;


 
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='hh@gmail.com']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='hh*@gmail.com']"),
})
public MobileElement editedRecoveryId;


    @AndroidFindBy(xpath = "//android.view.View[@text='Mobile Number']")
    public MobileElement mblRecovery;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT' and @index='1']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT ' and @index='1']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT arrow round forward']")

      
})
public MobileElement submitBtn;

    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Add Recovery Account']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='']"),
})
public MobileElement editRecoveryId;

    
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ListView)[2]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'State')]//following::android.widget.ListView[1]"),
        @AndroidBy(xpath = "//android.widget.ListView[@text='Head Teacher & Officials']//following::android.widget.ListView[1]"),
})
public MobileElement clkStateDropdown;
   
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Andhra Pradesh']"),
		@AndroidBy(xpath = "//android.view.View[@text='Andhra Pradesh']"),

	})
	public MobileElement sltStateLoc;



    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ListView)[3]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'District')]//following::android.widget.ListView[1]"),
            @AndroidBy(xpath = "//android.widget.ListView[@text='Head Teacher & Officials']//following::android.widget.ListView[3]"),

    })
    public MobileElement clkDistrictLoc;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ListView)[4]"),

	})
	public MobileElement clkDistrictLoc1;
   
   
   @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.TextView[@text='Chittoor']"),
		@AndroidBy(xpath = "//android.view.View[@text='Chittoor']"),

	})
	public MobileElement sltDistrictLoc;

    
    
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ListView)[1]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Role')]//following::android.widget.ListView[1]"),
        @AndroidBy(xpath = "//android.widget.ListView[@index='0']"),
})
public MobileElement clkRoleDropdown;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='HT & Officials']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Head Teacher & Officials']"),
        @AndroidBy(xpath = "//android.view.View[@text='Head Teacher & Officials']"),
})
public MobileElement sltHeadTeachersAndOfficials;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Student']"),
        @AndroidBy(xpath = "//android.view.View[@text='Student']"),
})
public MobileElement sltStudent;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Parent']"),
        @AndroidBy(xpath = "//android.view.View[@text='Parent']"),
})
public MobileElement sltParent;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Teacher']"),
        @AndroidBy(xpath = "//android.view.View[@text='Teacher']"),
})
public MobileElement sltTeacher;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
})
public MobileElement clkSubmit;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ListView)[3]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subrole')]//following::android.widget.ListView[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subrole')]//following::android.widget.Image[2]"),
    })
    public MobileElement clkSubRoleDropdown;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='HM']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Headmaster']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='Headmaster']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='HM']"),
    })
    public MobileElement sltSubRoleDropdown;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Cluster Resource Person']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='CRP']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='Cluster Resource Person']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='CRP']"),
    })
    public MobileElement sltSubRoleDropdown1;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
})
public MobileElement clkSubmitEditProfile;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Ongoing')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationCourseContent')]")
})
public MobileElement onGoingCourse;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='refresh circle']")
})
public MobileElement refreshCircle;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Completed')]"),
})
public MobileElement completeCourse;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='My learning (1)']"),
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'My learning')]") ,
})
public MobileElement myLearningtext;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='This email address is already linked to your profile. Enter another email address']")
    public MobileElement assertErrorMessageForSameRecoveryIDOfUser;





    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')]//following::android.widget.ListView[1]")
    public MobileElement sltStateDropdown;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]//following::android.widget.ListView[1]")
    public MobileElement sltDistrictDropdown;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Block')]//following::android.widget.ListView[1]")
    public MobileElement sltBlockDropdown;


    @AndroidFindBy(xpath = "//android.widget.TextView[1]")
    public MobileElement sltFirstTextInDropdown;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'School')]//following::android.widget.ListView[1]")
    public MobileElement sltClusterDropdown;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select School']")
    public MobileElement sltSchoolDropdown;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Role')]")
    public MobileElement assertRoleInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'School')]")
    public MobileElement assertSchoolInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Block')]")
    public MobileElement assertBlockInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]")
    public MobileElement assertDistrictInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')]")
    public MobileElement assertStateInProfile;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subrole')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subrole')]//following::android.widget.ListView[2]"),
    })
    public MobileElement clkSubpersonaInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Welcome')]")
    public MobileElement assertWelcomeTextOnHomePage;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Learn, Manage')]")
    public MobileElement assertLearnManageActHeaderInHomePage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='APSTATE']")
    public MobileElement sltStateLocForSubOrg;


    @AndroidFindBy(xpath = "//android.widget.TextView")
    public MobileElement assertNoLocationForSubOrg;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select District']")
    public MobileElement assertSelectDistrictText;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Small AutomationCourseContent')]"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'My learning')]//following::android.view.View[contains(@text,'Small AutomationCourseContent')]")
    })
    public MobileElement assertCourseInMyLearningSection;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Try new DIKSHA experience']"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new DIKSHA')]"),
            @AndroidBy(xpath = "//android.view.View[@text='help Try new DIKSHA experienceBeta']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Try new diksha_ntptest_org experience']"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new')]"),
    })
    public MobileElement clkNewDikshExperiece;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
    })
    public MobileElement clkBackBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Edit Role')]")
    public MobileElement firstEditBtn;


    @AndroidFindBy(xpath ="//android.widget.Button[contains(@text,'Edit Board')]")
    public MobileElement secondEditBtn;



    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'HT & Officials')]")
    public MobileElement clkOnHTandOfficialsRole;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Teacher']")
    public MobileElement sltTeacherRole;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Programs']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Programs']"),
    })
    public MobileElement clkPrograms;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'More')]")
    public MobileElement moreBtnInProfile;


    @AndroidFindBy(xpath = "//android.view.View[@text='Test']")
    public MobileElement assertUserNameInProfile;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'User ID')]")
    public MobileElement assertUserIDTextBelowUsername;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Diksha')]"),
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'ID:')]"),
      })
    public MobileElement assertDikshaIDBelowUsername;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'test')]")
    public MobileElement assertDikshaID;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Board')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Board')]"),
      })
    public MobileElement assertBoard;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Board')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Medium')]"),
      })
    public MobileElement assertMedium;
  


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Class')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Class')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Classes')]"),
    })
    public MobileElement assertClass;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Add Mobile Number')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Add Mobile Number']"),
    })
    public MobileElement addMobileNoField;


    @AndroidFindBy(xpath = "//android.view.View[@text='Otp To Update Contact']")
    public MobileElement assertUpdateContactPopup;


    @AndroidFindBy(xpath = "//android.view.View[@text='Enter OTP to edit your contact information']")
    public MobileElement assertEnterOTPtoEditInformationText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Enter OTP']")
    public MobileElement assertEnterOTPText;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement editTextField;


    @AndroidFindBy(xpath = "//android.view.View[@text='Incorrect OTP. Number of attempts remaining : 1']")
    public MobileElement assertIncorrectOTPMessage;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Failed to validate OTP')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Failed to validate OTP. Try again later']")
    })
    public MobileElement assertFailedToValidateOTPMsg;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='declared-phone']")
    public MobileElement mobileNumberEditField;


   @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.Button[@text='validate']"),
           @AndroidBy(xpath = "//android.widget.Button[contains(@text,'validate')]"),
   })
    public MobileElement validateBtn;


   @AndroidFindBy(xpath = "//android.view.View[@text='Verify Mobile Number']")
    public MobileElement assertVerifyMobileNumberText;


   @AndroidFindBy(xpath = "//android.view.View[@text='You will receive an SMS with the OTP for mobile number verification']")
    public MobileElement assertReceiveSMSText;


   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter OTP']")
    public MobileElement assertEnterOTPTextInMobileNumber;


   @AndroidFindBy(xpath = "//android.widget.Button[@text='RESEND OTP']")
    public MobileElement assertResendOTPlink;


   @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement assertCancelBtn;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='declared-email']")
    public MobileElement EmailEditField;


    @AndroidFindBy(xpath = "//android.view.View[@text='Verify Email Address']")
    public MobileElement assertVerifyEmailAddressText;


    @AndroidFindBy(xpath = "//android.view.View[@text='You will receive an email with the OTP for email address verification']")
    public MobileElement assertReceiveEmailWithOTPText;

}
  

