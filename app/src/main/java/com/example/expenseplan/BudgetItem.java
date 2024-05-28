package com.example.expenseplan;

public class BudgetItem {
    private double price;
    private String item;
    private String type;

    public BudgetItem(double price, String item, String type) {
        this.price = price;
        this.item = item;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getItem() {
        return item;
    }

    public String getType() {
        return type;
    }
}