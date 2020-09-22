package com.codewithluki.dataproduct;

import com.codewithluki.product.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleAndExtraPartsData {

    public static List<Product> getVehicleAndExtraPartsList(){
        List<Product>productList = new ArrayList<>();
        productList.add(new Quad());
        productList.add(new Car());
        productList.add(new Bike());
        productList.add(new Tire());
        productList.add(new BikeRack());
        productList.add(new RoofBox());
        productList.add(new TowBar());
        productList.add(new Van());
        productList.add(new Motorcycle());
        productList.add(new Helmet());
        productList.add(new WinterCarMats());

        return productList;
    }
    public static List<Product> getVehicleList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Quad());
        productList.add(new Car());
        productList.add(new Bike());
        productList.add(new Van());
        productList.add(new Motorcycle());

        return productList;
    }
    public static List<Product> getExtraPartsList(){
        List<Product>productList = new ArrayList<>();
        productList.add(new Tire());
        productList.add(new BikeRack());
        productList.add(new RoofBox());
        productList.add(new TowBar());
        productList.add(new Helmet());
        productList.add(new WinterCarMats());

        return productList;
    }
}
