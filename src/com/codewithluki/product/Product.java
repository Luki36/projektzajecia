package com.codewithluki.product;

public interface Product {
    double getPrice();
    String getName();
    double getWeight();
    double getPriceShipment();
    double getCapacity();

    //Double = null vs double = 0.0
    //boolean vs Boolean
}
