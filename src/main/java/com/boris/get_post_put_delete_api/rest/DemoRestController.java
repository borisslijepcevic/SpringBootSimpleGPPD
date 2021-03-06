package com.boris.get_post_put_delete_api.rest;

import com.boris.get_post_put_delete_api.entity.User;
import com.boris.get_post_put_delete_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private UserService userService;

    @Autowired
    public DemoRestController(UserService theUserService){

        userService = theUserService;
    }

    @GetMapping("/list")
    public List<User> findAll(){

        return userService.findAll();
    }

    @GetMapping("/list/{userId}")
    public User getUser(@PathVariable int userId){

        User theUser = userService.findById(userId);

        if(theUser == null){
            throw new RuntimeException("User ID not found. " + userId);
        }

        return  theUser;

    }

    @PostMapping("/list")
    public User addUser(@RequestBody User theUser){

        theUser.setId(0);

        userService.save(theUser);

        return theUser;
    }

    @PutMapping("/list")
    public User updateUser(@RequestBody User theUser){

        userService.save(theUser);

        return theUser;
    }

    @DeleteMapping("/list/{userId}")
    public String deleteUser(@PathVariable int userId){

        User theUser = userService.findById(userId);

        if(theUser == null){
            throw new RuntimeException("User ID now found. " + userId);
        }

        userService.deleteById(userId);

        return "Deleted user ID " + userId;
    }
}
