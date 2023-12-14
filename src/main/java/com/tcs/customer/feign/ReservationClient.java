package com.tcs.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.customer.Dto.Reservation;
import com.tcs.customer.config.ReservationConfig;

@Component
@FeignClient(name = "reservation", url = "localhost:8081", configuration = ReservationConfig.class)
public interface ReservationClient {
	@PostMapping("/reserveHotel")
	String reserveHotel(@RequestBody Reservation reservation);
}
