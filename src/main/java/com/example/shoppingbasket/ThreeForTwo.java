package com.example.shoppingbasket;

public class ThreeForTwo implements PricingRule{
	  private final int pricePerUnit;

	    public ThreeForTwo(int pricePerUnit) {
	        this.pricePerUnit = pricePerUnit;
	    }

	@Override
	public int calculateCost(int quantity) {
		 int numberOfGroups = quantity / 3;
	        int remainder = quantity % 3;
	        return (numberOfGroups * 2 + remainder) * pricePerUnit;

	}
	

}
