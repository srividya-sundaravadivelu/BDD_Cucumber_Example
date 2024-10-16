package infrastructure;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;

public class Setup {

	public static WebDriver driver;

	@Before
	public void setWebDriver() {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("['start-maximized']");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}
}
