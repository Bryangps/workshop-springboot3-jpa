package com.bryan.projectSpring.repositories;

import com.bryan.projectSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
