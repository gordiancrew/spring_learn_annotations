package com.example.spring_learn_annotations.repos;

import com.example.spring_learn_annotations.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
