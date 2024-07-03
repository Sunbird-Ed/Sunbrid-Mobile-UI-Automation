package com.qualitrrix.test.regression;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class SunbirdKnowledge {
    public DikshaMainPageActions getDikshaMainPageActions() {
        return new DikshaMainPageActions();
    }

    public LoginPageActions getLoginPageActions() {
        return new LoginPageActions();
    }

    public CoursePageActions getCoursePageActions() {

        return new CoursePageActions();
    }

    public LibraryCourseContentPageActions getLibraryPageActions() {
        return new LibraryCourseContentPageActions();
    }

    public HomePageActions getHomePageActions() {
        return new HomePageActions();
    }
    public TrainingPageActions getTrainingPageActions() {
        return new TrainingPageActions();
    }
    public DownloadPageActions getDownloadPageActions() {
        return new DownloadPageActions();
    }
    public ProfileEditPageActions getProfileEditPageActions() {
        return new ProfileEditPageActions();
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("@BeforeClass");
        // QXClient.get().driver();

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
        // QXClient.get().driver();

    }

    
 
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify UserAble to verifyIconInPDFHamburgerMenu ")
    public void VerifyOptionInPDFContentInHamburgerMenu() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
        getTrainingPageActions().tapOnSearchedPDF();
        getLibraryPageActions().tapOnPlayIcon3();
        getLibraryPageActions().verifyIconInPDFHamburgerMenu();
    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify verifyZoomInZoomOut ")
    public void VerifyZoomOptionInPDFContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
        getTrainingPageActions().tapOnSearchedPDF();
        getLibraryPageActions().tapOnPlayIcon3();
        getLibraryPageActions().verifyZoomInZoomOut();
    }

    

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Verify UserAble to PrintPDFContent ")
    public void PrintIconInPDFContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
//QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
        getTrainingPageActions().tapOnSearchedPDF();
        getLibraryPageActions().tapOnPlayIcon3();
        getLibraryPageActions().printPDF();
    }

    @Test()
    public void verifyPageInsteadOfLocationInPDFContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

        getTrainingPageActions().tapOnSearchedPDF();
        getLibraryPageActions().tapOnPlayIcon3();
        getLibraryPageActions().verifyPageReplacesLocationInContent();

    }

    @Test()
    public void verifyPageInsteadOfLocationInEpubContent() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnSearchIcon();
        getHomePageActions().enterTextInSearchBar("Epub");

        getTrainingPageActions().tapOnEpubContent();
        getLibraryPageActions().tapOnPlayIcon3();
        getLibraryPageActions().verifyPageReplacesLocationInContent();

    }

}
