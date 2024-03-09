package com.luv2code.InterfaceSegregation;

import com.luv2code.InterfaceSegregation.bad.GooglePayBad;
import com.luv2code.InterfaceSegregation.bad.PaytmBad;
import com.luv2code.InterfaceSegregation.bad.UpiPaymentsBad;
import com.luv2code.InterfaceSegregation.good.GooglePayGood;
import com.luv2code.InterfaceSegregation.good.PaytmGood;
import com.luv2code.InterfaceSegregation.good.UpiPaymentsGood;

public class MyApp {

	public static void main(String[] args) {

		// Let's try test-bad example

		System.out.println("Bad Example\n");
		
		UpiPaymentsBad paymentGoogleBad = new GooglePayBad();
		
		paymentGoogleBad.getCashBackAsCreditBalance();
		
        UpiPaymentsBad paymentPaytmBad = new PaytmBad();
		
        paymentPaytmBad.getCashBackAsCreditBalance();
		
        // let's try test-good example
        
		System.out.println("\nGood Example\n");
		
		UpiPaymentsGood paymentGoogleGood = new GooglePayGood();
		
		paymentGoogleGood.getScratchCard();
		
		UpiPaymentsGood paymentPaytmGood = new PaytmGood();
		
		paymentPaytmGood.getScratchCard();
		
	}

}
