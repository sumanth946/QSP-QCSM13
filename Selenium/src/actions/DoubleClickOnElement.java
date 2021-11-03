package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=cucumber");
		
		WebElement increment = driver.findElement(By.id("add"));
		Actions action = new Actions(driver);
		
		action.doubleClick(increment).perform();
		Thread.sleep(3000);
		action.doubleClick(driver.findElement(By.id("minus"))).perform();
		
		driver.quit();

	}

}
