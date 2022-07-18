package com.example.spring_learn_annotations.repos;

import com.example.spring_learn_annotations.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<User, Long> {
}
