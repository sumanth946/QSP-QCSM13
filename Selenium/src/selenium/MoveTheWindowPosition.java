package selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveTheWindowPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
        System.out.println(position.getY());	
        driver.quit();

	}

}
