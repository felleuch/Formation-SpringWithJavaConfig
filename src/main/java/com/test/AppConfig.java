package com.test;

import java.util.ArrayList;
import java.util.List;

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
    
    @Bean
    public Client clientBean() 
    {
    	Client client = new Client();
    	client.setName("toto");
    	String eligibility = env.getProperty("client.elegibility");
    	
    	List<String>  invoices = new ArrayList<String>();
    			invoices.add("inv01");
    	invoices.add("inv02");
    	invoices.add("inv03");
    	
    	
    	List<String>  orders = new ArrayList<String>();
    	orders.add("order01");
    	orders.add("order02");
    	orders.add("order03");
    	
    	client.setOrders(orders);
    	client.setInvoces(invoices);
    	client.setElegibility(eligibility);
    	
    	return  client;
        
    }
    
}
