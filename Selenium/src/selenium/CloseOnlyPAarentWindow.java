package selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyPAarentWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        
        Set<String> allwindows = driver.getWindowHandles();
        
        driver.close();
	}

}
