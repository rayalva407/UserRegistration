package com.example.UserRegistration.Repository;

import com.example.UserRegistration.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
