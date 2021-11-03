package selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetTheWindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Setting the properties for chorme browser and sending the path of driver executables.
		
		ChromeDriver driver = new ChromeDriver();
	 //navigate to selenium website
		
		driver.get("https://www.google.com");
		Dimension dimension = new Dimension(500,750);
		driver.manage().window().setSize(dimension);
		//driver.quit();

	}

}
