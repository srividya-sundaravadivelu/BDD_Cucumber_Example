package homePage;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	
	private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

	@Given("A user navigates to HomePage {string}")
	public void a_user_navigates_to_home_page(String country) {
		this.homePage.goToHomePage(country);
	}

	@Then("Google logo is displayed")
	public void google_logo_is_displayed() {
		this.homePage.checkLogoDisplay();
	}

	@Then("search bar is displayed")
	public void search_bar_is_displayed() {
		this.homePage.checkSearchBarDisplay();
	}

	@Then("page title is {string}")
	public void page_title_is(String title) {
		String displayedTitle = this.homePage.getTitle();
        Assert.assertTrue(title.equals(displayedTitle));
	}
	
	

}
