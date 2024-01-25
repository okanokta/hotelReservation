package com.software.hotelReservation.service;

import java.time.LocalDate;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.software.hotelReservation.dto.requestDto.ReservationSaveRequestDto;
import com.software.hotelReservation.dto.requestDto.ReservationUpdateRequestDto;
import com.software.hotelReservation.dto.responseDto.ReservationGetAllResponseDto;
import com.software.hotelReservation.model.Reservation;
import com.software.hotelReservation.repository.ReservationRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ReservationService {
	
	private final ReservationRepository reservationRepository;
    private final ModelMapper modelMapper;
    
    public List<ReservationGetAllResponseDto> getAll() {
		List<Reservation> allReservation = reservationRepository.findAll();
	       return allReservation.stream()
	                .map(reservation -> modelMapper.map(reservation, ReservationGetAllResponseDto.class))
	                .toList();
	}

    public Boolean saveReservation(ReservationSaveRequestDto reservationRequestDto) {
        modelMapper.getConfiguration()
        .setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.LOOSE);
        
        if (!isReservationPossible(reservationRequestDto)) {
            throw new IllegalArgumentException("Girilen tarih aralığında rezervasyon yapılamaz.");
        }

        Reservation reservation = modelMapper.map(reservationRequestDto, Reservation.class);
        reservationRepository.save(reservation);
        return true;
    }
    private boolean isReservationPossible(ReservationSaveRequestDto reservationRequestDto) {
        LocalDate startDate = reservationRequestDto.getStartDate();
        LocalDate endDate = reservationRequestDto.getEndDate();
        Long hotelId = reservationRequestDto.getHotelId();

        List<Reservation> existingReservations = reservationRepository.findByHotelIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
            hotelId, endDate, startDate
        );

        return existingReservations.isEmpty();
    }
    public Boolean updateReservation(ReservationUpdateRequestDto reservationUpdateRequestDto) {
        modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE);

        Long reservationId = reservationUpdateRequestDto.getReservationId();
        Reservation existingReservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new IllegalArgumentException("Reservation not found for id: " + reservationId));

        // Update the fields you want to change
        existingReservation.setStatus(reservationUpdateRequestDto.getStatus());
        // Add other updates if needed

        reservationRepository.save(existingReservation);
        return true;
    }
	public Boolean deleteReservation(Long id) {
		this.reservationRepository.deleteById(id);
		return true;
	}
	

}
