package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {
	
	public static WebElement UserName(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement Password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement submitbtn(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}

}
