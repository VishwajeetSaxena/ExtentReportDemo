package Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.Base;
import Utils.ExtentReportUtil;

public class TC4 extends Base {

/*	@BeforeClass
	public void initTestClass() {	
		report = ExtentReportUtil.getInstance();
		test = report.startTest("extent report for TC4 class");
	}*/

	@Test
	public void method4() throws SecurityException, IOException {
		test.log(LogStatus.INFO, "Test1 Started");

		test.log(LogStatus.INFO, "Test1 Completed");

	}

	/*@AfterClass
	public void finishTestClass() {
		report.endTest(test);
		report.flush();
	}*/

}
