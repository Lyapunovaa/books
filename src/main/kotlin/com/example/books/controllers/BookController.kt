package com.example.books.controllers

import com.example.books.entities.Book
import com.example.books.service.BookService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class BookResource(val service: BookService) {
    @GetMapping(value = ["/book/all"])
    fun getBookByIndex(): MutableIterable<Book> = service.getAll()

    @GetMapping(value = ["/book/{id}"])
    fun getBookByIndex(@PathVariable id: Long): Optional<Book> = service.db.findById(id)

    @PostMapping(value = ["/book"])
    fun createBook(@RequestBody book: Book) {
        service.createBook(book)
    }
}