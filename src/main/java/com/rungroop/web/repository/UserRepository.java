package com.rungroop.web.repository;

import com.rungroop.web.models.UserEntity;

public interface UserRepository {
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}
