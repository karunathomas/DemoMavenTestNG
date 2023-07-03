package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGoogleTest {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.drive","E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
	}
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void searchBox() throws InterruptedException {
		WebElement textarea=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		textarea.click();
		textarea.sendKeys("Selenium");
		textarea.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//h3[text()='Selenium']//parent::a"));
		logo.click();
	}
//	@Test
//	public void selectLink() {
//		WebElement link=driver.findElement(By.linkText("Selenium"));
//		link.click();
//	}
//	@Test
//	public void logoDisplay() {
//		WebElement logo=driver.findElement(By.xpath("//h3[text()='Selenium']//parent::a"));
//		logo.click();
//	}
	@Test
	public void logoTest() {
		WebElement logo2=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		if(logo2.isDisplayed()) {
			System.out.println("Logo is displayed");
		}
			else {
				System.out.println("Logo is not displayed");
			}
		}
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
