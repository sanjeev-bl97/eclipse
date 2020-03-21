package com.naukri.stepdefinition;

import com.naukri.pages.FilterPage;
import com.naukri.pages.ImageUploadPage;
import com.naukri.pages.InvalidLoginPage;
import com.naukri.pages.InvalidRegisterPage;
import com.naukri.pages.LoginPage;
import com.naukri.pages.RecruitersPage;
import com.naukri.pages.RegisterPage;
import com.naukri.pages.ResumeUploadPage;
import com.naukri.pages.JobSearchPage;
import com.naukri.pages.SkillsUpdatePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriStepDefinition {

	LoginPage           login             = new LoginPage();
	JobSearchPage       search            = new JobSearchPage();
	RecruitersPage      recruiters        = new RecruitersPage();
	FilterPage          filter            = new FilterPage();
	ResumeUploadPage    resume            = new ResumeUploadPage();
	ImageUploadPage     image             = new ImageUploadPage();
	SkillsUpdatePage    skill             = new SkillsUpdatePage();
	RegisterPage        register          = new RegisterPage();
	InvalidRegisterPage invalidRegister   = new InvalidRegisterPage();
	InvalidLoginPage    invalidLogin      = new InvalidLoginPage();

	// Valid Register
	@Then("^user enters valid details for valid register option$")
	public void user_enters_valid_details_for_valid_register_option() throws Throwable {

		register.register();
	}

	
	
	// Invalid Register

	@Then("^user enters invalid details for invalid register option$")
	public void user_enters_invalid_details_for_invalid_register_option() throws Throwable {

		invalidRegister.invalidRegister();
	}

	
	
	// Valid Login (Launching chrome and loading url methods are present in this class and extended for all other classes )

	@Given("^user launchs the chrome browser$")
	public void user_launched_the_chrome_browser() throws Throwable {
		login.launchChrome("chrome");
	}

	@When("^user opens naukri homepage$")
	public void user_opens_naukri_homepage() throws Throwable {
		login.url();
	}

	@Then("^user login into the account for login scenario$")
	public void user_clicks_login() throws Throwable {
		login.login();
		login.closeApp();
	}

	
	
	// Invalid Login

	@Then("^user enters invalid details for invalid login option$")
	public void user_enters_invalid_details_for_invalid_login_option() throws Throwable {

		invalidLogin.invalidLogin();
	}

	
	
	// JobSearch

	@When("^user login into the account$")
	public void user_opens_naukri_homepage_for_search_scenario() throws Throwable {
		search.loginSearch();
	}

	@Then("^user search the job$")
	public void user_clicks_search() throws Throwable {
		search.jobSearch();
	}

	
	
	// Recruiters page

	@And("^user click recruiters and browse for recruiters$")
	public void user_click_recruiters_and_browse_for_recruiters() throws Throwable {
		search.loginSearch();
		recruiters.recruitersSearch();
	}

	
	
	// Filter operation

	@Then("^user applys filter$")
	public void user_applys_filter() throws Throwable {

		search.loginSearch();
		filter.filterJob();
	}

	
	
	// Resume upload

	@Then("^user uploads resume$")
	public void user_uploads_resume() throws Throwable {

		search.loginSearch();
		Thread.sleep(2000);
		resume.resumeUpload();
	}

	
	
	// Image upload
	@Then("^user uploads image$")
	public void user_uploads_image() throws Throwable {
		search.loginSearch();
		Thread.sleep(2000);
		image.imageUpload();
	}

	
	
	// Update skills

	@Then("^user adds skills$")
	public void user_adds_skills() throws Throwable {
		search.loginSearch();
		Thread.sleep(2000);
		skill.updateSkills();
	}

}
