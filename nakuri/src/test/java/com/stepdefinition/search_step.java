package com.stepdefinition;


import com.pages.search_page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search_step {
	
	
	search_page ss=new search_page();
	
	@Given("^user launchs the chrome browser for search scenario$")
	public void user_launched_the_chrome_browser_for_search_scenario() throws Throwable {
		ss.launchChrome();
	    ss.url();
	}

	@When("^user opens naukri homepage for search scenario$")
	public void user_opens_naukri_homepage_for_search_scenario() throws Throwable {
	   ss.login_search();
	}

	@Then("^user search the job$")
	public void user_clicks_search() throws Throwable {
	  ss.search_job();
	}
}
