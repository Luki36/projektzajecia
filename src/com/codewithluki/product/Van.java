package com.codewithluki.product;

public class Van implements Product {
    @Override
    public double getPrice() {
        return 143800;
    }

    @Override
    public String getName() {
        return "Citroen Dispatch";
    }

    @Override
    public double getWeight() {
        return 1920;
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
