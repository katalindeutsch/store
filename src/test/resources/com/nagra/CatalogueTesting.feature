Feature: Catalogue testing

  @IsCatalogueEmpty
  Scenario: The catalogue is empty
    Given an empty catalogue
    Then the toys' amount is zero

  @AddItemToCatalogueOnce
  Scenario: Add one item to empty catalogue
    Given an empty catalogue
    When Nagra adds one new item to the catalogue
    Then the item is added to the catalogue with stock amount: 1

  @AddItemToCatalogueTwice
  Scenario: Add two items to empty catalogue
    Given an empty catalogue
    When Nagra adds one new item to the catalogue
    And Nagra adds one new item to the catalogue
    Then the item is added to the catalogue with stock amount: 2

  @RemoveItemFromNotEmptyCatalogue
  Scenario: Remove item from not empty catalogue
    Given a not empty catalogue
    When Nagra removes one item from the catalogue
    Then the toys' amount is zero

  @RemoveItemFromEmptyCatalogue
  Scenario: Remove item from empty catalogue
    Given an empty catalogue
    When Nagra removes one item from the catalogue
    Then item has not been removed