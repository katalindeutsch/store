package com.nagra.stepdefinitions;

import com.nagra.store.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class BasketSteps {
    Basket basket = new BasketImpl();

    //Given section
    @Given("^an empty basket$")
    public void an_empty_basket() {
        assertEquals("The basket is not empty", basket.getPrice(), 0);
    }

    @Given("a not empty basket")
    public void a_not_empty_basket() {
        Item item = new ItemImpl("banana", 5, ItemType.OTHER);
        basket.addItem(item);

        assertNotEquals("The basket is empty", basket.getPrice(), 0);
    }

    //When section
    @When("^the customer adds a new item to the basket$")
    public void the_customer_adds_a_new_item_to_the_basket() {
        Item item = new ItemImpl("banana", 5, ItemType.OTHER);
        int totalPriceBefore = basket.getPrice();
        basket.addItem(item);
        int totalPriceAfter = basket.getPrice();

        assertNotEquals("The item is not added to the basket", totalPriceBefore, totalPriceAfter);
    }

    @When("the customer removes an item from a not empty basket")
    public void the_customer_removes_an_item_from_a_not_empty_basket() {
        Item item = new ItemImpl("banana", 5, ItemType.OTHER);
        basket.removeItem(item);
    }

    @When("the customer removes an item from an empty basket")
    public void the_customer_removes_an_item_from_an_empty_basket() {
        assertEquals("The basket is not empty", basket.getPrice(), 0);
        Item item = new ItemImpl("banana", 5, ItemType.OTHER);

        try{
            basket.removeItem(item);
        } catch (Exception e){
            e.getMessage();
        }
    }

    //Then section
    @Then("^the total price increased")
    public void the_total_price_increased() {
        assertNotEquals("The total price has not increased", 0, basket.getPrice());
    }

    @Then("^the total price has been reduced")
    public void the_total_price_has_been_reduced() {
        Item item = new ItemImpl("banana", 5, ItemType.OTHER);
        basket.addItem(item);
        int priceBeforeRemoving = basket.getPrice();
        basket.removeItem(item);
        int priceAfterRemoving = basket.getPrice();

        assertNotEquals("The total price has not been reduced", priceBeforeRemoving, priceAfterRemoving);
    }

    @Then("the customer get an error message")
    public void the_customer_get_an_error_message() {
        assertEquals("The basket is not empty", basket.getPrice(), 0);
        Item item = new ItemImpl("banana", 5, ItemType.OTHER);

        try{
            basket.removeItem(item);
        } catch (Exception e){
            e.getMessage();
        }
    }
}