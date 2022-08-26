package com.example.books.service

import com.example.books.entities.Place
import com.example.books.entities.Rack
import com.example.books.interfaces.PlaceRepository
import org.springframework.stereotype.Service

@Service
class PlaceService(val db:PlaceRepository) {

    fun getAllPlaces(): MutableIterable<Place> = db.findAll()

    fun getPlaceById(id: Long) = db.findById(id)

    fun createPlace(place: Place) {
        db.save(place)
    }
}