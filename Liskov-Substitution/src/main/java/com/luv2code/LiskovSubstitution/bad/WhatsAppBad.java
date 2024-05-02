package com.luv2code.LiskovSubstitution.bad;

public class WhatsAppBad extends SocialMediaBad {

	@Override
	public void chatWithFriend() {
		System.out.println("Chat With Friend On WhatsApp!");
	}

	@Override
	public void publishPost(Object post) {
		// I'm Not Use This Feature In WhatsApp
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
