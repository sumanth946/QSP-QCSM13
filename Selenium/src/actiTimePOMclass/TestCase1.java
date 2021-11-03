package actiTimePOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
		//HARD CODING
		// USING GETTERS AND SETTERS METHOD
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Login1Page page = new Login1Page(driver);
		page.getUsernameTextField().sendKeys("admin");
		page.getPasswordTextField().sendKeys("manager");
		page.getLoginButton().click();
		
		driver.quit();
		
		

	}

}
