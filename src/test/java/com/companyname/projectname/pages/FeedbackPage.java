package com.companyname.projectname.pages;

import java.util.Hashtable;


import com.companyname.projectname.testbase.TestBase;
import com.companyname.projectname.utility.CommonMethods;

public class FeedbackPage extends TestBase { // POM -- Page Object Model -- Design Pattern -- Framework 
	
	
	public FeedbackPage verifyHomePage(Hashtable<String, String> ht) {
		
		CommonMethods.verifypageTile(ht.get("Page_Title"));
		
		return this;
		
	}
	
	
	public static UrbanProPage clickOnUrbanProbtn(String webelement) {
		
		CommonMethods.clickOnWebElement(or.getProperty(webelement));
		
		return new UrbanProPage();
		
	}
	
//	public static void provideFeedbackOnUrbanProPlatform(String webelement) {
//		
//		CommonMethods.clickOnWebElement(or.getProperty(webelement));
//		
//	}
	

}
