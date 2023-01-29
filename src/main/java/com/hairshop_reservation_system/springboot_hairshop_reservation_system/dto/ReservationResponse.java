package com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.Reservation;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReservationResponse {

    private String reservationid;
    private String name;
    private String contact;
    private String date;
    private String time;
    private String duration;
    private String memo;

    public ReservationResponse(Reservation reservation) {
        this.reservationid = reservation.getReservationid();
        this.name = reservation.getName();
        this.contact = reservation.getContact();
        this.date = reservation.getDate();
        this.time = reservation.getTime();
        this.duration = String.valueOf(reservation.getDuration());
        this.memo = reservation.getMemo();
    }

}
