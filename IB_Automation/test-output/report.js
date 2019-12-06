$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/preethykrishnamoorthy/Documents/Selenium/SeleniumWebdriver_Automation/IB_Automation/src/main/java/com/Features/LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login functionality of IB",
  "description": "",
  "id": "test-login-functionality-of-ib",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test that the user is able to login successfully",
  "description": "",
  "id": "test-login-functionality-of-ib;test-that-the-user-is-able-to-login-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be landed on MIPage",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "test-login-functionality-of-ib;test-that-the-user-is-able-to-login-successfully;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "test-login-functionality-of-ib;test-that-the-user-is-able-to-login-successfully;;1"
    },
    {
      "cells": [
        "pkrish777",
        "wel127come"
      ],
      "line": 11,
      "id": "test-login-functionality-of-ib;test-that-the-user-is-able-to-login-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Test that the user is able to login successfully",
  "description": "",
  "id": "test-login-functionality-of-ib;test-that-the-user-is-able-to-login-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter \"pkrish777\" and \"wel127come\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be landed on MIPage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});