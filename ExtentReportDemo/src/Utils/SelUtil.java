package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelUtil {

	public SelUtil() {

	}

	public void type(WebElement element, String text) {

		element.sendKeys(text);
	}

	public void openUrl(WebDriver driver, String url) {

		driver.get(url);
	}

}