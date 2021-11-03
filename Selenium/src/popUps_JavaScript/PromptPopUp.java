package popUps_JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
     	driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
        alert.sendKeys("amana-god");
        alert.accept();
        
        //driver.quit();

	}

}
