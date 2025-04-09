package com.pavan.service;

import java.time.LocalDateTime;

public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMsg() {
		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good Morning ";
		else if (hour < 16)
			return "Good Afternoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

}
