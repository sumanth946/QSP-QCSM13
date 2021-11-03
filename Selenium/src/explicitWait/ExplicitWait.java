package explicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    //wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	    wait.until(ExpectedConditions.urlContains("https://demo.actitime.com/user/submit_tt.do"));
	    
		driver.findElement(By.id("logoutLink")).click();
	    driver.quit();

	}

}
