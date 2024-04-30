package com.ams.testcases;

import org.testng.annotations.Test;

import com.ams.modules.ExpenseScreen;
import com.ams.modules.Login;
import com.demo.base.BaseTest;



public class ExpenseTestCases extends BaseTest{
	
	ExpenseScreen expense = new ExpenseScreen();
	Login loginAms = new Login();
	
	//Validate edit expense
	@Test(priority = 1)
	public void editExpense() throws InterruptedException {
		test = extent.createTest("Verify edit expense").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		expense.EditExpense();
		Thread.sleep(2000);
		expense.EditExpenseText();
		Thread.sleep(2000);	
		}
	
	//Verify cross button
	@Test(priority = 2)
	public void checkCrossButton() throws InterruptedException {
		test = extent.createTest("Verify cross button").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		expense.EditExpense();
		Thread.sleep(2000);
		expense.CrossButton();
		Thread.sleep(2000);
		loginAms.VerifyExpensePageOnStagging();
		Thread.sleep(2000);		
	}
	
	//Hover on disabled fields
	@Test(priority = 3)
	public void hoverOnBankName() throws InterruptedException {
		test = extent.createTest("Verify hover on Disabled field").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		expense.EditExpense();
		Thread.sleep(2000);
		expense.HoverOnBankName();
		Thread.sleep(2000);
		expense.HoverOnReferenceNumber();
		Thread.sleep(2000);
		expense.HoverOnDateOfExpense();
	}
	
	//Click on Internal payment
	@Test(priority = 4)
	public void clickOnInternalPayment() throws InterruptedException {
		test = extent.createTest("Verify click on internal payment button").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		expense.EditExpense();
		Thread.sleep(2000);
		expense.SelectOnInternalPayment();
		Thread.sleep(2000);
	}
	
	//Click on submit button
	@Test(priority = 5)
	public void clickOnSubmitButton() throws InterruptedException {
		test = extent.createTest("Verify Expense submit button").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		expense.EditExpense();
		Thread.sleep(2000);
		expense.clickOnUploadFile();
		Thread.sleep(2000);
		expense.fileUpload();
		Thread.sleep(5000);		
		expense.SelectOnInternalPayment();
		Thread.sleep(2000);
		expense.ClickOnExpenseSubmitButton();
		Thread.sleep(2000);
		expense.validateExpenseText();
		Thread.sleep(2000);
		
	}

}
