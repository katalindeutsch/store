Feature: Catalogue testing

  @AddItemToCatalogue
  Scenario: Add item to empty catalogue
    Given an empty catalogue
    When Nagra adds new item to the catalogue
    Then the not empty anymore