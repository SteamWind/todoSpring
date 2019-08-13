package com.sylvainpillet.todoSpring.repositories;

import com.sylvainpillet.todoSpring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
