package com.issoft.servicetwo.service;

import com.issoft.servicetwo.dto.Notification;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	@HystrixCommand(fallbackMethod = "fallBack")
	public Notification getNotification() throws InterruptedException {
		return new Notification("Service Two", "This is Service Two notification");
	}

	private Notification fallBack(){
		return new Notification("Service Two Fallback", "Service Two Error");
	}
}