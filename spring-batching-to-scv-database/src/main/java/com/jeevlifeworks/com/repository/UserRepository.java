package com.jeevlifeworks.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeevlifeworks.com.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}