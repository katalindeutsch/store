package com.nagra.stepdefinitions;

import com.nagra.store.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class CatalogueSteps {

    Catalogue catalogue = new CatalogueImpl();
    Item furniture = new ItemImpl("chair", 60, ItemType.FURNITURE);
    Item toy = new ItemImpl("toy", 20, ItemType.CONSUMER_ELECTRONICS);
    Item bread = new ItemImpl("banana", 2, ItemType.PERISHABLE);

    int stockAmount = 10;
    int addResponse;
    boolean removeResponse;

    //Given section
    @Given("^an empty catalogue")
    public void an_empty_catalogue(){}

    @Given("^a not empty catalogue")
    public void a_not_empty_catalogue(){
        catalogue.addItem(furniture, 1);
    }

    //When section
    @When("^Nagra adds one new item to the catalogue")
    public void nagra_adds_one_new_item_to_the_catalogue() {
        addResponse = catalogue.addItem(toy, 1);
    }

    @When("^Nagra removes one item from the catalogue")
    public void nagra_removes_one_item_from_the_catalogue() {
        removeResponse = catalogue.removeItem(toy);
    }

    //Then section
    @Then("^the toys' amount is zero")
    public void the_toys_amount_is_zero() {
        assertEquals("The catalogue should be empty", 0, catalogue.countItem(toy));
    }

    @Then("^the item is added to the catalogue with stock amount: 1")
    public void the_item_is_added_to_the_catalogue_with_stock_amount_one() {
        assertEquals("Item should have been added to the catalogue once", 1, addResponse);
    }

    @Then("^the item is added to the catalogue with stock amount: 2")
    public void the_item_is_added_to_the_catalogue_with_stock_amount_two() {
        assertNotEquals("Item should have been added to the catalogue twice", 1, addResponse);
    }
}
