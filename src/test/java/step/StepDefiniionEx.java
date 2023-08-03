package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniionEx {
	
	@Given("User should navigate to the application")
	public void userShouldNavigateToTheApplication() {
	    
	}

	@Given("User clicks on the login link")
	public void userClicksOnTheLoginLink() {
	    	}

	@Given("User enters the username as ortoni")
	public void userEntersTheUsernameAsOrtoni() {
	 
	}

	@Given("User enters the password as pass{int}")
	public void userEntersThePasswordAsPass(Integer int1) {
	   
	}

	@When("User clicks the login button")
	public void userClicksTheLoginButton() {
	   
	}

	@Then("login should be success")
	public void loginShouldBeSuccess() {
	   
	}

	@Given("User enters the username as korto")
	public void userEntersTheUsernameAsKorto() {
	   
	}

	@When("login should  fail")
	public void loginShouldFail() {
	   
	}

}
