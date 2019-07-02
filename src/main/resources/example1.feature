Feature: login test
Description: Registered  user can login using the valid credentials
Scenario: login with valid user conditions
Given user opens the login page in newtours application
When user enters the username "mercury" and password as "mercury"
And Click Submit button
Then verify login success 
  