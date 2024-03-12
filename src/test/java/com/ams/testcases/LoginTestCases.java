package com.ams.testcases;

import org.testng.annotations.Test;

import com.ams.modules.Login;
import com.demo.base.BaseTest;


public class LoginTestCases extends BaseTest {
	
	Login loginAms = new Login();
	
	@Test(priority = 1)
	public void loginWithValidCredentials() throws InterruptedException {
		test = extent.createTest("Verify Login with valid credentials").assignCategory("Regression").assignCategory("Sanity");
		loginAms.EnterLoginUsernameOnStagging();
		loginAms.EnterLoginPasswordOnStagging();
		loginAms.ClickSignInButtonOnStagging();
		Thread.sleep(5000);
		loginAms.VerifyExpensePageOnStagging();
		Thread.sleep(2000);
		loginAms.clickOnProfileIcon();
		Thread.sleep(2000);
		loginAms.clickOnLogout();
		Thread.sleep(2000);
		loginAms.clickOnLogoutYes(); 
		Thread.sleep(2000);
		loginAms.loginScreen();
		
	}
	
	
	@Test(priority = 2)
	public void loginWithInvalidUserName() throws InterruptedException{
		test =extent.createTest("Verify Login with Invalid username").assignCategory("Regression").assignCategory("Sanity");
		loginAms.EnterInvalidUsernameOnStagging();
		loginAms.EnterLoginPasswordOnStagging();
		loginAms.ClickSignInButtonOnStagging();
		Thread.sleep(2000);
		loginAms.InvalidCredentialPopUp();
		Thread.sleep(2000);
		loginAms.loginScreen();
	}
	
	@Test(priority = 3)
	public void loginWithInvalidPassword() throws InterruptedException{
		test =extent.createTest("Verify Login with Invalid Password").assignCategory("Regression").assignCategory("Sanity");
		loginAms.EnterLoginUsernameOnStagging();
		loginAms.EnterInvalidPasswordOnStagging();
		loginAms.ClickSignInButtonOnStagging();
		Thread.sleep(2000);
		loginAms.InvalidCredentialPopUp();
		Thread.sleep(2000);
		loginAms.loginScreen();
	}
	
	@Test(priority = 4)
	public void loginWithBothInvalidCredentials() throws InterruptedException{
		test =extent.createTest("Verify Login with Invalid UserName and Password").assignCategory("Regression").assignCategory("Sanity");
		loginAms.EnterInvalidUsernameOnStagging();
		loginAms.EnterInvalidPasswordOnStagging();
		loginAms.ClickSignInButtonOnStagging();
		Thread.sleep(2000);
		loginAms.InvalidCredentialPopUp();
		Thread.sleep(2000);
		loginAms.loginScreen();
	}
	
	@Test(priority = 5)
	public void CheckEyeIcon() throws InterruptedException{
		test =extent.createTest("Verify Eye Icon").assignCategory("Regression").assignCategory("Sanity");
		loginAms.EnterLoginUsernameOnStagging();
		loginAms.EnterLoginPasswordOnStagging();
		Thread.sleep(2000);
		loginAms.ClickOnEyeIcon();
		Thread.sleep(2000);
		loginAms.PasswordVisible();	
	}
	


}
