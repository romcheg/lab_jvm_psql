package me.romcheg.lab_kotlin_psql

import org.springframework.data.repository.CrudRepository

interface TaskRepository : CrudRepository<Task, Int>