package com.RightDewForest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RightDewForest.Community.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
