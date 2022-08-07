package com.kopolabs.userservice.service;

import com.kopolabs.userservice.dto.UserDto;
import com.kopolabs.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by soomin on 2022/07/29
 */
public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();

    UserDto getUserDetailsByEmail(String email);
}
