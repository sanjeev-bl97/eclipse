package com.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/naukri_feature.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_login,@tc02_search,@tc03_more,@tc04_filter"},
		glue = {"com.stepdefinition"},
		monochrome = true
		)

public class login_runner {

}