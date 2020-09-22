package com.codewithluki.product;

public class Locket implements Product {
    @Override
    public double getPrice() {
        return 221.99;
    }

    @Override
    public String getName() {
        return "Silver Heart";
    }

    @Override
    public double getWeight() {
        return 0.042;
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
