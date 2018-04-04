package com.issoft.servicethree.proxy;

import com.issoft.servicethree.dto.Notification;
import com.issoft.servicethree.service.HystrixClientFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service", fallback = HystrixClientFallbackService.class)
public interface NotificationProxy {

	@RequestMapping(value = "/notifications/getServiceNotification", method = RequestMethod.GET)
	Notification getNotification();
}