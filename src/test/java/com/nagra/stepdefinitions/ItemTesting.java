package com.nagra.stepdefinitions;

import com.nagra.store.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ItemTesting {
    Basket basket = new BasketImpl();

    @Given("^an empty basket$")
    public void an_empty_basket() {
        assert basket.getPrice() == 0 : "The basket is empty";
    }

    @When("^the customer adds a new item to the basket$")
    public void the_customer_adds_a_new_item_to_the_basket() {
        Item item = new ItemImpl("banana", 5, ItemType.OTHER);
        basket.addItem(item);
    }

    @Then("^the total price changes$")
    public void the_total_price_changes() {
        assert basket.getPrice() != 0 : "The total price has changed";
    }
}
