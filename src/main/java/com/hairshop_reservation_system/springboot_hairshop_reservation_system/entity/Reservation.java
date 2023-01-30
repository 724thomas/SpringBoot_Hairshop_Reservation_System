package com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reservation")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "reservationid")
    private String reservationid;
    @Column(name = "name")
    private String name;
    @Column(name = "contact")
    private String contact;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
    @Column(name = "duration")
    private int duration;
    @Column(name = "memo")
    private String memo;

}
