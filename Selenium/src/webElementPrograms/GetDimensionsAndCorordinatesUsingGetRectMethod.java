package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDimensionsAndCorordinatesUsingGetRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("nav-global-location-popover-link"));
		System.out.println(element.getRect().getX());
		System.out.println(element.getRect().getY());
		System.out.println(element.getRect().getHeight());
		System.out.println(element.getRect().getWidth());
		
		driver.quit();

	}

}
