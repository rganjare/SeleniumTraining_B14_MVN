package com.companyname.projectname.utility;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bymatautomation.seleniumtraining.DataCollection;
import com.bymatautomation.seleniumtraining.ExcelReader;

public class ExcelReadingAndWriting {

	
	public static ExcelReader excel = new ExcelReader("/Users/rganjare/eclipse/WorkSpace/SeleniumTraining_B14_MVN/src/test/resources/testData/Master_Sheet.xlsx");
	
	@Test (dataProvider = "data_Collection", priority = 1)
	public static void readingTestData(Hashtable<String, String> ht) {
	
	// excel = new ExcelReader("/Users/rganjare/eclipse/WorkSpace/SeleniumTraining_B14_MVN/src/test/resources/testData/Master_Sheet.xlsx");

	
		//System.out.println(excel.addSheet("NewTestSheet")); Test_Cases
		

//		System.out.println(excel.addColumn("NewTestSheet", "New_Test_Data"));
//		
//		System.out.println(excel.removeColumn("NewTestSheet", 0));
//		
//		System.out.println(excel.addColumn("Test_Cases", "New_Test_Data"));
		
		
//		System.out.println(excel.setCellData("Test_Cases", "TestCaseName", 9,"DummyTestCase"));
//		
//		System.out.println(excel.getCellData("Test_Cases", "TestCaseName", 2));
//		
//		System.out.println(excel.getCellData("Test_Cases", "TestCaseName", 3));
//		
//		System.out.println(excel.getCellData("Test_Cases", "TestCaseName", 5));
		
		
//		System.out.println(excel.getCellData("Test_Data", 0, 0));
//		
//		System.out.println(excel.getCellData("Test_Data", 3, 3));
//		
//		System.out.println(excel.getCellData("Test_Data", 4, 2));
//		
//        System.out.println(excel.getCellData("Test_Data", 5, 8));
//		
//		System.out.println(excel.getCellData("Test_Data", 7, 8));
		
		System.out.println(ht.get("course"));
		
		System.out.println(ht.get("Phone_No"));
		
		System.out.println(ht.get("Page_Title"));
		
		System.out.println(ht.get("Email_ID"));
		
		System.out.println(ht.get("Password"));
		
		System.out.println(ht.get("First_Name1"));
	
		
		//excel.getCellData("Test_Data", 0, 0);
	
	}
	
	@DataProvider
	public Object[][] data_Collection() {
		
		DataCollection dc = new DataCollection(excel, "Test_Data", "PostInquiry002");
			
		return dc.dataArray();
		
	}
	
}
