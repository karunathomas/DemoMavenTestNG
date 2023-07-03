package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo { 
		WebDriver driver;
		  @Test(dataProvider="logintestdata")
		   public void obsLoginTest(String username, String password)
		   {
			  System.setProperty("webdriver.chrome.drive","C:\\Users\\admin\\Downloads\\chromedriver_win32.zip");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://qalegend.com/billing/public/login");
				
				WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
				WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		        name.clear();
		        name.sendKeys(username);
		        pass.clear();
		        pass.sendKeys(password);
		   }
		 @DataProvider(name="logintestdata")
		  public Object[][] logintestdata()
		  {
			 Object[][] data=new Object[3][2];
			 data[0][0]="admin";
			 data[0][1]="ad123";
			 
			 data[1][0]="ad456";
			 data[1][1]="3456";
			 
			 data[2][0]="ad567";
			 data[2][1]="6789";
			 
			 return data;
		  }
}
