package com.ams.testcases;

import org.testng.annotations.Test;

import com.ams.modules.ExpenditureHead;
import com.ams.modules.Login;
import com.ams.modules.SideBar;
import com.demo.base.BaseTest;

public class ExpenditureHeadTestCases extends BaseTest {
	
	Login loginAms = new Login();
	SideBar sidebar = new SideBar();
	ExpenditureHead expenditureHead = new ExpenditureHead();
	
	//Click on Create button
	@Test(priority = 1)
	public void clickOnCreateButton() throws InterruptedException {
		test = extent.createTest("Verify click on create button").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		sidebar.ClickOnExpenditrureHead();
		Thread.sleep(2000);
		expenditureHead.clickOnCreateButton();
		Thread.sleep(2000);
		expenditureHead.validateCreateButton();
		Thread.sleep(2000);
		}
	
	//Check all labels
	@Test(priority = 2)
	public void checkLabels() throws InterruptedException {
		test = extent.createTest("Verify all labels").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		sidebar.ClickOnExpenditrureHead();
		Thread.sleep(2000);
		expenditureHead.clickOnCreateButton();
		Thread.sleep(2000);
		expenditureHead.expenditureNameLabel();
		Thread.sleep(2000);
		expenditureHead.labelAbbreviation();
		Thread.sleep(2000);
		expenditureHead.labelParentName();
		Thread.sleep(2000);
		expenditureHead.labelDescription();
		Thread.sleep(2000);
		
	}
	
	//Create expenditure head without parent name
	@Test(priority = 3)
	public void createExpenditureHead() throws InterruptedException {
		test = extent.createTest("Create expenditure head without parent name").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		sidebar.ClickOnExpenditrureHead();
		Thread.sleep(2000);
		expenditureHead.clickOnCreateButton();
		Thread.sleep(2000);
		expenditureHead.clickCancel();
		Thread.sleep(2000);
		sidebar.ValidateExpenditureHeadScreen();
		Thread.sleep(2000);
		expenditureHead.clickOnCreateButton();
		Thread.sleep(2000);
		expenditureHead.clickCross();
		Thread.sleep(2000);
		sidebar.ValidateExpenditureHeadScreen();
		Thread.sleep(2000);
		expenditureHead.clickOnCreateButton();
		Thread.sleep(2000);
		expenditureHead.enterExpenditureName();
		Thread.sleep(2000);
		expenditureHead.enterAbbreviation();
		Thread.sleep(2000);
		expenditureHead.enterDescription();
		Thread.sleep(2000);
		expenditureHead.clickSubmit();
		Thread.sleep(2000);
	}
	
	//Search The created data
	@Test(priority = 4)
	public void searchElement() throws InterruptedException {
		test = extent.createTest("Verify if the data is created").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		sidebar.ClickOnExpenditrureHead();
		Thread.sleep(2000);
		expenditureHead.clickSearch();
		Thread.sleep(2000);
		expenditureHead.searchBar();
		Thread.sleep(2000);
	}
	
	//Check pagination
	@Test(priority = 5)
	public void pagination() throws InterruptedException {
		test = extent.createTest("Verify pagination").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		sidebar.ClickOnExpenditrureHead();
		Thread.sleep(2000);
		expenditureHead.clickPagination();
		Thread.sleep(2000);
	}
	
	//Create expenditure head with parent name
	@Test(priority = 6)
	public void createWithParentName() throws InterruptedException {
		test = extent.createTest("Create expenditure head with parent name").assignCategory("Regression").assignCategory("Sanity");
		loginAms.LoginDirect();
		Thread.sleep(2000);
		sidebar.ClickOnExpenditrureHead();
		Thread.sleep(2000);
		expenditureHead.clickOnCreateButton();
		Thread.sleep(2000);
		expenditureHead.enterExpenditureName();
		Thread.sleep(2000);
		expenditureHead.enterAbbreviation();
		Thread.sleep(2000);
		expenditureHead.selectParentName();
		Thread.sleep(2000);
		expenditureHead.enterDescription();
		Thread.sleep(2000);
		expenditureHead.clickSubmit();
		Thread.sleep(2000);
		
	}
	

}
