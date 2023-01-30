package com.hairshop_reservation_system.springboot_hairshop_reservation_system.repository;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {

    ArrayList<Reservation> findAll();

    @Query(value = "SELECT * FROM Reservation r ORDER BY r.date, r.time", nativeQuery = true)
    ArrayList<Reservation> findAllReservation();

    @Transactional
    @Modifying
    @Query(value = "UPDATE Reservation r SET" +
            "r.name = #{#reservation.name},"+
            "r.contact = #{#reservation.contact},"+
            "r.date = #{#reservation.date},"+
            "r.time = #{#reservation.time},"+
            "r.duration = #{#reservation.duration},"+
            "r.memo = #{#reservation.memo}"+
            "WHERE reservationid = :reservation.reservationid}", nativeQuery = true)
    void updateReservation(@Param(value = "reservation") Reservation reservation);

    @Transactional
    @Query(value = "DELETE FROM Reservation WHERE reservationid = :reservationid", nativeQuery = true)
    void deleteReservationById(@Param("reservationid") int reservationid);

//    @Query(value = "DELETE FROM Reservation r WHERE r.reservationid = #{#reservationid}", nativeQuery = true)
//    void deleteReservationById(@Param(value = "reservationid") int reservationid);
}
