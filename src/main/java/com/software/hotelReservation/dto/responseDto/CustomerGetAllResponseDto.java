package com.software.hotelReservation.dto.responseDto;

import lombok.Data;

@Data
public class CustomerGetAllResponseDto {
	private Long customerId;
	
	private String name;

	private String lastName;

	private String email;

	private String phone;
}
