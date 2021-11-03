package actiTimePOMclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "container_tasks")
	private WebElement taskTab;

	@FindBy(xpath = "//td[@colspan='6']/descendant::a[contains(text(),Time-Track)]")
	private List<WebElement> navigationItem;

	
	
	public void getAllTitles() {
		
		List<String> title = new ArrayList<String>();
		
		for (WebElement ele : navigationItem) {
			
			System.out.println(ele.getText());
			//System.out.println(title);
		}
		
		//System.out.println(title);
		
		/*
		 * for(int i=0 ; i<title.size() ; i++) { System.out.println(title.get(i)); }
		 */
		
	
	}

}
