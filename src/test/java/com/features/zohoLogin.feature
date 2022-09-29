Feature: zoho Website Login

Scenario:  Browser Launch To  Zoho Website

Given User Launch The Chrome Browser
When User open Zoho HomePage
Then User click to Sign in button 


Scenario: Create Account And Take Screenshot

Given User Enter Mail id in UserId TextBox
When User Enter PassWord in PassWord TextBox
And User Accpet The Terms And Conditions
And User Click Create Account Button
Then User Take ScreenShot of the WebPage
    



