package cucumber;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

      
public class Testrunner {
	/// I AM RUNNING WITH CUCUMBER CLASS
		@RunWith(Cucumber.class)
		@CucumberOptions(features="feature/testcase.feature", glue="stepdefinition",
				plugin = {"pretty", "html:reports/cucumber-html-report"})
		
		public class Testrunner_googlehomepage
		{
		}

}
