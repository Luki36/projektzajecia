package com.codewithluki.product;

public class VeganFoodProject implements Product {
    @Override
    public double getPrice() {
        return 112.99;
    }

    @Override
    public String getName() {
        return "Choco Frito";
    }

    @Override
    public double getWeight() {
        return 0.58;
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
