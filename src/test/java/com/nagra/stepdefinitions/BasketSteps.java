package com.nagra.stepdefinitions;

import com.nagra.store.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class BasketSteps {

    private Item item1 = new ItemImpl("banana", 5, ItemType.OTHER);
    private Item item2 = new ItemImpl("sofa", 50, ItemType.FURNITURE);

    private Basket basket = new BasketImpl();
    private int addResponse;
    private boolean removeResponse;

    //Given section
    @Given("^an empty basket$")
    public void an_empty_basket() {
    }

    @Given("^a not empty basket")
    public void a_not_empty_basket() {
        basket.addItem(item1);
    }

    //When section
    @When("^the customer adds a new item to the basket$")
    public void the_customer_adds_a_new_item_to_the_basket() {
        addResponse = basket.addItem(item2);
    }

    @When("^the customer removes an item from the basket")
    public void the_customer_removes_an_item_from_the_basket() {
        removeResponse = basket.removeItem(item1);
    }

    //Then section
    @Then("^the total price equals to the item's discounted price")
    public void the_total_price_equals_to_the_items_discounted_price() {
        assertEquals("The total price should be equal to the price of the item", item2.getDiscountedPrice(), basket.getPrice());
    }

    @Then("^the total price equals to the double of the items' discounted price")
    public void the_total_price_equals_to_the_double_of_items_discounted_price() {
        assertEquals("The total price should be equal to the price of the two items", 2 * item2.getDiscountedPrice(), basket.getPrice());
    }

    @Then("^item is in the basket once")
    public void item_is_in_the_basket_once() {
        assertEquals("Item should be in the basket once", 1, addResponse);
    }

    @Then("^item is in the basket twice")
    public void item_is_in_the_basket_twice() {
        assertEquals("Item should be in the basket twice", 2, addResponse);
    }

    @Then("^the total price is zero")
    public void the_total_price_is_zero() {
        assertEquals("The total price should be zero", 0, basket.getPrice());
    }

    @Then("^item has been removed")
    public void item_has_been_removed() {
        assertTrue("The item should have been removed", removeResponse);
    }

    @Then("^item has not been removed")
    public void item_has_not_been_removed() {
        assertFalse("The item should not have been removed", removeResponse);
    }
}