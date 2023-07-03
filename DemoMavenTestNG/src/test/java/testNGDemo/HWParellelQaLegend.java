package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HWParellelQaLegend {
	WebDriver driver;
	@Test
	public void LoginTest() {
	System.setProperty("webdriver.chrome.drive","F:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qalegend.com/billing/public/login");
	WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
	WebElement passwrd=driver.findElement(By.xpath("//input[@id='password']"));
	uname.clear();
	uname.sendKeys("admin");
	passwrd.sendKeys("123456");
	WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	button.click();
	System.out.println("QA legend");
}
}
