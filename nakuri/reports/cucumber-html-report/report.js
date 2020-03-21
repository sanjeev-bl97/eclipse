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
  "line": 70,
  "name": "",
  "description": "To check that the user is able to upload image",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 69,
      "name": "@tc09_Image_upload"
    }
  ]
});
formatter.step({
  "line": 73,
  "name": "user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 74,
  "name": "user opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "user uploads image",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 5835817979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_opens_naukri_homepage()"
});
formatter.result({
  "duration": 18300522098,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_uploads_image()"
});
formatter.result({
  "duration": 24855868767,
  "status": "passed"
});
});