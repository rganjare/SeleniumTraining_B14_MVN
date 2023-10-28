package com.companyname.projectname.pages;

import java.util.Hashtable;


import com.companyname.projectname.testbase.TestBase;
import com.companyname.projectname.utility.CommonMethods;

public class HomePage extends TestBase { // POM -- Page Object Model -- Design Pattern -- Framework 
	
	
	public HomePage verifyHomePage(Hashtable<String, String> ht) {
		
		CommonMethods.verifypageTile(ht.get("Page_Title"));
		
		return this;
		
	}
	
	public static InquiryPage navigateToInquiryPage() {
		
		CommonMethods.clickOnWebElement(or.getProperty("inquiryPage"));
			
		return new InquiryPage();
		
	}
	
	public static InquiryPage navigateToReviewPage() {
		
		CommonMethods.clickOnWebElement(or.getProperty("ReviewPage"));
		
		//return new ReviewPage();
			
		return new InquiryPage();
		
	}

	public static InquiryPage navigateToSeniumAndCucumberPage() {
	
	CommonMethods.clickOnWebElement(or.getProperty("SeniumAndCucumberPage"));
		
	//return new SeniumAndCucumberPage();
	
	return new InquiryPage();
	
}

	public static FeedbackPage navigateToFeedBackPage() {
	
	CommonMethods.clickOnWebElement(or.getProperty("feedbackPage"));
		
	return new FeedbackPage();
	
}
	
	public HomePage registerUser() {
		
		CommonMethods.clickOnWebElement(or.getProperty(""));
		
		return this;
	}
	
	public static void login() {
		
		CommonMethods.clickOnWebElement(or.getProperty(""));
		
	}
	
// POM - The method which is taking you to the next page is responsible to create the object of that particular page

}
