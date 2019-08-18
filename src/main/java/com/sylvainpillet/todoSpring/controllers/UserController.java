package com.sylvainpillet.todoSpring.controllers;

import com.sylvainpillet.todoSpring.models.User;
import com.sylvainpillet.todoSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * Create a new user in database
     *
     * @param user the user to add
     * @return User the user
     */
    @PostMapping("/")
    public User createNewUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getOneUsers(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOneUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }


}
