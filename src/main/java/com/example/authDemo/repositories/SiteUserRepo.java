package com.example.authDemo.repositories;

import com.example.authDemo.models.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepo extends JpaRepository<SiteUser, Long> {
    SiteUser findByUsername(String username);
}
