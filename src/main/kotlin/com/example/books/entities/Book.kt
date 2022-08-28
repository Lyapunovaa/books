package com.example.books.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.MappedCollection
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.ForeignKey

@Table("BOOK")
data class Book(

    val name: String,

    @MappedCollection(idColumn = "id")
    val author: Long,

    @Id
    val id: Int? = null
)