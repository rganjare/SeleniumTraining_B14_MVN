package com.companyname.projectname.testcases.login;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.companyname.projectname.testbase.TestBase;

public class ProvideFeedbackOnUrbanPro extends TestBase { // 1 to 1 Mapping // CTRL+Shift+O
	

	@Test (description = "description-loginToInstagramWithValidCred", dataProvider = "data_Collection")
	public void provideFeedbackOnUrbanPro(Hashtable<String, String> ht) throws IOException {
		
		hp.verifyHomePage(ht)
		.navigateToFeedBackPage()
		.clickOnUrbanProbtn("urbanProBtn")
		.provideFeedbackOnUrbanProPlatform(ht);
		
		
		
//		HomePage.verifyHomePage(ht);
//		
//		HomePage.navigateToPage("feedbackPage");
//
//		FeedbackPage.clickOnUrbanProbtn("urbanProBtn");
//		
//		UrbanProPage.provideFeedbackOnUrbanProPlatform(ht);
		
	// Adding new line to see the git changes		
		
//	test.pass("Staring Test case PostInquiry001" );
		
//		CommonMethods.clickOnWebElement(or.getProperty("inquiryTab"));
//
//		CommonMethods.enterTextIntoTextBox(or.getProperty("name"), ht.get("First_Name"));
//		
//		CommonMethods.enterTextIntoTextBox(or.getProperty("email"), ht.get("Email_ID"));
//				
//		CommonMethods.enterTextIntoTextBox(or.getProperty("mobile"), ht.get("Phone_No"));
//					
//		CommonMethods.selectradioButtonOrCheckBox(or.getProperty("course"), ht.get("course"));
//				
//		CommonMethods.enterTextIntoTextBox(or.getProperty("question"), ht.get("Question"));
//		
//		CommonMethods.clickOnWebElement(or.getProperty("submitbtn"));
		
	
	}
		

}
