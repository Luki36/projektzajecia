package com.codewithluki;

import com.codewithluki.product.Product;

import java.text.DecimalFormat;

/*
* Przekazujemy produkt, sklep nam przelicza walute na dolary, euro z pln.
*
* */
public class MultiCurrencyShop {

    //przeciążanie metody getEuroPriceValue oraz getDolarPriceValue


    private double priceInPLN;

    public MultiCurrencyShop(double priceInPLN) {
        this.priceInPLN = priceInPLN;


    }

    public MultiCurrencyShop(Product product) {
        this.priceInPLN = product.getPrice();
    }

    public double getDolarPriceValue() {
       return Math.round(priceInPLN / 3.96 * 100.0) / 100.0;
    }

    public double getEuroPriceValue() {

        return Math.round(priceInPLN/ 4.32 * 100.0 )/100.0;
    }

    public static double getDolarPriceValue(Product product) {

        return Math.round(product.getPrice() / 3.96 * 100.0)/100.0  ;
    }

    public static double getEuroPriceValue(Product product) {
        return  Math.round(product.getPrice()/4.32 * 100.0)/100.0;
    }

    public static double getDolarPriceValue(double priceInPLN) {
        return Math.round(priceInPLN / 3.96 * 100.0)/100.0;
    }

    public static double getEuroPriceValue(double priceInPLN) {
        return Math.round(priceInPLN/4.32*100.0)/100.0;
    }


    public double getPriceInPLN() {
        return priceInPLN;
    }

    public void setPriceInPLN(double priceInPLN) {
        this.priceInPLN = priceInPLN;
    }
}
