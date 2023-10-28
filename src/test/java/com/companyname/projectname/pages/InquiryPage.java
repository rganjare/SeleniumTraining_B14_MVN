package com.companyname.projectname.pages;

import java.util.Hashtable;


import com.companyname.projectname.testbase.TestBase;
import com.companyname.projectname.utility.CommonMethods;

public class InquiryPage extends TestBase { // POM -- Page Object Model -- Design Pattern -- Framework 
	
	
	public static void verifyInquiryPage(Hashtable<String, String> ht) {
		
		CommonMethods.verifypageTile(ht.get("Page_Title"));
		
	}
	
	public static void enterUserDeatils(Hashtable<String, String> ht) {
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("name"), ht.get("First_Name"));
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("email"), ht.get("Email_ID"));
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("mobile"), ht.get("Phone_No"));
		
		CommonMethods.selectradioButtonOrCheckBox(or.getProperty("course"), ht.get("course"));
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("question"), ht.get("Question"));
		
		CommonMethods.clickOnWebElement(or.getProperty("submitbtn"));
		
	}
	
	public static void backToHome() {
		
		CommonMethods.enterTextIntoTextBox(or.getProperty("name"), "");
		
	}
	

}
