package vTigerPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {
	
 public CampaignDetailsPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
 
 
 @FindBy(id="Campaigns_detailView_fieldValue_campaignname")
 private WebElement campaignName;
 
 @FindBy(xpath="//button[@id='Campaigns_listView_basicAction_LBL_ADD_RECORD']")
 private WebElement addCampaign ;
 
 @FindBy(xpath="//a[@role='button']")
private WebElement adminButton;
 
 @FindBy(id="menubar_item_right_LBL_SIGN_OUT")
 private WebElement signOut;
 
 public void verifyNameAndSignOut(String name)
 {
	 String expectedName1 = name ;
	 //String actualName = ;
	 if (expectedName1.equals(campaignName.getText())) 
	 {
		System.out.println("test case is pass");
	}
//	else
//		System.out.println("expected name and actual name is not matching");
//	
	adminButton.click();
	signOut.click();	
		}
}
