package com.codewithluki.dataproduct;

import com.codewithluki.product.*;

import java.util.ArrayList;
import java.util.List;

public class DrinksData {

    public static List<Product> getAllDrinksList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Beer());
        productList.add(new CocaCola());
        productList.add(new Champagne());
        productList.add(new Juice());
        productList.add(new Vodka());
        productList.add(new Whisky());
        productList.add(new Wine());
        productList.add(new MineralWater());
        productList.add(new Pepsi());
        productList.add(new DrPepper());


        return productList;
    }

    public static List<Product> getSoftDrinksList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new CocaCola());
        productList.add(new Juice());
        productList.add(new MineralWater());
        productList.add(new Pepsi());
        productList.add(new DrPepper());


        return productList;
    }

    public static List<Product> getAlcoholDrinksList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Beer());
        productList.add(new Champagne());
        productList.add(new Vodka());
        productList.add(new Whisky());
        productList.add(new Wine());

        return productList;
    }

}
