package com.example.books.controllers

import com.example.books.entities.Cabinet
import com.example.books.service.CabinetService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class CabinetController(val service: CabinetService) {

    @GetMapping(value = ["/cabinet/{id}"])
    fun index(@PathVariable id: Long): Optional<Cabinet> = service.findCabinet(id)

    @GetMapping(value = ["/cabinet/all"])
    fun getAllCabinets(): MutableIterable<Cabinet> = service.getAllCabinet()

    @PostMapping(value = ["/cabinet"])
    fun post(@RequestBody cabinet: Cabinet) {
        service.post(cabinet)
    }
}