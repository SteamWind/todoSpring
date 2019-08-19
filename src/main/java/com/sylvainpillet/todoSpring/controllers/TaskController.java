package com.sylvainpillet.todoSpring.controllers;

import com.sylvainpillet.todoSpring.models.Task;
import com.sylvainpillet.todoSpring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("tasks")
@CrossOrigin(origins = "*")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    /**
     * Create a new task
     *
     * @param task The task to create. You can give a description and an achiever
     * @return
     */
    @PostMapping("/")
    public Task createNewTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    /**
     * Give all tasks from the database
     * @return a list of all task
     */
    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Get one task from his ID if this task exists
     * @param id of the task to find
     * @return a task if it exists
     */
    @GetMapping(value = "/{id}")
    public Optional<Task> getOneTask(@PathVariable("id") Integer id) {
        return taskRepository.findById(id);
    }
}
