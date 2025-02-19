package com.sidedish.repository;

import com.sidedish.domain.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT id FROM user WHERE public_email = :publicEmail")
    Integer findIdByEmail(@Param("publicEmail") String publicEmail);
}
