package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElementsUsingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser executable settings
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		//maximising the browser
		driver.manage().window().maximize();
		//launching the url
		driver.get("https://www.skillrary.com/");
		//identifying the search box and enter value
		driver.findElement(By.name("q")).sendKeys("selenium");
		//stop the server and close all the windows
        driver.quit();
	}

}
