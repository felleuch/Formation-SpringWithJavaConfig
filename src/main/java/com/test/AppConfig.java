package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
 
	
	@Autowired
	private Environment env;
	
	
    @Bean
    public DemoManager demoService() 
    {
    	DemoManager bean = new DemoManager();
    	
    	String name = env.getProperty("app.name");
    	
    	
    	bean.setServiceName(name);
    	return  bean;
        
    }
}
