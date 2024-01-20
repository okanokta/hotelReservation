package com.software.hotelReservation.dto.response;

import lombok.Data;

@Data
public class HotelGetAllResponseDto {
	private Long id;
	private String hotelName;
	private String address;
}
