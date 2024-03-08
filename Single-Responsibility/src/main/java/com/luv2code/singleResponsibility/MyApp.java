package com.luv2code.singleResponsibility;

import com.luv2code.singleResponsibility.bad.BankServiceBad;
import com.luv2code.singleResponsibility.good.DepositService;
import com.luv2code.singleResponsibility.good.DepositServiceImpl;
import com.luv2code.singleResponsibility.good.WithDrawService;
import com.luv2code.singleResponsibility.good.WithDrawServiceImpl;

public class MyApp {

	public static void main(String[] args) {
		
		// Let's try test-bad example
        
		System.out.println("Bad Example\n");
		
		BankServiceBad bankServiceBad = new BankServiceBad();
        String account = new String("John.Doe@example.com");
        
        bankServiceBad.deposit(1000 , account);
        
        bankServiceBad.sendOTP("email");
        
        System.out.println("\nGood Example\n");
        
        // let's try test-good example
        DepositService depositService = new DepositServiceImpl();
        depositService.deposit(1000, account);
        
        WithDrawService withDrawService = new WithDrawServiceImpl();
        withDrawService.withDraw(500, account);
        
	}

}
