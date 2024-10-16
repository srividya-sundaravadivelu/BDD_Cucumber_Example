//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(features = { "src/test/resources/Home_page.feature" }, 
plugin = {"html:target/home-page.html"}
, glue = { "homePage", "infrastructure" })

public class HomePageTest extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}

