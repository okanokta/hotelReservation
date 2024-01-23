package com.software.hotelReservation.dto.responseDto;

import lombok.Data;

@Data
public class HotelGetAllResponseDto {
	private Long id;
	private String hotelName;
	private String address;
}
