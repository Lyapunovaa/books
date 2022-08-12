package com.example.books.interfaces

import com.example.books.entities.Author
import org.springframework.data.repository.CrudRepository

interface AuthorRepository : CrudRepository<Author, Long> {
}