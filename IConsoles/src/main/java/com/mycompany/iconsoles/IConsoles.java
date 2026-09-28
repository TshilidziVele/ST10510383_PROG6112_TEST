/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iconsoles;

/**
 *
 * @author Tshilidzi
 */
interface IConsoles {
    int calculateTotalSales();
    String getStoreName();
    String getConsoleType();
    int getTotalAmount();
    void displaySalesInfo();
}
class Console implements IConsoles {
    protected String consoleType;
    protected String storeName;
    protected int totalAmount;
    
    public Console(String consoleType, String storeName, int totalAmount) {
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


