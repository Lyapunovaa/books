package com.example.books

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cabinet {
    @Id
    @GeneratedValue
    var id: Long = TODO("initialize me")
}