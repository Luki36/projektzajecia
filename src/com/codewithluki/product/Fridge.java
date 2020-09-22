package com.codewithluki.product;

public class Fridge implements Product {
    @Override
    public double getPrice() {
        return 2860;
    }

    @Override
    public String getName() {
        return "Whirpool";
    }

    @Override
    public double getWeight() {
        return 48;
    }

    @Override
    public double getPriceShipment() {
        return 42;
    }

    @Override
    public double getCapacity() {
        return 233 ;
    }
}
