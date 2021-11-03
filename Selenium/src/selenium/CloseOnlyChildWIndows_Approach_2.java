package selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWIndows_Approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
      String parentwindow = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        for (String onewindow : allwindows) {
        	driver.switchTo().window(onewindow);
        	if(!onewindow.equals(parentwindow))
        	{
        		driver.close();
        	}
			
		}
	}

}
