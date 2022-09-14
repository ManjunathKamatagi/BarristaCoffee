package com.maveric.coffeeShop;

public class Chocolate extends BeverageDecorator {
	int chocolateCost;

	Chocolate(Beverage beverage, int chocolateCost) {
		this.beverage = beverage;
		this.chocolateCost = chocolateCost;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " topped with Chocolate";
	}

	@Override
	public int getCost() {
		return beverage.getCost() + chocolateCost;
	}

}
