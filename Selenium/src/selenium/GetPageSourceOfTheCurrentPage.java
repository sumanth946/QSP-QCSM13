package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceOfTheCurrentPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Setting the properties for chorme browser and sending the path of driver executables.
		
		ChromeDriver driver = new ChromeDriver();
		String expectedTitle="Selenium" ;//test data
	 //navigate to selenium website
		driver.get("https://www.selenium.dev/");
		String pagasourcecode = driver.getPageSource();
		System.out.println(pagasourcecode);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		

	}

}
