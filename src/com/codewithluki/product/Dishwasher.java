package com.codewithluki.product;

public class Dishwasher implements Product {
    @Override
    public double getPrice() {
        return 2250;
    }

    @Override
    public String getName() {
        return "Hotpoint";
    }

    @Override
    public double getWeight() {
        return 38;
    }

    @Override
    public double getPriceShipment() {
        return 45;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
