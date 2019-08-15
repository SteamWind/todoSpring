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

    @GetMapping("/test")
    public String getTest() {
        return "Hello world";
    }

    @PostMapping("/")
    public Task createNewTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping("/")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Task> getOneTask(@PathVariable("id") Integer id) {
        return taskRepository.findById(id);
    }
}
