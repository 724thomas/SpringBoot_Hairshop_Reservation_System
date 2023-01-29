package com.hairshop_reservation_system.springboot_hairshop_reservation_system.service;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.UserRequest;

import javax.servlet.http.HttpSession;

public interface UserService {

    String insertUsers(UserRequest userRequest);

    String loginUsers(UserRequest userRequest, HttpSession session);

}
