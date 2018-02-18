package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.Base;
import Utils.ExtentReportUtil;

public class TC2 extends Base {

	/*@BeforeClass
	public void initTestClass() {
		report = ExtentReportUtil.getInstance();
		test = report.startTest("extent report for TC2 class");
	}*/

	@Test
	public void method2() {
		test.log(LogStatus.INFO, "Test2 Started ");
		test.log(LogStatus.INFO, "Test2 Completed");
	}
	
	/*@AfterClass
	public void finishTestClass() {
		report.endTest(test);
		report.flush();
	}*/
}
