package com.sab.learn.desgin.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.Objects;

public class SuperstoreInventoryProxy implements Inventory {

    private Inventory inventory;

    @Override
    public ArrayList<Item> getInventory() {
        if (Objects.isNull(inventory)) {
            inventory = new SuperstoreInventory();
        }
        return inventory.getInventory();
    }
}
