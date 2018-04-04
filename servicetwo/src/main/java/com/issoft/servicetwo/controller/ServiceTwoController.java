package com.issoft.servicetwo.controller;

import com.issoft.servicetwo.dto.Notification;
import com.issoft.servicetwo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/notifications")
public class ServiceTwoController {

	@Autowired
	private NotificationService notificationService;

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/getServiceNotification")
	public Notification getNotification() throws InterruptedException {
		return notificationService.getNotification();
	}


	@GET
	@Path("/health")
	@Produces(MediaType.APPLICATION_JSON)
	public String health() {
		return "Service Two: Up and Running!";
	}
}