package com.ams.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.demo.base.BaseTest;

public class SideBar extends BaseTest{
	
	//Click on Expenditure head tab
	public void ClickOnExpenditrureHead() {
		WebElement expenditureHeadTab = driver.findElement(By.xpath(loc.getProperty("EXPENDITURE_HEAD_TAB")));
		try {
			expenditureHeadTab.click();
			test.pass("Successfully clicked on expenditure head tab");
		} catch(AssertionError e) {
			test.fail("Unable to click on expenditure head tab");
		}
	}
	
	//Validate Expenditure Head Url
	public void ValidateExpenditureHeadScreen() {
		String expectedUrl = config.getProperty("amsExpenditureHeadUrl");
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Expenditure Head Screen");
			System.out.println(actualUrl);
		} catch(AssertionError e) {
			test.fail("Unable to redirected to Expenditure Head screen");
			System.out.println(actualUrl);
		}
	}
	
	//Click on Credit Tab
	public void ClickOnCredit() {
		WebElement creditTab = driver.findElement(By.xpath(loc.getProperty("CREDIT_TAB")));
		try {
			creditTab.click();
			test.pass("Successfully clicked on Credit tab");
		} catch(AssertionError e) {
			test.fail("Unable to click on Credit tab");
		}
	}
	
	//Validate credit Url
	public void ValidateCreditScreen() {
		String expectedUrl = config.getProperty("amsCreditUrl");
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Credit Screen");
			System.out.println(actualUrl);
		} catch(AssertionError e) {
			test.fail("Unable to redirected to Credit screen");
			System.out.println(actualUrl);
		}
	}
	
	
	//Click on Vendor Tab
	public void ClickOnVendor() {
		WebElement vendorTab = driver.findElement(By.xpath(loc.getProperty("VENDOR_TAB")));
		try {
			vendorTab.click();
			test.pass("Successfully clicked on Vendor tab");
		} catch(AssertionError e) {
			test.fail("Unable to click on Vendor tab");
		}
	}
	
	//Validate Vendor Url
	public void ValidateVendorScreen() {
		String expectedUrl = config.getProperty("amsVendorsUrl");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Expected: " + expectedUrl);
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Vendors Screen");
			System.out.println(actualUrl);
			System.out.println("Expected: " + expectedUrl);
		} catch(AssertionError e) {
			test.fail("Unable to redirected to Vendors screen");
			System.out.println(actualUrl);
		}
	}
	
	
	//Click on Customer Tab
	public void ClickOnCustomer() {
		WebElement customerTab = driver.findElement(By.xpath(loc.getProperty("CUSTOMERS_TAB")));
		try {
			customerTab.click();
			test.pass("Successfully clicked on Customer tab");
		} catch(AssertionError e) {
			test.fail("Unable to click on Customer tab");
		}
	}
	
	//Validate Customer Url
	public void ValidateCustomerScreen() {
		String expectedUrl = config.getProperty("amsCustomersUrl");
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Customer Screen");
			System.out.println(actualUrl);
		} catch(AssertionError e) {
			test.fail("Unable to redirected to Customer screen");
			System.out.println(actualUrl);
		}
	}
	
	
	//Click on Loan Tab
	public void ClickOnLoans() {
		WebElement loansTab = driver.findElement(By.xpath(loc.getProperty("LOANS_TAB")));
		try {
			loansTab.click();
			test.pass("Successfully clicked on Loans tab");
		} catch(AssertionError e) {
			test.fail("Unable to click on Loans tab");
		}
	}
	
	//Validate Loan Url
	public void ValidateLoansScreen() {
		String expectedUrl = config.getProperty("amsLoansUrl");
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Loans Screen");
			System.out.println(actualUrl);
		} catch(AssertionError e) {
			test.fail("Unable to redirected to Loans screen");
			System.out.println(actualUrl);
		}
	}
	
	
	//Click on Invoice Tab
	public void ClickOnInvoice() {
		WebElement invoiceTab = driver.findElement(By.xpath(loc.getProperty("INVOICE_TAB")));
		try {
			invoiceTab.click();
			test.pass("Successfully clicked on Invoice tab");
		} catch(AssertionError e) {
			test.fail("Unable to click on Invoice tab");
		}
	}
	
	//Validate Invoice Url
	public void ValidateInvoiceScreen() {
		String expectedUrl = config.getProperty("amsInvoiceUrl");
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Invoice Screen");
			System.out.println(actualUrl);
		} catch(AssertionError e) {
			test.fail("Unable to redirected to Invoice screen");
			System.out.println(actualUrl);
		}
	}
	
	
	
	//Click on Resource Tab
	public void ClickOnResource() {
		WebElement resourceTab = driver.findElement(By.xpath(loc.getProperty("RESOURCE_TAB")));
		try {
			resourceTab.click();
			test.pass("Successfully clicked on Resource tab");
		} catch(AssertionError e) {
			test.fail("Unable to click on Resource tab");
		}
	}
	
	//Validate Resource Url
	public void ValidateResourceScreen() {
		String expectedUrl = config.getProperty("amsResourceUrl");
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Resource Screen");
			System.out.println(actualUrl);
		} catch(AssertionError e) {
			test.fail("Unable to redirected to Resource screen");
			System.out.println(actualUrl);
		}
	}




}
