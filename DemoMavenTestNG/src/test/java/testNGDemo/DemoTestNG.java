package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	@BeforeSuite 
	public void setUp() { 
		System.out.println("setup system property for chrome"); 
		} 
	@BeforeTest 
	public void login() { 
		System.out.println("login to app"); 
		} 
	@BeforeClass 
	public void launchBrowser() { 
		System.out.println("launch chrome browser"); 
		}
	//Before method will run prior to each test
	@BeforeMethod 
	public void clickUrl() { 
		System.out.println("clicked url"); 
		} 
	@Test 
	public void googleTitletest() { 
		System.out.println("google Title test"); 
		} 
	@Test 
	public void googleseacrch() { 
		System.out.println("google serch test"); 
		} 
	//postcondtions 
	@AfterMethod 
	public void logout() { 
		System.out.println("logout from app"); 
		} 
	@AfterClass 
	public void closebrowser() { 
		System.out.println("close browser"); 
		} 
	@AfterTest 
	public void deletecookies() { 
		System.out.println("delete cookies"); 
		} 
	@AfterSuite 
	public void generatereport() { 
		System.out.println("generate est report "); 
		}
}
