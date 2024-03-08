package com.luv2code.singleResponsibility.good;

public class LoanInterestInfoServiceImpl implements LoanInterestInfoService {

	public void getLoanInterestInfo(String loanType) {
		 if(loanType.equals("homeLoan")) {
	       	System.out.println("loanType.equals ===> homeLoan");    
	       	//do some job
	     }
	     if(loanType.equals("personalLoan")) {
	         System.out.println("loanType.equals ===> personalLoan");
	         //do some job
	     }
	     if(loanType.equals("car")) {
	         System.out.println("loanType.equals ===> car");
	         //do some job
	     }
    }
}
