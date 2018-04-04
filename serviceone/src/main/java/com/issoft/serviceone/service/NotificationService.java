package com.issoft.serviceone.service;

import com.issoft.serviceone.dto.Notification;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	@HystrixCommand(fallbackMethod = "fallBack")
	public Notification getNotification() throws InterruptedException {
		return new Notification("Service One", "This is Service One notification");
	}

	private Notification fallBack(){
		return new Notification("Service One Fallback", "Service One Error");
	}
}