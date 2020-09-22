package com.codewithluki.product;

public class Vodka implements Product {
    @Override
    public double getPrice() {
        return 60;
    }

    @Override
    public String getName() {
        return "Gorbatschow";
    }

    @Override
    public double getWeight() {
        return 0.9;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0.75;
    }
}
