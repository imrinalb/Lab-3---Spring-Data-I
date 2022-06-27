package com.product.assignment3prob.Controller;

import com.product.assignment3prob.Entity.User;
import com.product.assignment3prob.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/allUsers/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/allUsers")
    public void deleteAllUser(){
        userService.deleteAllUser();
    }

    @DeleteMapping("/allUsers/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
    }

    @PutMapping("/allUsers/{id}")
    public User updateUserById(@PathVariable int id, @RequestBody User user){
        return userService.updateUserById(id, user);
    }

    @PostMapping("/allUsers")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/userByName/{name}")
    public List<User> getByNameContain(@PathVariable String name) {
        return userService.findByFirstnameComtain(name);
    }

    @GetMapping("/userBylname")
    public List<User> getByLname() {
        return userService.getAllListByMyQuery();
    }
}
