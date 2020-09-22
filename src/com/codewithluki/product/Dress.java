package com.codewithluki.product;

public class Dress implements Product {
    @Override
    public double getPrice() {
        return 289;
    }

    @Override
    public String getName() {
        return "Ted Baker";
    }

    @Override
    public double getWeight() {
        return 0.32;
    }

    @Override
    public double getPriceShipment() {
        return 19.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
