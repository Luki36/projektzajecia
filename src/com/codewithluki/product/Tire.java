package com.codewithluki.product;

public class Tire implements Product {
    @Override
    public double getPrice() {
        return 255.99;
    }

    @Override
    public String getName() {
        return "Michelin";
    }

    @Override
    public double getWeight() {
        return 2.36;
    }

    @Override
    public double getPriceShipment() {
        return 23.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
