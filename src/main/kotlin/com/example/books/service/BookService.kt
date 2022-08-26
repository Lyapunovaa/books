package com.example.books.service

import com.example.books.entities.Book
import com.example.books.interfaces.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(val db: BookRepository) {

    fun getAllBooks(): List<Book> = db.getAllBooks()
    fun getAll(): MutableIterable<Book> = db.findAll()

    fun createBook(book: Book) {
        db.save(book)
    }

}