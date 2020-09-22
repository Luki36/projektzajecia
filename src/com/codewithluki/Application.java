package com.codewithluki;

/* Utwórz sklep i dodaj do niego produkty wykorzystując klasy z pakietu dataproduct
 * */

import com.codewithluki.dataproduct.*;
import com.codewithluki.product.Fridge;
import com.codewithluki.shops.Shop;
import java.time.LocalDate;


public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop("UK chocolat shop", "Huntington",
                LocalDate.of(2020, 8, 10));

        System.out.println("---------------- Drinks Products ------------------");
        shop.addProduct(DrinksData.getAllDrinksList());
        System.out.println("----------------- Foods Products ------------------");
        shop.addProduct(FoodData.getFoodList());
        System.out.println("------------------ RTV Products -------------------");
        shop.addProduct(RtvData.getRtvList());
        System.out.println("---------------- Furniture Products----------------");
        shop.addProduct(FurnitureData.getFurniture());
        System.out.println("----------Vehicle And Extra Parts Product----------");
        shop.addProduct(VehicleAndExtraPartsData.getVehicleAndExtraPartsList());
        System.out.println("--------------- Clothes Product -------------------");
        shop.addProduct(ClothesData.getAllClothesProductList());
        System.out.println("-------------- Jewelery Products ------------------");
        shop.addProduct(JeweleryData.getJeweleryList());

        System.out.println(" Posortowanie Produktów " );
        


        System.out.println( "Ilość dodanych produktów to: " +  shop.getProductList().size());

        shop.printShopProducts();

        shop.removeProduct(DrinksData.getSoftDrinksList());

        shop.printShopProducts();

        System.out.println("Podejście nr 1 z przekazaniem instancji klasy w konstruktorze");

        MultiCurrencyShop multiCurrencyShop = new MultiCurrencyShop(new Fridge());

        System.out.println("Cena lodówki po przeliczeniu w dolarach: "   +  multiCurrencyShop.getDolarPriceValue());
        System.out.println("Cena lodówki po przeliczeniu w euro: " + multiCurrencyShop.getEuroPriceValue());
        System.out.println("Cena lodówki w pln: " + multiCurrencyShop.getPriceInPLN());

        System.out.println("Podejście nr 2 z przekazaniem instancji klasy w metodzie");

        Fridge fridge = new Fridge();

        System.out.println("Cena lodówki po przeliczeniu w euro: " + MultiCurrencyShop.getEuroPriceValue(fridge));
        System.out.println("Cena lodówki po przeliczeniu w dolarach: " + MultiCurrencyShop.getDolarPriceValue(fridge));

        System.out.println("Podejście nr 3 z przekazaniem ceny produktu w metodzie");

        Fridge fridge2 = new Fridge();

        System.out.println("Cena lodówki po przeliczeniu w euro: " + MultiCurrencyShop.getEuroPriceValue(fridge2.getPrice()));
        System.out.println("Cena lodówki po przeliczeniu w dolarach:"  + MultiCurrencyShop.getDolarPriceValue(fridge2.getPrice()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        shop.streamProduct();

    }
}
