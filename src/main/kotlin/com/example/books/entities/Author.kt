package com.example.books.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Author(val firstName: String, val lastName: String, val middleName: String) {
   


    @Id
    @GeneratedValue
    var id: Long = TODO("initialize me")
}