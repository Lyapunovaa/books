package com.example.books.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = +1
}