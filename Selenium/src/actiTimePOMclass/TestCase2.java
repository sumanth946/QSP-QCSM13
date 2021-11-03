package actiTimePOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		//HARD CODING
		//USING BUSINESS LOGIC
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Login2Page page = new Login2Page(driver);
		
		page.login("admin", "manager");
		
		driver.quit();

	}

}
