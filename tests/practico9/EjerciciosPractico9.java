package practico9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Utilities.GetProperties;

public class EjerciciosPractico9 {

	@Test
	public void primerTest() {
		GetProperties properties = new GetProperties();
		String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	}
}
