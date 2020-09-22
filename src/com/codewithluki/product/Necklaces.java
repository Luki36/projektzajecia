package com.codewithluki.product;

public class Necklaces implements Product{
    @Override
    public double getPrice() {
        return 1300;
    }

    @Override
    public String getName() {
        return "Opal in Gold";
    }

    @Override
    public double getWeight() {
        return 0.027;
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
