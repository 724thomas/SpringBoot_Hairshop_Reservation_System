package com.hairshop_reservation_system.springboot_hairshop_reservation_system.contoller;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.UserRequest;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.ReservationService;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class AdminController {

    private final ReservationService reservationService;

    @PostMapping("/adminlogin")
    public String loginUser(UserRequest request, HttpSession session) {
        if (request.getEmail().equals("admin@admin")  && request.getPassword().equals("admin")) {
            session.setAttribute("user", request.getEmail());
            System.out.println("success");
            return "success";
        } else {
            return "failed";
        }
    }
}
