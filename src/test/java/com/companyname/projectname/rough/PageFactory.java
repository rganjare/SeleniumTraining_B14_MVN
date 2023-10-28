package com.companyname.projectname.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.companyname.projectname.testbase.TestBase;

public class PageFactory extends TestBase {

	private WebDriver driver;
	
	@FindBy(xpath =  "//*[text() = \"Allow all cookies\"]")
	public WebElement accptcookie;
	
	By userName = By.xpath("//*[@id='user_full_name']");
	
	
	public PageFactory(WebDriver driver) {
		
	org.openqa.selenium.support.PageFactory.initElements(this.driver, driver);
	
	}		

 
	
}
