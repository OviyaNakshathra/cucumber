Feature: test background
Background: Display Welcome
Given displays Welcome message
@smoke 
Scenario: signin
Given username and pwd is entered
And click signin
@regression
Scenario: search product
When product to searched is entered
@smoke @regression
Scenario: add to cart
When product  searched is added to cart
@regression @smoke
Scenario: payment
When product to be purchased is payed using netbanking
@smoke
Scenario: signout
When user performs logout

