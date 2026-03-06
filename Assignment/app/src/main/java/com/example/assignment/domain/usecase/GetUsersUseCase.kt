package com.example.assignment.domain.usecase

import com.example.assignment.domain.model.User
import com.example.assignment.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val repository: UserRepository
) {
    fun execute(): List<User> = repository.getUsers()
}