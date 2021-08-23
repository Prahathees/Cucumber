$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "To verify Adactin Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify Login Page functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter the \"\u003cusername\u003e\", \"\u003cpassword\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "User should enter the \"\u003clocation\u003e\", \"\u003cno_of_rooms\u003e\",\"\u003ccheckin_date\u003e\",\"\u003ccheckout_date\u003e\", \"\u003cadults_per_room\u003e\" and click serach button in Search hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User should select the hotel from Select Hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter the necessary details in the Book A Hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "The order id should be generated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "no_of_rooms",
        "checkin_date",
        "checkout_date",
        "adults_per_room"
      ]
    },
    {
      "cells": [
        "prahathees",
        "12345abcd",
        "Sydney",
        "2 - Two",
        "20/09/2021",
        "21/09/2021",
        "1 - One"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify Login Page functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.a()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the \"prahathees\", \"12345abcd\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.b(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the \"Sydney\", \"2 - Two\",\"20/09/2021\",\"21/09/2021\", \"1 - One\" and click serach button in Search hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.c(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the hotel from Select Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.d()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the necessary details in the Book A Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.e()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The order id should be generated",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.f()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify Page functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter the \"\u003cusername1\u003e\", \"\u003cpassword1\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "User should enter the \"\u003clocation1\u003e\", \"\u003cno_of_rooms1\u003e\",\"\u003ccheckin_date1\u003e\",\"\u003ccheckout_date1\u003e\", \"\u003cadults_per_room1\u003e\" and click serach button in Search hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User should select the hotel from Select Hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter the necessary details in the Book A Hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "The order id should be generated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username1",
        "password1",
        "location1",
        "no_of_rooms1",
        "checkin_date1",
        "checkout_date1",
        "adults_per_room1"
      ]
    },
    {
      "cells": [
        "prahathees",
        "12345abcd",
        "Sydney",
        "2 - Two",
        "20/09/2021",
        "21/09/2021",
        "1 - One"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify Page functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.a()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the \"prahathees\", \"12345abcd\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.b(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the \"Sydney\", \"2 - Two\",\"20/09/2021\",\"21/09/2021\", \"1 - One\" and click serach button in Search hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.c(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the hotel from Select Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.d()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the necessary details in the Book A Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.e()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The order id should be generated",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.f()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify order id is printed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter the \"\u003cusername2\u003e\", \"\u003cpassword2\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "User should enter the \"\u003clocation2\u003e\", \"\u003cno_of_rooms2\u003e\",\"\u003ccheckin_date2\u003e\",\"\u003ccheckout_date2\u003e\", \"\u003cadults_per_room2\u003e\" and click serach button in Search hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User should select the hotel from Select Hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter the necessary details in the Book A Hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "The order id should be generated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username2",
        "password2",
        "location2",
        "no_of_rooms2",
        "checkin_date2",
        "checkout_date2",
        "adults_per_room2"
      ]
    },
    {
      "cells": [
        "prahathees",
        "12345abcd",
        "Sydney",
        "2 - Two",
        "20/09/2021",
        "21/09/2021",
        "1 - One"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify order id is printed",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "User is on the Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.a()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the \"prahathees\", \"12345abcd\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.b(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the \"Sydney\", \"2 - Two\",\"20/09/2021\",\"21/09/2021\", \"1 - One\" and click serach button in Search hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.c(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the hotel from Select Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.d()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the necessary details in the Book A Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.e()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The order id should be generated",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.f()"
});
formatter.result({
  "status": "passed"
});
});