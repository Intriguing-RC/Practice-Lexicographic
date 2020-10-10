package me.intriguing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("Kenny"));
        customerList.add(new Customer("Riley"));
        customerList.add(new Customer("Nick"));
        customerList.add(new Customer("Donald"));
        customerList.add(new Customer("Bill"));
        customerList.add(new Customer("Tom"));
        customerList.add(new Customer("Olly"));


        // Randomly shuffle the list and print the modified list
        Collections.shuffle(customerList);
        printCustomerList(customerList);

        // Sort the collections based on Customer#compareTo method and print the modified list.
        Collections.sort(customerList);
        printCustomerList(customerList);

    }

    public static void printCustomerList(List<? extends Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.print(customer.getName() + " ");
        }

        System.out.println();
        System.out.println("============================================");
    }
}