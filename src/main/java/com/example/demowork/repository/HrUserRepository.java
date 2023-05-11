package com.example.demowork.repository;

import com.example.demowork.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface HrUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
