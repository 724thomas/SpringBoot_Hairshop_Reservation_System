package com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.Reservation;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReservationRequest {

    private String reservationid;
    private String name;
    private String contact;
    private String date;
    private String time;
    private String duration;
    private String memo;

    public Reservation toEntity(){
        return Reservation.builder()
                .reservationid(this.reservationid)
                .name(this.name)
                .contact(this.contact)
                .date(this.date)
                .time(this.time)
                .duration(Integer.parseInt(this.duration))
                .memo(this.memo)
                .build();
    }
}
