package com.codewithluki.product;

public class Wardrobe implements Product {
    @Override
    public double getPrice() {
        return 5499;
    }

    @Override
    public String getName() {
        return "Amadeo 3 door";
    }

    @Override
    public double getWeight() {
        return 210;
    }

    @Override
    public double getPriceShipment() {
        return 149;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
