package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheDropDownElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/select-menu");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select select = new Select(dropDown) ;
		select.selectByIndex(0);
		select.selectByValue("saab");
		select.selectByVisibleText("Opel");
		
		System.out.println(select.getFirstSelectedOption().getText());
		List<WebElement> ele = select.getAllSelectedOptions();
		for (WebElement el : ele) {
			System.out.println(el.getText());
			
		}
		select.deselectAll();
        
		driver.quit();
	}

}
