package com.hairshop_reservation_system.springboot_hairshop_reservation_system.dto;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserRequest {

    private String email;
    private String password;

    public User toEntity(){
        return User.builder()
                .email(this.email)
                .password(this.password)
                .build();
    }

}
