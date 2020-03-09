package com.stepdefinition;

import com.pages.filter_page;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class filter_step {
	
	filter_page f=new filter_page();
	
	@Given("^user  launchs the chrome browser for filter option$")
	public void user_launchs_the_chrome_browser_for_filter_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    f.launchChrome();
		
	}

	@When("^user opens the naukri homepage for filter option$")
	public void user_opens_the_naukri_homepage_for_filter_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		f.url();
	}

	@Then("^user clicks login button for filter option$")
	public void user_clicks_login_button_for_filter_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		f.login_search();
	}

	@Then("^user applys filter$")
	public void user_applys_filter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    f.search_job();
	}
}
