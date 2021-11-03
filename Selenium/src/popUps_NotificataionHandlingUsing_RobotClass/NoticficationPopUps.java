package popUps_NotificataionHandlingUsing_RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NoticficationPopUps {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
	
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.yatra.com");
		  Robot robot = new Robot();
		  
		  robot.keyPress(keyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB);
		  
		  robot.keyPress(keyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB);
		  
		  robot.keyPress(keyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB);
		  
		  robot.keyPress(keyEvent.VK_ENTER);
		  robot.keyRelease(keyEvent.VK_ENTER);
		  
		  
		  
		  
		  

	}

}
