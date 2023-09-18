package com.example.authDemo.repositories;

import com.example.authDemo.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepo extends JpaRepository<Posts, Long> {

}
