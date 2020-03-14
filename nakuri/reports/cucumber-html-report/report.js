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
  "duration": 11539744030,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_opens_the_naukri_homepage()"
});
formatter.result({
  "duration": 9195153823,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_clicks_login_button()"
});
formatter.result({
  "duration": 3305753727,
  "status": "passed"
});
formatter.match({
  "location": "more_step.user_can_click_more_and_move_to_any_field()"
});
formatter.result({
  "duration": 15100045017,
  "status": "passed"
});
});