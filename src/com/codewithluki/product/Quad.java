package com.codewithluki.product;

public class Quad implements Product {
    @Override
    public double getPrice() {
        return 34000;
    }

    @Override
    public String getName() {
        return "Yamaha";
    }

    @Override
    public double getWeight() {
        return 230;
    }

    @Override
    public double getPriceShipment() {
        return 200;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
