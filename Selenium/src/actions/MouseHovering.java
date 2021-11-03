package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		WebElement menLink = driver.findElement(By.linkText("MEN"));
		WebElement womenLink = driver.findElement(By.linkText("WOMEN"));
		WebElement kidsLink = driver.findElement(By.linkText("KIDS"));
		WebElement homeandlivingLink = driver.findElement(By.linkText("HOME & LIVING"));
		WebElement beautyLink = driver.findElement(By.linkText("BEAUTY"));
		WebElement profileLink = driver.findElement(By.xpath("//div[@class='desktop-user']"));
		WebElement wishListLink = driver.findElement(By.xpath("//span[@data-reactid='841']"));
		WebElement bagLink = driver.findElement(By.xpath("//span[@data-reactid='843']"));
		Actions action = new Actions(driver) ;
		action.moveToElement(menLink).perform();
		Thread.sleep(2000);
		action.moveToElement(womenLink).perform();
		Thread.sleep(2000);
		action.moveToElement(kidsLink).perform();
		Thread.sleep(2000);
		action.moveToElement(homeandlivingLink).perform();
		Thread.sleep(2000);
		action.moveToElement(beautyLink).perform();
		Thread.sleep(2000);
		action.moveToElement(profileLink).perform();
		Thread.sleep(2000);
		action.moveToElement(wishListLink).perform();
		Thread.sleep(2000);
		action.moveToElement(bagLink).perform();
		Thread.sleep(2000);
		
		
		driver.quit();
	}

}
