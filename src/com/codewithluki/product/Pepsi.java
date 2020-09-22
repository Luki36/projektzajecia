package com.codewithluki.product;

public class Pepsi implements Product {
    @Override
    public double getPrice() {
        return 5.99;
    }

    @Override
    public String getName() {
        return "Sprite";
    }

    @Override
    public double getWeight() {
        return 1.68;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 2.5;
    }
}
