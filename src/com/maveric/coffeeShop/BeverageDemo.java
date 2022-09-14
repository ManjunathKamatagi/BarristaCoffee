package com.maveric.coffeeShop;

public class BeverageDemo {
	public static void main(String[] args) {
		Beverage c1 = new Coffee(50);
		c1 = new Caramel(c1, 20);
		c1 = new Cream(c1, 30);
		printOrderdetails(c1);

		Beverage t1 = new Tea(20);
		t1 = new Caramel(t1, 20);
		t1 = new Cream(t1, 30);
		printOrderdetails(t1);

	}

	private static void printOrderdetails(Beverage c) {
		System.out.println("Cost: " + c.getCost() + ", Description: " + c.getDescription());
	}
}
