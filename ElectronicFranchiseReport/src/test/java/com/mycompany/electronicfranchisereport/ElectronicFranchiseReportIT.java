/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.electronicfranchisereport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tshilidzi
 */
public class ElectronicFranchiseReportIT {
    
    public ElectronicFranchiseReportIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class ElectronicFranchiseReport.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ElectronicFranchiseReport.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayGamingReport method, of class ElectronicFranchiseReport.
     */
    @Test
    public void testDisplayGamingReport() {
        System.out.println("displayGamingReport");
        String[] cities = null;
        String[] consoles = null;
        int[][] sales = null;
        ElectronicFranchiseReport.displayGamingReport(cities, consoles, sales);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayCityWithMostSales method, of class ElectronicFranchiseReport.
     */
    @Test
    public void testDisplayCityWithMostSales() {
        System.out.println("displayCityWithMostSales");
        String[] cities = null;
        int[][] sales = null;
        ElectronicFranchiseReport.displayCityWithMostSales(cities, sales);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
