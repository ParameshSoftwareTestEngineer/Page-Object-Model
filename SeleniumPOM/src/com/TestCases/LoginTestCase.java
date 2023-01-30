package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PageObjectModel.GotoCustPage;
import com.PageObjectModel.LoginPOM;

public class LoginTestCase {
 
	@Test 
	public void Login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com/login");
		
		//LoginPOM login = new LoginPOM();
		LoginPOM.UserName(driver).sendKeys("notification@ftxtradingsoftware.com");
		LoginPOM.Password(driver).sendKeys("Activation8903233335");
		LoginPOM.submitbtn(driver).click();
		Thread.sleep(2000);
		
		GotoCustPage.Enquiries(driver).click();
		Thread.sleep(2000);
		GotoCustPage.Inprogress(driver).click();
		Thread.sleep(2000);
		GotoCustPage.Searchbox(driver).sendKeys("kiran789@gmail.com");
		Thread.sleep(2000);
		GotoCustPage.CustomerIcon(driver).click();
					
	}
	
}
