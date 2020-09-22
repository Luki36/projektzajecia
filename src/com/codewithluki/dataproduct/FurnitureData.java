package com.codewithluki.dataproduct;

import com.codewithluki.product.*;

import java.util.ArrayList;
import java.util.List;

public class FurnitureData {

    public static List<Product>getFurniture(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Bed());
        productList.add(new Overcoat());
        productList.add(new Sofa());
        productList.add(new Table());
        productList.add(new Wardrobe());

        return productList;
    }
}
