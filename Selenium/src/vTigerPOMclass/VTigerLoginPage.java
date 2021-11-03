package vTigerPOMclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerLoginPage {
	
// USING BUSINESS LOGIC
	
	public VTigerLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	}
	
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement loginButton;
	
	public void loginPage(String username, String password)
	{
		usernameTextField.clear();
		passwordTextField.clear();
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password,Keys.ENTER);
		//loginButton.click();
		
		
		
	}
	
	

}
