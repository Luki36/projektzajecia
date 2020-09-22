package com.codewithluki.product;

public class RoofBox implements Product{
    @Override
    public double getPrice() {
        return 1050;
    }

    @Override
    public String getName() {
        return "Kamei";
    }

    @Override
    public double getWeight() {
        return 10;
    }

    @Override
    public double getPriceShipment() {
        return 49.99;
    }

    @Override
    public double getCapacity() {
        return 240;
    }
}
