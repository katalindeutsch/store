package com.nagra.store;

import java.util.HashMap;
import java.util.Map;

public class BasketImpl implements Basket{

    private final Map<Item, Integer> cart = new HashMap<>();

    @Override
    public int addItem(Item item) {
        int count = 1;

        if(cart.containsKey(item)){
            count = cart.get(item)+1;
        }

        cart.put(item, count);

        return count;
    }

    @Override
    public boolean removeItem(Item item) {
        if(!cart.containsKey(item)){
            return false;
        }

        int count = cart.get(item)-1;
        cart.put(item, count);

        return true;
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;

        for(Map.Entry<Item, Integer> entry : cart.entrySet()) {
            Item item = entry.getKey();
            int count = entry.getValue();

            totalPrice += item.getDiscountedPrice() * count;
        }

        return totalPrice;
    }
}
