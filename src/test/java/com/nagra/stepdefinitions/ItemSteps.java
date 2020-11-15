package com.nagra.stepdefinitions;

import com.nagra.store.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ItemSteps {
    ItemImpl sofa = new ItemImpl("sofa", 100, ItemType.FURNITURE);
    ItemImpl puppy = new ItemImpl("puppy", 50, ItemType.OTHER);

    //Given section
    @Given("a discounted product")
    public void a_discounted_product() {
        assertEquals("The product is not discounted", sofa.getType(), ItemType.FURNITURE);
    }

    @Given("a not discounted product")
    public void a_puppy_product() {
        assertEquals("The product is not discounted", puppy.getType(), ItemType.OTHER);
    }

    //Then section
    @Then("he gets a discount on it")
    public void he_gets_a_discount_on_it() {
        assertNotEquals("There is no available discount on this product", sofa.getPrice(), sofa.getDiscountedPrice());
    }

    @Then("he wont get any discount on it")
    public void he_wont_get_any_discount_on_it() {
        assertEquals("This item has a new price", puppy.getPrice(), puppy.getDiscountedPrice());
    }
}
