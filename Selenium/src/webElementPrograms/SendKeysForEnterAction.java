package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForEnterAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 WebElement username = driver.findElement(By.id("user-name"));
		 username.sendKeys("standard_user");
		 username.sendKeys(Keys.CONTROL+"a");
		 username.sendKeys(Keys.CONTROL+"c");
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys(Keys.CONTROL+"v");
		 password.sendKeys(Keys.ENTER);

	}

}
