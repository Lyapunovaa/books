package com.example.books.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Book(var name: String, var autor: String, var year: Int) {

    @Id
    @GeneratedValue
    var id: Long = TODO("initialize me")
}