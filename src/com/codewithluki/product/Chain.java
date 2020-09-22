package com.codewithluki.product;

public class Chain implements Product {
    @Override
    public double getPrice() {
        return 999.99;
    }

    @Override
    public String getName() {
        return "18CT Gold";
    }

    @Override
    public double getWeight() {
        return 0.074;
    }

    @Override
    public double getPriceShipment() {
        return 49.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
