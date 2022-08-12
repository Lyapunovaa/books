package com.example.books.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table


@Table("AUTHOR")
data class Author(


    val firstName: String,
    val lastName: String,
    val middleName: String,
    val isAlive: Boolean,


    @Id
    val id: Int? = null
)