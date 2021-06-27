@Login
Feature: Login page feature

@Smoke @Regression
Scenario: Login Page title
Given user is on login page
When user gets the title of the page
Then page title should be "Flyer School | Log in"

@Smoke
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

@Smoke @Regression
Scenario: Login with correct credentials
Given user is on login page
When user enters username "morrishari@mailinator.com"
And user enters password "000000"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Flyer School: add"