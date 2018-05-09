package com.sample.springboot.dbconfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBConfiguration {

	@Bean("orcheJDBCTemplate")
	public JdbcTemplate getOrcheDBTemplate(@Qualifier("orcheDBDataSource")DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	@Value("${jdbcUrl}")
	String jdbcURL;
	
	@Bean("orcheDBDataSource")
	public DataSource getOrcheDBDataSource(){
		System.out.println("JDBC URL *************** "+jdbcURL);
		HikariConfig config = new HikariConfig("resources/DBProperties.properties");
		return new HikariDataSource(config);
	}
	
	

	
	
}
