package com.luanrubensf.springnativetest.repository;

import com.luanrubensf.springnativetest.model.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Long> {
    List<User> findAllBy();
}
