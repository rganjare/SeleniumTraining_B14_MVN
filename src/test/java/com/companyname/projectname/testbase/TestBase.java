package com.companyname.projectname.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.bymatautomation.seleniumtraining.DataCollection;
import com.bymatautomation.seleniumtraining.ExcelReader;
import com.companyname.projectname.pages.HomePage;


public class TestBase { 

// Engine or Heart

	public static WebDriver driver; // WebDriver Interface

	public static Properties config;
	public static Properties or;
	
	public static ExtentTest test;
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	
	public static String testCaseName="";
	
	public static ExcelReader excel;
	
	public static Hashtable<String, String> run_mode = new Hashtable<>();
	
	public static HomePage hp;

	@BeforeSuite// 1 time activity
	public void init() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/propertiesFiles/config.properties");	
				//+ "\\src\\test\\resources\\propertiesFiles\\config.properties");
		config = new Properties();
		config.load(fis);

		System.out.println("Config file has been loaded");

		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/propertiesFiles/OR.properties");
				//+ "\\src\\test\\resources\\propertiesFiles\\OR.properties");
		or = new Properties();
		or.load(fis1);
		System.out.println("OR file has been loaded");
		
		
		excel = new ExcelReader(System.getProperty("user.dir") + "/src/test/resources/testData/Master_Sheet.xlsx");
		
		System.out.println("Master sheet loaded");
		
		loadHashTable();
	
		report = new ExtentReports();
		
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/src/test/resources/executionReports/" + 
				"ExtentReportResult_" + config.getProperty("Sprint")+"_"+timeStamp+ "_.html");
		
		report.attachReporter(spark);		

	}
	
	@BeforeClass
	public void getTestCaseNameAndStartReporting() {
		
		testCaseName = this.getClass().getSimpleName();
		
		test = report.createTest(testCaseName);	
				
//		if(!run_mode.get(testCaseName).equalsIgnoreCase("Y")) 
//			throw new SkipException("Skipping Test Case "+testCaseName+ " is it's Run Mode is set to No");
		
		if(run_mode.get(testCaseName).equalsIgnoreCase("Y")) {			
			//test.info("Running the Test Case "+testCaseName);	
		}
		else {
			//test.info("Skipping Test Case "+testCaseName+ " as it's Run Mode is set to No");
			throw new SkipException("Skipping Test Case "+testCaseName+ " as it's Run Mode is set to No");
			
		}
		
	}

	@BeforeMethod
	public void launchBrowser() {

		if (config.getProperty("browser").equalsIgnoreCase("CHROME")) {

			driver = new ChromeDriver(); // Responsible to launch the browser

		} else if (config.getProperty("browser").equalsIgnoreCase("EDGE")) {

			driver = new EdgeDriver();

		} else {

			driver = new FirefoxDriver();
		}

		driver.get(config.getProperty("TestAppURL"));
		
		//System.out.println("User navigated to the Application URL " +config.getProperty("AppURL"));
		
		test.info("User navigated to the Application URL " +config.getProperty("TestAppURL"));	
		

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		hp = new HomePage();

//		String actualResult_pagetilte = driver.getTitle(); 
//
//		//System.out.println("actualResult_pagetilte is " + actualResult_pagetilte);
//		
//		//test.info("actualResult_pagetilte is " + actualResult_pagetilte);
//
//		Assert.assertEquals(actualResult_pagetilte, "BYMAT Automation - Boost your Mind with Automation Technology"); // Verification point
//		
//		test.pass("User landed on the page:- " + actualResult_pagetilte);

	}
	
	@DataProvider
	public Object[][] data_Collection() {
		
		DataCollection dc = new DataCollection(excel, "Test_Data", testCaseName);
			
		return dc.dataArray();
		
	}
	
	@AfterMethod
	public void quitDriver() {
		//Thread.sleep(3000);
		driver.quit();  // Kill the instance of driver	
	}

//	@AfterClass
//	public void closeTest() {

//	}
	
	
	@AfterSuite
	public void generateReport() {
		report.flush();
		
	}
	
	public static void loadHashTable() {
		
		int rows = excel.getRowCount("Test_Cases");
		
		for(int i = 2; i<=rows ; i++) {
		
		String key = excel.getCellData("Test_Cases", "TestCaseName", i);
		
		String value = excel.getCellData("Test_Cases", "Run_Mode", i);
		
		run_mode.put(key, value);
		
		}
		
		System.out.println("HashTable Run Mode :- " +run_mode);
		
	}
	
	
}
