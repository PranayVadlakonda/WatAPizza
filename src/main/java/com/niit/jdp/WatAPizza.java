package com.niit.jdp;

public class WatAPizza {
    public static void main(String[] args) {
        String customerName = "Garry";
        System.out.println("customerName" + " = " + customerName);
        int customerPhoneNumber = 412312345;
        System.out.println("customerPhoneNumber = " + customerPhoneNumber);
        String customerEmail = "gary@123.com";
        System.out.println("customerEmail = " + customerEmail);
        String customerAddress = "20, Marble Drive ,Eville";
        System.out.println("customerAddress = " + customerAddress);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------");
        System.out.println("Order Summary");
        System.out.println("---------------");
        System.out.println();
        System.out.println(" Sr no.   Item name   ItemQuantity   $price/unit   $totalprice");
        System.out.println("--------------------------------------------------------------");

        double pizzaPrice = 12.5;
        int noOfPizzasOrdered = 5;
        double totalPriceOfPizza = pizzaPrice * noOfPizzasOrdered;
        System.out.println(" 1 "+"       " + "Pizza" +"          " + noOfPizzasOrdered + "            " + pizzaPrice + "             " + totalPriceOfPizza);

        double garlicBreadPrice = 5.99;
        int noOfGarlicBreadsOrdered = 3;
        double totalPriceOfGarlicBread = noOfGarlicBreadsOrdered * garlicBreadPrice;
        System.out.println(" 2 "+"      " + "GarlicBread" +"     " + noOfGarlicBreadsOrdered + "             " + garlicBreadPrice +"            "+ totalPriceOfGarlicBread);

        double beveragePrice = 1.99;
        int noOfBeveragesOrdered = 3;
        double totalNoOfBeverages = noOfBeveragesOrdered * beveragePrice;
        System.out.println(" 3 "+"     " + "Beverages" +"        "+ noOfBeveragesOrdered + "             " + beveragePrice +"            "+ totalNoOfBeverages);
        System.out.println("--------------------------------------------------------------");

        double totalBillAmount = totalNoOfBeverages + totalPriceOfGarlicBread + totalPriceOfPizza;
        System.out.println("totalBillAmount : $" + totalBillAmount);
        System.out.println("Discount Offered : 10%");
        double amountToBePaid = totalBillAmount*90/100;
        System.out.println("amountToBePaid = " + amountToBePaid);
        System.out.println("--------------------Thank You---------------------------------");









    }
}