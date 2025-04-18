package org.example;

import java.util.List;

public class FilterOrders {

    public static int filterByUniqueCustomerName(List<Order> orderList){
        return (int) orderList.stream().map(Order::getCustomerName).distinct().count();
    }

    public static int filterByUniqueNumber(List<Order> orderList, String number){
        return (int) orderList.stream().filter(order -> order.getNumber().equalsIgnoreCase(number)).distinct().count();
    }

    public static int filterByUniqueFlavor(List<Order> orderList, String flavor){
        return (int) orderList.stream().filter(order -> order.getFlavor().equalsIgnoreCase(flavor)).distinct().count();
    }

    public static int filterByUniqueSize(List<Order> orderList, String size){
        return (int) orderList.stream().filter(order -> order.getSize().equalsIgnoreCase(size)).distinct().count();
    }

    public static int filterByUniqueFlavorAndSize(List<Order> orderList, String flavor, String size){
        return (int) orderList.stream().filter(order -> order.getFlavor().equalsIgnoreCase(flavor) && order.getSize().equalsIgnoreCase(size)).distinct().count();
    }


}
