package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParticularWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
      //get all the window id's 
        Set<String> allwindows = driver.getWindowHandles();
      //copy the same collections to arraylist 
        ArrayList<String> List = new ArrayList<String>(allwindows);
        
        String secondWindowId = List.get(2);
        driver.switchTo().window(secondWindowId);
        driver.close();

	}

}
