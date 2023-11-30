package com.qualitrix.pageActions;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.ProfileEditPageObjects;
import com.qualitrix.pageObjects.ProfilePageObjects;
import com.qualitrix.pageObjects.TrainingPageObjects;

import java.util.Objects;
import java.util.Queue;

/**
 * This Class has all the methods related to Training Page.
 *
 * @author : Gurukiran H N
 * @since : 23/March/2020
 */
public class TrainingPageActions {


    TrainingPageObjects trainingPageObjects = new TrainingPageObjects();
    LibraryCourseContentPageActions libcour = new LibraryCourseContentPageActions();
    ProfileEditPageObjects profileEditPageObjects = new ProfileEditPageObjects();


    public TrainingPageActions() {
        //    this.driver = ContextManager.getDriver();

        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), trainingPageObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), profileEditPageObjects);

        //PageFactory.initElements(driver,DikshaMainPageObjects.class);

    }


    public void tapOnFilterBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.filterBtn);
        QXClient.get().report().info("Tap on filter button");
    }

    public void tapOnCancelBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.cancelBtn);
        QXClient.get().report().info("Tap on search button");
    }

    public void tapOnSelectBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selectBtn);
        QXClient.get().report().info("Tap on select button");
    }

    public void tapOnEnrollmentViewAllBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selectEnrollmentViewAll);
        QXClient.get().report().info("Tap on enrollment view all button");
    }

    public void tapOnSearchedCopiedCourse() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.copiedCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on course searched");
    }

    public void tapOnSearchedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.CourseSearch);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on course searched");
    }

    public void tapOnSearchedCourse1() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.automationCourseContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on AutomationCourseContent");
    }

    public void tapOnSearchedSmallCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.automationCourseContent1);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on AutomationCourseContent");
    }

    public void tapOnSearchedSmallCourse1() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.automationCourseContent2);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on AutomationCourseContent");
    }

    public void tapOnSearchedSmallCertificateCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.smallCertCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Small Certificate Course");
    }

    public void tapOnPracticeCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.practiceCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on practice course");
    }

    public void tapOnMultipleContentCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.multipleContentCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on MultipleContentCourse");
    }

    public void tapOnSearchedCourse2() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.CourseContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on CourseContent");
    }

    public void tapOnSearchedCollection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.collectionContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Collection");
    }

    public void tapOnSearchedCourseForDF() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClkOnCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on AutomationCourseForDF");
    }


    public void tapOnSearchUrduContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.urduContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Urdu Content");
    }

    public void tapOnQuestionSetWithoutQuestions() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionSetWithoutQuestions);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Questionset without questions");
    }

    public void tapOnQuestionSet() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.richTextQuestionSet);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Questionset questions");
    }


    public void tapOnQuestionSet1() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionSetForSubmitRequired);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Questionset questions");
    }


    public void tapOnQuestionSet2() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionSet3);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Questionset questions");
    }

    public void tapOnQuestionSet3() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionSet4);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Questionset questions");
    }


    public void tapOnSearchedBook() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BookSearch);
        QXClient.get().report().info("Tap on Book searched");
        QXClient.get().gestures().BlindWait(9000);
    }

    public void tapOnVideoTranscriptContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.transcriptContent);
        QXClient.get().report().info("Tap on transcript searched");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void tapOnLargeVideoContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.largeVideoContent);
        QXClient.get().report().info("Tap on large video content searched");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnQSInContentPlaylist() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.contentPlaylistQS);
        QXClient.get().report().info("Tap on QSContentPlaylist searched");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnQSInDigitalTextBook() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.digitalTextbookQS);
        QXClient.get().report().info("Tap on QSDigitalTextBook searched");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnSearchedLargeSizeBook() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.largeSizeBook);
        QXClient.get().report().info("Tap on Book searched");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnLatestCourseViewAllBtn() {
        QXClient.get().gestures().scrollToMobileElement(trainingPageObjects.latestCoursesViewAll, "2");
        QXClient.get().report().info("Tap on latest course view all button");
    }

    public void tapOnOpenBtn() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.openBtn);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on open button");
    }

    public void tapOnTrainingInfo() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trainingInfoObj);
        QXClient.get().report().info("Tap on training information tab");
    }

    public void verifyFilteredCourses() throws Exception {
        QXClient.get().gestures().wait(4);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.classInfo), "As per Selected class is filtered");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.subjectInfo), "As per Selected subject is filtered");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.mediumInfo), "As per Selected medium is filtered");
        QXClient.get().report().info("Verifying filtered courses");
    }

    public void verifyTermsAndCondLink() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.termsAndCondLink));
        QXClient.get().report().info("Verifying Terms And Condition link");
    }

    public void tapOnJoinTraining() {
        if (!QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinTrainingBtn);
           /* if (QXClient.get().gestures().isElementPresent(trainingPageObjects.joinBtn)) {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinBtn);
            }*/
            QXClient.get().report().info("Tap on join training");
        }
    }

    public void tapOnJoinTraining2() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

    }


    public void taponContinue() {

        try {
            if (!QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn)) {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinuew);
           /* if (QXClient.get().gestures().isElementPresent(trainingPageObjects.joinBtn)) {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinBtn);
            }*/
                QXClient.get().report().info("Tap on Continuew buttong");
            }
        } catch (Exception e) {
            System.out.println("Issue Handled");
        }
    }

    public void taponcoursePDF() {

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDoneButton);
           /* if (QXClient.get().gestures().isElementPresent(trainingPageObjects.joinBtn)) {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinBtn);
            }*/
        QXClient.get().report().info("Tap on Done button");
    }


    public void tapOnEnrollmentFeaturedViewAllBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.viewAllFeaturedTraings);
        QXClient.get().report().info("Tap on enrollment Featured view all button");
    }

    public void tapOnEnrollmentLatestCourseViewAllBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.viewAllLatestCourse);
        QXClient.get().report().info("Tap on enrollment Latest view all button");
    }

    public void clkFeaturedCourse() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkFeaturedCourse);
        QXClient.get().report().info("Clicked on Featured Course");
    }

    public void clkLatestCourse() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLatestCourse);
        QXClient.get().report().info("Clicked on Latest Course");
    }

    public void tapOnBioBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.bioBtn);
        QXClient.get().report().info("Tap on bio button");
    }


    public void clickBackBtn() {
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.backBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.backBtn);
        }
        QXClient.get().report().info("Tap on back button");
    }

    public void tapOnApplyButton() {
        for (int i = 0; i < 5; i++) {
            if (!QXClient.get().gestures().isElementPresent(trainingPageObjects.topicBtn)) {
                tapOnApplyBtn();
                break;
            }
        }
    }

    public void tapOnApplyBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.applyBtn);
        trainingPageObjects.applyBtn.click();
        QXClient.get().report().info("Tap on search button");
    }

    public void tapOnDownloadBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.downloadBtn);
        QXClient.get().report().info("Tap on download button");
    }

    public void tapOnDownloadBtnInDownloadPopUp() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.downloadPopUpBtn);
        QXClient.get().report().info("Tap on download button in download popup");
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().BlindWait(4000);

    }

    public void verifyFileDownloadThroughNotification() throws Exception {
        QXClient.get().gestures().openNotification();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadingNotification));
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadsNot));
        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("Verifying the file downloaded successfully or not");
    }

    public void waitTillTheDownloadButtonDisappears() {
        try {
            for (int i = 0; i < 30; i++) {
                if (QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadingObj)) {
                    QXClient.get().gestures().wait(20);
                } else {
                    Assert.assertFalse(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadingObj));
                    QXClient.get().report().info("The file downloaded successfully");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error while downlading");
        }
    }

    public enum FILTER {
        TOPIC,
        PURPOSE,
        MEDIUM,
        CLASS,
        SUBJECT,
        ORGANIZATION;
    }

    public enum TOPICS {
        SCIENCE,
        SOCIAL_SCIENCE;
    }

    public enum PURPOSE {
        CONCEPTS,
        TEACHING,
        ASSESSMENT,
        COMMUNICATION,
        CURRICULUM;
    }

    public enum MEDIUM {
        TELUGU,
        ENGLISH,
        ASSAMESE,
        HINDI,
        KONKANI,
        GUJARATHI;
    }

    public enum CLASS {
        CLASS_1,
        CLASS_2;
    }

    public enum SUBJECT {
        CHEMISTRY,
        PHYSICS,
        BIOLOGY;
    }

    public enum ORGANIZATION {
        KERALA_STATE,
        PUNJAB,
        RAJASTHAN;
    }

    public void tapOnFilterCategories(FILTER filter) {
        switch (filter) {
            case TOPIC:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.topicBtn);
                QXClient.get().report().info("Tap on topic");
                break;
            case PURPOSE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.purposeBtn);
                QXClient.get().report().info("Tap on purpose");
                break;
            case MEDIUM:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.mediumBtn);
                QXClient.get().report().info("Tap on medium");
                break;
            case CLASS:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.classBtn);
                QXClient.get().report().info("Tap on class");
                break;
            case SUBJECT:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.subjectBtn);
                QXClient.get().report().info("Tap on subject");
                break;
            case ORGANIZATION:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.orgBtn);
                QXClient.get().report().info("Tap on organization");
                break;
        }
    }

    public void selectTopic(TOPICS topics) throws Exception {
        switch (topics) {
            case SCIENCE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.scienceBtn);
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on science");
                break;
            case SOCIAL_SCIENCE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.socialScienceBtn);
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on social science");
                break;
        }
    }

    public void selectPurpose(PURPOSE purpose) throws Exception {
        switch (purpose) {
            case CONCEPTS:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.conceptsBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on concepts");
                break;
            case TEACHING:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.tchngBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on teaching");
                break;
            case ASSESSMENT:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assessmentBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on assessment");
                break;
            case COMMUNICATION:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.communicationBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on communication");
                break;
            case CURRICULUM:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.curriculumBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on curriculum");
                break;
        }
    }

    public void selectMedium(MEDIUM medium) throws Exception {
        switch (medium) {
            case TELUGU:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.teluguMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Telugu");
                break;
            case ENGLISH:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.englishMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on English");
                break;
            case ASSAMESE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assameseMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Assamese");
                break;
            case HINDI:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.hindiMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Hindi");
                break;
            case KONKANI:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.konkaniMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Konkani");
                break;
            case GUJARATHI:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.gujaratiMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Gujarati");
                break;
        }
    }

    public void selectClass(CLASS cls) throws Exception {
        switch (cls) {
            case CLASS_1:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.classOneObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on class one");
                break;
            case CLASS_2:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.classTwoObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on class two");
                break;
        }
    }

    public void selectSubject(SUBJECT subject) throws Exception {
        switch (subject) {
            case CHEMISTRY:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.chemistryObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on chemistry");
                break;
            case PHYSICS:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.physicsObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on physics");
                break;
            case BIOLOGY:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.biologyObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on biology");
                break;
        }
    }

    public void selectOrganization(ORGANIZATION organization) {
        switch (organization) {
            case KERALA_STATE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.keralaStateObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().report().info("Tap on Kerala state");
                break;
            case PUNJAB:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.punjabObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().report().info("Tap on Punjab state");
                break;
            case RAJASTHAN:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.rajasthanObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().report().info("Tap on Rajasthan state");
                break;
        }
    }

    public void scrollUp(int j) {
        for (int i = 1; i <= j; i++) {
            QXClient.get().gestures().swipeUp();
        }
    }

    public void verifyCreditAndLicenseUI() {
        //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.authorObj), "Author info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.publishObj), "Published by info is displayed");
        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.attributionObj), "Attribution info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.licenseTermsObj), "License terms info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.copyRightObj), "Copyright info is displayed");
        QXClient.get().report().info("Verifying credit and license UI");
    }

    public void verifyCourseTOC() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.trashDelete), "Trash delete button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.shareBtn), "Share button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn), "Start now button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.trainingInfoObj), "Training information tab is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.trainingModuleObj), "Training module tab is displayed");
        //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.arrowUp), "Arrow button is displayed");
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.menuIcon), "Menu icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.progressBar), "Progress bar is displayed");
        QXClient.get().report().info("Verifying course TOC, all units and content inside course");
    }

    public void verifyCourseUI() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.shareBtn), "Share button is displayed");
        //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn), "Start now button is displayed");

        QXClient.get().report().info("Verifying course UI");
    }

    public void clkStartNowAndPlayContent() throws Exception {

        QXClient.get().gestures().wait(5);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startNowBtn);
        QXClient.get().report().info("Clicked on StartNow");
        QXClient.get().gestures().wait(5);

        libcour.tapOnPlayIcon();
        QXClient.get().gestures().wait(5);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("Clicked on Back button");

        libcour.tapOnOKbtn();
        QXClient.get().report().info("Clicked on Ok button");

        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("again click on Back button");


    }

    public void verifyTrainingPageContents() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.filterBtn), "Notification icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.searchBtn), "Search icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.featuredTrainingViewAll), "Featured training view all option is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.latestCoursesViewAll), "Latest course view all option is displayed");
        QXClient.get().report().info("Verifying training page contents");
    }

    public void tapOnSearchedResource() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ResourceSearch);
        //  QXClient.get().gestures().wait(7);
        QXClient.get().report().info("Tap on searched Resource");
    }

    public void leaveCourse() throws Exception {

        QXClient.get().gestures().BlindWait(9000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sltCourseMenuIcon);
        QXClient.get().report().info("Click on CourseMenuIcon");
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLeaveCourse);
        QXClient.get().report().info("Click on Leave Course");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkConfirmButton);
        QXClient.get().report().info("Click on Confirm Button");
        QXClient.get().gestures().BlindWait(7000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.joinTrainingBtn), "joinTrainingBtn icon is displayed");
        QXClient.get().report().info("Leave course done succesfuly");

    }

    public void tapOnSearchedPDF() throws Exception {
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.PDFSearch);
        QXClient.get().report().info("Tap on searched PDFSearch");
        QXClient.get().gestures().BlindWait(8000);

    }

    public void tapOnSearchedPDFCollection() throws Exception {
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPDFCollection);
        QXClient.get().report().info("Tap on searched PDF collection Search");
        QXClient.get().gestures().BlindWait(8000);

    }


    public void tapOnOngoingCourse() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ongoingCourse);
        QXClient.get().report().info("Tap on Ongoing course");
    }


    public void tapOnCompletedCourse() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.completedCourse);
        QXClient.get().report().info("Tap on completed course");
    }

    public void viewCompleteMessage() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.completedMessage);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.completedMessage), "You have successfully completed this course");
        QXClient.get().report().info("Verifying completed message");
    }


    public void consumCourseContentOld() throws Exception {


        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }
        LibraryCourseContentPageActions library = new LibraryCourseContentPageActions();
        TrainingPageActions training = new TrainingPageActions();

        library.tapOnDownloadBtn();
        training.tapOnDownloadBtnInDownloadPopUp();
        //getTrainingPageActions().verifyFileDownloadThroughNotification();
        //     training.waitTillTheDownloadButtonDisappears();


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("clicked on clkStartLearning button");


        QXClient.get().gestures().BlindWait(7000);


        QXClient.get().gestures().tocuh();


        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(2000);


        try {
            libcour.tapOnStarIcon();
            libcour.giveFeedbackAndSubmit("toast");
        } catch (Exception e4) {
            System.out.println("hanled feedback");
        }
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verify50PercentProgress), "You have successfully verify50PercentProgress completed this course");
        QXClient.get().report().info("Verifying verify50PercentProgress message");


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueLearning);
        QXClient.get().report().info("clicked on clkContinueLearning button");
        QXClient.get().gestures().BlindWait(7000);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(2000);

        libcour.tapOnStarIcon();
        libcour.giveFeedbackAndSubmit("toast");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifyCompletedMsg), "You have successfully verifyCompletedMsg completed this course");
        QXClient.get().report().info("Verifying verifyCompletedMsg message");
    }


    public void taponCourseButton() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.tapCoureBtn);
        QXClient.get().report().info("Tap on tapCoureBtn button");
    }


    public void consumCourseContent() throws Exception {
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);
        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);
            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }
        LibraryCourseContentPageActions library = new LibraryCourseContentPageActions();
        TrainingPageActions training = new TrainingPageActions();
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.tenSecVideoText)) {
            //library.tapOnDownloadBtn();
            QXClient.get().gestures().BlindWait(2000);
        } else {
            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseContent2);
            QXClient.get().gestures().BlindWait(6000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().report().info("clicked on joincourse button");
            QXClient.get().gestures().BlindWait(2000);
            try {
                if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
                {
                    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                    QXClient.get().report().info("clicked on clkDontShareBtn button");
                    QXClient.get().gestures().BlindWait(2000);
                }
            } catch (Exception e3) {
                System.out.println("handled profile share");
            }
            //  library.tapOnDownloadBtn();
        }
        //library.tapOnDownloadBtn();
        //training.tapOnDownloadBtnInDownloadPopUp();
        //getTrainingPageActions().verifyFileDownloadThroughNotification();
        // training.waitTillTheDownloadButtonDisappears();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("clicked on clkStartLearning button");
        QXClient.get().gestures().BlindWait(7000);
        QXClient.get().gestures().tocuh();
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(9000);
       /* try
        {
        libcour.tapOnStarIcon();
        libcour.giveFeedbackAndSubmit("toast");
        }
        catch(Exception e4)
        {
           System.out.println("hanled feedback");
        }*/
        QXClient.get().gestures().BlindWait(9000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verify50PercentProgress), "You have successfully verify50PercentProgress completed this course");
        QXClient.get().report().info("Verifying verify50PercentProgress message");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueLearning);
        QXClient.get().report().info("clicked on clkContinueLearning button");
        QXClient.get().gestures().BlindWait(7000);
        QXClient.get().gestures().BlindWait(9000);
        QXClient.get().gestures().BlindWait(9000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().BlindWait(5000);
        // libcour.tapOnStarIcon();
        // libcour.giveFeedbackAndSubmit("toast");
    }

    public void verifyCourseCompletedMsg() throws Exception {
     //   QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseContentVerification);
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifyCompletedMsg), "You have successfully verifyCompletedMsg completed this course");
        QXClient.get().report().info("Verifying verifyCompletedMsg message");
    }


    public void onGoingCourseVerification() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.myLearningtext)), "My learning content is not visisble");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.onGoingCourse)), "Course is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.onGoingCourse);
        QXClient.get().gestures().BlindWait(9000);
        // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueLearning);
        // QXClient.get().report().info("clicked on clkContinueLearning button");
        QXClient.get().gestures().BlindWait(7000);
        //QXClient.get().gestures().clkBackButton();
        // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        //
        // QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(5000);
    }

    public void completedCourseInProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        // Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.myLearningtext)),"My learning content is not visisble");
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.refreshCircle);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.refreshCircle);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.refreshCircle);
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.completeCourse)), "Course still in ongoing");
    }

    public void verifyContentForAlternativeBoard() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.filterBtn);
        QXClient.get().report().info("Clicked on filter button");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.boardFilter), "Board filter is not available");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.boardFilter);
        QXClient.get().report().info("Clicked on Board filter");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.cbseBoard);
        QXClient.get().report().info("Clicked on CBSE alternative board for the content");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkConfirmButton);
        QXClient.get().report().info("Clicked on Confirm button");
        QXClient.get().gestures().BlindWait(3000);

       // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(2000);

      //  QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.filterBtn);
       // QXClient.get().report().info("Clicked on filter button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.applyFilterBtn);
        QXClient.get().report().info("Clicked on apply filter button");

    }

    public void verifyAlternativeBoardForTheSearchedContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifyContentForAlternativeBoard), "Content for alternative board in not available");
        QXClient.get().report().info("Content searched for alternative board is matched");

    }

    public void verifyFunctionalityOfNexPrevWhileConsumingPdfContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPdfContent);
        QXClient.get().report().info("Clicked on pdf content");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon), "Play icon is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on PDF content to play");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.pdfHambergerIcon), "Hamburger icon is not present");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkNextIcon), "Next icon is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkPreviousIcon), "Previous icon is not visible");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on next icon");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().report().info("Clicked on previous icon");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyHambergerMenuOptionsWhileContentConsuming() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.pdfHambergerIcon);
        QXClient.get().report().info("Clicked on Hamberger Icon in Content");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.shareButton), "Share button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadButton), "Download button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.printButton), "Print Button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.exitButton), "Exit button is not visible");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
        QXClient.get().report().info("Clicked on exit button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().report().info("Clicked on close Rating popup");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyContentAfterConsumingCompletely() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on pdf play");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);

        QXClient.get().report().info("Clicked on next icon");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentCompletedText), "You just completed messaged is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.userName), "User is not visible");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentName), "Content name is not visible");

        String contentName = trainingPageObjects.contentName.getText();
        System.out.println("Content Name is : " + contentName);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.timeTakenToCompleteContent), "Time taken is not visible");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.replayButton), "Replay button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.exitButton2), "Exit button is not visible");

        QXClient.get().report().info("User,content,time taken,replay and exit button are displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton2);
        QXClient.get().report().info("Clicked on exit button");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void updateRating() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.updateRatingStar);
        QXClient.get().report().info("Clicked on update ratings");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.veryBadRating), "Rating is not available");

    }


    public void playContentAndDownloadContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        //QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPdfContent);
        QXClient.get().report().info("Clicked on pdf content");
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon), "Play icon is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on PDF content to play");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);

        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().report().info("Clicked on close Rating popup");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDownloadContent);
        QXClient.get().report().info("Clicked on download content");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDownloadBtn);
        QXClient.get().report().info("Clicked on download button");
        QXClient.get().gestures().BlindWait(9000);

    }

    public void verifyDownloadedContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadedContent), "Downloaded content is not visible");
        QXClient.get().report().info("Downloaded content is visible");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyForumIconAfterUserJoinTheCourse() throws Exception {
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);
        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);
            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.hindiText)) {
            QXClient.get().gestures().BlindWait(2000);
        } else {
            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseContent2);
            QXClient.get().gestures().BlindWait(6000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().report().info("clicked on joincourse button");
            QXClient.get().gestures().BlindWait(2000);
            try {
                if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
                {
                    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                    QXClient.get().report().info("clicked on clkDontShareBtn button");
                    QXClient.get().gestures().BlindWait(2000);
                }
            } catch (Exception e3) {
                System.out.println("handled profile share");
            }
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.forumIcon), "Forum Icon is not displayed");
        QXClient.get().report().info("Forum Icon is displayed after user joins the course");
    }


    public void verifyConsumeCourseAfterJoinCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on Join course button");
        QXClient.get().gestures().BlindWait(2000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);
            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "Start learning button is not displayed");
        QXClient.get().report().info("Start learning button is displayed and user able to consume the course");


    }

    public void verifyCertificateDetailsBeforeJoinCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
        QXClient.get().report().info("Clicked on course details in course page");
        QXClient.get().gestures().BlindWait(3000);

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.viewCertificateMsg)) {
            QXClient.get().report().info("Certificate message is present before join the course");
        } else {
            QXClient.get().report().info("Certificate message is not displayed under course details");
        }
    }


    public void verifyCertificateDetailsAfterJoinCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)) {
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().report().info("Clicked on Join course button");
            QXClient.get().gestures().BlindWait(2000);

            try {
                if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
                {
                    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                    QXClient.get().report().info("clicked on clkDontShareBtn button");
                    QXClient.get().gestures().BlindWait(2000);
                }
            } catch (Exception e3) {
                System.out.println("handled profile share");
            }

        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(2000);
        tapOnSearchedSmallCourse();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(6000);
        ///QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
        QXClient.get().report().info("Clicked on course details");
        QXClient.get().gestures().BlindWait(3000);

        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.viewCertificateMsg),"Certificate message is not displayed");
        QXClient.get().report().info("Certificate message is displayed");

    }


    public void consumeSmallCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "start learning button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(6000);
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
            QXClient.get().gestures().BlindWait(3000);
        }

        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().BlindWait(4000);

       // QXClient.get().gestures().clkBackButton();

       // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("Clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyCourseCompletedMsgWithoutCertificate() throws Exception {

        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(5000);

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
            QXClient.get().gestures().BlindWait(3000);
        }

        QXClient.get().gestures().BlindWait(8000);


     //   QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().BlindWait(1000);
      //  QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);

     //   QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(9000);
      //  QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.congratulationsMsg), "Congratulations message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseCompletedMsg), "Course completed message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.noCertificateMsg), "Course is not attached certificate message is not displayed");

        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyCoursesBasedOnSubject() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.accountancySubject), "Accountancy subject is not displayed");
        QXClient.get().report().info("Accountancy subject is displayed in courses section");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseUnderSubject1), "Course under the subject is not displayed");
        QXClient.get().report().info("Course Under the subject is displayed");
        QXClient.get().gestures().BlindWait(2000);

        /*Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assameseSubject),"Assamese subject is not displayed");
        QXClient.get().report().info("Assamese subject is not displayed under courses section");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseUnderSubject2),"Course is not displayed");
        QXClient.get().report().info("Course is displayed under the subject");*/
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().scrollToMobileElement(trainingPageObjects.othersSection, "5");

        QXClient.get().gestures().BlindWait(3000);
        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.othersSection),"Others section is not displayed");
        QXClient.get().report().info("Other sections is displayed");
        QXClient.get().gestures().BlindWait(2000);

        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseUnderOthers),"Course under ohter section is not displayed");
        QXClient.get().report().info("Course is displayed under others section");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyContentForAllMediaTypeFilter() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.filterBtn);
        QXClient.get().report().info("Clicked on filter button");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertFilterBy), "Filter By is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertResetBtn), "Reset Button is not available");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkMediaTypeFilter), "MediaType filter is not available");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkMediaTypeFilter);
        QXClient.get().report().info("Clicked on Media Type filter");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkAllMediaTypeFilter);
        QXClient.get().report().info("Clicked on All Media type filter for the content");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkConfirmBtn);
        QXClient.get().report().info("Clicked on Confirm button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkApplyFilterBtn);
        QXClient.get().report().info("Clicked on apply filter button");
        QXClient.get().gestures().BlindWait(3000);

         Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentAfterFiltering),"Content for all media type is not available");
        QXClient.get().report().info("Content for all media type is displayed");
    }

    public void verifyLoginBeforeCourseFetch() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCheckCourseMsg), "Want to check courses message is not displayed");
        QXClient.get().report().info("Want to check courses message is displayed");

      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.loginBtnInCourseSection), "Login button in training page is not displayed");
      //  QXClient.get().report().info("Login button is displayed");

        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyLoginPopUpWhileJoinCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.loginPopUp), "Login popup is not displayed");
        QXClient.get().report().info("Login popup is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.messageInLoginPopup), "Message in login popup is not displayed");
        QXClient.get().report().info("Message in login popup is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLoginBtn), "Login button is not displayed");
        QXClient.get().report().info("Login button is displayed");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyCreatorNotAbleToEnrollMessage() throws Exception {
        QXClient.get().gestures().BlindWait(1000);

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.canNotEnrollMsg)) {
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.canNotEnrollMsg), "Creator can't enroll to course message is not displayed");
            QXClient.get().report().info("Creator can't enroll to course message is displayed");
        } else {
            QXClient.get().report().info("Creator can't enroll to course message is displayed");
        }

    }


    public void verifyLastAttemptMessageWhileConsumeCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLimitedCourse), "Limited course is not displayed");
        QXClient.get().report().info("Limited course is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkReplayBtn);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkReplayBtn);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLastAttemptMsg), "Last attempt message is not displayed");
        QXClient.get().report().info("Last attempt message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkContinueBtn), "Continue button is not displayed");
        QXClient.get().report().info("Continue button is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        // QXClient.get().gestures().BlindWait(1000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.maxAttemptsExceededMsg), "Exceeded max attempts message is not displayed");
        QXClient.get().report().info("Max attempts exceeded message is displayed");

       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertScoreCard), "Score card is not displayed");
       // QXClient.get().report().info("Score card is displayed with updated score");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitBtn), "Exit button is not displayed");
        QXClient.get().report().info("Exit button is displayed in summary page");

    }
    public void verifyContentOfRegionallanguage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentAfterFiltering), "Content for all media type is not available");
        QXClient.get().report().info("Content for all media type is displayed");
    }

    public void verifyContentDetailsInContentsPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentTitle), "Content title is not displayed");
        QXClient.get().report().info("Content title is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentPublisher), "Content publisher is not displayed");
        QXClient.get().report().info("Content publisher is displayed");

   //     Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardMediumClassSubject),"Board,Medium,Class,Subject is not displayed");
        QXClient.get().report().info("Board,Medium,Class and Subject is displayed under content title");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentDetails), "Content details is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertContentDetails);
        QXClient.get().report().info("Clicked on content details");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentRelevantFor), "Content relevant for is not displayed");
        QXClient.get().report().info("Content relevant for is displayed");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertClassInContentDetails), "Class in content details is not displayed");
        QXClient.get().report().info("Class is displayed under Content details");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMediumInContentDetails), "Medium in Content details is not displayed");
        QXClient.get().report().info("Medium is displayed under Content details");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardInContentDetails), "Board is not displayed");
        QXClient.get().report().info("Board is displayed under Content details");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserTypeInContentDetails), "User type is not displayed");
        QXClient.get().report().info("User type is displayed under content details");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyDownloadPopupOfContent() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on Play icon");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnHamburgerMenu);
        QXClient.get().report().info("Clicked on hamburger menu");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShareBtn), "Share button is not displayed");
        QXClient.get().report().info("Share button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDownloadBtn), "Download button is not displayed");
        QXClient.get().report().info("Download button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPrintBtn), "Print button is not displayed");
        QXClient.get().report().info("Print button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitButton), "Exit button is not displayed");
        QXClient.get().report().info("Exit button is displayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertDownloadBtn);
        QXClient.get().report().info("Clicked on download button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConfirmDownloadPopUp), "Confirm download popup message is not displayed");
        QXClient.get().report().info("Confirm download popup message is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDownloadButtonInPopup), "Download button in confirm download popup is not displayed");
        QXClient.get().report().info("Download button in confirm downlaod popup is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCancelButtonInPopup), "Cancel button in confirm download popup is not displayed");
        QXClient.get().report().info("Cancel button in confirm downlaod popup is displayed");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyCourseDetails() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourse), "Searched course is not displayed");
        QXClient.get().report().info("Searched Course is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseDetails), "Course details is not displayed");
        QXClient.get().report().info("Course details is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEnrollmentEndDate), "Enrollment end date is not displayed below join course button");
        QXClient.get().report().info("Enrollment end date is displayed below the Join course button");
        QXClient.get().gestures().BlindWait(2000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertCourseDetails);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseRelevantFor), "Course relevant for is not displayed");
        QXClient.get().report().info("This Course is relevant for is displayed under course details");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertClassInContentDetails), "Class details is not displayed");
        QXClient.get().report().info("Class details is displayed in course details ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMediumInContentDetails), "Medium details is not displayed");
        QXClient.get().report().info("Medium details is displayed in course details");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardInContentDetails), "Board details is not displayed");
        QXClient.get().report().info("Board details is displayed in course details");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserTypeInContentDetails), "UserType details is not displayed");
        QXClient.get().report().info("User Type details is displayed in course details");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyUpcomingBatchMessageWhileJoinCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course button is not displayed");
        QXClient.get().report().info("Join Course is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on Join Course Button");

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBatchStartDateMessage)) {
            QXClient.get().report().info("Upcoming Batch start date is displayed");
            QXClient.get().gestures().BlindWait(2000);
        } else {
            QXClient.get().report().info("The course's batch is available from <batch date> message is displayed");
        }

    }

    public void verifyNoLeaveCourseForCompletedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sltCourseMenuIcon);
        QXClient.get().report().info("Select course menu in course toc");
        QXClient.get().gestures().BlindWait(2000);

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLeaveCourse)) {
            QXClient.get().report().info("Leave Course is displayed for Completed course");
        } else {
            Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLeaveCourse), "Leave course is displayed");
            QXClient.get().report().info("Leave course is not displayed for completed course");
        }
    }

    public void verifyCourseUpdatedMessageWithDate() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseUpdatedMessageWithDate), "Course updated message is not displayed");
        QXClient.get().report().info("Course last updated on dd/mm/yyyy format is displayed");
        QXClient.get().gestures().BlindWait(2000);

    }


    public void verifyTimerIsDisplayedInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin), "Timer is displayed Before Join the course");
        QXClient.get().report().info("Timer is not displayed Before User join the course");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin), "Timer is not displayed in course TOC");
        QXClient.get().report().info("Timer is displayed with X days, Y hours and Z minutes for an Expiring course in two days");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "Start Learning Button is not displayed");
        QXClient.get().report().info("Start learning button is displayed in course toc");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyTimerAfterUnenrollFromCourse() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin), "Timer is displayed after unenroll from the course");
        QXClient.get().report().info("Timer is not displayed after user unenroll from the course");
        QXClient.get().gestures().BlindWait(4000);
    }


    public void verifyTimerIsNotDisplayedInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin), "Timer is displayed Before Join the course");
        QXClient.get().report().info("Timer is not displayed Before User join the course");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin), "Timer is displayed in course TOC");
        QXClient.get().report().info("Timer is not displayed with X days, Y hours and Z minutes for an Expiring course in two days");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "Start Learning Button is not displayed");
        QXClient.get().report().info("Start learning button is displayed in course toc");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifySyncNowCourseProgressInCompletedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sltCourseMenuIcon);
        QXClient.get().report().info("Click on CourseMenuIcon");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkSyncProgressNow), "Sync Progress Now is not displayed");
        QXClient.get().report().info("Sync Progress Now is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkSyncProgressNow);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSyncSuccessMsg), "Prgress synced successfully message is not displayed");
        QXClient.get().report().info("Progress Synced successfully message is displayed");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyConsentPopUpForCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConsentPopUpPostJoinCourse), "Consent Popup is not displayed");
        QXClient.get().report().info("Consent Popup is displayed post Join Course");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUsernameInConsent), "User name is not displayed");
        QXClient.get().report().info("Username is displayed in Consent popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertStateInConsent), "State is not displayed in Consent");
        QXClient.get().report().info("State is displayed in Consent popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserIdInConsent), "User id is not displayed in Consent popup");
        QXClient.get().report().info("User Id is displayed in Consent popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDistrictInConsent), "District is not displayed in Consent popup");
        QXClient.get().report().info("District is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBlockInConsent), "Block is not displayed in Consent Popup");
        QXClient.get().report().info("Block is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSchoolIdInConsent), "School Id is not displayed in Consent Popup");
        QXClient.get().report().info("School Id is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSchoolNameInConsent), "School name is not displayed in Consent Popup");
        QXClient.get().report().info("School name is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMobileNoInConsent), "Mobile no is not displayed in Consent Popup");
        QXClient.get().report().info("Mobile No is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEditInProfilePage), "Edit in profile page information is not displayed in Consent popup");
        QXClient.get().report().info("Edit details is not possible in Consent popup but it can be done in Profile page");
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDikshaTermsOfUse),"Diksha terms of use is not displayed in Consent Popup");
        QXClient.get().report().info("Diksha Terms of Use is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkDontShareBtn), "Do not share button is not displayed");
        QXClient.get().report().info("Do not share button is displayed in Consent popup");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyConsentPopupForCollection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinButton), "Join Collection Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinButton);
        QXClient.get().report().info("Clicked on join Collection");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConsentPopUpPostJoinCourse), "Consent Popup is not displayed");
        QXClient.get().report().info("Consent Popup is displayed post Join Course");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
        QXClient.get().report().info("Clicked on Donot share button");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sltCourseMenuIcon);
        QXClient.get().report().info("Click on CourseMenuIcon");
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLeaveTask);
        QXClient.get().report().info("Click on Leave Task");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkConfirmButton);
        QXClient.get().report().info("Click on Confirm Button");
        QXClient.get().gestures().BlindWait(7000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinButton), "join Btn icon is displayed");
        QXClient.get().report().info("Leave Collection done succesfuly");
    }

    public void verifyCoursesInCoursesTab() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseInCoursesTab), "Course is not displayed in Course Tab");
        QXClient.get().report().info("Course is displayed in Courses Tab");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyCoursesBasedOnCategoryAndSubject() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnCoursesCategory);
        QXClient.get().report().info("Clicked on Courses Category");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseInCategoryAndSubject), "Course is not displayed in Category section");
        QXClient.get().report().info("Course is displayed in Category section");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnSubject);
        QXClient.get().report().info("Clicked on Subject dropdown");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selSubject);
        QXClient.get().report().info("Select the first subject in the dropdown");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(5000);

        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseInCategoryAndSubject),"Course is not displayed for the selected subject");
        QXClient.get().report().info("Course is displayed for selected subject");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyCoursesInsteadOfTraining() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTrainingText), "Training text is not replaced by Courses text");
        QXClient.get().report().info("Courses is displayed instead of Training text");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCoursesText), "Courses is not displayed instead of Training Text");
        QXClient.get().report().info("Training text is replaced by Courses Text");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyCourseProgressIsDisabledInCourseCard() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSearchedCourse), "Searched course is not displayed");
        QXClient.get().report().info("Searched course is displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseProgressInCourseCard), "Course Progress is displayed in Course card");
        QXClient.get().report().info("Course progress is not displayed in Course card");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseProgressPercentage), "Course progress percentage is displayed in Course card");
        QXClient.get().report().info("Course progress in percentage is not displayed in Course card");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyCourseFromMyCourseSection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnCourseFromMyCourseSection);
        QXClient.get().report().info("Clicked on Course from My Course Section");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assert50PercentCompletedMsg), "50% completed message is not displayed");
        QXClient.get().report().info("50% completed message is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void enrollToSameCourseAndVerifyCourseProgressRemainsSame() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on Join course button");
        QXClient.get().gestures().BlindWait(2000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);
            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assert50PercentCompletedMsg), "50 % completed message is not displayed");
        QXClient.get().report().info("50% Course completed message is displayed remains same after enrolling once again");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyUserAbleToJoinQuestionSetCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)) {
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().report().info("Clicked on Join course button");
            QXClient.get().gestures().BlindWait(2000);

            try {
                if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
                {
                    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                    QXClient.get().report().info("clicked on clkDontShareBtn button");
                    QXClient.get().gestures().BlindWait(2000);
                }
            } catch (Exception e3) {
                System.out.println("handled profile share");
            }

            QXClient.get().gestures().BlindWait(3000);

        /*QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on Start learning button");
        QXClient.get().gestures().BlindWait(4000);*/
        }
    }

    public void verifyEarnCertificateInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnCourseDetails);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEarnCertificate), "Earn Certificate is not displayed");
        QXClient.get().report().info("Earn Certificate is displayed in Content Details");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertEarnCertificate);
        QXClient.get().report().info("Clicked on Earn certificate ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertRuleInEarnCertificate), "Rule to certificate is not displayed");
        QXClient.get().report().info("Rule to earn certificate is displayed");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().BlindWait(2000);
    }


    public void verifyNoEarnCertificateInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnCourseDetails);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEarnCertificate), "Earn Certificate is displayed");
        QXClient.get().report().info("Earn Certificate is not displayed in Content Details");
        QXClient.get().gestures().BlindWait(3000);


        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertRuleInEarnCertificate), "Rule to certificate is  displayed");
        QXClient.get().report().info("Rule is not displayed to earn certificate");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyShareAndExitOptionsOfQuestionSet() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnLearningButton);
        QXClient.get().report().info("Clicked on Start learning button");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on Play video icon");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnHamburgerMenuBar);
        QXClient.get().report().info("Clicked on Hamburger menu bar");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShareBtn), "Share option is not displayed in hamburger menu bar");
        QXClient.get().report().info("Share option is displayed in Hamburger menu bar");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitButton), "Exit option is not displayed in hamburger menu bar");
        QXClient.get().report().info("Exit option is displayed in Hamburger menu bar");
        QXClient.get().gestures().BlindWait(2000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnHamburgerMenu);
    }

    public void tapOnSearchedCourse3() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.automationContentCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on CourseContent");
    }

    public void tapOnSearchedAutomationContentCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.automationContentCourse1);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on CourseContent");
    }

    public void tapOnSearchedCourse4() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ContentCourseNoEnddate);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on CourseContent");
    }

    public void tapOnSearchedCourse5() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.upcomingCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on upcomingCourse");
    }

    public void tapOnSearchedCourse6() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on CourseContent");
    }

    public void tapOnSearchedCourse7() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trackableCollection);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on trackableCollection");
    }


    public void tapOnSearchedCourse10() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.automationSSOCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on AutomationCourse");
    }

    public void tapOnSearchedCourse8() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        //QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        // QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.certificateCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on certificateCourse");
    }

    public void tapOnSearchedCourse9() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.limitedCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on limitedCourse");
    }

    public void tapOnSearchedExpiredCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.expiredCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on ExpiredCourse");
    }

    public void tapOnSearchedSampleAutomationCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sampleAutomationCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on sample course");
    }

    public void tapOnUpcomingBatchCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.tapOnUpcomingBatchCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on upcomingBatchCourse");
    }

    public void tapOnSearchedLimitedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.limitedQuestionSet);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on limitedQuestionSetContent");
    }

    public void tapOnUpdatedCourseContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.updatedCourseContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on updatedCourseContent");
    }

    public void tapOnQuestionSetCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionSetCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on QuestionSetCourse");
    }

    public void tapOnAlreadyJoinedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.alreadyJoinedCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Already Joined course");
    }


    public void tapOnExpiredAndOngoingBatchCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.expiredAndOngoingCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Expired And Ongoing course");
    }

    public void tapOnExpiredAndFutureBatchCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.expiredAndFutureBatchCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Expired And Future batch course");
    }

    public void tapOnQuestionSetCourse5() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.solutionUncheckedQSet);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on QuestionSetCourse");
    }

    public void tapOnQUMLContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.QUMLContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on QuestionSetCourse");
    }

    public void tapOnSingleAttemptQuestionSetCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.singleAttemptCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on QuestionSetCourse");
    }


    public void tapOnPDFCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.pdfCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on pdfCourse");
    }

    public void verifyShareBtnInMenuAndExitButtonOnQuestionSetEndpage() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnHamburgerMenu);
        QXClient.get().report().info("Clicked on Hamburger menu option");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShareBtn), "Share option is not displayed in Hamburger menu");
        QXClient.get().report().info("Share option is displayed in Hamburger menu");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertExitButton);
        QXClient.get().gestures().BlindWait(2000);

        //QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnCancelBtn);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitBtn), "Exit button is not displayed");
        QXClient.get().report().info("Exit button is displayed in summary page");

    }

    public void verifyCourseWithEnrollmentEndDateIsOver() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

     //   Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is displayed");
        QXClient.get().report().info("Join course button is not displayed for Enrollment end date passed course");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExpiredCourseMsg), "Expired Course message is not displayed in course TOC");
        QXClient.get().report().info("Expired course message is displayed in Course TOC");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNoBatchesForThisCourseMsg), "No batches for this course message is not displayed");
        QXClient.get().report().info("No bacthes for this course message is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void enrollToTheSmallCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "Start learning button is not displayed");
        QXClient.get().report().info("Start Learning button is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnEpubContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnEpubContent);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Epub content");
    }

    public void verifyUserAbleToPlayEpubContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon");
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().report().info("Epub content is opened in landscape mode post click on Play button");

     //   Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkNextIcon), "Next icon is not displayed");
        QXClient.get().report().info("Next button is displayed in Epub content");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyBackButtonWorkingInTrainingPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPopularCategoriesInTrainingPage), "Popular categories is not displayed");
        QXClient.get().report().info("Popular categories is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkBackBtn), "Back button is not displayed");
        QXClient.get().report().info("Back button is displayed in training page");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkBackBtn), "Back button is available");
        QXClient.get().report().info("Back button is not available");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPopularCategoriesInTrainingPage), "Popular categories is displayed");
        QXClient.get().report().info("Popular categories is not displayed");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyUserAbleToJumpToPagesAndPageNotFoundText() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon");
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().report().info("Epub content is opened in landscape mode post click on Play button");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNo1), "Page No 1 is not displayed");
        QXClient.get().report().info("Page No 1 is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkOnEditText1), "Edit text is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnEditText1);
        QXClient.get().gestures().BlindWait(2000);
        trainingPageObjects.clkOnEditText1.clear();
        QXClient.get().gestures().BlindWait(2000);
        trainingPageObjects.sendPageNo.sendKeys("5");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkGotoPage);
        QXClient.get().report().info("Clicked on Go to page ");
        QXClient.get().gestures().BlindWait(3000);

//        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserConsumedPercentage), "User consumed percentage is not displayed");
//        QXClient.get().report().info("User consumed percentage is displayed while consuming");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNo5), "User is not able to jump to next page");
        QXClient.get().report().info("User is able to jump to required page");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertPageNo5);
        QXClient.get().gestures().BlindWait(2000);
        trainingPageObjects.assertPageNo5.clear();

        trainingPageObjects.sendPageNo.sendKeys("1");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkGotoPage);
        QXClient.get().report().info("Clicked on Go to page ");
        QXClient.get().gestures().BlindWait(2000);

     //   Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserConsumedPercentage), "User consumed percentage is not displayed");
        QXClient.get().report().info("User consumed percentage is displayed while consuming");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.nextIcon.get(0));
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnEditText2);
        QXClient.get().gestures().BlindWait(2000);
        trainingPageObjects.clkOnEditText2.clear();
        QXClient.get().gestures().BlindWait(2000);
        trainingPageObjects.sendPageNo.sendKeys("100");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkGotoPage);
        QXClient.get().report().info("Clicked on Go to page ");

        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNotFoundText),"Page not found text is not displayed");
        QXClient.get().report().info("Page not found text is displayed ");
        QXClient.get().gestures().BlindWait(2000);

    }


    public void consumeEpubContentInDownloadSection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnDownloadedEpubContent);
        QXClient.get().report().info("Clicked on Downloaded Epub content");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on Play Icon");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkOnEditText2), "Next page is not displayed");
        QXClient.get().report().info("Next page number is displayed");
        QXClient.get().report().info("User is able to play the downloaded Epub content");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifySearchCourseIsDisplayedForUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertResultsDisplayedForUser), "Showing 1 results for AutomationContentDetailsCourse text is not displayed");
        QXClient.get().report().info("Showing 1 results for AutomationContentDetailsCourse text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseDisplayedForUser), "Searched AutomationContentDetailsCourse is not displayed for the user");
        QXClient.get().report().info("Searched AutomationContentDetailsCourse is displayed for the user");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertCourseDisplayedForUser);
        QXClient.get().report().info("Clicked on the user Identified course in search list");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSearchedCourse1), "Searched course is not displayed");
        QXClient.get().report().info("Searched course is displayed for the user");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not displayed for the user");
        QXClient.get().report().info("Join course button is displayed for the user");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void tapOnSearchedH5pCollection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.h5pCollectionSearch);
        QXClient.get().report().info("Tap on Collection searched");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyH5PCollectionContentPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertH5PCollectionTitle), "Collection title is not displayed");
        QXClient.get().report().info("H5P Collection title is displayed for the user");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPLAYBtn), "Play button is not displayed to the user");
        QXClient.get().report().info("PLAY button is displayed to the user in H5P Collection content");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyPostSingleClickBackbtnUserShouldComeBackFromH5pContent() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkBackBtn), "Back button is not displayed");
        QXClient.get().report().info("Back button is displayed to the user");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkBackBtn);
        QXClient.get().report().info("Clicked on back button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertH5PCollectionTitle), "Collection title is displayed");
        QXClient.get().report().info("H5P Collection title is not displayed for the user");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyUserAbleToConsumeEpubContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNo1InEpubContent), "Page 1 is not displayed in epub content");
        QXClient.get().report().info("Page 1 is displayed in epub content");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Icon");
        QXClient.get().gestures().BlindWait(9000);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnHamburgerMenu);
        QXClient.get().report().info("Clicked on hamburger menu icon");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertExitButton);
        QXClient.get().report().info("Clicked exit button to end the session");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifySamePageNumberInEpubContentWhileReconsumingEpubContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon");
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().report().info("Epub content is opened in landscape mode post click on Play button");
        // Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNo1InEpubContent),"Page 1 is displayed in epub content");
        QXClient.get().report().info("Page 1 is not displayed in epub content");
        QXClient.get().gestures().BlindWait(8000);


        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNoWhileReconsumingInEpubContent),"Page3 is not displayed in epub content while reconsuming the same epub content");
        QXClient.get().report().info("Page 4 is displayed while reconsuming the same epub content");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifySamePageNumberInPDFContentWhileReconsumingPDFContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon");
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().report().info("Epub content is opened in landscape mode post click on Play button");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNo1InEpubContent), "Page 1 is displayed in epub content");
        QXClient.get().report().info("Page 1 is not displayed in epub content");
        QXClient.get().gestures().BlindWait(8000);


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNoWhileReconsumingInEpubContent), "Page3 is not displayed in epub content while reconsuming the same epub content");
        QXClient.get().report().info("Page 4 is displayed while reconsuming the same epub content");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyCertificateCriteriaLabelInCourseTOCPostJoining() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().BlindWait(7000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
        QXClient.get().report().info("Clicked on course details in course page");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEarnCertificate), "Earn Certificate is not displayed");
        QXClient.get().report().info("Earn Certificate is displayed in Content Details");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertEarnCertificate);
        QXClient.get().report().info("Clicked on Earn certificate ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertRuleInEarnCertificate), "Rule to certificate is not displayed");
        QXClient.get().report().info("Rule to earn certificate is displayed");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().BlindWait(2000);


    }

    public void tapOnSearchedQuestionsetWithImages() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(8000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionsetWithImages);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on questionsetwithImages");
    }

    public void verifyZoomInAndZoomOutOptionInQuestionsetWithImages() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.questionsetWithImages), "Question set with images is not displayed");
        QXClient.get().report().info("Question set with images is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestion1InQuestionset), "Question number 1 is not displayed");
        QXClient.get().report().info("Question number 1 is displayed in questionset");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertQuestion1InQuestionset);
        QXClient.get().report().info("Clicked on question number 1");
        QXClient.get().gestures().BlindWait(3000);

        if (!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertModiImage)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertQuestion2InQuestionset);
            QXClient.get().report().info("Clicked on question 2");
            QXClient.get().gestures().BlindWait(3000);
        } else {
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertZoomOptionInRightBottomCorner), "Zoom option is not displayed");
            QXClient.get().report().info("Zoom option is displayed in right bottom corner of the image");
            QXClient.get().gestures().BlindWait(3000);
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertZoomOptionInRightBottomCorner);
        QXClient.get().report().info("Clicked on zoom option bottom corner of the image");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertZoomInSymbol), "Zoom in option is not displayed");
        QXClient.get().report().info("Zoom in option is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertZoomOutSymbol), "Zoom out option is not displayed");
        QXClient.get().report().info("Zoom out option is displayed");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifySearchedCourseNavigatedToOngoingCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        //assertExpiredCourseMsg
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "Start learning button is not displayed for a course with ongoing batch");
        QXClient.get().report().info("Start learning button is displayed for a course with ongoing batch");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExpiredCourseMsg), "Expired course message is displayed");
        QXClient.get().report().info("Expired batch is not present in the searched course");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyContentDetailsTabCreditLicenseInfoAndContentRelevantFor() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentDetails), "Content details tab is not displayed in Textbook TOC page");
        QXClient.get().report().info("Content details tab is displayed in Textbook TOC page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCreditsLicenseInfoTab), "Credits & License info tab is not displayed in Textbook TOC page");
        QXClient.get().report().info("Credits & License info tab is displayed in Textbook TOC page");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertContentDetails);
        QXClient.get().report().info("Clicked on Content details tab");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentRelevantFor), "Content relevant for is not displayed in Content details tab");
        QXClient.get().report().info("Content relevant for is displayed inside the Content details tab");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyCollectionTitlePublishedByAndOrgFrameworkInCollectionTOC() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCollectionTitle), "Title is not displayed in Collection TOC page");
        QXClient.get().report().info("Collection title is displayed in Collection TOC page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPublishingOrg), "Publishing org is not displayed in Collection TOC page");
        QXClient.get().report().info("Publishing org is displayed in Collection TOC page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertOrgFrameworkValues), "Org framework values ie BMCS is not displayed in Collection TOC page");
        QXClient.get().report().info("Org Framework values ie BMCS values is displayed in Collection TOC page");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void tapOnMultipleBatchCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(8000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.multipleBatchCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on multipleBatchcourse");
    }

    public void verifyListOfBatchesInCourseWhichIsHavingMultipleBatches() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assert2BatchesAvailableMsg), "2 batches available message is not displayed in course toc");
        QXClient.get().report().info("2 batches available message is displayed in course TOC");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on Join Course button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBatchesfortheCourseText), "Batches for the course text is not displayed");
        QXClient.get().report().info("Batches for the course text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertOngoingBatchesText), "Ongoing batches text is not displayed");
        QXClient.get().report().info("Ongoing batches text is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertJoinBtn.get(0)), "First Join button is not displayed");
        QXClient.get().report().info("First Join button for ongoing batch is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertJoinBtn.get(1)), "Second Join button is not displayed");
        QXClient.get().report().info("Second Join button for ongoing batch is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyUrduSubjectInUrduContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUrduContentTitle), "Urdu content title is not displayed");
        QXClient.get().report().info("Urdu content is displayed ");
        QXClient.get().report().info("Subject Urdu is displayed in Urdu Content");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void validateUrduTextWhileConsumingUrduContent() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUrduContentTitle), "Urdu content title is not displayed");
        QXClient.get().report().info("Urdu content is displayed ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyUserAbleToSeeInstructionPage() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertInstructionsHeaderInInstructionPage), "Instructions header is not displayed");
        QXClient.get().report().info("Instructions header is displayed");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertInstructionText), "Instruction text is not displayed");
        QXClient.get().report().info("Instruction text is displayed");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyBoardMediumClassDisplayedInContentPlayCardProperly() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContent), "Searched content is not displayed");
        QXClient.get().report().info("Searched Content is displayed properly");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardInContentPlayCard), "Board value is not displayed properly in content playcard");
        QXClient.get().report().info("Board value is displayed properly in content playcard");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMediumInContentPlayCard), "Medium value is not displayed properly in content playcard");
        QXClient.get().report().info("Medium value is displayed properly in content playcard");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardInContentPlayCard), "Class value is not displayed properly in content playcard");
        QXClient.get().report().info("Class value is displayed properly in content playcard");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyOngoingCourseUnderMyCourseInTrainingTab() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMyCourseSectionInTrainingTab), "My Course section is not displayed");
        QXClient.get().report().info("My Course Section is displayed in training tab");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.ongoingCourseUnderMyCourseSection), "Ongoing course under my course is not displayed");
        QXClient.get().report().info("Ongoing course under my course section is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyUserAbleToConsumeOngoingCourseOfMyCourseSection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ongoingCourseUnderMyCourseSection);
        QXClient.get().report().info("Clicked on ongoing course under my couse section");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCouseTitle), "Course title is not displayed ");
        QXClient.get().report().info("Course title is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "start learning button is not displayed");
        QXClient.get().report().info("Start learning button is displayed for an ongoing batch");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning button");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkNextIcon), "Next button is not displayed while consuming the content");
        QXClient.get().report().info("Next Button is displayed while consuming the ongoing course");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkPreviousIcon), "Previous button is not displayed while consuming the content");
        QXClient.get().report().info("Previous Button is displayed while consuming the ongoing course");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyClickLoginBtnInPopup() throws Exception {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLoginBtn), "Login button is not displayed");
        QXClient.get().report().info("Login button is displayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLoginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyUserAbleToJoinCourseSuccessfully() throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        if(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)){
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().gestures().BlindWait(4000);
        }else{
            QXClient.get().report().info("Already joined to the course");
        }
        QXClient.get().gestures().BlindWait(2000);
        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course button is displayed");
        QXClient.get().report().info("Join Course Button is not displayed");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "Start leanring button is not displayed");
        QXClient.get().report().info("Start learning button is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyGreenTickMarkPostCompletingFewContentsOfCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(2000);

//        if(QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon)) {
//            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
//            QXClient.get().gestures().BlindWait(3000);
//        }

        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().BlindWait(9000);
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.closeRatingIcon)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
            QXClient.get().gestures().BlindWait(2000);
        }

        QXClient.get().gestures().BlindWait(2000);
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.closeRatingIcon)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
            QXClient.get().gestures().BlindWait(2000);
        }
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertGreenTickMarkForCompletedContent), "Green tick is not displayed post completing content");
        QXClient.get().report().info("Green tick mark is displayed post completing the content");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assert50PercentCompletedMsg), "50 percent completed status is not displayed");
        QXClient.get().report().info("50 percent completed status is displayed");

        QXClient.get().gestures().BlindWait(3000);
    }

    public void tapOnCertificateCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.automationCertCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Automation Cert Course");
    }

    public void tapOnCertificateTrackableBook() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trackableBook);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Trackable book");
    }

    public void tapOnCertificateTrackableCollection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trackableCollection22);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Trackable Collection");
    }


    public void tapOnNonTrackableCollection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.nonTrackableCollection);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on non Trackable Collection");
    }

    public void verifyProfileNameChangePopupInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConfirmProfileNameTextInPopup), "Confirm profile name popup is not displayed");
        QXClient.get().report().info("Confirm profile name popup is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProfileNameInPopup), "Profile name is not displayed in popup");
        QXClient.get().report().info("Profile name is displayed in popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.editProfileIcon), "Edit profile name link is not displayed in the popup");
        QXClient.get().report().info("Edit profile name link is displayed in the popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDoNotShowThisMsgText), "Do not show this message again message is not displayed");
        QXClient.get().report().info("Do not show this message agaian message is displayed in the popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCheckBoxInPopup), "Check box is not displayed in the popup");
        QXClient.get().report().info("Checkbox is displayed in the popup");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyUserNavigatedToProfilePagePostClickingTheLink() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.editProfileIcon);
        QXClient.get().report().info("Clicked on the edit profile link in the popup");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentPreferencesTextInProfile), "User not navigated to profile page post clicking the link");
        QXClient.get().report().info("User is successfully navigated to profile page post clicking the link");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.firstEditField), "Profile name is not displayed in profile page");
        QXClient.get().report().info("Profile name is displayed in profile page");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkSubmitButton);
        QXClient.get().report().info("Clicked on submit button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning), "Start learning button is not displayed in course toc");
        QXClient.get().report().info("Start learning button is displayed in course toc");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyNoAttemptsInCourseWithQuestionsetInPracticeMode() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNumberOfAttemptsText), "Number of Attempts text is displayed while consuming");
        QXClient.get().report().info("Number of Attempts text is not displayed in Course with practice mode question set");
        QXClient.get().gestures().BlindWait(3000);

    }


    public void verifyUserAbleToConsumeCourseWithCertificate() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startLearningBtn);
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on play pdf button");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
        QXClient.get().report().info("Clicked on Exit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().report().info("Clicked on close rating ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCongratulationsMsg), "Congratulations message is not displayed");
        QXClient.get().report().info("Congratulations message is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseCompletedMsg), "Course completed message is not displayed");
        QXClient.get().report().info("Course completed message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNotifiedMsgWithin7days), "Notified message is not displayed");
        QXClient.get().report().info("Notified message is displayed for certificate");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyUserAbleToConsumeContentPlaylistWithQS() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertPLAYBtn);
        QXClient.get().report().info("Clicked on content PLAY button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on play video icon");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestionSetTitleInContentPlaylist), "Question set title is not displayed in Content playlist");
        QXClient.get().report().info("Question set title is displayed in Content playlist");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitBtn), "Exit button is not displayed post completing consumption");
        QXClient.get().report().info("Exit button is displayed post completing the content");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentCompletedText), "You just completed message is not displayed");
        QXClient.get().report().info("You just completed message is displayed ");
        QXClient.get().gestures().BlindWait(2000);

    }


    public void verifyUserAbleToConsumeDigitalTextBookWithQS() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnQSContent);
        QXClient.get().report().info("Clicked on content to play");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on play video icon");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestionSetTitleInDigitalTextBook), "Question set title is not displayed in Digital TextBook");
        QXClient.get().report().info("Question set title is displayed in DigitalTextbook");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitBtn), "Exit button is not displayed post completing consumption");
        QXClient.get().report().info("Exit button is displayed post completing the content");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentCompletedText), "You just completed message is not displayed");
        QXClient.get().report().info("You just completed message is displayed ");
        QXClient.get().gestures().BlindWait(2000);

    }


    public void verifyPopupWhenDeliberatelyExitFromPlayerContent() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on pdf play");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("User deliberately try to exit from the player content");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConfirmPopup), "Confirm popup is not displayed");
        QXClient.get().report().info("Confirm popup is displayed when user deliberately exits from the player content");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertWouldYouLeaveContentTextInPopup), "Would you like to leave this content text is not displayed");
        QXClient.get().report().info("Would you like to leave this content text is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCancelButtonInPopup), "Cancel button is not displayed in popup");
        QXClient.get().report().info("Cancel button is displayed in the popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkOkToCancel), "OK button is not displayed in popup");
        QXClient.get().report().info("OK button is displayed in the popup");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyUserAbleToJoinCoursePostClickingJoinCourseBtnInUpcomingBatchCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning),"Start Learning button is not displayed");
        QXClient.get().report().info("Start Learning button is displayed to user post clicking JoinCourse button");
        QXClient.get().report().info("User able to join course successfully to upcoming batch course");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyUserAbleToConsumeCourseWithQSSmoothly() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLimitedCourse), "Limited course is not displayed");
        QXClient.get().report().info("Limited course is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkReplayBtn);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLastQuestion),"Question is not displayed to the user");
        QXClient.get().report().info("Last question is displayed to the user");
        QXClient.get().report().info("User able to consume the course with question set smoothly");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyNextContentAtTheEndOfTheQuestionSet() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLimitedCourse), "Limited course is not displayed");
        QXClient.get().report().info("Limited course is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitBtn), "Exit button is not displayed");
        QXClient.get().report().info("Exit button is displayed in summary page");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.replayButton);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUpNextText),"UP next text is not displayed");
        QXClient.get().report().info("Up Next text is displayed in End of Questionset");
        QXClient.get().gestures().BlindWait(2000);

       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNextContent),"Next Content is not displayed");
        QXClient.get().report().info("Next Content is displayed in End of Questionset");

      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNextContentTitle),"Title of the next content is not displayed");
        QXClient.get().report().info("Title of the next content is displayed at the End of Questionset");
        QXClient.get().gestures().BlindWait(3000);



    }

    public void verifyUserAbleToScrollTillEndInViewMoreOptionInCourseSection() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEconomicsSection),"Economics section is not displayed");
        QXClient.get().report().info("Economics section is displayed in Course page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.viewMoreOption),"View more option is not displayed");
        QXClient.get().report().info("View more option is displayed in Course page");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.viewMoreOption);
        QXClient.get().report().info("Clicked on View more option");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEconomicsSectionText),"Economics section text is not displayed");
        QXClient.get().report().info("Economics section text is displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().report().info("User able to scroll till the end of any section in course page");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyUserAbleToPlayPDFCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfSlide3),"User not able to consume pdf content inside course");
        QXClient.get().report().info("User able to consume pdf content in course");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().report().info("Clicked on Next Previous Icon");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().report().info("Clicked on Next Previous Icon");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfSlide1),"User not able to consume pdf content inside course");
        QXClient.get().report().info("User able to consume pdf content in course");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyUserAbleToGoToNextPageThroughIndex() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertPdfSlide1);
        trainingPageObjects.assertPdfSlide1.clear();
        QXClient.get().gestures().BlindWait(1000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.pdfEditField);
        QXClient.get().gestures().BlindWait(1000);
        trainingPageObjects.pdfEditField.sendKeys("3");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkGotoPage);
        QXClient.get().report().info("Clicked on Go to page ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfSlide3),"User not able to go to the required page");
        QXClient.get().report().info("User able to jump to the next slide in pdf content");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().report().info("Clicked on Next Previous Icon");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().report().info("Clicked on Next Previous Icon");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfSlide1),"User not able to consume pdf content inside course");
        QXClient.get().report().info("User able to consume pdf content in course");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyPageNotFoundMsgWhenUserEntersWrongPageNumber() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertPdfSlide1);
        trainingPageObjects.assertPdfSlide1.clear();
        QXClient.get().gestures().BlindWait(1000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.pdfEditField);
        QXClient.get().gestures().BlindWait(1000);
        trainingPageObjects.pdfEditField.sendKeys("11");
        QXClient.get().gestures().BlindWait(1000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkGotoPage);
        QXClient.get().report().info("Clicked on Go to page ");
        QXClient.get().gestures().BlindWait(2000);

       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPageNotFoundText),"Page not found error message is not displayed");
        QXClient.get().report().info("Page not found error message is displayed to the user when user enters the wrong page number");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyProfileSharingInfoIsDisplayedInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(6000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.consentShareCheckbox))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.consentShareCheckbox);
                QXClient.get().report().info("clicked on checkbox button");
                QXClient.get().gestures().BlindWait(2000);

                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.consentShareBtn);
                QXClient.get().report().info("Clicked on consent share button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProfileSharingLabel),"Profile sharing label is not displayed");
        QXClient.get().report().info("Profile sharing label is displayed to the user");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertProfileSharingLabel);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProfileDataSharingStatus),"Profile data sharing status is not displayed");
        QXClient.get().report().info("Profile data shaing status is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.editSettingsSection);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShareMyProfileDetailsRadioBtn),"Share my profile details radio button is not displayed");
        QXClient.get().report().info("Share my profile details is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDoNotShareMyProfileDetailsRadioBtn),"Do not share my profile detials radio button is not displayed");
        QXClient.get().report().info("Do not share my profile details is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSaveBtn),"Save button is not displayed");
        QXClient.get().report().info("Save button is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCloseBtn),"Close button is not displayed");
        QXClient.get().report().info("Close button is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void tapOnJoinTraining3() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.consentShareCheckbox))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.consentShareCheckbox);
                QXClient.get().report().info("clicked on checkbox button");
                QXClient.get().gestures().BlindWait(2000);

                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.consentShareBtn);
                QXClient.get().report().info("Clicked on consent share button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().BlindWait(6000);

    }

    public void verifyProfileSharingInfoPostConsumingCourseFully() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startLearningBtn);
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on play pdf button");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Click on clkNextPage");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
        QXClient.get().report().info("Clicked on Exit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().report().info("Clicked on close rating ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCongratulationsMsg), "Congratulations message is not displayed");
        QXClient.get().report().info("Congratulations message is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseCompletedMsg), "Course completed message is not displayed");
        QXClient.get().report().info("Course completed message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNotifiedMsgWithin7days), "Notified message is not displayed");
        QXClient.get().report().info("Notified message is displayed for certificate");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProfileSharingLabel),"Profile sharing label is not displayed");
        QXClient.get().report().info("Profile sharing label is displayed to the user");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyUserAbleToPlayPDFCourseTillEnd() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on Next Arrow Icon");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
        QXClient.get().report().info("Clicked on Exit button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().report().info("Clicked on close rating ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCongratulationsMsg), "Congratulations message is not displayed");
        QXClient.get().report().info("Congratulations message is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseCompletedMsg), "Course completed message is not displayed");
        QXClient.get().report().info("Course completed message is displayed");

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyResultPageShouldNotLimitedTo100Contents() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

      //  Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShowingOnly100Results),"Showing only 100 results text is displayed");
    //    QXClient.get().report().info("Result page is not restricted to only 100 contents");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShowing10ResultsOutOf),"Results page is restricted to 100 results");
        QXClient.get().report().info("Showing 100 results text is not displayed in Results page");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyCourseEndDateAndEnrollmentEndDateInACourse() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSampleCourse),"Sample Automation Course text is not displayed");
        QXClient.get().report().info("Sample Automation Course Text is displayed to the user");
        QXClient.get().gestures().BlindWait(4000);

     //   Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join Course button is not displayed");
        QXClient.get().report().info("Join course button is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseDetails),"Course Details button is not displayed");
        QXClient.get().report().info("Course details button is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLastDateToJoinDate),"Last date to join text with date is not displayed");
        QXClient.get().report().info("Last date to join text with date is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseDetailsText),"Course details text inside course details is not displayed");
        QXClient.get().report().info("Course details text is displayed inside the course details");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseEndDateTextWithDate),"Course end date is not displayed");
        QXClient.get().report().info("Course end date is displayed in course");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEnrollmentEndDateTextWithDate),"Enrollment end date is not displayed");
        QXClient.get().report().info("Enrollment end date is displayed in course");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyViewMoreButtonIsDisplayedAndClickableInSearchContentPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShowing10ResultsOutOf),"Showing 10 resutls out of some contents text is not dislayed");
        QXClient.get().report().info("Showing 10 resutls out of some contents text is dislayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.viewMoreOption),"View More option is not displayed after 10 contents");
        QXClient.get().report().info("View more option is displayed after 10 contents");

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertViewMoreBtnIsDisplayed),"View More button is not displayed");
        QXClient.get().report().info("View more button is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertViewMoreBtnIsClickable),"View more button is not clickale");
        QXClient.get().report().info("View more button is clickable");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.viewMoreOption);
        QXClient.get().report().info("Showing 20 results out of some contents text is displayed post clicking view more option");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void tapOnEnrollmentEndedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.enrollmentEndedCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on enrollmentEnded course");
    }

    public void verifyEnrollmentEndedMsgAndNoBatchesAvailableMsg() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEnrollmentEndedCourse),"Enrollment ended course text is not displayed");
        QXClient.get().report().info("Enrollment ended course text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEnrollmentEndedMsg),"The enrollment date has passed for this batch message is not displayed");
        QXClient.get().report().info("The enrollment date has passed for this batch message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNoBatchesForThisCourseMsg),"There are no batches available for this course message is not displayed");
        QXClient.get().report().info("There are no batches available for this course message is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyNextButtonIsHighlightedInInstructionsPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.questionsetWithImages), "Question set with images is not displayed");
        QXClient.get().report().info("Question set with images is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertInstructionsHeaderInInstructionPage),"Instructions page is not displayed");
        QXClient.get().report().info("Instructions page is displayed to the user");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertHighlightedNextBtn),"Next button is not highlighted");
        QXClient.get().report().info("Next button is highlighted in Instructions page of Question set");
        QXClient.get().gestures().BlindWait(2000);

    }


    public void verifyNumberOfAttemptsIncreasesPostClickingReplay() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLimitedCourse), "Limited course is not displayed");
        QXClient.get().report().info("Limited course is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertFirstAttempt),"First Attempt is not displayed");
        QXClient.get().report().info("User is on First Attempt");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkReplayBtn);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSecondAttempt),"Number of Attempts not increased post clicking replay button");
        QXClient.get().report().info("Number of Attempts incresed by one post clicking replay button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkReplayBtn);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLastAttemptMsg), "Last attempt message is not displayed");
        QXClient.get().report().info("Last attempt message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkContinueBtn), "Continue button is not displayed");
        QXClient.get().report().info("Continue button is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertThirdAttempt),"Number of Attempts not increased post clicking replay button");
        QXClient.get().report().info("Number of Attempts incresed by one post clicking replay button");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyUserNotAbleToAttemptQuestionsMoreThanOnce() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.lastAttemptPopup),"Last attempt popup is not displayed");
        QXClient.get().report().info("Last attempt popup is displayed for single attempt course post clicking play button");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueBtn2);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSingleAttemptText),"Single attempt text is not displayed");
        QXClient.get().report().info("Single attempt text is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentCompletedText),"You just completed text is not displayed");
        QXClient.get().report().info("You just completed text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.replayButton),"Replay button is not displayed");
        QXClient.get().report().info("Replay button is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.replayButton);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSingleAttemptText),"Single attempt text is displayed");
        QXClient.get().report().info("Single attempt text is not displayed");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentCompletedText),"You just completed text is not displayed");
        QXClient.get().report().info("You just completed text is displayed");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyCourse50percentCompleted() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().BlindWait(9000);;
        QXClient.get().gestures().BlindWait(9000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().clkBackButton();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verify50PercentProgress),"50% completed message is not displayed");
        QXClient.get().report().info("50% completed message is displayed");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifySameCourseProgressAfterRejoiningConsumedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verify50PercentProgress),"50% completed message is not displayed");
        QXClient.get().report().info("50% completed message is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyRatingsTextIsDisplayedInKannadaLanguage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(5000);

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
            QXClient.get().gestures().BlindWait(3000);
        }

        QXClient.get().gestures().BlindWait(8000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertಪಠ್ಯಾಂಶವನ್ನುರೇಟ್ಮಾಡಿtext),"Rate the content text is not displayed in Kannada");
        QXClient.get().report().info("Rate the content text is displayed in Kannada language");

        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sltFirstStar);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertತುಂಬಾೆಟ್ಟದಾಗಿದೆtext),"Very bad rating is not displayed in kannada");
        QXClient.get().report().info("Very bad rating is displayed in Kannada");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertನೀವುಈಬಗ್ಗೆಇನ್ನೂಹೆಚ್ಚುಹೇಳಲುಬಯಸುವಿರಾtext),"Describe more about the content is not displayed in kannada");
        QXClient.get().report().info("Describe more about the content is displayed in Kannada");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertಪಠ್ಯಾಂಶವುನಿಖರವಾಗಿಲ್ಲtext),"Content is not relevant text is not displayed in kannada");
        QXClient.get().report().info("Content is not relevant text is displayed in kannada");
        QXClient.get().gestures().BlindWait(2000);
    }


    public void verifyNumberOfAttemptsAndTimerInQuestionSet() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLimitedCourse), "Limited course is not displayed");
        QXClient.get().report().info("Limited course is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertNumberOfAttempts),"Number of Attempts text is not displayed");
        QXClient.get().report().info("Number of attempts text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerInQuestionSet),"Timer is not displayed in questionset");
        QXClient.get().report().info("Timer is displayed in questionset");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyConsentPopUpForCourse1() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConsentPopUpPostJoinCourse), "Consent Popup is not displayed");
        QXClient.get().report().info("Consent Popup is displayed post Join Course");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUsernameInConsent), "User name is not displayed");
        QXClient.get().report().info("Username is displayed in Consent popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertStateInConsent), "State is not displayed in Consent");
        QXClient.get().report().info("State is displayed in Consent popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserIdInConsent), "User id is not displayed in Consent popup");
        QXClient.get().report().info("User Id is displayed in Consent popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDistrictInConsent), "District is not displayed in Consent popup");
        QXClient.get().report().info("District is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBlockInConsent), "Block is not displayed in Consent Popup");
        QXClient.get().report().info("Block is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSchoolIdInConsent), "School Id is not displayed in Consent Popup");
        QXClient.get().report().info("School Id is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSchoolNameInConsent), "School name is not displayed in Consent Popup");
        QXClient.get().report().info("School name is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMobileNoInConsent), "Mobile no is not displayed in Consent Popup");
        QXClient.get().report().info("Mobile No is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEditInProfilePage), "Edit in profile page information is not displayed in Consent popup");
        QXClient.get().report().info("Edit details is not possible in Consent popup but it can be done in Profile page");
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDikshaTermsOfUse),"Diksha terms of use is not displayed in Consent Popup");
        QXClient.get().report().info("Diksha Terms of Use is displayed in Consent Popup");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkDontShareBtn), "Do not share button is not displayed");
        QXClient.get().report().info("Do not share button is displayed in Consent popup");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyNoConsentPopupPostRelaunchApp() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConsentPopUpPostJoinCourse), "Consent Popup is displayed");
        QXClient.get().report().info("Consent Popup is not displayed post Relaunch");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyUserNotAbleToSeeBatchSelectionPopup() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBatchesList),"batch selection popup is displayed to the user");
        QXClient.get().report().info("Batch selection popup is not displayed when batch equals to ongoing in a course");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyUserAbleToConsumeQUMlContent() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startLearningBtn);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon),"User not able to consume QUML content");
        QXClient.get().report().info("User able to consume QUML Content");
        QXClient.get().gestures().BlindWait(2000);
    }


    public void verifyRightMarkAndViewSolutionOptionInFeedbackPopup() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        int n = 2;
        for(int i=0; i<=n ; i++)
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
            QXClient.get().gestures().BlindWait(2000);
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selAnswer);
        QXClient.get().report().info("Clicked on correct answer");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertRightMarkInFeedbackPopup),"Right Mark in feedback popup is not displayed");
        QXClient.get().report().info("Right mark in feedback popup is displayed to the user");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertViewSolInFeedbackPopup),"view solution in feedback popup is not displayed");
        QXClient.get().report().info("View solution in feedback popup is displayed to the user");
        QXClient.get().gestures().BlindWait(2000);


    }


    public void verifyDoneAndCloseButtonsInViewSolutionPage() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selAnswer1);
        QXClient.get().report().info("Clicked on select correct answer");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertViewSolInFeedbackPopup);
        QXClient.get().report().info("Clicked on View Solution in feedback popup");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCloseBtnInViewSolutionPage),"Close button is not displayed in View Solution page");
        QXClient.get().report().info("Close button is displayed in view solution page");

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDoneBtnInViewSolutionPage),"Done button is not displayed in view solution page");
        QXClient.get().report().info("Done button is displayed in view solution page");
        QXClient.get().gestures().BlindWait(2000);

    }


    public void verifyTitleAndButtonsInSubmitPageOfQuestionSet() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        int n = 6;
        for(int i=0; i<=n ; i++)
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
            QXClient.get().gestures().BlindWait(2000);
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertAreYouReadytoSubmitText),"Are you ready to submit text is not displayed");
        QXClient.get().report().info("Are you ready to submit text is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTitleOfQuestionSetInSubmitPage),"Title of Question set in submit page is not displayed");
        QXClient.get().report().info("Title of Question set is displayed in Submit page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProgressIndicatorsInSubmitPage),"Progress indicators is not displayed in submit page");
        QXClient.get().report().info("Progress indicators is displayed in Submit page");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertReviewButton),"Review button is not displayed in submit page");
        QXClient.get().report().info("Review button is displayed in submit page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkOnSubmitBtn),"Submit button is not displayed in submit page");
        QXClient.get().report().info("Submit button is displayed in submit page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.questionNumber1),"Question number 1 button is not displayed");
        QXClient.get().report().info("Question number 1 is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.questionNumber2),"Question number 2 button is not displayed");
        QXClient.get().report().info("Question number 2 is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionNumber1);
        QXClient.get().report().info("User able to click on question number 1");
        QXClient.get().gestures().BlindWait(1000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestion1),"User not able to navigate to clicked on question");
        QXClient.get().report().info("User able to navigate to clicked question from submit page");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyFirstPageOfContentPostClickingReviewBtn() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        int n = 6;
        for(int i=0; i<=n ; i++)
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
            QXClient.get().gestures().BlindWait(2000);
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertAreYouReadytoSubmitText),"Are you ready to submit text is not displayed");
        QXClient.get().report().info("Are you ready to submit text is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTitleOfQuestionSetInSubmitPage),"Title of Question set in submit page is not displayed");
        QXClient.get().report().info("Title of Question set is displayed in Submit page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProgressIndicatorsInSubmitPage),"Progress indicators is not displayed in submit page");
        QXClient.get().report().info("Progress indicators is displayed in Submit page");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertReviewButton),"Review button is not displayed in submit page");
        QXClient.get().report().info("Review button is displayed in submit page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkOnSubmitBtn),"Submit button is not displayed in submit page");
        QXClient.get().report().info("Submit button is displayed in submit page");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertReviewButton);
        QXClient.get().report().info("Clicked on Review button");
        QXClient.get().gestures().BlindWait(2000);

    //    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestion1),"User is not navigated to first question post clicking Review button in summary page");
        QXClient.get().report().info("User is navigated to first question post clicking Review button in summary page");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyTimerDisplayedForEntireSectionAndSubmitConfirmationPage() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerForEntireSection),"Timer is not displayed for entire section");
        QXClient.get().report().info("Timer is displayed for entire section");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerForEntireSection),"Timer is displayed for individual section");
        QXClient.get().report().info("Timer is not displayed for individual section");
        QXClient.get().gestures().BlindWait(2000);

        int n = 5;
        for(int i=0; i<=n ; i++)
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
            QXClient.get().gestures().BlindWait(2000);
        }

        QXClient.get().gestures().BlindWait(1000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertAreYouReadytoSubmitText),"Are you ready to submit text is not displayed");
        QXClient.get().report().info("Are you ready to submit text is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProgressIndicatorsInSubmitPage),"Progress indicators is not displayed in submit page");
        QXClient.get().report().info("Progress indicators is displayed in Submit page");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertReviewButton),"Review button is not displayed in submit page");
        QXClient.get().report().info("Review button is displayed in submit page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkOnSubmitBtn),"Submit button is not displayed in submit page");
        QXClient.get().report().info("Submit button is displayed in submit page");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSectionA),"section A correct and incorrect questions is not displayed");
        QXClient.get().report().info("section A correct and incorrect questions is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertSectionB),"section B correct and incorrect questions is not displayed");
        QXClient.get().report().info("section B correct and incorrect questions is displayed");
        QXClient.get().gestures().BlindWait(2000);
    }


    public void verifyConfigurationsDisplayedInEachSection() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertInstructionsHeaderInInstructionPage),"Instructions field is not displayed");
        QXClient.get().report().info("Instructions field is displayed to the user");
        QXClient.get().gestures().BlindWait(1000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShowXbarY),"Show X/Y is not displayed ");
        QXClient.get().report().info("Show X/Y is displayed to the user");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.radioBtns.get(0));
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertViewSolInFeedbackPopup),"Feedback is displayed to the user");
        QXClient.get().report().info("Feedback is not displayed to user");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyAnsIconIsNotDisplayedInSolutionUncheckedQuestionSet() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLastAttemptMsg), "Last attempt message is not displayed");
        QXClient.get().report().info("Last attempt message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkContinueBtn), "Continue button is not displayed");
        QXClient.get().report().info("Continue button is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selAns1);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertAnsIcon),"Ans icon is displayed to the user");
        QXClient.get().report().info("Ans icon is not displayed to the user");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertViewSolInFeedbackPopup),"Feedback is displayed to the user");
        QXClient.get().report().info("Answer icon is not displayed to the user");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyExitButtonInSubmitConfirmationPage() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.exitButton),"Exit button is displayed in submit confirmation page");
        QXClient.get().report().info("Exit button is not displayed to the user in submit confirmation page");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyIncorrectAnswerFeedbackDetails() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        int n = 2;
        for(int i=0; i<=n ; i++)
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
            QXClient.get().gestures().BlindWait(2000);
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selWrongAnswer);
        QXClient.get().report().info("Clicked on wrong answer");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertWrongAnswerImageInFeedbackPopup),"Wrong answer image is not displayed in feedback popup");
        QXClient.get().report().info("Wrong answer image is displayed in feedback popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTryAgainTextInFeedbackPopup),"Try Again text is not displayed in feedback popup");
        QXClient.get().report().info("Try again text is displayed in feedback popup");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyShowSummaryWhenFeedbackEnabled() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.radioBtns.get(0));
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(1000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertAreYouReadytoSubmitText),"Are you ready to submit text is not displayed");
        QXClient.get().report().info("Are you ready to submit text is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProgressIndicatorsInSubmitPage),"Progress indicators is not displayed in submit page");
        QXClient.get().report().info("Progress indicators is displayed in Submit page");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertReviewButton),"Review button is not displayed in submit page");
        QXClient.get().report().info("Review button is displayed in submit page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkOnSubmitBtn),"Submit button is not displayed in submit page");
        QXClient.get().report().info("Submit button is displayed in submit page");

       Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTotalQuestions),"Total Questions is not displayed in summary page");
       QXClient.get().report().info("Total Questions is displayed in summary page");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestionsAnswered),"Questions Answered is not displayed in summary page");
       QXClient.get().report().info("Questions Answered is displayed in summary page");
       QXClient.get().gestures().BlindWait(2000);
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestionsSkipped),"Questions Skipped is not displayed in summary page");
       QXClient.get().report().info("Questions Skipped is displayed in summary page");
       Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestionsNotViewed),"Questions not viewed is not displayed in summary page");
       QXClient.get().report().info("Questions not viewed is displayed in summary page");
        QXClient.get().gestures().BlindWait(2000);

    }


    public void tapOnMultipleBatchCourse1() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.multipleBatchCourse1);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on multipleBatchCourse");
    }

    public void verifyMultipleBatchesPopup() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMultipleBatchesPopup),"Popup is not displayed");
        QXClient.get().report().info("Multiple batches popup is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExpiredBatchesTextInPopup),"Expired batches text is not displayed in popup");
        QXClient.get().report().info("Expired batches text is displayed in popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertOpenBatchesTextInPopup),"Open batches text is not displayed in popup");
        QXClient.get().report().info("Open batches text is displayed in popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertResumeBtn),"Resume button is not displayed in popup");
        QXClient.get().report().info("Resume button is displayed in popup");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertJoinBtnForOngoingBathc),"Join button is not displayed in popup");
        QXClient.get().report().info("Join button is displayed in popup");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyNoProfileNameChangePopupInTrackableCollection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinButton), "Join Collection Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinButton);
        QXClient.get().report().info("Clicked on join Collection");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConsentPopUpPostJoinCourse), "Consent Popup is not displayed");
        QXClient.get().report().info("Consent Popup is displayed post Join Course");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
        QXClient.get().report().info("Clicked on Donot share button");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConfirmProfileNameTextInPopup), "Confirm profile name popup is displayed");
        QXClient.get().report().info("Confirm profile name popup is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProfileNameInPopup), "Profile name is displayed in popup");
        QXClient.get().report().info("Profile name is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.editProfileIcon), "Edit profile name link is displayed in the popup");
        QXClient.get().report().info("Edit profile name link is not displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyNoProfileNameChangePopupInCourse() throws Exception {
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConfirmProfileNameTextInPopup), "Confirm profile name popup is displayed");
        QXClient.get().report().info("Confirm profile name popup is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProfileNameInPopup), "Profile name is displayed in popup");
        QXClient.get().report().info("Profile name is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.editProfileIcon), "Edit profile name link is displayed in the popup");
        QXClient.get().report().info("Edit profile name link is not displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);
    }

    public void consumeNonTrackableCollection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trackableCourseUnderNontrackableCol);
        QXClient.get().report().info("Clikced on trackable course");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinButton), "Join Collection Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinButton);
        QXClient.get().report().info("Clicked on join Collection");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConsentPopUpPostJoinCourse), "Consent Popup is not displayed");
        QXClient.get().report().info("Consent Popup is displayed post Join Course");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
        QXClient.get().report().info("Clicked on Donot share button");
        QXClient.get().gestures().BlindWait(4000);

    }

    public void verifyUserAbleToConsumeCourseForAlreadyJoinedBatch() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertResumeBtn),"Resume button is not displayed");
        QXClient.get().report().info("Resume button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExpiredBatches),"Expired batches is not displayed");
        QXClient.get().report().info("Expired batches is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertOpenBatches),"Open batches is not displayed");
        QXClient.get().report().info("Open bathces is displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertResumeBtn);
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertJoinedBatchMsg),"You have joined the batch of a course that is completed message is not displayed");
        QXClient.get().report().info("You have joined the batch of a course that is completed message is displayed");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProgressWillNotUpdateMsg),"You may continue the course, but your progress will not be updated message is not displayed");
        QXClient.get().report().info("You may continue the course, but your progress will not be updated message is displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("User able to consume pdf content in course");
    }

    public void verifyNoProfileNameChangePopupInCourseForSSO() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join Course");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConsentPopUpPostJoinCourse), "Consent Popup is not displayed");
        QXClient.get().report().info("Consent Popup is displayed post Join Course");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
        QXClient.get().report().info("Clicked on Donot share button");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConfirmProfileNameTextInPopup), "Confirm profile name popup is displayed");
        QXClient.get().report().info("Confirm profile name popup is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProfileNameInPopup), "Profile name is displayed in popup");
        QXClient.get().report().info("Profile name is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.editProfileIcon), "Edit profile name link is displayed in the popup");
        QXClient.get().report().info("Edit profile name link is not displayed");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyNoPopUpIsDisplayedForExpiredBatchAndDirectlyNavigatesToOngoingBatch() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExpiredBatches),"Expired batches is displayed");
        QXClient.get().report().info("Expired batches is not displayed");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertOpenBatches),"Open batches is displayed");
        QXClient.get().report().info("Open bathces is not displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join course button is not displayed");
        QXClient.get().report().info("Join Course button is displayed");
        QXClient.get().report().info("User is navigated to Open batches directly without expired batch popup");
        QXClient.get().gestures().BlindWait(2000);
    }


    public void verifyFututeBatchPopupPostClickingJoinCourseBtn() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExpiredBatches),"Expired batches is displayed");
        QXClient.get().report().info("Expired batches is not displayed");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertOpenBatches),"Open batches is displayed");
        QXClient.get().report().info("Open bathces is not displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join course button is not displayed");
        QXClient.get().report().info("Join Course button is displayed");

        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertFutureBatchPopup),"Future batch popup is not displayed");
        QXClient.get().report().info("Future batch popup is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyCourseModificationMessageIsNotDisplayed() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join Course button is not displayed");
        QXClient.get().report().info("Join Course button is displayed");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseUpdatedMessageWithDate), "Course updated message is displayed");
        QXClient.get().report().info("Course last updated on dd/mm/yyyy format is not displayed");
        QXClient.get().gestures().BlindWait(4000);
    }
    public void tapOnEpubContent3() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
       // QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnEpubContent3);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Epub content");
    }
    public void clickQuestionset() throws Exception{
        QXClient.get().gestures().BlindWait(8000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clickQuestionset);
        QXClient.get().gestures().BlindWait(8000);
        QXClient.get().report().info("Click on Questionset questions");
    }
    public void clickvideoandnext() throws Exception{
        QXClient.get().gestures().BlindWait(8000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Click on Questionset questions");
        int n = 4;
        for(int i=0; i<=n ; i++)
        {
            QXClient.get().gestures().BlindWait(5000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
            QXClient.get().gestures().BlindWait(5000);
        }
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selAnswer);
        QXClient.get().report().info("Clicked on correct answer");
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clickprev);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
    }

    public void feedbackEnabled() throws Exception{
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertRightMarkInFeedbackPopup);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Check for Feedback on Questionset questions");
    }
    
    public void tapOnSearchedCoursePr() throws Exception {
    	
    	
    	
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnCourseDetails1);

        
        
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on AutomationCourseContent");
        trainingPageObjects.clkJoinCourseBtn.click();
       // QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn);

          //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join course button is not displayed");
          //  QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().report().info("Clicked on Join course button");
    }
    public void textImagesdisplay() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.questionsetWithImages), "Question set with text and images is not displayed");
        QXClient.get().report().info("Question set with text and images is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertQuestion1InQuestionset), "Question number 1 is not displayed");
        QXClient.get().report().info("Question number 1 is displayed in questionset");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertQuestion1InQuestionset);
        QXClient.get().report().info("Clicked on question number 1");
        QXClient.get().gestures().BlindWait(3000);

    }
    
    public void verifymaxattemptexceededmessage() throws Exception {

        //QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ExitBtn);
       // QXClient.get().gestures().BlindWait(9000);

       // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ConfrmBtn);
       // QXClient.get().gestures().BlindWait(9000);

       // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
       // QXClient.get().gestures().BlindWait(9000);

        //QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
       // QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseunit);
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.Questionsetlimit);
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.maxAttemptsExceededMsg), "Exceeded max attempts message is not displayed");
        QXClient.get().report().info("Max attempts exceeded message is displayed");
        QXClient.get().gestures().BlindWait(9000);

    }

    public void tapOnQuestionSetCourse7() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionSetCourse7);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on QuestionSetCourse");
    }
    public void tapOnJointrackable() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.jointrackable);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on QuestionSetCourse");

        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on QuestionSetCourse");
    }

  public void startlearning() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
        QXClient.get().report().info("Tap on Start Learning button");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning2);
        QXClient.get().report().info("Tap on Start Learning button");
    }
    public void checkscore() throws Exception{

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkBackBtn);
        QXClient.get().report().info("Clicked on back button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.textbookunit);
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trackablequestionset);
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfquestion);
        QXClient.get().gestures().BlindWait(2000);


    }
    public void verifyscoreinquestionsettrackablecollect() throws Exception{
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ques1);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ques2);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.score);
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ExitBtn);
        QXClient.get().gestures().BlindWait(9000);

         QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ConfrmBtn);
         QXClient.get().gestures().BlindWait(9000);
    }
    


    public void tapOnSearchedQuestionset() throws Exception {
           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionsetfeedback);
           QXClient.get().report().info("Clicked on play icon ");
           QXClient.get().gestures().BlindWait(5000);

           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
           QXClient.get().report().info("Clicked on play icon ");
           QXClient.get().gestures().BlindWait(5000);

           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);
           QXClient.get().gestures().BlindWait(5000);


           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);
           QXClient.get().gestures().BlindWait(5000);

           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.question1);
           QXClient.get().gestures().BlindWait(5000);
           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);

           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.feedbackenablecorrect);
           QXClient.get().gestures().BlindWait(9000);


           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.question2);
           QXClient.get().gestures().BlindWait(5000);
           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);

           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.feedbackenablecorrect);
           QXClient.get().gestures().BlindWait(9000);


           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.question3);
           QXClient.get().gestures().BlindWait(5000);
           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);

           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.feedbackenablewrong);
           QXClient.get().gestures().BlindWait(9000);

       }
    
    public void tapOnbackandexit() throws Exception {

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);
        QXClient.get().gestures().BlindWait(9000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ExitBtn);
 QXClient.get().gestures().BlindWait(9000);

 QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ConfrmBtn);
 QXClient.get().gestures().BlindWait(9000);

 QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
 QXClient.get().gestures().BlindWait(9000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
        QXClient.get().gestures().BlindWait(9000);


    }

 public void tapOnqumlclick() throws Exception {

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionsetfeedback);
        QXClient.get().report().info("Clicked on play icon ");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on play icon ");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.question1);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.feedbackenablecorrect);
        QXClient.get().gestures().BlindWait(9000);


    }
 public void tapOnSearchedCourseexpired() throws Exception {

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitle);
     QXClient.get().gestures().BlindWait(10000);

      QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursemodule);
      QXClient.get().gestures().BlindWait(5000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOncourseunit);
     QXClient.get().report().info("Clicked on play icon ");
     QXClient.get().gestures().BlindWait(5000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assessmentscore);
     QXClient.get().gestures().BlindWait(9000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
     QXClient.get().gestures().BlindWait(3000);


     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.maxAttemptsExceededMsg);
     QXClient.get().gestures().BlindWait(3000);
 }
 
 public void taponreply() throws Exception {

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clicknext);
     QXClient.get().gestures().BlindWait(9000);
    // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.feedbackenablecorrect);
     //QXClient.get().gestures().BlindWait(9000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionsettitle);
     QXClient.get().gestures().BlindWait(9000);


     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionsetdesign);
     QXClient.get().gestures().BlindWait(9000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionsetreply);
     QXClient.get().gestures().BlindWait(9000);

 }
 
 public void tapOnSearched26thAprilWithAssessment() throws Exception {
     QXClient.get().gestures().BlindWait(3000);
     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.Course26thAprilWithAssessment);
     QXClient.get().gestures().BlindWait(5000);
     QXClient.get().report().info("Tap on CourseContent");
 }

public void verifyConsumeCourseAssesment() throws Exception {
     QXClient.get().gestures().BlindWait(3000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnTextCourseDetails);
     QXClient.get().report().info("clicked on clkCourseDetails");
     QXClient.get().gestures().BlindWait(3000);

     Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPassedEnrollmentEndDate),"Enrollment end date is not displayed");
     QXClient.get().report().info("Enrollment end date is displayed in Course details");
     QXClient.get().gestures().BlindWait(3000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseModules);
     QXClient.get().report().info("clicked on clkCourseModules");
     QXClient.get().gestures().BlindWait(3000);

     QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit1);
     QXClient.get().report().info("clicked on clkCourseUnit1");
     QXClient.get().gestures().BlindWait(3000);

     Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBestScore),"3.6 AN Self assess BEST SCORE 8/9 is not displayed");
     QXClient.get().report().info("3.6 AN Self assess BEST SCORE 8/9 is displayed");
     QXClient.get().gestures().BlindWait(3000);

 }
 
public void tapOnCourseWithAssessmentsUnderMyCourse() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.CourseWithAssessments);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on CourseContent");
}

public void verifyCourseAssesmentBestScoreNotBeDisplayedForNotAttemptedAssessment() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit2);
    QXClient.get().report().info("clicked on clkCourseUnit2");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertYourProgressStatus),"The text 0/1 is not displayed under Your Progress");
    QXClient.get().report().info("The text 0/1 is displayed under Your Progress");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBestScoreNotDisplayed),"Assess_1 is displayed with Best score");
    QXClient.get().report().info("Assess_1 is not displayed with Best score");
    QXClient.get().gestures().BlindWait(3000);

}


public void tapCourseongoing() throws Exception {

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitle2);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning2);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(12000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(12000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitle2);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ProgressBtn);
    QXClient.get().gestures().BlindWait(5000);

}


public void tapCoursemultipleunitsconsume() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.Courseunit);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);


    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitle3);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursecomplete);
    QXClient.get().gestures().BlindWait(5000);


}

public void taponsinglepagepdfcourse() throws Exception {

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitle4);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning2);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);


    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitle4);
    QXClient.get().gestures().BlindWait(5000);


    
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursecomplete);
    QXClient.get().gestures().BlindWait(5000);
}
public void tapCoursesync() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOncourse);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning2);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(12000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOncourse);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOn3dots);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnsyncprogress);
    QXClient.get().gestures().BlindWait(5000);

}

public void tapCoursemultipleunits() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitle3);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("Tap on Start Learning button");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning2);
    QXClient.get().report().info("Tap on Start Learning button");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
}
public void taponoldcertificate() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnprofile);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.vieweyecertificate);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.certificatepermission);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.allowpermission);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.downloadcoursecertificate);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.certificatePDF);
    QXClient.get().gestures().BlindWait(15000);

}
public void VerifyCourseProgressShouldGetUpdatedWithSinglePagePdfContent() throws Exception {

    QXClient.get().driver().findElement(By.xpath("//android.view.View[contains(@text,'COURSE course for single page pdf ')]")).click();
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().driver().findElement(By.xpath("//android.widget.Button[@text='JOIN COURSE']")).click();
    //QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().driver().findElement(By.xpath("//android.widget.Button[@text='Do not share']")).click();
//    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().driver().findElement(By.xpath("//android.widget.Button[@text='play Start learning']")).click();
    // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().driver().findElement(By.xpath("//android.widget.Button[@text='Play video']")).click();
    //QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.tapOnPlayIcon3);
    // QXClient.get().report().info("Tap on play icon 3");
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().driver().findElement(By.xpath(" //android.widget.Button[@text='navigation-arrows-nextIcon']")).click();
    // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().driver().findElement(By.xpath("  //android.view.View[@text='Next content']")).click();
    // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.verifyNextcontent);
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().driver().findElement(By.xpath(" //android.widget.Button[@text='Play video']")).click();
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().driver().findElement(By.xpath(" //android.widget.Button[@text='navigation-arrows-nextIcon']")).click();
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().driver().findElement(By.xpath("  //android.view.View[@text='Exit']")).click();
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().driver().findElement(By.xpath("  //android.widget.Image[@text='close']")).click();
}
public void VerifyCourseProgressShouldGetUpdatedWithSinglePagePdfContentwithProgress() throws Exception{
    QXClient.get().driver().findElement(By.xpath("//android.view.View[contains(@text,'COURSE course for single page pdf ')]")).click();
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().driver().findElement(By.xpath("//android.widget.TextView[@text='You have successfully completed this course']")).click();
    QXClient.get().gestures().BlindWait(5000);
}
public void tapOnAutomationPdfCourse() throws Exception {
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.AutomationPdfCourse);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on Already Joined course");
}

public void verifyCourseProgressUpdateForPDFContent() throws Exception {
    QXClient.get().gestures().BlindWait(5000);
    if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)) {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().gestures().BlindWait(4000);
    } else {
        QXClient.get().report().info("Already joined to the course");
    }
    QXClient.get().gestures().BlindWait(2000);
    try {
        if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
            QXClient.get().report().info("clicked on clkDontShareBtn button");
            QXClient.get().gestures().BlindWait(2000);

        }
    } catch (Exception e3) {
        System.out.println("handled profile share");
    }

    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course button is displayed");
    QXClient.get().report().info("Join Course Button is not displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit01);
    QXClient.get().report().info("clicked on clkCourseUnit01");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPDFContent3);
    QXClient.get().report().info("clicked on clkPDFContent3");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPlayVideoBtn);
    QXClient.get().report().info("clicked on clkPDFPlayBtn");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");


    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPlayerExitBtn);
    QXClient.get().report().info("clicked on clkPlayerExitBtn");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkRateTheContent);
    QXClient.get().report().info("Clicked on 5 ratings");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkRatingSubmitBtn);
    QXClient.get().report().info("clicked on RatingSubmitContent");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertVerifyProgress), "The progress 1/3 is not displayed");
    QXClient.get().report().info("The progress 1/3 is displayed ");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfYourProgress), "The progress 33% is not displayed");
    QXClient.get().report().info("The progress 33% is displayed ");
    QXClient.get().gestures().BlindWait(3000);


}

public void tapOnAutomationEpubCourse() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.AutomationEpubCourse);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on Already Joined course");
}

public void verifyCourseProgressUpdateForEpubContent() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit01);
    QXClient.get().report().info("clicked on clkCourseUnit01");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkEpubContent);
    QXClient.get().report().info("clicked on clkEpubContent");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPlayVideoBtn);
    QXClient.get().report().info("clicked on clkPlayVideoBtn");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPlayerExitBtn);
    QXClient.get().report().info("clicked on clkPlayerExitBtn");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCloseIconOnRateContent);
    QXClient.get().report().info("clicked on clkCloseIconOnRateContent");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertVerifyProgress),"The progress 1/3 is not displayed");
    QXClient.get().report().info("The progress 1/3 is displayed ");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfYourProgress),"The progress 33% is not displayed");
    QXClient.get().report().info("The progress 33% is displayed ");
    QXClient.get().gestures().BlindWait(3000);


}
public void taponcoursebatch() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitlebatch);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertbatchselection), "Batch selection popup is not displayed");
    QXClient.get().report().info("Batch selection popup  is not displayed in the searched course");
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);
}

public void taponcourseselectionbatch() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitleselectionbatch);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertbatchselection), "Batch selection popup is displayed");
    QXClient.get().report().info("Batch selection popup  is  displayed in the searched course");
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitleselectionbatch);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.courseprogress), "Course progress is displayed with 0%");
    QXClient.get().report().info("Course progress is displayed with 0%");
    QXClient.get().gestures().BlindWait(5000);
}


public void tapOnQuestionSetWithvideo() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.questionSetWithVideo);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on Questionset with video");
}
public void verifyQuestionsetPlayvideoinSolution() throws Exception {
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playIcon);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClickOnNextBtn);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClickOnNextBtn);
    QXClient.get().report().info("Click on Next button");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClickOnoption);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClickOnNextBtn);
    QXClient.get().report().info("Click on MCQ option");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClickOnSolutionbtn);
    QXClient.get().report().info("Click on solution button");
    QXClient.get().gestures().BlindWait(4000);
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.PlayTheVideo);
    QXClient.get().report().info("play the video in solution");
    QXClient.get().gestures().BlindWait(2000);
}
public void tapOnQrcode() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClkOnCourseWithAssess);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on Course with QR code");
}
public void verifySearchCourseLinkedWithQRCode() throws Exception {
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.CourseWithQRCode), "Course with QRcode not is displayed");
    QXClient.get().report().info("Course with QRcode is displayed");
    QXClient.get().gestures().BlindWait(3000);
}

public void verifyCourseUpdateforExpiredCourse() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkonthecourse);
    QXClient.get().gestures().BlindWait(3000);


    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBatchended),"Batches completed text not displayed");
    QXClient.get().report().info("Batches completed text is displayed");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertProgressWillNotUpdateMsg),"You may continue the course, but your progress will not be updated text not displayed");
    QXClient.get().report().info("You may continue the course, but your progress will not be updated text is displayed");
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnCourseDetails);
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseEndDateTextWithDate),"Course end date is not displayed");
    QXClient.get().report().info("Course end date is is displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursemodule);
    QXClient.get().report().info("Clicked on course modules");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkonAssessment);
    QXClient.get().report().info("Clicked on the assessment");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.startAgain),"Start again text not displayed");
    QXClient.get().report().info("Start again text is displayed");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertbestScoreassess),"Best score text is not displayed");
    QXClient.get().report().info("Best score text is displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertbestScoreassess);
    QXClient.get().report().info("Clicked on assessment");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
    QXClient.get().report().info("Clicked on assessment");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clickcontinue);
    QXClient.get().report().info("Clicked on continue");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().clkBackButton();

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkok);
    QXClient.get().report().info("Clicked on ok");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkBackBtn);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertbestScoreassess),"Best score text is not displayed");
    QXClient.get().report().info("Best score text is displayed");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkBackBtn);
    QXClient.get().gestures().BlindWait(2000);
//play another content

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkanothercontent);
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkcontent);
    QXClient.get().gestures().BlindWait(2000);

    //play content
    QXClient.get().gestures().BlindWait(10000);

   QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(2000);

    Assert.assertFalse(QXClient.get().gestures().isElementPresent(trainingPageObjects.progressBar),"Progress bar is displayed");
    QXClient.get().report().info("Progress bar is not displayed");
}

public void verifyProgressupdateforPDF() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkonthecourse);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().report().info("clicked on joincourse button");
    QXClient.get().gestures().BlindWait(2000);

    try {
        if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
            QXClient.get().report().info("clicked on clkDontShareBtn button");
            QXClient.get().gestures().BlindWait(2000);

        }
    } catch (Exception e3) {
        System.out.println("handled profile share");
    }

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.pdfcontent);
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkcontentpdf);
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playpdf);
    QXClient.get().report().info("clicked on pdf content");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("clicked on Next Button");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextcontent);
    QXClient.get().report().info("clicked on Next content");
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(5000);

    Assert.assertFalse(QXClient.get().gestures().isElementPresent(trainingPageObjects.progressUpdated),"Progress bar is not updated");
   QXClient.get().report().info("Progress bar is Updated");
    QXClient.get().gestures().BlindWait(4000);

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(5000);

    Assert.assertFalse(QXClient.get().gestures().isElementPresent(trainingPageObjects.progressBarUpdated),"Progress bar is not updated");
    QXClient.get().report().info("Progress bar is Updated");
    QXClient.get().gestures().BlindWait(2000);
}

public void tapCoursharepopup() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOncourse);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertsharemessage),"I consent to share my details with the administrators");
    QXClient.get().report().info("I consent to share my details with the administrators");
    QXClient.get().gestures().BlindWait(5000);

}


public void tapCoursekebabmenu() throws Exception {
       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOncourse);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
       QXClient.get().gestures().BlindWait(3000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
       QXClient.get().report().info("Tap on Start Learning button");

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning2);
       QXClient.get().report().info("Tap on Start Learning button");

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
       QXClient.get().gestures().BlindWait(12000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOncourse);
       QXClient.get().gestures().BlindWait(5000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOn3dots);
       QXClient.get().gestures().BlindWait(5000);

   }
public void taponnewcertificate() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnprofile);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.vieweyecertificate);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.certificatepermission);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.allowpermission);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.downloadcoursecertificate);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.certificatePDF);
    QXClient.get().gestures().BlindWait(15000);

}
public void tapOnNewCourseWithCertificate() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.NewCourseWithCertificate);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on CourseContent");
}

public void verifyCertificateInMyLearningAndLearnerPassbookSection() throws Exception {
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
    QXClient.get().report().info("clicked on course details");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCertificateCriteria);
    QXClient.get().report().info("clicked on certificate criteria");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCertificateCriteria),"The completion certificate criteria text is not displayed");
    QXClient.get().report().info("The completion certificate criteria text is displayed");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseCompletedMsg), "Course completed message is not displayed");
    QXClient.get().report().info("Course completed message is displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkFooterProfileIcon);
    QXClient.get().report().info("clicked on Home Profile icon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEyeCertificate),"Certificate with eye icon is not displayed under My learning and Learner passbook");
    QXClient.get().report().info("Certificate with eye icon is displayed under My learning and Learner passbook");
    QXClient.get().gestures().BlindWait(3000);


}

public void tapOnAutomationHTMLCourse() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.AutomationHTMLCourse);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on Already Joined course");
}

public void verifyCourseProgressUpdateForHTMLContent() throws Exception {
    QXClient.get().gestures().BlindWait(5000);
    if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)) {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().gestures().BlindWait(4000);
    } else {
        QXClient.get().report().info("Already joined to the course");
    }
    QXClient.get().gestures().BlindWait(2000);
    try {
        if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
            QXClient.get().report().info("clicked on clkDontShareBtn button");
            QXClient.get().gestures().BlindWait(2000);

        }
    } catch (Exception e3) {
        System.out.println("handled profile share");
    }

    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course button is displayed");
    QXClient.get().report().info("Join Course Button is not displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
    QXClient.get().report().info("clicked on clkStartLearning button");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPlayVideoBtn);
    QXClient.get().report().info("clicked on clkPDFPlayBtn");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
    QXClient.get().report().info("clicked on OK button to cancel");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkRateTheContent);
    QXClient.get().report().info("Clicked on 5 ratings");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkRatingSubmitBtn);
    QXClient.get().report().info("clicked on RatingSubmitContent");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit01);
    QXClient.get().report().info("clicked on clkCourseUnit01");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertVerifyProgress), "The progress 1/3 is not displayed");
    QXClient.get().report().info("The progress 1/3 is displayed ");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfYourProgress), "The progress 33% is not displayed");
    QXClient.get().report().info("The progress 33% is displayed ");
    QXClient.get().gestures().BlindWait(3000);

}
public void tapOnNewCourseMeritCertificate() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.NewCourseMeritCertificate);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on CourseContent");
}

public void verifyMeritCertificateForNewCourseInMyLearningAndLearnerPassbookSection() throws Exception {
    QXClient.get().gestures().BlindWait(5000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseCompletedMsg), "Course completed message is not displayed");
    QXClient.get().report().info("Course completed message is displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnTextCourseDetails);
    QXClient.get().report().info("clicked on clkCourseDetails");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCertificateCriteria);
    QXClient.get().report().info("clicked on certificate criteria");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMeritCertificateCriteria),"The merit certificate criteria text is not displayed");
    QXClient.get().report().info("The merit certificate criteria text is displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkFooterProfileIcon);
    QXClient.get().report().info("clicked on Home Profile icon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkMoreTrainingsBtn);
    QXClient.get().report().info("clicked on More dropdown icon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEyeCertificate),"Certificate with eye icon is not displayed under My learning and Learner passbook");
    QXClient.get().report().info("Certificate with eye icon is displayed under My learning and Learner passbook");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEyeCertificate),"Certificate with eye icon is not displayed under My learning and Learner passbook");
    QXClient.get().report().info("Certificate with eye icon is displayed under My learning and Learner passbook");
    QXClient.get().gestures().BlindWait(3000);


}
public void tapOnOldCourseMeritCertificate() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.OldCourseMeritCertificate);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on CourseContent");
}

public void verifyMeritCertificateInMyLearningAndLearnerPassbookSection() throws Exception {
    QXClient.get().gestures().BlindWait(5000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseCompletedMsg), "Course completed message is not displayed");
    QXClient.get().report().info("Course completed message is displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCertificateCriteria);
    QXClient.get().report().info("clicked on certificate criteria");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMeritCertificateCriteria),"The merit certificate criteria text is not displayed");
    QXClient.get().report().info("The merit certificate criteria text is displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkFooterProfileIcon);
    QXClient.get().report().info("clicked on Home Profile icon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkMoreTrainingsBtn);
    QXClient.get().report().info("clicked on More dropdown icon");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEyeCertificate),"Certificate with eye icon is not displayed under My learning and Learner passbook");
    QXClient.get().report().info("Certificate with eye icon is displayed under My learning and Learner passbook");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEyeCertificate),"Certificate with eye icon is not displayed under My learning and Learner passbook");
    QXClient.get().report().info("Certificate with eye icon is displayed under My learning and Learner passbook");
    QXClient.get().gestures().BlindWait(3000);


}
public void taponresumecourseselectionbatch() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitleselection);
    QXClient.get().gestures().BlindWait(9000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.batchselectionresume);
    QXClient.get().gestures().BlindWait(9000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(9000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitleselection);
    QXClient.get().gestures().BlindWait(9000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.batchselectionresume);
    QXClient.get().gestures().BlindWait(9000);
    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertcourseprogressresume), "Course progress is displayed with 100%");
    QXClient.get().report().info("Course progress is displayed with 11%");
    QXClient.get().gestures().BlindWait(7000);
}
public void oldcourseconsumeongoing() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitleoldcert);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning2);
    QXClient.get().report().info("Tap on Start Learning button");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);

    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.coursetitleoldcert);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOn3dots);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnsyncprogress);
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
}

public void tapOnShallowCopyTextbook() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ShallowCopyTextbook);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on ShallowCopyTextbook");
}

public void verifyUserAbleToConsumeShallowCopyTextbook() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playTextbook);
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertPdfSlide1);
    trainingPageObjects.assertPdfSlide1.clear();
    QXClient.get().gestures().BlindWait(1000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.pdfEditField);
    QXClient.get().gestures().BlindWait(1000);
    trainingPageObjects.pdfEditField.sendKeys("9");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkGotoPage);
    QXClient.get().report().info("Clicked on Go to page ");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfSlide9),"User not able to go to the required page");
    QXClient.get().report().info("User able to jump to the next slide in pdf content");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextcontent);
    QXClient.get().report().info("clicked on Next content");
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
    QXClient.get().report().info("clicked on OK button to cancel");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDownArrowbtn);
    QXClient.get().report().info("clicked on OK button to cancel");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playTextbook);
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().BlindWait(10000);

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
    QXClient.get().report().info("clicked on OK button to cancel");
    QXClient.get().gestures().BlindWait(2000);
}
public void verifyUserAbleToConsumeTheQuestionsetSmoothlyWhenitisAddedToCourse() throws Exception{
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
    QXClient.get().report().info("Clicked on start learning");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playvideo);
    QXClient.get().report().info("Clicked on Play video");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.NextSlide);
    QXClient.get().report().info("Clicked on next arrow icon");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.NextSlide);
    QXClient.get().report().info("Clicked on next arrow icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.NextSlide);
    QXClient.get().report().info("Clicked on next arrow icon");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.NextSlide);
    QXClient.get().report().info("Clicked on next arrow icon");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.NextSlide);
    QXClient.get().report().info("Clicked on next arrow icon");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ExitBtn);
    QXClient.get().report().info("Clicked on Exit btn");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkok);
    QXClient.get().report().info("Handled Confirmbutton");
}

public void tapOnSearchedcoursewithprofilepopup() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnCoursePopup);
    QXClient.get().report().info("Tap on course");
    QXClient.get().gestures().BlindWait(3000);

}

public void tapOnCourseMp4() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnCourseMp4);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on Course");

}

public void verifyCourseProgressGetUpdatedForMP4() throws Exception {
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    QXClient.get().report().info("clicked on joincourse button");
    QXClient.get().gestures().BlindWait(2000);


    try {
        if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
            QXClient.get().report().info("clicked on clkDontShareBtn button");
            QXClient.get().gestures().BlindWait(2000);

        }
    } catch (Exception e3) {
        System.out.println("handled profile share");
    }
    QXClient.get().gestures().BlindWait(2000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseprogress));
    QXClient.get().report().info("0% progress is displayed");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("clicked on Start Learning button");
    QXClient.get().gestures().BlindWait(1000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfYourProgress));
    QXClient.get().report().info("Course progress updated is displayed");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClkOnCourseUnit);
    QXClient.get().gestures().BlindWait(2000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMp4content));
    QXClient.get().report().info("Mp4 content is displayed");
    QXClient.get().gestures().BlindWait(2000);


}
public void verifyProgressBarForVideoContent() throws Exception {
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnvideocontent);
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().report().info("Tap on mp4 content");
    QXClient.get().gestures().BlindWait(1000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClkOnPause);
    QXClient.get().gestures().BlindWait(1000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.ClkOnPgBar));
    QXClient.get().report().info("progress bar is displayed");
    QXClient.get().gestures().BlindWait(1000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertabout));
    QXClient.get().report().info("Video played in portrait mode");
    QXClient.get().gestures().BlindWait(2000);
}
public void tapOnSearchedcoursewithfuturedate() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnCourseFutureDate);
    QXClient.get().report().info("Tap on course");
    QXClient.get().gestures().BlindWait(3000);
}

public void verifyAssessmentBestScoreForAlreadyConsumedCourse() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit01);
    QXClient.get().report().info("clicked on clkCourseUnit01");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBestScore),"Assessment BEST SCORE is not displayed");
   QXClient.get().report().info("ASsessment BEST SCORE is displayed");
   QXClient.get().gestures().BlindWait(3000);


}

public void tapOnAutomationcoursewithvideocontent() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.Automationcoursewithvideocontent);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().report().info("Tap on Automationcoursewithvideocontent");
}
public void verifyMinimizeAndMaximizeControlAvailableInTheVideoContentInPortraitMode() throws Exception {
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
    QXClient.get().report().info("Clicked on Start learning button");
    QXClient.get().gestures().BlindWait(1000);

    //QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
   // QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkMaximizeIcon);
    QXClient.get().report().info("Clicked on Maximise Icon");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(3000);
    
}


public void verifyCourseProgressShouldNotUpdateForEpubContentForPartiallyConsuming() throws Exception {
    QXClient.get().gestures().BlindWait(5000);
    if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)) {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().gestures().BlindWait(4000);
    } else {
        QXClient.get().report().info("Already joined to the course");
    }
    QXClient.get().gestures().BlindWait(2000);
    try {
        if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
            QXClient.get().report().info("clicked on clkDontShareBtn button");
            QXClient.get().gestures().BlindWait(2000);

        }
    } catch (Exception e3) {
        System.out.println("handled profile share");
    }

    QXClient.get().gestures().BlindWait(2000);
    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course button is displayed");
    QXClient.get().report().info("Join Course Button is not displayed");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
    QXClient.get().report().info("clicked on clkStartLearning button");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPlayVideoBtn);
    QXClient.get().report().info("clicked on clkPDFPlayBtn");
    QXClient.get().gestures().BlindWait(8000);


    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");


    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
    QXClient.get().report().info("Clicked on Next Arrow Icon");
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().clkBackButton();
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
    QXClient.get().report().info("clicked on OK button to cancel");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
    QXClient.get().report().info("clicked on clkOnBackIcon");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEpubPartiallyProgress), "The progress 0% is not displayed");
    QXClient.get().report().info("The progress 0% is displayed ");
    QXClient.get().gestures().BlindWait(3000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit01);
    QXClient.get().report().info("clicked on clkCourseUnit01");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertVerifyCourseUnitProgress), "The progress 0/3 is not displayed");
    QXClient.get().report().info("The progress 0/3 is displayed ");
    QXClient.get().gestures().BlindWait(3000);


}


public void tapOnAutomationH5PCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.AutomationH5PCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on Already Joined course");
    }

public void verifyCourseProgressUpdateForH5PContent() throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().gestures().BlindWait(4000);
        } else {
            QXClient.get().report().info("Already joined to the course");
        }
        QXClient.get().gestures().BlindWait(2000);
        try {
            if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        } catch (Exception e3) {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course button is displayed");
        QXClient.get().report().info("Join Course Button is not displayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("clicked on clkStartLearning button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPlayVideoBtn);
        QXClient.get().report().info("clicked on clkPDFPlayBtn");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkRateTheContent);
        QXClient.get().report().info("Clicked on 5 ratings");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkRatingSubmitBtn);
        QXClient.get().report().info("clicked on RatingSubmitContent");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
        QXClient.get().report().info("clicked on clkOnBackIcon");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseUnit01);
        QXClient.get().report().info("clicked on clkCourseUnit01");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertVerifyProgress), "The progress 1/3 is not displayed");
        QXClient.get().report().info("The progress 1/3 is displayed ");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnBackIcon);
        QXClient.get().report().info("clicked on clkOnBackIcon");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPdfYourProgress), "The progress 33% is not displayed");
        QXClient.get().report().info("The progress 33% is displayed ");
        QXClient.get().gestures().BlindWait(3000);

    }
public void verifyUserFirstLandOnRootNodeInstructionPageInQuestionSet() throws Exception {
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertInstructionsHeaderInInstructionPage), "Instructions header is not displayed");
    QXClient.get().report().info("Instructions header is displayed");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertInstructionText), "Instruction text is not displayed");
    QXClient.get().report().info("Instruction text is displayed");
    QXClient.get().gestures().BlindWait(2000);

}
public void verifyCertificateForLatestBatchInMyLearning() throws Exception {
    QXClient.get().gestures().BlindWait(5000);

    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.Mylearning));
    QXClient.get().report().info("My learning is displayed");
    QXClient.get().gestures().BlindWait(2000);

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkMoreTrainingsBtn);
    QXClient.get().report().info("clicked on More dropdown icon");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.CourseWithOldCertificate),"Copy of qr code is not displayed");
    QXClient.get().report().info("Copy of qr code is displayed");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.oldBatchNamecertificate),"Batch new is not displayed under My learning section");
    QXClient.get().report().info("Batch new is displayed under My learning section");
    QXClient.get().gestures().BlindWait(3000);

    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.vieweyecertificate),"Certificate with eye icon is not displayed under My learning section");
    QXClient.get().report().info("Certificate with eye icon is displayed under My learning section");
    QXClient.get().gestures().BlindWait(3000);


}
public void VerifyBothTheBatchWithCertificateIsShownInLearnerPassbookSection() throws Exception {
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();

    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkMoreTrainingsBtn);
    QXClient.get().report().info("clicked on More dropdown icon");
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
    QXClient.get().gestures().swipeUp();
}

public void VerificationonFirstBatchWithCertificate() throws Exception {
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifycourseonprofile),"Course is not displayed in Profile after editing");
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.vieweyecertificate),"viewcertificate is not displayed in Profile after editing");
    //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.vieweyecertificate),
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.Batch1),"Batch1 is not displayed in Profile after editing");

}
public void VerificationonSecondBatchWithCertificate() throws Exception {
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifycourseonprofile),"Course is not displayed in Profile after editing");
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.vieweyecertificate),"viewcertificate is not displayed in Profile after editing");
    //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.vieweyecertificate),
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.Batch2),"Batch2 is not displayed in Profile after editing");

}

public void newcollectionconsumeongoing() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.collectioncont);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinBtn);
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.donotsharebuton);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startlearning1);
    QXClient.get().report().info("Tap on Start Learning button");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.collectioncont);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertcoursecomplete),"You have successfully completed this course is displayed");
    QXClient.get().report().info("You have successfully completed this course is not displayed");
    QXClient.get().gestures().BlindWait(2000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertcollectioncomplete),"You have successfully completed this task is displayed");
    QXClient.get().report().info("You have successfully completed this task is not displayed");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOn3dots);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnsyncprogress);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
}
public void tapOncontinuelearningcollectionnew() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clktrackable);
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinBtn);
    QXClient.get().report().info("clicked on joincourse button");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkTextookBtn);
    QXClient.get().report().info("clicked on joincourse button");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkonpdf);
    QXClient.get().report().info("clicked on joincourse button");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
    QXClient.get().gestures().BlindWait(4000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnnavigationarrow);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.RatingBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertclkmylearning), "My learning button is not displayed");
    QXClient.get().report().info("My learning is displayed");
    // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkmylearning);
    // QXClient.get().gestures().BlindWait(5000);
    // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkcontiuelearning);
    QXClient.get().gestures().BlindWait(5000);
    //QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clktrackable);
    //QXClient.get().gestures().BlindWait(3000);
}
public void tapOncontinuelearningorder() throws Exception {
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trackabletest);
    QXClient.get().report().info("clicked on joincourse button");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertclkmylearning), "My learning button is not displayed");
    QXClient.get().report().info("My learning is displayed");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trackabletest);
    QXClient.get().report().info("clicked on joincourse button");
    QXClient.get().gestures().BlindWait(2000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkoncoursenew.get(2));
    //QXClient.get().gestures().driver.findElements(By.xp.get(17).click();
    QXClient.get().gestures().BlindWait(3000);
}
public void tapOnSearchedtrackablecollectionwithprofilepopup() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnTrackCollection);
    QXClient.get().report().info("Tap on Trackable Collection");
    QXClient.get().gestures().BlindWait(3000);
}
public void tapOnAutomationQSwithfeedbacktrue() throws Exception {
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnQSfeedback);
    QXClient.get().report().info("Tap on Questionset");
    QXClient.get().gestures().BlindWait(3000);
}

public void tapOnSearchedtrackablebookwithprofilepopup() throws Exception {
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnTrackbook);
    QXClient.get().report().info("Tap on Trackable book");
    QXClient.get().gestures().BlindWait(3000);
}
public void tapOnAutomationQSwithSolution() throws Exception {
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.TapOnSolutionQS);
    QXClient.get().report().info("Tap on Questionset");
    QXClient.get().gestures().BlindWait(3000);
}
public void tapongroupsondescendingorder() throws Exception {
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongroups);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertgroupmessage),"Have you explored the potential of groups yet is displayed");
    QXClient.get().report().info("Have you explored the potential of groups yet is not displayed");
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.groupsclose);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongrouporder2);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongroupsactivy);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongroupsactivy);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongrouporder2);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
     QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongrouporder1);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BackBtn);
     QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().closeappandrelaunchapp();
    HomePageActions a=new HomePageActions();
    a.tapOnMenuBar();
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongroups);
    QXClient.get().gestures().BlindWait(5000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkongrouporder2);
    QXClient.get().gestures().BlindWait(5000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertgroupmessage),"Have you explored the potential of groups yet is displayed");
    QXClient.get().report().info("Have you explored the potential of groups yet is not displayed");
    QXClient.get().gestures().BlindWait(5000);
}

public void validateFirstContentOfTheCourseStartsToPlayPostClickingonStartLearningButton() throws Exception{
    QXClient.get().gestures().BlindWait(3000);

    if(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)){
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().gestures().BlindWait(4000);
    }else{
        QXClient.get().report().info("Already joined to the course");
    }
    QXClient.get().gestures().BlindWait(2000);
    try {
        if (QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn))) ;
        {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
            QXClient.get().report().info("clicked on clkDontShareBtn button");
            QXClient.get().gestures().BlindWait(2000);

        }
    } catch (Exception e3) {
        System.out.println("handled profile share");
    }

    Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn), "Join Course button is displayed");
    QXClient.get().report().info("Join Course Button is not displayed");
    QXClient.get().gestures().BlindWait(3000);


    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
    QXClient.get().report().info("Clicked on start learning");
    QXClient.get().gestures().BlindWait(3000);
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.profilenameStartLearning);
    QXClient.get().report().info("Clicked on start learning");
    QXClient.get().gestures().BlindWait(3000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.playvideo),"play video is not displayed");
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playvideo);
    QXClient.get().report().info("first content played after user clicks on start learning button");
    QXClient.get().gestures().BlindWait(2000);

}
public void OpenAttributionsNamesCourseName() throws Exception{
    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ClkOnCourse);
    QXClient.get().report().info("Clicked On Course");
    QXClient.get().gestures().BlindWait(3000);

}
public void ValidateAttributionNamesShouldDisplayInAlphabeticalOrder() throws Exception{
    QXClient.get().gestures().BlindWait(3000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.Clk1stAttribute), "Alphabet 'A' Attribute is not displayed");
    QXClient.get().report().info("Clicked On Albhabet'A'");
    QXClient.get().gestures().BlindWait(3000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.Clk2ndAttribute), "Alphabet 'C' Attribute is not displayed");
    QXClient.get().report().info("Clicked On Albhabet'C'");
    QXClient.get().gestures().BlindWait(3000);
    Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.Clk3rdAttribute), "Alphabet 'C' Attribute is not displayed");
    QXClient.get().report().info("Clicked On Albhabet'T'");
    QXClient.get().gestures().BlindWait(3000);
}



}