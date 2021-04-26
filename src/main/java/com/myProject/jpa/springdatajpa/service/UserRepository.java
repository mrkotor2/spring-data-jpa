package com.myProject.jpa.springdatajpa.service;

import com.myProject.jpa.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
