package com.sample.springboot.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.zaxxer.hikari.HikariDataSource;

@Component
public class ServiceItemDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	ObjectReader objectReader = (new ObjectMapper()).reader();

	public JsonNode getServiceDefinition(String serviceItemName) throws SQLException {
		
		Object[] obj= new Object[1];
		obj[0] = serviceItemName;
		
		return jdbcTemplate.queryForObject("select service_attribute from sfl_service_items where service_item_name=?", 
					new RowMapper<JsonNode>() {

						@Override
						public JsonNode mapRow(ResultSet arg0, int arg1) throws SQLException {
							try {   
							Reader reader = (arg0.getClob("SERVICE_ATTRIBUTE")).getCharacterStream();
						        BufferedReader br = new BufferedReader(reader);

						        String line;
						        StringBuffer sb = new StringBuffer();
						        while(null != (line = br.readLine())) {
						            sb.append(line);
						        }
						        br.close();
								
									return objectReader.forType(JsonNode.class).readValue(sb.toString());
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							return null;
						}
					}
					, obj);
		 
		
	}
	@Autowired
	@Qualifier("orcheDBDataSource")
	DataSource ds;
	
	public JsonNode getServiceMappings() throws Exception {

		System.out.println("\n arg0.getFetchSize() BEFORE *******: "+jdbcTemplate.getFetchSize());
		long startTime = System.currentTimeMillis();
		
		System.out.println(((HikariDataSource)ds).getMaximumPoolSize());
		
		System.out.println(((HikariDataSource)ds).getMaxLifetime());
		
		jdbcTemplate.setFetchSize(11000);
		System.out.println();
		
		
		List<String> list = jdbcTemplate.queryForList("select from_item_name from sfl_service_mapping", String.class);
		 System.out.println(list.toString());
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("\n TOTAL TIME:"+(endTime-startTime));
		
		return null;
		//return null;
	}

	
	public void saveToTempTable() {
		saveToTempTable1();
		jdbcTemplate.execute("insert into temp_table values('SSSSSSS','SSSSS')");
		jdbcTemplate.execute("update temp_table set step='111111' where step='SSSSSS'");
		jdbcTemplate.execute("insert into temp_table values('RRRRRSS','RRRRR')");
		jdbcTemplate.execute("insert into temp_table values('TTTTTTTTTT',2222,asfsdaf)");
		
	}
	
	public void saveToTempTable1() {
		jdbcTemplate.execute("insert into temp_table values('222222','SSSSS')");
		jdbcTemplate.execute("update temp_table set step='3333333' where step='SSSSSS'");
		jdbcTemplate.execute("insert into temp_table values('444444444','RRRRR')");
		
	}
	
}
