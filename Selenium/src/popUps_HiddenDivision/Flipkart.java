package popUps_HiddenDivision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//form[@autocomplete='on']/div/input[@class='_2IX_2- VJZDxU']")).sendKeys("7892685085");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("sumu@8180");
		driver.findElement(By.xpath("//div[@class='_1D1L_j']")).click();

	}

}

//div[@aria-label='Fri Oct 22 2021']
//div[@class='Day-grid flex flex-middle flex-column flex-top']/div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top']
