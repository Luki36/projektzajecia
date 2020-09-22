package com.codewithluki.product;

public class Earrings implements Product {
    @Override
    public double getPrice() {
        return 2268;
    }

    @Override
    public String getName() {
        return "gold with Dimond";
    }

    @Override
    public double getWeight() {
        return 0.084;
    }

    @Override
    public double getPriceShipment() {
        return 69.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
