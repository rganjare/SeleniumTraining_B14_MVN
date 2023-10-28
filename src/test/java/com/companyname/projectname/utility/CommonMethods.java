package com.companyname.projectname.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.companyname.projectname.testbase.TestBase;
import com.google.common.io.Files;

public class CommonMethods extends TestBase {

	public static void clickOnWebElement(String xpath) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
		driver.findElement(By.xpath(xpath)).click();
		test.pass("User clicked on " + xpath);

	}

	public static void selectradioButtonOrCheckBox(String xpath, String radioBtn) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
		driver.findElement(By.xpath(xpath)).click();
		test.pass("User selectradioButtonOrCheckBox " + radioBtn);

	}

	public static void enterTextIntoTextBox(String xpath, String testDate) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
		driver.findElement(By.xpath(xpath)).sendKeys(testDate);
		test.pass("User entered "+ testDate +" text in to the TextBox");
		//takeScreenShot();
		
	}
	
	public static void verifypageTile(String expectedTitle) {
		String actualTtle= driver.getTitle();		
		Assert.assertEquals(actualTtle, expectedTitle); // Verification point		
		test.pass("User landed on the page:- " + actualTtle);
		
	}
	
	public static void verifyText(String xpath, String expectedText) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
		String actualText= driver.findElement(By.xpath(xpath)).getText();
		Assert.assertEquals(actualText, expectedText); // Verification point		
		test.pass(expectedText + " is displayed on the page.");		
	}

	public static void validateTextOnThePage(String xpath, String expectedText) {

		driver.findElement(By.xpath(xpath)).isDisplayed();

		String a_text = driver.findElement(By.xpath(xpath)).getText();
		
		//takeScreenShot();
		
		Assert.assertEquals(a_text, expectedText);
		
		//takeScreenShot();

	}

	public static void selectByValue(String xpath, String value) {

		driver.findElement(By.xpath(xpath)).isDisplayed();

		Select sel = new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByValue(value);

	}

	public static void selectByText() {

	}

	public static void selectByIndex() {

	}

	public static void mouseHoverOperatopn() {

	}
	
	
	// .git // GitHub -- Push
	
	public static void takeScreenShot()  {
		
	String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	File Dest = new File("/Users/rganjare/eclipse/WorkSpace/SeleniumTraining_B14_MVN/src/test/resources/screenShots/actulScreenShot" 
	//+ System.currentTimeMillis()+ ".png");
			+ timeStamp+ ".png");
	try {
		Files.copy(scrFile, Dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	test.addScreenCaptureFromPath(Dest.getAbsolutePath());
	
	//String errflpath = Dest.getAbsolutePath();
	//return errflpath;
	
	}

}
