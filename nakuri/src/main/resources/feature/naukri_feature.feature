@naukri_Feature
Feature: naukri website

@tc01_Valid_Register
Scenario:	
	To check that the user is not able to register an existing account
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage 
	Then user enters valid details for valid register option

@tc02_Invalid_Register
Scenario:	
	To check that the user is not able to register an existing account
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage 
	Then user enters invalid details for invalid register option

@tc03_login
Scenario:	
	To check that the user can login naukri account
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage 
	Then user login into the account for login scenario 
	
@tc04_InvalidLogin
Scenario:	
	To check that the user is not able to login an account with invalid details
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage 
	Then user enters invalid details for invalid login option	
	
@tc05_Search
	Scenario:	
	To check that the user can search for job 
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage
	When  user login into the account
	Then user search the job 
@tc06_More
Scenario:	
	To check that the user can click more and move to any field
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage
	And  user click mores and move to any field	
@tc07_Filter
Scenario:	
	To check that the user is able to apply filter in search results
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage
	And  user applys filter
	
@tc08_Resume_upload
Scenario:	
	To check that the user is able to upload resume
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage
	Then user uploads resume
	
@tc09_Image_upload
Scenario:	
	To check that the user is able to upload image
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage
	Then user uploads image	
	
@tc10_Update_skilss
Scenario:	
	To check that the user is able to add IT skills
	
	Given  user launchs the chrome browser 
	When  user opens naukri homepage
	Then user adds skills	
	