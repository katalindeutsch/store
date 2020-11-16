Feature: Basket testing

  @IsEmptyBasket
  Scenario: The basket is empty
    Given an empty basket
    Then the total price is zero

  @AddNewItemToEmptyBasket
  Scenario: Add new item to empty basket
    Given an empty basket
    When the customer adds a new item to the basket
    Then the total price equals to the item's discounted price
    And item is in the basket once

  @AddNewItemTwiceToEmptyBasket
  Scenario: Add new item twice to empty basket
    Given an empty basket
    When the customer adds a new item to the basket
    And the customer adds a new item to the basket
    Then the total price equals to the double of the items' discounted price
    And item is in the basket twice

  @RemoveItemFromNotEmptyBasket
  Scenario: Remove item from not empty basket
    Given a not empty basket
    When the customer removes an item from the basket
    Then the total price is zero
    And item has been removed

  @RemoveItemFromEmptyBasket
  Scenario: Remove item from empty basket
    Given an empty basket
    When the customer removes an item from the basket
    Then item has not been removed