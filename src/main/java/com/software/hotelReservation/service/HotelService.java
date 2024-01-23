package com.software.hotelReservation.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.software.hotelReservation.dto.requestDto.HotelSaveRequestDto;
import com.software.hotelReservation.dto.responseDto.HotelGetAllResponseDto;
import com.software.hotelReservation.model.Hotel;
import com.software.hotelReservation.repository.HotelRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class HotelService {
	private final HotelRepository hotelRepository;
	private final ModelMapper modelMapper;
	
	public List<HotelGetAllResponseDto> getAll(){
		 List<Hotel> allHotel = hotelRepository.findAll();
	       return allHotel.stream()
	                .map(hotel -> modelMapper.map(hotel, HotelGetAllResponseDto.class))
	                .toList();
	}

	public boolean saveHotel(HotelSaveRequestDto hotelSaveRequestDto) {
		Hotel hotel = modelMapper.map(hotelSaveRequestDto, Hotel.class);
		hotelRepository.save(hotel);
        return true;
		
	}
	
}
