package com.ams.modules;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.demo.base.BaseTest;

public class ExpenseScreen extends BaseTest{
	
	//Edit expense
	public void EditExpense() {
		WebElement editExpense = driver.findElement(By.xpath(loc.getProperty("EDIT_EXPENSE")));
		try {
			editExpense.click();
			test.pass("Edit expense is clicked");
		} catch(AssertionError e){
			test.fail("Unable to click edit expense");
		}
	}
	
	
	//Edit expense text validate
	public void EditExpenseText() {
		WebElement editExpenseText= driver.findElement(By.xpath(loc.getProperty("EDIT_EXPENSE_TEXT")));
		String expectedText = config.getProperty("editExpenseText");
		String actualText = editExpenseText.getText();
		System.out.println(actualText);
		try {
			Assert.assertEquals(expectedText, actualText);
			test.pass("Edit expense screen open successfully: " + actualText);
		}catch(AssertionError e) {
			test.fail("Unable to open edit expense screen");
		}
	}
	
	//Cross button
	public void CrossButton() {
		 WebElement crossButton = driver.findElement(By.xpath(loc.getProperty("CROSS_BUTTON")));
		 try {
			 crossButton.click();
			 test.pass("Cross button on edit expense screen is clicked successfully");
		 } catch(AssertionError e) {
			 test.fail("Unable to click on cross button on edit expense screen");
		 }
	}
	
	//Hover on Bank Name
	public void HoverOnBankName() {
		WebElement bankNameField = driver.findElement(By.id(loc.getProperty("BANK_NAME")));
		boolean hoverBankName = bankNameField.isEnabled();
		if(!hoverBankName) {
			test.pass("Bank Name field is disabled!!");
		} else {
			test.fail("Bank Name field is enabled");
		}
	}
	
	//Hover on Reference Number
	public void HoverOnReferenceNumber() {
		WebElement referenceNumber = driver.findElement(By.id(loc.getProperty("REFERENCE_NUMBER")));
		boolean hoverReferenceNumber = referenceNumber.isEnabled();
		if(!hoverReferenceNumber) {
			test.pass("Reference Number is disabled!!");
		} else {
			test.fail("Reference number is enabled");
		}
	}
	
	//Hover on Date of expense
	public void HoverOnDateOfExpense() {
		WebElement dateOfExpense = driver.findElement(By.id(loc.getProperty("DATE_OF_EXPENSE")));
		boolean hoverDate = dateOfExpense.isEnabled();
		if(!hoverDate) {
			test.pass("Date is disabled!!");
		} else {
			test.fail("Date is enabled");
		}
	}
	
	//select on Internal Payment
	public void SelectOnInternalPayment() {
		WebElement internalPayment = driver.findElement(By.id(loc.getProperty("INTERNAL_PAYMENT")));
		try {
			internalPayment.click();			
			test.pass("Internal Payment is Selected");
		} catch(AssertionError e) {
			test.fail("Unable to select internal payment check box");
		}
	}
	
	//Click on Submit button
	public void ClickOnExpenseSubmitButton() {
		WebElement clickOnSubmitButton = driver.findElement(By.xpath(loc.getProperty("EXPENSE_SUBMIT_BUTTON")));
		try {
			clickOnSubmitButton.click();
			test.pass("Submit button is clicked");
		} catch(AssertionError e) {
			test.fail("Unable to click expense submit button");
		}
		
	}
	
	//Validate expense screen after submit button
	public void validateExpenseText() {
		WebElement validateExpenseText = driver.findElement(By.xpath(loc.getProperty("EXPENSE_TEXT")));
		String expectedText = config.getProperty("expenseText");
		String actualText = validateExpenseText.getText();
		System.out.println(actualText);
		try {
			Assert.assertEquals(expectedText, actualText);
			test.pass("Able to get on expense screen: " + actualText);
		}catch(AssertionError e) {
			test.fail("Unable to get into expense screen");
		}
	}
	
	//Click on upload file button
	public void clickOnUploadFile() {
		WebElement clickOnUploadFile = driver.findElement(By.xpath(loc.getProperty("UPLOAD_BUTTON")));
		clickOnUploadFile.click();
		try {
			test.pass("File button is clicked successfully");
		} catch (AssertionError e) {
			test.fail("Unable to click on upload file");
		}
	}

	
	//File Upload
	public void fileUpload()  {
		File fileUpload = new File("/home/innobit/Pictures/Screenshots/Screenshot from 2024-03-12 16-28-18.png");
		WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
	
        fileInput.sendKeys(fileUpload.getAbsolutePath());
    
//    driver.findElement(By.id("file-select")).click();
        try {
        	test.pass("File is uploaded successfully");
        } catch(AssertionError e) {
        	test.fail("Unable to upload the file");
        }
	}

}
