package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_ParallelExecution_DISTRIBUTED_snapdeal {
	@Test
	public void amazon() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/products/appliances?sort=plrty");
		driver.quit();
	}

}
