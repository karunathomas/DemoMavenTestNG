package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebdriverManagerClass {
	WebDriver driver;
	@BeforeTest
	public void setupp() {
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public void Test() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		}
}
