package com.codewithluki.product;

public class WinterCarMats implements Product {
    @Override
    public double getPrice() {
        return 132.78;
    }

    @Override
    public String getName() {
        return "Made In Britain";
    }

    @Override
    public double getWeight() {
        return 1.05;
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
