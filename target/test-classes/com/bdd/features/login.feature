Feature: 
Login feature of Bookcart application


Scenario: Login should be Success
Given User should navigate to the application
And User clicks on the login link
And User enters the username as ortoni
And User enters the password as pass1234
When User clicks the login button
Then login should be success

Scenario: Login should be fail
Given User should navigate to the application
And User clicks on the login link
And User enters the username as korto
And User enters the password as pass1234
When User clicks the login button 
but login should  fail