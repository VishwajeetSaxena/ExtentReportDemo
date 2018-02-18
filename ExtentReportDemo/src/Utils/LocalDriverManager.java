package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalDriverManager {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.drive", "resources\\drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		return driver;
	}
	

}
