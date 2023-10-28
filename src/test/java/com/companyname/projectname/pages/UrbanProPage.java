package com.companyname.projectname.pages;

import java.util.Hashtable;


import com.companyname.projectname.testbase.TestBase;
import com.companyname.projectname.utility.CommonMethods;

public class UrbanProPage extends TestBase { // POM -- Page Object Model -- Design Pattern -- Framework 
	
	
	public static void provideFeedbackOnUrbanProPlatform(Hashtable<String, String> ht) {
		
		CommonMethods.clickOnWebElement(or.getProperty("RatingBtn"));
		
		CommonMethods.selectByValue(or.getProperty("Category"), ht.get("AutomationTesting"));
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("description"), ht.get("description"));
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("name_up"), ht.get("First_Name_UP"));
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("mobile_up"), ht.get("mobile_up"));
		
		CommonMethods.clickOnWebElement(or.getProperty("continuebtn"));
		
	}
	

}
