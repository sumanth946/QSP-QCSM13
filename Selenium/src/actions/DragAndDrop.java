package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box3"));
		WebElement destination = driver.findElement(By.id("box103"));
		WebElement source1 = driver.findElement(By.id("box6"));
		WebElement destination1 = driver.findElement(By.id("box106"));
		WebElement source2 = driver.findElement(By.id("box1"));
		WebElement destination2 = driver.findElement(By.id("box101"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		action.dragAndDrop(source1, destination1).perform();
		action.dragAndDrop(source2, destination2).perform();

	}

}








