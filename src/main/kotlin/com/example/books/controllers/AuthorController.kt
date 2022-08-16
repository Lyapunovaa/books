package com.example.books.controllers

import com.example.books.entities.Author
import com.example.books.service.AuthorService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class AuthorResource(val service: AuthorService) {
    @GetMapping(value = ["/author/{id}"])
    fun index(@PathVariable id: Long): Optional<Author> = service.getAuthorById(id)

    @PostMapping(value = ["/author"])
    fun post(@RequestBody author: Author) {
        service.post(author)
    }
}