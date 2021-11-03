package actiTimePOMclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) throws Throwable {

		// WITHOUT HARD CODING
		// USING BUSINESS METHOD

		String filePath = "./resources/POM-TestCase3.properties.txt";

		FileInputStream file = new FileInputStream(filePath);
		Properties properties = new Properties();
		properties.load(file);
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		Login4Page page = new Login4Page(driver);
		page.login(username, password);
		
		driver.quit();

	}

}
