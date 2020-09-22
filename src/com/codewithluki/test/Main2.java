package com.codewithluki.test;

import com.codewithluki.product.*;
import com.codewithluki.shops.Shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        CocaCola cola = new CocaCola();
        Laptop laptop = new Laptop();
        Pizza pizza = new Pizza();
        Smartphone smartphone = new Smartphone();
        Tire tire = new Tire();
        Tv tv = new Tv();
        WaschMachine waschMachine = new WaschMachine();

        Shop shop = new Shop("Januszex", "Sosnowiec", LocalDate.of(2020, 02, 21));
        shop.addProduct(car);
        shop.addProduct(cola);
        shop.addProduct(laptop);
        shop.addProduct(pizza);
        shop.addProduct(smartphone);
        shop.addProduct(tire);
        shop.addProduct(tv);
        shop.addProduct(waschMachine);

        /*Na następne zajęcia dodaj:
        Możliwość usuwania konkretnego produktu
        Możliwość dodania kilku produktów naraz
        Możliwość usuwania kilku produktów naraz
        analogicznie jak addProduct
        */


        shop.setDiscount(10.0);

        //Zadanie 1

        shop.printShopProducts();

        shop.removeProduct(laptop);

        shop.printShopProducts();

        //Zadanie 2
        System.out.println("Zadanie 2");
        List<Product> productList = new ArrayList<>();

        productList.add(new Bed());
        productList.add(new AiOComputer());
        productList.add(new Bike());

        shop.printShopProducts();

        shop.addProduct(productList);

        shop.printShopProducts();

        //Zadanie 3
        shop.removeProduct(productList);

    }
}
