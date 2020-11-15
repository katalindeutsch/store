package com.nagra.stepdefinitions;

import com.nagra.store.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class CatalogueSteps {
    Catalogue catalogue = new CatalogueImpl();
    Item item = new ItemImpl("chair", 60, ItemType.FURNITURE);
    int stockAmount = 10;

    //Given section
    @Given("an empty catalogue")
    public void an_empty_catalogue() {
        assertEquals("Catalogue is not empty", catalogue.countItem(item), 0);
    }

    //When section
    @When("Nagra adds new item to the catalogue")
    public void nagra_adds_new_item_to_the_catalogue() {
        catalogue.addItem(item, stockAmount);
        assertEquals("Chairs were not added to the catalogue", catalogue.countItem(item), stockAmount);
    }

    //Then section
    @Then("the not empty anymore")
    public void the_not_empty_anymore() {
        assertNotEquals("Catalogue is empty", catalogue.countItem(item), 0);
    }
}
