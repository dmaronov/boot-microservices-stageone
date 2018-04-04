package com.issoft.servicetwo.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		//Allow CORS
		register(CORSJerseyResponseFilter.class);
		this.packages("com/issoft/servicetwo/controller");
	}

}