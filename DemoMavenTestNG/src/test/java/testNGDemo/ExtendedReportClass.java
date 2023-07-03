package testNGDemo;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendedReportClass {
	ExtentReports extent = new ExtentReports(); 
	WebDriver driver; 
	@BeforeSuite 
	public void setup() { 
		ExtentSparkReporter reporter = new ExtentSparkReporter("extent-report.html"); 
		reporter.config().setReportName("Extent Report"); 
		//specifying that which report is using bcoz there are diff. types of extend report, here  we using spark reporter so passing the object
		extent.attachReporter(reporter); 
		// String path=System.getProperty("webdriver.chrome.driver",path+) 
		// to specify additional info
		extent.setSystemInfo("company Name", "IGBEG pvt.ltd"); 
		extent.setSystemInfo("Author", " Pooja"); 
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); 
		} 
	/*@Test 
	public void testtt() { 
		driver.get("https://www.google.com/"); 
		//Extent test defines a class this class is used to add info about test
		//Syntax:ExtentTest test=extent.createTest("TestCaseId","description"); 
		ExtentTest test=extent.createTest("Myfirsttest","sample desc"); 
		//using log in project
		// test.log(Status.INFO, "the test is pass"); //info using to pass information
		// test.info("infooo"); 
		driver.get("https://www.google.com/"); 
		//if test is fail
		//test.log(Status.FAIL, "test is failed");// using log
		test.fail("the test is failed",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build()); 
		test.addScreenCaptureFromPath("screenshot.png"); 
		extent.flush(); 
		}*/
	@Test
	public void loginTest() throws IOException {
		driver.get("https://qalegend.com/mobile_service/panel/login");
		ExtentTest test=extent.createTest("Login Test","Testing Login");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='identity']"));
		username.sendKeys("admin@admin.com");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("passwor");
		WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
		button.click();
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Home";
		if(actualTitle.contentEquals(expectedTitle)) {
		test.log(Status.PASS,"Titles are same");
	}
		else {
			String temp=ExtentScreenshotUtility.getScreenshot(driver);
			test.fail("the test is failed",MediaEntityBuilder.createScreenCaptureFromPath(temp).build()); 
			test.addScreenCaptureFromPath(temp); 
		}
		
		extent.flush(); 
}
}
