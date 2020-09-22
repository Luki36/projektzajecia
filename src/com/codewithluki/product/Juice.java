package com.codewithluki.product;

public class Juice implements Product {
    @Override
    public double getPrice() {
        return 3.60;
    }

    @Override
    public String getName() {
        return "Orange";
    }

    @Override
    public double getWeight() {
        return 0.82;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0.9;
    }
}
