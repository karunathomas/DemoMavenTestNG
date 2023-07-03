package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HWParellelGoogle {
	WebDriver driver;

	@Test
	public void googleSearch() throws InterruptedException {
		System.setProperty("webdriver.chrome.drive","F:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement textarea=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		textarea.click();
		textarea.sendKeys("Selenium");
		textarea.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Google Search");
	}
}
