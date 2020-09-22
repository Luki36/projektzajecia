package com.codewithluki.dataproduct;

import com.codewithluki.product.*;

import java.util.ArrayList;
import java.util.List;

public class RtvData {
    public static List<Product> getRtvList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new AiOComputer());
        productList.add(new Dishwasher());
        productList.add(new Fridge());
        productList.add(new Laptop());
        productList.add(new Smartphone());
        productList.add(new Tablet());
        productList.add(new Tv());
        productList.add(new WaschMachine());

        return productList;
    }

}
