package com.example.books

import com.example.books.entities.Book
import com.example.books.service.BookService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BooksApplication

fun main(args: Array<String>) {
    runApplication<BooksApplication>(*args)
}

@RestController
class BookResource(val service: BookService) {
    @GetMapping
    fun index(): List<Book> = service.findBook()

    @PostMapping
    fun post(@RequestBody book: Book) {
        service.post(book)
    }
}