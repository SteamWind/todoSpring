package com.sylvainpillet.todoSpring.repositories;

import com.sylvainpillet.todoSpring.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
