package com.ams.modules;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.demo.base.BaseTest;

public class Login extends BaseTest{
	
	//Direct Login
	public void LoginDirect() throws InterruptedException {		
		EnterLoginUsernameOnStagging();
		EnterLoginPasswordOnStagging();
		ClickSignInButtonOnStagging();
		Thread.sleep(2000);
		VerifyExpensePageOnStagging();
	}
	
	
	//Username Field
	public void EnterLoginUsernameOnStagging() {
		WebElement username = driver.findElement(By.id(loc.getProperty("LOGIN_USERNAME")));
		username.sendKeys(config.getProperty("adminUsername"));
		try{
			Assert.assertEquals(config.getProperty("adminUsername"), username.getAttribute("value"));
			test.pass("Entered Username: " + username.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to enter username | Actual Username: "+username.getAttribute("value")+"- Expected Username: "+config.getProperty("adminUsername"));
		}
	}
	
	
	//Password Field
	public void EnterLoginPasswordOnStagging() {

		WebElement password = driver.findElement(By.xpath(loc.getProperty("LOGIN_PASSWORD")));
		password.sendKeys(config.getProperty("adminPassword"));
		try{
			Assert.assertEquals(config.getProperty("adminPassword"),password.getAttribute("value"));
			test.pass("Entered Password: " + password.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to enter password");
		}
	}
	
	
	//Log In Button
	public void ClickSignInButtonOnStagging() {
		WebElement loginstag = driver.findElement(By.xpath(loc.getProperty("LOG_IN_BUTTON")));
		try{
			loginstag.click();
			test.pass("Clicked on LogIn Button Successfully");
		} catch (AssertionError e) {
			test.fail("Unable to click on LogIn Button");
		}
	}
	
	
	//Dashboard
	public void VerifyExpensePageOnStagging() {
		String expectedUrl = config.getProperty("amsExpenseUrl");
		String actualUrl = driver.getCurrentUrl();
		try{
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Expense page successfully");
			System.out.println(actualUrl);
		} catch (AssertionError e) {
			test.fail("Unable to redirect on AMS Expense page");
			System.out.println(actualUrl);

		}
		
	}
	
	
	
	//Profile Icon
	public void clickOnProfileIcon() {
		WebElement profileIcon = driver.findElement(By.xpath(loc.getProperty("PROFILE_ICON")));
		try {
			profileIcon.click();
			test.pass("Clicked on Profile Icon");
			
		} catch (AssertionError e) {
			test.fail("Unable to click on Profile Icon");
			
		}
	}
	

	
	//Logout Button
	public void clickOnLogout() {
		WebElement logout = driver.findElement(By.xpath(loc.getProperty("LOGOUT")));
		try {
			logout.click();
			test.pass("Clicked on Logout Option");
			
		} catch (AssertionError e) {
			test.fail("Unable to click logout option");
			
		}
		
	}
	
	
	//Confirm to log out
	public void clickOnLogoutYes() {
		WebElement logoutYes = driver.findElement(By.xpath(loc.getProperty("CONFIRM_YES")));
		try {
			logoutYes.click();
			test.pass("Clicked on Logout Yes Option");
			
		} catch (AssertionError e) {
			test.fail("Unable to click logout Yes option");
			
		}
		
	}
	
     //Login Screen
	public void loginScreen() {
		// TODO Auto-generated method stub
		String expectedUrl = config.getProperty("amsUrl");
		String actualUrl = driver.getCurrentUrl();
		try{
			Assert.assertEquals(actualUrl, expectedUrl);
			test.pass("Redirected to AMS Login page successfully");
			System.out.println(actualUrl);
		} catch (AssertionError e) {
			test.fail("Unable to redirect on AMS Login page");
			System.out.println(actualUrl);

		}
	}

    //Invalid UserName
	public void EnterInvalidUsernameOnStagging() {
		WebElement username = driver.findElement(By.id(loc.getProperty("LOGIN_USERNAME")));
		username.sendKeys(config.getProperty("invalidUserName"));
		try{
			Assert.assertEquals(config.getProperty("invalidUserName"), username.getAttribute("value"));
			test.pass("Entered Username: " + username.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to enter username | expected Username: "+username.getAttribute("value")+"- actual Username: "+config.getProperty("adminUsername"));
		}
		
	}

	//Invalid Password
	public void EnterInvalidPasswordOnStagging() {

		WebElement password = driver.findElement(By.xpath(loc.getProperty("LOGIN_PASSWORD")));
		password.sendKeys(config.getProperty("invalidPassword"));
		try{
			Assert.assertEquals(config.getProperty("invalidPassword"),password.getAttribute("value"));
			test.pass("Entered Password: " + password.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to enter password");
		}
	}
	
	//Invalid Credential Pop Up
	public void InvalidCredentialPopUp() {
		
		WebElement popUp = driver.findElement(By.xpath(loc.getProperty("INVALID_CREDENTIALS")));
		try {
		    assertEquals("Invalid Credentials" , popUp.getText());	
		} catch (AssertionError e) {
			test.fail("Unable to find the element");
		}
			
	}	
	
	
	//Click on Eye icon
	public void ClickOnEyeIcon() {
		WebElement eyeIcon = driver.findElement(By.xpath(loc.getProperty("EYE_ICON")));
		try {
			eyeIcon.click();
			test.pass("Click on eye icon to see the password");
		} catch(AssertionError e) {
			test.fail("Not able to click on eye icon");
		}
		
	}
	
	//Password visible onclick eye icon
	public void PasswordVisible() {
		WebElement visiblePassword = driver.findElement(By.xpath(loc.getProperty("LOGIN_VISIBLE_PASSWORD")));
		try{
			
			test.pass("Password Visible: " + visiblePassword.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to show Password");
		}
	}
	



}