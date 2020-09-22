package com.codewithluki.product;

public class Bed implements Product {
    @Override
    public double getPrice() {
        return 1999.99;
    }

    @Override
    public String getName() {
        return "Oak";
    }

    @Override
    public double getWeight() {
        return 32.76;
    }

    @Override
    public double getPriceShipment() {
        return 99.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }

}
