package com.companyname.projectname.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.companyname.projectname.testbase.TestBase;
import com.companyname.projectname.utility.CommonMethods;

public class LoginToInstagramWithTestNG extends TestBase { // 1 to 1 Mapping // CTRL+Shift+O
	

	@Test (priority = 0, description = "description-loginToInstagramWithValidCred")
	public void loginToInstagramWithValidCred() throws IOException {
		
		
	//	driver.manage().window().maximize();  // POM
	
		//driver.findElement(By.xpath(or.getProperty("accptcookie"))).click();
		
		CommonMethods.clickOnWebElement(or.getProperty("accptcookie"));
		
		//driver.findElement(By.xpath(or.getProperty("username"))).sendKeys(config.getProperty("username"));
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("username"), config.getProperty("username"));
		
		//driver.findElement(By.xpath(or.getProperty("password"))).sendKeys(config.getProperty("password"));	
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("password"), config.getProperty("password"));
		
	//	driver.findElement(By.xpath(or.getProperty("loginBTN"))).click();
		
		CommonMethods.clickOnWebElement(or.getProperty("loginBTN"));
			
//		boolean errormessage = driver.findElement(By.xpath(or.getProperty("message"))).isDisplayed();
//			
//		System.out.println(errormessage);
//		
//		if(errormessage) {
//			
//		System.out.println("Error Message is:-" + driver.findElement(By.id(or.getProperty("salert"))).getText());
//		
//		} else {
//			
//			System.out.println("User logged in to the Instragram account !!!" );
//		}
			
		CommonMethods.validateTextOnThePage(or.getProperty("message"), "User logged in to the Instragram account !!!" );
		
		//driver.findElement(By.xpath(or.getProperty("FBLoginBtn"))).click();
		
		CommonMethods.clickOnWebElement(or.getProperty("FBLoginBtn"));
			
	}
	
	

}
