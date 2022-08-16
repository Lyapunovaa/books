package com.example.books.interfaces

import com.example.books.entities.Author
import com.example.books.entities.Cabinet
import org.springframework.data.repository.CrudRepository

interface CabinetRepository: CrudRepository<Cabinet, Long> {
}