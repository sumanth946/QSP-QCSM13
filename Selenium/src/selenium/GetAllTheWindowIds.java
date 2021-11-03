package selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTheWindowIds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        Set<String> id = driver.getWindowHandles();
        for (String string : id) {
        	System.out.println(string);
			
		}
        driver.quit();

	}

}
