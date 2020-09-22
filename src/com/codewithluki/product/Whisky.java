package com.codewithluki.product;

public class Whisky implements Product {
    @Override
    public double getPrice() {
        return 130;
    }

    @Override
    public String getName() {
        return "Jack Daniels";
    }

    @Override
    public double getWeight() {
        return 0.5;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 1.0;
    }
}
