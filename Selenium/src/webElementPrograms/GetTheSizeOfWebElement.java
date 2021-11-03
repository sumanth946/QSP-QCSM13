package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheSizeOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Dimension sizeOfWebElement = driver.findElement(By.xpath("//div[@class='atLogoImg']")).getSize();
		System.out.println(("Hieght of web element is "+sizeOfWebElement.getHeight()));
		System.out.println(("Width of web element is "+sizeOfWebElement.getWidth()));
	}

}
