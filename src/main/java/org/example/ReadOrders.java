package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadOrders {

    private String filePath="src/main/resources/pizza_orders.json";
    private List<Order> listOrders = new ArrayList<>();

    public List<Order> getListOrders() {
        return listOrders;
    }

    public void readOrderFromJson(){
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            JsonNode rootNode = objectMapper.readTree(new File(filePath));

            for(JsonNode orderNode: rootNode){
                /*"name": "Blake",
                "phone_number": "579-680-7913",
                "pizza_flavor": "Chorizo",
                "pizza_size": "large"*/

                String customerName = orderNode.get("name").asText();
                String phoneNumber = orderNode.get("phone_number").asText();
                String pizzaFlavor = orderNode.get("pizza_flavor").asText();
                String pizzaSize = orderNode.get("pizza_size").asText();

                listOrders.add(new Order(customerName, phoneNumber, pizzaFlavor, pizzaSize));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
