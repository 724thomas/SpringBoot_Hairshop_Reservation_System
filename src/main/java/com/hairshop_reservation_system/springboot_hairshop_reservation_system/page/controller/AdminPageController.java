package com.hairshop_reservation_system.springboot_hairshop_reservation_system.page.controller;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.ReservationRequest;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class AdminPageController {

    private final ReservationService reservationService;

    @GetMapping("/goAdminLogin")
    public String goAdmin() {
        return "adminlogin";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("reservationList", reservationService.selectAllReservation());
        return "admin";
    }

    @GetMapping("/admin/goChat")
    public String goChat() {
        return "adminchat";
    }

    @PostMapping("/admin/newReservation")
    public String newReservation(ReservationRequest request) {
        reservationService.insertReservation(request);
        return "redirect:/admin/";
    }
    @PostMapping("/admin/updateReservation")
    public String updateReservation(ReservationRequest request) {
        reservationService.updateReservation(request);
        return "adminupdatereservation";
    }

    @PostMapping("/admin/deleteReservation")
    public String deleteReservation(@RequestParam("reservationid") String reservationId) {
        reservationService.deleteReservationById(reservationId);
        return "redirect:/admin/";
    }


}
