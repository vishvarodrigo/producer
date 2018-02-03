package com.rabbit.auth.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.producerservice.RabbitmqProducerServiceApplication;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Exchange;

@Service
public class ProducerService {
	
	private Logger logger = LoggerFactory.getLogger(RabbitmqProducerServiceApplication.class);
	
	private final RabbitTemplate rabbitTemplate;
	

	  public ProducerService(RabbitTemplate rabbitTemplate) {
		    this.rabbitTemplate = rabbitTemplate;
		    
	  }	  
	  
	  public void testProducer() {		 
		  	Map<String,Object> message = new HashMap<>();
		  	message.put("STATUS", "success");
		  	message.put("DATA", "Transaction Completed");
	        rabbitTemplate.convertAndSend(RabbitmqProducerServiceApplication.EXCHANGE_NAME, RabbitmqProducerServiceApplication.ROUTING_KEY, message);
	        logger.info("MESSAGE DISPATCHED {}",message);
	  }
}
