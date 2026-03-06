package com.example.assignment.domain.repository

import com.example.assignment.domain.model.User

interface UserRepository {
    fun getUsers(): List<User>
}