package com.hairshop_reservation_system.springboot_hairshop_reservation_system.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserPageController {

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
    public String goReservation() {
        return "userreservation";
    }


}
