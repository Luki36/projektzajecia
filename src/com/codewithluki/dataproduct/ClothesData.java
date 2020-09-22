package com.codewithluki.dataproduct;

import com.codewithluki.product.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClothesData {

    public static List<Product> getAllClothesProductList(){
        List<Product>productList = new ArrayList<>();
        productList.add(new Shirt());
        productList.add(new Shoes());
        productList.add(new Suit());
        productList.add(new Overcoat());
        productList.add(new Dress());
        productList.add(new HighHeels());
        productList.add(new Underwear());

        return productList;
    }

    public static List<Product> getMensClothesProductList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Shirt());
        productList.add(new Shoes());
        productList.add(new Suit());
        productList.add(new Overcoat());

        return productList;

    }
    public static List<Product> getWomansClothesProductList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Dress());
        productList.add(new HighHeels());
        productList.add(new Underwear());

        return productList;
    }


}
