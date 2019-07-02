Feature: search multiple product
Scenario: search for product
When user search for product
|iphone|
|travel kit|
|headphone|
And verify and display
Then close application