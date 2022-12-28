package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
