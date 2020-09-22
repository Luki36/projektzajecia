package com.codewithluki.product;

public class TowBar implements Product {
    @Override
    public double getPrice() {
        return 768.50;
    }

    @Override
    public String getName() {
        return "Witter";
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
        return 0;
    }
}
