package testNG;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.NoSingleSectionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase_CrossBrowserTesting {
	@Parameters("browser")
	@Test
	public void cross(String browserName) {
   WebDriver driver = null;
   
   if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.slack.com/client/T0JND5XMJ/CETA38W07");	
	}
   else if(browserName.equals("firefox")){
	   System.setProperty("webdriver.chrome.driver","./drivers/geckodriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.slack.com/client/T0JND5XMJ/CETA38W07");	
		}
   else
	   throw new NoSingleSectionException();

}
}
