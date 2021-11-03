package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
      
        Set<String> allwindows = driver.getWindowHandles();
        ArrayList<String> List = new ArrayList<String>();
        for(String winId: allwindows)
        {
        	driver.switchTo().window(winId);
        	List.add(driver.getTitle());
        }
        System.out.println(List);
        Collections.sort(List);
        for(String title:List) {
	    System.out.println(title);
	}
        driver.quit();
}
}