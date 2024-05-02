package com.luv2code.InterfaceSegregation.good;

public class PaytmGood implements UpiPaymentsGood {

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

}
