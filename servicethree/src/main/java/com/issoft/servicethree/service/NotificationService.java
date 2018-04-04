package com.issoft.servicethree.service;

import com.issoft.servicethree.dto.Notification;
import com.issoft.servicethree.proxy.NotificationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	@Autowired
	private NotificationProxy notificationClient;

	public Notification getNotification() {
		return notificationClient.getNotification();
	}
}