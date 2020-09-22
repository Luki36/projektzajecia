package com.codewithluki.product;

public class MineralWater implements Product {
    @Override
    public double getPrice() {
        return 7.99;
    }

    @Override
    public String getName() {
        return "Pellegrino";
    }

    @Override
    public double getWeight() {
        return 1.38;
    }

    @Override
    public double getPriceShipment() {
        return 4.99;
    }

    @Override
    public double getCapacity() {
        return 1.0;
    }
}
