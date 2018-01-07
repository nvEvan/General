package com.evan.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	@Given("^We are on the login page")
	public void we_are_on_the_login_page() throws Throwable{
		System.out.println("IN the Login Page test Given function");
	}
	
	@When("^Enter my information")
	public void enter_my_information() throws Throwable{
		System.out.println("In the when method");
	}
	
	@Then("^I should be at the find flights page")
	public void i_should_be_at_the_find_flights_page() throws Throwable{
		System.out.println("I'm in the Then method");
	}
}
