package com.codewithluki.product;

public class Sofa implements Product {
    @Override
    public double getPrice() {
        return 4999;
    }

    @Override
    public String getName() {
        return "Versano";
    }

    @Override
    public double getWeight() {
        return 120;
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
