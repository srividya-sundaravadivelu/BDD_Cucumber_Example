package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage {

	private static final String HOME_PAGE_URL = "https://www.google.";

	@FindBy(xpath = "//img[@alt='Google']")
	private WebElement logo;
	
	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchInput;

	HomePage() {
		PageFactory.initElements(driver, this);
	}

	void goToHomePage(String country) {
		driver.get(HOME_PAGE_URL + country);
	}

	void checkLogoDisplay() {
		wait.forElementToBeDisplayed(10, logo, "Logo");
	}
	
	void checkSearchBarDisplay() {
        wait.forElementToBeDisplayed(10, searchInput, "Search Bar");
    }
	
	String getTitle() {
        return driver.getTitle();
    }

}
