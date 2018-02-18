package Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.Base;
import Utils.ExtentReportUtil;

public class TC1 extends Base {
	

	@Test
	public void method2() throws SecurityException, IOException {
		test.log(LogStatus.INFO, "Test1 Started");
		test.log(LogStatus.PASS, "Test1 Completed");

	}

	

}
