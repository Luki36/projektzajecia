package com.codewithluki.product;

public class Suit implements Product {
    @Override
    public double getPrice() {
        return 2469;
    }

    @Override
    public String getName() {
        return "Cavani";
    }

    @Override
    public double getWeight() {
        return 1.7;
    }

    @Override
    public double getPriceShipment() {
        return 42;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
