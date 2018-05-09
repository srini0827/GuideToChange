package com.sample.springboot.service;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

@Component
public class KafkaService {

	public void send(String message) {
		// create instance for properties to access producer configs   
		Properties props = new Properties();
	      
	      //Assign localhost id. by default 9092 is present in producer.properties in kafka installation folder hence the port #.
	      props.put("bootstrap.servers", "localhost:9092");
	      
	      //Set acknowledgements for producer requests.      
	      props.put("acks", "all");
	      
	      //If the request fails, the producer can automatically retry,
	      props.put("retries", 0);
	      
	      //Specify buffer size in config
	      props.put("batch.size", 16384);
	      
	      //Reduce the no of requests less than 0   
	      props.put("linger.ms", 1);
	      
	      //The buffer.memory controls the total amount of memory available to the producer for buffering.   
	      props.put("buffer.memory", 33554432);
	      
	      props.put("key.serializer", 
	         "org.apache.kafka.common.serialization.StringSerializer");
	         
	      props.put("value.serializer", 
	         "org.apache.kafka.common.serialization.StringSerializer");
	      
	      Producer<String, String> producer = new KafkaProducer
	         <String, String>(props);
	            
         producer.send(new ProducerRecord<String, String>("8MayTopic", 
	            Integer.toString(message.length()), message));
	               System.out.println("Message sent successfully");
	               producer.close();
		
	}

	public String read(String topicName) {
		
		 //Kafka consumer configuration settings
	      Properties props = new Properties();
	      
	      props.put("bootstrap.servers", "localhost:9092");
	      props.put("group.id", "test");
	      props.put("enable.auto.commit", "true");
	      props.put("auto.commit.interval.ms", "1000");
	      props.put("session.timeout.ms", "30000");
	      props.put("key.deserializer", 
	         "org.apache.kafka.common.serialization.StringDeserializer");
	      props.put("value.deserializer", 
	         "org.apache.kafka.common.serialization.StringDeserializer");
	      KafkaConsumer<String, String> consumer = new KafkaConsumer
	         <String, String>(props);
	      
	      //Kafka Consumer subscribes list of topics here.
	      consumer.subscribe(Arrays.asList(topicName));
	      
	      //print the topic name
	      System.out.println("Subscribed to topic " + topicName);
	      StringBuffer sb= new StringBuffer();
	      while(true){
	    	  
	    
		      ConsumerRecords<String, String> records = consumer.poll(5);
		      for (ConsumerRecord<String, String> record : records){
		         
		        	 sb.append(record.toString());
		        	 
		        	 System.out.println(sb.toString());
		         // print the offset,key and value for the consumer records.
		         System.out.printf("offset = %d, key = %s, value = %s\n", 
		            record.offset(), record.key(), record.value());
		         }
			}
	      
	}

}
