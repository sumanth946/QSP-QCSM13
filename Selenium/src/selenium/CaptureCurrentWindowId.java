package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureCurrentWindowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String id = driver.getWindowHandle();
        System.out.println(id);
        driver.quit();
	}

}
