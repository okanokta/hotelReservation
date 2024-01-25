package com.software.hotelReservation.dto.requestDto;

import lombok.Data;

@Data
public class RoomUpdateRequestDto {
	private Long roomId;
	private int price;
}
