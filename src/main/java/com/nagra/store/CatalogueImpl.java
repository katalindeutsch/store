package com.nagra.store;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CatalogueImpl implements Catalogue{
    private final Map<Item, Integer> catalogue = new ConcurrentHashMap<>();

    @Override
    public int addItem(Item item, int count) {
        int tempCount = count;

        if(catalogue.containsKey(item)) {
            tempCount += catalogue.get(item)+count;
        }

        catalogue.put(item, tempCount);

        return tempCount;
    }

    @Override
    public boolean removeItem(Item item) {
        if(!catalogue.containsKey(item)) {
            return false;
        }

        int count = catalogue.get(item)-1;
        catalogue.put(item, count);

        return true;
    }

    @Override
    public int countItem(Item item) {
        if(!catalogue.containsKey(item)) {
            return 0;
        }

        return catalogue.get(item);
    }
}
