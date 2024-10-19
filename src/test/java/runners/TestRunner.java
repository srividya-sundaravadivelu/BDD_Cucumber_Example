package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Home_page.feature" }, 
plugin = {"html:test-output/home-page.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
, glue = { "homePage", "infrastructure" })
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
