package selenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindowBasedOnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedtitle = "Cognizant";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        Set<String> ids = driver.getWindowHandles();
        for (String id : ids) {
			driver.switchTo().window(id);
			String actualtitle = driver.getTitle();
			if(expectedtitle.equals(actualtitle))
			{
				driver.close();
			}
		}

	}

}
