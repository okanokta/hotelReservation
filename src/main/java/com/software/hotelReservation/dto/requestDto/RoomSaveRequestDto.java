package com.software.hotelReservation.dto.requestDto;

import lombok.Data;

@Data
public class RoomSaveRequestDto {
	private String roomNumber;
	private String roomType;
	private double price;
	private Long hotelId;

}
