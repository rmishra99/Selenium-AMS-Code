package com.ams.testcases;

import org.testng.annotations.Test;

import com.ams.modules.Login;
import com.ams.modules.SideBar;
import com.demo.base.BaseTest;



public class SideBarTestCases extends BaseTest{
	
	SideBar sidebar = new SideBar();
	Login loginAms = new Login();
	
	@Test(priority = 1)
	public void CheckExpenditureHeadScreen() throws InterruptedException {
		test = extent.createTest("Verify SideBar").assignCategory("Regression").assignCategory("Sanity");
		loginAms.EnterLoginUsernameOnStagging();
		loginAms.EnterLoginPasswordOnStagging();
		loginAms.ClickSignInButtonOnStagging();
		Thread.sleep(2000);
		loginAms.VerifyExpensePageOnStagging();
		Thread.sleep(2000);
		sidebar.ClickOnExpenditrureHead();
		Thread.sleep(2000);
		sidebar.ValidateExpenditureHeadScreen();
		Thread.sleep(2000);
		sidebar.ClickOnCredit();
		Thread.sleep(2000);
		sidebar.ValidateCreditScreen();
		Thread.sleep(2000);
		sidebar.ClickOnVendor();
		Thread.sleep(2000);
		sidebar.ValidateVendorScreen();
		Thread.sleep(2000);
		sidebar.ClickOnCustomer();
		Thread.sleep(1000);
		sidebar.ValidateCustomerScreen();
		Thread.sleep(2000);
		sidebar.ClickOnLoans();
		Thread.sleep(2000);
		sidebar.ValidateLoansScreen();
		Thread.sleep(2000);
		sidebar.ClickOnInvoice();
		Thread.sleep(2000);
		sidebar.ValidateInvoiceScreen();
		Thread.sleep(2000);
		sidebar.ClickOnResource();
		Thread.sleep(2000);
		sidebar.ValidateResourceScreen();
	}
	


	

}
