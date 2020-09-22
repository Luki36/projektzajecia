package com.codewithluki.dataproduct;

import com.codewithluki.product.*;

import java.util.ArrayList;
import java.util.List;

public class FoodData {

    public static List<Product> getFoodList(){
        List<Product>productList = new ArrayList<>();
        productList.add(new KFC());
        productList.add(new Pizza());
        productList.add(new McDonald());
        productList.add(new RajpootIndian());
        productList.add(new TheGreatWallFood());
        productList.add(new VeganFoodProject());

        return productList;
    }

}
