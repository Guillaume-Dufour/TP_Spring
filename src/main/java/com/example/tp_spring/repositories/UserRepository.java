package com.example.tp_spring.repositories;

import com.example.tp_spring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
