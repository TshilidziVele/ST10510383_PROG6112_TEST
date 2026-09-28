/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicfranchisereport;

/**
 *
 * @author Tshilidzi
 */




                                      /*   QUESTION 1      (20 MARKS) */
public class ElectronicFranchiseReport {
    public static void main(String[] args) {
 String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
    String[] consoles = {"PS5", "Xbox", "Nintendo"};
        
        int[][] productSales = {
            {1000, 2000, 3000},  
                {2000, 3000, 4000}, 
                {1500, 1100, 1200},
        };
        displayGamingReport(cities, consoles, productSales);
        displayCityWithMostSales(cities, productSales);
    }
    public static void displayGamingReport(String[] cities, String[] consoles, int[][] sales) {
         System.out.println("----------------------------------------");
          System.out.println("GAMING CONSOLE SALES REPORT");
          System.out.println("------------------------------------------\n");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + ":");
            int cityTotal = 0;
             for (int j = 0; j < consoles.length; j++) {
                System.out.printf("  %s: %d%n", consoles[j], sales[i][j]); cityTotal += sales[i][j];
            }
            System.out.printf("  Total: %d%n\n", cityTotal);
        }
        System.out.println("--------------------------------------------------------");
    }
    public static void displayCityWithMostSales(String[] cities, int[][] sales) {
        
        int maxCitySales = 0; 
        
        
           int maxCityIndex = 0 ;
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) 
           
            { 
                cityTotal += sales[i][j];
          
            }
            
         if (cityTotal > maxCitySales) {
              maxCitySales = cityTotal;
               maxCityIndex = i ;
            }
        }
        System.out.println("\nCity with Most Sales: " + cities[maxCityIndex] + " (" + maxCitySales + " units)");
    
    
    
    }




}