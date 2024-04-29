package com.aprendendojava.course.repositories;

import com.aprendendojava.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
