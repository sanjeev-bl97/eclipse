@naukri_Feature
Feature: naukri website

@tc01_login
Scenario:	
	To check that the user can login naukri account
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage 
	Then user login into the account 
	
@tc02_search
	Scenario:	
	To check that the user can search for job 
	
	Given  user launchs the chrome browser for search scenario
	When  user opens naukri homepage for search scenario
	Then user search the job 
	@tc03_more
Scenario:	
	To check that the user can click more and move to any field
	
	Given  user launchs the chrome browser for more scenario
	When  user opens the naukri homepage for more scenario
	Then user login into account for more scenario
	And  user click mores and move to any field	
	@tc04_filter
Scenario:	
	To check that the user is able to apply filter in search results
	
	Given  user launchs the chrome browser for filter option
	When  user opens the naukri homepage for filter option
	Then user login into account for filter option
	And  user applys filter