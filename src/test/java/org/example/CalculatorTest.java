package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class CalculatorTest
{

    @BeforeEach
    void init() {
        System.out.println("Testing... Testing...");
    }

    @Test
    @DisplayName("Plus")
    public void plusTest() {
        Calculator calculator = new Calculator();
        assertNotEquals( 19, Calculator.plus(11, 94) );
    }

    @Test
    @DisplayName("Minus")
    public void minusTest() {
        Calculator calculator = new Calculator();
        assertEquals(5, Calculator.minus(10, 5));
    }

    @RepeatedTest(10)
    @DisplayName("Dividera")
    public void DivideraTest() {
        Calculator calculator = new Calculator();
        assertFalse(6==Calculator.dividera(9, 3));
    }

    @Test
    @DisplayName("Multiplicera")
    public void multipliceraTest() {
        Calculator calculator = new Calculator();
        assertTrue(18==Calculator.multiplicera(6, 3));
    }
}
