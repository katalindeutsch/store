package com.nagra.store;

/**
 * Simple representation of an item type  for purchase in an online shop.
 */
public interface Item {
    /**
     * @return a unique identifier for an item (for example "banana".
     */
    String getUid();

    /**
     * @return the price of the item, once any valid discounts are applied.
     */
    int getDiscountedPrice();
}
