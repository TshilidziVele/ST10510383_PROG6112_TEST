/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.iconsoles;

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
public class IConsolesIT {
    
    public IConsolesIT() {
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
     * Test of calculateTotalSales method, of class IConsoles.
     */
    @Test
    public void testCalculateTotalSales() {
        System.out.println("calculateTotalSales");
        IConsoles instance = new IConsolesImpl();
        int expResult = 0;
        int result = instance.calculateTotalSales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStoreName method, of class IConsoles.
     */
    @Test
    public void testGetStoreName() {
        System.out.println("getStoreName");
        IConsoles instance = new IConsolesImpl();
        String expResult = "";
        String result = instance.getStoreName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsoleType method, of class IConsoles.
     */
    @Test
    public void testGetConsoleType() {
        System.out.println("getConsoleType");
        IConsoles instance = new IConsolesImpl();
        String expResult = "";
        String result = instance.getConsoleType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalAmount method, of class IConsoles.
     */
    @Test
    public void testGetTotalAmount() {
        System.out.println("getTotalAmount");
        IConsoles instance = new IConsolesImpl();
        int expResult = 0;
        int result = instance.getTotalAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySalesInfo method, of class IConsoles.
     */
    @Test
    public void testDisplaySalesInfo() {
        System.out.println("displaySalesInfo");
        IConsoles instance = new IConsolesImpl();
        instance.displaySalesInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IConsolesImpl implements IConsoles {

        public int calculateTotalSales() {
            return 0;
        }

        public String getStoreName() {
            return "";
        }

        public String getConsoleType() {
            return "";
        }

        public int getTotalAmount() {
            return 0;
        }

        public void displaySalesInfo() {
        }
    }
    
}
