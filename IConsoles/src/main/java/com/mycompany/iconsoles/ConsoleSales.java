/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iconsoles;

/**
 *
 * @author Tshilidzi
 */
class ConsoleSales extends Console {
    private String consoleType;
    private String storeName;
    private int totalAmount;
    
    public ConsoleSales(String consoleType, String storeName, int totalAmount) {
        super(consoleType, storeName, totalAmount);
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalAmount = totalAmount;
    }
    
    @Override
    public int calculateTotalSales() {
        return totalAmount;
    }
    
    @Override
    public String getStoreName() {
        return storeName;
    }
    
    @Override
    public String getConsoleType() {
        return consoleType;
    }
    
    @Override
    public int getTotalAmount() {
        return totalAmount;
    }
    @Override
    public void displaySalesInfo() {
        System.out.println("------------------------------------------");
        System.out.println("CONSOLE SALES INFORMATION");
        System.out.println("-------------------------------------------");
        System.out.println("Console Type: " + consoleType);
        System.out.println("Store Name: " + storeName);
        System.out.println("Total Sales:  " + totalAmount + " units");
        System.out.println("---------------------------------");
    }
}