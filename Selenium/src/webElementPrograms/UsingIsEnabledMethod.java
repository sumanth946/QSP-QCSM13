package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsEnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();

		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		boolean flag = checkBox.isEnabled();
		
		if(flag) {
			System.out.println("is enabled");
		}
		else
			System.out.println("is not enabled");
		
		
		driver.quit();

	}

}
