package com.luv2code.LiskovSubstitution.bad;

public class FacebookBad extends SocialMediaBad {

	@Override
	public void chatWithFriend() {
		System.out.println("Chat With Friend On Facebook!");
	}

	@Override
	public void publishPost(Object post) {
		System.out.println("Publist Post On Facebook!");
	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("Send Photos And Videos On Facebook!");
	}

	@Override
	public void groupVideoCall(String users) {
		System.out.println("Group Video Call On Facebook!");
	}

}
