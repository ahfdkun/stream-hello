package com.ahfdkun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahfdkun.msg.MessageSender;

@RestController
public class SendSourceController {

	@Autowired@Qualifier("messageSender")
	private MessageSender messageSender;
	
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public void send(@RequestBody String body) {
		messageSender.send("messageSender: " + body);
	}

}
