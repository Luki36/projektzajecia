package com.codewithluki.dataproduct;

import com.codewithluki.product.*;

import java.util.ArrayList;
import java.util.List;

public class JeweleryData  {
    public static List<Product> getJeweleryList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Watch());
        productList.add(new Necklaces());
        productList.add(new Earrings());
        productList.add(new Rings());
        productList.add(new Chain());
        productList.add(new Bracelet());
        productList.add(new Locket());
        productList.add(new Brooch());

        return productList;
    }
    public static  List<Product> getJeweleryGoldList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Necklaces());
        productList.add(new Earrings());
        productList.add(new Rings());
        productList.add(new Chain());
        productList.add(new Bracelet());

        return productList;
    }
    public static List<Product> getJeweleryOtherList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Watch());
        productList.add(new Locket());
        productList.add(new Brooch());

        return productList;

    }
}
