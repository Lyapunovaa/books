package com.example.books.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cabinet {
    @Id
    @GeneratedValue
    var id: Long = +1
}