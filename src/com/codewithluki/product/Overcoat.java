package com.codewithluki.product;

public class Overcoat implements Product {
    @Override
    public double getPrice() {
        return 4300;
    }

    @Override
    public String getName() {
        return "Burton";
    }

    @Override
    public double getWeight() {
        return 2.3;
    }

    @Override
    public double getPriceShipment() {
        return 49.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
