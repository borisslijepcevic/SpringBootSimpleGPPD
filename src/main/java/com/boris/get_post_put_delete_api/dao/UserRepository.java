package com.boris.get_post_put_delete_api.dao;

import com.boris.get_post_put_delete_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
