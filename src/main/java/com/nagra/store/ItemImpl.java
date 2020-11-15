package com.nagra.store;

import java.util.Objects;

public class ItemImpl implements Item {

    private final String uid;
    private final int price;
    private final ItemType type;

    public ItemImpl(String uid, int price, ItemType type) {
        this.uid = uid;
        this.price = price;
        this.type = type;
    }

    @Override
    public String getUid() {
        return uid;
    }

    @Override
    public int getDiscountedPrice() {
        return price * (100 - type.getDiscount()) / 100;
    }

    public int getPrice() {
        return price;
    }

    public ItemType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemImpl item = (ItemImpl) o;
        return price == item.price &&
                Objects.equals(uid, item.uid) &&
                type == item.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, price, type);
    }
}
