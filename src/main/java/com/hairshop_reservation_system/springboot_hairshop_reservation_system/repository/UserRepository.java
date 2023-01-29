package com.hairshop_reservation_system.springboot_hairshop_reservation_system.repository;

import com.hairshop_reservation_system.springboot_hairshop_reservation_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmailAndPassword(String id, String password);
}
