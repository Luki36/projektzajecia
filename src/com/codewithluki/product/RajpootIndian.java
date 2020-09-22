package com.codewithluki.product;

public class RajpootIndian implements Product {
    @Override
    public double getPrice() {
        return 79.99;
    }

    @Override
    public String getName() {
        return "Chicken Tikka Massala";
    }

    @Override
    public double getWeight() {
        return 0.83;
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
