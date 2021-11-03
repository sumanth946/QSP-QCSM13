package popUps_JavaScript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String expectedTitle = "Life Insurance Corporation of India";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//a[@title='Online Loan']")).click();
		driver.findElement(By.xpath("//b[text()='Pay Direct (Without login)']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Set<String> allWIndow = driver.getWindowHandles();

		for (String string : allWIndow) {
			
			 WebDriver singleWIndow = driver.switchTo().window(string);
			 
			 //if(singleWIndow.getTitle().equals(expectedTitle)) {
			 //System.out.println(singleWIndow.getTitle());
			 
		   if(singleWIndow.getTitle().equals(expectedTitle))
			{
			   System.out.println(singleWIndow.getTitle());
				break;
			}	
		}
		
			 
	}

	}

