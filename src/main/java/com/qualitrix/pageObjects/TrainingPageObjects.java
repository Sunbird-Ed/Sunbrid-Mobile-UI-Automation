 package com.qualitrix.pageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the Objects related to Training Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 20/March/2020
 */
public class TrainingPageObjects {

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='search filter']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_filter']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='filter ']")
    })
    public MobileElement filterBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='search']")
    public MobileElement searchBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement cancelBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
    public MobileElement applyBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Topic']")
    public MobileElement topicBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Purpose']")
    public MobileElement purposeBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='trash Delete']")
    public MobileElement trashDelete;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='share Share']")
    public MobileElement shareBtn;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='arrow up']")
    public MobileElement arrowUp;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='menu-icon']")
    public MobileElement menuIcon;

    @AndroidFindBy(xpath = "//android.view.View[@text='Medium']")
    public MobileElement mediumBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Your Progress']")
    public MobileElement progressBar;

    @AndroidFindBy(xpath = "//android.view.View[@text='Class']")
    public MobileElement classBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Subject']")
    public MobileElement subjectBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Organization']")
    public MobileElement orgBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text=' Science']")
    public MobileElement scienceBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text=' Social Science']")
    public MobileElement socialScienceBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Biology']")
    public MobileElement bioBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Concepts Understanding']")
    public MobileElement conceptsBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Teaching Techniques']")
    public MobileElement tchngBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Assessment Techniques']")
    public MobileElement assessmentBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Communication & Engagement']")
    public MobileElement communicationBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Curriculum And Learning Objectives']")
    public MobileElement curriculumBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Telugu']")
    public MobileElement teluguMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='English']")
    public MobileElement englishMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Assamese']")
    public MobileElement assameseMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Hindi']")
    public MobileElement hindiMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Konkani']")
    public MobileElement konkaniMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Class 1']")
    public MobileElement classOneObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Class 2']")
    public MobileElement classTwoObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Chemistry']")
    public MobileElement chemistryObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Physics']")
    public MobileElement physicsObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Biology']")
    public MobileElement biologyObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Kerala State']")
    public MobileElement keralaStateObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Punjab']")
    public MobileElement punjabObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Rajasthan']")
    public MobileElement rajasthanObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Gujarati']")
    public MobileElement gujaratiMdmObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='eng_2nd-lang_1561704039945.thumb']"),
            @AndroidBy(xpath = "//android.view.View[@text='PISA Orientation 2021']")
    })
    public MobileElement englishImage;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='OPEN']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='OPEN ']")
    })
    public MobileElement openBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Copy Of AutomationCourseContent']")
    })
    public MobileElement copiedCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by-sa/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='https://creativecommons.org/licenses/by-sa/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode']")
    })
    public MobileElement termsAndCondLink;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Information']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Information']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Information ']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Information ']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Course information']"),

          
    })
    public MobileElement trainingInfoObj;

    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Modules']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Modules']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Modules ']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Modules ']")
    })
    public MobileElement trainingModuleObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Join Training']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='JOIN']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join Training ']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join course']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Course details']//preceding::android.widget.Button[1]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='JOIN COURSE']"),

    })
    public MobileElement joinTrainingBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='cloud download Download']")
    public MobileElement downloadBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Download']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Download ']")
    })
    public MobileElement downloadPopUpBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Downloading']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Hide']"),
            
            
    })
    public MobileElement downloadingObj;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class 1')]")
    public MobileElement classInfo;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Chemistry')]")
    public MobileElement subjectInfo;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'English')]")
    public MobileElement mediumInfo;

    @AndroidFindBy(xpath = "//*[contains(@text,'do_')]")
    public MobileElement downloadingNotification;

    @AndroidFindBy(xpath = "//*[contains(@text,'Downloads')]")
    public MobileElement downloadsNot;

    @AndroidFindBy(xpath = "//*[contains(@text,'Downloaded successfully')]")
    public MobileElement downloadSuccess;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Author:']"),
            @AndroidBy(xpath = "//android.view.View[@text='sachin atri']")
    })
    public MobileElement authorObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Published on DIKSHA by:']"),
            @AndroidBy(xpath = "//android.view.View[@text='Odisha']")
    })
    public MobileElement publishObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Attribution(s):']"),
            @AndroidBy(xpath = "//android.view.View[@text='sachin']")
    })
    public MobileElement attributionObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='License terms:']"),
            @AndroidBy(xpath = "//android.view.View[@text='CC BY-NC-SA 4.0']")
    })
    public MobileElement licenseTermsObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Copyright:']"),
            @AndroidBy(xpath = "//android.view.View[@text='Odisha, 2019']")
    })
    public MobileElement copyRightObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Start Now']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Start Now ']")
    })
    public MobileElement startNowBtn;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Continue']"),
})
public MobileElement clkContinuew;

    
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Done']"),
})
public MobileElement clkDoneButton;

    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='arrow back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='arrow back ']")
    })
    public MobileElement backBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Join']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join ']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join course']")

              })
    public MobileElement joinBtn;

    @AndroidFindBy(className = "android.widget.TabWidget")
    public MobileElement selectBtn;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='Featured Trainings']//following::android.view.View[1]")
    public MobileElement selectEnrollmentViewAll;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='Latest Courses']//following::android.view.View[1]")
    public MobileElement latestCoursesViewAll;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='My Trainings']//following::android.view.View[1]")
    public MobileElement myTrainingsViewAll;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='Featured Trainings']//following::android.view.View[1]")
    public MobileElement featuredTrainingViewAll;
    
   
  
   
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationCourseUsingTextBook')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationCourseUsingTextBook ')]"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='Copy of AutomationCourseContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='DownloadAutomationContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='AssesmentAutomationContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseUsingTextBook']"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationLeaveCourse']")

        
})
public MobileElement CourseSearch;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK AutomationBookContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationBookContent')]"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationBookContent']")
})
public MobileElement BookSearch;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CLASSROOMTEACHINGVIDEO Test-transcript')]")
    public MobileElement transcriptContent;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Large')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE Jan13 Large')]"),
})
public MobileElement largeVideoContent;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text=' PLAY']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'COLLECTION QS')]"),
})
public MobileElement contentPlaylistQS;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK digi book-question set')]")
    public MobileElement digitalTextbookQS;



  
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK largesizetextbook')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Large')]"),
})
public MobileElement largeSizeBook;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE')]"),
            @AndroidBy(xpath = "//android.view.View[@text='10SecPDF']"),
            @AndroidBy(xpath = "//android.view.View[@text='AutomationResource']"),
            @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Resource')]//following::android.view.View[1]")

    })
    public MobileElement ResourceSearch;


@AndroidFindAll({
       @AndroidBy(xpath = "//android.view.View[@text='Featured Trainings']//following::android.widget.Button"),
            @AndroidBy(xpath = "//android.view.View[@text='Featured Courses']//following::android.widget.Button"),

   
})
public MobileElement viewAllFeaturedTraings;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Latest Courses']//following::android.widget.Button"),
})
public MobileElement viewAllLatestCourse;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Featured Trainings']//following::android.view.View[2]"),
    @AndroidBy(xpath = "//android.view.View[@text='Featured courses']//following::android.view.View[2]"),

})
public MobileElement clkFeaturedCourse;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Latest Courses']//following::android.view.View[2]"),
    @AndroidBy(xpath = "//android.view.View[@text='Latest courses']//following::android.view.View[2]"),

    
  
})
public MobileElement clkLatestCourse;


@AndroidFindAll({
	@AndroidBy(xpath = "//android.widget.TextView[@text='Leave course']"),
	@AndroidBy(xpath = "//android.widget.Image[@text='menu-icon']"),
})
public MobileElement sltCourseMenuIcon;



@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Leave')]"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Stop textbook activity']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Leave course']"),
})
public MobileElement clkLeaveCourse;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Confirm']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='CONFIRM']"),
})
public MobileElement clkConfirmButton;


@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Course last updated on')]")
public MobileElement assertCourseUpdatedMessageWithDate;


@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Batch ends in')]")
public MobileElement assertTimerWithXdaysYhoursZmin;

















@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='Ongoing']"),

})
public MobileElement ongoingCourse;


@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[contains(@text,'Completed ')]"),

})
public MobileElement completedCourse;

@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[contains(@text,' successfully completed ')]") })
public MobileElement completedMessage;





@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='Do not share']"),

})
public MobileElement clkDontShareBtn;

//@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Start learning']"),
//
//})
//public MobileElement clkStartLearning;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'completed')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Completed ')]"),
        @AndroidBy(xpath = "//android.view.View[@text='50% completed']"),

})
public MobileElement verify50PercentProgress;


@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Continue Learning']"),

})
public MobileElement clkContinueLearning;


@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='You have successfully completed this course']"),

})
public MobileElement verifyCompletedMsg;


@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
public MobileElement clkOkToCancel;


@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='courses Courses']"),

})
public MobileElement tapCoureBtn;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'SELFASSESS PDF_13.pdf')]"),
      @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'PDF_13.pdf')]"),
       @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
       @AndroidBy(xpath = "//android.widget.Image[@index='2']"),
       @AndroidBy(xpath = "//android.widget.Image[@index='1']"),

})
public MobileElement PDFSearch;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='10SecVideo']"),
    })
public MobileElement tenSecVideoText;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='play Start learning']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='play ಕಲಿಯಲು ಆರಂಭಿಸಿ']"),
})
public MobileElement clkStartLearning;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']//following::android.view.View[@text='AutomationCourseContent']"),
})
public MobileElement courseContent2;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']"),
})
public MobileElement courseContentVerification;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Board/Syllabus']"),
        @AndroidBy(xpath = "//android.view.View[@text='Board/Syllabus']"),
})
public MobileElement boardFilter;

@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='cbse']")
public MobileElement cbseBoard;
@AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY FILTER']")
public MobileElement applyFilterBtn;

@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'CBSE')]")
public MobileElement verifyContentForAlternativeBoard;

@AndroidFindAll({
    @AndroidBy(xpath = "(//android.view.View[contains(@text,'pdf')])[2]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'SELFASSESS PDF_13.pdf')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'PDF_13.pdf')]"),
        @AndroidBy(xpath = "//android.view.View[@text='PDF_13.pdf']"),
})
public MobileElement clkPdfContent;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Play video']")
public MobileElement playPdfIcon;

@AndroidFindBy(xpath = "//android.widget.Button[@text='navigation-arrows-nextIcon']")
public MobileElement clkNextIcon;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='navigation-arrows-nextIcon']")
})
public List<MobileElement> nextIcon;

@AndroidFindBy(xpath = "//android.widget.Button[@text='navigation-arrows-previousIcon']")
public MobileElement clkPreviousIcon;

@AndroidFindBy(xpath = "//android.view.View[@resource-id='overlay-button']")
public MobileElement pdfHambergerIcon;

@AndroidFindBy(xpath = "//android.view.View[@text='Share']")
public MobileElement shareButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Download']")
public MobileElement downloadButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Print']")
public MobileElement printButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Exit']")
public MobileElement exitButton;

@AndroidFindBy(xpath = "//android.widget.Image[@text='close']")
public MobileElement closeRatingIcon;



@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='You just completed']"),
    @AndroidBy(xpath = "//android.view.View[@text='You just completed']"),
})
public MobileElement contentCompletedText;

@AndroidFindBy(xpath = "//android.view.View[@text='Replay']")
public MobileElement replayButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Exit']")
public MobileElement exitButton2;

@AndroidFindBy(xpath = "//android.view.View[@index=3]")
public MobileElement userName;

@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'.pdf')]")
public MobileElement contentName;

@AndroidFindBy(xpath = "//android.view.View[@index=4]")
public MobileElement timeTakenToCompleteContent;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rate Content']")
public MobileElement rateContentText;

@AndroidFindBy(xpath = "//android.widget.Button[@text='rate content Rate']")
public MobileElement updateRatingStar;

@AndroidFindBy(xpath = "//android.view.View[@text='Very Bad']")
public MobileElement veryBadRating;

@AndroidFindBy(xpath = "//android.widget.Button[@text='download content Download']")
public MobileElement clkDownloadContent;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Download']")
public MobileElement clkDownloadBtn;

@AndroidFindBy(xpath = "//android.view.View[@index=3]")
public MobileElement downloadedContent;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='JOIN COURSE']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='JOIN']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='ಕೋರ್ಸ್ ಗೆ ಸೇರಿ']"),
        @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Course details']//preceding::android.widget.Button[1]"),
})
public MobileElement clkJoinCourseBtn;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.Button[@text='Forum']"),
})
public MobileElement forumIcon;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='प्यासा कौआ']"),
})public MobileElement hindiText;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Course details')]"),
        @AndroidBy(xpath = "//android.widget.Button[contains(@text,'CRS_TRK_FRMELEMNTS_LBL')]"),
    @AndroidBy(xpath = "//android.widget.Button[@text='Course details']"),
})
public MobileElement clkCourseDetails;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Currently, this course does not have a certificate. The course creator may attach a certificate later.']"),
})
public MobileElement viewCertificateMsg;



@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='FILTER BY']"),
@AndroidBy(xpath = "//android.view.View[@text='FILTER BY']"),
})
public MobileElement assertFilterBy;


@AndroidFindBy(xpath = "//android.widget.Button[@text='RESET filter by']")
public MobileElement assertResetBtn;
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Media Type']")
public MobileElement clkMediaTypeFilter;
@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='All']")
public MobileElement clkAllMediaTypeFilter;
@AndroidFindBy(xpath = "//android.widget.Button[@text='CONFIRM']")
public MobileElement clkConfirmBtn;
@AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY FILTER']")
public MobileElement clkApplyFilterBtn;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 100 results')]//following::android.view.View[1]"),
})
public MobileElement assertContentAfterFiltering;



@AndroidFindBy(xpath = "//android.view.View[@text='Congratulations!']")
public MobileElement congratulationsMsg;
@AndroidFindBy(xpath = "//android.view.View[@text='You have successfully completed this course']")
public MobileElement courseCompletedMsg;
@AndroidFindBy(xpath = "//android.view.View[@text='Note: This course does not have a certificate']")
public MobileElement noCertificateMsg;


@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Accountancy']"),
        @AndroidBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[1]"),
})
public MobileElement accountancySubject;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Course']//following-sibling::android.widget.Button"),
        @AndroidBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[2]"),
})
public MobileElement courseUnderSubject1;

@AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[17]")
public MobileElement assameseSubject;
@AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[18]")
public MobileElement courseUnderSubject2;
@AndroidFindBy(xpath = "//android.view.View[@text='Others']")
public MobileElement othersSection;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Others']//following-sibling::android.widget.Button"),
        @AndroidBy(xpath = "//android.view.View[@text='Others']//following::android.view.View[1]"),
})
public MobileElement courseUnderOthers;





@AndroidFindBy(xpath = "//android.view.View[@text='Want to check courses?']")
    public MobileElement assertCheckCourseMsg;


@AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
    public MobileElement loginBtnInCourseSection;


@AndroidFindBy(xpath = "//android.view.View[@text='LOGIN']")
    public MobileElement loginPopUp;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='You must log in to access course details']")
    public MobileElement messageInLoginPopup;

@AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
    public MobileElement clkLoginBtn;


@AndroidFindBy(xpath = "//android.view.View[@text='You can't enroll to a course created by self']")
    public MobileElement canNotEnrollMsg;

@AndroidFindAll({
	
    @AndroidBy(xpath = "//android.widget.TextView[@text='Questionset limited attempt']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Questionset limited attempt')]"),
        @AndroidBy(xpath = "//android.widget.ListView"),
})
    public MobileElement assertLimitedCourse;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='question number 4']"),
        @AndroidBy(xpath = "//android.view.View[@index='4']"),
})
    public MobileElement clkLastQuestion;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='next slide']"),
        @AndroidBy(xpath = "//android.view.View[@index='2']"),
})
    public MobileElement clkNextArrowIcon;


@AndroidFindBy(xpath = "//android.view.View[@text='Replay']")
    public MobileElement clkReplayBtn;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='This is the last remaining attempt']"),
    @AndroidBy(xpath = "//android.view.View[@text='This is the last remaining attempt']"),
})
public MobileElement assertLastAttemptMsg;


@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement clkContinueBtn;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'attempts completed')]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='You have exceeded the maximum number of attempts to submit the assessment']"),
            @AndroidBy(xpath = "//android.view.View[@text='You have exceeded the maximum number of attempts to submit the assessment']"),
    })
    public MobileElement maxAttemptsExceededMsg;


@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Score')][2]")
    public MobileElement assertScoreCard;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Exit']"),
            @AndroidBy(xpath = "//android.view.View[@text='exit Exit']"),
    })
    public MobileElement assertExitBtn;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'AutomationBookContent')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationBookContent')]"),
})
public MobileElement assertContentTitle;
  

 


    @AndroidFindAll({
    	
    	        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Bycontent creator')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Bycontent creator')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationBookContent')]//following::android.view.View[1]"),
    })
    public MobileElement assertContentPublisher;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSEEnglish')]")
    public MobileElement assertBoardMediumClassSubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Content Details']")
    public MobileElement assertContentDetails;



    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.TextView[@text='This Textbook is relevant for:']"),
            @AndroidBy(xpath = "//android.view.View[@text='This Textbook is relevant for:']"),
    })
    public MobileElement assertContentRelevantFor;
    
    

    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Class')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Class : Others')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Class : Class')]"),
    })
    public MobileElement assertClassInContentDetails;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Medium :')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Medium : Urdu')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Medium : English')]"),
    })
    public MobileElement assertMediumInContentDetails;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Board : ')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Board : State')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Board : CBSE')]"),
    })
    public MobileElement assertBoardInContentDetails;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'User Type : ')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'User Type : Student')]"),
    })
    public MobileElement assertUserTypeInContentDetails;
   


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Play')]")
    public MobileElement clkOnPlayIcon;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Player Menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Player Menu']")
    })
    public MobileElement clkOnHamburgerMenu;


    @AndroidFindBy(xpath = "//android.view.View[@text='Share']")
    public MobileElement assertShareBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Download']")
    public MobileElement assertDownloadBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Print']")
    public MobileElement assertPrintBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Exit']")
    public MobileElement assertExitButton;


    @AndroidFindBy(xpath = "//android.view.View[@text='Confirm Download']")
    public MobileElement assertConfirmDownloadPopUp;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='DOWNLOAD']")
    public MobileElement assertDownloadButtonInPopup;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement assertCancelButtonInPopup;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'information circle Last date to join')]")
    public MobileElement assertEnrollmentEndDate;


 
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Course details']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Course details']")
})
public MobileElement assertCourseDetails;

    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='This course is relevant for:']")
    public MobileElement assertCourseRelevantFor;


    @AndroidFindBy(xpath = "//android.view.View[@text='AutoCourse']")
    public MobileElement assertCourse;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'The course's batch is available from')]")
    public MobileElement assertBatchStartDateMessage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sync Progress now']")
    public MobileElement clkSyncProgressNow;


    @AndroidFindBy(xpath = "//android.view.View[@text='Progress synced successfully']")
    public MobileElement assertSyncSuccessMsg;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Consent to share details']"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']"),
    })
    public MobileElement assertConsentPopUpPostJoinCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'User name')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'User name')]"),
    })
    public MobileElement assertUsernameInConsent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'State')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'State')]"),
    })
    public MobileElement assertStateInConsent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'UserId')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'UserId')]"),
    })
    public MobileElement assertUserIdInConsent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'District')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'District')]"),
    })
    public MobileElement assertDistrictInConsent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Block')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'Block')]"),
    })
    public MobileElement assertBlockInConsent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'School ID')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'School ID')]"),
    })
    public MobileElement assertSchoolIdInConsent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'School name')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'School name')]"),
    })
    public MobileElement assertSchoolNameInConsent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Mobile No')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Profile Details']//following::android.view.View[contains(@text,'Mobile No')]"),
    })
    public MobileElement assertMobileNoInConsent;


    @AndroidFindBy(xpath = "//android.view.View[@text='You can edit these details from your profile page']")
    public MobileElement assertEditInProfilePage;


    @AndroidFindBy(xpath = "//android.view.View[@text='DIKSHA Terms of Use']")
    public MobileElement assertDikshaTermsOfUse;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='JOIN']")
    public MobileElement clkJoinButton;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Leave task']")
    public MobileElement clkLeaveTask;


    @AndroidFindAll({
    	 @AndroidBy(xpath = "//android.view.View[@text='courses']"),
          
    })
    public MobileElement assertCourseInCoursesTab;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Courses']")
    public MobileElement clkOnCoursesCategory;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Course']//following::android.view.View[3]"),
    })
    public MobileElement assertCourseInCategoryAndSubject;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Spinner[contains(@text,'Subject')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Subject, Subject']"),
    })
    public MobileElement clkOnSubject;


    @AndroidFindBy(xpath = "//android.widget.CheckBox[1]")
    public MobileElement selSubject;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
    })
    public MobileElement clkOnSubmitBtn;

    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[@text='Course']"),
    	@AndroidBy(xpath = "//android.view.View[contains(@text,'Course')]"),
})
public MobileElement assertCoursesText;
    


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Training')]")
    public MobileElement assertTrainingText;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Your Progress')]")
    public MobileElement assertCourseProgressInCourseCard;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'completed')]")
    public MobileElement assertCourseProgressPercentage;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Small AutomationCourseContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationCourseContent')]"),
            @AndroidBy(xpath = "//android.view.View[@text='Small AutomationCourseContent']"),
    })
    public MobileElement assertSearchedCourse;


    @AndroidFindBy(xpath = "//android.view.View[@text='AutomationContentCourse']")
    public MobileElement clkOnCourseFromMyCourseSection;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'completed')]")
    public MobileElement assert50PercentCompletedMsg;


    @AndroidFindAll({
    	 @AndroidBy(xpath = "//android.view.View[@text=\"Certificate criteria arrow down\"]"),
            @AndroidBy(xpath = "//android.view.View[@text='Certificate criteriaarrow down']"),
            @AndroidBy(xpath = "//android.view.View[@text='Earn a certificatearrow down']"),
    })
    public MobileElement assertEarnCertificate;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'> Completion certificate will be issued upon 100% completion')]"),
            @AndroidBy(xpath = "//android.view.View[@text='> Completion certificate will be issued upon 100% completion']"),
    })
    public MobileElement assertRuleInEarnCertificate;

    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.view.View[@text=\"Course details\"]"),
    	@AndroidBy(xpath = "//android.widget.Button[@text='Course details']"),
})
public MobileElement clkOnCourseDetails;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'learning')]"),
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Learning')]"),
    })
    public MobileElement clkOnLearningButton;



    @AndroidFindBy(xpath = "//android.view.View[@resource-id='overlay-button']")
    public MobileElement clkOnHamburgerMenuBar;


    @AndroidFindAll({
            //@AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Small AutomationCourseContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationCourseContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationCourseContent')]")
    })
    public MobileElement automationCourseContent;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Small AutomationCourseContent')]"),

    })
    public MobileElement smallautomationCourseContent;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Small AutomationCourseContent')]"),
           // @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationCourseContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationCourseContent')]")
    })
    public MobileElement automationCourseContent1;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutoManjunathCourse')]"),
    })
    public MobileElement automationCourseContent2;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutoSmallCourseWithCertificate')]"),
    })
    public MobileElement smallCertCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Practice Course')]"),

    })
    public MobileElement practiceCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutoMultipleContentCourse')]"),

    })
    public MobileElement multipleContentCourse;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutoCourse')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'COURSE AutoCourse ')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'CourseContent Subject : Economics')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'CourseContent Subject ')]"),
    })
    public MobileElement CourseContent;

    @AndroidFindAll({
                      
            
            @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK Automation textbookdontuse')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK CollectionForAutomation')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'CollectionForAutomation')]"),
    })
    public MobileElement collectionContent;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE CourseExpireInTwoDays')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'CourseExpireInTwoDays')]"),
    })
    public MobileElement automationContentCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationContentCourse')]"),
    })
    public MobileElement automationContentCourse1;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE CourseWithNoEndDate')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'CourseWithNoEndDate')]"),
    })
    public MobileElement ContentCourseNoEnddate;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE UpcomingCourse')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'UpcomingCourse')]"),
    })
    public MobileElement upcomingCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE CourseContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'CourseContent')]"),
    })
    public MobileElement courseContent;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Umesh trackable collection')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'Umesh trackable collection')]"),
    })
    public MobileElement trackableCollection;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationSSOCourse')]"),
    })
    public MobileElement automationSSOCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Cert Course 4.5')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'Cert Course 4.5')]"),
    })
    public MobileElement certificateCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Vivek questionset with images')]"),
    })
    public MobileElement questionsetWithImages;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE NestedCourse')]"),
    })
    public MobileElement multipleBatchCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Limited course 25')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'Limited course 25')]"),
    })
    public MobileElement limitedCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationCourseForDF')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationCourseForDF')]"),
    })
    public MobileElement automationCourseForDF;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE باغ نخلہ کے مسافر پر سلام Subject : Urdu')]"),
    })
    public MobileElement urduContent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE ExpiredCourse')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationExpiredCourse')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'AutomationExpiredCourse')]"),
    })
    public MobileElement expiredCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE limited course')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'limited course')]"),
    })
    public MobileElement limitedQuestionSet;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE UpdatedMsgCourseContent')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE UpdatedCourseWithLastUpdatedMsg')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'UpdatedCourseContent')]"),
    })
    public MobileElement updatedCourseContent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE limited course')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'Limited questionset course')]"),
    })
    public MobileElement questionSetCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutoAlreadyJoinedCourse')]"),

    })
    public MobileElement alreadyJoinedCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutoExpiredBatchWithOngoingBatchCourse')]"),

    })
    public MobileElement expiredAndOngoingCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE AutoExpiredAndFutureBatchCourse')]"),

    })
    public MobileElement expiredAndFutureBatchCourse;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE Course with ak question set')]")
    public MobileElement QUMLContent;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE Course -queset')]")
    public MobileElement solutionUncheckedQSet;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE 1 attempt Question Set Course')]"),
    })
    public MobileElement singleAttemptCourse;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE AutoPDFCourse')]")
    public MobileElement pdfCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Cancel']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CANCEL']"),
    })
    public MobileElement clkOnCancelBtn;


 

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='There are no batches available for this course']"),
        @AndroidBy(xpath = "//android.view.View[@text='There are no batches available for this course']"),
})
public MobileElement assertNoBatchesForThisCourseMsg;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='No batches available']"),
        @AndroidBy(xpath = "//android.view.View[@text='No batches available']"),
})
public MobileElement assertExpiredCourseMsg;
    
    
  //android.widget.TextView[@text='No batches available']

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 100 results')]//following::android.view.View[1]"),
    })
    public MobileElement clkOnEpubContent;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Popular categories']"),
        @AndroidBy(xpath = "//android.view.View[@text='Popular categories']"),
})
public MobileElement assertPopularCategoriesInTrainingPage;
   


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='back']"),

            @AndroidBy(xpath = "//android.widget.Image[@text='back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
    })
    public MobileElement clkBackBtn;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText[@text='1']"),
            @AndroidBy(xpath = "//android.widget.EditText[@text='1.0']"),
    })
    public MobileElement clkOnEditText1;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText[@text='2']"),
            @AndroidBy(xpath = "//android.widget.EditText[@text='2.0']"),
    })
    public MobileElement clkOnEditText2;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
            @AndroidBy(xpath = "//android.widget.EditText[@text='0.0']"),
    })
    public MobileElement sendPageNo;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Page')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Page 1 of')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Location 1 of')]"),
    })
    public MobileElement assertPageNo1;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText[contains(@text,'5')]"),
            @AndroidBy(xpath = "//android.widget.EditText[contains(@text,'5.0')]"),
    })
    public MobileElement assertPageNo5;

    @AndroidFindBy(xpath = "//android.view.View[contains(@tet,'Page Not Found')]")
    public MobileElement assertPageNotFoundText;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Go to page']")
    public MobileElement clkGotoPage;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Content size')]//following::android.view.View[4]")
    public MobileElement clkOnDownloadedEpubContent;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'%')]")
    public MobileElement assertUserConsumedPercentage;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationContentDetailsCourse')]"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'AutomationContentDetailsCourse')]"),
    })
    public MobileElement assertResultsDisplayedForUser;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE AutomationContentDetailsCourse')]")
    public MobileElement assertCourseDisplayedForUser;


    @AndroidFindBy(xpath = "//android.view.View[@text='AutomationContentDetailsCourse']")
    public MobileElement assertSearchedCourse1;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COLLECTION AutoPDFCollection')]")
    public MobileElement clkPDFCollection;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK AutoH5PCollectionContent')]"),
    })
    public MobileElement h5pCollectionSearch;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='AutoH5PCollectionContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='AutoH5PCollectionContent']"),
})
public MobileElement assertH5PCollectionTitle;
    
   


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'PLAY')]")
    public MobileElement assertPLAYBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Page 1')]")
    public MobileElement assertPageNo1InEpubContent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Page 5')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Page 4')]"),
    })
    public MobileElement assertPageNoWhileReconsumingInEpubContent;

    
    
    
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'question number 1')]")
    public MobileElement assertQuestion1InQuestionset;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'question number 2')]")
    public MobileElement assertQuestion2InQuestionset;

    @AndroidFindBy(xpath = "//android.widget.Image[contains(@text,'modi')]")
    public MobileElement assertModiImage;


    @AndroidFindBy(xpath = "//android.widget.Image[contains(@text,'modi')]//following-sibling::android.view.View[1]")
    public MobileElement assertZoomOptionInRightBottomCorner;

    @AndroidFindBy(xpath = "//android.view.View[@text='+']")
    public MobileElement assertZoomInSymbol;


    @AndroidFindBy(xpath = "//android.view.View[@text='−']")
    public MobileElement assertZoomOutSymbol;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Credits & License info')]")
    public MobileElement assertCreditsLicenseInfoTab;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Automation textbookdontuse']"),
        @AndroidBy(xpath = "//android.view.View[@text='CollectionForAutomation']")
})
  
    public MobileElement assertCollectionTitle;


    @AndroidFindAll({
    	
    	  @AndroidBy(xpath = "//android.widget.TextView[@text='ByGuest new name']"),
          @AndroidBy(xpath = "//android.view.View[@text='Bycontent1 creator']"),
          @AndroidBy(xpath = "//android.view.View[@text='Bycontent creator']"),
          
          
    })
    public MobileElement assertPublishingOrg;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='State (Tamil Nadu)EnglishClass 1English']"),
        @AndroidBy(xpath = "//android.view.View[@text='CBSEEnglishClass 1English']")
})
    public MobileElement assertOrgFrameworkValues;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'2 Batches available')]")
    public MobileElement assert2BatchesAvailableMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Batches for the course')]")
    public MobileElement assertBatchesfortheCourseText;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Ongoing Batches')]")
    public MobileElement assertOngoingBatchesText;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Join']")
    public List<MobileElement> assertJoinBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'باغ نخلہ کے مسافر پر سلام')]")
    public MobileElement assertUrduContentTitle;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Instruction QuestionSet')]"),
    })
    public MobileElement questionSetWithoutQuestions;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Rich text images QuestionSet')]"),
    })
    public MobileElement richTextQuestionSet;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Neelallcheckbox QuestionSet')]"),
            @AndroidBy(xpath = "android.widget.TextView[contains(@text,'Neelallcheckbox QuestionSet')]"),

    })
    public MobileElement questionSetForSubmitRequired;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'QuestionSet-test')]"),
    })
    public MobileElement questionSet3;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'test max attempts')]"),
    })
    public MobileElement questionSet4;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Instructions']"),
        @AndroidBy(xpath = "//android.view.View[@text='Instructions']"),
})
public MobileElement assertInstructionsHeaderInInstructionPage;

  

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Instruction'][1]"),
        @AndroidBy(xpath = "//android.view.View[@text='Instruction']"),
})
public MobileElement assertInstructionText;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'AutomationBookContent')]")
    public MobileElement assertContent;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSE')]")
    public MobileElement assertBoardInContentPlayCard;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'English')]")
    public MobileElement assertMediumInContentPlayCard;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class 12')]")
    public MobileElement assertClassInContentPlayCard;

    @AndroidFindBy(xpath = "//android.view.View[@text='My Course']")
    public MobileElement assertMyCourseSectionInTrainingTab;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'ManjunathAutomationCourse')]")
    public MobileElement ongoingCourseUnderMyCourseSection;


    @AndroidFindBy(xpath = "//android.view.View[@text='ManjunathAutomationCourse']")
    public MobileElement assertCouseTitle;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'50% completed')]")
    public MobileElement asssert50PercentCompleteStatus;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Course Unit 1')]")
    public MobileElement assertGreenTickMarkForCompletedContent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE Automation Cert Course')]"),

    })
    public MobileElement automationCertCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE 3.5 Trackable Book')]"),

    })
    public MobileElement trackableBook;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE TrackableCollection22')]"),

    })
    public MobileElement trackableCollection22;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'TEXTBOOK 4.7 Non trackable')]"),

    })
    public MobileElement nonTrackableCollection;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirm profile name']")
    public MobileElement assertConfirmProfileNameTextInPopup;

    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Stag')]"), 
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Test')]"),

})
public MobileElement assertProfileNameInPopup;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Do not show this message again')]")
    public MobileElement assertDoNotShowThisMsgText;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='edit-name']")
    public MobileElement editProfileIcon;


    @AndroidBy(xpath = "//android.widget.TextView[@text='Choose content preferences']")
    public MobileElement assertContentPreferencesTextInProfile;

    
    @AndroidFindAll({
    	@AndroidBy(xpath = "(//android.widget.EditText"),
    	@AndroidBy(xpath = "(//android.widget.EditText)[1]"),

})
public MobileElement firstEditField;




    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement clkSubmitButton;


    @AndroidFindBy(xpath = "//android.widget.CheckBox")
    public MobileElement assertCheckBoxInPopup;



    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Attempt no 1/3']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Attempt no')]"),
})
public MobileElement assertNumberOfAttemptsText;

   

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Start')]")
    public MobileElement startLearningBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Congratulations')]")
    public MobileElement assertCongratulationsMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'You have successfully completed')]")
    public MobileElement assertCourseCompletedMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'You will be notified on your registered contact details about the course certificate within 7 days')]")
    public MobileElement assertNotifiedMsgWithin7days;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'question set title vertcical-text-QuestionSet')]")
    public MobileElement assertQuestionSetTitleInContentPlaylist;


  
    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.ToggleButton[@text='Question new Image Question new']"),
    	@AndroidBy(xpath = "//android.widget.ToggleButton[contains(@text,'Question new Image')]"),
})
public MobileElement clkOnQSContent;;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'question set title Question new')]")
    public MobileElement assertQuestionSetTitleInDigitalTextBook;


    @AndroidFindBy(xpath = "//android.view.View[@text='Confirm']")
    public MobileElement assertConfirmPopup;

    @AndroidFindBy(xpath = "//android.view.View[@text='Would you like to leave this content?']")
    public MobileElement assertWouldYouLeaveContentTextInPopup;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE CourseWithUpcomingBatch')]")
    public MobileElement tapOnUpcomingBatchCourse;


    @AndroidFindBy(xpath = "//android.view.View[@text='Up Next']")
    public MobileElement assertUpNextText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Next content']")
    public MobileElement assertNextContent;


    @AndroidFindBy(xpath = "//android.view.View[@text='Limited questionset 10 maxattempt']")
    public MobileElement assertNextContentTitle;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Economics')]")
    public MobileElement assertEconomicsSection;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='VIEW MORE']")
    public MobileElement viewMoreOption;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Economics')]")
    public MobileElement assertEconomicsSectionText;


    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'3')]")
    public MobileElement assertPdfSlide3;


    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'1')]")
    public MobileElement assertPdfSlide1;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement pdfEditField;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.CheckBox[@resource-id='ion-cb-1']"),
            @AndroidBy(xpath = "//android.widget.CheckBox[@resource-id='ion-cb-0']"),
    })
    public MobileElement consentShareCheckbox;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Share']")
    public MobileElement consentShareBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'profile data sharing,')]")
    public MobileElement assertProfileSharingLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'PROFILE DATA SHARING IS ON')]")
    public MobileElement assertProfileDataSharingStatus;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Edit settings')]")
    public MobileElement editSettingsSection;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Share my profile details')]")
    public MobileElement assertShareMyProfileDetailsRadioBtn;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text,'Do not share my profile details')]")
    public MobileElement assertDoNotShareMyProfileDetailsRadioBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public MobileElement assertSaveBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Close']")
    public MobileElement assertCloseBtn;


    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Showing 10 results out of')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 10 results out of')]"),
})
public MobileElement assertShowing10ResultsOutOf;

  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Showing 10')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 100 results')]"),
})
public MobileElement assertShowingOnly100Results;
    



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE SampleAutomationCourse')]")
    public MobileElement sampleAutomationCourse;



  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='SampleAutomationCourse']"),
        @AndroidBy(xpath = "//android.view.View[@text='SampleAutomationCourse']"),
})
public MobileElement assertSampleCourse;

    
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'information circle Last date to join')]")
    public MobileElement assertLastDateToJoinDate;


    @AndroidFindBy(xpath = "//android.view.View[@text='Course details']")
    public MobileElement assertCourseDetailsText;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Course end date :')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Course end date :')]"),
})
public MobileElement assertCourseEndDateTextWithDate;

   
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Enrollment end date :')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Enrollment end date :')]"),
})
public MobileElement assertEnrollmentEndDateTextWithDate;




    @AndroidFindBy(xpath = "//android.widget.Button[@text='VIEW MORE'][@clickable='true']")
    public MobileElement assertViewMoreBtnIsClickable;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='VIEW MORE'][@displayed='true']")
    public MobileElement assertViewMoreBtnIsDisplayed;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE SampleAutoEnrollmentEndedCourse')]")
    public MobileElement enrollmentEndedCourse;


    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='SampleAutoEnrollmentEndedCourse']"),
        @AndroidBy(xpath = "//android.view.View[@text='SampleAutoEnrollmentEndedCourse']"),
})
public MobileElement assertEnrollmentEndedCourse;

  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='The enrollment date has passed for this batch']"),
        @AndroidBy(xpath = "//android.view.View[@text='The enrollment date has passed for this batch']"),
})
public MobileElement assertEnrollmentEndedMsg;
 
  

    @AndroidFindBy(xpath = "//android.view.View[@text='next slide'][@enabled='true']")
    public MobileElement assertHighlightedNextBtn;



    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Attempt no 1/3']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Attempt no 1/3')]"),
})
public MobileElement assertFirstAttempt;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Attempt no 2/3']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Attempt no 2/3')]"),
})
public MobileElement assertSecondAttempt;
    

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Attempt no 3/3']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Attempt no 3/3')]"),
})
public MobileElement assertThirdAttempt;
    



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='This is the last remaining attempt']")
    public MobileElement lastAttemptPopup;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Continue')]")
    public MobileElement clkContinueBtn2;


    @AndroidFindBy(xpath = "//android.view.View[@text='Attempt no 1/1']")
    public MobileElement assertSingleAttemptText;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ಪಠ್ಯಾಂಶವನ್ನು ರೇಟ್ ಮಾಡಿ']")
    public MobileElement assertಪಠ್ಯಾಂಶವನ್ನುರೇಟ್ಮಾಡಿtext;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='1out of five stars']")
    public MobileElement sltFirstStar;


    @AndroidFindBy(xpath = "//android.view.View[@text='ತುಂಬಾ ಕೆಟ್ಟದಾಗಿದೆ']")
    public MobileElement assertತುಂಬಾೆಟ್ಟದಾಗಿದೆtext;


    @AndroidFindBy(xpath = "//android.view.View[@text='ನೀವು ಈ ಬಗ್ಗೆ ಇನ್ನೂ ಹೆಚ್ಚು ಹೇಳಲು ಬಯಸುವಿರಾ?']")
    public MobileElement assertನೀವುಈಬಗ್ಗೆಇನ್ನೂಹೆಚ್ಚುಹೇಳಲುಬಯಸುವಿರಾtext;


    @AndroidFindBy(xpath = "//android.view.View[@text='ಪಠ್ಯಾಂಶವು ನಿಖರವಾಗಿಲ್ಲ']")
    public MobileElement assertಪಠ್ಯಾಂಶವುನಿಖರವಾಗಿಲ್ಲtext;



    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Attempt no')]"),
    	@AndroidBy(xpath = "//android.view.View[contains(@text,'Attempt no 1/3')]"),
})
public MobileElement assertNumberOfAttempts;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'30:00')]")
    public MobileElement assertTimerInQuestionSet;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Batches')]")
    public MobileElement assertBatchesList;


    @AndroidFindBy(xpath = "//android.view.View[@text='10-10 metre']")
    public MobileElement selAnswer;

    @AndroidFindBy(xpath = "//android.view.View[@text='I2']")

 
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='Correct Answer']"),
        @AndroidBy(xpath = "//android.view.View[@resource-id='correctButton']"),
})
public MobileElement assertRightMarkInFeedbackPopup;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='View Solution']"),
        @AndroidBy(xpath = "//android.view.View[@text='View Solution']"),
})
public MobileElement assertViewSolInFeedbackPopup;


    
    @AndroidFindBy(xpath = "//android.view.View[@text='I2']")
    public MobileElement selAnswer1;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Close']")
    public MobileElement assertCloseBtnInViewSolutionPage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    public MobileElement assertDoneBtnInViewSolutionPage;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Are you ready to submit?')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Are you ready to submit?')]"),
})
public MobileElement assertAreYouReadytoSubmitText;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Neelallcheckbox QuestionSet']"),
        @AndroidBy(xpath = "//android.view.View[@text='Neelallcheckbox QuestionSet']"),
})
public MobileElement assertTitleOfQuestionSetInSubmitPage;




    @AndroidFindBy(xpath = "//android.widget.Image[@text='Progress Indicators']")
    public MobileElement assertProgressIndicatorsInSubmitPage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Review']")
    public MobileElement assertReviewButton;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='question number 1']"),
        @AndroidBy(xpath = "//android.view.View[@text='question number 1']"),
})
public MobileElement questionNumber1;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='question number 2']"),
        @AndroidBy(xpath = "//android.view.View[@text='question number 2']"),
})
public MobileElement questionNumber2;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='1/6']"),
        @AndroidBy(xpath = "//android.view.View[@text='1/6']"),
})
public MobileElement assertQuestion1;




    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2:00']")
    public MobileElement assertTimerForEntireSection;


    @AndroidBy(xpath = "//android.widget.TextView[@text='Section A']")
    public MobileElement assertSectionA;

    @AndroidBy(xpath = "//android.widget.TextView[@text='Section B']")
    public MobileElement assertSectionB;


    @AndroidFindBy(xpath = "//android.widget.RadioButton")
    public List<MobileElement> radioBtns;


 
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[@text='1/2']"),
    	@AndroidBy(xpath = "//android.view.View[@text='1/2']"),
})
public MobileElement assertShowXbarY;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'apple')]")
    public MobileElement selAns1;


    @AndroidFindBy(xpath = "//android.widget.Image[@text='ans']")
    public MobileElement assertAnsIcon;


    @AndroidFindBy(xpath = "//android.view.View[@text='10–8 metre']")
    public MobileElement selWrongAnswer;


    @AndroidFindBy(xpath = "//android.widget.Image[@text='Wrong Answer']")
    public MobileElement assertWrongAnswerImageInFeedbackPopup;


    @AndroidFindAll({    	 
    	
        @AndroidBy(xpath = "//android.widget.TextView[@text='Try again']"),
            @AndroidBy(xpath = "//android.view.View[@text='Try again']"),
         //   @AndroidBy(xpath = "//android.widget.TextView[@text='Try again']\"),"),

    })
    public MobileElement assertTryAgainTextInFeedbackPopup;
    


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Questions Answered: 1']")
    public MobileElement assertQuestionsAnswered;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total Questions: 4']")
    public MobileElement assertTotalQuestions;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Questions Skipped: 3']")
    public MobileElement assertQuestionsSkipped;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Questions not Viewed: 0']")
    public MobileElement assertQuestionsNotViewed;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE 4.0 course with expired batch1')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[contains(@text,'CourseContent')]"),
    })
    public MobileElement multipleBatchCourse1;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Select A Batch TO Proceed')]")
    public MobileElement assertMultipleBatchesPopup;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Expired Batches')]")
    public MobileElement assertExpiredBatchesTextInPopup;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Open Batches')]")
    public MobileElement assertOpenBatchesTextInPopup;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='RESUME']")
    public MobileElement assertResumeBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Join']")
    public MobileElement assertJoinBtnForOngoingBathc;


    @AndroidFindBy(xpath = "//android.widget.ToggleButton[contains(@text,'4.7 ribbon trackable')]")
    public MobileElement trackableCourseUnderNontrackableCol;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'You have joined the batch of a course that is completed on')]")
    public MobileElement assertJoinedBatchMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'You may continue the course, but your progress will not be updated')]")
    public MobileElement assertProgressWillNotUpdateMsg;



    @AndroidFindBy(xpath = "//android.view.View[@text='Expired Batches']")
    public MobileElement assertExpiredBatches;


    @AndroidFindBy(xpath = "//android.view.View[@text='Open Batches']")
    public MobileElement assertOpenBatches;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'The course's batch is available from')]")
    public MobileElement assertFutureBatchPopup;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'RESOURCE')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Showing 100 results')]//following::android.view.View[1]"),
})
public MobileElement clkOnEpubContent3;



    @AndroidFindBy(xpath="//android.view.View[@text='Course modules']")
    public MobileElement clkOnCourseModules;


@AndroidFindBy(xpath="//android.view.View[@text='Course Unit 1']")
    public MobileElement clkOnFirstContent;

@AndroidFindBy (xpath = "//android.view.View[contains(@text,'QuestionSet-test')]")
public MobileElement clickQuestionset;


@AndroidFindBy(xpath = "//android.view.View[@text='preview slide']")
public MobileElement clickprev;




@AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE 4.7 TRACKABLE BOOK ISSUE')]")
public MobileElement clkOnCourseDetails1;





@AndroidFindBy(xpath = "//android.view.View[contains(@text,'COURSE Sept csp')]")
public MobileElement questionSetCourse7;

@AndroidFindBy(xpath = "//android.widget.Button[@text='JOIN']")
public MobileElement jointrackable;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Do not share']")
public MobileElement donotsharebuton;

@AndroidFindBy(xpath = "//android.widget.Button[@text='play Start learning']")
public MobileElement startlearning1;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Start Learning']")
public MobileElement startlearning2;

@AndroidFindBy(xpath = "//android.view.View[@text='Textbook Unit']")
public MobileElement textbookunit;



@AndroidFindBy(xpath = "//android.widget.Button[@text='Trackable QuestionSet']")
public MobileElement trackablequestionset;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Play video']")
public MobileElement playPdfquestion;

@AndroidFindBy(xpath = "//android.view.View[@text='Rohit Sharma']")

public MobileElement ques1;

@AndroidFindBy(xpath = "//android.view.View[@text='3']")

public MobileElement ques2;


@AndroidFindBy(xpath = "//android.widget.TextView[@text='Score: 2']")

        public MobileElement score;

@AndroidFindBy(xpath = "//android.view.View[@text='Exit']")
public MobileElement ExitBtn;

@AndroidFindBy(xpath = "//android.widget.Button[@text= 'OK']")
public MobileElement ConfrmBtn;



@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Sept 22 QuestionSet')]")
public MobileElement questionsetfeedback;

@AndroidFindBy(xpath = "//android.widget.Image[@text='Correct Answer']")

public MobileElement feedbackenablecorrect;

@AndroidFindBy(xpath = "//android.widget.Image[@text='Wrong Answer']")

public MobileElement feedbackenablewrong;


@AndroidFindBy(xpath = "//android.view.View[contains(@text, 'COURSE Copy of csp sept Course Subject')]")

public MobileElement coursetitle;

@AndroidFindBy(xpath = "//android.view.View[@text='Course modules']")

public MobileElement coursemodule;

 @AndroidFindBy(xpath = "//android.view.View[@text= 'Course Unit-1']")

public MobileElement clkOncourseunit;

@AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'User Assessment')]")

public MobileElement assessmentscore;




@AndroidFindBy(xpath = "//android.view.View[@text='next slide']")
public MobileElement clicknext;




@AndroidFindBy(xpath = "//android.view.View[@text='India']")
public MobileElement question1;
@AndroidFindBy(xpath = "//android.view.View[@text='Rajnikanth']")
public MobileElement question2;
@AndroidFindBy(xpath = "//android.view.View[@text='Pakistan']")
public MobileElement question3;

@AndroidFindBy(xpath = "//android.widget.Image[@text='close']")
public MobileElement RatingBtn;
@AndroidFindBy(xpath = "//android.widget.Button[@text='back']")
public MobileElement BackBtn;

@AndroidFindBy(xpath = "//android.view.View[@text='Course Unit']")
public MobileElement courseunit;


@AndroidFindBy(xpath = "//android.widget.Button[@text='Questionset limited attempt']")
public MobileElement Questionsetlimit;



@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sept 22 QuestionSet']")

public MobileElement questionsettitle;

@AndroidFindBy(xpath = "//android.widget.Image[@index='0']")

public MobileElement questionsetdesign;

@AndroidFindBy(xpath = "//android.view.View[@text='Replay']")

public MobileElement questionsetreply;

@AndroidFindBy(xpath = "//android.view.View[@text='Course details']")
public MobileElement clkOnTextCourseDetails;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Enrollment end date : 26/09/2023']")
public MobileElement assertPassedEnrollmentEndDate;

@AndroidFindBy(xpath = "//android.view.View[@text='Course modules']")
public MobileElement clkCourseModules;

@AndroidFindBy(xpath = "//android.view.View[@text='Course Unit 1']")
public MobileElement clkCourseUnit1;

@AndroidFindBy(xpath = "//android.widget.Button[@text='3.6 AN Self assess BEST SCORE 8/9']")
public MobileElement assertBestScore;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'COURSE 26th April with assessment')]"),
})
public MobileElement Course26thAprilWithAssessment;

@AndroidFindBy(xpath = "//android.view.View[@text='Course Unit 2']")
public MobileElement clkCourseUnit2;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='0/1 Completed']")
public MobileElement assertYourProgressStatus;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Assess_1']")
public MobileElement assertBestScoreNotDisplayed;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Course with assessments')]"),
})
public MobileElement CourseWithAssessments;



}
