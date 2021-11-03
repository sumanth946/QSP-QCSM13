package popUps_HiddenDivision;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUpWithOutHardCodingDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateAndTime = LocalDateTime.now().minusDays(1) ;
		int date = dateAndTime.getDayOfMonth();
		String month = dateAndTime.getMonth().name();
		String editedMonth = month.substring(0,1).toUpperCase()+month.substring(1,3).toLowerCase();
		int year = dateAndTime.getYear();
		String day = dateAndTime.getDayOfWeek().name();
		String editedDay = day.substring(0, 1).toUpperCase()+day.substring(1,3).toLowerCase();
		
		String TodaysDate = editedDay+" "+editedMonth+" "+date+" "+year;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|529579609614&s_kwcid=AL!1631!3!529579609614!e!!g!!makemytrip&ef_id=EAIaIQobChMI7qKUgfXa8wIVjAsrCh21EwbCEAAYASAAEgIMJPD_BwE:G:s&gclid=EAIaIQobChMI7qKUgfXa8wIVjAsrCh21EwbCEAAYASAAEgIMJPD_BwE");
        driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
        driver.findElement(By.xpath("//div[@aria-label='"+TodaysDate+"']")).click();
       
        

	}

}
