package com.example.books.interfaces

import com.example.books.entities.Book
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository


interface BookRepository : CrudRepository<Book, Long> {

    @Query("SELECT * FROM book")
    fun getAllBooks(): List<Book>
}