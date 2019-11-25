package com.sample.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.service.KafkaService;

@RestController
@RequestMapping(path="/kafka/producer")
public class KafkaController {

	@Autowired
	KafkaService kafkaService;
	
	@RequestMapping(path="/sendMessage")
	public void sendMessage(@RequestBody String message){
		System.out.println(String.format("Message sent by user: %s", message));
		kafkaService.send(message);
	}
	
	@RequestMapping(path="/retrieveMessages")
	public String retrieveMessages(@RequestBody String topicName){
		System.out.println(String.format("Topic from which messages needs to be retrieved: %s", topicName));
		return kafkaService.read(topicName);
		
	}
}
