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
  "line": 5,
  "name": "",
  "description": "To check that the user can login naukri account",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user login into the account",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 7498963179,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_opens_naukri_homepage()"
});
formatter.result({
  "duration": 10831959777,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_clicks_login()"
});
formatter.result({
  "duration": 40966614147,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "To check that the user can search for job",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_search"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launchs the chrome browser for search scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user opens naukri homepage for search scenario",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user search the job",
  "keyword": "Then "
});
formatter.match({
  "location": "search_step.user_launched_the_chrome_browser_for_search_scenario()"
});
formatter.result({
  "duration": 1177497,
  "status": "passed"
});
formatter.match({
  "location": "search_step.user_opens_naukri_homepage_for_search_scenario()"
});
formatter.result({
  "duration": 32698,
  "status": "passed"
});
formatter.match({
  "location": "search_step.user_clicks_search()"
});
formatter.result({
  "duration": 565366,
  "error_message": "java.lang.NullPointerException\r\n\tat com.pages.search_page.search_job(search_page.java:70)\r\n\tat com.stepdefinition.search_step.user_clicks_search(search_step.java:29)\r\n\tat ✽.Then user search the job(src/main/resources/feature/naukri_feature.feature:18)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "To check that the user can click more and move to any field",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tc03_more"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user launchs the chrome browser for more scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user opens the naukri homepage for more scenario",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user login into account for more scenario",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user click mores and move to any field",
  "keyword": "And "
});
formatter.match({
  "location": "more_step.user_can_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 4677495175,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_opens_the_naukri_homepage()"
});
formatter.result({
  "duration": 15208227953,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_clicks_login_button()"
});
formatter.result({
  "duration": 2768381799,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_can_click_more_and_move_to_any_field()"
});
formatter.result({
  "duration": 19590983196,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "",
  "description": "To check that the user is able to apply filter in search results",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tc04_filter"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user launchs the chrome browser for filter option",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user opens the naukri homepage for filter option",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user login into account for filter option",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user applys filter",
  "keyword": "And "
});
formatter.match({
  "location": "filter_step.user_launchs_the_chrome_browser_for_filter_option()"
});
formatter.result({
  "duration": 5627291309,
  "status": "passed"
});
formatter.match({
  "location": "filter_step.user_opens_the_naukri_homepage_for_filter_option()"
});
formatter.result({
  "duration": 13909345301,
  "status": "passed"
});
formatter.match({
  "location": "filter_step.user_clicks_login_button_for_filter_option()"
});
formatter.result({
  "duration": 13699632646,
  "status": "passed"
});
formatter.match({
  "location": "filter_step.user_applys_filter()"
});
