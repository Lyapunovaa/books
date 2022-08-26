package com.example.books.service

import com.example.books.entities.Cabinet
import com.example.books.interfaces.CabinetRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CabinetService(val db: CabinetRepository) {

    fun findCabinet(id: Long): Optional<Cabinet> = db.findById(id)

    fun getAllCabinet(): MutableIterable<Cabinet> = db.findAll()

    fun createCabinet(cabinet: Cabinet) {
        db.save(cabinet)
    }
}