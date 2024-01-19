package com.example.demo.repositories

import com.example.demo.model.ExampleOfWork
import org.springframework.data.jpa.repository.JpaRepository


interface RepositoryExamples : JpaRepository<ExampleOfWork?, Long?> {

}