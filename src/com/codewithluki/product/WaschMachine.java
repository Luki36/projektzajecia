package com.codewithluki.product;

public class WaschMachine implements Product {
    @Override
    public double getPrice() {
        return 2800;
    }

    @Override
    public String getName() {
        return "Bosch";
    }

    @Override
    public double getWeight() {
        return 11;
    }

    @Override
    public double getPriceShipment() {
        return 55;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
