package practico9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Utilities.GetProperties;

public class EjerciciosPractico9 {

	@Test (enabled = false)
	public void primerTest() throws InterruptedException {
		GetProperties properties = new GetProperties();
		String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
		System.out.println("Abrio Google");
	}
	
	@Test(enabled = true)//, dependsOnMethods = {"primerTest"})
	public void segundoTest() throws InterruptedException {
		GetProperties properties = new GetProperties();
		String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
		System.out.println("Abrio Facebook");
	}
	
	@Test(enabled = true, dependsOnMethods = {"segundoTest"})
	public void tercerTest() throws InterruptedException {
		GetProperties properties = new GetProperties();
		String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
		System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://calendar.google.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("calendar.google.com"));
		System.out.println("Abrio calendar");
	}
}
