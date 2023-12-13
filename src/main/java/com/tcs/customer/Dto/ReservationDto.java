package com.tcs.customer.Dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReservationDto {
	private Long id;
	private Long customerId;
	private Long hotelId;
	private LocalDate startDate;
	private LocalDate endDate;
}
