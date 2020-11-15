Feature: Item testing

  @GetDiscount
  Scenario: Get discount on an item
    Given a discounted product
    When the customer adds a new item to the basket
    Then he gets a discount on it

  @NotDiscounted
  Scenario: Get item without discount
    Given a not discounted product
    When the customer adds a new item to the basket
    Then he wont get any discount on it