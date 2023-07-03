package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderToExcel {
	WebDriver driver;
	@Test(dataProvider="getData", dataProviderClass=DataFromExcel.class )
	public void LoginTest(String username, String password) {
		System.setProperty("webdriver.chrome.drive","F:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qalegend.com/billing/public/login");
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwrd=driver.findElement(By.xpath("//input[@id='password']"));
		uname.clear();
		uname.sendKeys(username);
		passwrd.sendKeys(password);
}
}
