package com.example.books.service

import com.example.books.entities.Book
import com.example.books.interfaces.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(val db: BookRepository) {

    fun findBook(): List<Book> = db.findBook()

    fun post(book: Book) {
        db.save(book)
    }

}