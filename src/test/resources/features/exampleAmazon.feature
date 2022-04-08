@test
Feature: Test functionalities of the Amazon page
  Scenario Outline: As a customer when i search for alexa, i want to see it the third option on
  the second page is available for purchase and cant added to the cart.
    Given the user navigates to www.amazon.com
    And searches for <criteria>
    And navigates to the <page>
    And select the third <item>
    Then assert what the item would be available for purchase

    Examples:
      |criteria|page|item|
      |Alexa   |2   |3   |


