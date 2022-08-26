package com.example.books.controllers

import com.example.books.entities.Rack
import com.example.books.service.RackService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class RackController(val service: RackService) {


    @GetMapping(value = ["/Rack/{id}"])
    fun getRackByIndex(@PathVariable id: Long): Optional<Rack> = service.getRackById(id)

    @GetMapping(value = ["/Rack/all"])
    fun getAllRacks(): MutableIterable<Rack> = service.getAllRack()

    @PostMapping(value = ["/Rack"])
    fun createRack(@RequestBody rack: Rack) {
        service.createRack(rack)
    }
}