Feature: Hotel App Login

Scenario: Login Successful

Given I am on Hotel App Login Page
When I enter crendentials to login
| username   | password |
| vasuvespag | vasu1234|
| Sriyaseth | Sriya@86 |
| Varsharaj | Varsharaj |

Then I am Logged in Successfully 
