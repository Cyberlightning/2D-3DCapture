package com.cyberlightning.webserver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ProfileService implements MessageReceiver{

	private static final ProfileService _profileService = new ProfileService();

	private ProfileService() {
		MessageHandler.getInstance().registerReceiver(this);
		
	}
	
	public static ProfileService getInstance() {
		return _profileService;
	}
	
	@Override
	public void messageReceived(String _msg) {
		
		if (_msg.equals("Next")) {
			//TODO
		}
		
		if (_msg.equals("Previous")) {
			//TODO
		}
		
		
		//MessageHandler.getInstance().sendMessage(_msg);
	}
	
	
	
	
}
