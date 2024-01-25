package com.software.hotelReservation.dto.responseDto;

import lombok.Data;

@Data
public class RoomGetAllResponseDto {
	
	private Long roomId;
	private String roomNumber;
	private String roomType;
	private String price;
	private Long hotelId;
	private Long reservationId;
}
