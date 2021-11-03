package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTheCountryNamesFromTableAndPrintInAscOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		
		driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13407");
		List<WebElement> allCountryNames = driver.findElements(By.xpath("//table[@class='fc-ranking-list-full_rankingTable__1u4hs']/tbody/tr/td[3]"));
        ArrayList<String> array = new ArrayList(); 
        
		for (WebElement webElement : allCountryNames) {
        	 
			array.add(webElement.getText());
			}
		
		for (String string : array) {
			System.out.println(string);
			}
		
		Collections.sort(array);
		System.out.println("=====After sorting it to Ascending order=======");
		
       for (String string : array) {
    	   System.out.println(string);
		}
       
       Collections.reverse(array);
       System.out.println("=====After sorting it to Descending order=======");
       
       for (String string : array) {
    	   System.out.println(string);
		}
     
        System.out.println();
	}

}
