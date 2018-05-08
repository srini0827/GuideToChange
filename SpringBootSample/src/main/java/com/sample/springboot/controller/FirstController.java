package com.sample.springboot.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping(path="/SST")
public class FirstController {

	@Value("${management.endpoints.web.exposure.include}")
	String managementProperty;

	@Value("${test.property}")
	String testProperty;

	 @RequestMapping(path="/firstAPI",produces="application/json")
	 @ResponseBody	
	public JsonNode firstAPI(@RequestParam(name="requesterName", required=true) String requesterName, @RequestParam(name="env", required=true) String env) throws IOException{
		 ObjectNode jNode =(new ObjectMapper()).createObjectNode();
		 jNode.put("RequesterName(s)", String.format("First API invoked by %s",requesterName));
		 jNode.put("testProperty", testProperty);
		 jNode.put("managementProperty", managementProperty);
		return jNode;
	}
	
}
