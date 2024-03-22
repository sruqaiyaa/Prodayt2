Feature: Hotel App Login
@SmokeTest @SanityTest
Scenario: Login Successful

Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
And I enter password as "vasu1234"
And I Click Login
Then I am Logged in Successfully 
@E2ETest @SanityTest
Scenario: Search Location

Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
And I enter password as "vasu1234"
And I Click Login
Then I am Logged in Successfully 
And I select location as "New york"
And I click search
Then I am able to find hotels

