package com.example.books.interfaces

import com.example.books.entities.Place
import org.springframework.data.repository.CrudRepository

interface PlaceRepository : CrudRepository<Place, Long> {
}