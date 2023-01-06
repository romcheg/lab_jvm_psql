package me.romcheg.lab_kotlin_psql

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Endpoint(
    @field:Autowired
    val repository: TaskRepository
) {
    @GetMapping("/tasks/")
    fun getAllTasks() = repository.findAll().map { it }
}