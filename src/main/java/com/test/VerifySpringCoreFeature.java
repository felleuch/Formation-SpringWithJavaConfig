package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 


 
public class VerifySpringCoreFeature
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
        DemoManager  obj = (DemoManager) context.getBean("demoService");
 
        System.out.println( obj.getServiceName() );
        
     
		Client client = (Client) context.getBean("clientBean");
		
		System.out.println("Eligibility du client :"+client.getElegibility());
		
		System.out.println("Liste des commandes du client :"+client.getName());
		
		for(String elem:client.getOrders()) {
			System.out.println(elem);
		}
		System.out.println("Liste des factures du client :"+client.getName());
		
		for(String elem:client.getInvoces()) {
			System.out.println(elem);
		}
		
		
        
        
    }
}
