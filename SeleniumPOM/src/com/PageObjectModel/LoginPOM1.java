package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPOM1 {
	
	@FindBy(how = How.ID, using="email")
	public static WebElement UserName;
	@FindBy(id ="password")
	public static WebElement Password;
	@FindBy(xpath ="//button[@type='submit']")
	public static WebElement Submitbtn;
	

}
