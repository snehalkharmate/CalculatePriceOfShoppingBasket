package com.example.shoppingbasket;

public class BuyOneGetOneFree implements PricingRule{
	private final int pricePerUnit;

    public BuyOneGetOneFree(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    
	@Override
	public int calculateCost(int quantity) {
		int groups = quantity / 2;
        int remainder = quantity % 2;
        return (groups + remainder) * pricePerUnit;

	}

}
