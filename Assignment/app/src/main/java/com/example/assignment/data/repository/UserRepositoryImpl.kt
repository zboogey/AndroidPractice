package com.example.assignment.data.repository

import com.example.assignment.domain.model.User
import com.example.assignment.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUsers(): List<User> {
        return listOf(
            User(1, "Alice"),
            User(2, "Bob"),
            User(3, "Charlie")
        )
    }
}