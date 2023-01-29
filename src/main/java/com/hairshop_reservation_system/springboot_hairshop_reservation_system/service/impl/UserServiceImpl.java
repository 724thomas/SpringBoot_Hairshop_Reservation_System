package com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.impl;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto.UserRequest;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.repository.UserRepository;
import com.hairshop_reservation_system.springboot_hairshop_reservation_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public String insertUsers(UserRequest userRequest){
        try{
            userRepository.save(userRequest.toEntity());
        }catch(Exception e){
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String loginUsers(UserRequest userRequest, HttpSession session){
        try{
            userRepository.findByEmailAndPassword(userRequest.getEmail(), userRequest.getPassword());
        }catch(Exception e){
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}
