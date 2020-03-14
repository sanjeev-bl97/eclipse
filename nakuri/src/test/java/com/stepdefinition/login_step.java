package com.stepdefinition;
import com.pages.login_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_step {
	

	
		login_page lo = new login_page();
		@Given("^user launchs the chrome browser$")
		public void user_launched_the_chrome_browser() throws Throwable {
		    lo.launchChrome();
		}

		@When("^user opens naukri homepage$")
		public void user_opens_naukri_homepage() throws Throwable {
		    lo.url();
		}

		@Then("^user login into the account$")
		public void user_clicks_login() throws Throwable {
		    lo.loginn();
		    lo.close_app();
		}

		


	
}
