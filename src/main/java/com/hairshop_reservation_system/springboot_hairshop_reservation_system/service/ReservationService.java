package com.hairshop_reservation_system.springboot_hairshop_reservation_system.service;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.ReservationRequest;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.ReservationResponse;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.UserRequest;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.Reservation;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public interface ReservationService {

    ArrayList<ReservationResponse> selectAllReservation();

    String insertReservation(ReservationRequest reservationRequest);

    ReservationResponse selectReservationById(String reservationId);

    String updateReservation(ReservationRequest reservationRequest);

    String deleteReservationById(String reservationId);


}
