$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/LENOVO PC/workspace/BDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Facebook Login Test",
  "description": "",
  "id": "facebook-login-feature;facebook-login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@murari"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "facebook-login-feature;facebook-login-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "facebook-login-feature;facebook-login-test;;1"
    },
    {
      "cells": [
        "muraribec@gmail.com",
        "jskfjsd12121"
      ],
      "line": 13,
      "id": "facebook-login-feature;facebook-login-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Facebook Login Test",
  "description": "",
  "id": "facebook-login-feature;facebook-login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@murari"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"muraribec@gmail.com\" and \"jskfjsd12121\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 8347367300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Facebook()"
});
formatter.result({
  "duration": 36241200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "muraribec@gmail.com",
      "offset": 13
    },
    {
      "val": "jskfjsd12121",
      "offset": 39
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 563497900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 159421400,
  "status": "passed"
});
});