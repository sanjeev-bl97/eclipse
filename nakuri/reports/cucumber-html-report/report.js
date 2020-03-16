$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/naukri_feature.feature");
formatter.feature({
  "line": 2,
  "name": "naukri website",
  "description": "",
  "id": "naukri-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@naukri_Feature"
    }
  ]
});
formatter.scenario({
  "line": 29,
  "name": "",
  "description": "To check that the user is not able to login an account with invalid details",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@tc04_InvalidLogin"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user enters invalid details for invalid login option",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 7064493378,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_opens_naukri_homepage()"
});
formatter.result({
  "duration": 10006541462,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_enters_invalid_details_for_invalid_login_option()"
});
formatter.result({
  "duration": 8886007849,
  "status": "passed"
});
});