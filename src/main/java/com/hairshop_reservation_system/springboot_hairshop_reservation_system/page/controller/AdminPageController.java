package com.hairshop_reservation_system.springboot_hairshop_reservation_system.page.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {

    @GetMapping("/goAdmin")
    public String goAdmin() {
        return "admin";
    }

    @GetMapping("/admin/goChat")
    public String goChat() {
        return "adminchat";
    }

    @GetMapping("/admin/newReservation")
    public String newReservation() {
        return "adminnewreservation";
    }

    @GetMapping("/admin/deleteReservation")
    public String deleteReservation() {
        return "admindeletereservation";
    }

    @GetMapping("/admin/updateReservation")
    public String updateReservation() {
        return "adminupdatereservation";
    }
}
