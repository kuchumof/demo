package com.example.demo.controllers

import com.example.demo.model.ExampleOfWork
import com.example.demo.repositories.RepositoryExamples
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ControllerTest {

    @Autowired
    private val repo: RepositoryExamples? = null

    @GetMapping("/examples")
    fun listAll(): List<ExampleOfWork?> {

        return repo?.findAll() ?: listOf()
    }


}