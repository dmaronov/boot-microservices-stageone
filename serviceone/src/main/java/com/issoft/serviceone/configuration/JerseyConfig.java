package com.issoft.serviceone.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		//Allow CORS
		register(CORSJerseyResponseFilter.class);
		this.packages("com/issoft/serviceone/controller");
	}

}