package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppIntegrationTest {

    @Test
    public void testAddInBusinessScenario() {
        // Simulate a business logic scenario where add() is used
        int invoiceAmount = 150;
        int tax = 15;
        int expectedTotal = 165;

        int actualTotal = App.add(invoiceAmount, tax);
        assertEquals("Total amount with tax should be correct", expectedTotal, actualTotal);
    }

    @Test
    public void testAddWithLargeNumbers() {
        int a = 1_000_000;
        int b = 2_000_000;
        int expected = 3_000_000;

        int result = App.add(a, b);
        assertEquals("Addition of large numbers should be correct", expected, result);
    }
}
