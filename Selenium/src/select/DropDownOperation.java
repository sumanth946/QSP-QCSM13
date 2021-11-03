package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(dropDown) ;
		boolean flag = select.isMultiple();
        
		if(flag)
		{
			System.out.println("its a multiple select tag");
		}
		else
			System.out.println("its a single select tag");
		
		driver.quit() ;
	}

}
