package com.qualitrrix.test;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.common.utils.gsheet.GSheet;
import org.testng.annotations.*;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;

public class TestClass {

//    @BeforeClass
//    public void BeforeClass(){
//        System.out.println("@BeforeClass");
//    }

//   @BeforeMethod
//   public void beforeMethod(){
//       System.out.println("@BeforeMethod");
//   }

//    @Test
//    @RetryCount(maxRetryCount = 0)
//    public void Test1() throws InterruptedException, IOException, ConfigurationException {
//        System.out.println("@Test");
//        String pageSource = QXClient.get().driver().getPageSource();
//        QXReport.getTest().info("Fetching Page Source");
//        QXReport.getTest().debug("I debug");

//        Thread.sleep(5 * 1000);
//        WebElement element =  QXClient.get().driver().findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']"));
//        QXClient.get().gestures().clickOnElement(element);
   // QXClient.get().waitUtils().isDisplayed(element);
//        System.out.println("PageSource: " + pageSource);

//        String excelPath = "C:\\Users\\Shibu\\Downloads\\Appium.xlsx";
//        QXClient.get().excelUtils().open(excelPath, "Excel1");
//        String cellValue = QXClient.get().excelUtils().getCellValue("Excel1", "Change Log", 1, 2);
//        System.out.println("@cellValue: " + cellValue);
//
//        QXClient.get().excelUtils().setCellValue("Excel1", "Change Log", "New Change Log", 1, 2);
//
//        QXClient.get().excelUtils().open("/excel1/path", "Excel2");
//        QXClient.get().excelUtils().close("Excel1");
//        QXClient.get().excelUtils().closeAll();

//        String base64 = QXClient.get().screenshotUtils().captureBase64();
//        System.out.println("Base64: " + base64);

//        File file = QXClient.get().screenshotUtils().captureFile();
//        System.out.println("ImageFile: " + file.getPath());

//        String imagePath = System.getProperty("user.dir") + "/reports/"+"image1.jpg";
//        File file1 = QXClient.get().screenshotUtils().captureFile(imagePath);
//        System.out.println("@imagePath1: " + file1.getPath());

//        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
//        System.out.println("@name:" + properties.getProperty("name"));
//
//        properties = QXClient.get().propUtils().getProperties(new File(System.getProperty("user.dir") + "/configs/config.properties"));
//        System.out.println("@email:" + properties.getProperty("email"));
//
//        Properties prop = new Properties();
//        prop.setProperty("name", "Shibu");
//        prop.setProperty("email", "panda");
//        prop.setProperty("address", "Bang");
//        QXClient.get().propUtils().addProperties(prop, System.getProperty("user.dir") + "/configs/config.properties");

//        Properties prop1 = new Properties();
//        prop.setProperty("newEmail", "Shibu@email.com");
//        QXClient.get().propUtils().addProperties(prop1, new File(System.getProperty("user.dir") + "/configs/config.properties"));
//
//        QXClient.get().propUtils().setGlobalVariable("key", new File(""));
//        File file5 = (File) QXClient.get().propUtils().getGlobalVariable("key");
//        Assert.assertTrue(false);
//    }

	/*
	 * @Author(name="Sandhya")
	 * 
	 * @Test() public void Test2() throws InterruptedException, IOException {
	 * System.out.println("Outer Test2"); //
	 * QXClient.get().report().info("Hi I am info log"); //
	 * QXClient.get().driver().getPageSource(); //
	 * QXClient.get().screenshotUtils().captureFile(); // Assert.assertTrue(false);
	 * QXClient.get().logger().info("Test2 1: " + UUID.randomUUID().toString()); }
	 */

    @Author(name="Prafulla")
    @Test()
    public void Test3() throws InterruptedException, IOException, Exception {
        System.out.println("Outer Test3");
      QXClient.get().report().info("Hi I am info log");
//        QXClient.get().driver().getPageSource();
//        QXClient.get().screenshotUtils().captureFile();
//        QXClient.get().loggger().info("My First Log: " + UUID.randomUUID().toString());
     //   QXClient.get().logger().info("Test3 1: " + UUID.randomUUID().toString());
      QXClient.get().driver();
		  GSheet gsheet = QXClient.get().GSheet("18Q08gC5kzqIRjVTRraTh-FX6Oc4n9plIpgpgR7705ks");
		 String gValu= gsheet.getCellValue("CC",4,"A"); 
		  System.out.println("Gvalue" +gValu);

	  gsheet.setCellValue("CC", 5, "A",  "Hello");
		 
    }

//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("@AfterMethod");
//    }
}
