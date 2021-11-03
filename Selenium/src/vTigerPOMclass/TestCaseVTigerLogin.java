package vTigerPOMclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseVTigerLogin {

	public static void main(String[] args) throws Throwable {
		
		String filePath = "./resources/VTiger.properties.txt";
        
		PropertyUtils propUtils = new PropertyUtils();
        
		String url = propUtils.getPropertyData(filePath,"url");
		String username = propUtils.getPropertyData(filePath,"username");
		String password = propUtils.getPropertyData(filePath,"password");

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
     
     
        VTigerLoginPage page = new VTigerLoginPage(driver);
        page.loginPage(username,password );
        
        driver.quit();
        
	}

}
