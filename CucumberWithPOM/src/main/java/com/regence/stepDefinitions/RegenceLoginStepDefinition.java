package com.regence.stepDefinitions;


import com.regence.utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegenceLoginStepDefinition extends BaseClass{
	
	
	@Given("^user opens the browser$")
	public void user_opens_the_browser()
	{
		BaseClass.setup();
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage()
	{
		BaseClass.validateHomeTitle();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password()
	{		
		BaseClass.credentials();
	}

	@Then("^user lands on Dashboard$")
	public void user_lands_on_Dashboard()
	{
		BaseClass.validateDashboardTitle();
	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser()
	{
		BaseClass.teardown();
	}


}
