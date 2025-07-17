package com.example.demo.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "users") // ✅ Avoid reserved keyword
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false, unique = true)
    var email: String
)
