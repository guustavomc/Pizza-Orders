package org.example;

import java.util.ArrayList;
import java.util.List;

/*
From the pizzas JSON dataset, print to console the following:
- How many "Four Cheese" pizzas were ordered?
- How many "Caprese" pizzas with "medium" size were ordered?
- How many unique customer names there are?
*/
public class Main {
    public static void main(String[] args) {

        ReadOrders newListOrders = new ReadOrders();
        newListOrders.readOrderFromJson();
        List<Order> orderLists = newListOrders.getListOrders();
        //System.out.println(orderLists.get(0).getCustomerName());

        System.out.println("How many \"Four Cheese\" pizzas were ordered? "+FilterOrders.filterByUniqueFlavor(orderLists,"Four Cheese"));
        System.out.println("How many \"Caprese\" pizzas with \"medium\" size were ordered? "+FilterOrders.filterByUniqueFlavorAndSize(orderLists,"Caprese","medium"));
        System.out.println("How many unique customer names there are? "+FilterOrders.filterByUniqueCustomerName(orderLists));

    }
}