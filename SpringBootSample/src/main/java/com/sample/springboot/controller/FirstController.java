package com.sample.springboot.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sample.springboot.dao.ServiceItemDAO;

@RestController
@RequestMapping(path="/SST")
@Transactional
public class FirstController {

	@Value("${management.endpoints.web.exposure.include}")
	String managementProperty;

	@Value("${test.property}")
	String testProperty;

	@Value("${test.property2:defaultProperty2}")
	String testProperty2;
	
	@Autowired
	ServiceItemDAO serviceItemDAO;
	
	
	
	 @RequestMapping(path="/firstAPI",produces="application/json")
	public JsonNode firstAPI(@RequestParam(name="requesterName", required=true) String requesterName) throws IOException{
		 ObjectNode jNode =(new ObjectMapper()).createObjectNode();
		 jNode.put("RequesterName(s)", String.format("First API invoked by %s",requesterName));
		 jNode.put("testProperty", testProperty);
		 jNode.put("testProperty2", testProperty2);
		 jNode.put("managementProperty", managementProperty);
		return jNode;
	}
	
	 @RequestMapping(path="/serviceDefinition",produces="application/json", method=RequestMethod.GET)
	public JsonNode getServiceDefinition(@RequestBody String serviceItemName) throws IOException, SQLException{
		return serviceItemDAO.getServiceDefinition(serviceItemName);
	}

	 @RequestMapping(path="/getServiceMappings",produces="application/json")
	public JsonNode getServiceMappings() throws Exception{
		return serviceItemDAO.getServiceMappings();
	}
	
	 @RequestMapping(path="/saveToTempTable")
		public void saveToTempTable() throws Exception{
		 	serviceItemDAO.saveToTempTable1();
			serviceItemDAO.saveToTempTable();
		}
		
		 
	 
	 
}

