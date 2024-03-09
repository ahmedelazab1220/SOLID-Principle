package com.luv2code.dependencyInversion;

import com.luv2code.dependencyInversion.bad.DebitCardGood;

public class ShoppingMallBad {
	private DebitCardGood debitCard;
	
	public ShoppingMallBad(DebitCardGood debitCard) {
	        this.debitCard = debitCard;
	}
	public void doPayment(Object order, int amount){         
		debitCard.doTransaction(amount); 
	}
	public static void main(String[] args) {
		
		// Let's try test-bad example

		System.out.println("Bad Example\n");
		
		DebitCardGood debitCard=new DebitCardGood();
	    ShoppingMallBad shoppingMall=new ShoppingMallBad(debitCard);
	    shoppingMall.doPayment("some order",5000);
		
	}

}
