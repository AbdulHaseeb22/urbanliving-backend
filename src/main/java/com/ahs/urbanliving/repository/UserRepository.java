package com.ahs.urbanliving.repository;

import com.ahs.urbanliving.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
