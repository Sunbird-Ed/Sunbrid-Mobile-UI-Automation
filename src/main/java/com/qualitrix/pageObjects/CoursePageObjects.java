package com.qualitrix.pageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;


/**
 * This Class has all the Objects related to Course Page.
 *
 * @author Abhinav
 * @version 1.0
 * @since 03/August/2020
 */
public class CoursePageObjects {

	@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='Ongoing']"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Ongoing')]")
	})
	public MobileElement ongoingCourse;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']"),
			@AndroidBy(xpath = "//android.view.View[@text='AutomationCourseForDF']"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Ongoing')]//preceding::android.view.View[2]"),
	})
	public MobileElement clkOnOngoingCourse;

@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.Button[@text='play Start learning']"),
})
public MobileElement assertStartLearning;


	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[contains(@text,' More ')]"),

	})
	public MobileElement viewMore;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Small AutomationCourseContent')]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Completed ')]"),
	})
	public MobileElement completedCourse;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[contains(@text,' successfully completed ')]") })
	public MobileElement completedMessage;

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

	@AndroidFindAll({
		@AndroidBy(xpath = "//android.view.View[@text='U']"),

	})
	public MobileElement selectedUserPage;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[contains(@text,'More ')]"),

	})
	public MobileElement moreOption;

	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='Change User']"),

	})
	public MobileElement changeUser;

	@AndroidFindBy(className = "android.widget.CheckBox")
    public MobileElement termsCheckBox;
	

	@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE']"),

	})
	public MobileElement continueChangeUser;
	
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'+ Add another user')]"),
			@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Add')]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Add another user')]"),
		@AndroidBy(xpath = "//android.view.View[contains(@text,'More ')]//following::android.view.View"),

	})
	public MobileElement addAnotherUser;
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.view.View[contains(@text,'District')]"),

	})
	public MobileElement verifyDistrict;

	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.view.View[contains(@text,'State')]"),

	})
	public MobileElement verifyState;
	
	
	@AndroidFindAll({
			@AndroidBy(xpath = "(//android.widget.TextView)[17]"),
		@AndroidBy(xpath = "//android.widget.Button[@text='+ Add User']//following::android.view.View[1]"),

	})
	public MobileElement clickFirstUser;
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.Button[@text='Submit details']"),

	})
	public MobileElement clkSubmitDetails;
	
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.ListView[@text='Select State/Institution']"),
		@AndroidBy(xpath = "//android.view.View[@text='Select State/Institution']"),

	})
	public MobileElement clkPersonaDropDown;

	@AndroidFindAll({
			@AndroidBy(xpath = "(//android.widget.TextView)[1]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Andaman & Nicobar']"),
			@AndroidBy(xpath = "//android.widget.TextView[@text='Andra Pradesh']"),
			@AndroidBy(xpath = "//android.widget.TextView[@text='Andhra Pradesh']"),
			@AndroidBy(xpath = "//android.view.View[@text='Andhra Pradesh']"),
			@AndroidBy(xpath = "//android.view.View[@text='Select State/Institution']//following::android.widget.TextView[2]"),

	})
	public MobileElement SelectPersonaDropDown;
	

	@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),

	})
	public MobileElement TeacherSubmit;
	
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.view.View[@text='Select tenants']"),

	})
	public MobileElement clkTenantsDropDown;
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.view.View[@text='Select tenants']//following::android.view.View[@index='1'][2]"),

	})
	public MobileElement SelectTenanat;
	
	   @AndroidFindBy(xpath = "//android.view.View[@text='I am a']")
	    public MobileElement verifyIAMALabel;
	   
	   @AndroidFindBy(xpath = "//android.view.View[@text='with']")
	    public MobileElement verifyWithLabel;
	   
	   @AndroidFindBy(xpath = "//android.view.View[contains(@text,'NAME')]")
	    public MobileElement verifyNAME;
	   
	   @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')][1]")
	    public MobileElement verifyStatesLabel;
	   
	   @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]")
	    public MobileElement verifyDistrictLabel;


	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'FRMELEMNTS_LBL_MOBILE_NUMBER_PLACEHOLDER')]"),
			   @AndroidBy(xpath = "//android.view.View[@text='Mobile number for State or Org']"),
	   })
	    public MobileElement verifyMobielNumberLabel;


	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'FRMELEMNTS_LBL_EMAIL_ID_PLACEHOLDER')]"),
			   @AndroidBy(xpath = "//android.view.View[@text='Email address of State or Org']"),
	   })
	    public MobileElement verifyAddressLabel;
	   
	   @AndroidFindBy(xpath = "//android.view.View[contains(@text,'School/Organization name')]")
	    public MobileElement verifySchoolOrganizationLabel;
	   
	   @AndroidFindBy(xpath = "//android.view.View[contains(@text,'School UDISE ID/ Org ID')]")
	    public MobileElement verifySchoolUDIDLabel;
	   
	   @AndroidFindBy(xpath = "//android.view.View[contains(@text,'by your State/ Board/ Org')]")
	    public MobileElement verifyStateBoardOrgLabel;
	   
	   @AndroidFindBy(className = "android.widget.CheckBox")
	    public MobileElement termsCheckBoxTeacherForm;

	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'I agree to share these details with the Administrators of SUNBIRD as per the')]"),
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'I agree to share these details with the Administrators of DIKSHA as per the')]")
	   })
	    public MobileElement verifyAgreePrivacyPolicyText;
	   
	   
	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'Ongoing')]"),
			   @AndroidBy(xpath = "//android.widget.Button[@text='Refresh']//following::android.view.View"),
			   @AndroidBy(xpath= "//android.widget.Image[@text='refresh circle']//following::android.view.View"),
	   })
	   public MobileElement coursesSection;
	   
	   
	   @AndroidFindBy(xpath= "//android.widget.Button[@text='Cancel']")
	    public MobileElement verifyCancelButtn;
	   
	   
	   @AndroidFindAll({
		   @AndroidBy(xpath = "//android.widget.Button[@text='EDIT']"),
			@AndroidBy(xpath = "//android.view.View[@text='Subjects:']//following::android.widget.Button[@text='EDIT']"),
           @AndroidBy(xpath = "//android.widget.Button[@text='Edit Board, Medium, Classes, subjects']"),
		})
		public MobileElement clikEditProfile;


	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@resource-id='ion-sel-4']"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'State ')][2]"),
			@AndroidBy(xpath = "//android.widget.Spinner[@index='2']"),
			@AndroidBy(xpath = "//android.widget.Button[@index='2'][1]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Board')]"),

	})
	public MobileElement clkBoardDropDown;


	   @AndroidFindAll({
			@AndroidBy(className ="android.widget.RadioButton")

		})
		public List<MobileElement> sltBoard;



	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@resource-id='ion-sel-6']"),
			@AndroidBy(xpath = "//android.widget.Spinner[@index='2']"),
			@AndroidBy(xpath = "//android.widget.Button[@index='2'][1]//following::android.widget.Button[1]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Medium')]"),

	})
	public List<MobileElement> clkMediumDropDown;

	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@resource-id='ion-sel-6']"),

	})
	public MobileElement clkMediumDropDownSSO;

	   
	   @AndroidFindAll({
			@AndroidBy(xpath ="//android.widget.CheckBox[@text='English']")

		})
		public MobileElement sltMediumVal;


	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@resource-id='ion-sel-7']"),
			@AndroidBy(xpath = "//android.widget.Spinner[@index='2']"),

			@AndroidBy(xpath = "//android.widget.Button[@index='2'][1]//following::android.widget.Button[2]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Class')]"),

	})
	public List<MobileElement>  clkClassDropDown;

	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@resource-id='ion-sel-7']"),

	})
	public MobileElement clkClassDropDownSSO;


	   
	   @AndroidFindAll({
			@AndroidBy(className = "android.widget.CheckBox")

		})
		public List<MobileElement> sltClassVal;


	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@resource-id='ion-sel-5']"),
			@AndroidBy(xpath = "//android.widget.Spinner[@index='2']"),

			@AndroidBy(xpath = "//android.widget.Button[@index='2'][1]//following::android.widget.Button[3]"),

			@AndroidBy(xpath = "//android.view.View[contains(@text,'Subjects')]"),

	})
	public List<MobileElement> clkSubjectDropDown;

	@AndroidFindAll({
			@AndroidBy(xpath = "//*[@resource-id='ion-sel-5']"),
	})
	public MobileElement clkSubjectDropDownSSO;


	   
	   
	   @AndroidFindAll({
			@AndroidBy(xpath ="//android.widget.CheckBox[@text='English']")

		})
		public MobileElement sltsubjectVal;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[contains(@text,'State (Andhra Pradesh) \u200E')]"),
			@AndroidBy(xpath = "//android.view.View[@text='Board:']//following::android.view.View[@text='State (Andhra Pradesh) ‎']"),
           @AndroidBy(xpath = "//android.view.View[@text='Board: State (Tamil Nadu) \u200E']"),
	})
	public MobileElement verifyBaord;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='English']"),
			@AndroidBy(xpath = "//android.view.View[@text='Medium:']//following::android.view.View[@text='English'][1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Medium: English']"),
	})
	public MobileElement verifyMedium;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='Class 1']"),
			@AndroidBy(xpath = "//android.view.View[@text='Classes:']//following::android.view.View[1]"),
           @AndroidBy(xpath = "//android.view.View[@text='Classes: Class 1']"),
	})
	public MobileElement verifyClasses;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='English']"),
			@AndroidBy(xpath = "//android.view.View[@text='Subjects:']//following::android.view.View[@text='English']"),
            @AndroidBy(xpath = "//android.view.View[@text='Subjects: English']"),
	})
	public MobileElement verifySubjects;
	   
	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
			@AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
		})
		public MobileElement clkSubmitProfile;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='Board: CBSE/NCERT \u200E']"),
			@AndroidBy(xpath = "//android.view.View[@text='CBSE/NCERT ‎']"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'State (Andhra Pradesh)')]"),
	})
	public MobileElement verifyBoardAfterAddUser;



	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Medium: English')]"),
			@AndroidBy(xpath = "//android.view.View[@text='Medium: English']"),
			@AndroidBy(xpath = "//android.view.View[@text='English']"),

		})
		public MobileElement verifyMediumAfterAddUser;	
	   
	   
	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'Classes: Class')]"),
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'Class')]"),
			@AndroidBy(xpath = "//android.view.View[@text='Class 1']"),

		})
		public MobileElement verifyClassesAfterAddUser;	
	   
	   
	   
	   @AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.Button[@text='Edit']"),
			   @AndroidBy(xpath = "//android.widget.Button[@text='Edit Role, Block, District, State']"),

		})
		public MobileElement clkEditForLocation;	
	   
	   
	   
	   @AndroidFindAll({
			  @AndroidBy(xpath = "//android.view.View[contains(@text,'State')]//following::android.widget.ListView[1]"),
			@AndroidBy(xpath = "//android.widget.ListView[@text='Student']//following::android.widget.ListView[1]"),
			@AndroidBy(xpath = "//android.widget.ListView[@text='Teacher']//following::android.widget.ListView[1]"),

		})
		public MobileElement clkStateLoc;	
	   
	   
	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.widget.TextView[@text='Andhra Pradesh']"),
			@AndroidBy(xpath = "//android.view.View[@text='Andhra Pradesh']"),

		})
		public MobileElement sltStateLoc;	
	   
	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.view.View[contains(@text,'District')]//following::android.widget.ListView[1]"),
			@AndroidBy(xpath = "//android.widget.ListView[@text='Student']//following::android.widget.ListView[2]"),
			@AndroidBy(xpath = "//android.widget.ListView[@text='Teacher']//following::android.widget.ListView[2]"),

		})
		public MobileElement clkDistrictLoc;	
	   
	   
	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.widget.TextView[@text='Chittoor']"),
			@AndroidBy(xpath = "//android.view.View[@text='Chittoor']"),

		})
		public MobileElement sltDistrictLoc;
	   
	   @AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),

		})
		public MobileElement submitLoc;
	   
	   @AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='District: CHITTOOR']"),

		})
		public MobileElement verifyDistrictAfterUpdate;
	   
	   @AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='State: Andhra Pradesh']"),

		})
		public MobileElement verifyStateAfterUpdate;
	   
	   @AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.Button[@text='SAVE']"),

				})
		public MobileElement clkSaveProfile;	
	   
	   @AndroidFindBy(xpath = "//android.view.View[@text='Sync Progress now']")
	    public MobileElement clkSyncProgressNow;
	   
	   @AndroidFindBy(xpath = "//android.view.View[@text='Sync Progress now']")
	    public MobileElement assertSyncProgressNow;
	   
	 
	   @AndroidFindBy(xpath = "//android.view.View[@text='courses']")
		public MobileElement clkoncoursesicon;
	
	   @AndroidFindBy(xpath = " //android.widget.Button[@text='Login']")
		public MobileElement clkonlogintojoincourse;
	   
	   @AndroidFindAll({
		      @AndroidBy(xpath = "//android.widget.TextView[@text='Try new DIKSHA experience']"),
		      @AndroidBy(xpath = "//android.view.View[@text='help Try new DIKSHA experienceBeta']")
		})
		public MobileElement clkNewDikshExperiece;


	   @AndroidFindAll({
			   @AndroidBy(xpath = "//android.widget.TextView[@text='You have successfully completed this course']"),
			   @AndroidBy(xpath = "//android.view.View[@text='You have successfully completed this course']"),
	   })
	public MobileElement assertCourseCompletedMessageInCompletedCourse;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Small AutomationCourseContent')]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Small')]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Completed')]//preceding::android.view.View[2]"),
	})
	public MobileElement clkOnCompletedCourse;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[@text='Please provide the following details'][@class='android.view.View'][1]"),
			@AndroidBy(xpath = "//android.view.View[@text='Please provide the following details']//following::android.view.View[1]"),
	})
	public MobileElement assertMandatoryFieldInSubmitdetails;



	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Small Automation')]")
	public MobileElement assertCourseInMyLearning;


	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'NewBatch')]")
	public MobileElement assertBatchInMyLearning;


	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Completed')]")
	public MobileElement assertCourseStatusInMyLearning;


	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'2021')]")
	public MobileElement assertCompletionDateInMyLearning;



	@AndroidFindBy(xpath = "//android.view.View[@text='Certificate criteriaarrow down']")
	public MobileElement clkCertificateCriteria;



	@AndroidFindBy(xpath = "//android.view.View[@text='> Completion certificates will be issued upon 100% completion']")
	public MobileElement assertCertificateRule;



	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'More')]")
	public MobileElement assertMoreBtn;



	@AndroidFindAll({
			@AndroidBy(xpath = "(//android.widget.EditText)[2]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Mobile number')]//following::android.widget.EditText[1]"),
	})
	public MobileElement selectMobileNoEditField;


	@AndroidFindBy(xpath = "//android.view.View[@text='Enter a valid mobile number']")
	public MobileElement assertInvalidMobileNoErrorMsg;


	@AndroidFindAll({
			@AndroidBy(xpath = "(//android.widget.EditText)[3]"),
			@AndroidBy(xpath = "//android.view.View[contains(@text,'Email address')]//following::android.widget.EditText"),
	})
	public MobileElement selectEmailEditField;


	@AndroidFindBy(xpath = "//android.view.View[@text='Enter a valid email address']")
	public MobileElement assertInvalidEmailErrorMsg;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
	public MobileElement clkOnSubmitBtn;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Update']")
	public MobileElement assertUpdateBtn;


	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.Button[@text='I am a teacher?']"),

	})
	public MobileElement assertIAmATeacherText;


	@AndroidFindBy(xpath = "//android.view.View[@text='My Details']")
	public MobileElement assertMyDetailsText;


	@AndroidFindBy(xpath = "//android.view.View[@text='Self Declared Info']")
	public MobileElement assertSelfDeclaredInfoText;


	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'GO TO PROFILE')]")
	public MobileElement clkGoToProfile;


	@AndroidFindBy(xpath = "//android.view.View[@text='Course modules']")
	public MobileElement assertCourseModules;


	@AndroidFindBy(xpath = "//android.widget.EditText[@text='st****@yopmail.com']")
	public MobileElement assertPrefilledEmailAddressInDeclarationForm;


	@AndroidFindBy(xpath = "//android.widget.Image[@text='verified']")
	public MobileElement assertEmailVerifiedImage;


	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
	public MobileElement assertNewPrivacyPolicy;


	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Use']")
	public MobileElement assertTermsOfUse;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
	public MobileElement assertPrivacyPolicy;


	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Content Policy']")
	public MobileElement assertContentPolicy;


	@AndroidFindBy(xpath = "//android.view.View[@text='Privacy Policy of DIKSHA']")
	public MobileElement assertPrivacyPolicyOfDiksha;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit'][@enabled='false']")
	public MobileElement disabledSubmitBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit'][@enabled='true']")
	public MobileElement enabledSubmitBtn;


	@AndroidFindBy(xpath = "//android.view.View[@text='Thank you for submitting your details']")
	public MobileElement assertThankyouForSubmittingDetails;






}