package com.example.shoppingbasket;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketCalculator {
	private final Map<String, PricingRule> pricingRules;

    public BasketCalculator() {
        pricingRules = new HashMap<>();
        pricingRules.put("Apple", new NormalPrice(35));
        pricingRules.put("Banana", new NormalPrice(20));
        pricingRules.put("Melon", new BuyOneGetOneFree(50));
        pricingRules.put("Lime", new ThreeForTwo(15));
    }

    public int calculateTotalPrice(List<String> items) {
        Map<String, Integer> counts = new HashMap<>();
        for (String item : items) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }

        int total = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            PricingRule rule = pricingRules.get(item);
            if (rule == null) {
                throw new IllegalArgumentException("Unknown item: " + item);
            }
            total += rule.calculateCost(quantity);
        }
        return total;
    }

    public static void main(String[] args) {
    	List<String> items = Arrays.asList(args);
        BasketCalculator calculator = new BasketCalculator();
        int total = calculator.calculateTotalPrice(items);
        System.out.println("Total price: " + total + "p");
    }

}
