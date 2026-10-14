package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String name;
        double price;
        int quantity;

        name="banana";
        price=0.45;
        quantity=5;
        System.out.println("You bought "+quantity+" "+name+"s for "+quantity*price);
    }
}
