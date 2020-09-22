package com.codewithluki.test;

/*
Utwórz klasę np. DrinksData która zwróci nam w postaci listy produkty danego typu,
 w nowym pakiecie o nazwie dataproduct
*/

import com.codewithluki.dataproduct.DrinksData;
import com.codewithluki.product.Product;

import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Product> drinksList = DrinksData.getAllDrinksList();

    }

}
