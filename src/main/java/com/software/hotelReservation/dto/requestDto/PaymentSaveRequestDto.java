package com.software.hotelReservation.dto.requestDto;

import lombok.Data;

@Data
public class PaymentSaveRequestDto {
	
	private String paymentDate;
	private int amount;
	private Long customerId;
	private Long reservationId;

}
