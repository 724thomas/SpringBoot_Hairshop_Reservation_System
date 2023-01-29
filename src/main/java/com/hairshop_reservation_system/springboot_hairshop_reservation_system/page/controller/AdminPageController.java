package com.hairshop_reservation_system.springboot_hairshop_reservation_system.page.controller;

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


}
