package com.boris.get_post_put_delete_api.service;


import com.boris.get_post_put_delete_api.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findById(int theId);

    public void save(User theUser);

    public void deleteById(int theId);


}
