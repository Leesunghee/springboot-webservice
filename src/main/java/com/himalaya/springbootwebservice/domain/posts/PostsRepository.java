package com.himalaya.springbootwebservice.domain.posts;

import com.himalaya.springbootwebservice.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
