package com.codewithluki.product;

public class Tv implements Product {
    @Override
    public double getPrice() {
        return 6700;
    }

    @Override
    public String getName() {
        return "LG";
    }

    @Override
    public double getWeight() {
        return 23;
    }

    @Override
    public double getPriceShipment() {
        return 75;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
