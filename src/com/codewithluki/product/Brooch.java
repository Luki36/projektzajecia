package com.codewithluki.product;

public class Brooch implements Product {
    @Override
    public double getPrice() {
        return 1356;
    }

    @Override
    public String getName() {
        return "Emerald Ruby Dragonfly";
    }

    @Override
    public double getWeight() {
        return 0.12;
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
