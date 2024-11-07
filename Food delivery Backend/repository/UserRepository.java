package com.iamkhs.fooddelivery.repository;

import com.iamkhs.fooddelivery.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
    Optional<User> findUserByVerificationCode(String code);
}
