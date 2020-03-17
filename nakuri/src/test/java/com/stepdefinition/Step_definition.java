package com.stepdefinition;
import com.pages.filter_page;
import com.pages.image_page;
import com.pages.invalid_login_page;
import com.pages.invalid_register_page;
import com.pages.login_page;
import com.pages.recruiters_page;
import com.pages.register_page;
import com.pages.resume_page;
import com.pages.search_page;
import com.pages.skills_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition {
	
        login_page lo = new login_page();
		search_page ss=new search_page();
		recruiters_page rp = new recruiters_page();
		filter_page f=new filter_page();
		resume_page r=new resume_page();
		image_page im=new image_page();
		skills_page skill=new skills_page();
		register_page reg=new register_page();
		invalid_register_page ireg=new invalid_register_page();
		invalid_login_page ilo=new invalid_login_page();
		
		
		//Valid Register
		
		@Then("^user enters valid details for valid register option$")
		public void user_enters_valid_details_for_valid_register_option() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			reg.register();
		}
		
		//Invalid Register
		
		
		
		@Then("^user enters invalid details for invalid register option$")
		public void user_enters_invalid_details_for_invalid_register_option() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			ireg.invalid_register();
		}
		
		
		//Valid Login
		
		
		@Given("^user launchs the chrome browser$")
		public void user_launched_the_chrome_browser() throws Throwable {
		    lo.launchChrome();
		}

		@When("^user opens naukri homepage$")
		public void user_opens_naukri_homepage() throws Throwable {
		    lo.url();
		}

		@Then("^user login into the account for login scenario$")
		public void user_clicks_login() throws Throwable {
		    lo.loginn();
		    lo.close_app();
		}
		
		
		//Invalid Login
		
		@Then("^user enters invalid details for invalid login option$")
		public void user_enters_invalid_details_for_invalid_login_option() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			ilo.invalidLoginn();
		}
		
		//Search
		
		@When("^user login into the account$")
		public void user_opens_naukri_homepage_for_search_scenario() throws Throwable {
		   ss.login_search();
		}

		@Then("^user search the job$")
		public void user_clicks_search() throws Throwable {
		  ss.search_job();
		}

		//Recruiters page
		
        @And("^user click recruiters and browse for recruiters$")
		public void user_click_recruiters_and_browse_for_recruiters() throws Throwable {
        ss.login_search();
        	rp.more();
		}
		
		//Filter operation
		
		@Then("^user applys filter$")
		public void user_applys_filter() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			ss.login_search();
			f.search_job();
		}
		
		
		//resume upload
		
		@Then("^user uploads resume$")
		public void user_uploads_resume() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			ss.login_search();
			Thread.sleep(2000);
			r.resume_upload();
		}

       //image upload
		@Then("^user uploads image$")
		public void user_uploads_image() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			ss.login_search();
			Thread.sleep(2000);
			im.image_upload();
		}
		
		//Update skills
		
		@Then("^user adds skills$")
		public void user_adds_skills() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			ss.login_search();
			Thread.sleep(2000);
			skill.update_skills();
		}
		
}
