package com.company;
import java.util.ArrayList;
import java.util.Scanner;


 public class Main {


     static class Product {
         String name;
         int price;
         boolean in_stock;

         Product(String name, int price, boolean in_stock) {
             this.name = name;
             this.price = price;
             this.in_stock = in_stock;
         }
     }

     public static void printProducts(ArrayList<Product> products) {
         int n = products.size(), i;
         for (i = 0; i < n; i++) {
             System.out.println(products.get(i).name + "," + products.get(i).price + "," + products.get(i).in_stock);
         }
     }

     public static void sortingWithName(ArrayList<Product> products) {
         int n = products.size();
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - 1 - i; j++) {
                 if (products.get(j).name.compareTo(products.get(j + 1).name) > 0) {
                     Product x = products.get(j);
                     products.set(j, products.get(j + 1));
                     products.set(j + 1, x);
                 }
             }
         }
     }

     public static void sortingWithPrice(ArrayList<Product> products) {
         int n = products.size();
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - 1 - i; j++) {
                 if (products.get(j).price > products.get(j + 1).price) {
                     Product x = products.get(j);
                     products.set(j, products.get(j + 1));
                     products.set(j + 1, x);
                 }
             }
         }
     }

     public static void sortingWithStock(ArrayList<Product> products) {
         int n = products.size();
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - 1 - i; j++) {
                 if (Boolean.toString(products.get(j).in_stock).compareTo(Boolean.toString(products.get(j + 1).in_stock)) < 0) {
                     Product x = products.get(j);
                     products.set(j, products.get(j + 1));
                     products.set(j + 1, x);
                 }
             }
         }
     }


     public static void main(String[] args) {
         ArrayList<Product> products = new ArrayList<>();
         new Scanner(System.in);

         Product obj = new Product("Carrot", 10, true);
         Product obj1 = new Product("Banana Half Dozen", 20, false);
         Product obj2 = new Product("Banana Dozen", 40, true);
         products.add(obj);
         products.add(obj1);
         products.add(obj2);
         printProducts(products);
         System.out.println("Sorted by name:");
         sortingWithName(products);
         printProducts(products);
         printProducts(products);
         System.out.println("Sorted by price:");
         sortingWithPrice(products);
         printProducts(products);
         System.out.println("Sorted by in-stack:");
         sortingWithStock(products);
         printProducts(products);
     }
 }