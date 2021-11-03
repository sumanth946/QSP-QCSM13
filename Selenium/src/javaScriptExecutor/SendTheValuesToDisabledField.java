package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTheValuesToDisabledField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledElement = driver.findElement(By.xpath("//input[@class='form-control']"));
		WebElement disableClickElement = driver.findElement(By.xpath("//i[@class='fa fa-envelope']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='qspiders'",disabledElement);
		Thread.sleep(3000);
        js.executeScript("arguments[0].click()", disableClickElement);
	}

}
