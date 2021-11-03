package vTigerPOMclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String filePath = "./resources/VTiger.properties.txt";
		FileInputStream file = new FileInputStream(filePath);
		Properties properties = new Properties();
		properties.load(file);
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String url = properties.getProperty("url");
		String expectedName = properties.getProperty("expectedName");
		String actualName = properties.getProperty("actualName");

		driver.get(url);

		VTigerLoginPage login = new VTigerLoginPage(driver);
		VTigerHomePage homePage = new VTigerHomePage(driver);
		VTigerCampaignsPage campaignPage = new VTigerCampaignsPage(driver);
		CreateNewCampaignPage newCampaignPage = new CreateNewCampaignPage(driver);
		CampaignDetailsPage campaignDetailsPage = new CampaignDetailsPage(driver);

		login.loginPage(username, password);
		homePage.navigateToCampaignsPage(driver);
		campaignPage.addCampaign();
		newCampaignPage.createNewCampaign(actualName);
		campaignDetailsPage.verifyNameAndSignOut(expectedName);

	}

}
