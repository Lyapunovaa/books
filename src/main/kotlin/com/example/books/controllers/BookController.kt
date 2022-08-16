package com.example.books.controllers

import com.example.books.entities.Book
import com.example.books.service.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BookResource(val service: BookService) {
    @GetMapping(value = ["/book/all"])
    fun index(): List<Book> = service.getAllBooks()

    @PostMapping(value = ["/book"])
    fun post(@RequestBody book: Book) {
        service.post(book)
    }
}