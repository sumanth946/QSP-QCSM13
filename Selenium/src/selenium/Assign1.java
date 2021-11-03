package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver	= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	    String expectedTitle = "Sopra Banking" ;
	    
	    Set<String> allwindows = driver.getWindowHandles();
	    
	    for(String onewindow : allwindows)
	    	
	    {
	    	driver.switchTo().window(onewindow);
	    	String name = driver.getTitle();
	    	
	    	if(name.equals(expectedTitle))
	    	{
	    	 driver.close();
	        }
	    	
	    }

	}

}
