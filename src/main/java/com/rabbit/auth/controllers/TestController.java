package com.rabbit.auth.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.auth.services.ProducerService;

@RestController
public class TestController {
	
	private ProducerService producerService;
	
	@Autowired
	public TestController(ProducerService producerService) {
		this.producerService = producerService;
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public Map<String,Object> test(){
		Map<String,Object> response = new HashMap<>();
		response.put("STATUS", "SUCCESS");
		producerService.testProducer();
		return response;
	}
}
