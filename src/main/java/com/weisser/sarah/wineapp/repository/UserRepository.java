package com.weisser.sarah.wineapp.repository;

import com.weisser.sarah.wineapp.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
