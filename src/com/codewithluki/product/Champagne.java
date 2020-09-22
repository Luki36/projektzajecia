package com.codewithluki.product;

public class Champagne implements Product {
    @Override
    public double getPrice() {
        return 429;
    }

    @Override
    public String getName() {
        return "Ruinart Rose";
    }

    @Override
    public double getWeight() {
        return 0.93;
    }

    @Override
    public double getPriceShipment() {
        return 28.99;
    }

    @Override
    public double getCapacity() {
        return 0.7;
    }
}
