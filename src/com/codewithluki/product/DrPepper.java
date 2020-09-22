package com.codewithluki.product;

public class DrPepper implements Product {
    @Override
    public double getPrice() {
        return 6.35;
    }

    @Override
    public String getName() {
        return "Cherry Vanilla";
    }

    @Override
    public double getWeight() {
        return 1.89;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 2.0;
    }
}
