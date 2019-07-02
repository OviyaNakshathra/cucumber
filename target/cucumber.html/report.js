$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/scenario.feature");
formatter.feature({
  "name": "login test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with valid",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "opens newtours app",
  "keyword": "Given "
});
formatter.match({
  "location": "Scenario.opens_newtours_app()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepdef.Scenario.opens_newtours_app(Scenario.java:17)\r\n\tat ✽.opens newtours app(src/main/resources/scenario.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter username \"mercury\" and password \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "Scenario.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "submit login form",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario.submit_login_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify pass",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario.verify_pass()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "login with invalid",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "opens newtours app",
  "keyword": "Given "
});
formatter.match({
  "location": "Scenario.opens_newtours_app()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepdef.Scenario.opens_newtours_app(Scenario.java:17)\r\n\tat ✽.opens newtours app(src/main/resources/scenario.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter username \"oviya\" and password \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "Scenario.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "submit login form",
  "keyword": "And "
});
formatter.match({
  "location": "Scenario.submit_login_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify fail",
  "keyword": "Then "
});
formatter.match({
  "location": "Scenario.verify_fail()"
});
formatter.result({
  "status": "skipped"
});
});