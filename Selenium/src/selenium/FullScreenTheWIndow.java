package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenTheWIndow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Setting the properties for chorme browser and sending the path of driver executables.
		
		ChromeDriver driver = new ChromeDriver();
	 //navigate to selenium website
		
		driver.get("https://www.google.com");
	 driver.manage().window().fullscreen();
driver.quit();


	}

}
