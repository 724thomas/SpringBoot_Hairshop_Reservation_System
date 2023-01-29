package com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.impl;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.ReservationRequest;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.ReservationResponse;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.Reservation;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.repository.ReservationRepository;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public ArrayList<ReservationResponse> selectAllReservation() {
        return reservationRepository.findAllReservation()
                .stream()
                .map(ReservationResponse::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public String insertReservation(ReservationRequest reservationRequest) {
        try{
            reservationRepository.save(reservationRequest.toEntity());
        }catch (Exception e){
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String updateReservation(ReservationRequest reservationRequest) {
        try{
            reservationRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String deleteReservationById(String reservationId) {
        try{
            reservationRepository.deleteReservationById(Long.parseLong(reservationId));
        }catch (Exception e){
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}
