package com.luv2code.openClosed;

import com.luv2code.openClosed.bad.BadOtpService;
import com.luv2code.openClosed.bad.OtpServiceIBadImpl;
import com.luv2code.openClosed.good.EmailOtpServiceGoodImpl;
import com.luv2code.openClosed.good.GoodOtpService;
import com.luv2code.openClosed.good.WhatsAppOtpServiceGoodImpl;

public class MyApp {

	public static void main(String[] args) {

		// Let's try test-bad example

		System.out.println("Bad Example\n");

		BadOtpService badOtpService = new OtpServiceIBadImpl();
		
		badOtpService.sendOTP("email");
		badOtpService.sendOTP("WhatsApp");

		System.out.println("\nGood Example\n");

		// let's try test-good example
		
		GoodOtpService goodOtpServiceByEmail = new EmailOtpServiceGoodImpl();
		
		goodOtpServiceByEmail.sendOTP();

		GoodOtpService goodOtpServiceByWhatsApp = new WhatsAppOtpServiceGoodImpl();
		
		goodOtpServiceByWhatsApp.sendOTP();
	}

}
