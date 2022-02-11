Feature: feature to test login functionality

#Scenario: Check login is successful with valid credentials

#Given user is on login page
#When  user enter username and password
#And   clicks on login button
#Then  user is navigated to home page


#parameterisation
#Scenario Outline:Check login is successful with valid credentials

Scenario Outline: TC001 Making ofCreate Lead

Given Click the Create Lead 'Create Lead'
And Enter the company name <companyName>
And Enter the first name  <firstName>
And Enter the last name <lastName>
When Click tab create lead
Then Lead creation

Examples:
|companyName|firstName|lastName|
|'Kappa'|'Doss'|'RR'|

Scenario Outline: TC002 Updating the Lead

Given Click Find Lead
And Enter first name <firstName>
And Click Find Lead for result
And click on first resulting data
And Click edit
And Update company name <companyName>
And Click update button
Then verify the updated data

Examples:
|companyName|firstName|
|'Kappa'|'Doss'|


Scenario: TC003  Duplicating the lead

Given Click Find Lead
And  click email tab
And Enter email address
And Click find lead filter
And click first resulting data
And duplicate click
Then verify duplicate

Scenario: TC005 Deletting the lead

Given Click Find Lead
And  Enter first name
And Click filter Find lead 
And click first resulting data
And delete click
Then verify delete
