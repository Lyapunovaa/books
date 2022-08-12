package com.example.books

import com.example.books.entities.Author
import com.example.books.entities.Book
import com.example.books.service.AuthorService
import com.example.books.service.BookService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

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
@RestController
class AuthorResource(val service: AuthorService) {
    @GetMapping(value = ["/author/{id}"])
    fun index(@PathVariable id: Long): Optional<Author> = service.getAuthorById(id)

    @PostMapping(value = ["/author"])
    fun post(@RequestBody author: Author) {
        service.post(author)
    }
}