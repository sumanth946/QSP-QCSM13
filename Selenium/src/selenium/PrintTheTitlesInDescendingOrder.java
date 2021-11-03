package selenium;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheTitlesInDescendingOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
	    Set<String> allwindows = driver.getWindowHandles();
	    
	    ArrayList<String> list = new ArrayList<String>();
	    
	    for (String win : allwindows) {
	    driver.switchTo().window(win) ;
	    list.add(driver.getTitle()) ;			
		}

	    Collections.sort(list);
	    Collections.reverse(list);
	    
	    for (String before : list) {
			System.out.println(before);
		}
	    driver.quit();
			
		}

	}


