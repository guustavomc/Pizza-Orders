package org.example;

public class Order {

    private String customerName;
    private String number;
    private String flavor;
    private String size;

    public Order(String customerName, String number, String flavor, String size){
        this.customerName=customerName;
        this.number=number;
        this.flavor=flavor;
        this.size=size;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
