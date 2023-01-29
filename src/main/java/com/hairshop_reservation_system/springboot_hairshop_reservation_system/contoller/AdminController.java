package com.hairshop_reservation_system.springboot_hairshop_reservation_system.contoller;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.UserRequest;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class AdminController {


    @PostMapping("/adminlogin")
    public String loginUser(UserRequest request, HttpSession session) {
        if (request.getEmail() == "admin@admin" && request.getPassword() == "admin") {
            session.setAttribute("user", request.getEmail());
            return "success";
        } else {
            return "failed";
        }
    }
}
