package base;

import org.openqa.selenium.WebDriver;

import infrastructure.Setup;
import infrastructure.Wait;

public class BasePage {

	public WebDriver driver;
	public Wait wait;

	public BasePage() {
		this.driver = Setup.driver;
		this.wait = new Wait(this.driver);
	}

}
