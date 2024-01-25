package com.software.hotelReservation.dto.requestDto;

import lombok.Data;

@Data
public class ReservationUpdateRequestDto {
	private Long reservationId;
    private String status;
}
