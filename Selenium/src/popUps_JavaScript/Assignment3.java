package popUps_JavaScript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Tech Mahindra";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allWin = driver.getWindowHandles();
		
		for (String string : allWin) {
			
		 driver.switchTo().window(string) ;
		 driver.getTitle();
		 if(driver.getTitle().equals(title))
		 {
			 driver.close();
		 }
		 else
			 System.out.println(driver.getTitle());	 
		}	

	}

}
