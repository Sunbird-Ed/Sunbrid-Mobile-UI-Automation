package com.qualitrix.pageObjects;

import cucumber.api.java.en.And;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.security.cert.X509Certificate;
import java.util.List;

/**
 * This Class has all the Objects related to Profile Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 19/March/2020
 */
public class ProfilePageObjects {

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN ']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='log in outline Login']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Login']"),

    })
    public MobileElement loginBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Training(s) Attended')]")
    public MobileElement trainingAttendedSec;

    @AndroidFindBy(xpath = "//*[contains(@text,'Small AutomationCourseContent')]")
    public MobileElement courseObj;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']"),
})
public MobileElement signInwithGoogle;



    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Use another account']"),
})
public MobileElement clkUseAnotherAccount;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='ntp.net.in']//following::android.view.View[3]"),
})
public MobileElement emailEnter;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Next']"),
})
public MobileElement clkEmailNext;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='dikshatest13@gmail.com']//following::android.view.View[5]"),
})
public MobileElement emailPasswordEnter;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Diksha R']"),
})
public MobileElement verifyUsrnameGmailInProfSec;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Diksha r']"),
            @AndroidBy(xpath = "//android.view.View[@text='Diksha R']")
    })
    public MobileElement verifyUsrnameGmailInMenuSec;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='logout Log out']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Log out']"),
            @AndroidBy(xpath = "//android.view.View[@text='Log out']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Log out']"),
    })
    public MobileElement verifyLogOutForeGmailInMenuSec;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Login']"),
})
public MobileElement loginBtnInTraningTab;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.ListView[@index='0']"),
})
public MobileElement clkRoleDropdown;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Head Teacher & Officials']"),
})
public MobileElement sltHeadTeachersAndOfficials;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Student']"),
})
public MobileElement sltStudent;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Parent']"),
})
public MobileElement sltParent;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'SUBMIT')]"),
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
})
public MobileElement clkSubmit;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']"),
})
public MobileElement clkSubRoleDropdown;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='Headmaster']"),
})
public MobileElement sltSubRoleDropdown;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
})
public MobileElement clkSubmitEditProfile;


    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.TextView[@text='Welcome To SUNBIRD']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with SUNBIRD']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']"),
    })
    public MobileElement clkLoginWithDikshaBtn;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']"),
})
public MobileElement SignWithGoogle;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Discover content as a']"),
            @AndroidBy(xpath = "//android.view.View[@text='Discover content as a']"),
    })
    public MobileElement assertDiscoverContentLabel;

    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Content preference']"),
        @AndroidBy(xpath = "//android.view.View[@text='Content preference']"),
})
public MobileElement assertContentPreferenceLabelProfile;

  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='ROLE']"),
        @AndroidBy(xpath = "//android.view.View[@text='ROLE']"),
})
public MobileElement assertRoleContentPreferenceLabelProfile;

  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='BOARD']"),
        @AndroidBy(xpath = "//android.view.View[@text='BOARD']"),
})
public MobileElement assertBoardContentPreferenceLabelProfile;
    

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='MEDIUM']"),
        @AndroidBy(xpath = "//android.view.View[@text='MEDIUM']"),
})
public MobileElement assertMediumContentPreferenceLabelProfile;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='CLASS']"),
        @AndroidBy(xpath = "//android.view.View[@text='CLASS']"),
})
public MobileElement assertClassContentPreferenceLabelProfile;

 
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='SUBJECT']"),
            @AndroidBy(xpath = "//android.view.View[@text='SUBJECT']"),
    })
    public MobileElement assertSubjectContentPreferenceLabelProfile;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='DISTRICT']"),
        @AndroidBy(xpath = "//android.view.View[@text='DISTRICT']"),
})
public MobileElement assertDistrictContentPreferenceLabelProfile;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='STATE']"),
        @AndroidBy(xpath = "//android.view.View[@text='STATE']"),
})
public MobileElement assertStateContentPreferenceLabelProfile;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='edit District']"),
        @AndroidBy(xpath = "//android.view.View[@text='DISTRICT']//following::android.widget.Image"),
            @AndroidBy(xpath = "//android.view.View[@text='DISTRICT']//following::android.widget.Button[1]"),
})
public MobileElement clkEditLocation;


    @AndroidFindAll({
    	
    	
    	
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Choose content preferences')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Choose content preferences')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Choose content preferences']"),
    })
    public MobileElement assertChooseContentPreferenceLabelLocationEdit;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='dikshatest13@gmail.com']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='dikshatest15@gmail.com']"),
    })
    public MobileElement clkExistingGmailId;


    @AndroidFindAll({
    	
    	
       @AndroidBy(xpath = "//android.widget.Button[@text='Update']")})
   public MobileElement clkonprofilepageupdatebutton;


   @AndroidFindBy(xpath = "//android.view.View[@text='ID as requested by your State, Board or Org']//following::android.widget.EditText[1]")
   public MobileElement enteridasrequestedbyyourStateBoardOrg;

   @AndroidFindBy(xpath = "//android.view.View[@text='Your ID from State/Board/Org:']")
   public MobileElement youridfromstatetext;

   @AndroidFindBy(xpath = "//android.view.View[@text='Your ID from State/Board/Org:']//following::android.view.View[1]")
   public MobileElement resulttextofyourid;

   @AndroidFindAll({
       @AndroidBy(xpath = "//android.widget.TextView[@text='Register here link']"),
       @AndroidBy(xpath = "//android.view.View[@text='Register here']")
})
public MobileElement clkRegisterHere;

   

   @AndroidFindAll({
       @AndroidBy(xpath = "//android.widget.TextView[@text='Register on SUNBIRD']"),
           @AndroidBy(xpath = "//android.view.View[@text='Register on SUNBIRD']"),
           @AndroidBy(xpath = "//android.view.View[@text='Register on DIKSHA']"),

   })
   public MobileElement assertRegisterPage;


   @AndroidFindAll({
           @AndroidBy(xpath = "//android.view.View[contains(@text,'Select year of birth')]//following-sibling::android.view.View"),
           @AndroidBy(xpath = "//android.widget.TextView[@text='Select year of birth']"),
           @AndroidBy(xpath = "//android.view.View[@text='Select year of birth']"),
   })
   public MobileElement selectYearOfBirth;

   @AndroidFindAll({
	 
       @AndroidBy(xpath = "//android.widget.TextView[@text='2022']"),
           @AndroidBy(xpath = "//android.view.View[@resource-id='mat-option-0']"),
           @AndroidBy(xpath = "//android.view.View[@text='2022']"),
   })
   public MobileElement selectYear;

  @AndroidFindAll({
          @AndroidBy(xpath = "//*[@resource-id='signup-form-name']"),
          @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[1]"),
  })
   public MobileElement nameEditTextField;

  @AndroidFindAll({
      @AndroidBy(xpath = "//android.view.View[@text='Email Address']"),
          @AndroidBy(xpath = "//android.widget.TextView[@text='Email Address']"),
          @AndroidBy(xpath = "//android.view.View[@text='Email address']"),
  })
   public MobileElement clkOnEmailAddress;

  @AndroidFindAll({
          @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
          @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[2]"),
  })
   public MobileElement emailEditTextField;

  @AndroidFindAll({
          @AndroidBy(xpath = "//*[@resource-id='signup-form-password']"),
          @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[3]"),
  })
  public MobileElement passwordEditTextField1;


  @AndroidFindAll({
          @AndroidBy(xpath = "//*[@resource-id='signup-form-confirmPassword']"),
          @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[4]"),
  })
    public MobileElement passwordEditTextField2;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='signup-form-confirmPassword']")
    public MobileElement confirmPasswordEditTextField;


  @AndroidFindBy(xpath = "//android.view.View[@text='Your email address is already registered']")
   public MobileElement alreadyRegisteredEmailMessage;

  @AndroidFindAll({
		  
      @AndroidBy(xpath = "//android.widget.TextView[@text='LOGIN']"),
          @AndroidBy(xpath = "//android.widget.TextView[@text='Login']"),
          @AndroidBy(xpath = "//android.widget.TextView[@text='Login to DIKSHA']"),
  })
  public MobileElement assertLoginPageText;
  
 
 
 @AndroidFindAll({
	  
     @AndroidBy(xpath = "//android.widget.Image[@text='app logo']"),
         @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']"),
 })
 public MobileElement assertLoginWithDikshaOption;
 
 
 
 @AndroidFindBy(xpath = "//android.widget.Button[@text='Login with state system']")
  public MobileElement assertLoginWithStateSystemOption;
 @AndroidFindBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']")
  public MobileElement assertSignInwithGoogleOption;


  
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Name')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]"),
})
public MobileElement assertNameField;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText[@resource-id='signup-form-name']"),
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
    })
    public MobileElement firstEditField;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Mobile Number']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='Mobile Number']"),

})
    public MobileElement assertMobileNumber;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Email Address']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Email Address']"),
            @AndroidBy(xpath = "//android.view.View[@text='Email address']"),
    })
    public MobileElement assertEmailAddress;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='(An OTP will be sent to verify mobile number or email address)']"),
            @AndroidBy(xpath = "//android.view.View[@text='You will receive an OTP to verify your mobile number or email address']"),
    })
    public MobileElement assertOtpMessage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Password*']")
    public MobileElement assertPasswordField;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Your password must contain a minimum of 8 ')]")
    public MobileElement assertPasswordLimitationsMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Confirm Password')]")
    public MobileElement assertConfirmPasswordField;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Fields marked with an asterisk (*) are mandatory')]")
    public MobileElement assertMandatoryField;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@content-desc='SUNBIRD Terms of Use']"),
            @AndroidBy(xpath = "//android.widget.CheckBox[contains(@text,'I understand and accept the DIKSHA Terms of Use')]"),
            @AndroidBy(xpath = "//android.widget.CheckBox[contains(@text,'I understand and accept the SUNBIRD Terms of Use')]"),
    })

    public MobileElement assertTCcheckBox;


    @AndroidFindBy(xpath = "//android.view.View[@text='Enter a valid email address']")
    public MobileElement validateErrorMsgForInvalidEntry;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[contains(@text,'edit Role')]"),
        @AndroidBy(xpath = "//android.widget.Button[@text='add Subjects']"),
})

public MobileElement clkAdd;

    
  


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Subrole')]")
    public MobileElement assertSubPersona;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='edit District']")
    public MobileElement clkOnLocationEditImage;



    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[@text='Choose content preferences']"),
        @AndroidBy(xpath = "//android.view.View[@text='Choose content preferences']"),
})

public MobileElement assertChooseContentPreferencesLabel;

    @AndroidFindBy(xpath = "//android.view.View[@text='Profile details']")
    public MobileElement assertProfileDetailsLabel;


    @AndroidFindBy(xpath = "//android.view.View[@text='Device location']")
    public MobileElement assertDeviceLocationLabel;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='edit Board']")
    public MobileElement clkEditBoard;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Board')]")
    public MobileElement clkOnBoard;


    @AndroidFindBy(xpath = "//android.widget.RadioButton")
    public List<WebElement> RadioBtns;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='CBSE/NCERT\u200E']")
    public MobileElement assertCBSEBoard;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'IGOT')]")
    public MobileElement assertIGOTBoard;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='State (Andhra Pradesh)\u200E']")
    public MobileElement assertStateAndhraBoard;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='State (Bihar)\u200E']")
    public MobileElement assertStateBiharBoard;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Teacher')]")
    public MobileElement assertTeacherRoleInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State (Karnataka)')]")
    public MobileElement assertBoardInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'English')]")
    public MobileElement assertMediumInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class 4')]")
    public MobileElement assertClassInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Board')]")
    public MobileElement clkOBoard;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='CBSE/NCERT\u200E']")
    public MobileElement selCBSEBoard;


    @AndroidFindAll({
            //@AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
    })

    public MobileElement clkOnSubmitBtn;

    
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Select Medium')]")
    public MobileElement clkOnMedium;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='English']")
    public MobileElement selEnglish;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Select Class')]")
    public MobileElement clkOnClass;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Class 1']")
    public MobileElement selClass1;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Select Subject')]")
    public MobileElement clkOnSubject;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Save']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SAVE']"),
    })
    public MobileElement clkOnSaveBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSE/NCERT')]")
    public MobileElement assertCbseBoardInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class 1')]")
    public MobileElement assertClass1InProfile;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='State (Karnataka)\u200E']")
    public MobileElement selKarnatakaBoard;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Class 4']")
    public MobileElement selClass4;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Update']"),
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Update')]"),

          //  @AndroidBy(xpath = "//android.view.View[contains(@text,'yopmail.com')]//following-sibling::android.view.View[1]"),

    })
    public MobileElement clkOnUpdate;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.ListView)[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='I wish to share my data with:']//following::android.view.View[1]"),
    })
    public MobileElement clkOnOrganizationField;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='State (Punjab)']"),
            @AndroidBy(xpath = "//android.view.View[@text='State (Punjab)']"),
    })
    public MobileElement clkStatePunjabOrg;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='I wish to share my data with State (Punjab)']"),
        @AndroidBy(xpath = "//android.view.View[@text='I wish to share my data with State (Punjab)']"),
})
public MobileElement assertConsentWithPunjabOrg;

  

    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.RadioButton[@text='Mizoram']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='Andra']"),
         @AndroidBy(xpath = "//android.widget.TextView[@text='Andra Pradesh']"),
         @AndroidBy(xpath = "//android.view.View[@text='Andra Pradesh']")
    })
    public MobileElement clkOnAndraOrg;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='I wish to share my data with mizoram']"),
        @AndroidBy(xpath = "//android.view.View[@text='I wish to share my data with mizoram']"),
        @AndroidBy(xpath = "//android.view.View[@text='I wish to share my data with Andra Pradesh']"),
                })
    
    public MobileElement assertConsentWithAndraOrg;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select year of birth']")
    public MobileElement assertYOBPopup;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='signup-form-password']")
    public MobileElement passwordEditTextFieldOne;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='resetGoogleCaptcha']"),
        @AndroidBy(xpath = "//android.widget.CheckBox[@resource-id='tncAccepted']"),
})
public MobileElement clkOntncAccepted;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Register']")
    public MobileElement clkOnRegisterBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='One Time Password (OTP)']")
    public MobileElement assertOneTimePasswordText;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath = "//android.view.View[@text='One Time Password (OTP)']//following::android.widget.EditText"),
    })
    public MobileElement clkOnEditOTPField;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement clkOnSubmitBtnn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Incorrect OTP. Number of attempts remaining : 1']")
    public MobileElement assertToastMessageOfIncorrectOTP;


    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.TextView[@text='Forgot Password link, Double tap to activate']"),
            @AndroidBy(xpath = "//android.view.View[@text='Forgot Password ?']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Forgot password?']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Forget password?']"),
    })
    public MobileElement clkOnForgetPassword;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath = "//android.view.View[@text='Email address/Mobile Number']//following::android.widget.EditText"),
    })
    public MobileElement clkOnEmailEditField;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[3]"),
            @AndroidBy(xpath = "//android.view.View[@text='Name']//following::android.widget.EditText"),
    })
    public MobileElement clkOnNameEditField;


    @AndroidFindAll({
    	
        @AndroidBy(xpath = "//android.widget.Button[@index='3']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Next']"),
           
    })
    public MobileElement clkOnNextBtn;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email address / Mobile number is not registered with SUNBIRD']")
    public MobileElement assertEmailNotRegisteredMessage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='The entry does not match the name registered with SUNBIRD']")
    public MobileElement assertNameNotRegisteredMessage;

    

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Recover Account']"),
        @AndroidBy(xpath = "//android.view.View[@text='Recover Account']"),
})
public MobileElement assertRecoverAccountText;




    @AndroidFindBy(xpath = "//android.view.View[@text='Email address/Mobile Number']")
    public MobileElement assertEmailaddressMobileNumberLabel;



    @AndroidFindBy(xpath = "//android.view.View[@text='Name']")
    public MobileElement assertNameLabel;


    @AndroidFindBy(xpath = "//android.view.View[@text='You have exceeded maximum retry. Please try after some time']")
    public MobileElement assertErrorMessageInLoginPage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Login']")
    public MobileElement assertLoginTextInLoginPage;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'You will receive an OTP')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'You will receive an OTP')]"),
})
public MobileElement assertMessageRelatedToOTP;

   

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'@yopmail.com')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'@yopmail.com')]"),
})
public MobileElement assertEmailAddressToSendOTP;
   


    @AndroidFindBy(xpath = "//android.view.View[@text='State (Karnataka)\u200E']")
    public MobileElement assertStateKarnatakBoard;


    @AndroidFindAll({
    	 @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Stag')]"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='Stag67']"),
        @AndroidBy(xpath = "//android.view.View[@text='Test']"),
})
public MobileElement assertUserNameInProfile;
   
    
  
    @AndroidFindAll({
    	 @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'stag')]"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='stag67_1quf']"),
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'test')]"),
})
public MobileElement assertDikshaIDInProfile;




    @AndroidFindBy(xpath = "//android.widget.Button[@text='Refresh']")
    public MobileElement clkRefreshBtn;



    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,\"Learner passbook\")]"),
    	@AndroidBy(xpath = "//android.view.View[contains(@text,'Learner passbook')]"),
})
public MobileElement assertLearnerPassbooksectionInProfile;
    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.Button[@text=\"eye Certificate\"][2]"),
    	@AndroidBy(xpath = "//android.view.View[contains(@text,'Learner passbook')]//following::android.widget.Button[@text='eye Certificate'][1]"),
})
public MobileElement assertCertificateUnderLearnerPassbooksection;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Download Download']")
    public MobileElement assertDownloadBtnPostClickingCertificate;




    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.Button[@text='Allow']"),
    	@AndroidBy(xpath = "//android.widget.Button[@text=\"ALLOW\"]"),
})
public MobileElement clkAllowbtn;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Invalid Email Address/Mobile number or password. Please try again with valid credentials']"),
        @AndroidBy(xpath = "//android.view.View[@text='Invalid Email Address/Mobile number or password. Please try again with valid credentials']"),
})
public MobileElement assertInvalidMsgForAlreadyMergedAccount;

    @AndroidFindBy(xpath = "//android.view.View[@text='Select State']")
    public MobileElement selectState;

    @AndroidFindBy(xpath = "//android.view.View[@text='Select District']")
    public MobileElement selectDist;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Enter Email Address / Mobile number']//following::android.widget.EditText[1]"),
    })
    public MobileElement assertEnterYourEmailPlaceholder;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath ="//android.view.View[@text='Password']//following::android.widget.EditText[1]"),
    })
    public MobileElement assertPasswordPlaceholder;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
    public MobileElement assertLoignBtnInUppercase;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Forgot Password link, Double tap to activate']")
    public MobileElement assertForgotText;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'to access relevant learning material and enroll for courses')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']//following::android.widget.TextView[1]"),
    })
    public MobileElement assertDontHaveAnAccountBelowLoginBtn;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Register here')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']//following::android.view.View[@text='Register here']"),
    })
    public MobileElement assertRegisterHereBelowLoginBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']")
    public MobileElement assertLoginWithGoogleBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Register here']//following::android.widget.Button[contains(@text,'google-logo')]")
    public MobileElement assertLeftsideGoogleLogo;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Change']")
    public MobileElement clkOnChangePreferenceBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSE ')]")
    public MobileElement assertCBSEBoardInHomePage;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'English ')]")
    public MobileElement assertEnglishMediumInHomePage;


    @AndroidFindBy(xpath = "//android.view.View[@text='CLUSTER']")
    public MobileElement assertClusterInProfilePage;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Block')]")
    public MobileElement assertBlockInProfilePage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    public MobileElement clkContinueBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Block']")
    public MobileElement assertBlockLabel;


    @AndroidFindBy(xpath = "//android.view.View[@text='Cluster']")
    public MobileElement assertClusterLabel;


    @AndroidFindBy(xpath = "//android.view.View[@text='School']")
    public MobileElement assertSchoolLabel;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='signup-form-name']")
    public MobileElement nameEditField1;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Enter mobile number or email address of your')]")
    public MobileElement assertMobileOrEmailAddressFieldsOfRegistereHerePage;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Your password must contain a minimum of 8 characters.')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'.')]"),
    })
    public MobileElement assertFullStopIsPresentBelowPasswordField;


    @AndroidFindBy(xpath = "//android.widget.Image[@text='sunbird']")
    public MobileElement assertSunbirdText;


  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Welcome to SUNBIRD']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='Welcome To SUNBIRD']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Welcome to SUNBIRD')]"),
})
public MobileElement assertWelcomeToSunbirdText;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Register on SUNBIRD')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Register on SUNBIRD')]"),
})
public MobileElement assertRegisterOnSunbirdText;
    


    

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Already have an account? Login here']")
    public MobileElement assertAlreadyHaveAnAccountTextAndLoginBtn;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'To discover relevant content update the following')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'To discover relevant content update the following')]"),
})
public MobileElement assertToDiscoverRelevantContentText;
    



    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Teacher, selected')]")
    public MobileElement assertTeacherRoleAlreadySelected;


    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.ListView[@resource-id='mat-select-2']"),
        @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'Karnataka, selected')]"),
            @AndroidBy(xpath = "//android.widget.ListView[contains(@text,'Karnataka, selected')]"),
    })
    public MobileElement assertStateValueAutoPopulated;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.ListView[@resource-id='mat-select-4']"),
        @AndroidBy(xpath = "//android.widget.ListView[@text='Select District']"),
            @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'MYSURU, selected')]"),
            @AndroidBy(xpath = "//android.widget.ListView[contains(@text,'BENGALURU URBAN SOUTH, selected')]"),
    })
    public MobileElement assertDistrictValueAutoPopulated;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mat-input-0']")
    public MobileElement selectYearManually;


    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='1998']"),
            @AndroidBy(xpath = "//android.view.View[@text='1998']"),
    })
    public MobileElement selectMajorUser;

 


    @AndroidFindBy(xpath = "//android.view.View[@text='Enter mobile number or email address *']")
    public MobileElement assertEnterMobileNumberOrEmailAddressText;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Enter mobile number or email address of your parent or guardian*')]")
    public MobileElement assertEmailOrMobileNoOfParentOrGuardian;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='mat-form-field-label-1']")
    public MobileElement clkOnSelectStateOption;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='mat-option-0']")
    public MobileElement selectFirstOption;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Sunbird SSO Login')]")
    public MobileElement assertDikshaSSOLoginText;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mat-input-0']")
    public MobileElement userNameEditField;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mat-input-1']")
    public MobileElement userNameExternalID;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='mat-input-2']")
    public MobileElement schoolExternalID;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')]")
    public MobileElement assertStateLabelWithoutOverlapping;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]")
    public MobileElement assertDistrictLabelWithoutOverlapping;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='state']")
    public MobileElement assertStateIsClearlyDisplayed;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='district']")
    public MobileElement assertDistrictIsClearlyDisplayed;



    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Role: HT & Officials')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Role: HT & Officials')]"),
    })
    public MobileElement assertHeadTeacherRoleInProfile;
    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Sub-role')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Sub-role: CRP')]"),
    })
    public MobileElement assertSubRoleInProfile;
    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'State: Andhra Pradesh')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'State: Andhra Pradesh')]"),
    })
    public MobileElement assertAndhraState;


    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'District: Ananthapuram')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'District: ANANTAPUR')]"),
    })
    public MobileElement assertAnantapurDistrict;

    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Block: Agali')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Block: AGALI')]"),
    })
    public MobileElement assertAgaliBlock;

    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'School: MPPS HANUMANNAHALLI')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'School: MPPS HANUMANNAHALLI')]"),
    })
    public MobileElement assertHanumannahalliSchool;
   

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Choose content preferences')]")
    public MobileElement locationPopUpHeader;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'AutomationCourseForDF')]")
    public MobileElement assertCourseInProfile;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Choose an account')]")
    public MobileElement assertChooseAnAccountInGmailPage;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'to continue to DIKSHA')]")
    public MobileElement assertToContinueToDikshaInGmailPage;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Add another account')]")
    public MobileElement assertAddAnotherAccountInGmailPage;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'dikshatest15@gmail.com')]")
    public MobileElement assertAddedGmailAccount;


    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[@text='Welcome to SUNBIRD!']"),
            @AndroidBy(xpath = "//android.view.View[@text='Welcome to SUNBIRD!']"),
            @AndroidBy(xpath = "//android.view.View[@text='Welcome to DIKSHA!']"),
    })
    public MobileElement assertWelcomeTextInRegistrationPage;


    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[@text=\"Register on SUNBIRD\"]"),
            @AndroidBy(xpath = "//android.view.View[@text='Register on SUNBIRD']"),
            @AndroidBy(xpath = "//android.view.View[@text='Register on DIKSHA']"),
    })
    public MobileElement assertRegisterOnDiksha;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='manjunathsn3941@gmail.com']")
    public MobileElement newGmailUserID;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Year Of Birth')]")
    public MobileElement assertYOBField;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE arrow forward'][@enabled='false']")
    public MobileElement assertDisabledContinueBtn;



    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[@text='dikshatest13@gmail.com']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='dikshatest20@gmail.com']"),
    })
    public MobileElement newGmailUserID1;

    
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Select Year Of Birth')]")
    public MobileElement yobDropdown;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='2022']")
    public MobileElement selectYOB2022;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'CONTINUE')]")
    public MobileElement clkContinueButton;


    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'To discover relevant content update the following details:')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'To discover relevant content update the following details:')]"),
    })
    public MobileElement assertDiscoverRelevantContentUpdateTheFollowingText;
    

    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'selected ,Select State')]")
    public MobileElement assertMandatoryAndPrefilledState;



    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.ListView[contains(@text,'Select District')]"),
            @AndroidBy(xpath = "//android.widget.ListView[contains(@text,'selected ,Select District')]"),
    })
    public MobileElement assertMandatoryAndPrefilledDistrict;
    
    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Select Block')]")
    public MobileElement assertBlockEditField;


    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Select School')]")
    public MobileElement assertSchoolEditField;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Clear']")
    public MobileElement assertClearBtn;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'As a parent/guardian I understand & Accept the SUNBIRD Terms')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Enter mobile number or email address of your parent or guardian')]"),
    })
    public WebElement assertEmailOrMobileNumberOfGuardianText;
    

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Mobile Number']")
    public MobileElement assertMobileNumberText;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'SUBMIT')][@enabled='false']")
    public MobileElement assertDisabledSubmitBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'SUBMIT')][@enabled='true']")
    public MobileElement assertEnabledSubmitBtn;


    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'OTP is sent to ')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'OTP is sent to alash')]"),
})
public WebElement assertOTPSentToEmailText;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'One Time Password')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'One Time Password')]"),
})
public WebElement assertOTPHeader;

   

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'it is valid for 30 minutes')]")
    public MobileElement assertOTPValidFor30Min;


    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'1234')]")
    public MobileElement assertEnteredOTP;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'We have picked your BMG and role as teacher')]")
    public MobileElement assertToastMessageForBMGSPicked;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Teacher']"),
            @AndroidBy(xpath = "//android.view.View[@text='Teacher']"),
    })
    public WebElement clickTeacher;


    @AndroidFindBy(xpath = "//android.view.View[@text='4.7 ribbon trackable book']")
    public MobileElement assertTrackableCourse;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    public MobileElement clickContinueRegister;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    public MobileElement clickSubmiteRegister;


    @AndroidFindBy(xpath = "//android.view.View[@text='Enter mobile number or email address of your parent or guardian*']")
    public MobileElement assertEmailAndMobileAsterisk;


    @AndroidFindBy(xpath = "//android.view.View[@text='Password*']")
    public MobileElement assertPasswordAsterisk;


    @AndroidFindBy(xpath = "//android.view.View[@text='Confirm Password*']")
    public MobileElement assertConfirmPasswordAsterisk;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'have an account')]"),
})
public MobileElement assertDontHaveAnAccountBelowLoginBtn2;





    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='tncAccepted']")
    public MobileElement clickTermsAndCheckBox;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
})

public MobileElement clkOnSubmitBtnSSO;



    @AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
    public MobileElement clkMobileNumberEditBoxSSO;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SUNBIRD Terms of Use']")
    public MobileElement clkTermcCheckBoxSSO;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter OTP']")
    public MobileElement assertEnterOTPPageSSo;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit OTP']")
    public MobileElement ClickSubmitOTPSSo;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Incorrect OTP. Number of attempts remaining : 1']")
    public MobileElement assertIncorrectOTPAttemp1;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Failed to validate OTP. Try again later.']")
    public MobileElement assertFailedToValidaOTPMsgttemp2;
    
   
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Resend OTP']")
    public MobileElement clickReSendButton;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='This mobile number is already registered']")
    public MobileElement assertMobileNoAlreadyRegisteredSSO;
    
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Email address']")
    public MobileElement clkEmailRadioBoxSSO;

    @AndroidFindBy(xpath = "//android.view.View[@text='Your email address is already registered']")
    public MobileElement assertEmailIDAlreadyRegisteredSSO;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='I agree to share these details with the Administrators of SUNBIRD as per the']")
    public MobileElement assertSSOGlobalPopupFirstTime;
}




