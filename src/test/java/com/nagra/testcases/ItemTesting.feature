Feature: Item testing

  Scenario: Add new item to basket
    Given an empty basket
    When the customer adds a new item to the basket
    Then the total price changes

   