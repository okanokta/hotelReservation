package com.software.hotelReservation.dto.responseDto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReservationGetAllResponseDto {
	
	private Long reservationId;
	private LocalDate startDate;
	private LocalDate endDate;
	private String status;
	private Long customerId;
	private Long hotelId;
	
}
