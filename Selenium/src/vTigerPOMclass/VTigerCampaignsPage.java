package vTigerPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerCampaignsPage {
	
	public VTigerCampaignsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addCampaign ;
	
    public void addCampaign()
    {
    	addCampaign.click();
    }


}
