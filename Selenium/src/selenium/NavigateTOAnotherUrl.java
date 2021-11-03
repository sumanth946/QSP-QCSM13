package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTOAnotherUrl {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Setting the properties for chorme browser and sending the path of driver executables.
		
		ChromeDriver driver = new ChromeDriver();
	 //navigate to selenium website
		
		//driver.get("https://www.google.com");
		//driver.navigate().to("https://www.flipkart.com");//Using to(string url)
		//driver.navigate().to("https://www.google.com");
		
		driver.get("https://www.google.com");
		URL url = new URL("https://www.flipkart.com");
		driver.navigate().to(url);
		driver.quit();
		

	}

}
