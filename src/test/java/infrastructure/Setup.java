//package infrastructure;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.Before;
//
//
//public class Setup {
//
//	public static WebDriver driver;
//
//	@Before
//	public void setWebDriver() {
//
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("['start-maximized']");
//		driver = new ChromeDriver(chromeOptions);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//	}
//}

package infrastructure;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Setup {

	public static WebDriver driver;

	
	public WebDriver setWebDriver() {

		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver getdriver() {
		return driver;

	}

	public void closeallDriver() {
		driver.close();
	}


	

}
