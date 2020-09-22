package com.codewithluki.product;

public class McDonald implements Product {
    @Override
    public double getPrice() {
        return 46;
    }

    @Override
    public String getName() {
        return "Big Mac Meal";
    }

    @Override
    public double getWeight() {
        return 0.64;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
