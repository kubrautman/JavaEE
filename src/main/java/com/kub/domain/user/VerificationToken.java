package com.kub.domain.user;

import java.util.Calendar;
import java.util.Date;

public class VerificationToken {

	private final int EXPIRY_DATE=60*24;
	
	private Long id;
	
	private User user;
	
	private String token;
	
	private Date expiryDate;
	
	public VerificationToken() {
		this.expiryDate=calculateExpiryDate(EXPIRY_DATE);
		}

	private Date calculateExpiryDate(int EXPIRY_DATE) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTimeInMillis(new Date().getTime());
		calendar.add(Calendar.DATE, EXPIRY_DATE);
		
		return calendar;
		
	}
	
	
}
