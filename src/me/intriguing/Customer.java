package me.intriguing;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer implements Comparable<Customer> {

    private String name;
    private UUID customerID;
    private List<Double> transactions = new ArrayList<>();

    // ...


    public Customer(String name) {
        this.name = name;
        this.customerID = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getCustomerID() {
        return customerID;
    }

    public void getTransactions() {
        System.out.println("Transactions: ");
        for (double transaction : transactions) {
            System.out.println("- " + transaction);
        }
    }

    @Override
    public int compareTo(Customer customer) {
        return this.name.toString().compareToIgnoreCase(customer.getName().toString());
    }
}