package com.codewithluki.product;

public class Underwear implements Product {
    @Override
    public double getPrice() {
        return 275;
    }

    @Override
    public String getName() {
        return "Savage";
    }

    @Override
    public double getWeight() {
        return 410;
    }

    @Override
    public double getPriceShipment() {
        return 9.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
