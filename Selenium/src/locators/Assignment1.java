package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle = "actiTIME - Enter Time-Track" ;
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
	
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin") ;
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(3000); 
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("title is matching===test case is passed");
		}
		else
			System.out.println("test case is failed");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("logoutLink")).click();
		
		driver.quit();
		

	}

}
