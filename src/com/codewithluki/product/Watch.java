package com.codewithluki.product;

public class Watch implements Product {
    @Override
    public double getPrice() {
        return 4830;
    }

    @Override
    public String getName() {
        return "Seiko";
    }

    @Override
    public double getWeight() {
        return 0.14;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
