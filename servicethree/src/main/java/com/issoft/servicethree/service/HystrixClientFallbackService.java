package com.issoft.servicethree.service;

import com.issoft.servicethree.dto.Notification;
import com.issoft.servicethree.proxy.NotificationProxy;
import org.springframework.stereotype.Service;

@Service
public class HystrixClientFallbackService implements NotificationProxy {

	@Override
	public Notification getNotification(){
		return new Notification("Service Three Fallback", "Service Three Error");
	}
}