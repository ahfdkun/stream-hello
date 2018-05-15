package com.ahfdkun.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(ChannelType.class)
public class MessageSender {

	@Autowired
	private ChannelType message;

	public void send(String body) {
		message.output().send(MessageBuilder.withPayload(body).build());
	}
	
}
