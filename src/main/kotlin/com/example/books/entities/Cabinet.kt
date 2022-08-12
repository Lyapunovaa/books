package com.example.books.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("CABINET")
class Cabinet(

    @Id
    val id: Int? = null
)