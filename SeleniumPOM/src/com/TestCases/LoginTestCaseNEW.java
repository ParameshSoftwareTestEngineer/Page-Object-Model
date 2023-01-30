package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObjectModel.GotoCustPage1;
import com.PageObjectModel.LoginPOM1;

public class LoginTestCaseNEW {
	
	@Test 
	public void Login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com/login");
		
		PageFactory.initElements(driver, LoginPOM1.class);
		LoginPOM1.UserName.sendKeys("notification@ftxtradingsoftware.com");
		LoginPOM1.Password.sendKeys("Activation8903233335");
		LoginPOM1.Submitbtn.click();
		Thread.sleep(2000);
		PageFactory.initElements(driver, GotoCustPage1.class);
		GotoCustPage1.Enquiries.click();
		Thread.sleep(2000);
		GotoCustPage1.Inprogress.click();
		Thread.sleep(2000);
		GotoCustPage1.Searchbox.sendKeys("kiran789@gmail.com");
		Thread.sleep(2000);
		GotoCustPage1.CustomerIcon.click();
		
		/*
		 * LoginPOM1.UserName(driver).sendKeys("notification@ftxtradingsoftware.com");
		 * LoginPOM1.Password(driver).sendKeys("Activation8903233335");
		 * LoginPOM1.submitbtn(driver).click(); Thread.sleep(2000);
		 * 
		 * GotoCustPage.Enquiries(driver).click(); Thread.sleep(2000);
		 * GotoCustPage.Inprogress(driver).click(); Thread.sleep(2000);
		 * GotoCustPage.Searchbox(driver).sendKeys("kiran789@gmail.com");
		 * Thread.sleep(2000); GotoCustPage.CustomerIcon(driver).click();
		 */
					
	}

}
