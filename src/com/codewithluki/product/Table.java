package com.codewithluki.product;

public class Table implements Product {
    @Override
    public double getPrice() {
        return 2350;
    }

    @Override
    public String getName() {
        return "Jenson";
    }

    @Override
    public double getWeight() {
        return 47;
    }

    @Override
    public double getPriceShipment() {
        return 99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
