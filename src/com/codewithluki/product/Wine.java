package com.codewithluki.product;

public class Wine implements Product {
    @Override
    public double getPrice() {
        return 320;
    }

    @Override
    public String getName() {
        return "Chateau Talbot 2005";
    }

    @Override
    public double getWeight() {
        return 0.88;
    }

    @Override
    public double getPriceShipment() {
        return 29.99;
    }

    @Override
    public double getCapacity() {
        return 0.7;
    }
}
