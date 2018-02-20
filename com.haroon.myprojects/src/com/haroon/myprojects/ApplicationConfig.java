package com.haroon.myprojects;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.haroon.myprojects.rest.Customer;
import com.haroon.myprojects.rest.CustomerRest;
import com.haroon.myprojects.rest.Order;
import com.haroon.myprojects.rest.OrderRest;
import com.haroon.myprojects.rest.Product;
import com.haroon.myprojects.rest.ProductRest;

@Configuration
public class ApplicationConfig {
	
	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig(){
				//this.register(ProductRest.class);
				//this.register(CustomerRest.class);
				this.register(OrderRest.class);
			//this.packages("com.haroon.myprojects.rest");
		}
	}
	
	@Bean
	public RestTemplate restTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

}
