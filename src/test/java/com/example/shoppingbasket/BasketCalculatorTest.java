package com.example.shoppingbasket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.shoppingbasket.BasketCalculator;

public class BasketCalculatorTest {
	 private BasketCalculator calculator;

	    @BeforeEach
	    void setUp() {
	        calculator = new BasketCalculator();
	    }

	    @Test
	    void testEmptyBasket() {
	        List<String> items = Collections.emptyList();
	        assertEquals(0, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testSingleApple() {
	        List<String> items = Collections.singletonList("Apple");
	        assertEquals(35, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testTwoApples() {
	        List<String> items = Arrays.asList("Apple", "Apple");
	        assertEquals(70, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testSingleBanana() {
	        List<String> items = Collections.singletonList("Banana");
	        assertEquals(20, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testThreeBananas() {
	        List<String> items = Arrays.asList("Banana", "Banana", "Banana");
	        assertEquals(60, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testSingleMelon() {
	        List<String> items = Collections.singletonList("Melon");
	        assertEquals(50, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testTwoMelons() {
	        List<String> items = Arrays.asList("Melon", "Melon");
	        assertEquals(50, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testThreeMelons() {
	        List<String> items = Arrays.asList("Melon", "Melon", "Melon");
	        assertEquals(100, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testFourMelons() {
	        List<String> items = Arrays.asList("Melon", "Melon", "Melon", "Melon");
	        assertEquals(100, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testSingleLime() {
	        List<String> items = Collections.singletonList("Lime");
	        assertEquals(15, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testThreeLimes() {
	        List<String> items = Arrays.asList("Lime", "Lime", "Lime");
	        assertEquals(30, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testFourLimes() {
	        List<String> items = Arrays.asList("Lime", "Lime", "Lime", "Lime");
	        assertEquals(45, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testFiveLimes() {
	        List<String> items = Arrays.asList("Lime", "Lime", "Lime", "Lime", "Lime");
	        assertEquals(60, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testMixedItems() {
	        List<String> items = Arrays.asList("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
	        assertEquals(185, calculator.calculateTotalPrice(items));
	    }

	    @Test
	    void testUnknownItemThrowsException() {
	        List<String> items = Collections.singletonList("Pear");
	        assertThrows(IllegalArgumentException.class, () -> calculator.calculateTotalPrice(items));
	    }

}
