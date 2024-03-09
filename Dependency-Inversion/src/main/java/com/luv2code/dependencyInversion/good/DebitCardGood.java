package com.luv2code.dependencyInversion.good;

public class DebitCardGood implements BankCard {

	@Override
	public void doTransaction(int amount) {
		System.out.println("tx done with DebitCard");
	}

}
