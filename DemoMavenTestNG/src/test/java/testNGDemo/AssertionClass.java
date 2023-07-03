package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionClass {
WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.drive","E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String exptitle="google";
		
		//Assert.assertEquals(title, exptitle);
		//Assert.assertEquals(title, exptitle,"miss match");
		//missmatch is given to show this as msg
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, exptitle);
		System.out.println("Two Strings are equal");
		WebElement logo2=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		if(logo2.isDisplayed()) {
			System.out.println("Logo is displayed");
		}
			else {
				System.out.println("Logo is not displayed");
			}
		}
}
