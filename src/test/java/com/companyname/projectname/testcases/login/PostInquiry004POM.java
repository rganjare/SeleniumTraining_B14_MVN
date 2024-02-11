package com.companyname.projectname.testcases.login;

import java.io.IOException;
import java.util.Hashtable;
import org.testng.annotations.Test;
import com.companyname.projectname.testbase.TestBase;

public class PostInquiry004POM extends TestBase { // 1 to 1 Mapping // CTRL+Shift+O

	@Test (description = "description-loginToInstagramWithValidCred", dataProvider = "data_Collection")
	public void postInquiry004POM(Hashtable<String, String> ht) throws IOException {
		
		
//		HomePage.verifyHomePage(ht);
//		HomePage.navigateToPage();
//		InquiryPage.enterUserDeatils(ht);
//		
		
	
		hp.verifyHomePage(ht)
		 .navigateToInquiryPage()
		 .enterUserDeatils(ht);
	
		
	//	test.pass("Staring Test case PostInquiry001" );
		
//		CommonMethods.clickOnWebElement(or.getProperty("inquiryTab"));
//		
//		//CommonMethods.enterTextIntoTextBox(or.getProperty("name"), "First Name & Lant Name");
//		
//		//CommonMethods.enterTextIntoTextBox(or.getProperty("name"), excel.getCellData("Test_Data", "First_Name", 3));
//		
//		CommonMethods.enterTextIntoTextBox(or.getProperty("name"), ht.get("First_Name"));
//		
//		//CommonMethods.enterTextIntoTextBox(or.getProperty("email"), "support@rahulganjare.com");
//		
//		//CommonMethods.enterTextIntoTextBox(or.getProperty("email"), excel.getCellData("Test_Data", "Email_ID", 3));
//		
//		CommonMethods.enterTextIntoTextBox(or.getProperty("email"), ht.get("Email_ID"));
//		
//		//CommonMethods.enterTextIntoTextBox(or.getProperty("mobile"), "5346275384");
//		
//		//CommonMethods.enterTextIntoTextBox(or.getProperty("mobile"), excel.getCellData("Test_Data", "Phone_No", 3));
//		
//		CommonMethods.enterTextIntoTextBox(or.getProperty("mobile"), ht.get("Phone_No"));
//		
//		//CommonMethods.selectradioButtonOrCheckBox(or.getProperty("course"), "Selenium"); course
//		
//		//CommonMethods.selectradioButtonOrCheckBox(or.getProperty("course"), excel.getCellData("Test_Data", "course", 3));
//		
//		CommonMethods.selectradioButtonOrCheckBox(or.getProperty("course"), ht.get("course"));
//		
//		//CommonMethods.enterTextIntoTextBox(or.getProperty("question"), "Enter your question");
//		
//		//CommonMethods.selectradioButtonOrCheckBox(or.getProperty("question"), excel.getCellData("Test_Data", "Question", 3));
//		
//		CommonMethods.enterTextIntoTextBox(or.getProperty("question"), ht.get("Question"));
//		
//		CommonMethods.clickOnWebElement(or.getProperty("submitbtn"));
//		
	
	}
		

}
