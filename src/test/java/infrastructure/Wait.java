package infrastructure;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	private WebDriver driver;

	public Wait(WebDriver driver) {
		this.driver = driver;
	}

	public void forElementToBeDisplayed(int timeout, WebElement webElement, String webElementName) {
		String timeoutMessage = webElementName + " wasn't displayed after " + Integer.toString(timeout) + " seconds.";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.withMessage(timeoutMessage);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

}