package com.example.books.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.Entity

@Table("PLACE")
data class Place (


    @Id
    val id: Int? = null
)