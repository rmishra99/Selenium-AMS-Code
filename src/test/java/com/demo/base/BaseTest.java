package com.demo.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties loc = new Properties();
	
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	@BeforeTest
	public void StartTest() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String reportName = "AMS-Test-Report-" +timeStamp+ ".html";
		String reportPath = System.getProperty("user.dir") + "/src/test/resources/reports/" + reportName;
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			spark = new ExtentSparkReporter(reportPath);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("AMS Automation Report");
			spark.config().setReportName("AMS STAGGING Environment Automation Test Report");
			extent.attachReporter(spark);

		}

	}

	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		
		FileInputStream fis_config = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/properties/config.properties");
		config.load(fis_config);
//		System.out.println(fis_config);

		FileInputStream fis_locator = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/properties/locators.properties");
		loc.load(fis_locator);
//		System.out.println(fis_locator);

		if (config.getProperty("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			// test.info("Open Chrome Browser");
		} 
		driver.get(config.getProperty("amsUrl"));
		driver.manage().window().maximize();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit(); 
		test.info("Browser Quit");
	}
	
	@AfterTest
	public static void endTest() {
		if (Objects.nonNull(extent)) {
			extent.flush();
		}

	}


}
