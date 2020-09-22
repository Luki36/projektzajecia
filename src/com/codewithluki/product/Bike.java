package com.codewithluki.product;

public class Bike implements Product {
    @Override
    public double getPrice() {
        return 2600;
    }

    @Override
    public String getName() {
        return "Giant";
    }

    @Override
    public double getWeight() {
        return 7.6;
    }

    @Override
    public double getPriceShipment() {
        return 70;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
