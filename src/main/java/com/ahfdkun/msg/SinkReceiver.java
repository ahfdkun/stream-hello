package com.ahfdkun.msg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(ChannelType.class)
public class SinkReceiver {

	private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

	@StreamListener(ChannelType.INPUT)
	public void receive(Object payload) {
		logger.info("Received: " + payload);
	}

}
