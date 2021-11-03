package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShotUsingCommonsIOTool {

	public static void main(String[] args) throws IOException, Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		File tempFile=driver.findElement(By.xpath("//a[@id='loginButton']")).getScreenshotAs(OutputType.FILE);
		
       String timeStamp = LocalDateTime.now().toString().replace(":", "-");
       File destFile= new File("./screenshot/"+timeStamp+"loginbutton.png");
       FileUtils.copyFile(tempFile, destFile);
       driver.quit();
	}

}
