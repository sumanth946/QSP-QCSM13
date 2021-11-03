package screenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;//downcasting from 'Ta
		
		File tempFile= ts.getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshot/"+timeStamp+"webpage.png");
		tempFile.renameTo(destFile);
		driver.quit();
		

	}

}
