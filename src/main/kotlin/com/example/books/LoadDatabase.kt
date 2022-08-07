package com.example.books

import com.example.books.entities.Book
import com.example.books.interfaces.BookRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class LoadDatabase {

    private val log: Logger = LoggerFactory.getLogger(LoadDatabase::class.java)

    @Bean
    fun initDatabase(repository: BookRepository): CommandLineRunner? {
        return CommandLineRunner { args: Array<String?>? ->
            log.info("Preloading " + repository.save(Book("Bilbo Baggins", "Barguzin", 2012)))
            //  log.info("Preloading " + repository.save(Book("Frodo Baggins", "thief", 2001, 2)))
        }
    }
}