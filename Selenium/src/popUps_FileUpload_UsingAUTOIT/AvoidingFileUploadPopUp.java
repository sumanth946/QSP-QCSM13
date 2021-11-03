package popUps_FileUpload_UsingAUTOIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidingFileUploadPopUp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("wdgt-file-upload")).click();

		// AUTO-IT STATEMENT FOR HANDLING UPLOAD POP-UP
		Runtime.getRuntime().exec("./autoIt/autoIt.exe");

	}

}
