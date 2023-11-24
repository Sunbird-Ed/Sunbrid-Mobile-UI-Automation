package com.qualitrix.common.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.DikshaMainPageActions;
import com.qualitrix.pageActions.HomePageActions;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Qualitrix on DD/MM/YYY.
 * @author
 */
public class Gestures {

    public AppiumDriver driver;

    public Gestures(AppiumDriver driver){
        this.driver = driver;
    }
    
    public void startActivity(String appPackage, String appActivity) {
        ((AndroidDriver) driver).startActivity(new Activity(appPackage, appActivity));
    }
    
   

    public void horizontalSwipingTest(WebElement element) throws Exception {

        MobileElement slider = (MobileElement) element;
        Point source = slider.getLocation();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        dragNDrop.addAction(new Pause(finger, Duration.ofMillis(600)));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(600),
                PointerInput.Origin.viewport(),
                source.x + 400, source.y));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        driver.perform(Arrays.asList(dragNDrop));
    }

    public void verticalSwipeTest(WebElement element) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        wait.until(ExpectedConditions.visibilityOf(element));
        verticalSwipe(element);
    }

    public void dragAndDrop(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        element.click();
        MobileElement dragMe = (MobileElement) new WebDriverWait(driver, 30).until(ExpectedConditions
                .elementToBeClickable(element));
        Point source = dragMe.getCenter();
        //IMPORTANT - This needs to be corrected.
        //Point target = (MobileElement) driver.findElementByAccessibilityId("dropzone").getCenter();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        dragNDrop.addAction(new Pause(finger, Duration.ofMillis(600)));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        driver.perform(Arrays.asList(dragNDrop));
    }

    public void pinchAndZoom(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        element.click();
        Thread.sleep(3000);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");

        Dimension size = driver.manage().window().getSize();
        Point source = new Point(size.getWidth(), size.getHeight());

        Sequence pinchAndZoom1 = new Sequence(finger, 0);
        pinchAndZoom1.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x / 2, source.y / 2));
        pinchAndZoom1.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        pinchAndZoom1.addAction(new Pause(finger, Duration.ofMillis(100)));
        pinchAndZoom1.addAction(finger.createPointerMove(Duration.ofMillis(600),
                PointerInput.Origin.viewport(), source.x / 3, source.y / 3));
        pinchAndZoom1.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));


        Sequence pinchAndZoom2 = new Sequence(finger2, 0);
        pinchAndZoom2.addAction(finger2.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x / 2, source.y / 2));
        pinchAndZoom2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        pinchAndZoom2.addAction(new Pause(finger, Duration.ofMillis(100)));
        pinchAndZoom2.addAction(finger2.createPointerMove(Duration.ofMillis(600),
                PointerInput.Origin.viewport(), source.x * 3 / 4, source.y * 3 / 4));
        pinchAndZoom2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(pinchAndZoom1, pinchAndZoom2));
    }

    public void longPress(WebElement element) throws InterruptedException {

        Thread.sleep(5000);
        element.click();
        MobileElement longpress = (MobileElement) new WebDriverWait(driver, 30).
                until(ExpectedConditions.elementToBeClickable(element));
        new Actions(driver).clickAndHold(longpress).perform();
        Thread.sleep(5000);
    }

    public void doubleTap(MobileElement mobileElement){
        TouchActions action = new TouchActions(driver);
        action.doubleTap(mobileElement);
        action.perform();
    }

    public void doubleTap(WebElement element) throws InterruptedException {

        Thread.sleep(5000);
        driver.findElementByAccessibilityId("doubleTap").click();
        MobileElement mobileElement = (MobileElement) new WebDriverWait(driver, 30).
                until(ExpectedConditions.elementToBeClickable(element));
        Thread.sleep(1000);
        Point source = mobileElement.getCenter();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(200)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(40)));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(finger, Duration.ofMillis(200)));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap));
        Thread.sleep(4000);
    }

    private void verticalSwipe(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        MobileElement slider = (MobileElement) element;
        Point source = slider.getCenter();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(),
                source.x / 2, source.y + 400));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(600),
                PointerInput.Origin.viewport(), source.getX() / 2, source.y / 2));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        driver.perform(Arrays.asList(dragNDrop));
    }

    public void multiTouchTest(WebElement element) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.
                elementToBeClickable(element)).click();
        Thread.sleep(3000);
        MobileElement slider = (MobileElement) element;
        MobileElement slider1 = (MobileElement) element;

        Dimension sizeSlider = slider.getSize();
        Dimension sizeSlider1 = slider1.getSize();
        TouchAction touchAction1 =
                new TouchAction(driver).press(ElementOption.element(slider, 0, sizeSlider.height / 2))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(ElementOption.element(slider, sizeSlider.width / 2, sizeSlider.height / 2));
        TouchAction touchAction2 =
                new TouchAction(driver).press(ElementOption.element(slider1, 0, sizeSlider1.height / 2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(ElementOption.element(slider1, sizeSlider1.width / 2, sizeSlider1.height / 2));
        new MultiTouchAction(driver).add(touchAction1).add(touchAction2).perform();
        Thread.sleep(2000);
    }

    
    
    
    public void closeApp()
    {
    	driver.closeApp();
    }
    public void clickOnElement(WebElement element){
        element.click();
    }
    public void waitAndClickElementisVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
     //   wait.until(ExpectedConditions.visibilityOf(element));
        
        
        wait.until(ExpectedConditions.elementToBeClickable(element));
             element.click();
    }
    public boolean isElementPresent(WebElement locator) {
        try {
            waitForElementToAppear(locator);
            if (locator.isDisplayed())
                System.out.println("Element present on screen ***********" + locator);
            return true;
        } catch (Exception e) {
            System.out.println("Element not present on screen **************" + locator);
            return false;
        }
    }
    
    public WebElement waitForElementToAppear(WebElement id) {
        WebDriverWait wait = new WebDriverWait(driver,25);
        wait.until(ExpectedConditions.visibilityOf(id));
        return id;
    }
    
  
    

    
    public void scrollToMobileElement(MobileElement element, String scrollCount) {
        try {
            int count = Integer.parseInt(scrollCount);
            for (int i = 0; i < count; i++) {
                if (isElementPresent(element)) {
                    break;
                } else {
                    swipeUp();
                }
            }
        } catch (Exception e) {
            System.out.println("Scroll to mobile element failed");
        }
    }
    public void swipeUp() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.85);
        int endy = (int) (size.height * 0.2);
        int startx = (int) (size.width / 2.2);
        try {
            System.out.println("Trying to swipe up from x:" + startx + " y:" + starty + ", to x:" + startx + " y:" + endy);
            new TouchAction(driver).press(point(startx, starty)).waitAction(waitOptions(ofSeconds(2)))
                    .moveTo(point(startx, endy)).release().perform();
           
        } catch (Exception e) {
            System.out.println("Swipe action was not successful.");
        }
    }
    
    public void clkBackButton(){
   	 ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        System.out.println("Clicked on back buttton");  
        }
   
    public boolean generateTextXpathIsElementPresent(String value) {
        boolean flag = false;
        List<MobileElement> elements = driver.findElements(By.xpath("//*[contains(@text,'" + value + "')]"));
        if (elements.size() > 0) {
            flag = true;
        }
        Assert.assertTrue(flag, "Element is not present");
        return flag;
    }
    public void generateXpathAndClickElement(String value) throws Exception {
    	BlindWait(3000);
        try {
            MobileElement element = (AndroidElement) driver.findElement(By.xpath("//*[contains(@text,'" + value + "')]"));
            element.click();
        } catch (Exception e) {
            System.out.println("Scroll to mobile element failed");
        }
    }
    public void generateXpathUsingTextAndClickElement(String value) {
        try {
            WebElement element = (AndroidElement) driver.findElement(By.xpath("//*[@text='" + value + "']"));
            element.click();
        } catch (Exception e) {
            System.out.println("Scroll to mobile element failed");
        }
    }
    
    public void swipeDown() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.45);
        int endy = (int) (size.height * 0.90);
        int startx = (int) (size.width / 2.2);
        try {
            System.out.println("Trying to swipe up from x:" + startx + " y:" + starty + ", to x:" + startx + " y:" + endy);
            new TouchAction((PerformsTouchActions) driver).press(point(startx, starty)).waitAction(waitOptions(ofSeconds(3)))
                    .moveTo(point(startx, endy)).release().perform();
        } catch (Exception e) {
            System.out.println("Swipe did not complete successfully.");
        }
    }
    public String getText(WebElement element) {
        String elementText = element.getText();
        return elementText;
    }
    
    public void openNotification() {
        ((AndroidDriver) driver).openNotifications();
    }
    
    public String generateRandomName() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        return name;
    }

    public void scrollTilltextVisible(String visibleText) {
    	 ((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
           }
    
    public void scrollAndClick(String visibleText) {
   	 ((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
          }
       
    public void alternativeMethodForSendKeys(String textData)
    {
    	 Actions a = new Actions(driver);
   	  a.sendKeys(textData);
   	  a.perform();
   	 
       
    }
    public void BlindWait(int wait) throws Exception
    {
    	// Thread.sleep(wait);
System.out.println("IgnoreWait");   
}
    
    
    public void scrollUpToMobileElement(MobileElement element, String scrollCount) {
        try {
            int count = Integer.parseInt(scrollCount);
            for (int i = 0; i < count; i++) {
//                if (isElementDisplayed(element)) {
                if (isElementPresent(element)) {
                    break;
                } else {
                    swipeUp();
                }

            }
        } catch (Exception e) {
            System.out.println("Scroll to mobile element failed");
        }
    }
    
    public void tocuh() throws Exception
    {
		/*
		 * Dimension dims = driver.manage().window().getSize(); int edgeBorder = 10;
		 * PointOption pointOptionStart, pointOptionEnd; // init start point = center of
		 * screen pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
		 * pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
		 */
    	  new TouchAction(driver).tap(point(299,150)).perform();
    }
    public void generateXpathUsingClassAndTextAndClickElement(String value) throws Exception {
    
        BlindWait(6000);

        
            MobileElement element = (AndroidElement) driver.findElement(By.xpath("//android.view.View[@text='" + value + "']"));
            element.click();
           BlindWait(5000);

      
    }

    public void closeappandrelaunchapp() throws Exception {
        QXClient.get().gestures().closeApp();
        DikshaMainPageActions d = new DikshaMainPageActions();
        d.LaunchAppHomeScreen();
        QXClient.get().gestures().BlindWait(9000);
        HomePageActions home = new HomePageActions();
        home.tapOnProfileTab();
        QXClient.get().gestures().BlindWait(2000);
    }


  public String getCurrentDataInDDMMYY()
  {
	  Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
		String strDate= formatter.format(date);
		System.out.println(strDate);
		return strDate;
  }
}
