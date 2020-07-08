$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iliaz/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/CucumberWithPOM/src/main/java/com/regence/features/Regence.feature");
formatter.feature({
  "line": 1,
  "name": "Regence application test",
  "description": "",
  "id": "regence-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Successfull login",
  "description": "",
  "id": "regence-application-test;validate-successfull-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user lands on Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegenceLoginStepDefinition.user_opens_the_browser()"
});
formatter.result({
  "duration": 28099566400,
  "status": "passed"
});
formatter.match({
  "location": "RegenceLoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 7385800,
  "status": "passed"
});
formatter.match({
  "location": "RegenceLoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 10990144300,
  "status": "passed"
});
formatter.match({
  "location": "RegenceLoginStepDefinition.user_lands_on_Dashboard()"
});
formatter.result({
  "duration": 29401000,
  "status": "passed"
});
formatter.match({
  "location": "RegenceLoginStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 632648800,
  "status": "passed"
});
});