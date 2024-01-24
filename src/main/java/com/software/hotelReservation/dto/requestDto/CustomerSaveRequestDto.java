package com.software.hotelReservation.dto.requestDto;

import lombok.Data;

@Data
public class CustomerSaveRequestDto {

	private String name;

	private String lastName;

	private String email;

	private String phone;

}
