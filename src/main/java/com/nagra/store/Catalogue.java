package com.nagra.store;

/**
 * A simple shop catalogue, with operations to add, remove and count number of items in stock.
 * An item is keyed by it's uid.
 */
public interface Catalogue {
    /**
     * Add {@code item} and it's stock count to the catalogue. If the item already
     * exists in the catalogue, it's stock count is increased by {@count}
     * This method must be thread safe.
     * @param item item to add
     * @param count the additional stock count for this item
     * @return the new stock count for this item
     */
    int addItem(Item item, final int count);

    /**
     * If {@code item} is in the catalog, decrement it's stock count.
     * This method must be thread safe.
     * @param item item who's stock count to decrement.
     * @return true if this item exists in the catalogue and has a current stock count > 0, false otherwise.
     */
    boolean removeItem(Item item);

    /**
     * Count the number of items that are in stock.
     * This method must be thread safe.
     * @param item item type to count.
     * @return a count of items in stock.
     */
    int countItem(Item item);
}
