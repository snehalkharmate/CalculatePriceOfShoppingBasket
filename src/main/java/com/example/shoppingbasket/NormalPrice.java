package com.example.shoppingbasket;

public class NormalPrice implements PricingRule{
	private final int pricePerUnit;

    public NormalPrice(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

	@Override
	public int calculateCost(int quantity) {
		return quantity * pricePerUnit;

	}

}
