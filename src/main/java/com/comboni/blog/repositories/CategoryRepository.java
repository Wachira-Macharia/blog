package com.comboni.blog.repositories;

import com.comboni.blog.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    @Query("SELECT c from Category c LEFT JOIN FETCH c.posts")
    List<Category> findAllWithPostCount();
}
