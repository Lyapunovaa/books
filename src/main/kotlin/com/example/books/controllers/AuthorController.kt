package com.example.books.controllers

import com.example.books.entities.Author
import com.example.books.service.AuthorService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class AuthorResource(val service: AuthorService) {
    @GetMapping(value = ["/author/{id}"])
    fun getAuthorById(@PathVariable id: Long): Optional<Author> = service.getAuthorById(id)

    @GetMapping(value = ["/author/all"])
    fun getAllAuthors(): MutableIterable<Author> = service.getAllAuthors()


    @PostMapping(value = ["/author"])
    fun createAuthor(@RequestBody author: Author) {
        service.createAuthor(author)
    }
}