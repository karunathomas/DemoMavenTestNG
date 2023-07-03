package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HWParellelObsqura {
	WebDriver driver;
	@Test
	public void message() {
		System.setProperty("webdriver.chrome.drive","F:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
				WebElement message=driver.findElement(By.className("form-control"));
				message.sendKeys("Yeah");
				System.out.println("Obsqura");
	}
}
