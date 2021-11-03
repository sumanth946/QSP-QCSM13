package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyWebElementAndSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		//maximising the browser
		driver.manage().window().maximize();
		//launching the url 
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("sumanth");
		driver.findElement(By.name("pwd")).sendKeys("Sumanth");
		//driver.quit();
	}

}
