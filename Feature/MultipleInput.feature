Feature: Hotel App login with multiple id

Scenario Outline:Login Successful
Given user is on Hotel App login page
When user enters username as "<username>"
And user enters password as "<passsword>"
And user clicks on login button
Then user is successfully logged in

Example:
	|username| |password|
	|sufu12345| |sufu12345|
	|vasuvespag| |vasu1234|