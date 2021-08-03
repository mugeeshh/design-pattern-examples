package com.designpattern3.behavioral.strategy;

//https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
/*
 * Strategy design pattern is one of the behavioral design pattern.
 *  Strategy pattern is used when we have multiple algorithm for a specific task 
 *  and client decides the actual implementation to be used at runtime.
 */

public class ShoppingCartTestExample {
	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		
		Item item1=new Item("1001", 10);
		Item item2=new Item("1002", 30);

		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.removeItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("mugeesh@gmail.com","admin@123"));
		
		//payment by credit card
		cart.pay(new CreditCardStrategy("Mugeesh","12345678", "990", "08/22"));
	}
	/*
	 * Strategy Design Pattern Important Points
	 * 1.We could have used composition to create instance variable for strategies but we should avoid that as we want the specific strategy to be applied for a particular task. Same is followed in Collections.sort() and Arrays.sort() method that take comparator as argument.
	 * 2. Strategy Pattern is very similar to State Pattern. One of the difference is that Context contains state as instance variable and there can be multiple tasks whose implementation can be dependent on the state whereas in strategy pattern strategy is passed as argument to the method and context object doesn’t have any variable to store it.
	 * 3. Strategy pattern is useful when we have multiple algorithms for specific task and we want our application to be flexible to chose any of the algorithm at runtime for specific task.
	 */
}
