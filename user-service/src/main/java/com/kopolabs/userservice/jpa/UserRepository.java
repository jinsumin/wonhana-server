package com.kopolabs.userservice.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by soomin on 2022/07/29
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUserId(String userId);

    UserEntity findByEmail(String username);
}
