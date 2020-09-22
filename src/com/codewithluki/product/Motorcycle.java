package com.codewithluki.product;

public class Motorcycle implements Product {
    @Override
    public double getPrice() {
        return 87000;
    }

    @Override
    public String getName() {
        return "Honda";
    }

    @Override
    public double getWeight() {
        return 240;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
