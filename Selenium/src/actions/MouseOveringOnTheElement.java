package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOveringOnTheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/?format=websites");
		WebElement starRating = driver.findElement(By.id("rating1"));
		
		Actions action = new Actions(driver) ;
		
		//START MEASURING CO-ORDNATES FROM starRating Web Element
		
		action.moveToElement(starRating, 215, 0).click().perform();

	}

}
