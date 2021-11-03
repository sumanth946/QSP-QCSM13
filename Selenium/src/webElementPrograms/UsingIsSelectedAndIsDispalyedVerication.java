package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsSelectedAndIsDispalyedVerication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkBox.click();
		boolean displayed = checkBox.isDisplayed();
		boolean selected = checkBox.isSelected();
		
	    if(displayed && selected)
	    {
	    	System.out.println("is displaying and selected");
	    }
	    else
	    	System.out.println("not displaying and not selected");
	    
	    driver.quit();

	}

}
