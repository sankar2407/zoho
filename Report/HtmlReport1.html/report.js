$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/features/zohoLogin.feature");
formatter.feature({
  "name": "zoho Website Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Browser Launch To  Zoho Website",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch The Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitionZoho.user_Launch_The_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open Zoho HomePage",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitionZoho.user_open_Zoho_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click to Sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitionZoho.user_click_to_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Account And Take Screenshot",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Enter Mail id in UserId TextBox",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitionZoho.user_Enter_Mail_id_in_UserId_TextBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter PassWord in PassWord TextBox",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitionZoho.user_Enter_PassWord_in_PassWord_TextBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Accpet The Terms And Conditions",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitionZoho.user_Accpet_The_Terms_And_Conditions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Create Account Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitionZoho.user_Click_Create_Account_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Take ScreenShot of the WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitionZoho.user_Take_ScreenShot_of_the_WebPage()"
});
formatter.result({
  "status": "passed"
});
});