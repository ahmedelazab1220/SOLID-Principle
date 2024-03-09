package com.luv2code.InterfaceSegregation.bad;

public class PaytmBad implements UpiPaymentsBad {

	@Override
	public void payMoney() {
		System.out.println("Pay Money By Paytm!");
		// do logic code 
	}

	@Override
	public void getScratchCard() {
		System.out.println("get Scratch Card By Paytm!");
		// do logic code

	}

	@Override
	public void getCashBackAsCreditBalance() {
		System.out.println("CashBack As CreditBalance doesn't support By Paytm!");
		// TODO Auto-generated method stub

	}

}
