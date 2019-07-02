Feature: sign up test
Scenario Outline: test the sign up fuctionality with different inputs
Given user login to newtours
When user enters the fn as "<firstname>"
When user enters the ln as "<lastname>"
And user enters the ph as "<ph>"
And user enters the email as "<email>"
And user enters the addre as "<addre>"
And user enters the city as "<city>"
And user enters the state as "<st>"
And user enters the code as "<code>"
And user enters the un as "<un>"
And user enters the pwd as "<password>"
And user enters the conpwd as "<confirmpwd>"
Then click submit button
And verify the signup Success message

Examples:
|firstname|lastname|ph|email|addre|city|st|code|un|password|confirmpwd|
|oviya|arivazhagan|63753049|sivam@gmail.com|23,sakthinagar|cuddalore|tn|607002|oviya|sivam|sivam|