package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GotoCustPage {
	
	public static WebElement Enquiries(WebDriver driver) {
		return driver.findElement(By.xpath("//html/body/div[2]/div/aside/ul/li[2]/a/span[1]"));	
	}
	public static WebElement Inprogress(WebDriver driver) {
		return driver.findElement(By.xpath("//html/body/div[2]/div/aside/ul/li[2]/ul/li[2]/a/span[1]"));	
	}
	
	public static WebElement Searchbox(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input"));
	}
	
	public static WebElement CustomerIcon(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[6]/a/i"));
	}
	
}
