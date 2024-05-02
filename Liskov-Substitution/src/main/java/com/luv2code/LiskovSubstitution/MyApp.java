package com.luv2code.LiskovSubstitution;

import com.luv2code.LiskovSubstitution.bad.*;
import com.luv2code.LiskovSubstitution.good.*;

public class MyApp {

	public static void main(String[] args) {

		// Let's try test-bad example

		System.out.println("Bad Example\n");

		SocialMediaBad facebookBad = new FacebookBad();
		SocialMediaBad whatsAppBad = new WhatsAppBad();

		facebookBad.publishPost(facebookBad);

		// whatsApp not use this function then not work
		whatsAppBad.publishPost(whatsAppBad);

		// let's try test-good example

		System.out.println("\nGood Example\n");

		SocialMediaGood facebookGood = new FacebookGood();

		facebookGood.chatWithFriend();

		// when make this line give error because this function from another interface
		// facebookGood.publishPost(facebookGood);

		SocialPostAndMediaManager facebookPublishPost = new FacebookGood();
		facebookPublishPost.publishPost(facebookPublishPost);

		SocialMediaGood whatsAppGood = new WhatsAppGood();

		whatsAppGood.chatWithFriend();

		// when make this line give error because this function not found in class
		// whatsApp.
		// whatsAppGood.publishPost(whatsAppGood);

	}

}
