package com.codewithluki.product;

public class KFC implements Product {
    @Override
    public double getPrice() {
        return 34.99;
    }

    @Override
    public String getName() {
        return "Big Daddy";
    }

    @Override
    public double getWeight() {
        return 0.72;
    }

    @Override
    public double getPriceShipment() {
        return 14.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
