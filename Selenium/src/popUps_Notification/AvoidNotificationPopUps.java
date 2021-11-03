package popUps_Notification;

import java.util.concurrent.TimeUnit;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotificationPopUps {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//FOR DISABLING ALL THE NOTIFICATIONS
		//options.addArguments("--disable-notifications");
		
		//FOR LAUNCHING THE CHROME BROWSER IN INCOGNITO MODE
		options.addArguments("--incognito");
		
		//PASS THE "options" reference to ChromeDriver 
		WebDriver driver = new ChromeDriver(options) ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		
		//Robot r = new Robot();
		
		

	}

}
//div[@class='DayPicker-Week']/descendant::div[@class='DayPicker-Day']/descendant::p[text()='23']

//https://www.guru99.com/using-robot-api-selenium.html
