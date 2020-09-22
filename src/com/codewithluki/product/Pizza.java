package com.codewithluki.product;

public class Pizza implements Product {
    @Override
    public double getPrice() {
        return 45;
    }

    @Override
    public String getName() {
        return "Hot";
    }

    @Override
    public double getWeight() {
        return 0.5;
    }

    @Override
    public double getPriceShipment() {
        return 5;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
