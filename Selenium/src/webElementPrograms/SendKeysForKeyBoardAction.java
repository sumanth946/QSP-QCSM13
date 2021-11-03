package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForKeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("admin");
		 username.sendKeys(Keys.CONTROL+"a");
		 username.sendKeys(Keys.CONTROL+"c");
		 
		 WebElement password = driver.findElement(By.name("pwd"));
		 
		password.sendKeys(Keys.CONTROL+"v");
		
		

	}

}
