package com.qualitrix.pageObjects;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en_scouse.An;
import cucumber.api.java.sk.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the Objects related to Home Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 17/March/2020
 */
public class HomePageObjects {

    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.Button[@text='Collapsed']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='burger menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_burger_menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='burger menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='burger menu ']")
    })
    public MobileElement menuBar;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Language']"),
           @AndroidBy(xpath = "//android.view.View[@text='select app langugae Language English']"),
            @AndroidBy(xpath = "//android.view.View[@text='Language']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='Language']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='select app langugae']"),
    })
    public MobileElement langSelection;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Reports']"),
})
public MobileElement ReportMenu;

    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='help']"),
    })
    public MobileElement helpObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='logout']"),
    })
    public MobileElement logoutObj;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Kannada']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ಕನ್ನಡ']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='ಕನ್ನಡ']"),
            @AndroidBy(xpath = "//android.view.View[@text='Choose Your Preferred Language']//following::android.widget.Button[6]"),
    })
    public MobileElement selectKannadaLang;
    
    
    @AndroidFindAll({
    	
 	   @AndroidBy(xpath = "//android.view.View[@text='Teacher']"),
 })
 public MobileElement sltTeacherAsses;
 
    
    
    @AndroidFindAll({
    	
 	   @AndroidBy(xpath = "//android.view.View[@text='AutomationResource']"),
 })
 public MobileElement sltAutomationResrce;
 
    
    @AndroidFindAll({
    	
  	   @AndroidBy(xpath = "//android.widget.Button[@text='download']"),
  })
  public MobileElement clkDownloadIconAssemtCont; 
    
    @AndroidFindAll({
    	
   	   @AndroidBy(xpath = "//android.widget.Button[@text='Allow']"),
   })
   public MobileElement clkAllowAcces; 
  
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='English']")
    public MobileElement selectEngLang;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='qrscanner']"),
            @AndroidBy(xpath = "//android.view.View[@text='qrscanner ']"),
            @AndroidBy(xpath = "//*[contains(@text,'qrscanner')]")
    })
    public MobileElement qrCode;

    @AndroidFindAll({
        @AndroidBy(xpath = "//*[@resource-id='tab-button-guest-profile']"),
            @AndroidBy(xpath = "//*[@resource-id='tab-button-profile']"),
        @AndroidBy(xpath = "//android.view.View[@text='profile']"),
            @AndroidBy(xpath = "//android.view.View[@text='profile Profile']"),
            @AndroidBy(xpath = "//android.view.View[@text='profile Profile ']"),
            @AndroidBy(xpath = "//*[contains(@text,'profile Profile')]"),
        @AndroidBy(xpath = "//android.widget.Image[@text='profile']")

    })
    public MobileElement profilePageTab;

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@resource-id='tab-button-download-manager']"),
        @AndroidBy(xpath = "//android.view.View[@text='downloads']"),
            @AndroidBy(xpath = "//android.view.View[@text='downloads Downloads']"),
            @AndroidBy(xpath = "//android.view.View[@text='downloads Downloads ']"),
            @AndroidBy(xpath = "//*[contains(@text,'downloads Downloads')]")
    })
    public MobileElement downloadTab;

  
    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@resource-id='tab-button-courses']"),
    @AndroidBy(xpath = "(//android.widget.Image)[2]"),
        @AndroidBy(xpath = "//android.view.View[@text='courses']"),
            @AndroidBy(xpath = "//android.view.View[@text='courses Trainings']"),
            @AndroidBy(xpath = "//android.view.View[@text='courses Trainings ']"),
            @AndroidBy(xpath = "//*[contains(@text,'courses Trainings')]"),
            @AndroidBy(xpath = "//android.view.View[@text='courses Courses']"),
               })
    public MobileElement trainingTab;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@resource-id='tab-button-search']"),
    })
    public MobileElement searchTab;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//*[@resource-id='tab-button-resources'])[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='resources Library']"),
            @AndroidBy(xpath = "//android.view.View[@text='resources Library ']"),
            @AndroidBy(xpath = "//*[contains(@text,'resources Library')]"),
            @AndroidBy(xpath = "//android.view.View[@text='resources']")
    })
    public MobileElement libraryTab;

    @AndroidFindAll({
            //@AndroidBy(xpath = "(//*[@resource-id='tab-button-resources'])[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='resources Library']"),
            @AndroidBy(xpath = "//android.view.View[@text='resources Library ']"),
            @AndroidBy(xpath = "//*[contains(@text,'resources Library')]"),
            @AndroidBy(xpath = "//android.view.View[@text='resources']")
    })
    public MobileElement libraryTab1;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='MathematicsClass 10']"),
            @AndroidBy(xpath = "//android.view.View[@text='MathematicsClass 6']"),
            @AndroidBy(xpath = "//android.view.View[@text='MathematicsClass 7']"),
            @AndroidBy(xpath = "//android.view.View[@index='3']")
    })
    public MobileElement mathBookObj;
  
   
   @AndroidFindBy(xpath = "//android.view.View[@text='Showing 100 results for1 'maths'']")
    
    public MobileElement searchedBookResults;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE arrow round forward']")
    })
    public MobileElement continueBtn;

    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
    	@AndroidBy(xpath = "//android.widget.Button[@text='ಮುಂದುವರೆಸಿ']"),
    	@AndroidBy(xpath = "//android.widget.Button[@text='ಮುಂದುವರೆಸಿ arrow round forward']"),
    	@AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE arrow round forward']"),

    	

    	
    	 })
public MobileElement kanndaContinuebutton;
    
   
   
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='search']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_search']"),
            @AndroidBy(xpath = "//*[contains(@text,'search')]"),

            
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

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEE MORE BOOKS AND CONTENT']")
    public MobileElement seeMoreBooksObj;

    @AndroidFindBy(xpath = "//*[@resource-id='tab-button-resources']")
    public MobileElement resourcesTab;

    @AndroidFindBy(xpath = "//*[@resource-id='buttonColors']")
    public MobileElement gotItBtn;
    
    
  
    
  
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='My groups']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'More ')]//following::android.view.View[3]")
})
public MobileElement clkMyGroups;

    
    
    
    
    @AndroidFindAll({
    	
            @AndroidBy(xpath = "//android.widget.Button[@text='Create Group Create group']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='my-group']//following::android.widget.Button"),
        @AndroidBy(xpath = "//android.view.View[@text='You are just a step away from creating a group']//following::android.widget.Button")
})
public MobileElement clkCreateGroup;

    
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.EditText"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Group name']//following::android.widget.EditText"),
})
public MobileElement enterGroupName;
  

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.EditText[2]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Group name']//following::android.widget.EditText[2]"),
})
public MobileElement enterGroupDesc;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.CheckBox[@index='1']"),
})
public MobileElement clkTermsAndCondition;
  
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'create group')]"),
        @AndroidBy(xpath = "//android.widget.CheckBox[@index='1']//following::android.widget.Button"),
})
public MobileElement clkGroupForCreation;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='My groups']//following-sibling::android.view.View[1]"),
        @AndroidBy(xpath = "//android.widget.Image[@text='My groups']//following::android.view.View[1]"),
})
public MobileElement clkFirstCreateGroup;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='add activity button']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='+ Add activity']"),

      

})
public MobileElement clkAddActivity;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Courses']"),
        @AndroidBy(xpath = "//android.view.View[@text='Course']"),

})
public MobileElement clkCourseInActivity;
 
    
   
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement clkNextButtonInActivity;
    

    @FindBy(className = "android.view.View")
    public List<WebElement> closeIcon;

    
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.view.View[contains(@text,'COURSE')])[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Recommendations based on your profile details']//following-sibling::android.view.View[1]"),
        @AndroidBy(xpath = "//android.view.View[@text='Recommendations based on your profile details']//following::android.view.View[1]"),
        @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
        @AndroidBy(xpath = "//android.view.View[@text='Recommendations based on your profile details']//following::android.widget.Image[1]"),

      
})
public MobileElement clkFirstCourseForActivity;
 
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add for group']")
    public MobileElement clkAddForGroupBtn;
    

  
    @AndroidFindAll({
    	
 	   @AndroidBy(xpath = "//android.widget.TextView[@text='Course']"),
    	   	   @AndroidBy(xpath = "//android.view.View[contains(@text,'member')]"),
           @AndroidBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[@text='⠇']"),
           @AndroidBy(xpath = "//android.view.View[@text='Course']"),
})
public MobileElement verifyAddedMemberToGrp;

    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='close-icon']")
    public MobileElement clkCloseIconGrp;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='My groups']"),
            @AndroidBy(xpath = "//android.view.View[@text='My groups']//following::android.widget.Image"),
    })
    public MobileElement clkAddImgGrp;
  
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Share profile')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Share profile']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='share social']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='share']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='Share profile']"),
    })
    public MobileElement clkDikshaShareId;
    

    
  

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Programs']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Programs']"),
    })
    public MobileElement clkPrograms;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Projects']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Projects']"),
    })
    public MobileElement clkProjects;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Observation']"),
        @AndroidBy(xpath = "//android.view.View[@text='Observations']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Observations']"),
    })
    public MobileElement clkObservations;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Surveys']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Surveys']"),
    })
    public MobileElement clkSurveys;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Courses']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Courses']"),
    })
    public MobileElement clkCourses;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Reports']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Reports']"),
    })
    public MobileElement clkReports;


    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='more actions menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='more actions menu']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='ellipsis vertical']"),
    })
    public MobileElement clkMenuInGroup;

    
    @AndroidFindAll({
         @AndroidBy(xpath = "//android.widget.Button[@text='Enable discussions']"),
        @AndroidBy(xpath = "//android.view.View[@text='Enable discussions']"),
    })
    public MobileElement clkEnableDiscussions;

    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Disable discussions']"),
        @AndroidBy(xpath = "//android.view.View[@text='Disable discussions']"),
    })
    public MobileElement clkDisableDiscussion;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Disable Discussions']"),
    })
    public MobileElement clkPopupDisableDiscussion;

    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Discussions']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='access discussion forum']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='more actions menu']//preceding::android.widget.Button[1]"),
        @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='more']//preceding::android.widget.Image"),


    })
    public MobileElement clkenableDisIcon;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='0 Discussions']"),
        @AndroidBy(xpath = "//android.view.View[@text='0 Discussions']"),
        @AndroidBy(xpath = "//android.view.View[@text='0 discussions']"),

    })
    public MobileElement verify0Discussions;

  
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Start Discussion']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Start Discussion']"),
    })
    public MobileElement clkStartDiscussion;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Discussion topic*']//following::android.widget.EditText[1]"),
        @AndroidBy(xpath = "//android.view.View[@text='Ask A Question Or Post An Idea']//following::android.widget.EditText"),
        @AndroidBy(xpath = "//android.widget.EditText[@index='0']"),

    })
    public MobileElement askaQuesTextBox;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),

    })
    public MobileElement askaQuesTextBox1;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath = "//android.view.View[@text='Please elaborate your question or idea here*']//following::android.widget.EditText[1]"),
        @AndroidBy(xpath = "//android.view.View[@text='Please Elaborate Your Question Or Idea Here']//following::android.widget.EditText"),
        @AndroidBy(xpath = "//android.view.View[@text='Please elaborate your question or idea here']//following::android.widget.EditText"),

    })
    public MobileElement enterIdeaTxtBox;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[3]"),
              })
    public MobileElement enterIdeaTxtBox1;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
    })
    public MobileElement clkAsaQueSubmitBtn;

    @AndroidFindAll({
    	
    	   @AndroidBy(xpath = "//android.widget.TextView[@text='1 Discussions']"),    	
        @AndroidBy(xpath = "//android.view.View[@text='1 Discussions']"),
        @AndroidBy(xpath = "//android.view.View[@text='1 discussions']"),

    })
    public MobileElement verify1Discussions;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='1 Posts']"),
        @AndroidBy(xpath = "//android.view.View[@text='1 posts']"),

    })
    public MobileElement verify1Posts;

    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='0 Posts']"),
        @AndroidBy(xpath = "//android.view.View[@text='0 Posts']"),
        @AndroidBy(xpath = "//android.view.View[@text='0 posts']"),

    })
    public MobileElement verify0Posts;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='☰']"),
    })
    public MobileElement clickHambugMenuForum;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Categories']"),
    })
    public MobileElement verifyCatogries;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Tags']"),
    })
    public MobileElement verifyTags;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='My discussion']"),
        @AndroidBy(xpath = "//android.view.View[@text='My Discussions']"),
        
        @AndroidBy(xpath = "//android.widget.TextView[@text='My discussions']"),

    })
    public MobileElement verifyDiscussion;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Recent posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Recent Posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Recent posts']"),

    })
    public MobileElement verifyRecentPosts;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Best posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Best Posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Best posts']"),

    })
    public MobileElement verifyBestPosts;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Saved posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Saved Posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Saved posts']"),

    })
    public MobileElement verifySavedPosts;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Upvoted']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Upvoted']"),

    })
    public MobileElement verifyUpvoted;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Downvoted']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Downvoted']"),
    })
    public MobileElement verifyDownVoted;
    

    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Delete group']"),
        @AndroidBy(xpath = "//android.view.View[@text='Delete group']"),
    })
    public MobileElement clkDeleInMenuGrp;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Delete']"),
    })
    public MobileElement clkDeleteInPopUp;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='select app langugae ಭಾಷೆ ಕನ್ನಡ']"),

            @AndroidBy(xpath = "//android.view.View[@text='ಕನ್ನಡ']"),
    })
    public MobileElement verifyKannadaText;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='app settings ಸೆಟ್ಟಿಂಗ್ಸ್']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ಸೆಟ್ಟಿಂಗ್ಸ್']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='ಸಹಾಯ']"),
            @AndroidBy(xpath = "//android.view.View[@text='ಸೆಟ್ಟಿಂಗ್ಸ್']"),
    })
    public MobileElement verifySetingInKannada;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.view.View[contains(@text,'members')])[2]"),
            @AndroidBy(xpath = "//android.view.View[@text='members1tab']"),
            @AndroidBy(xpath = "//android.view.View[@text='Selected members1tab']"),
        @AndroidBy(xpath = "//android.view.View[@text='Members (1)']"),
    })
    public MobileElement clkMembersGrp;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='add-member Add member']"),
            @AndroidBy(xpath = "//android.widget.EditText[@index='1']//following::android.widget.Image"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Add')]"),
    })
    public MobileElement clkAddMembers;
    
    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement clkEnterDikshaID;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Verify']"),
    })
    public MobileElement clkVerifyBtn;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Add to group')]"),
        @AndroidBy(xpath = "//android.view.View[@index='4']//following::android.widget.Button"),
    })
    public MobileElement clkAddToGrp;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.view.View[@text='⠇'])[1]"),
        @AndroidBy(xpath = "//android.view.View[@text='⠇']"),
    })
    public MobileElement menuMember;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.view.View[@text='⠇'])[2]"),
    })
    public MobileElement menuMember1;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Remove from group']"),
        @AndroidBy(xpath = "//android.view.View[@text='Remove from group']"),
    })
    public MobileElement clkRemoveMembers;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Remove Member']"),
    })
    public MobileElement clkRemoveMembersPopup;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[@text='⠇']"),

})
public MobileElement clkMenuActivity;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Remove activity']")
    public MobileElement clkRemoveActivity;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Remove']"),

})
public MobileElement clkRemovePopupActivity;
    

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='notifications']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='notification']"),
    })
    public MobileElement clkNotificationIcon;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Yes']")
    public MobileElement clkYes;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='No']")
    public MobileElement clkNo;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Course']"),
            @AndroidBy(xpath = "//android.view.View[@text='Course']"),
    })
    public MobileElement recentlySearchedKeyword;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Help']"),
            @AndroidBy(xpath = "//android.view.View[@text='help Help']"),
            @AndroidBy(xpath = "//android.view.View[@text='Help']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Help']"),
    })
    public MobileElement clkHelpMenu;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Frequently asked questions']//following-sibling::android.view.View"),
            @AndroidBy(xpath = "//android.view.View[@text='Frequently asked questions']//following::android.view.View[3]"),
    })
    public MobileElement verifyFQAQestions;
    

    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.TextView[@text='×']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Close close icon']"),
            @AndroidBy(xpath = "//android.widget.Button[@resource-id='close-discussion-forum']"),
    })
    public WebElement clkCloseIconDF;
    

    @AndroidFindBy(xpath = "//android.view.View[@text='Question']")
    public MobileElement clkCreaedQues;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Switch to dark mode']"),
            @AndroidBy(xpath = "//android.view.View[@text='darkmode Switch to dark mode']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Switch to dark mode']"),
    })
    public MobileElement clkSwitchDarkMode;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Switch to default']"),
            @AndroidBy(xpath = "//android.view.View[@text='darkmode Switch to default']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Switch to default']"),
    })
    public MobileElement clkSwitchToDefault;


    @AndroidFindBy(xpath = "//android.view.View[@text='help Switch to classic DIKSHA experience']")
    public MobileElement clkSwitchClassDiksExpr;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Create New Project']")
    public MobileElement clkOnCreateNewProj;
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Do not share']")
    public MobileElement clkDoNotShare;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Automationproject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Updatedautomationproject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Projects assigned to me'][@class='android.view.View']"),
            @AndroidBy(xpath = "//android.view.View[@text='Projects assigned to me']//following::android.view.View[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Projects created by me']//following::android.view.View[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Projects Created by me']//following::android.view.View[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Created by me']//following::android.view.View[1]"),
    })
    public MobileElement clkFirstProject;



    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Name your project']//following::android.widget.EditText[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Name your project']"),
    })
    public MobileElement EnterNameYourProject;
    

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath = "//android.view.View[@text='What is the objective of your Project?']//following::android.widget.EditText[1]"),
           @AndroidBy(xpath = "//android.view.View[@text='What is the objective of your Project?']"),
            @AndroidBy(xpath = "//android.view.View[@text='What is the Objective of your Project?']"),
    })
    public MobileElement EnterDesciprtion;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Select category(s)']"),
            @AndroidBy(xpath = "//android.view.View[@text='pricetag outline Select category(s)']")
    })
    public MobileElement clkCategories;
    
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Teachers']")
    public MobileElement sltTeachersInCategry;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
    })
    public MobileElement clkSubmit;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Create and Continue']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Create and continue']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CREATE AND CONTINUE']"),
    })
    public MobileElement clkCreateAndContinue;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Your Project has been created successfully']")
    public MobileElement assertProjectCreationMsg;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE']"),
    })
    public MobileElement clkContinueBtn;
    
   
    @AndroidFindBy(xpath = "//android.view.View[@text='View Project']")
    public MobileElement clkViewProject;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='View Project']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='View project']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='VIEW PROJECT']"),
    })
    public MobileElement clkProjectView;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='AutomationProject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Project title : AutomationProject']"),
    })
    public MobileElement createdProjectTitle;

    @AndroidFindAll({
            @AndroidBy(xpath="//android.view.View[@text='Objective : DescriptionProject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Objective : DescriptionProject']"),
    })
    public MobileElement createdProjectObjective;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='more']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ellipsis vertical']"),
    })
    public MobileElement clkHamburgeMenu;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='create Edit']"),
            @AndroidBy(xpath = "//android.view.View[@text='Edit']"),
    })
    public MobileElement clkEditMenu;
    
    
    @AndroidFindBy(xpath = "//android.widget.Image[@text='create']")
    public MobileElement clkCreateIcon;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
            @AndroidBy(xpath = "//android.widget.EditText[@text='AutomationProject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Name your project']//following::android.widget.EditText[1]"),
            @AndroidBy(xpath = "//android.widget.EditText[contains(@text,'AutomationProject')]"),
    })
    public MobileElement clkEditProject;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath = "//android.widget.EditText[@text='DescriptionProject']"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Description')]//following::android.widget.EditText"),
    })
    public MobileElement clkEditProjectDesc;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Save edits']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SAVE EDITS']"),
    })
    public MobileElement clkEditProjectSave;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Project title : AutomationProjectUpdatedAutomationProject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Project title : UpdatedAutomationProject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Project title : AutomationProject']"),
    })

    public MobileElement assertUpdatedProjectName;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Objective : DescriptionProjectUpdatedDescriptionProject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Objective : UpdatedDescriptionProject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Objective : DescriptionProject']"),
    })

    public MobileElement assertUpdatedObjectiveDesc;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='sync circle Sync']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='sync circle Synced']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='sync offline']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='cloud upload']"),
    })
    public MobileElement clkCloudUploadBtn;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='The project is synced successfully']")
    public MobileElement assertMsgSync;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='sync circle Sync']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='sync done']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='cloud done']"),
    })
    public MobileElement assertCloudDoneBtn;
    

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'My learning')]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='My learning']"),
    })
    public MobileElement assertMyLearningSection;
    
    

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse by subject']")
    public MobileElement assertBrowseBySubject;
    
    
    

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse by category']")
    public MobileElement assertBrowseByCategory;
    
    

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']")
    public MobileElement clkBrowseByCategorySection;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[1]")
    public MobileElement assertContentAfterClkingSection;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Digital Textbook']//following::android.view.View[3]"),
    })
    public MobileElement assertContentAfterClkingSection1;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Accountancy']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Browse by subject']//following::android.widget.Button[1]"),
    })
    public MobileElement clkBrowseBySubjectSection;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@resource-id='tab-button-search']"),
            @AndroidBy(xpath = "//android.view.View[@text='discover']"),
    })
    public MobileElement clkSearchIcon;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Popular categories']"),
        @AndroidBy(xpath = "//android.view.View[@text='Popular categories']"),
})
public MobileElement assertPopularCatrgories;
    
    
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Explore content from other boards']"),
        @AndroidBy(xpath = "//android.view.View[@text='Explore content from other boards']"),
})
public MobileElement assertExploreContentFromOtherBoards;
    
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Explore content for a variety of audience']"),
        @AndroidBy(xpath = "//android.view.View[@text='Explore content for a variety of audience']"),
})
public MobileElement assertExploreContentForVarietyOfAudience;
  


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new ')]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Try new DIKSHA experience']"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new DIKSHA')]"),
            @AndroidBy(xpath = "//android.view.View[@text='help Try new DIKSHA experienceBeta']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Try new diksha_ntptest_org experience']"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new')]"),
    })
    public MobileElement clkNewDikshExperiece;
 
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']")
    public MobileElement assertDigitalTextBookSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Courses']")
    public MobileElement assertCourseSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Tv Classes']")
    public MobileElement assertTVClassesSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Videos']")
    public MobileElement assertVideoSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Audio']")
    public MobileElement assertAudioSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Interactive Content']")
    public MobileElement assertInteractiveContentSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Igot-health']")
    public MobileElement assertIGotSecInExploreContentFromOtherBoards;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Teacher']")
    public MobileElement assertTeacherSecInExploreContentForVarietyAudience;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Student']")
    public MobileElement assertStudentAudience;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Created By Me']"),
            @AndroidBy(xpath = "//android.view.View[@text='Created by me']")
    })
    public MobileElement assertCreatedByMeFilter;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Assigned To Me']"),
            @AndroidBy(xpath = "//android.view.View[@text='Assigned to me']")
    })
    public MobileElement assertAssignedToMe;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='skip']"),
            @AndroidBy(xpath = "//android.view.View[@text='Skip']"),
    })
    public MobileElement clkSkipBtn;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Select category(s)']")
    public MobileElement clkSltCatgories;
    
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Students']")
    public MobileElement sltStudentCategory;
    
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Category : Teachers , Students')]")
    public MobileElement assertUpdatedCategory;
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Share']")
    public MobileElement clkonMenuShare;
    
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SYNC & SHARE']")
    public MobileElement clkonSyncAndShareBtn;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='eye icon']"),
})
public MobileElement clkEyeIcon;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Testing')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Testing')]"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='Start Discussion']//following::android.view.View[3]"),
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='start-discussion']//following::android.view.View[3]"),
})
public MobileElement clkOnDiscussion;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@resource-id='group-actions']"),
})
public MobileElement clkOnKebabMenu;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Edit']"),
})
public MobileElement clkEditOption;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='☰']//following::android.view.View[3]"),
})
public MobileElement updatedTitle;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='☰']//following::android.view.View[6]"),
})
public MobileElement updatedDesc;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.EditText"),
})
public MobileElement commentsSection;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Post Reply']"),
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='update-post']"),
})
public MobileElement clkPostReply;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Reply']"),
})
public MobileElement clkReplyButton;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='delete icon']"),
})
public MobileElement clkOnDeleteBtn;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='OK']"),
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']"),
})
public MobileElement clkOkBtn;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='CANCEL']"),
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']"),
})
public MobileElement clkCancelBtn;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Delete']"),
        @AndroidBy(xpath = "//android.view.View[@resource-id='delete-topic']"),
})
public MobileElement deleteDiscussion;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='My groups']//following-sibling::android.view.View[1]"),
        @AndroidBy(xpath = "//*[@content-desc='Rosamond Padberg']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='My groups']//following::android.view.View[1]"),
        @AndroidBy(xpath = "//android.widget.Button[@text='group information']//following::android.view.View[9]"),
})
public MobileElement clkFirstGroup;

@AndroidFindAll({
        @AndroidBy(xpath = "//*[@resource-id='update-topic-popup']"),
    @AndroidBy(xpath = "//android.widget.Button[@text='Discard']//following::android.widget.Button[@index=1]"),
    @AndroidBy(xpath = "//android.widget.Button[@text='Update']"),
   @AndroidBy(xpath = "//android.widget.Button[@resource-id='update-topic-popup']"),
})
public MobileElement clkUpdateBtn;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Tags']//following::android.widget.EditText"),
})
public MobileElement tagsField;








































    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Projects Created by me']//following::android.view.View[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Created by me']//following::android.view.View[1]"),

    })
    public MobileElement viewproject;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Add your own task.']"),
    	@AndroidBy(xpath = "//android.widget.TextView[@text='New task']"),
	@AndroidBy(xpath = "//android.widget.Button[@text='close add']")})

	public MobileElement clknewtask;




    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText"),
            @AndroidBy(xpath = "//android.view.View[@text='Assigned to']//following::android.widget.EditText[1]")
    })
    public MobileElement clkassignedtoobj;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='End date']")
    	public MobileElement clkondatecalender;

    	@AndroidFindAll({
                @AndroidBy(xpath = "//android.widget.Button[@text='Done']"),
                @AndroidBy(xpath = "//android.widget.Button[@text='DONE']"),
        })
    	public MobileElement clkoncurrentdate;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Assigned to']//following::android.widget.EditText[2]")
    	public MobileElement clktaskdescriptionobj;

    	@AndroidFindAll({
                @AndroidBy(xpath = "//android.widget.Button[@text='Add task']"),
                @AndroidBy(xpath = "//android.widget.Button[@text='Add Task']")
        })
    	public MobileElement clkaddtask;
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='ellipsis vertical outline']")
    	public MobileElement clkonverticalmenu;
    	
    	
    	 @AndroidFindAll({
    	    	@AndroidBy(xpath = "//android.view.View[@text='Edit']"),
    		@AndroidBy(xpath = "//android.view.View[@text='Edit create']")})
    		public MobileElement clkonverticalmenuedit;
    	
    
    	@AndroidFindBy(xpath = "//android.widget.Image[@index='1']")
    	public MobileElement clkoneditassigntask;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Not Started']")
    	public MobileElement clkonstatusedit;
    	
    	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Completed']")
    	public MobileElement clkoneditcompleted;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    	public MobileElement clkonok;
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='create'and @index='0']")
    	public MobileElement clkeditassigntask;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText"),
            @AndroidBy(xpath = "//android.view.View[@text='Edit Assignee’s Name']//following::android.widget.EditText")
    })

    public MobileElement editassignname;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Save']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SAVE']"),
    })

    	public MobileElement clksavebutton;
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='subdirectory_arrow']//following::android.widget.EditText")
    	public MobileElement clksubtask;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Add files']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Add Files']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ADD ATTACHMENT']"),
    })

    public MobileElement clkaddattachment;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Reports']")
    	public MobileElement clkonreports;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Improvement Reports']")
    	public MobileElement clkonimprovementreports;


    	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
        public MobileElement noDataPopup;

    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='Download']")
    	public MobileElement clkondownloadfromverticalmenu;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    	public MobileElement clkonallowpopup;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Browse DIKSHA library to find relevant content based on your preferences (Board, Medium, Class)']//preceding::android.view.View[contains(@text,'Welcome')]")
    	public MobileElement welcomelogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Projects']")
    	public MobileElement projectslogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Project view']")
    	public MobileElement projectviewlogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Reports']")
    	public MobileElement reportslogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Project overview']")
    	public MobileElement projectoverviewlogo;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='search']")
    	public MobileElement clksearchIcon;
    	
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='log in outline']")
    	public MobileElement clkonloginofmenubar;
    		
    		
    		
    		@AndroidFindAll({
    			
                @AndroidBy(xpath = "//android.widget.TextView[@text='Merge Account']"),
                    @AndroidBy(xpath = "//android.view.View[@text='Merge Account']"),
                    @AndroidBy(xpath = "//android.widget.Button[@text='Merge Account']"),
            })
    		public MobileElement clkonmergeaccount;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Merge']")
    				public MobileElement clkonmergebuttonofpopup;
    				
    				

    				@AndroidFindAll(
    						{@AndroidBy(xpath = "//android.view.View[@text='Account merge has been successfully initiated. You will be notified once it is complete.'][@index='1']"),
    					  @AndroidBy(xpath= "//android.view.View[@text='Merge Account']//following::android.view.View[@text='Account merge has been successfully initiated. You will be notified once it is complete.']")
    					})
    		public MobileElement errorpopup;
    				
    				@AndroidFindAll({
                            @AndroidBy(xpath = "//android.widget.Button[@text='Programs']"),
                            @AndroidBy(xpath = "//android.view.View[@text='Programs']"),
                    })
    				public MobileElement clkonprograms;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='Observation Led Projects Testing']")
    				public MobileElement clkonObservationledprojectstesting;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='View and participate in educational programs active in your location and designed for the role you selected']//following::android.view.View[@index='1']")
    				public MobileElement clkonObsrvationledprojectstetingfirstindex;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='ADD ENTITY']//following::android.view.View[@index='0']")
    				public MobileElement clkonleadershipselfassesmentaddentityfirstindex;
    				//android.widget.Button[@text='Completed']//following::android.view.View[@index='0']
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Completed']//following::android.view.View[@index='0']")
    				public MobileElement clkonobservaionfirstindex;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='Domains']//following::android.view.View[@index='1']")
    				public MobileElement clkondomainsfirstindex;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='arrow forward Start Observation']")
    				public MobileElement clkonstartobservtion;
    				
    				@AndroidFindBy(xpath = "//android.widget.TextView[@text='Reflection & Teaching']")
    				public MobileElement clkonreflectionteaching;
    				//android.widget.CheckBox[@resource-id='ion-cb-0']
    				
    				@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.CheckBox[@index='1']"),
    				    @AndroidBy(xpath = "//android.widget.CheckBox[@resource-id='ion-cb-0']") })
    					public MobileElement clkonfirstindexofhabits;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT arrow forward']")
    				public MobileElement clkonnextarrowforward;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='save SAVE']")
    				public MobileElement clkonsavebutton;

    @AndroidFindAll({

           @AndroidBy(xpath = "//android.view.View[contains(@text,'Testing')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Programs View and participate in educational programs active in your location and designed for the role you selected']//following::android.view.View"),
            @AndroidBy(xpath = "//android.view.View[@text='View and participate in educational programs active in your location and designed for the role you selected']//following::android.view.View")
    })
    public MobileElement allprogramnames;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='save SAVE']")
    				public MobileElement clkDontUploadbtn;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Add subtask']")
    				public MobileElement clAddSubtaskbtn;

    				@AndroidFindAll({
                            @AndroidBy(xpath = "//*[@resource-id='ion-cb-2']"),
                            @AndroidBy(xpath = "//*[@resource-id='ion-cb-1']"),
                            @AndroidBy(xpath = "//android.view.View[@text='Upload Evidences']//following::android.widget.CheckBox"),
                    })
    				public MobileElement clkCheckboxAAttachmentPopup;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Upload']")
    				public MobileElement clkUploadBtnAttachmentPopup;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    })

    public MobileElement clkContinuewBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'test')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Task details']//following::android.view.View[2]"),
            @AndroidBy(xpath = "//android.view.View[@text='Upcoming']//following::android.view.View"),
            @AndroidBy(xpath = "//android.view.View[@text='Today']//following::android.view.View"),
    })
    				public MobileElement clkCreatedTask;

    @AndroidFindBy(xpath = "//android.view.View[@text='Completed']")
    public MobileElement assertCreatedTaskWithCompleteStatus;
    				
    				

    				
    				
    				
    				@AndroidFindAll({
                            @AndroidBy(xpath = "//android.widget.Button[@text='selected ALL']"),
    	                @AndroidBy(xpath = "//android.widget.Button[@text='All']"),
    	        })
    	         public MobileElement allMediaType;

    	    	@AndroidFindAll({
                        @AndroidBy(xpath = "//android.widget.Button[@text='VIDEO']"),
    	                @AndroidBy(xpath = "//android.widget.Button[@text='Video']"),
    	        })
    	        public MobileElement videoMediaType;

    	     @AndroidFindAll({
                     @AndroidBy(xpath = "//android.widget.Button[@text='DOC']"),
    	             @AndroidBy(xpath = "//android.widget.Button[@text='Documents']"),
    	     })
    	    public MobileElement documentsMediaType;

    	     @AndroidFindAll({
                     @AndroidBy(xpath = "//android.widget.Button[@text='INTERACTION']"),
    	             @AndroidBy(xpath = "//android.widget.Button[@text='Interactive']"),
    	     })
    	    public MobileElement interactiveMediaType;
    	     
    	 @AndroidFindBy(xpath = "//android.widget.Button[@text='search filter']")
    	    public MobileElement filtersbutton;

    	 @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.TextView[@text='Media Type']"),
                 @AndroidBy(xpath = "//android.view.View[@text='Media Type']"),
         })
    	     public MobileElement mediaTypefilter;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[4]")
    	    public MobileElement firstContentUnderVideoType;

    	     @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Button[@text='Play video']"),
                     @AndroidBy(xpath = "//android.widget.Button[contains(@text,'PLAY')]"),
             })
    	    public MobileElement playIconOfVideo;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='Course']")
    	    public MobileElement courseSecInTraining;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='English']")
    	    public MobileElement englishSubject;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='Accountancy']")
    	    public MobileElement accountancySubject;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='Assamese']")
    	    public MobileElement assameseSubject;
    	     
    	     @AndroidFindBy(xpath = "//android.widget.Button[@text='VIEW MORE']")
    	    public MobileElement viewMoreBtn;
    	     
    	     
    	     @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='English']"),
         })
        public MobileElement observeEnglishSub;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='Accountancy']"),
         })
        public MobileElement observeAccountancySub;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='Biology']"),
         })
        public MobileElement observeBiologySub;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='You are offline']"),
         })
        public MobileElement offlineMessage;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Button[@text='Course details']"),
         })
        public MobileElement courseDetailsLabel;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Button[@text='Course modules']"),
         })
        public MobileElement courseModulesLabel;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.ToggleButton"),
                 @AndroidBy(xpath = "//android.widget.Image[@text='arrow-down']//following::android.widget.Button"),
         })
        public MobileElement contentPlayBtn;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.widget.Button[@text='burger menu']"),
       })
        public MobileElement clkBurgerMenu;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.widget.Button[@text='Settings']"),
               @AndroidBy(xpath = "//android.view.View[@text='Settings']"),
       })
        public MobileElement clkSettings;


       @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.TextView[@text='Merge Account']"),
               @AndroidBy(xpath = "//android.widget.Button[@text='Merge Account']"),
               @AndroidBy(xpath = "//android.view.View[@text='Merge Account']"),
       })
        public MobileElement clkMergeAccount;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.widget.Button[@text='Merge']"),
       })
        public MobileElement clkMergeBtn;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.view.View[@text='Merge Account']"),
       })
        public MobileElement verifyMergeAccountText;


      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[@text='My Course']//following::android.view.View[1]"),
      })
        public MobileElement verifyTrainingAfterMerge;
    	     
    	     
      @AndroidFindAll({
          @AndroidBy(xpath = "//android.view.View[@text='delete']"),
  })
    public boolean deleteAssertGrp;
	     
	     
    	     
      @AndroidFindBy(xpath = "//android.widget.Button[@text='eye Certificate']")
      public MobileElement certificateIcon;
      
      
  
      
      @AndroidFindAll({
    	  @AndroidBy(xpath = "//android.widget.Button[@text='ALLOW']"),
    	  @AndroidBy(xpath = "//android.widget.Button[@text='Allow']"),
  })
  public MobileElement clkAllowIcon;

      
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Download Download']")
      public MobileElement clkDownloadBtn;
      
      
 
      @AndroidFindAll({
    	  @AndroidBy(xpath = "//android.widget.TextView[@text='PDF']"),
    	  @AndroidBy(xpath = "//android.view.View[@text='PDF']"),
  })
  public MobileElement assertPdfCertificate;

      
      
      @AndroidFindBy(xpath = "//android.view.View[@text='PNG']")
      public MobileElement assertPngCertificate;
      
      @AndroidFindAll({
    	  @AndroidBy(xpath = "//android.widget.TextView[@text='Certificate is getting downloaded']"),
    	  @AndroidBy(xpath = "//android.view.View[@text='Certificate is getting downloaded']"),
  })
  public MobileElement assertToastMessage;

      
      
      @AndroidFindBy(xpath = "//android.widget.Button[@text='menu']")
      public MobileElement assertHamburgerMenu;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='settings']")
      public MobileElement assertSettingsButton;

      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[contains(@text,'Space taken by SUNBIRD:')]"),
              @AndroidBy(xpath = "//android.view.View[contains(@text,'Space taken by DIKSHA:')]"),
      })
      public MobileElement assertSpaceTakenByDiksha;

      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[contains(@text,'Available:')]"),
              @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Available:')]"),
      })
      public MobileElement assertAvailableSpace;

      @AndroidFindBy(xpath = "//android.view.View[@text='No downloads yet']")
      public MobileElement assertNoDownloads;
      @AndroidFindBy(xpath = "//android.view.View[@text='Select All']")
      public MobileElement assertSelectAll;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Sort By Content size']")
      public MobileElement assertContentSize;

      @AndroidFindAll({
              @AndroidBy(xpath = "(//android.view.View[contains(@text,'RESOURCE')])[1]"),
              @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 100 results')]//following::android.view.View[1]"),
      })
      public MobileElement clkFirstContent;

      @AndroidFindBy(xpath = "//android.widget.Button[@text='download content Download']")
      public MobileElement clkDownloadButton;

      @AndroidFindBy(xpath = "//android.widget.Button[@text='Download']")
      public MobileElement clkDownload;

      @AndroidFindBy(xpath = "//android.widget.Button[@text='Content size']")
      public MobileElement assertContentSizefilter;

      @AndroidFindBy(xpath = "//android.widget.Button[@text='Last viewed']")
      public MobileElement assertLastViewedFilter;

      @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Delete')]")
      public MobileElement clkDeleteBtn;

      @AndroidFindBy(xpath = "//android.widget.Button[@text='Create Group Create group']")
      public MobileElement assertCreateGroupIcon;

      @AndroidFindBy(xpath = "//android.widget.Image[@text='My groups']")
      public MobileElement assertPlaceHolderImages;

      @AndroidFindBy(xpath = "//android.view.View[@text='You are just a step away from creating a group']")
      public MobileElement assertTextInMyGroupPage;
     
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Permissions']")
      public MobileElement clkPermissions;

      @AndroidFindBy(xpath = "//android.view.View[@text='Camera']")
      public MobileElement assertCamera;

      @AndroidFindBy(xpath = "//android.view.View[@text='File Manager']")
      public MobileElement assertFileManager;

      @AndroidFindBy(xpath = "//android.view.View[@text='Microphone']")
      public MobileElement assertMicrophone;

      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[@text='Camera']//following-sibling::android.view.View[1]"),
              @AndroidBy(xpath = "//android.view.View[@text='Camera']//following::android.view.View[2]")
      })
      public MobileElement clkCameraPermission;

      @AndroidFindBy(xpath = "//android.widget.TextView[@text='Permissions']")
      public MobileElement clkOnPermissions;
      @AndroidFindBy(xpath = "//android.widget.TextView[@text='Camera']")
      public MobileElement clkOnCamera;
      @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Allow only while using the app']")
      public MobileElement assertAllowOnlyUsingApp;
      @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Ask every time']")
      public MobileElement assertAskEveryTime;
      @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Deny']")
      public MobileElement assertDenyPermissions;

      @AndroidFindAll({
              @AndroidBy(xpath = "//android.widget.Button[@text='Language']"),
              @AndroidBy(xpath = "//android.widget.Image[@text='select app langugae']")

      })
      public MobileElement appLanguageInEnglish;

      @AndroidFindAll({
              @AndroidBy(xpath = "//android.widget.Button[@text='Hindi']"),
              @AndroidBy(xpath = "//android.widget.Button[@text='हिंदी']")
      })
      public MobileElement sltHindiLanguage;

     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
             @AndroidBy(xpath = "//android.widget.Button[@text='जारी रखें']")
     })
      public MobileElement clkContinueInHindi;


      @AndroidFindBy(xpath = "//android.widget.Button[@text='भाषा']")
      public MobileElement appLanguageInHindi;

      @AndroidFindBy(xpath = "//android.widget.Button[@text='English']")
      public MobileElement sltEnglishLang;

      @AndroidFindAll({
              @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
              @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE']")
      })
      public MobileElement clkContinueInEnglish;
     
     
      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[@text='Accountancy']//following::android.view.View[1]"),
              @AndroidBy(xpath = "//android.view.View[@text='Digital Textbook']//following::android.view.View[3]")
      })
    
      @AndroidFindAll({
              @AndroidBy(xpath = "//*[@resource-id='tab-button-home']"),
              @AndroidBy(xpath = "//android.view.View[@text='home']"),
              @AndroidBy(xpath = "//android.view.View[contains(@text,'home')]"),
      })
      public MobileElement clkHomePageTab;

      @AndroidFindBy(xpath = "//android.view.View[contains(@text,'More')]")
      public MobileElement tapMoreBtn;
      @AndroidFindBy(xpath = "//android.view.View[@index=4]")
      public MobileElement selectUser;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Change User']")
      public MobileElement clkChangeUser;
        
      
         @AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel']")
         public MobileElement clkCancel;
         
         
 
         
         @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'If you have two accounts with SUNBIRD, click')]"),
             @AndroidBy(xpath = "//android.widget.TextView[@text='If you have two accounts with DIKSHA, click ']"),
     })
     public MobileElement twoAccountswithDikshaText;
         
         
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='Merge']")
         public MobileElement assertMergeText;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancel']")
         public MobileElement assertCancelText;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='combine usage details of both accounts, and']")
         public MobileElement assertCombineAccountsText;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='delete the other account']")
         public MobileElement assertDeleteAccountText;
         
         

         
         
         @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.TextView[@text='Login']"),
             @AndroidBy(xpath = "//android.view.View[@text='Login']"),
     })
     public MobileElement LoginPageText;

         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='Enter Email Address / Mobile Number']"),
                 @AndroidBy(xpath = "//android.view.View[@text='Enter Email Address / Mobile number']"),
         })
         public MobileElement assertEmailAddressLabel;

         @AndroidFindBy(xpath = "//android.view.View[@text='Password']")
         public MobileElement assertPasswordLabel;

         @AndroidFindBy(xpath = "//android.widget.Button[@text='Debug Mode']")
         public MobileElement clkDebugMode;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'This action will send critical information')]"),
                 @AndroidBy(xpath = "//android.view.View[@text='DEBUG MODE']//following::android.view.View"),
         })
         public MobileElement verifyMessageAfterClkDebug;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='TURN ON']")
         public MobileElement clkTurnOnBtn;


         @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Debug Mode']")
         public MobileElement clkDebugChkBox;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='TURN OFF']")
         public MobileElement clkTurnOffBtn;


         @AndroidFindBy(xpath = "//android.widget.TextView[@text='My groups']//following::android.view.View[@text='New']")
         public MobileElement assertNewTagInMyGroups;


         @AndroidFindBy(xpath = "//android.widget.TextView[@text='Import Content']//following::android.view.View[@text='New']")
         public MobileElement assertNewTagInImportContent;


            
         @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.Button[@text='Login']"),
             @AndroidBy(xpath = "//android.widget.Button[@text='log in outline Login']"),
     })
     public MobileElement assertUserLoginText;

         @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Guest')]")
         public MobileElement assertGuestUserInProfile;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
         public MobileElement assertUserLoginBtn;


         @AndroidFindAll({
        	
             @AndroidBy(xpath = "//android.widget.TextView[@text='LOGIN']"),
                 @AndroidBy(xpath = "//android.view.View[@text='LOGIN']"),
                 @AndroidBy(xpath = "//android.widget.TextView[@text='Login to DIKSHA']"),
         })
         public MobileElement assertLoginPageText;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']")
         public MobileElement assertDikshaLogoLogin;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Button[contains(@text,'प्रकाश संश्लेषण')]"),
                 @AndroidBy(xpath = "//android.widget.Button[contains(@text,'HS course')]"),
                 @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Copy')]"),
                 @AndroidBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[1]"),
         })
         public MobileElement courseUnderFirstGrp;


         @AndroidFindBy(xpath = "//android.view.View[@text='Your Progress']//following::android.view.View[contains(@text,'completed')]")
         public MobileElement assertCourseProgress;


         @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Activity dashboard')]")
         public MobileElement clkActivityDashboard;


         @AndroidFindBy(xpath = "//android.view.View[@text='Download as CSV']")
         public MobileElement downLoadCSVfile;


         @AndroidFindBy(xpath = "//android.view.View[@text='Name: activate to sort column descending']")
         public MobileElement nameUnderDashboard;


         @AndroidFindBy(xpath = "//android.view.View[@text='Progress%: activate to sort column ascending']")
         public MobileElement progressUnderDashboard;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Adah')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Emiliano')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'A1')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[6]"),
         })
         public MobileElement firstMemberUnderDashboard;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Kraig')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Joelle')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Test')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[10]"),
         })
         public MobileElement secondMemberUnderDashboard;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'33')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'67')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'25')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'50')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[7]"),
         })
         public MobileElement progressPercentageFirstMember;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'33')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'67')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'25')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'50')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[8]"),
         })
         public MobileElement individualScoreInDashboard;


         @AndroidFindBy(xpath = "//android.view.View[@text='NA']")
         public MobileElement assertNAinDashboard;

         @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.TextView[@text='Browse by Digital Textbook']"),
             @AndroidBy(xpath = "//android.view.View[@text='Explore Digital Textbook']"),
     })
     public MobileElement assertDigitalTextBookSec;


      

         @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']")
         public MobileElement clkFilter;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.ListView[@text=', selected ,Select Publisher']"),
                 @AndroidBy(xpath = "//android.widget.ListView[contains(@text,'Select Publisher')]"),
                 @AndroidBy(xpath = "//android.view.View[@text='Publisher']//following::android.widget.Image[1]"),
         })
         public MobileElement clkPublisherDropdown;


         @AndroidFindBy(xpath = "//android.widget.CheckBox")
         public MobileElement clkFirstPublisher;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
         public MobileElement clkSubmitBtn;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Button[@text='Apply']"),
                 @AndroidBy(xpath = "//android.widget.Button[@text='APPLY']")
         })
         public MobileElement clkApplyBtn;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK')]"),
                 @AndroidBy(xpath = "//android.widget.Button[@text='Digital Textbook']//following::android.view.View[3]"),
                 @AndroidBy(xpath = "//android.view.View[@text='Digital Textbook']//following::android.view.View[3]")
         })
         public MobileElement assertTextBookPostFilter;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='SWITCH TO NEW EXPERIENCE']")
         public MobileElement assertDikshaExpForHead;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='Log out']"),
                 @AndroidBy(xpath = "//android.widget.Button[@text='Log out']"),
         })
         public MobileElement clkLogout;


         @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.Button[@text='back']"),

                 @AndroidBy(xpath = "//android.widget.Image[@text='back']"),
                 @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
         })
         public MobileElement clkBackBtn;


         @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'I confirm that this Content complies with prescribed guidelines,including the')]")
         public MobileElement assertPrivacyPopup;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'Automationproject')]"),
                 @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationProject')]"),
                 @AndroidBy(xpath = "//android.view.View[@text='Projects assigned to me'][@class='android.view.View']"),
                 @AndroidBy(xpath = "//android.view.View[@text='Projects assigned to me']//following::android.view.View[1]"),
                 @AndroidBy(xpath = "//android.view.View[@text='Projects Created by me']//following::android.view.View[1]"),
                 @AndroidBy(xpath = "//android.view.View[@text='Created by me']//following::android.view.View"),
         })
         public MobileElement assertCreatedProjectExploreProject;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Image[@text='My groups']//following-sibling::android.view.View[1]"),
                 @AndroidBy(xpath = "//android.view.View[@text='My groups']//following::android.view.View[1]"),
         })
    public MobileElement clkOnFirstGrp;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Edit group details']")
    public MobileElement clkEditGroupDetails;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Deactivate group']")
    public MobileElement clkDeactivateGroup;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Deactivate group? close']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Deactivate group?']"),
    })
    public MobileElement assertDeactivateGroupText;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Deactivate']")
    public MobileElement clkDeactivateBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'This group is temporarily inactive')]")
    public MobileElement assertInactiveGrpAfterDeactivated;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Activate']")
    public MobileElement clkActivateBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Activate group']")
    public MobileElement clkActivateGroup;


    @AndroidFindBy(xpath = "//android.view.View[@text='Deactivated']")
    public MobileElement assertDeactivatedGroups;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Programs']")
    public MobileElement assertProgramsInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Projects']")
    public MobileElement assertProjectsInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Observation']")
    public MobileElement assertObservationsInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Surveys']")
    public MobileElement assertSurveysInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Icon Report other issue Report Other Issue']")
    public MobileElement clkOnReportOtherIssue;


    @AndroidFindBy(xpath = "//android.view.View[@text='Report an issue']")
    public MobileElement assertReportAnIssueText;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select Category']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Category']"),
    })
    public MobileElement clkSelectCategory;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Content']"),
            @AndroidBy(xpath = "//android.view.View[@text='Content']"),
    })
    public MobileElement clkOnContent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
    })
    public MobileElement clkSubmitButton;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select Subcategory']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subcategory']")
    })
    public MobileElement clkSelectSubcategory;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Content Availability']"),
            @AndroidBy(xpath = "//android.view.View[@text='Content availability']"),
    })
    public MobileElement clkOnContentAvailability;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select Board']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Board']"),
    })
    public MobileElement clkSelectBoard;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='CBSE/NCERT']"),
            @AndroidBy(xpath = "//android.view.View[@text='CBSE/NCERT']"),
    })
    public MobileElement clkOnCBSEBoard;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select Medium']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Medium']"),
    })
    public MobileElement clkSelectMedium;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='English']"),
            @AndroidBy(xpath = "//android.view.View[@text='English']"),
    })
    public MobileElement clkOnEnglish;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select Grade']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Grade']"),
    })
    public MobileElement clkSelectGrade;

   @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.TextView[@text='Class 1']"),
           @AndroidBy(xpath = "//android.view.View[@text='Class 1']"),
   })
    public MobileElement clkOnGrade;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select Subject']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subject']"),
    })
    public MobileElement clkSelectSubject;

   @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.TextView[@text='Hindi']"),
           @AndroidBy(xpath = "//android.view.View[@text='Hindi']"),
   })
   public MobileElement clkOnHindi;

   @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.TextView[@text='Mathematics']"),
           @AndroidBy(xpath = "//android.view.View[@text='Mathematics']"),
   })
    public MobileElement clkOnMathematics;


    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'English, Hindi')]")
    public MobileElement assertMultipleSubjects;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.ListView[@text='Select Content Type']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Content Type']"),
    })
    public MobileElement clkSelectContentType;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Digital Textbook']"),
            @AndroidBy(xpath = "//android.view.View[@text='Digital Textbook']"),
    })
    public MobileElement clkOnDigitalTextbook;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Browse other categories']"),
            @AndroidBy(xpath = "//android.view.View[@text='Browse other categories']")
    })
    public MobileElement assertbrowseOtherCategories;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Observation']")
    public MobileElement clkOnObservation;


    @AndroidFindBy(xpath = "//android.view.View[@text='Observation']")
    public MobileElement assertObservationText;


    @AndroidFindBy(xpath = "//android.widget.EditText//following::android.view.View[1]")
    public MobileElement assertFirstObservation;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='back icon Back']")
    public MobileElement clkBackbutton;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Edit')]")
    public MobileElement clkOnEdit;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Role')]//following::android.widget.ListView[1]")
    public MobileElement clkOnRole;


    @AndroidFindBy(xpath = "//android.view.View[@text='Student']")
    public MobileElement selectStudentRole;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement clkOnSubmitBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Teacher']")
    public MobileElement selectTeacherRole;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']")
    public MobileElement clkOnCourseInHomePage;


    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.TextView[@text='Browse by Course']"),
            @AndroidBy(xpath = "//android.view.View[@text='Browse by Course']"),
            @AndroidBy(xpath = "//android.view.View[@text='Explore Course']"),
    })
    public MobileElement assertExploreCourse;


    @AndroidFindAll({
           @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Course']//following::android.view.View[3]"),
    })
    public MobileElement clkOnFirstInExploreCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='User Type : Student']"),
            @AndroidBy(xpath = "//android.view.View[@text='User Type : Teacher']")
    })
    public MobileElement assertUserTypeInCourseDetails;


    @AndroidFindBy(xpath = "//android.view.View[@text='No tags Available !']")
    public MobileElement assertNoTagsAvailable;


    @AndroidFindBy(xpath = "//android.view.View[@text='Stay tuned ! we will be updating our tags library and add them here']")
    public MobileElement assertTextInTagsSection;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='back-image Back']"),
})
    public MobileElement assertBackButton;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='category card icon']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='Buffer-image']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='☰']//following::android.view.View")
    })
    public MobileElement clkOnGeneralDiscussion;


    @AndroidFindBy(xpath = "//android.view.View[@text='Discussion topic*']")
    public MobileElement assertDiscussionTopic;


    @AndroidFindBy(xpath = "//android.view.View[@text='Ask a Question']")
    public MobileElement assertAskAQuestion;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Update']")
    public MobileElement assertUpdateBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement assertSubmitBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='English Medium']")
    public MobileElement assertEnglishMediumLibrary;


    @AndroidFindBy(xpath = "//android.view.View[@text='English']")
    public MobileElement assertEnglishMediumInProfile;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Class 5']"),
            @AndroidBy(xpath = "//android.view.View[@text='Class 4']"),
    })
    public MobileElement assertClassInProfile;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Assamese Medium']"),
            @AndroidBy(xpath = "//android.view.View[@text='Hindi Medium']"),
    })
    public MobileElement clkHindiMediumInLibraryPage;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Class 6']"),
            @AndroidBy(xpath = "//android.view.View[@text='Class 5']"),
    })
    public MobileElement clkClass5InLibraryPage;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Recently viewed')]")
    public MobileElement assertRecentlyViewedSection;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='JOIN COURSE']")
    public MobileElement assertJoinCourseBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE CourseContent')]")
    public MobileElement clkcourseContent;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE CourseContent1')]")
    public MobileElement clkcourseContent1;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'information circle Last date to join ')]")
    public MobileElement assertEnrollmentEndDate;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Enrolments for this batch closed on')]")
    public MobileElement assertEnrollmentClosedMsg;


    @AndroidFindBy(xpath = "//android.view.View[@text='There are no batches available for this course']")
    public MobileElement assertNoBatchesForThisCourseMsg;


    @AndroidFindBy(xpath = "//android.view.View[@text='No batches available']")
    public MobileElement assertExpiredCourseMsg;


    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@resource-id='tab-button-courses']"),
            @AndroidBy(xpath = "//android.view.View[@text='courses']"),
    })
    public MobileElement assertCoursesTab;


    @AndroidFindBy(xpath = "//android.view.View[@text='qrscanner']//preceding::android.view.View[2]")
    public MobileElement assertCourseTabInClassicExperience;


    @AndroidFindBy(xpath = "//android.view.View[@text='qrscanner']//preceding::android.view.View[2]")
    public MobileElement assertSearchTabInNewExperience;


    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@resource-id='tab-button-search']"),
            @AndroidBy(xpath = "//android.view.View[@text='discover']"),
    })
    public MobileElement assertSearchTab;


    @AndroidFindBy(xpath = "//android.view.View[@text='Search DIKSHA']")
    public MobileElement assertSearchPageText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Popular categories']")
    public MobileElement assertPopularCategories;


    @AndroidFindBy(xpath = "//android.view.View[@text='resources']")
    public MobileElement assertLibraryPage;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='medium0']")
    public MobileElement assertMediumInLibraryPage;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='class0']")
    public MobileElement assertClassInLibraryPage;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement assertSearchBar;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='Cbse/ncert']")
    public MobileElement assertCbseNcertBoard;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Browse by Digital Textbook']"),
            @AndroidBy(xpath = "//android.view.View[@text='Explore Digital Textbook']"),
    })
    public MobileElement assertExploreDigitalTextBookText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore CBSE/NCERT']")
    public MobileElement assertExploreCbseNcertText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Courses']")
    public MobileElement assertExploreCoursesUnderTeacher;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'Subject')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Subject, Subject']"),
    })
    public MobileElement assertSubjectInExploreDigitalTextbook;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'Role')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Role, Role']"),
    })
    public MobileElement assertRoleInExploreDigitalTextbook;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']")
    public MobileElement assertAdvancedFilter;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']")
    public MobileElement navigationBasedOnPrimaryCategory;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']//following::android.widget.Button[1]")
    public MobileElement navigationBasedOnPrimaryCategory1;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Accountancy']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Digital Textbook']//following::android.view.View[2]"),
    })
    public MobileElement groupingBasedOnSubject;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']//following::android.view.View[4]")
    public MobileElement groupingBasedOnSubject1;


    @AndroidFindAll({
@AndroidBy(xpath = "//android.view.View[contains(@text,'Subject : Accountancy')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Digital Textbook']//following::android.view.View[3]"),
    })
    public MobileElement contentBasedOnSubject;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']//following::android.view.View[5]")
    public MobileElement contentBasedOnSubject1;


      @AndroidFindAll({
              @AndroidBy(xpath = "//android.widget.TextView[@text='Downvoted']//following::android.view.View"),
              @AndroidBy(xpath = "//android.widget.TextView[@text='Downvoted']//following::android.view.View[2]"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Downvoted']//following::android.view.View"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Downvoted']//following::android.view.View[2]"),
    })
    public MobileElement assertDataUnderMyDiscussions;


      @AndroidFindAll({
              @AndroidBy(xpath = "//android.widget.TextView[@text='Start Discussion']//following::android.view.View[2]"),
              @AndroidBy(xpath = "//android.widget.Button[@text='Start Discussion']//following::android.view.View[2]")
      })
    public MobileElement assertDiscussionList;



     @AndroidFindBy(xpath = "//android.widget.Image[@text='book-icon']//following::android.view.View[2]")
    public MobileElement assertUpdatedCardForActivity1;



     @AndroidFindBy(xpath = "//android.widget.Image[@text='book-icon']//following::android.view.View[8]")
    public MobileElement assertUpdatedCardForMoreActivity;



     @AndroidFindBy(xpath = "//android.view.View[@text='Select category']")
     public MobileElement assertSelectcategoryText;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Course & certificates']")
    public MobileElement clkCourseAndCertificates;



     @AndroidFindBy(xpath = "//android.view.View[@text='Course & certificates']")
    public MobileElement assertCourseAndCertificatesPageText;

     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.Button[@text='I have completed the training but my progress is not 100%.']"),
             @AndroidBy(xpath = "//android.view.View[@text='I have completed the training but my progress is not 100%.']"),
     })
    public MobileElement assertIncorrectProgressFAQ;



     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'DIKSHA marks training progress as 100%')]")
    public MobileElement assertSolutionForIncorrectProgress;



     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Did this answer help you')]")
    public MobileElement assertAnswerHelpYouQuestion;



     @AndroidFindBy(xpath = "//android.widget.Button[@text='Yes']")
    public MobileElement assertYesButton;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='No']")
    public MobileElement assertNoButton;



     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Hi')]")
    public MobileElement assertWelcomeMessage;


     @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your preferences']")
    public MobileElement assertYourPreference;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='preferences-info']")
    public MobileElement assertPreferenceInfoImage;


     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Guest')]")
    public MobileElement assertUser;


     @AndroidFindBy(xpath = "//android.view.View[@text='Browse DIKSHA library to find relevant content based on your preferences (Board, Medium, Class)']")
    public MobileElement assertBrowseDIKSHAlibraryMessage;


     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.Button[@text='Change']"),
             @AndroidBy(xpath = "//android.widget.Button[@text='Change Preference']"),
     })
    public  MobileElement assertChangePreferenceBtn;



     @AndroidFindBy(xpath = "//android.view.View[@text='Download content from Courses or Library']")
    public MobileElement assertDownloadContentFromCoursesMsg;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Forum']")
    public MobileElement clkForumIcon;



     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.Image[@text='select bookmark icon']"),
             @AndroidBy(xpath = "//android.widget.Image[@text='bookmark icon']"),
     })
    public MobileElement assertSavePostIcon;

     @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='up image']"),
             @AndroidBy(xpath ="//android.widget.Image[@text='up arrow icon for like the post']"),
     })
    public MobileElement assertUpvoteIcon;


     @AndroidFindAll({
             @AndroidBy(xpath = "//android.widget.Image[@text='down image']"),
             @AndroidBy(xpath = "//android.widget.Image[@text='down arrow icon for unlike post']"),
     })
    public MobileElement assertDownvoteIcon;



     @AndroidFindBy(xpath = "//android.view.View[@text='Help']")
    public MobileElement assertHelpTextInHelpPage;


     @AndroidFindBy(xpath = "//android.view.View[@text='Frequently asked questions']")
     public MobileElement assertFAQtext;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Content (search)']")
    public MobileElement assertContentSection;


     @AndroidFindBy(xpath = "//android.view.View[@text='Faq(s)']")
    public MobileElement assertFaqText;


     @AndroidFindAll({
             @AndroidBy(xpath = "//android.view.View[@text='Faq(s)']//following-sibling::android.widget.Button[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Faq(s)']//following::android.view.View[1]"),
     })
    public MobileElement assertQuestionUnderFAQ;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Content play']")
    public MobileElement assertContentPlaySection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Profile']")
    public MobileElement assertProfileSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
    public MobileElement assertLoginSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Content creation']")
    public MobileElement assertContentCreationSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Other']")
    public MobileElement assertOtherSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Managing projects']")
    public MobileElement assertManagingProjectsSection;


     @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement clkOnTextBox;


     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Thanks for your feedback.')]")
    public MobileElement assertFeedbackMessage;



     @AndroidFindBy(xpath = "//android.view.View[@text='Content play']")
    public MobileElement assertCategoryInHelpPage;


  @AndroidFindAll({
          @AndroidBy(xpath = "//android.widget.Button[contains(@text,'When I try to play a video, I get an error')]"),
          @AndroidBy(xpath = "//android.view.View[contains(@text,'When I try to play a video, I get an error')]"),
  })
    public MobileElement questionRelatedToVideoContent;


     @AndroidFindBy(xpath = "//android.widget.TextView[@text='Download the video and play it,']")
    public MobileElement solution1ForVideoRelatedQuestion;


     @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'If you do not see the download option,')]")
    public MobileElement solution2ForVideoRelatedQuestion;






    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Staging Custodian Organization']"),
            @AndroidBy(xpath = "//android.view.View[@text='Pre-prod Custodian Organization']"),
    })
    public MobileElement assertOrgNameBelowDikshaID;


    @AndroidFindBy(xpath = "//android.view.View[@text='Content preference']")
    public MobileElement assertContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Role')]")
    public MobileElement assertRoleSectionUnderContentPreferenceLabel;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Sub-role')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subrole')]"),
    })
    public MobileElement assertSubRoleSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]")
    public MobileElement assertDistrictSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')]")
    public MobileElement assertStateSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Board')]")
    public MobileElement assertBoardSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Medium')]")
    public MobileElement assertMediumSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Classes')]")
    public MobileElement assertClassesSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Subjects')]")
    public MobileElement assertSubjectsSectionUnderContentPreferenceLabel;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='My learning']//following-sibling::android.view.View"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='My learning']//following::android.view.View[3]")
    })
    public MobileElement assertEnrolledCourseUnderMyLearning;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']")
    public MobileElement assertCourseUnderCategory;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Browse by Course']"),
            @AndroidBy(xpath = "//android.view.View[@text='Explore Course']"),
    })
    public MobileElement assertExploreCourseLabel;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Advance Tamil']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Accountancy']"),
    })
    public MobileElement assertAccountancySubject;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Browse by Advance Tamil']"),
            @AndroidBy(xpath = "//android.view.View[@text='Explore Accountancy']"),
    })
    public MobileElement assertExploreAccountancyLabel;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'Category')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Category, Category']"),
    })
    public MobileElement assertCategoryFilter;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'Role')]"),
        @AndroidBy(xpath = "//android.view.View[@text='Role, Role']"),
})
    public MobileElement assertRoleFilter;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'Subject')]"),
        @AndroidBy(xpath = "//android.view.View[@text='Subject, Subject']"),
})
public MobileElement assertSubjectFilter;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='English']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Course']//following::android.view.View[2]"),
    })
    public  MobileElement assertNavigationFilterBasedOnSubject;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Course']//following::android.view.View[3]"),
    })
    public MobileElement assertGroupingBasedOnPrimaryCategory;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Course Assessment']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Course Assessment']//following::android.view.View[2]"),
})
    public MobileElement assertNavigationFilterBasedPrimaryCategory;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'SELFASSESS')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Course Assessment']//following::android.view.View[3]"),
    })
    public MobileElement assertGroupingBasedOnSubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Filter']")
    public MobileElement assertFilterLabel;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='search filter']")
    public MobileElement assertFixedFilter;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new diksha_ntptest_org experience')]"),
    })
    public MobileElement tryNewDikshaExperience;
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'My learning')]"),
    })
    public MobileElement myLearningSection;
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Browse by category')]"),
    })
    public MobileElement browseByCatagory;
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Browse by subject')]"),
    })
    public MobileElement browseBySubject;
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Course')]"),
    })
    public MobileElement course;
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Digital Textbook')]"),
    })
    public MobileElement digitalTextBook;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'View all subjects')]"),
    })
    public MobileElement viewAllSubjects;
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Accountancy')]"),
    })
    public MobileElement assertAccountancy;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Urdu')]"),
    })
    public MobileElement assertUrdu;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'close')]"),
    })
    public MobileElement close;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Explore Digital Textbook')]"),
    })
    public MobileElement assertExplorerPage;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Invalid Email Address/Mobile number or password. Please try again with valid credentials to merge']"),
        @AndroidBy(xpath = "//android.view.View[@text='Invalid Email Address/Mobile number or password. Please try again with valid credentials to merge']"),
})
public MobileElement assertInvalidEmailAddressMessageInMergeAccountScreen;
   

    @AndroidFindBy(xpath = "//android.view.View[@text='Failed to merge account']")
    public MobileElement assertFailedToMergeAccountMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSE')]")
    public MobileElement assertCBSEBoard;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'English')]")
    public MobileElement assertEnglishMedium;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class 6')]")
    public MobileElement assertClassSix;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Featured']")
    public MobileElement assertFeaturedTextInHomePage;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Sample External Url']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Featured']//following::android.view.View[3]"),
    })
    public MobileElement assertBannerInHomePage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Question is mandatory. It should be minimum of 8 characters']")
    public MobileElement assertMin8CharactersInDiscussionTopicQuestion;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Description is mandatory. It should be minimum of 8 characters']")
    public MobileElement assertMin8CharactersInPleaseEloberateYourQuestion;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My learning']//following::android.view.View[3]")
    public MobileElement assertContentImageAndContentUnderMyLearningSection;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'By')]")
    public MobileElement assertByPublishingOrg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSE')]")
    public MobileElement assertContentMatchesOrgFramework;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='View all subjects']")
    public MobileElement clkOnViewAllSubjects;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Accountancy']")
    public MobileElement assertAccountancyAcademicSubject;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Bsg']")
    public MobileElement assertBsgNonAcademicSubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Accountancy']")
    public MobileElement assertExploreAccountancySubject;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']")
    public MobileElement assertCourseNavigationFilter;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Interactive Content']")
    public MobileElement assertExploreInteractiveContentText;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course Assessment']")
    public MobileElement assertCourseAssessmentNavigationFilter;


    @AndroidFindBy(xpath = "//android.view.View[@text='Accountancy']")
    public MobileElement assertAccountancySubjectInDigitalTextbookCategory;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Accountancy']//following-sibling::android.view.View[contains(@text,'Accountancy')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Accountancy']//following::android.view.View[contains(@text,'Accountancy')]"),
    })
    public MobileElement groupedBasedOnAccountancySubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Chemistry']")
    public MobileElement assertChemistrySubjectInDigitalTextbookCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Chemistry']//following::android.view.View[contains(@text,'Chemistry')]")
    public MobileElement groupedBasedOnChemistrySubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Economics']")
    public MobileElement assertEconomicsSubjectInDigitalTextbookCategory;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Economics']//following-sibling::android.view.View[contains(@text,'Economics')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Economics']//following::android.view.View[contains(@text,'Economics')]"),
    })
    public MobileElement groupedBasedOnEconomicsSubject;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Avatar')]"),
            @AndroidBy(xpath = "//android.widget.Image[@text='Avatar']"),
    })
    public List<WebElement> visualCue;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'English')][2]")
    public MobileElement assertEnglishMediumInTextbook;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'... More')]")
    public MobileElement assertMoreButton;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='+ Add User']//following::android.view.View")
    public MobileElement assertUsersInTheUserList;


    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.view.View[contains(@text,'Avatar')])[1]"),
            @AndroidBy(xpath = "(//android.widget.Image[@text='Avatar'])[1]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Featured']//following::android.view.View[7]"),
    })
    public MobileElement clkOnFirstBanner;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Template']")
    public MobileElement assertTemplateNavigationFilter;


    @AndroidFindBy(xpath = "//android.view.View[@text='Mathematics']")
    public MobileElement assertMathematicsSubject;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subject : Mathematics')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Mathematics']//following::android.view.View[contains(@text,'Subject : Mathematics')]"),
    })
    public MobileElement assertGroupingBasedOnMathematicsSubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explanation Content']")
    public MobileElement assertExplanationContentCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='PDF TextBook']")
    public MobileElement assertPDFTextbookCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Digital textbooks']")
    public MobileElement assertDigitalTextBooksCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='TV Class']")
    public MobileElement assertTVClassCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Learning module']")
    public MobileElement assertLearningModuleCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Practice question set']")
    public MobileElement assertPracticeQuestionSetCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Teaching Resource']")
    public MobileElement assertTeachingResourceCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Content Playlist']")
    public MobileElement assertContentPlaylistCategory;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Board Exam Papers')]")
    public MobileElement assertEarlierYearsBoardExamPapersCategory;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE ExpiredCourse')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationExpiredCourse')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationExpiredCourse')]"),
    })
    public MobileElement clkOnAutomationExpireCourse;


    @AndroidFindBy(xpath = "//android.view.View[@text='View and participate in educational programs active in your location and designed for the role you selected']")
    public MobileElement assertTextInProgramsTile;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@text,'I agree to')]")
    public MobileElement assertIAgreeGuidelinesCheckBox;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'I agree to')]")
    public MobileElement assertIAgreeToDikshaGuidelinesText;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Group guidelines']"),
            @AndroidBy(xpath = "//android.view.View[@text='Group guidelines']"),
    })
    public MobileElement assertGroupGuidelinesLink;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='create group disable']")
    public MobileElement assertDisabledCreateGroupBtn;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Last updated')]")
    public MobileElement assertLastUpdatedMsg;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Copy Cell']")
    public MobileElement assertCopyCellInExcelOfDownloadedCSV;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Copy Row']")
    public MobileElement assertCopyRowInExcelOfDownloadedCSV;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Copy Column']")
    public MobileElement assertCopyColumnInExcelOfDownloadedCSV;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Line Number']")
    public MobileElement assertLineNumberOptionInExcelFormat;


    @AndroidFindBy(xpath ="//android.widget.TextView[@text='No.']")
    public MobileElement assertSerialNumberInExcelSheet;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Name']")
    public MobileElement assertMemberNameInDownloadedCSVExcelFormat;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Progress%']")
    public MobileElement assertMemberProgressInDownloadedCSVExcelFormat;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test']")
    public MobileElement assertMemberInDownloadedCSVExcelFormat;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='25']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='50']"),
    })
    public MobileElement assertMemberProgressInPercentageInDownloadedCSVExcelFormat;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NA']")
    public MobileElement assertNATextInDownloadedCSVFile;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.CheckBox"),
            @AndroidBy(xpath = "//android.view.View[@text='Group guidelines']//following::android.widget.CheckBox"),
    })
    public MobileElement groupGuidelinesCheckBox;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='TestingDiksha']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Start Discussion']//following::android.view.View[3]"),
    })
    public MobileElement clkOnFirstDiscussion;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Your answer here']//following-sibling::android.widget.EditText"),
            @AndroidBy(xpath = "//android.view.View[@text='Your answer here']//following::android.widget.EditText"),
    })
    public MobileElement assert10CharactersInTopicReply;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Recommendations')]")
    public MobileElement assertRecommendationSection;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement assertSearchResultSection;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='search filter']")
    public MobileElement assertFilterResultSection;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Board')]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Board/Syllabus']"),
    })
    public MobileElement assertBoardFilterInFilterResultSection;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Class')]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Class']"),
    })
    public MobileElement assertClassFilterInFilterResultSection;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'General Discussion')]")
    public MobileElement assertGeneralDiscussionTextInDiscussionTopic;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Please wait')]")
    public MobileElement assertLoadingAnimation;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Task details']")
    public MobileElement clkTaskDetails;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Small AutomationCourseContent')]"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'My learning')]//following::android.view.View[contains(@text,'Small AutomationCourseContent')]")
    })
    public MobileElement assertCourseInMyLearningSection;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'ಸ್ವಾಗತ')]")
    public MobileElement welcomeTextInKannada;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ವೀಕ್ಷಣೆ']")
    public MobileElement programsTextInKannada;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ಪ್ರಾಜೆಕ್ಟ್ಸ್']")
    public MobileElement projectsTextInKannada;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ಸಮೀಕ್ಷೆ']")
    public MobileElement surveysTextInKannada;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='ಕೋರ್ಸ್ ಗಳು']")
    public MobileElement coursesTextInKannada;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='ವರದಿಗಳು']")
    public MobileElement reportsTextInKannada;


    @AndroidFindBy(xpath = "//android.view.View[@text='Medium']")
    public MobileElement mediumCustomisedFilter;


    @AndroidFindBy(xpath = "//android.view.View[@text='Class']")
    public MobileElement classCustomisedFilter;

    @AndroidFindBy(xpath = "//android.view.View[@text='Publisher']")
    public MobileElement publisherCustomisedFilter;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Subject')]")
    public MobileElement subjectFilter;

    @AndroidFindBy(xpath = "//android.view.View[@text='Subject']")
    public MobileElement assertSubjectInSubjectFilter;

    @AndroidFindBy(xpath = "//android.widget.CheckBox")
    public List<WebElement> subjectsInSubjectFilter;


    @AndroidFindBy(xpath = "//android.view.View[@text='Media Type']")
    public MobileElement mediaTypeCustomisedFilter;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Avatar')]"),
            @AndroidBy(xpath = "//android.widget.Image[@text='Avatar']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Featured']//following::android.widget.Image[1]"),
    })
    public MobileElement clkOnFirstBannerInHomePage;


    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'Select Class')]")
    public MobileElement clkOnClassCustomisedFilter;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Class']")
    public MobileElement assertSelectClass;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Videos']")
    public MobileElement assertExploreVideosText;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Accountancy']//following-sibling::android.view.View[contains(@text,'Subject : Accountancy')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Accountancy']//following::android.view.View[1]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Explanation Content']//following::android.view.View[3]"),
    })
    public MobileElement assertContentPostSubjectAndRoleFilter;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Explanation Content']")
    public MobileElement clkOnExplanationContent;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='LET US KNOW HERE']")
    public MobileElement assertLetUsKnowBtn;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Request content']"),
        @AndroidBy(xpath = "//android.view.View[@text='Request content']"),

})
public MobileElement assertRequestContentInLibraryPage;




    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'asa')]")
    public MobileElement assertTagsCard;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'General Discussion')]")
    public MobileElement clkOnTagCardUnderTagsSection;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Data Sync']"),
            @AndroidBy(xpath = "//android.view.View[@text='Data Sync Backup Data, Transfer Telemetry']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Data Sync Backup Data, Transfer Telemetry']"),

    })
    public MobileElement ClkDataSync;

    @AndroidFindBy(xpath = "//android.view.View[@text='Notification']")
    public MobileElement assertNotificationText;

    @AndroidFindBy(xpath = "//android.view.View[@text='No new notification']")
    public MobileElement assertNoNewNotificationsMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'has been assigned to')]")
    public MobileElement assertActivityAssignedNotificationMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'has been unassigned to')]")
    public MobileElement assertActivityUnassignedNotificationMsg;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Clear']")
    public MobileElement clkclearBtn;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='delete']")
    public MobileElement notificationDeleteImage;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'has been deleted by')]")
    public MobileElement assertGroupDeletedNotificationMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'you have been removed from the')]")
    public MobileElement assertMemberRemovedNotificationMsg;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Make group admin']")
    public MobileElement clkOnMakeGroupAdmin;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Make Admin']")
    public MobileElement clkOnMakeAdminBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'you have been added to')]")
    public MobileElement assertMemberAddedNotificationMsg;


    @AndroidFindBy(xpath = "//android.view.View[@clickable='true']")
    public MobileElement assertNotificationsClickable;


    @AndroidFindBy(xpath = "(//android.widget.Image[@text='delete'])[1]")
    public MobileElement deleteFirstNotification;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State (Tamil Nadu)')]")
    public MobileElement assertTamilNaduBoardInYourPreference;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,' English')]")
    public MobileElement assertEnglishMediumInYourPreference;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class 1')]")
    public MobileElement assertClassInYourPreference;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'+1')]")
    public MobileElement assertplus1Symbol;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Browse SUNBIRD library to find relevant content based on your preferences')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Browse DIKSHA library to find relevant content based on your preferences')]")
    })
    public MobileElement assertYourPreferencePopup;

    @AndroidFindBy(xpath = "//android.view.View[@text='Edit profile']")
    public MobileElement assertEditProfile;


    @AndroidFindBy(xpath = "//android.view.View[@text='Additional Categories']")
    public MobileElement assertAdditionalCategoriesFilter;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'AutomationCourseForDF')]")
    public MobileElement assertLargeTitleUnderMyLearningSection1;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'AutoCourse')]")
    public MobileElement assertLargeTitleUnderMyLearningSection2;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Copy of vk-3.1Textbook')]")
    public MobileElement assertCourseNameInCSVFile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Umesh trackable collection')]")
    public MobileElement assertEnrolledTrackableCollection;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'AutomationCourseContent')]")
    public MobileElement assertEnrolledCourse;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'ManjunathAutomationCourse')]")
    public MobileElement assertExpiredCourseInMyLearningSectionOfHomePage;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'You have joined the batch of a course that is completed')]")
    public MobileElement assertCourseBatchCompletedForExpiredCourse;


    @AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='Add User']"),

    })
    public MobileElement addUserBtn;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Views')]")
    public MobileElement assertViewsInCreatedTopic;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'This group is temporarily inactive. The group admin can re-activate the group if required. Group members can continue their discussions')]")
    public MobileElement assertSuspendedGroupBanner;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'T Test')]")
    public MobileElement sltOldUser;


    @AndroidFindBy(xpath = "//android.view.View[@text='sandy']")
    public MobileElement assertUserName;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'AutoSmallCourseWithCertificate')]")
    public MobileElement openCertificateCourse;


    @AndroidFindBy(xpath = "//android.view.View[@text='Import Content']")
    public MobileElement assertImportContent;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My Files']")
    public MobileElement myFilesSection;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Downloads']")
    public MobileElement deviceDownloadsSection;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='diksha_Book2book-v3.ecar']")
    public MobileElement ecarFile1;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='diksha_AutomationBookContent-v1.ecar']")
    public MobileElement ecarFile2;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Done']")
    public MobileElement doneBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'AutomationNestedCourse')]")
    public MobileElement nestedCourseInGrp;


    @AndroidFindBy(xpath = "//android.view.View[@text='Account merge has been successfully initiated. You will be notified once it is complete.']")
    public MobileElement assertAccountMergeHasBeenInitiatedMsg;


    @AndroidFindBy(xpath = "//android.view.View[@text='E Ena Yost\u200E']")
    public MobileElement firstUser;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'This group is temporarily inactive')]")
    public MobileElement assertGroupInactiveMsg;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'AutoCourse')]")
    public MobileElement clkCourseInDeactivatedGrp;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Switch to classic')]"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Switch to classic')]"),
    })
    public MobileElement switchToDefault;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'4.7 ribbon trackable book')]")
    public MobileElement assertConsumedTrackableCourse;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Continue learning')]")
    public MobileElement assertContinueLearning;


    @AndroidFindAll({
        @AndroidBy(xpath = "//*[@resource-id='tab-button-profile'][2]"),
      
})
public MobileElement profilePageTab2;















}
    	
    	
    	


    




