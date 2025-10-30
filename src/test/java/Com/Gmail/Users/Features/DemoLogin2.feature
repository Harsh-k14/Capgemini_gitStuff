#Feature: Store login
#This feature deals with the login
#@Tc1
#Scenario: Login with correct username and correct password 

#	When I navigate to login page
#	When I entered "mercury" and "mercury"
#	And I clicked signin button
	#Then Itas navigated to the Homepage
	
#@Tc2
#Scenario: Login with correct username and Incorrect password
	
#	When I navigate to login page
#	When I entered unm "mercury"
#	When I entered Invalid pwd "xyz"
#	And I clicked signin button
#	Then Itas navigated to the error
	
	
Feature: Store login
 
This feature deals with the login functionality.
 
Scenario Outline: Login with correct username and correct password
Given I navigate to Browser "https://demo.guru99.com/test/newtours/index.php"
When I insert "<userName>" and "<passWord>"
And I clicked the signin button
# Then Its navigates the UI "<expected Result>"
Then Its navigated to the "<expected Result>"
 
 
Examples:

| userName | passWord | expected Result |
| mercury | mercury | Login Successfully |
| honey | madhu | Enter data Correctly |
| mamatha | 2004 | Enter data Correctly |