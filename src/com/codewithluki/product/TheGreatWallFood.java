package com.codewithluki.product;

public class TheGreatWallFood implements Product {
    @Override
    public double getPrice() {
        return 98.99;
    }

    @Override
    public String getName() {
        return "lemon Duck";
    }

    @Override
    public double getWeight() {
        return 0.88;
    }

    @Override
    public double getPriceShipment() {
        return 19.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
