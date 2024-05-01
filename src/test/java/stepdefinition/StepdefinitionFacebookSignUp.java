package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FacebookSignUpPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SelectingaDropdownValue;

public class StepdefinitionFacebookSignUp {
	
	FacebookSignUpPage fp = new FacebookSignUpPage();
	SelectingaDropdownValue sdv = new SelectingaDropdownValue();
	
	@Given("user is in SignUp page for the Facebook")
	public void user_is_in_signup_page_for_the_facebook() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		fp.createNewAccountButton.click();
		
	    
	}
	
	@When("user fulfilled all the required fields and Clicks the Sign Up button")
	public void user_fulfilled_all_the_required_fields_and_clicks_the_sign_up_button() {
	    sdv.selectByIndex(fp.birthMonthField, 11);
	}

	@Then("user should be signed up successfully")
	public void user_should_be_signed_up_successfully() {
	    
	}

	
             
}