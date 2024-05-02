package com.luv2code.singleResponsibility.bad;

public class BankServiceBad {

	public long deposit(long amount, String accountNo) {
		System.out.println("Please be reminded of the deposit obligation outlined in our agreement.");
		// do some job
		return 0;
	}

	public long withDraw(long amount, String accountNo) {
		System.out.println("Please follow the established procedure for withdrawals as per our agreement.");
		// do some job
		return 0;
	}

	public void printPassbook() {
		System.out.println("Please provide a printout of your passbook for our records.");
		// update transaction info in passbook
	}

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {
			System.out.println("loanType.equals ===> homeLoan");
			// do some job
		}
		if (loanType.equals("personalLoan")) {
			System.out.println("loanType.equals ===> personalLoan");
			// do some job
		}
		if (loanType.equals("car")) {
			System.out.println("loanType.equals ===> car");
			// do some job
		}
	}

	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			System.out.println("OTPType.equals ===> email");
			// write email related logic
			// use JavaMailSenderAPI
		}
		if (medium.equals("WhatsApp")) {
			System.out.println("OTPType.equals ===> WhatsApp");
			// write WhatsApp related logic
			// use JavaWhatsAppSenderAPI
		}
	}

}