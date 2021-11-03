package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllTheElementsFromDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(dropDown) ;
		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());
		
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
			
		}
		
		driver.quit();

	}

}
