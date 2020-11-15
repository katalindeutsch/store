package com.nagra.store;

/**
 * A simple shopping basket, that calculates a total price including any discount, based on day of the month and
 * item category.
 */
public interface Basket {
    /**
     * Add a single item to a shopping basket. If this item already exists in the basket, increment it's count.
     * This method does not have to be thread safe.
     * @param item the item to add
     */
    int addItem(Item item);

    /**
     * Remove a single item from the shopping basket. If the basket contains multiples of this item, reduce their
     * count by 1.
     * This method does not have to be thread safe.
     * @param item the item to remove.
     * @return true if an item is removed, false if the basket remains unchanged.
     */
    boolean removeItem(Item item);

    /**
     * Calculate the total price of the basket, including any discount.
     * This method does not have to be thread safe.
     * @return total price.
     */
    int getPrice();
}
