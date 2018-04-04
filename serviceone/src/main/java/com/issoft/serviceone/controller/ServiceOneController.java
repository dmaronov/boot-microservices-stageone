package com.issoft.serviceone.controller;

import com.issoft.serviceone.dto.Notification;
import com.issoft.serviceone.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/notifications")
public class ServiceOneController {

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
		return "Service One: Up and Running!";
	}

}