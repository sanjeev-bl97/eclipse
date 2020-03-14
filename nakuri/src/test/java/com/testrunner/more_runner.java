package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/naukri_feature.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc03_more"},
		glue = {"com.stepdefinition"},
		monochrome = true
		)
public class more_runner {

}
