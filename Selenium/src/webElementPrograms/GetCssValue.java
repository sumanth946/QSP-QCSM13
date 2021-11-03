package webElementPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		String bordorTopColor = driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("border-top-color");
		System.out.println(bordorTopColor);
		String fontFamilyOfLogo = driver.findElement(By.xpath("//div[@class='atLogoImg']")).getCssValue("font-family");
		System.out.println(fontFamilyOfLogo);
	}

}
