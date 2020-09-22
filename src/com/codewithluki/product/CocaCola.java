package com.codewithluki.product;

public class CocaCola implements Product {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getName() {
        return "Cola Zero";
    }

    @Override
    public double getWeight() {
        return 1.2;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 1.5;
    }
}
