package com.example.books.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("BOOK")
data class Book(

    val name: String,
    val author: String,

    @Id
    val id: Int? = null
)