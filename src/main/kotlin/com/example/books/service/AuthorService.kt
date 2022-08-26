package com.example.books.service

import com.example.books.entities.Author
import com.example.books.interfaces.AuthorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthorService(val db: AuthorRepository) {

    fun getAuthorById(id: Long): Optional<Author> = db.findById(id)

    fun getAllAuthors(): MutableIterable<Author> = db.findAll()

    fun createAuthor(author: Author) {
        db.save(author)
    }

}