package com.luv2code.InterfaceSegregation.bad;

public class GooglePayBad implements UpiPaymentsBad {

	@Override
	public void payMoney() {
		System.out.println("Pay Money By Google!");
		// do logic code
	}

	@Override
	public void getScratchCard() {
		System.out.println("get Scratch Card By Google!");
		// do logic code
	}

	@Override
	public void getCashBackAsCreditBalance() {
		System.out.println("get CashBack As CreditBalance By Google!");
		// do logic code
	}

}
