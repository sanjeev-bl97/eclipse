package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/naukri.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc03_more"},
		glue = {"steps"},
		monochrome = true
		)
public class more_runner {

}
