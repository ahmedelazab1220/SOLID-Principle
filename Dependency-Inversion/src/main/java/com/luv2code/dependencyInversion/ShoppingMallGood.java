package com.luv2code.dependencyInversion;

import com.luv2code.dependencyInversion.good.BankCard;
import com.luv2code.dependencyInversion.good.CreditCardGood;

public class ShoppingMallGood {

	private BankCard bankCard;
	
	public ShoppingMallGood(BankCard bankCard) {
	    this.bankCard = bankCard;
	}
	
	public void doPayment(Object order, int amount){
	    bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		BankCard bankCard=new CreditCardGood();
        ShoppingMallGood shoppingMall1 =new ShoppingMallGood(bankCard);
        shoppingMall1.doPayment("do some order", 10000);

	}

}