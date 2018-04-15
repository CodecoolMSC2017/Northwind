package com.codecool.web.service;

import java.util.ArrayList;
import java.util.List;

public class HeadersService {

    public List<String> getHeaders(String taskId){
        List<String> headers = new ArrayList<>();

        if (taskId.equals("task1")) {
            headers.add("Product Name");
            headers.add("Supplier");
        }else if (taskId.equals("task2")){
            headers.add("Supplier");
            headers.add("Number of Products");
        }else if (taskId.equals("task3")){
            headers.add("Supplier");
            headers.add("Number of Products");
        }else if (taskId.equals("task4")) {
            headers.add("Customer");
            headers.add("Order numbers");
        }else if (taskId.equals("task5")){
            headers.add("Supplier");
            headers.add("Most expensive product");
            headers.add("Price of Product");
        }

        return headers;
    }

}
