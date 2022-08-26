package com.example.books.controllers

import com.example.books.entities.Place
import com.example.books.service.PlaceService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class PlaceController(val service: PlaceService) {
    @GetMapping(value = ["/Place/{id}"])
    fun getPlaceByIndex(@PathVariable id: Long): Optional<Place> = service.getPlaceById(id)

    @GetMapping(value = ["/Place/all"])
    fun getAllPlaces(): MutableIterable<Place> = service.getAllPlaces()

    @PostMapping(value = ["/Place"])
    fun createPlace(@RequestBody place: Place) {
        service.createPlace(place)
    }
}