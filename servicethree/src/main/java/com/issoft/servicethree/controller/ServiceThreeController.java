package com.issoft.servicethree.controller;

import com.issoft.servicethree.dto.Notification;
import com.issoft.servicethree.proxy.NotificationProxy;
import com.issoft.servicethree.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/notifications")
public class ServiceThreeController {

	@Autowired
	private NotificationService notificationService;

	@Autowired
	private DiscoveryClient discoveryClient;


	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/getServiceNotification")
	public Notification feign() {
		return notificationService.getNotification();
	}

	@GET
	@Path("/health")
	@Produces(MediaType.APPLICATION_JSON)
	public String health() {
		return "Service Three: Up and Running!";
	}
}