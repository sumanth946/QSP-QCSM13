package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropJqueryWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
        driver.switchTo().frame(frame);
        WebElement dragableElement = driver.findElement(By.id("draggable"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(dragableElement, 200, 55).perform();
        
        //pass the driver controller to parent frame
        
        driver.switchTo().defaultContent();
        //WE CAN ALSO USE parentFrame() INSTEAD OF defaultContent()
       // driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("//h1[text()='Draggable']")).getText());
        
        
	}

}
