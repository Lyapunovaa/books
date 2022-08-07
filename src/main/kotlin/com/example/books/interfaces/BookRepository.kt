package com.example.books.interfaces

import com.example.books.entities.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book, Long> {
}