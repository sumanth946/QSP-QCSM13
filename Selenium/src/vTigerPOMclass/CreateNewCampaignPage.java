package vTigerPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaignPage {
	
	public CreateNewCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr/td[contains(text(),'Campaign Status')]/ancestor::tr/descendant::div[@id='s2id_autogen3']")
	private WebElement campaignStatus;
	
	@FindBy(xpath="//ul[@id='select2-results-4']/li[@role='presentation']/div[text()='Active']")
	private WebElement selectAnOption;
	
	@FindBy(xpath="//input[@id='Campaigns_editView_fieldName_campaignname']")
	private WebElement campaignName;
	
	
	//table[@class=' table-condensed']/tbody/descendant::tr/td[text()='6']
	
	@FindBy(xpath="//i[@class='fa fa-calendar ']")
	private WebElement expectedCloseDate;
	
	@FindBy(xpath="//table[@class=' table-condensed']/tbody/descendant::tr/td[text()='15']")
	private WebElement datePicker;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	public void createNewCampaign(String name) {
		
		campaignName.sendKeys(name);
		campaignStatus.click();
		selectAnOption.click();
		expectedCloseDate.click();
		datePicker.click();
		saveButton.submit();
		
	}
	
	
	

}
