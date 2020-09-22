package com.codewithluki.product;

public class Helmet implements Product {
    @Override
    public double getPrice() {
        return 180;
    }

    @Override
    public String getName() {
        return "Leopard";
    }

    @Override
    public double getWeight() {
        return 459;
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
