package com.codewithluki.product;

public class BikeRack implements Product {
    @Override
    public double getPrice() {
        return 688.99;
    }

    @Override
    public String getName() {
        return "Peruzzo";
    }

    @Override
    public double getWeight() {
        return 3.8;
    }

    @Override
    public double getPriceShipment() {
        return 39.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
