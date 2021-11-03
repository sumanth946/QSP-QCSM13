package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String expectedToolTipTitle =  "Do not select if this computer is shared";

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String toolTipTitle = driver.findElement(By.name("remember")).getAttribute("title");

		if(toolTipTitle.equals(expectedToolTipTitle))
		{
			System.out.println("test cases is passed");
		}
		else
			System.out.println("Test case is failed");

		driver.quit();



	}

}
