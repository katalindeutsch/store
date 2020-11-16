package com.nagra.stepdefinitions;

import com.nagra.store.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ItemSteps {
    ItemImpl furniture = new ItemImpl("sofa", 100, ItemType.FURNITURE);
    ItemImpl perishable = new ItemImpl("perishable", 10, ItemType.PERISHABLE);
    ItemImpl consumerE = new ItemImpl("consumerE", 200, ItemType.CONSUMER_ELECTRONICS);
    ItemImpl notDiscounted = new ItemImpl("puppy", 50, ItemType.OTHER);

    Basket basket = new BasketImpl();
    int discountedPrice;

    //Given section
    @Given("a furniture product")
    public void a_furniture_product() {
    }

    @Given("a perishable product")
    public void a_perishable_product() {
    }

    @Given("a consumerE product")
    public void a_consumerE_product() {
    }

    @Given("a not discounted product")
    public void a_not_discounted_product() {
    }

    //When section
    @When("^the customer adds a furniture item to the basket")
    public void the_customer_adds_a_furniture_item_to_the_basket() {
        basket.addItem(furniture);
    }

    @When("^the customer adds a perishable item to the basket")
    public void the_customer_adds_a_perishable_item_to_the_basket() {
        basket.addItem(perishable);
    }

    @When("^the customer adds a consumer electronics item to the basket")
    public void the_customer_adds_a_consumerE_item_to_the_basket() {
        basket.addItem(consumerE);
    }

    @When("^the customer adds a not discounted item to the basket")
    public void the_customer_adds_a_not_discounted_item_to_the_basket() {
        basket.addItem(notDiscounted);
    }

    //Then section
    @Then("^the customer gets a discount for the furniture")
    public void the_customer_gets_a_discount_for_the_furniture() {
        discountedPrice = furniture.getPrice() * (100 - ItemType.FURNITURE.getDiscount()) / 100;
        assertEquals("The furniture should have had a discount", furniture.getDiscountedPrice(), discountedPrice);
    }

    @Then("^the customer gets a discount for the perishable product")
    public void the_customer_gets_a_discount_for_the_perishable_product() {
        discountedPrice = perishable.getPrice() * (100 - ItemType.PERISHABLE.getDiscount()) / 100;
        assertEquals("The perishable item should have had a discount", perishable.getDiscountedPrice(), discountedPrice);
    }

    @Then("^the customer gets a discount for the consumerE")
    public void the_customer_gets_a_discount_for_the_consumerE() {
        discountedPrice = consumerE.getPrice() * (100 - ItemType.CONSUMER_ELECTRONICS.getDiscount()) / 100;
        assertEquals("The consumer electronics item should have had a discount", consumerE.getDiscountedPrice(), discountedPrice);
    }

    @Then("^the customer don't get any discount for the product")
    public void the_customer_gets_a_discount_for_the_notDiscounted() {
        assertEquals("The product should have had a discount", notDiscounted.getDiscountedPrice(), notDiscounted.getPrice());
    }
}
