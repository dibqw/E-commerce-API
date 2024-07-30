package com.example.ecommerce.srvice;

import com.example.ecommerce.entity.User;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface UserRepo extends JpaRepositoryImplementation<User, Integer> {
}
