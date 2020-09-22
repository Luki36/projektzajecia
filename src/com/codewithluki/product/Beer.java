package com.codewithluki.product;

public class Beer implements Product {
    @Override
    public double getPrice() {
        return 3.8;
    }

    @Override
    public String getName() {
        return "Perla";
    }

    @Override
    public double getWeight() {
        return 0.6;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0.5;
    }
}
