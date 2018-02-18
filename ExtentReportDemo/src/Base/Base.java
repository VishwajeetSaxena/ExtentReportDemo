package Base;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utils.ExtentReportUtil;
import Utils.JavaUtil;
import Utils.LocalDriverManager;

public class Base {
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void initDriver() {
		
		this.driver = LocalDriverManager.getDriver();
		driver.get("https:www.google.com");
	}

	@BeforeMethod
	public void initTestClass() {
		report = ExtentReportUtil.getInstance();
		test = report.startTest(this.getClass().getName());
	}
	
	@AfterMethod
	public void finishTestClass(ITestResult testResult) throws IOException {
		/*if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("a2");
			String fileName = "report//" + JavaUtil.getTimeString() + ".jpg";
			System.out.println("b2");
			File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println("c2");
			FileUtils.copyFile(sourceFile, new File(fileName));
			System.out.println("d2");
			String path = fileName;
			System.out.println("a3");
			String imagepath = test.addScreenCapture(path);
			System.out.println("a4");
			this.test.log(LogStatus.FAIL, "Screenshot: " + imagepath);
		}*/
		
		if (testResult.getStatus() == ITestResult.FAILURE) {
			this.test.log(LogStatus.FAIL, "Test Failed");
		}else if (testResult.getStatus() == ITestResult.SUCCESS) {
			this.test.log(LogStatus.PASS, "Test Passed");
		}else if (testResult.getStatus() == ITestResult.SKIP) {
			this.test.log(LogStatus.SKIP, "Test Skipped");
		}
		
		report.endTest(test);
		report.flush();
	}



	@AfterSuite
	void quitDriver() throws InterruptedException {	
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
