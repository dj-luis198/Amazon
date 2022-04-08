# Amazon
Test Automation of the Amazon page

Feature: Test functionalities of the Amazon page

Scenario Outline: As a customer when i search for alexa, i want to see it the third option on the second page is available for purchase and cant added to the cart.

Given the user navigates to www.amazon.com

And searches for "Alexa"
  
And navigates to the page 2
  
And select the third item
  
Then assert what the item would be available for purchase
