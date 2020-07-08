Feature: Regence application test

Scenario: Validate Successfull login
	Given user opens the browser
	Then user is on homepage
	Then user enters username and password
	Then user lands on Dashboard
	Then user close the browser
	