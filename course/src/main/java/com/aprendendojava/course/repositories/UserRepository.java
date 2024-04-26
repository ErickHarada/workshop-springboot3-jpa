package com.aprendendojava.course.repositories;

import com.aprendendojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
