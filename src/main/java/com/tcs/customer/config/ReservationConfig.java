package com.tcs.customer.config;

import org.springframework.context.annotation.Bean;

import feign.Logger;

public class ReservationConfig {
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.BASIC;
	}

//	@Bean
//	public ErrorDecoder errorDecoder() {
//		return new CustomErrorDecoder();
//	}
}
