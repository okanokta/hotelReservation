package com.software.hotelReservation.dto.requestDto;

import lombok.Data;

@Data
public class CustomerUpdateRequestDto {
	private Long customerId;
	private String email;
}
