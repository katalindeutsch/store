package com.nagra.store;

public enum ItemType {
    PERISHABLE(10),
    CONSUMER_ELECTRONICS(15),
    FURNITURE(20),
    OTHER(0);

    private int discount;

    ItemType(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
