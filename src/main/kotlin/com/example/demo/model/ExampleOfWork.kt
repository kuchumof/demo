package com.example.demo.model

import jakarta.persistence.*


@Entity
@Table(name = "examples")
data class ExampleOfWork (

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null,

    /*private val type: TypeOfClothes? = null*/
    @Column
    private val title: String = "",

    @Column
    private val description: String = "",

    @Column
    private val linkOnPicture: String = "",
)