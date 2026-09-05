package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class Main {
    public static void main(String[] args) {


        Product p1 = new Product("Хлеб", 75);
        Product p2 = new Product("Молоко", 100);
        Product p3 = new Product("Рыба", 350);
        Product p4 = new Product("Сыр", 120);
        Product p5 = new Product("Масло", 200);
        Product p6 = new Product("Колбаса", 300);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4);
        basket.addProduct(p5);
        basket.addProduct(p6);

        System.out.println();

        basket.printBasket();

        System.out.println();

        System.out.println("Общая стоимость: " + basket.getTotalCost());

        System.out.println();

        System.out.println("Есть ли \"Масло\" в корзине " + basket.containsByName("Масло"));

        System.out.println();

        System.out.println("Есть ли \"Творог\" в корзине " + basket.containsByName("Творог"));

        basket.clear();

        System.out.println();

        basket.printBasket();

        System.out.println();

        System.out.println("Общая стоимость: " + basket.getTotalCost());

        System.out.println();

        System.out.println("Есть ли \"Масло\" в корзине " + basket.containsByName("Масло"));

    }
}