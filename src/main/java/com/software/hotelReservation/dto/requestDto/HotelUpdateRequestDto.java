package com.software.hotelReservation.dto.requestDto;

import lombok.Data;

@Data
public class HotelUpdateRequestDto {
	private Long id;
	private String hotelName;
	private String address;

}
