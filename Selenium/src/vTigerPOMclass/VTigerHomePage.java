package vTigerPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerHomePage {
	
	public VTigerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(id="appnavigator")
	private WebElement appNavigator;
	
	@FindBy(xpath="//li[@class='dropdown']")
	private WebElement dropdown;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement marketingModuleDropDown ;
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement campaignsButton ;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logout;
	
	public void navigateToCampaignsPage(WebDriver driver)
	{
		appNavigator.click() ;
		Actions action = new Actions(driver) ;
		action.moveToElement(marketingModuleDropDown).perform(); 
		campaignsButton.click();
	}

}
