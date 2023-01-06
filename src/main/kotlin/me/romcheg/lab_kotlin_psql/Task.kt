package me.romcheg.lab_kotlin_psql

import javax.persistence.*

@Entity
@Table(name="tasks")
data class Task(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var Description: String = "",

    @Column(nullable = false)
    var Done: Boolean = false,
)