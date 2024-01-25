package com.software.hotelReservation.dto.requestDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomSaveRequestDto {
	
	private int roomNumber;
	private String roomType;
	private int price;
	private Long hotelId;
	private Long reservationId;

}
