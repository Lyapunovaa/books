package com.example.books.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("RACK")
data class Rack(

    val numOfPlaces: Int,

    @Id
    val id: Int? = null
)