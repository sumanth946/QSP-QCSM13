package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheDropDownElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(dropDown) ;
		select.selectByIndex(10);
		Thread.sleep(3000);
		select.selectByValue("BTN");
		Thread.sleep(3000);
		select.selectByVisibleText("Holy See (Vatican City State)");
		Thread.sleep(3000);
		driver.quit();

	}

}
