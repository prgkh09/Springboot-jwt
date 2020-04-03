package com.practice.springbootjwt.repository;

import com.practice.springbootjwt.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
