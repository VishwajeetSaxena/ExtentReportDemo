package Utils;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportUtil {

	public static ExtentReports getInstance() {
		// ExtentReports("report\\Extentreport-"+getTimeString() +".html", true);
		ExtentReports extent = new ExtentReports("report\\Extentreport.html", false);
		extent.addSystemInfo("Project Name", "Extent Report Demo Project");
		return extent;
	}

}
