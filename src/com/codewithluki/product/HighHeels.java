package com.codewithluki.product;

public class HighHeels implements Product {
    @Override
    public double getPrice() {
        return 199;
    }

    @Override
    public String getName() {
        return "Even&Odd";
    }

    @Override
    public double getWeight() {
        return 368;
    }

    @Override
    public double getPriceShipment() {
        return 14.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
