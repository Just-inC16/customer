package com.tcs.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.customer.Dto.Reservation;

@Component
@FeignClient(name = "reservation", url = "localhost:8081")
public interface ReservationClient {
	@PostMapping("/api/v1/reservations/reserveHotel")
	String reserveHotel(@RequestBody Reservation reservation);
}
