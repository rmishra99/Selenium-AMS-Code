package com.ams.modules;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demo.base.BaseTest;

public class ExpenditureHead extends BaseTest{
	
	//Click on create expenditure head button
	public void clickOnCreateButton() {
		WebElement createExpenditurehead = driver.findElement(By.xpath(loc.getProperty("CREATE_BUTTON")));
		try {
			createExpenditurehead.click();
			test.pass("Successfully clicked on create expenditure head button");
		} catch(AssertionError e) {
			test.fail("Unable to click on create expenditure head button");
		}
	}
	
	//Validate click on create button
	public void validateCreateButton() {
		WebElement validateCreateButton = driver.findElement(By.className(loc.getProperty("VALIDATE_CREATE_BUTTON")));
		String expectedText = config.getProperty("addExpenditureHead");
		String actualText = validateCreateButton.getText();
		try {
			Assert.assertEquals(expectedText, actualText);
			test.pass("Create Expenditure Head screen open successfully: " + actualText);
		}catch(AssertionError e) {
			test.fail("Unable to open create Expenditure Head screen");
		}
	}
	
	//validate expenditure name Label
	public void expenditureNameLabel() {
		WebElement expenditureNameLabel = driver.findElement(By.xpath(loc.getProperty("LABEL_EXPENDITURE_NAME")));
		try {
			assertEquals("Invalid Credentials" , expenditureNameLabel.getText());	
			test.pass("Expenditure name label" + expenditureNameLabel.getText());
		} catch(AssertionError e) {
			test.fail("Wrong label | Expected label : " + config.getProperty("labelexpenditureName") + " | Actual label: " + expenditureNameLabel.getText());
		}
	}
	
	//Write in expenditure name field
	public void enterExpenditureName() {
		WebElement enterExpenditureName = driver.findElement(By.id(loc.getProperty("EXPENDITURE_NAME")));
		enterExpenditureName.sendKeys(config.getProperty("expenditureName"));
		try {
			Assert.assertEquals(config.getProperty("expenditureName"), enterExpenditureName.getAttribute("value"));
			test.pass("Expenditure name field value : " + enterExpenditureName.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to enter in expenditure name | Expected value : " + loc.getProperty("EXPENDITURE_NAME") + "| Actual Value: " + enterExpenditureName.getAttribute("value"));
		}
	}
	
	//validate abbreviation Label
	public void labelAbbreviation() {
		WebElement labelAbbreviation = driver.findElement(By.xpath(loc.getProperty("LABEL_ABBREVIATION")));
		try {
			assertEquals("Abbreviation label" , labelAbbreviation.getText());	
			test.pass("Abbreviation label" + labelAbbreviation.getText());
		} catch(AssertionError e) {
			test.fail("Wrong label | Expected label : " + config.getProperty("labelAbbreviation") + " | Actual label: " + labelAbbreviation.getText());
		}
	}
	
	//Write in abbreviation field
	public void enterAbbreviation() {
		WebElement enterAbbreviation = driver.findElement(By.id(loc.getProperty("ABBREVIATION")));
		enterAbbreviation.sendKeys(config.getProperty("abbreviation"));
		try {
			Assert.assertEquals(config.getProperty("abbreviation"), enterAbbreviation.getAttribute("value"));
			test.pass("Abbreviation field value : " + enterAbbreviation.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to enter in Abbreviation | Expected value : " + loc.getProperty("ABBREVIATION") + "| Actual Value: " + enterAbbreviation.getAttribute("value"));
		}
	}
	
	
	//Select Parent Name
	public void selectParentName() {
		WebElement selectParentName = driver.findElement(By.xpath(loc.getProperty("CLICK_PARENT_NAME")));
		selectParentName.click();
		WebElement ddown = driver.findElement(By.name("job_level"));
		Select select = new Select(ddown);
		select.selectByValue("cLevel");
		select.selectByIndex(1);
		try {
			test.pass("Successfully clicked on parent name field");
		}catch(AssertionError e) {
			test.fail("Unable to click on parent name field");
		}
	}
	
	
	//validate parent name Label
	public void labelParentName() {
		WebElement labelParentName = driver.findElement(By.xpath(loc.getProperty("LABEL_PARENT_NAME")));
		try {
			assertEquals("Parent name label" , labelParentName.getText());	
			test.pass("Parent name label" + labelParentName.getText());
		} catch(AssertionError e) {
			test.fail("Wrong label | Expected label : " + config.getProperty("labelParentName") + " | Actual label: " + labelParentName.getText());
		}
	}
	
	
	//validate descriprion label
	public void labelDescription() {
		WebElement labelDescription = driver.findElement(By.xpath(loc.getProperty("LABEL_DESCRIPTIONS")));
		try {
			assertEquals("Desriptions label" , labelDescription.getText());	
			test.pass("Desriptions label" + labelDescription.getText());
		} catch(AssertionError e) {
			test.fail("Wrong label | Expected label : " + config.getProperty("labelDescriptions") + " | Actual label: " + labelDescription.getText());
		}
	}
	
	//Write in description field
	public void enterDescription() {
		WebElement enterDescription = driver.findElement(By.id(loc.getProperty("DESCRIPTIONS")));
		enterDescription.sendKeys(config.getProperty("descriptions"));
		try {
			Assert.assertEquals(config.getProperty("descriptions"), enterDescription.getAttribute("value"));
			test.pass("Description field value : " + enterDescription.getAttribute("value"));
		} catch (AssertionError e) {
			test.fail("Unable to enter in Description | Expected value : " + loc.getProperty("DESCRIPTIONS") + "| Actual Value: " + enterDescription.getAttribute("value"));
		}
	}
	
	//Click on cancel button
	public void clickCancel() {
		WebElement clickCancel = driver.findElement(By.xpath(loc.getProperty("CANCEL_BUTTON")));
		try {
			clickCancel.click();
			test.pass("Clicked successfully on cancel button");
		} catch(AssertionError e) {
			test.fail("Unable to click on cancel button");
		}
	}
	
	//Click on Submit button
	public void clickSubmit() {
		WebElement clickSubmit = driver.findElement(By.xpath(loc.getProperty("SUBMIT_BUTTON")));
		try {
			clickSubmit.click();
			test.pass("Clicked successfully on submit button");
		} catch(AssertionError e) {
			test.fail("Unable to click on submit button");
		}
	}
	
	//Click on Cross Icon
	public void clickCross() {
		WebElement clickCross = driver.findElement(By.xpath(loc.getProperty("CROSS_ICON")));
		try {
			clickCross.click();
			test.pass("Clicked successfully on Cross icon");
		} catch(AssertionError e) {
			test.fail("Unable to click on Cross icon");
		}
	}
	
	//Click on search bar
	public void clickSearch() {
		WebElement clickSearch = driver.findElement(By.xpath(loc.getProperty("CLICK_SEARCH")));
		try {
			clickSearch.click();
			test.pass("Successfully clicked on search bar");
		} catch(AssertionError e) {
			test.fail("Unable to click on search bar");
		}
	}
	
	//Search in search bar
	public void searchBar() {
		WebElement searchBar = driver.findElement(By.xpath(loc.getProperty("CLICK_SEARCH")));
		searchBar.sendKeys(config.getProperty("expenditureName"));
		searchBar.sendKeys(Keys.ENTER);
		try {
			Assert.assertEquals(config.getProperty("expenditureName"), searchBar.getAttribute("value"));
			test.pass("Search field value : " + searchBar.getAttribute("value"));
		} catch(AssertionError e) {
			test.fail("Unable to find the element: " + config.getProperty("expenditureName"));
		}
	}
	
	//Click on pagination
	public void clickPagination() {
		WebElement clickPagination = driver.findElement(By.xpath(loc.getProperty("CLICK_PAGINATION")));
		clickPagination.click();
		test.pass("Clicked on pagination");
		System.out.println("Pagination is clicked");
		List<WebElement>TotalRowsList = clickPagination.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
		if( TotalRowsList.size() <= 11) {
			test.pass("Total data of expenditure head: " + TotalRowsList.size());
		} else {
			test.fail("Size is increased, more than 10");
		}
	}

}
