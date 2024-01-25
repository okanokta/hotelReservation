package com.software.hotelReservation.dto.requestDto;

import java.time.LocalDate;

import lombok.Data;
@Data
public class ReservationSaveRequestDto {
	private String status;
	private LocalDate startDate;
	private LocalDate endDate;
	private Long customerId;
	private Long hotelId;
}
