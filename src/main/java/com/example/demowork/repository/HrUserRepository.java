package com.example.demowork.repository;

import com.example.demowork.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface HrUserRepository extends MongoRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
