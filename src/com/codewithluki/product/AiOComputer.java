package com.codewithluki.product;

public class AiOComputer implements Product {
    @Override
    public double getPrice() {
        return 3600;
    }

    @Override
    public String getName() {
        return "Dell";
    }

    @Override
    public double getWeight() {
        return 4.3;
    }

    @Override
    public double getPriceShipment() {
        return 65;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
