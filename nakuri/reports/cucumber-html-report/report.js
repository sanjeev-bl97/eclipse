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
  "description": "To check that the user is able to register an account",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_Valid_Register"
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
  "name": "user enters valid details for valid register option",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 6571458879,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_opens_naukri_homepage()"
});
formatter.result({
  "duration": 96840775224,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_enters_valid_details_for_valid_register_option()"
});
formatter.result({
  "duration": 31484859453,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//*[@id\u003d\"p0widget\"]/div/div[1]/div/input\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BLT1219\u0027, ip: \u0027192.168.1.219\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.pages.register_page.register(register_page.java:9)\r\n\tat com.stepdefinition.Step_definition.user_enters_valid_details_for_valid_register_option(Step_definition.java:37)\r\n\tat ✽.Then user enters valid details for valid register option(src/main/resources/feature/naukri_feature.feature:10)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "To check that the user is not able to register an existing account",
  "id": "naukri-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_Invalid_Register"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launchs the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters invalid details for invalid register option",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_launched_the_chrome_browser()"
});
