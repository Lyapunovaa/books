package com.example.books.interfaces

import com.example.books.entities.Rack
import org.springframework.data.repository.CrudRepository

interface RackRepository : CrudRepository<Rack, Long> {
}