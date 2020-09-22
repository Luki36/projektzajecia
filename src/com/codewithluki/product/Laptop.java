package com.codewithluki.product;

public class Laptop implements Product {


    @Override
    public double getPrice() {
        return 4600;
    }

    @Override
    public String getName() {
        return "Lenovo";
    }

    @Override
    public double getWeight() {
        return 1.66;
    }

    @Override
    public double getPriceShipment() {
        return 50;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
