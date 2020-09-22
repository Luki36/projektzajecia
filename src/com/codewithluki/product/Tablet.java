package com.codewithluki.product;

public class Tablet implements Product {
    @Override
    public double getPrice() {
        return 1249.99;
    }

    @Override
    public String getName() {
        return "Samsung";
    }

    @Override
    public double getWeight() {
        return 0.43;
    }

    @Override
    public double getPriceShipment() {
        return 14.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
