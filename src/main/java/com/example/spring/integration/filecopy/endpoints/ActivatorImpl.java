package com.example.spring.integration.filecopy.endpoints;

import java.io.File;
import java.util.logging.Logger;

import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class ActivatorImpl implements Activator<Message<File>>  {

	@Override
	public void handleMessage(Message<File> input) {
		File filePayload = input.getPayload();
		IntegrationMessageHeaderAccessor accessor = new IntegrationMessageHeaderAccessor(input);
		Logger.getAnonymousLogger().info("The file size "+filePayload.length());
		Logger.getAnonymousLogger().info("The time of the message "+accessor.getTimestamp());
		
	}

}
