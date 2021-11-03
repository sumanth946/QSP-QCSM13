package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //Setting the properties for chorme browser and sending the path of driver executables.
		
		ChromeDriver driver = new ChromeDriver();
		String expectedTitle="Selenium" ;//test data
	 //navigate to selenium website
		driver.get("https://www.selenium.dev/");
		//capture the tile and store
		String actualTitle= driver.getTitle();
		//print the title
		System.out.println(actualTitle);
		//verification and validation
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("testcase is passed");
		}
		else {
			System.out.println("testcase is failed");
       
	}
		//close the window and server
		driver.quit();

}
}
