package com.example.books.entities

import javax.persistence.*

@Entity
data class Book(

    val name: String,
    val author: String,
    val year: Int,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Int?=null,
)