package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class JavaUtil {

	public static String getTimeString() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd HH-mm-ss-mmm");
		String formatedTime = dateFormat.format(date);
		return formatedTime;
	}

	public static String takeScreenshot(WebDriver driver) throws IOException {
		String fileName = "report//" + getTimeString() + ".jpg";
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(fileName));
		return fileName;
	}

}
