$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Access_to_LinkedIn.feature");
formatter.feature({
  "line": 1,
  "name": "Access to LinkedIn using Google chrome browser",
  "description": "",
  "id": "access-to-linkedin-using-google-chrome-browser",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify the user is able to access LinkedIn using google chrome",
  "description": "",
  "id": "access-to-linkedin-using-google-chrome-browser;verify-the-user-is-able-to-access-linkedin-using-google-chrome",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "A chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I try to access LinkedIn website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I see Welcome to your professional community",
  "keyword": "Then "
});
formatter.match({
  "location": "LinkedIn.a_chrome_browser()"
});
formatter.result({
  "duration": 3381248401,
  "status": "passed"
});
formatter.match({
  "location": "LinkedIn.i_try_to_access_LinkedIn_website()"
});
formatter.result({
  "duration": 1918499199,
  "status": "passed"
});
formatter.match({
  "location": "LinkedIn.i_see_Welcome_to_your_professional_community()"
});
formatter.result({
  "duration": 766190201,
  "status": "passed"
});
});