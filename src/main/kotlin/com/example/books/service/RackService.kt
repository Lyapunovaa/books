package com.example.books.service

import com.example.books.entities.Rack
import com.example.books.interfaces.RackRepository
import org.springframework.stereotype.Service

@Service
class RackService(val db: RackRepository) {

    fun getAllRack(): MutableIterable<Rack> = db.findAll()

    fun getRackById(id: Long) = db.findById(id)

    fun createRack(rack:Rack) {
        db.save(rack)
    }
}