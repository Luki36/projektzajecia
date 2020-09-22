package com.codewithluki.product;

public class Shoes implements Product {
    @Override
    public double getPrice() {
        return 490;
    }

    @Override
    public String getName() {
        return "Nike";
    }

    @Override
    public double getWeight() {
        return 0.68;
    }

    @Override
    public double getPriceShipment() {
        return 15;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
