package com.github.fwerther28.repository;

import com.github.fwerther28.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
