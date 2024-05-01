package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class FacebookSignUpPage {
	public FacebookSignUpPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//a[@data-testid ='open-registration-form-button']")
	public WebElement createNewAccountButton;
	
	@FindBy (name = "birthday_month")
	public WebElement birthMonthField;
	
	@FindBy (xpath = "//button[@type='submit'][1]")
	public WebElement continueButton;
	
	@FindBy (name = "password")
	public WebElement passwordField;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement logInButton;
}
