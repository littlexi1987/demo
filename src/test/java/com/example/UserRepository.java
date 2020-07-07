package com.example;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findUserById(Long id);
}

