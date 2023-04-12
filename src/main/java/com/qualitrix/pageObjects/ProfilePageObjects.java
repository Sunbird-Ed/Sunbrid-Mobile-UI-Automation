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
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN ']")
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


    @AndroidFindBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']")
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

    @AndroidFindBy(xpath = "//android.view.View[@text='Content preference']")
    public MobileElement assertContentPreferenceLabelProfile;

    @AndroidFindBy(xpath = "//android.view.View[@text='ROLE']")
    public MobileElement assertRoleContentPreferenceLabelProfile;

    @AndroidFindBy(xpath = "//android.view.View[@text='BOARD']")
    public MobileElement assertBoardContentPreferenceLabelProfile;

    @AndroidFindBy(xpath = "//android.view.View[@text='MEDIUM']")
    public MobileElement assertMediumContentPreferenceLabelProfile;

    @AndroidFindBy(xpath = "//android.view.View[@text='CLASS']")
    public MobileElement assertClassContentPreferenceLabelProfile;

    @AndroidFindBy(xpath = "//android.view.View[@text='SUBJECTS']")
    public MobileElement assertSubjectContentPreferenceLabelProfile;

    @AndroidFindBy(xpath = "//android.view.View[@text='DISTRICT']")
    public MobileElement assertDistrictContentPreferenceLabelProfile;

    @AndroidFindBy(xpath = "//android.view.View[@text='STATE']")
    public MobileElement assertStateContentPreferenceLabelProfile;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='edit District']"),
        @AndroidBy(xpath = "//android.view.View[@text='DISTRICT']//following::android.widget.Image"),
            @AndroidBy(xpath = "//android.view.View[@text='DISTRICT']//following::android.widget.Button[1]"),
})
public MobileElement clkEditLocation;

    @AndroidFindBy(xpath = "//android.view.View[@text='Choose content preferences']")
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

   @AndroidFindBy(xpath = "//android.view.View[@text='Register here']")
   public MobileElement clkRegisterHere;

   @AndroidFindAll({
           @AndroidBy(xpath = "//android.view.View[@text='Register on DIKSHA']"),
           @AndroidBy(xpath = "//android.view.View[@text='Register on SUNBIRD']")
   })
   public MobileElement assertRegisterPage;

  @AndroidFindBy(xpath = "//android.view.View[@text='Select year of birth']")
   public MobileElement selectYearOfBirth;

  @AndroidFindBy(xpath = "//android.view.View[@text='2022']")
   public MobileElement selectYear;

  @AndroidFindAll({
          @AndroidBy(xpath = "//*[@resource-id='signup-form-name']"),
          @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[1]"),
  })
   public MobileElement nameEditTextField;

  @AndroidFindAll({
          @AndroidBy(xpath = "//android.widget.TextView[@text='Email Address']"),
          @AndroidBy(xpath = "//android.view.View[@text='Email Address']"),
          @AndroidBy(xpath = "//android.view.View[@text='Email address']"),
  })
   public MobileElement clkOnEmailAddress;

  @AndroidFindAll({
          @AndroidBy(xpath = "(//android.widget.EditText)[3]"),
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

  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login to DIKSHA']")
  public MobileElement assertLoginPageText;
 @AndroidFindBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']")
  public MobileElement assertLoginWithDikshaOption;
 @AndroidFindBy(xpath = "//android.widget.Button[@text='Login with state system']")
  public MobileElement assertLoginWithStateSystemOption;
 @AndroidFindBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']")
  public MobileElement assertSignInwithGoogleOption;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]")
    public MobileElement assertNameField;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Mobile Number']"),
        @AndroidBy(xpath = "//android.view.View[@text='Mobile Number']"),
})
    public MobileElement assertMobileNumber;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Email Address']"),
            @AndroidBy(xpath = "//android.view.View[@text='Email Address']"),
            @AndroidBy(xpath = "//android.view.View[@text='Email address']"),
    })
    public MobileElement assertEmailAddress;


    @AndroidFindBy(xpath = "//android.view.View[@text='You will receive an OTP to verify your mobile number or email address']")
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


    @AndroidFindBy(xpath = "//android.widget.Button[@text='add Subjects']")
    public MobileElement clkAdd;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Subrole')]")
    public MobileElement assertSubPersona;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='edit District']")
    public MobileElement clkOnLocationEditImage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Choose content preferences']")
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


    @AndroidFindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
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


    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
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
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Update')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Update']"),
    })
    public MobileElement clkOnUpdate;


    @AndroidFindBy(xpath = "//android.view.View[@text='I wish to share my data with:']//following::android.view.View[1]")
    public MobileElement clkOnOrganizationField;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='State (Punjab)']"),
            @AndroidBy(xpath = "//android.view.View[@text='State (Punjab)']"),
    })
    public MobileElement clkStatePunjabOrg;


    @AndroidFindBy(xpath = "//android.view.View[@text='I wish to share my data with State (Punjab)']")
    public MobileElement assertConsentWithPunjabOrg;

    @AndroidFindAll({
         @AndroidBy(xpath = "//android.widget.TextView[@text='Andra Pradesh']"),
         @AndroidBy(xpath = "//android.view.View[@text='Andra Pradesh']")
    })
    public MobileElement clkOnAndraOrg;


    @AndroidFindBy(xpath = "//android.view.View[@text='I wish to share my data with Andra Pradesh']")
    public MobileElement assertConsentWithAndraOrg;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select year of birth']")
    public MobileElement assertYOBPopup;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='signup-form-password']")
    public MobileElement passwordEditTextFieldOne;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='tncAccepted']")
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


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Forget password?']")
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
            @AndroidBy(xpath = "//android.view.View[@text='Name']//following::android.widget.Button"),
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Next')]"),
    })
    public MobileElement clkOnNextBtn;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email address / Mobile number is not registered with SUNBIRD']")
    public MobileElement assertEmailNotRegisteredMessage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='The entry does not match the name registered with SUNBIRD']")
    public MobileElement assertNameNotRegisteredMessage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Recover Account']")
    public MobileElement assertRecoverAccountText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Email address/Mobile Number']")
    public MobileElement assertEmailaddressMobileNumberLabel;



    @AndroidFindBy(xpath = "//android.view.View[@text='Name']")
    public MobileElement assertNameLabel;


    @AndroidFindBy(xpath = "//android.view.View[@text='You have exceeded maximum retry. Please try after some time']")
    public MobileElement assertErrorMessageInLoginPage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Login']")
    public MobileElement assertLoginTextInLoginPage;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'You will receive an OTP')]")
    public MobileElement assertMessageRelatedToOTP;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'@yopmail.com')]")
    public MobileElement assertEmailAddressToSendOTP;


    @AndroidFindBy(xpath = "//android.view.View[@text='State (Karnataka)\u200E']")
    public MobileElement assertStateKarnatakBoard;


    @AndroidFindBy(xpath = "//android.view.View[@text='Test']")
    public MobileElement assertUserNameInProfile;



    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'test')]")
    public MobileElement assertDikshaIDInProfile;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='Refresh']")
    public MobileElement clkRefreshBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Learner passbook')]")
    public MobileElement assertLearnerPassbooksectionInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Learner passbook')]//following::android.widget.Button[@text='eye Certificate'][1]")
    public MobileElement assertCertificateUnderLearnerPassbooksection;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Download Download']")
    public MobileElement assertDownloadBtnPostClickingCertificate;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
    public MobileElement clkAllowbtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Invalid Email Address/Mobile number or password. Please try again with valid credentials']")
    public MobileElement assertInvalidMsgForAlreadyMergedAccount;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select State']")
    public MobileElement selectState;

    @AndroidFindBy(xpath = "//android.view.View[@text='Select District']")
    public MobileElement selectDist;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath = "//android.view.View[@text='Enter Email Address / Mobile number']//following::android.widget.EditText[1]"),
    })
    public MobileElement assertEnterYourEmailPlaceholder;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[3]"),
            @AndroidBy(xpath ="//android.view.View[@text='Password']//following::android.widget.EditText[1]"),
    })
    public MobileElement assertPasswordPlaceholder;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
    public MobileElement assertLoignBtnInUppercase;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Forgot?']")
    public MobileElement assertForgotText;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']//following-sibling::android.widget.TextView[1]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']//following::android.widget.TextView[1]"),
    })
    public MobileElement assertDontHaveAnAccountBelowLoginBtn;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Register here')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']//following::android.view.View[@text='Register here']"),
    })
    public MobileElement assertRegisterHereBelowLoginBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Login With Google']")
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
















}




