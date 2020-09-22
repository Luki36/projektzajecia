package com.codewithluki.shops;

import com.codewithluki.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop implements Comparator<Product> {

    private String shopName;
    private String adress;
    private LocalDate startShopDate;
    private List<Product> productList;   // lista produktow jako zmienna

    //przeciążanie konstruktora
    public Shop(String shopName, String adress, LocalDate startShopDate, List<Product> productList) {
        this.shopName = shopName;
        this.adress = adress;
        this.startShopDate = startShopDate;
        this.productList = productList;
    }

    public Shop(String shopName, String adress, LocalDate startShopDate) {
        this.shopName = shopName;
        this.adress = adress;
        this.startShopDate = startShopDate;
        this.productList = new ArrayList<>();
    }


    private boolean checkProductListIsNull() {// metoda która sprawdza czy lista produktów istnieje
        if (productList == null) {
            System.out.println("Sklep o nazwie " + getShopName() + " posiada pusta listę produktów");
            return true;
        }
        return false;
    }

    public void addProduct(Product product) {
        if (checkProductListIsNull()) return;
        productList.add(product);
        System.out.println("Produkt o nazwie: " + product.getName() + " został pomyślnie dodany");
    }

    public void removeProduct(Product product) {
        if (checkProductListIsNull()) return;
        productList.remove(product);
        System.out.println("Product został pomyślnie usuniety " + product.getName());
    }

    public void addProduct(List<Product> productList) {
        if (checkProductListIsNull()) return;
        productList.sort(this::compare);
        for (Product product : productList) {
            this.productList.add(product);
            System.out.println("Produkt o nazwie: " + product.getName() + " został pomyślnie dodany");
        }
    }

    public void removeProduct(List<Product> productList) {
        if (checkProductListIsNull()) return;
        for (Product product : productList) {
            this.productList.remove(product);
            System.out.println("Produkt o nazwie: " + product.getName() + " został pomyślnie usunięty");
        }
    }

    public void setDiscount(double discount) { //metoda ktora obniza cene
        if (checkProductListIsNull()) return;
        for (Product product : productList) {
            double dicountValue = product.getPrice() * discount / 100;
            double priceAfterDiscount = product.getPrice() - dicountValue;
            System.out.println("Cena " + product.getName() + " po obniżce to:" + priceAfterDiscount);
        }
    } // metoda jest wtedy kiedy jest {}

    public void printShopProducts() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        productList.sort(this::compare);
        for (Product product : productList) {
            System.out.println("Produkt o nazwie: " + product.getName() + " ma cenę: " + product.getPrice());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public int compare(Product o1, Product o2) {
        int result = o1.getName().compareToIgnoreCase(o2.getName());
        if (result == 0) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
        return result;
    }

    public void streamProduct() {
        productList.stream().sorted(this::compare).forEach(s -> System.out.println("Produkt o nazwie: " + s.getName() + " ma cenę: " + s.getPrice()));
    }

    public void streamProductByCapacity() {
        //TODO
        productList.stream().sorted(this::compare).forEach(s -> System.out.println("Produkt o nazwie: " + s.getName() + " ma cenę: " + s.getPrice()));
    }

    public void streamProductByWeight() {
        //TODO odwrotne sortowanie
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getStartShopDate() {
        return startShopDate;
    }

    public void setStartShopDate(LocalDate startShopDate) {
        this.startShopDate = startShopDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
