package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingTheFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	   

	}

}
