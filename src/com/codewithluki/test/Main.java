package com.codewithluki.test;

import com.codewithluki.product.*;
import com.codewithluki.shops.Shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Stwórz interfejs Produkt, przemyśl jakie powinien mieć w sobie metody. Zrób minimum 8 implementacji
//        interfejsu Produkt. Stwórz sklep który będzie miał w sobie listę Produktów, które sprzedaje.
//        Napisz funkcjonalność wyprzedaży sklepu w którym będziesz mógł obniżyć cenę wszystkich produktów
//        o np. o 15% (wartość należny móc wpisać ręcznie).
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        CocaCola cola = new CocaCola();
        Laptop laptop = new Laptop();
        Pizza pizza = new Pizza();
        Smartphone smartphone = new Smartphone();
        Tire tire = new Tire();
        Tv tv = new Tv();
        WaschMachine waschMachine = new WaschMachine();

        List<Product> productList = new ArrayList<>();
        productList.add(car);
        productList.add(cola);
        productList.add(laptop);
        productList.add(pizza);
        productList.add(smartphone);
        productList.add(tire);
        productList.add(tv);
        productList.add(waschMachine);

        Shop shop = new Shop("LukiShop","ul.Zlota", LocalDate.of(2019,1,10),productList);
        shop.setDiscount(20.0);

        Shop shop1 = new Shop("Po kradziezy",null,null,null);
        shop1.setDiscount(20.0);

        Smartphone smartphone1 = new Smartphone(); //instancja klasy mądry Luki o nazwie smartphone1

        productList.remove(laptop);
        for (Product element : productList) {
            System.out.println(element);

        }

    }
}
