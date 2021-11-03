package selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        String parentwindow = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        
        allwindows.remove(parentwindow);
        
        for (String onewindow : allwindows) {
        	
        	driver.switchTo().window(onewindow);
        	driver.close();
			
		}
	}

}
