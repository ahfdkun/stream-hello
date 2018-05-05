package com.ahfdkun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahfdkun.msg.SendService;

@RestController
public class SendSourceController {

	@Autowired
	private SendService service;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public void send(@RequestBody String body) {
		service.sendMessage(body);
	}
	
}
