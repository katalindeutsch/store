Feature: Item testing

  @GetDiscountForOneFurnitureItem
  Scenario: Get discount on an furniture item
    Given a furniture product
    When the customer adds a furniture item to the basket
    Then the customer gets a discount for the furniture

  @GetDiscountForOneFurnitureItem
  Scenario: Get discount on a perishable item
    Given a perishable product
    When the customer adds a perishable item to the basket
    Then the customer gets a discount for the perishable product

  @GetDiscountForOneConsumerElectronicsItem
  Scenario: Get discount on an consumer electronics item
    Given a consumerE product
    When the customer adds a consumer electronics item to the basket
    Then the customer gets a discount for the consumerE

  @GetDiscountForOneSimpleItem
  Scenario: Don't get any discount on an simple item
    Given a not discounted product
    When the customer adds a not discounted item to the basket
    Then the customer don't get any discount for the product