package selenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistoryNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Setting the properties for chorme browser and sending the path of driver executables.
		
		ChromeDriver driver = new ChromeDriver();
	 //navigate to selenium website
		
		driver.get("https://www.google.com");
		driver.get("https://flipkart.com");
		
		Navigation nav = driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		
		driver.quit();
		
		
		

	}

}
