package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GotoCustPage1 {
	
	@FindBy(xpath="//html/body/div[2]/div/aside/ul/li[2]/a/span[1]")
	public static WebElement Enquiries;
	
	@FindBy(xpath="//html/body/div[2]/div/aside/ul/li[2]/ul/li[2]/a/span[1]")
	public static WebElement Inprogress;
	
	@FindBy(xpath="//*[@id=\"DataTables_Table_0_filter\"]/label/input")
	public static WebElement Searchbox;
	
	@FindBy(xpath ="//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[6]/a/i")
	public static WebElement CustomerIcon;

}
