package com.hairshop_reservation_system.springboot_hairshop_reservation_system.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ChatPageController {

    @GetMapping("/chat")
    public String index(){
        return "chatIndex";
    }

    @GetMapping("/chatMain")
    public String goMain(String nickName, HttpSession session){
        session.setAttribute("nickName",nickName);
        return "chatMain";
    }
}
