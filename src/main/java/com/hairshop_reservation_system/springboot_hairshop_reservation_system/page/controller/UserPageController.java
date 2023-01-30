package com.hairshop_reservation_system.springboot_hairshop_reservation_system.page.controller;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.ReservationService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class UserPageController {

    private final ReservationService reservationService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goLogin")
    public String goLogin() {
        return "userlogin";
    }

    @GetMapping("/goSignUp")
    public String goSignUp() {
        return "usersignup";
    }

    @GetMapping("/goReservation")
    public String goReservation(Model model) {
        model.addAttribute("reservationList", reservationService.selectAllReservation());
        return "userreservation";
    }


}
