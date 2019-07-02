Feature: login test
Scenario: login with valid 
Given opens newtours app
When user enter username "mercury" and password "mercury"
And submit login form
Then verify pass 


Scenario: login with invalid 
Given opens newtours app
When user enter username "oviya" and password "mercury"
And submit login form
Then verify fail