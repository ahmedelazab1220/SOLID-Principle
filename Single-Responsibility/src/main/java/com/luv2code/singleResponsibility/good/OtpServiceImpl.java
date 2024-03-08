package com.luv2code.singleResponsibility.good;

public class OtpServiceImpl implements OtpService {

	 public void sendOTP(String medium) {  
		 if(medium.equals("email")) {
	          System.out.println("OTPType.equals ===> email");
	          //write email related logic
	          //use JavaMailSenderAPI
	     }
	     if(medium.equals("WhatsApp")) {
	          System.out.println("OTPType.equals ===> WhatsApp");
	          //write WhatsApp related logic
	          //use JavaWhatsAppSenderAPI        	
	     }
	 }
}
