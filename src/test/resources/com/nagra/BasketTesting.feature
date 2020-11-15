Feature: Basket testing

  @AddNewItemToEmptyBasket
  Scenario: Add new item to empty basket
    Given an empty basket
    When the customer adds a new item to the basket
    Then the total price increased

  @RemoveItemFromNotEmptyBasket
  Scenario: Remove item from not empty basket
    Given a not empty basket
    When the customer removes an item from a not empty basket
    Then the total price has been reduced

  @RemoveItemFromEmptyBasket
  Scenario: Remove item from empty basket
    Given an empty basket
    When the customer removes an item from an empty basket
    Then the customer get an error message