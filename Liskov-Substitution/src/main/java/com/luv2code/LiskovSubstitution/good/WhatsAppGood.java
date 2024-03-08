package com.luv2code.LiskovSubstitution.good;

public class WhatsAppGood implements SocialMediaGood {

	@Override
	public void chatWithFriend() {
		System.out.println("Chat With Friend On WhatsApp!");
	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("Send Photos And Videos On WhatsApp!");
	}

	@Override
	public void groupVideoCall(String users) {
		System.out.println("Group Video Call On WhatsApp!");
	}

}
